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
 * Modified 2009.11.20 by Vetis project
 */
package org.dbe.businessModeller.vocabulary.ui.editors.utils;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.BusinessModellerPlugin;
import org.dbe.businessModeller.XML.XMLElement;
import org.dbe.businessModeller.enterprise.BusinessModellerDocument;
import org.dbe.businessModeller.logger.BusinessModellerLogger;
import org.dbe.businessModeller.utils.VocabularyColorProvider;
import org.dbe.businessModeller.vocabulary.enterprise.BMDictionary;
import org.dbe.businessModeller.vocabulary.enterprise.FontStyle;
import org.dbe.businessModeller.vocabulary.enterprise.Vocabulary;
import org.dbe.businessModeller.vocabulary.enterprise.grammar.VocabularyValidator;
import org.dbe.businessModeller.vocabulary.enterprise.grammar.VocabularyLexer;
import org.dbe.businessModeller.vocabulary.enterprise.grammar.VocabularyParser;
import org.dbe.businessModeller.vocabulary.ui.editors.VocabularyMainEditor;
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
public class VocabularyWordRule implements IRule {

	private static BusinessModellerLogger logger = (BusinessModellerLogger)BusinessModellerLogger.getLogger(VocabularyWordRule.class);
	
	/** Internal setting for the un-initialized column constraint */
	protected static final int UNDEFINED= -1;

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
	/** Singleton used to stored the type of the detection */
	VocabularyRuleMemory ruleMemory = null;
	/** ArrayList con le parole chiavi di SBVR*/
	String[] sbvrKeyword;
	// array for sbvr verbs
	String[] sbvrVerb;
	
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
	public VocabularyWordRule(IWordDetector detector, BMDictionary dictionary, VocabularyColorProvider provider) {
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
	public VocabularyWordRule(IWordDetector detector, BMDictionary dictionary, VocabularyColorProvider provider, IToken defaultToken) {

		Assert.isNotNull(detector);
		Assert.isNotNull(defaultToken);

		fDetector= detector;
		fDefaultToken= defaultToken;
		this.provider=provider;
		setSBVRKeyword();
		setSBVRVerb();
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
			"object_type", "general_concept", "individual_concept", "associative_fact_type", 
			"is_property_of_fact_type", "categorization_fact_type", "partitive_fact_type"};
	}
	
