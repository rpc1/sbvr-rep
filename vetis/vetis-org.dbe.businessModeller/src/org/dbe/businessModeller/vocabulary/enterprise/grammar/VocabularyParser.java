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
// $ANTLR 2.7.5 (20050128): "se4.g" -> "VocabularyParser.java"$
/*
 * Modified 2009.09.23 by Vetis project
 */

package org.dbe.businessModeller.vocabulary.enterprise.grammar;
import org.dbe.businessModeller.*;
import org.dbe.businessModeller.enterprise.BusinessModellerDocument;
import org.dbe.businessModeller.vocabulary.enterprise.*;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

public class VocabularyParser extends antlr.LLkParser       implements VocabularyParserTokenTypes
 {

long currentRow=0;
long lastEntryRow=0;
Vocabulary vocab = null;
protected void setFoEPart(Designation d, FoEPart foePart, Token s, int fontStyle, int foeType){
	d.setFontStyle(new FontStyle(fontStyle));
	d.setSignifier(s.getText());
	foePart.setPrimaryRepresentation(d);
	foePart.setType(foeType);
	foePart.setStartingCharPosition(s.getColumn());
}

protected VocabularyParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public VocabularyParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected VocabularyParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public VocabularyParser(TokenStream lexer) {
  this(lexer,1);
}

public VocabularyParser(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final Vocabulary  vocabulary() throws RecognitionException, TokenStreamException {
		Vocabulary retVocab;
		
		
		retVocab=null;
		VocabularyEntry entry = null;
		Collection entries = new ArrayList();
		HashMap vocabularyEntryPosition = new HashMap();
		vocab = (Vocabulary) BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
		vocab.setExtTerms(new ArrayList());
		vocab.setVerbs(new ArrayList());
		
		
		try {      // for error handling
			{
			_loop3:
			do {
				if ((LA(1)==NEWLINE)) {
					match(NEWLINE);
					if ( inputState.guessing==0 ) {
						currentRow++;
					}
				}
				else {
					break _loop3;
				}
				
			} while (true);
			}
			{
			_loop5:
			do {
				if ((LA(1)==SIGNIFIER||LA(1)==ICSIGNIFIER)) {
					entry=vocabularyEntry();
					if ( inputState.guessing==0 ) {
						entries.add(entry);
						vocabularyEntryPosition.put(new Long(lastEntryRow), entry.getPrimaryRepresentation().toString());
						lastEntryRow=currentRow;
					}
				}
				else {
					break _loop5;
				}
				
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				vocab.setEntries(entries);
				vocab.setEntryPosition(vocabularyEntryPosition);						
			}
			if ( inputState.guessing==0 ) {
				retVocab = vocab;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_0);
			} else {
			  throw ex;
			}
		}
		return retVocab;
	}
	
	public final VocabularyEntry  vocabularyEntry() throws RecognitionException, TokenStreamException {
		VocabularyEntry entry;
		
		
		entry=null;
		
		
		try {      // for error handling
			boolean synPredMatched8 = false;
			if (((LA(1)==SIGNIFIER||LA(1)==ICSIGNIFIER))) {
				int _m8 = mark();
				synPredMatched8 = true;
				inputState.guessing++;
				try {
					{
					factType();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched8 = false;
				}
				rewind(_m8);
				inputState.guessing--;
			}
			if ( synPredMatched8 ) {
				entry=factType();
			}
			else if ((LA(1)==SIGNIFIER)) {
				entry=objectType();
			}
			else if ((LA(1)==ICSIGNIFIER)) {
				entry=individualConcept();
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_1);
			} else {
			  throw ex;
			}
		}
		return entry;
	}
	
	public final VocabularyEntry  factType() throws RecognitionException, TokenStreamException {
		VocabularyEntry fact;
		
		
		FoE representation=null;
		Collection atts = null;
		fact = new FactType();
		
		
		try {      // for error handling
			representation=foe();
			{
			switch ( LA(1)) {
			case LITERAL_Definition:
			case LITERAL_Synonym:
			case LITERAL_Synonymous_form:
			case LITERAL_Source:
			case LITERAL_Note:
			case LITERAL_Example:
			case LITERAL_Dictionary_basis:
			case LITERAL_Concept_type:
			case LITERAL_General_concept:
			case LITERAL_See:
			case LITERAL_Qualifier:
			case LITERAL_Symbol_type:
			case LITERAL_Necessity:
			case LITERAL_Possibility:
			case LITERAL_Reference_scheme:
			{
				atts=attributes();
				
				// append vocabulary verb list with foun synonymous form verbs
				Object[] att = atts.toArray();
				for(int i = 0; i < atts.size(); i++) {
					if(((VocabularyAttribute) att[i]).getCaption().equals("Synonymous_form:")) {
						String synonym = (String) ((VocabularyAttribute) att[i]).getValue();
						String [] temp = synonym.split(" ");
						Vocabulary vocabulary = (Vocabulary)BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
						vocabulary.addVerbs(temp[1]);
					}
				}
				
				break;
			}
			case EOF:
			case SIGNIFIER:
			case ICSIGNIFIER:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				
					fact.setPrimaryRepresentation(representation);
					fact.setAttributes(atts);
					
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_1);
			} else {
			  throw ex;
			}
		}
		return fact;
	}
	
	public final VocabularyEntry  objectType() throws RecognitionException, TokenStreamException {
		VocabularyEntry term;
		
		
		Designation representation=null;
		Collection atts = null;
		term = new ObjectType();
		
		
		try {      // for error handling
			representation=designation();
			{
			switch ( LA(1)) {
			case LITERAL_Definition:
			case LITERAL_Synonym:
			case LITERAL_Synonymous_form:
			case LITERAL_Source:
			case LITERAL_Note:
			case LITERAL_Example:
			case LITERAL_Dictionary_basis:
			case LITERAL_Concept_type:
			case LITERAL_General_concept:
			case LITERAL_See:
			case LITERAL_Qualifier:
			case LITERAL_Symbol_type:
			case LITERAL_Necessity:
			case LITERAL_Possibility:
			case LITERAL_Reference_scheme:
			{
				atts=attributes();
				break;
			}
			case EOF:
			case SIGNIFIER:
			case ICSIGNIFIER:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				
					term.setAttributes(atts);
					term.setPrimaryRepresentation(representation);
					vocab.addExtTerms(term.getPrimaryRepresentation().toString());
					
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_1);
			} else {
			  throw ex;
			}
		}
		return term;
	}
	
	public final VocabularyEntry  individualConcept() throws RecognitionException, TokenStreamException {
		VocabularyEntry name;
		
		
		name = new IndividualConcept();
		Designation d=null;
		Collection atts = null;
		
		
		
		try {      // for error handling
			d=icDesignation();
			{
			switch ( LA(1)) {
			case LITERAL_Definition:
			case LITERAL_Synonym:
			case LITERAL_Synonymous_form:
			case LITERAL_Source:
			case LITERAL_Note:
			case LITERAL_Example:
			case LITERAL_Dictionary_basis:
			case LITERAL_Concept_type:
			case LITERAL_General_concept:
			case LITERAL_See:
			case LITERAL_Qualifier:
			case LITERAL_Symbol_type:
			case LITERAL_Necessity:
			case LITERAL_Possibility:
			case LITERAL_Reference_scheme:
			{
				atts=attributes();
				break;
			}
			case EOF:
			case SIGNIFIER:
			case ICSIGNIFIER:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				
					name.setPrimaryRepresentation(d);
					name.setAttributes(atts);
					vocab.addExtTerms(name.getPrimaryRepresentation().toString());
					
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_1);
			} else {
			  throw ex;
			}
		}
		return name;
	}
	
	public final Designation  designation() throws RecognitionException, TokenStreamException {
		Designation d;
		
		Token  s = null;
		
		d = new Designation();
		FontStyle style = new FontStyle(BusinessModeller.TERM);
		
		
		try {      // for error handling
			s = LT(1);
			match(SIGNIFIER);
			if ( inputState.guessing==0 ) {
				
						    d.setSignifier(s.getText()); 
						    d.setFontStyle(style);
						
			}
			{
			int _cnt13=0;
			_loop13:
			do {
				if ((LA(1)==NEWLINE)) {
					match(NEWLINE);
					if ( inputState.guessing==0 ) {
						currentRow++;
					}
				}
				else {
					if ( _cnt13>=1 ) { break _loop13; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt13++;
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_2);
			} else {
			  throw ex;
			}
		}
		return d;
	}
	
	public final Collection  attributes() throws RecognitionException, TokenStreamException {
		Collection atts;
		
		
		
		atts = new ArrayList();
		VocabularyAttribute att=null;
		
		
		try {      // for error handling
			{
			int _cnt33=0;
			_loop33:
			do {
				if (((LA(1) >= LITERAL_Definition && LA(1) <= LITERAL_Reference_scheme))) {
					att=attribute();
					if ( inputState.guessing==0 ) {
						atts.add(att);
					}
				}
				else {
					if ( _cnt33>=1 ) { break _loop33; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt33++;
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_1);
			} else {
			  throw ex;
			}
		}
		return atts;
	}
	
	public final FoE  foe() throws RecognitionException, TokenStreamException {
		FoE f;
		
		
		f = new FoE();
		FoEPart ph1=null;
		FoEPart pr=null;
		FoEPart ph2=null;
		Collection c = new ArrayList();
		
		
		try {      // for error handling
			ph1=placeholder();
			if ( inputState.guessing==0 ) {
				c.add(ph1);
			}
			{
			int _cnt18=0;
			_loop18:
			do {
				if ((LA(1)==SIGNIFIER)) {
					pr=predicate();
					if ( inputState.guessing==0 ) {
						c.add(pr); vocab.addVerbs(pr.getPrimaryRepresentation().toString());
					}
					//ph2=placeholder();
					//if ( inputState.guessing==0 ) {
							//c.add(ph2);
					//}
				}
				else {
					if ( _cnt18>=1 ) { break _loop18; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt18++;
			} while (true);
			}
			{
			int _cnt20=0;
			_loop20:
			do {
				if ((LA(1)==NEWLINE)) {
					match(NEWLINE);
					if ( inputState.guessing==0 ) {
						currentRow++;
					}
				}
				else {
					if ( _cnt20>=1 ) { break _loop20; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt20++;
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				f.setFoEParts(c);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_2);
			} else {
			  throw ex;
			}
		}
		return f;
	}
	
	public final FoEPart  placeholder() throws RecognitionException, TokenStreamException {
		FoEPart foePart;
		
		Token  s = null;
		Token  i = null;
		
		foePart = new FoEPart();
		Designation d = new Designation();
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case SIGNIFIER:
			{
				{
				s = LT(1);
				match(SIGNIFIER);
				if ( inputState.guessing==0 ) {
					setFoEPart(d, foePart, s, BusinessModeller.TERM, BusinessModeller.PLACEHOLDER);
				}
				}
				break;
			}
			case ICSIGNIFIER:
			{
				i = LT(1);
				match(ICSIGNIFIER);
				if ( inputState.guessing==0 ) {
					setFoEPart(d, foePart, i, BusinessModeller.TERM, BusinessModeller.PLACEHOLDER);
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_3);
			} else {
			  throw ex;
			}
		}
		return foePart;
	}
	
	public final FoEPart  predicate() throws RecognitionException, TokenStreamException {
		FoEPart foePart;
		
		Token  s = null;
		
		foePart = new FoEPart();
		Designation d = new Designation();
		
		
		try {      // for error handling
			s = LT(1);
			match(SIGNIFIER);
			if ( inputState.guessing==0 ) {
				
					setFoEPart(d, foePart, s, BusinessModeller.TERM, BusinessModeller.PREDICATE);
					
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_4);
			} else {
			  throw ex;
			}
		}
		return foePart;
	}
	
	public final Designation  icDesignation() throws RecognitionException, TokenStreamException {
		Designation d;
		
		Token  s = null;
		
		d = new Designation();
		
		
		try {      // for error handling
			s = LT(1);
			match(ICSIGNIFIER);
			if ( inputState.guessing==0 ) {
				
						      d.setSignifier(s.getText());
						      d.setFontStyle(new FontStyle(BusinessModeller.NAME));
						
			}
			{
			int _cnt30=0;
			_loop30:
			do {
				if ((LA(1)==NEWLINE)) {
					match(NEWLINE);
					if ( inputState.guessing==0 ) {
						currentRow++;
					}
				}
				else {
					if ( _cnt30>=1 ) { break _loop30; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt30++;
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_2);
			} else {
			  throw ex;
			}
		}
		return d;
	}
	
	public final VocabularyAttribute  attribute() throws RecognitionException, TokenStreamException {
		VocabularyAttribute att;
		
		Token  s = null;
		
		String value="";
		att = new VocabularyAttribute();
		String label="";
		
		
		try {      // for error handling
			label=caption();
			if ( inputState.guessing==0 ) {
				
						att.setCaption(label);
						
			}
			{
			int _cnt36=0;
			_loop36:
			do {
				if ((LA(1)==SIGNIFIER || LA(1)==ICSIGNIFIER)) {
					s = LT(1);
					switch(LA(1)) {
					case SIGNIFIER:
					{
						match(SIGNIFIER);
						break;
					}
					case ICSIGNIFIER:
					{
						match(ICSIGNIFIER);
						break;
					}
					}
					
					if ( inputState.guessing==0 ) {
						value = value + ((value!="")?" ":"") + s.getText();
					}
				}
				else {
					if ( _cnt36>=1 ) { break _loop36; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt36++;
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				
									att.setValue(value);
									if (label.equals("Synonym")) {
										vocab.addExtTerms(value);
									}
									
			}
			{
			int _cnt38=0;
			_loop38:
			do {
				if ((LA(1)==NEWLINE)) {
					match(NEWLINE);
					if ( inputState.guessing==0 ) {
						currentRow++;
					}
				}
				else {
					if ( _cnt38>=1 ) { break _loop38; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt38++;
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_2);
			} else {
			  throw ex;
			}
		}
		return att;
	}
	
	public final String  caption() throws RecognitionException, TokenStreamException {
		String l;
		
		Token  s = null;
		
		l="";
		
		
		try {      // for error handling
			l=label();
			s = LT(1);
			match(SEPARATOR);
			if ( inputState.guessing==0 ) {
				l=l + s.getText();
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_5);
			} else {
			  throw ex;
			}
		}
		return l;
	}
	
	public final String  label() throws RecognitionException, TokenStreamException {
		String l;
		
		
		l="";
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_Definition:
			{
				match(LITERAL_Definition);
				if ( inputState.guessing==0 ) {
					l="Definition";
				}
				break;
			}
			case LITERAL_Synonym:
			{
				match(LITERAL_Synonym);
				if ( inputState.guessing==0 ) {
					l="Synonym";
				}
				break;
			}
			case LITERAL_Synonymous_form:
			{
				match(LITERAL_Synonymous_form);
				if ( inputState.guessing==0 ) {
					l="Synonymous_form";
				}
				break;
			}
			case LITERAL_Source:
			{
				match(LITERAL_Source);
				if ( inputState.guessing==0 ) {
					l="Source";
				}
				break;
			}
			case LITERAL_Note:
			{
				match(LITERAL_Note);
				if ( inputState.guessing==0 ) {
					l="Note";
				}
				break;
			}
			case LITERAL_Example:
			{
				match(LITERAL_Example);
				if ( inputState.guessing==0 ) {
					l="Example";
				}
				break;
			}
			case LITERAL_Dictionary_basis:
			{
				match(LITERAL_Dictionary_basis);
				if ( inputState.guessing==0 ) {
					l="Dictionary_basis";
				}
				break;
			}
			case LITERAL_Concept_type:
			{
				match(LITERAL_Concept_type);
				if ( inputState.guessing==0 ) {
					l="Concept_type";
				}
				break;
			}
			case LITERAL_General_concept:
			{
				match(LITERAL_General_concept);
				if ( inputState.guessing==0 ) {
					l="General_concept";
				}
				break;
			}
			case LITERAL_See:
			{
				match(LITERAL_See);
				if ( inputState.guessing==0 ) {
					l="See";
				}
				break;
			}
			case LITERAL_Qualifier:
			{
				match(LITERAL_Qualifier);
				if ( inputState.guessing==0 ) {
					l="Qualifier";
				}
				break;
			}
			case LITERAL_Symbol_type:
			{
				match(LITERAL_Symbol_type);
				if ( inputState.guessing==0 ) {
					l="Symbol_type";
				}
				break;
			}
			case LITERAL_Necessity:
			{
				match(LITERAL_Necessity);
				if ( inputState.guessing==0 ) {
					l="Necessity";
				}
				break;
			}
			case LITERAL_Possibility:
			{
				match(LITERAL_Possibility);
				if ( inputState.guessing==0 ) {
					l="Possibility";
				}
				break;
			}
			case LITERAL_Reference_scheme:
			{
				match(LITERAL_Reference_scheme);
				if ( inputState.guessing==0 ) {
					l="Reference_scheme";
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_6);
			} else {
			  throw ex;
			}
		}
		return l;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"NEWLINE",
		"SIGNIFIER",
		"ICSIGNIFIER",
		"SEPARATOR",
		"\"Definition\"",
		"\"Synonym\"",
		"\"Synonymous_form\"",
		"\"Source\"",
		"\"Note\"",
		"\"Example\"",
		"\"Dictionary_basis\"",
		"\"Concept_type\"",
		"\"General_concept\"",
		"\"See\"",
		"\"Qualifier\"",
		"\"Symbol_type\"",
		"\"Necessity\"",
		"\"Possibility\"",
		"\"Reference_scheme\"",
		"WS"
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 98L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 8388450L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 48L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 96L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 32L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 128L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	
	}
