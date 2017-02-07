/*******************************************************************************
 * Copyright (c) 2006 DBE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://opensource.org/licenses/eclipse-1.0.php
 *
 * Contributors:
 *     Isufi
 *
 * Authors:
 *	Maurizio De Tommasi
 *	Pierpaolo Cira
 *	Valerio Cisternino
 *
 *******************************************************************************/
/*
 * Modified 2009.10.05 by Vetis project
 */
package org.dbe.businessModeller.ruleset.ui.editors.utils;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.BusinessModellerPlugin;
import org.dbe.businessModeller.XML.XMLDocument;
import org.dbe.businessModeller.XML.XMLElement;
import org.dbe.businessModeller.XML.XMLWrapper;
import org.dbe.businessModeller.enterprise.BusinessModellerDocument;
import org.dbe.businessModeller.ruleset.enterprise.grammar.RuleSetLexer;
import org.dbe.businessModeller.ruleset.enterprise.grammar.RuleSetValidator;
import org.dbe.businessModeller.ruleset.ui.editors.RulesetMainEditor;
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.utils.VocabularyColorProvider;
import org.dbe.businessModeller.vocabulary.enterprise.BMDictionary;
import org.dbe.businessModeller.vocabulary.enterprise.FontStyle;
import org.dbe.businessModeller.vocabulary.enterprise.Vocabulary;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.VocabularyExporter;
import org.dbe.businessModeller.vocabulary.enterprise.grammar.VocabularyLexer;
import org.dbe.businessModeller.vocabulary.enterprise.grammar.VocabularyParser;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.Assert;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.MarkerAnnotation;

import antlr.RecognitionException;
import antlr.TokenStreamException;

/**
 * An implementation of <code>IRule</code> capable of detecting words
 * Word rules also allow for the association of tokens with specific words.
 * That is, not only can the rule be used to provide tokens for exact matches,
 * but also for the generalized notion of a word in the context in which it is used.
 * A word rules uses a word detector to determine what a word is.
 *
 * @see IWordDetector
 */
public class RulesetWordRule implements IRule {

	/** Internal setting for the un-initialized column constraint */
	protected static final int UNDEFINED= -1;
	protected static final int NONE = 0;
	protected static final int CONCEPT = 1;
	protected static final int INDIVIDUAL_CONCEPT = 2;

	/** The word detector used by this rule */
	protected IWordDetector fDetector;
	/** The default token to be returned on success and if nothing else has been specified. */
	protected IToken fDefaultToken;
	/** The column constraint */
	protected int fColumn= UNDEFINED;
	/** The table of predefined words and token for this rule */
	protected Map fWords= new HashMap();
	/** Keywords, loaded from language xml, added 2009 06 15, Algirdas Sukys **/
	private XMLElement keywords;
	/** Buffer used for pattern detection */
	private StringBuffer fBuffer= new StringBuffer();
	/** Vocabulary used to detect terms */
	Vocabulary vocabulary = null;
	/** Singleton used to stored the type of the detection */
	RulesetRuleMemory ruleMemory = null;
	/** ArrayList con le parole chiavi di SBVR*/
	String[] sbvrKeyword;
	
	private VocabularyColorProvider provider;

	/**
	 * Creates a rule which, with the help of an word detector, will return the token
	 * associated with the detected word. If no token has been associated, the scanner
	 * will be rolled back and an undefined token will be returned in order to allow
	 * any subsequent rules to analyze the characters.
	 *
	 * @param detector the word detector to be used by this rule, may not be <code>null</code>
	 *
	 * @see #addWord(String, IToken)
	 */
	public RulesetWordRule(IWordDetector detector, BMDictionary dictionary, VocabularyColorProvider provider) {
		this(detector, dictionary, provider, Token.UNDEFINED);
	}