	public void setSBVRVerb()
	{
		sbvrVerb=new String[] {"is_included_in","is_for","subdivides","by", "for"};
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
	
	public boolean hasSBVRVerb(String aVerb)
	{
		for (int i=0;i<sbvrVerb.length;i++)
		{
			if (sbvrVerb[i].equalsIgnoreCase(aVerb))
				return true;
		}
		return false;
	}
	
	public String verify(String testString)
	{
		StringReader myBuffer;		
		VocabularyLexer lexer;
		VocabularyValidator vocValidator;
		try {			
			myBuffer = new StringReader(testString+"\n");
			lexer = new VocabularyLexer(myBuffer, keywords);
			vocValidator = new VocabularyValidator(lexer);
			if (vocValidator.isFactType())
				return "factType";
			
			myBuffer = new StringReader(testString);
			lexer = new VocabularyLexer(myBuffer, keywords);
			vocValidator = new VocabularyValidator(lexer);
			if (vocValidator.isCaption())
			{
				//if (testString.equalsIgnoreCase("Synonymous_form:") ||
				//	testString.equalsIgnoreCase("Reference_scheme:") || 
				//	testString.equalsIgnoreCase("Synonym:"))
				
				ruleMemory.setCaptionType(testString);
				
				return "attribute";
			}
			
			myBuffer = new StringReader(testString+"\n");
			lexer = new VocabularyLexer(myBuffer, keywords);
			vocValidator = new VocabularyValidator(lexer);
			if (vocValidator.isObjectType())
				return "objectType";				
			
			myBuffer = new StringReader(testString);
			lexer = new VocabularyLexer(myBuffer, keywords);
			vocValidator = new VocabularyValidator(lexer);
			if (vocValidator.isIndividualConcept())
				return "IC";			
		} catch (RecognitionException e) {
			logger.warn(e);
			// e.printStackTrace();
			return "Recognition Exception";
		} catch (TokenStreamException e) {
			logger.warn(e);
			// e.printStackTrace();
			return "TokenStream Exception";
		}
		
		return "none";
	}
	
	public IToken evaluate(ICharacterScanner scanner) {
		String preEvaluate="";
		String rowString = "";
		ruleMemory = VocabularyRuleMemory.getInstance();
		
		if (!BusinessModellerDocument.isInstanced(BusinessModeller.DOCUMENT_VOCABULARY))
			preParsing(scanner);
		
		IWorkbenchWindow wb = BusinessModellerPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage wpage = wb.getActivePage();		
		
		int c= scanner.read();
		if (fDetector.isWordStart((char) c)) {
			if (fColumn == UNDEFINED || (fColumn == scanner.getColumn() - 1)) {

				fBuffer.setLength(0);
				do {
					fBuffer.append((char) c);
					c= scanner.read();
				} while (c != ICharacterScanner.EOF && c!=10 && c!=13 && c!=-1);

				scanner.unread();
				int end = scanner.getColumn();
			
				IToken token = Token.UNDEFINED;
				rowString = fBuffer.toString();
				preEvaluate = verify(rowString);
				
				if ((preEvaluate.equalsIgnoreCase("factType") && ruleMemory.getLastVerified().equalsIgnoreCase("none"))
				|| ruleMemory.getLastVerified().equalsIgnoreCase("factType"))
				{
					String rowSubString= inSentence(rowString,"factType",scanner);
					preEvaluate = verify(rowSubString);
					rowString=rowSubString;	
				}
				if ((preEvaluate.equalsIgnoreCase("attribute") && ruleMemory.getLastVerified().equalsIgnoreCase("none") )
					|| ruleMemory.getLastVerified().equalsIgnoreCase("attribute"))
				{ 
					String rowSubString= inSentence(rowString,"attribute",scanner);
					preEvaluate = verify(rowSubString);
					rowString=rowSubString;
					token = getFontToken(BusinessModeller.TAG);
				}
				
				
				if (preEvaluate.equalsIgnoreCase("objectType") && !ruleMemory.getCaptionType().equalsIgnoreCase("Definition:"))
				{ 
					if (ruleMemory.getLastVerified().equalsIgnoreCase("none"))
						ruleMemory.setLastWord(true);
					token=vocDetecting(rowString);
					String caption = ruleMemory.getCaptionType();
					if (token.equals(Token.UNDEFINED) &&  (caption.equals("Synonymous_form:") || caption.equals("Reference_scheme:")))
						token=verbDetecting(rowString,scanner);
					
					if (token.equals(Token.UNDEFINED) && !ruleMemory.getLastVerified().equalsIgnoreCase("attribute"))
						token=wnDetecting(rowString,scanner);
				}
				if (preEvaluate.equalsIgnoreCase("IC") && !ruleMemory.getCaptionType().equalsIgnoreCase("Definition:"))
				{
					token=getFontToken(BusinessModeller.NAME);
					if (ruleMemory.getLastVerified().equalsIgnoreCase("none"))
						ruleMemory.setLastWord(true);
				}
				if (token.isUndefined())
					ruleMemory.setTokenUndefined(true);
				
				String msg = "Object Type not defined";
				if (ruleMemory.getLastVerified().equalsIgnoreCase("factType"))	
					msg = "Fact Type not well defined";

				
				
				if (ruleMemory.isLastWord())
				{	
					if (c==13 && ruleMemory.isCountable())
					{
						scanner.read();
						scanner.read();
						int d=scanner.read();
						if (d==13 && ruleMemory.isCountable())
							ruleMemory.setCounter(ruleMemory.getCounter()+2);
						scanner.unread();
						scanner.unread();
						scanner.unread();
						ruleMemory.setCounter(ruleMemory.getCounter()+2);
					}
					if (ruleMemory.isCountable())
						ruleMemory.setCounter(ruleMemory.getCounter()+end);
					
					VocabularyMainEditor editor = null;
					ISelection selection = null;
					try {
						if (wpage.getActiveEditor() instanceof VocabularyMainEditor) {
							editor = (VocabularyMainEditor)wpage.getActiveEditor();
							selection=editor.getVocabularyEditor().getSelectionProvider().getSelection();
						}
					}
					catch(NullPointerException e){}
					
					int lineNumber = 0;
					
					if(selection != null) {
						ITextSelection textSelection = (ITextSelection) selection;
						if (!textSelection.isEmpty())
							lineNumber = textSelection.getStartLine() + 1;
					}
					
					
					
					if(ruleMemory.isTokenUndefined()) 
						markLine(wpage, msg, IMarker.SEVERITY_INFO, lineNumber);
					
					
					
					ruleMemory.setLastVerified("none");
					ruleMemory.setNumWordFactType(0);
					ruleMemory.setLastWord(false);
					ruleMemory.setCaptionType("none");
					ruleMemory.setTokenUndefined(false);
				}
						
				if (token != Token.UNDEFINED)
					return token;

				if (fDefaultToken.isUndefined())
					unreadBuffer(scanner);
				
				if (token == Token.UNDEFINED)
					if(ruleMemory.getCaptionType().equals("none"))
						return getFontToken(BusinessModeller.ERROR);
					else
						return getFontToken(BusinessModeller.DEFAULT_STYLE);
			}
		}
		if (c==-1)
			ruleMemory.setCountable(false);
		
		scanner.unread();
		return Token.UNDEFINED;
	}
	
	private String inSentence(String rowString,String type,ICharacterScanner scanner)
	{
		int end = rowString.indexOf(" ");
		if (end<=0) {
			end = rowString.indexOf("\t");
		}
		if(end<=0) {
			end = rowString.length();
		}
		String rowSubString = rowString.substring(0,end);
		
		int unLenght = rowString.length() - end;
		for (int i=0;i<unLenght;i++)
		{ scanner.unread();}
		
		if (end==rowString.trim().length())
			ruleMemory.setLastWord(true);
		else ruleMemory.setLastWord(false);
		
		if (ruleMemory.getLastVerified().equalsIgnoreCase("none"))
			ruleMemory.setLastVerified(type);
		
		if (ruleMemory.getLastVerified().equalsIgnoreCase("factType") || 
			ruleMemory.getLastVerified().equalsIgnoreCase("attribute"))
			ruleMemory.setNumWordFactType(ruleMemory.getNumWordFactType()+1);
		
		return rowSubString;
	}

	public IToken wnDetecting(String rowString, ICharacterScanner scanner)
	{
		IToken token = null;
		
		int numWord =ruleMemory.getNumWordFactType();
		
		if (!(ruleMemory.getCaptionType().equals("Synonymous_form:") || ruleMemory.getCaptionType().equals("Reference_scheme:"))
				&& (numWord%2)==0 && numWord>0)
			token=getFontToken(BusinessModeller.VERB);
		
		if (token != null)
			return token;
		return Token.UNDEFINED;
	}

	public IToken verbDetecting(String rowString, ICharacterScanner scanner)
	{
		IToken token = null;
		
		if ((ruleMemory.getCaptionType().equals("Synonymous_form:") || ruleMemory.getCaptionType().equals("Reference_scheme:"))
				&& (ruleMemory.getNumWordFactType()%2)==1)
				token=getFontToken(BusinessModeller.VERB);
		if (token != null)
			return token;		
		return Token.UNDEFINED;
	}
	
	public IToken vocDetecting(String rowString)
	{
		Vocabulary vocabulary = (Vocabulary)BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
		IToken token = null;
		try {
			if (vocabulary.hasEntry(rowString) || ruleMemory.getCaptionType().equals("Synonym:") || hasSBVRKeyword(rowString) || hasSBVRVerb(rowString)) {
				if(hasSBVRVerb(rowString)) 
					token=getFontToken(BusinessModeller.VERB);
				else
					token=getFontToken(BusinessModeller.TERM);	
			}
			else if(vocabulary.hasAttribute("Synonym:", rowString))
				token=getFontToken(BusinessModeller.TERM); // synonym
			else token = (IToken) fWords.get(rowString);
		} catch (Exception ex)
		  { ex.printStackTrace(); }
		if (token != null)
			return token;
		
		return Token.UNDEFINED;
	}
	
	private void preParsing(ICharacterScanner scanner)
	{		
		System.setProperty("file.encoding", "UTF-8");
		Vocabulary vocabulary = (Vocabulary)BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);;
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
			vocabulary=vocParser.vocabulary();
			vocabulary.getClass();
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
		return new Token(new TextAttribute(fontStyle.getColor() ,null, style));
	}
	
	private void markLine(IWorkbenchPage wpage, String msg, int severity, int line)
	{
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
				if (wpage.getActiveEditor() instanceof VocabularyMainEditor)
				{
					VocabularyMainEditor editor = (VocabularyMainEditor)wpage.getActiveEditor();
					
					try {
						IDocumentProvider docProvider = editor.getVocabularyEditor().getDocumentProvider();
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
					
					IAnnotationModel am = editor.getVocabularyEditor().getDocumentProvider().getAnnotationModel(editorInput);
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