	/**
	 * Creates a rule which, with the help of a word detector, will return the token
	 * associated with the detected word. If no token has been associated, the
	 * specified default token will be returned.
	 *
	 * @param detector the word detector to be used by this rule, may not be <code>null</code>
	 * @param defaultToken the default token to be returned on success
	 *		if nothing else is specified, may not be <code>null</code>
	 *
	 * @see #addWord(String, IToken)
	 */
	public RulesetWordRule(IWordDetector detector, BMDictionary dictionary, VocabularyColorProvider provider, IToken defaultToken) {

		Assert.isNotNull(detector);
		Assert.isNotNull(defaultToken);

		fDetector= detector;
		fDefaultToken= defaultToken;
		this.provider=provider;
		setSBVRKeyword();
	}

	/**
	 * Adds a word and the token to be returned if it is detected.
	 *
	 * @param word the word this rule will search for, may not be <code>null</code>
	 * @param token the token to be returned if the word has been found, may not be <code>null</code>
	 */
	public void addWord(String word, IToken token) {
		Assert.isNotNull(word);
		Assert.isNotNull(token);
		fWords.put(word, token);
	}

	/**
	 * Sets a column constraint for this rule. If set, the rule's token
	 * will only be returned if the pattern is detected starting at the
	 * specified column. If the column is smaller then 0, the column
	 * constraint is considered removed.
	 *
	 * @param column the column in which the pattern starts
	 */
	public void setColumnConstraint(int column) {
		if (column < 0)
			column= UNDEFINED;
		fColumn= column;
	}
	
	/* Metodo per settare le parole chiave di SBVR */
	public void setSBVRKeyword()
	{
		sbvrKeyword=new String[] {"instance","concept","consequent",
			"implication","integer","proposition","role","set","statement",
			"thing","variable","characteristic","text","projection",
			"quantifier","antecedent","subset","world","prohibition",
			"predicate","possibility","population","permission","obligation",
			"necessity","member","domain","arity","argument","vocabulary",
			"meaning","designation","signifier","placeholder","expression",
			"name","number","segmentation","categorization_scheme","categorization_type",
			"general_concept", "individual_concept", "associative_fact_type",
			"categorization_fact_type", "partitive_fact_type", "is_role_of_fact_type"};
	}
	
	public void setKeywords(XMLElement newKeywords){
		keywords = newKeywords;
	}
	
	public boolean hasSBVRKeyword(String aKeyword)
	{
		for (int i=0;i<sbvrKeyword.length;i++)
		{
			if (sbvrKeyword[i].equalsIgnoreCase(aKeyword))
				return true;
		}
		return false;
	}
	
	// verify comparator
	private boolean verifyComp(String testString)
	{
		StringReader myBuffer;		
		RuleSetLexer rLexer;
		RuleSetValidator rValidator;
		try {			
			myBuffer = new StringReader(testString);
			rLexer = new RuleSetLexer(myBuffer);
			rValidator = new RuleSetValidator(rLexer);
			if (rValidator.isComparator())
				return true;

		} catch (RecognitionException e) {
			e.printStackTrace();
			return false;
		} catch (TokenStreamException e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	
	// verify object comparator
	private boolean verifyObjectComp(String testString)
	{
		StringReader myBuffer;		
		RuleSetLexer rLexer;
		RuleSetValidator rValidator;
		try {			
			myBuffer = new StringReader(testString);
			rLexer = new RuleSetLexer(myBuffer);
			rValidator = new RuleSetValidator(rLexer);
			if (rValidator.isObjectComparator())
				return true;

		} catch (RecognitionException e) {
			e.printStackTrace();
			return false;
		} catch (TokenStreamException e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	
	// verify clause
	private boolean verifyClause(String testString)
	{
		StringReader myBuffer;		
		RuleSetLexer rLexer;
		RuleSetValidator rValidator;
		try {			
			myBuffer = new StringReader(testString);
			rLexer = new RuleSetLexer(myBuffer);
			rValidator = new RuleSetValidator(rLexer);
			if (rValidator.isClause())
				return true;

		} catch (RecognitionException e) {
			e.printStackTrace();
			return false;
		} catch (TokenStreamException e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	
	// verifica se testString � Conjunction(C) o Disjunction(D)
	private boolean verifyCD(String testString)
	{
		StringReader myBuffer;		
		RuleSetLexer rLexer;
		RuleSetValidator rValidator;
		try {			
			myBuffer = new StringReader(testString);
			rLexer = new RuleSetLexer(myBuffer);
			rValidator = new RuleSetValidator(rLexer);
			if (rValidator.isConjunction())
				return true;
			
			myBuffer = new StringReader(testString);
			rLexer = new RuleSetLexer(myBuffer);
			rValidator = new RuleSetValidator(rLexer);
			if (rValidator.isDisjunction())
				return true;

		} catch (RecognitionException e) {
			e.printStackTrace();
			return false;
		} catch (TokenStreamException e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	
	// verify number
	private boolean verifyNumber(String testString)
	{
		StringReader myBuffer;		
		RuleSetLexer rLexer;
		RuleSetValidator rValidator;
		try {		
			myBuffer = new StringReader(testString);
			rLexer = new RuleSetLexer(myBuffer);
			rValidator = new RuleSetValidator(rLexer);			
			if (rValidator.isNumber())			
				return true;
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
	// verify number
	private boolean verifyRulesetKeyword(String testString)
	{
		StringReader myBuffer;		
		RuleSetLexer rLexer;
		RuleSetValidator rValidator;
		try {		
			myBuffer = new StringReader(testString);
			rLexer = new RuleSetLexer(myBuffer);
			rValidator = new RuleSetValidator(rLexer);			
			if (rValidator.isRulesetKeyword())			
				return true;
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
	// verifica se testString � Concept(C) o IndividualConcept(IC)
	public int verifyCIC(String testString)
	{
		StringReader myBuffer;		
		RuleSetLexer fLexer;
		RuleSetValidator fValidator;
		try {			
			myBuffer = new StringReader(testString);
			fLexer = new RuleSetLexer(myBuffer);
			fValidator = new RuleSetValidator(fLexer);
			if (fValidator.isConcept())
				return CONCEPT; // 1 equivale
			
			myBuffer = new StringReader(testString);
			fLexer = new RuleSetLexer(myBuffer);
			fValidator = new RuleSetValidator(fLexer);
			if (fValidator.isIndividualConcept())
				return INDIVIDUAL_CONCEPT;
		} catch (RecognitionException e) {
			e.printStackTrace();
			return NONE;
		} catch (TokenStreamException e) {
			e.printStackTrace();
			return NONE;
		}
		
		return NONE;
	}
	
	// verifica se testString � Keyword(K), Quantification(Q) o Article(A)
	private boolean verifyKQA(String testString, boolean verifyK, boolean verifyQ, boolean verifyA )
	{
		StringReader myBuffer;		
		RuleSetLexer rLexer;
		RuleSetValidator rValidator;
		try {
			if (verifyA)
			{
				myBuffer = new StringReader(testString);
				rLexer = new RuleSetLexer(myBuffer);
				rValidator = new RuleSetValidator(rLexer);
				if (rValidator.isArticle())
					return true;
			}
			
			if (verifyK)
			{
				myBuffer = new StringReader(testString);
				rLexer = new RuleSetLexer(myBuffer);
				rValidator = new RuleSetValidator(rLexer);
				if (rValidator.isKeyword())
					return true;
			}
			
			if (verifyQ)
			{
				myBuffer = new StringReader(testString);
				rLexer = new RuleSetLexer(myBuffer);
				rValidator = new RuleSetValidator(rLexer);
				if (rValidator.isQuantification2())
					return true;
			}
			
		} catch (RecognitionException e) {
			e.printStackTrace();
			return false;
		} catch (TokenStreamException e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	
	public IToken evaluate(ICharacterScanner scanner) {
		
		IToken token = Token.UNDEFINED;
		
		Vocabulary vocabulary = (Vocabulary)BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY); 
		
		if(vocabulary.getEntries().size() == 0) {
			return token;
		}
		
		ruleMemory = RulesetRuleMemory.getInstance();
		String rowString = "";
					
		if (!BusinessModellerDocument.isInstanced(BusinessModeller.DOCUMENT_VOCABULARY))
			 preParsing(scanner);
		else vocabulary = (Vocabulary)BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
		
		IWorkbenchWindow wb = BusinessModellerPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage wpage = wb.getActivePage();	
		
		int c= scanner.read();
		
		if ((char)c=='-')  {
			ruleMemory.setIsComment(true);
			//token = findComment(scanner);
		}
		
		if ((char)c=='I' || (char)c=='i')  {
			ruleMemory.setIsComment(false);
			scanner.unread();
			token = findClaim(scanner);
		}
		
		RulesetMainEditor editor = null;
		ISelection selection = null;
		try {
			if (wpage.getActiveEditor() instanceof RulesetMainEditor) {
				editor = (RulesetMainEditor)wpage.getActiveEditor();
				selection=editor.getEditor().getSelectionProvider().getSelection();
			}
		}
		catch(NullPointerException e){}
		
		if (token.isUndefined() && fDetector.isWordStart((char) c))
		{
			if (fColumn == UNDEFINED || (fColumn == scanner.getColumn() - 1)) {
				
				fBuffer.setLength(0);
				do {
					fBuffer.append((char) c);
					c= scanner.read();
				} while (c != ICharacterScanner.EOF && c!=13 && c!=10 && c!=-1 && (char)c!='.');
				rowString = fBuffer.toString();
				rowString = inSentence(rowString,scanner);
				
				scanner.unread();
		
				int posInFacts = ruleMemory.getPositionInFacts();
				
				if(ruleMemory.isComment())
					token = commentToken(rowString);
				else
					token = defToken(rowString,posInFacts);
				
				if (ruleMemory.isLastWord())
				{
					// find current line number
					int lineNumber = 0;
					
					if (selection instanceof ITextSelection)
					{
						ITextSelection textSelection= (ITextSelection) selection;
						if (!textSelection.isEmpty())
							lineNumber = textSelection.getStartLine() + 1;					
					}
					
					// if problem or warning found in the line, mark it, unmark otherwise
					if(ruleMemory.isProblem() || ruleMemory.isWarning()) {
						markLine(wpage, ruleMemory.getMsgMarker(), IMarker.SEVERITY_ERROR, lineNumber);
					}
					else {
						unmarkLine(wpage, lineNumber);
					}
					
					ruleMemory.setPositionInFacts(1);
					ruleMemory.setLastWord(false);
					ruleMemory.setWarning(false);
					ruleMemory.setProblem(false);
					ruleMemory.setMsgMarker(null);
				}
				
				if (token != null)
					return token;

				if (fDefaultToken.isUndefined())
					unreadBuffer(scanner);

				return fDefaultToken;
			}
		}
		if (c==-1)
			ruleMemory.setCountable(false);
		
		scanner.unread();
	
	
		
		return token;
	}
	
	private IToken defToken(String rowString,int posInFacts)
	{
		IToken token = Token.UNDEFINED;
		int verifiedCIC;
		switch (posInFacts) {
		
		case 1:				
			if (verifyKQA(rowString,true,false,true)){
				token = getFontToken(BusinessModeller.KEYWORD);
				ruleMemory.setPositionInFacts(2);
			}
			else {
				token = defToken(rowString,2);
			}
			
			break;
		case 2:
			if (verifyKQA(rowString,false,true,false)){
				token = getFontToken(BusinessModeller.KEYWORD);
				
				ruleMemory.setProblem(true);
				ruleMemory.setMsgMarker("Quantification not defined");
				
				ruleMemory.setPositionInFacts(3);
			}
			else {
				token = defToken(rowString,4);
			}
			break;
		case 3:
			if (verifyNumber(rowString)){
				token = getFontToken(BusinessModeller.KEYWORD);
				ruleMemory.setProblem(false);
				ruleMemory.setPositionInFacts(9);
			}
			else {
				token = defToken(rowString,2);
			}
			break;
		case 4:	
			verifiedCIC = verifyCIC(rowString);
			if (verifiedCIC > NONE) {
				token = vocDetecting(rowString,verifiedCIC);
				ruleMemory.setProblem(false);
			}
			else {
				ruleMemory.setProblem(true); 				
				token = getFontToken(BusinessModeller.ERROR);
				if (ruleMemory.getMsgMarker()==null)
					ruleMemory.setMsgMarker("Concept or Individual Concept not defined");
			}
			ruleMemory.setPositionInFacts(5);
			break;
			
		case 5:	
			StringReader myBuffer2 = new StringReader(rowString);
			RuleSetLexer rLexer2 = new RuleSetLexer(myBuffer2);
			RuleSetValidator rValidator2 = new RuleSetValidator(rLexer2);
			try {
				if (rValidator2.isPredicate())
				{
					token = getFontToken(BusinessModeller.VERB);
					
					if (vocabulary.getVerbs().contains(rowString)) {
						token = getFontToken(BusinessModeller.VERB);
						ruleMemory.setPositionInFacts(1);
					}
					else {
						ruleMemory.setWarning(true);
						token = getFontToken(BusinessModeller.ERROR);
						if (ruleMemory.getMsgMarker()==null)
							ruleMemory.setMsgMarker("Predicate not defined");
						}
				}
				else {
					token = defToken(rowString,6);
				}
			} catch (Exception e) {}
			
			break;
			
		case 6:	
			if (verifyComp(rowString))
			{
				token = getFontToken(BusinessModeller.VERB);
				ruleMemory.setPositionInFacts(7);
				ruleMemory.setWarning(true);
			}
			else if(verifyObjectComp(rowString)) {
					token = getFontToken(BusinessModeller.VERB);
					ruleMemory.setPositionInFacts(4);
				}
			else
				token = defToken(rowString,8);
			break;
		
		case 7:
			if(verifyNumber(rowString))
			{				
				token = getFontToken(BusinessModeller.KEYWORD);
				ruleMemory.setPositionInFacts(4);
				ruleMemory.setWarning(false);
				if (ruleMemory.getMsgMarker() == null)
					ruleMemory.setMsgMarker("Number of quantification not defined");
				
			}
			else {
				ruleMemory.setProblem(true);
				token = getFontToken(BusinessModeller.ERROR);
			}
			break;
			
		case 8:	
			if (verifyClause(rowString))
			{
				token = getFontToken(BusinessModeller.KEYWORD);
				ruleMemory.setPositionInFacts(1);
			}
			else token = defToken(rowString,9);
			break;
		
		case 9:	
			if (verifyCD(rowString))
			{
				token = getFontToken(BusinessModeller.KEYWORD);
				ruleMemory.setPositionInFacts(1);
			}
			else token = defToken(rowString, 1);
			break;
		}
	
		return token;
		
	}
	
	private IToken commentToken(String word) {
		IToken token = Token.UNDEFINED;
		
		if(this.verifyRulesetKeyword(word)){
			token = getFontToken(BusinessModeller.RULESET);
		}
		else {
			token = getFontToken(BusinessModeller.COMMENT);
		}
		
		return token; 
	}
	
	private String inSentence(String rowString,ICharacterScanner scanner)
	{
		int end = rowString.indexOf(" ");
		if (end<=0)
			end = rowString.length();
		String rowSubString = rowString.substring(0,end);
		
		int unLenght = rowString.length() - end;
		for (int i=0;i<unLenght;i++)
		{ scanner.unread();}

		if (end==rowString.trim().length())
		{
			ruleMemory.setLastWord(true);
		}
		else ruleMemory.setLastWord(false);
		
		return rowSubString;
	}
	
	private IToken vocDetecting(String rowString,int verifiedCIC)
	{
		IToken token = Token.UNDEFINED;
		try {
			vocabulary = (Vocabulary)BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
			if (vocabulary!=null) {
				if (vocabulary.getExtTerms().contains(rowString) 
								|| hasSBVRKeyword(rowString)){
					switch (verifiedCIC)
					{
					case CONCEPT:
						token=getFontToken(BusinessModeller.TERM); break;
					case INDIVIDUAL_CONCEPT:
						token=getFontToken(BusinessModeller.NAME); break;
					default:
						ruleMemory.setWarning(true);
						token = getFontToken(BusinessModeller.ERROR);
						if (ruleMemory.getMsgMarker()==null)
							ruleMemory.setMsgMarker("Concept or Individual Concept not defined");
					}
				}
				else 
				{
					ruleMemory.setWarning(true);
					token=getFontToken(BusinessModeller.ERROR);
					if (ruleMemory.getMsgMarker()==null)
						ruleMemory.setMsgMarker("Concept or Individual Concept not defined");
				}		
			}
		} catch (Exception ex)
		  { ex.printStackTrace(); }
		return token;		
	}
	
	private void preParsing(ICharacterScanner scanner)
	{		
		String rowString="";	
		StringBuffer firstBuffer= new StringBuffer();
		
		int f= scanner.read();
		do {
			firstBuffer.append((char) f);
			f= scanner.read();
		} while (f != ICharacterScanner.EOF);
		rowString = firstBuffer.toString();
		VocabularyLexer vocLexer = new VocabularyLexer(new StringReader(rowString+'\n'), keywords);
		VocabularyParser vocParser = new VocabularyParser(vocLexer);
		try {
			vocabulary = (Vocabulary)BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
			vocabulary=vocParser.vocabulary();
		} catch (RecognitionException e) {
			e.printStackTrace();
		} catch (TokenStreamException e) {
			e.printStackTrace();
		}
		finally {
			for (int i=0;i<rowString.length()+1;i++)
			{ scanner.unread(); }
		}
	}
	
	private IToken findComment(ICharacterScanner scanner){
		int ch = scanner.read();
		fBuffer.setLength(0);
		do {
			fBuffer.append((char) ch);
			ch = scanner.read();
		} while (ch != ICharacterScanner.EOF && ch!='\n');
		
		//if(fBuffer.toString().substring(1, 8).equals("Ruleset"))
			//return getFontToken(BusinessModeller.RULESET);
		return getFontToken(BusinessModeller.COMMENT);
	}
	
	
	
	private IToken findClaim(ICharacterScanner scanner)
	{
		String[] claimKeywords = { "obligatory", "prohibited", "necessary", 
				"impossible", "possible", "permitted"};
		String claim = "";
		String subClaim = "";
		IToken token = Token.UNDEFINED;
		
		int ch = scanner.read();
		
			fBuffer.setLength(0);
			do {
				fBuffer.append((char) ch);
				claim = fBuffer.toString();
				if ((char)ch==' ')
					claim = "";
				if (claim.lastIndexOf(" ")>0)					
					subClaim = claim.substring(claim.lastIndexOf(" ")+1,claim.length());
				ch = scanner.read();
			} while (ch != ICharacterScanner.EOF && ch!=13 && !subClaim.equals("that"));
		
		int j=0;
		while (j<claimKeywords.length && token.isUndefined())
		{
			String predefClaim = "it is "+claimKeywords[j]+" that";
			if (claim.equals(predefClaim))
				token = getFontToken(BusinessModeller.KEYWORD);
			predefClaim = "It is "+claimKeywords[j]+" that";
			if (claim.equals(predefClaim))
				token = getFontToken(BusinessModeller.KEYWORD);
			j++;
		}
		
		if (token.isUndefined())
		{
			scanner.unread();
			for (int i=0;i< claim.length() - 1; i++)
				scanner.unread();
		}
		
		return token;
	}
	
	/**
	 * Returns the characters in the buffer to the scanner.
	 *
	 * @param scanner the scanner to be used
	 */
	protected void unreadBuffer(ICharacterScanner scanner) {
		for (int i= fBuffer.length() - 1; i >= 0; i--)
			scanner.unread();
	}
	
	private IToken getFontToken(int font){
		FontStyle fontStyle = provider.getFontStyle(font);
		int style = ((fontStyle.isUnderlined()) ? TextAttribute.UNDERLINE : 0)
				  | ((fontStyle.isBold()) ? SWT.BOLD : 0)
				  | ((fontStyle.isItalic()) ? SWT.ITALIC : 0)
				  | ((fontStyle.isDoubleUnderlined()) ? TextAttribute.STRIKETHROUGH : 0);
		return new Token(new TextAttribute(fontStyle.getColor(),null, style));
	}
	
	/**
	 * Mark specified line
	 * @param wpage
	 * @param msg
	 * @param severity
	 * @param line
	 */
	private void markLine(IWorkbenchPage wpage, String msg, int severity, int line) {
		
		IEditorInput editorInput = null;
		IFile file=null;
		
		int startOffset = 0;
		int lineLenght = 0;
		
		if (wpage!=null)
		{
			try {
				editorInput = wpage.getActiveEditor().getEditorInput();
				file = ((IFileEditorInput)editorInput).getFile();
			}
			catch(Exception e){}
			
			try {
				if (wpage.getActiveEditor() instanceof RulesetMainEditor)
				{
					RulesetMainEditor editor = (RulesetMainEditor)wpage.getActiveEditor();
					
					try {
						IDocumentProvider docProvider = editor.getEditor().getDocumentProvider();
						startOffset = docProvider.getDocument(editorInput).getLineOffset(line - 1);
						lineLenght = docProvider.getDocument(editorInput).getLineLength(line - 1);
						
					}
					catch (BadLocationException e) {e.printStackTrace();}
					
					IMarker mmm = file.createMarker(IMarker.PROBLEM);
					mmm.setAttribute(IMarker.LINE_NUMBER, new Integer(line));
					mmm.setAttribute(IMarker.MESSAGE,msg);
					mmm.setAttribute(IMarker.PRIORITY,IMarker.PRIORITY_LOW);
					mmm.setAttribute(IMarker.SEVERITY,0);
					mmm.setAttribute(IMarker.CHAR_START,startOffset);
					mmm.setAttribute(IMarker.CHAR_END,startOffset + lineLenght);
					
					IAnnotationModel am = editor.getEditor().getDocumentProvider().getAnnotationModel(editorInput);
					MarkerAnnotation markerAnot = new MarkerAnnotation(mmm);
					Position pos = new Position(startOffset,startOffset + lineLenght);								
					if (pos!=null)
						am.addAnnotation(markerAnot, pos);
						
				}
			} catch (Exception e) {}
			
		}
	}
	
	/**
	 * Deletes marker from specified line 
	 * @param wpage
	 * @param line
	 */
	private void unmarkLine(IWorkbenchPage wpage, int line) {
		
		IEditorInput editorInput = null;
		IFile file=null;
		
		if (wpage != null)
		{
			try {
				editorInput = wpage.getActiveEditor().getEditorInput();
				file = ((IFileEditorInput)editorInput).getFile();
			}
			catch(Exception e){}
			
			IMarker[] markers = null;
			
			try {
				if(file != null) {
					// get markers of the file
					markers = file.findMarkers(IMarker.PROBLEM,true,IResource.DEPTH_INFINITE);
				
					// find marker with specified line number and delete it
					for(int i = 0; i < markers.length; i++) {
						IMarker marker = markers[i];
						
						Object lineNum = null;
						lineNum = marker.getAttribute(IMarker.LINE_NUMBER);
						
						if(lineNum.equals(line))
							marker.delete();
					}
				}
			}
			catch (CoreException e) {}
		}
	}
}
