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
// $ANTLR 2.7.5 (20050128): "sev.g" -> "VocabularyValidator.java"$
/*
 * Modified 2009.10.08 by Vetis project
 */

package org.dbe.businessModeller.vocabulary.enterprise.grammar;

import org.dbe.businessModeller.logger.BusinessModellerLogger;
import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

public class VocabularyValidator extends antlr.LLkParser       implements VocabularyValidatorTokenTypes
 {

	private static BusinessModellerLogger logger = (BusinessModellerLogger)BusinessModellerLogger.getLogger(VocabularyValidator.class);
	
protected VocabularyValidator(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public VocabularyValidator(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected VocabularyValidator(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public VocabularyValidator(TokenStream lexer) {
  this(lexer,1);
}

public VocabularyValidator(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final boolean  isObjectType() throws RecognitionException, TokenStreamException {
		boolean isTerm;
		
		
		boolean isRepresentation=false;
		boolean hasAtts=false;
		isTerm = false;
		
		
		try {      // for error handling
			isRepresentation=isDesignation();
			if ( inputState.guessing==0 ) {
				
							if (isRepresentation) 
								isTerm=true;
							
			}
			{
			switch ( LA(1)) {
			case LITERAL_Definition:
			case LITERAL_Synonym:
			case LITERAL_Synonymous_form:
			case LITERAL_Source:
			case LITERAL_Note:
			case LITERAL_Example:
			case LITERAL_Dictionary_basis:
			case LITERAL_General_concept:
			case LITERAL_See:
			case LITERAL_Qualifier:
			case LITERAL_Symbol_type:
			case LITERAL_Necessity:
			case LITERAL_Possibility:
			case LITERAL_Concept_type:
			case LITERAL_Reference_scheme:
			{
				hasAtts=isAttributes();
				break;
			}
			case EOF:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
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
		return isTerm;
	}
	
	public final boolean  isDesignation() throws RecognitionException, TokenStreamException {
		boolean isDes;
		
		
		isDes = false;
		
		
		try {      // for error handling
			match(SIGNIFIER);
			if ( inputState.guessing==0 ) {
				
						    isDes=true;
						
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
		return isDes;
	}
	
	protected final boolean  isAttributes() throws RecognitionException, TokenStreamException {
		boolean isAtts;
		
		
		isAtts = false;
		boolean isAtt=false;
		boolean found=false;
		
		
		try {      // for error handling
			{
			int _cnt19=0;
			_loop19:
			do {
				if (((LA(1) >= LITERAL_Definition && LA(1) <= LITERAL_Reference_scheme))) {
					isAtt=isAttribute();
					if ( inputState.guessing==0 ) {
						if (isAtt) found=true;
					}
				}
				else {
					if ( _cnt19>=1 ) { break _loop19; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt19++;
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				
							if (found)
								isAtts=true;
							
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
		return isAtts;
	}
	
	public final boolean  isFactType() throws RecognitionException, TokenStreamException {
		boolean isFact;
		
		
		boolean isRepresentation=false;
		boolean hasAtts=false;
		isFact = false;
		
		
		try {      // for error handling
			isRepresentation=isFoE();
			if ( inputState.guessing==0 ) {
				
					if (isRepresentation)
						isFact=true;
					
			}
			{
			switch ( LA(1)) {
			case LITERAL_Definition:
			case LITERAL_Synonym:
			case LITERAL_Synonymous_form:
			case LITERAL_Source:
			case LITERAL_Note:
			case LITERAL_Example:
			case LITERAL_Dictionary_basis:
			case LITERAL_General_concept:
			case LITERAL_See:
			case LITERAL_Qualifier:
			case LITERAL_Symbol_type:
			case LITERAL_Necessity:
			case LITERAL_Possibility:
			case LITERAL_Concept_type:
			case LITERAL_Reference_scheme:
			{
				hasAtts=isAttributes();
				break;
			}
			case EOF:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
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
		return isFact;
	}
	
	public final boolean  isFoE() throws RecognitionException, TokenStreamException {
		boolean isFoe;
		
		
		isFoe=false;
		boolean ph1=false;
		boolean pr=false;
		boolean ph2=false;
		
		
		try {      // for error handling
			ph1=isPlaceholder();
			{
			int _cnt8=0;
			_loop8:
			do {
				if ((LA(1)==SIGNIFIER)) {
					pr=isPredicate();
					// changed for fact types with two words
					//ph2=isPlaceholder();
					ph2=true;
				}
				else {
					if ( _cnt8>=1 ) { break _loop8; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt8++;
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				
					if (ph1 && pr && ph2)
					isFoe=true;
					
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
		return isFoe;
	}
	
	public final boolean  isPlaceholder() throws RecognitionException, TokenStreamException {
		boolean isFoePart;
		
		
		isFoePart = false;
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case SIGNIFIER:
			{
				{
				match(SIGNIFIER);
				if ( inputState.guessing==0 ) {
					isFoePart=true;
				}
				}
				break;
			}
			case ICSIGNIFIER:
			{
				match(ICSIGNIFIER);
				if ( inputState.guessing==0 ) {
					isFoePart=true;
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
				recover(ex,_tokenSet_2);
			} else {
			  throw ex;
			}
		}
		return isFoePart;
	}
	
	public final boolean  isPredicate() throws RecognitionException, TokenStreamException {
		boolean isFoePart;
		
		
		isFoePart = false;
		
		
		try {      // for error handling
			match(SIGNIFIER);
			if ( inputState.guessing==0 ) {
				
					isFoePart=true;
					
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
		return isFoePart;
	}
	
	public final boolean  isIndividualConcept() throws RecognitionException, TokenStreamException {
		boolean isName;
		
		
		isName = false;
		boolean isDes=false;
		boolean hasAtts=false;
		
		
		try {      // for error handling
			isDes=isIcDesignation();
			{
			switch ( LA(1)) {
			case LITERAL_Definition:
			case LITERAL_Synonym:
			case LITERAL_Synonymous_form:
			case LITERAL_Source:
			case LITERAL_Note:
			case LITERAL_Example:
			case LITERAL_Dictionary_basis:
			case LITERAL_General_concept:
			case LITERAL_See:
			case LITERAL_Qualifier:
			case LITERAL_Symbol_type:
			case LITERAL_Necessity:
			case LITERAL_Possibility:
			case LITERAL_Concept_type:
			case LITERAL_Reference_scheme:
			{
				hasAtts=isAttributes();
				break;
			}
			case EOF:
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
				
					if (isDes)
						isName=true;
					
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
		return isName;
	}
	
	public final boolean  isIcDesignation() throws RecognitionException, TokenStreamException {
		boolean isIcDes;
		
		
		isIcDes = false;
		
		
		try {      // for error handling
			match(ICSIGNIFIER);
			if ( inputState.guessing==0 ) {
				
						      isIcDes=true;
						
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
		return isIcDes;
	}
	
	public final boolean  isAttribute() throws RecognitionException, TokenStreamException {
		boolean isAtt;
		
		
		boolean isValue=false;
		boolean isLabel=false;
		isAtt=false;
		
		
		try {      // for error handling
			isLabel=isLabel();
			{
			int _cnt22=0;
			_loop22:
			do {
				if ((LA(1)==SIGNIFIER)) {
					match(SIGNIFIER);
				}
				else {
					if ( _cnt22>=1 ) { break _loop22; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt22++;
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				
							isValue=true;
							
			}
			if ( inputState.guessing==0 ) {
				
					if (isValue && isLabel)
						isAtt=true;
					
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
		return isAtt;
	}
	
	protected final boolean  isLabel() throws RecognitionException, TokenStreamException {
		boolean isCapt;
		
		
		isCapt=false;
		
		
		try {      // for error handling
			isCapt=isCaption();
			match(SEPARATOR);
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_4);
			} else {
			  throw ex;
			}
		}
		return isCapt;
	}
	
	public final boolean  isCaption() throws RecognitionException, TokenStreamException {
		boolean isCapt;
		
		
		isCapt=false;
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_Definition:
			{
				match(LITERAL_Definition);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_Synonym:
			{
				match(LITERAL_Synonym);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_Synonymous_form:
			{
				match(LITERAL_Synonymous_form);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_Source:
			{
				match(LITERAL_Source);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_Note:
			{
				match(LITERAL_Note);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_Example:
			{
				match(LITERAL_Example);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_Dictionary_basis:
			{
				match(LITERAL_Dictionary_basis);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_General_concept:
			{
				match(LITERAL_General_concept);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_See:
			{
				match(LITERAL_See);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_Qualifier:
			{
				match(LITERAL_Qualifier);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_Symbol_type:
			{
				match(LITERAL_Symbol_type);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_Necessity:
			{
				match(LITERAL_Necessity);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_Possibility:
			{
				match(LITERAL_Possibility);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_Concept_type:
			{
				match(LITERAL_Concept_type);
				if ( inputState.guessing==0 ) {
					isCapt=true;
				}
				break;
			}
			case LITERAL_Reference_scheme:
			{
				match(LITERAL_Reference_scheme);
				if ( inputState.guessing==0 ) {
					isCapt=true;
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
				recover(ex,_tokenSet_5);
			} else {
			  throw ex;
			}
		}
		return isCapt;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"SIGNIFIER",
		"NEWLINE",
		"ICSIGNIFIER",
		"SEPARATOR",
		"\"Definition\"",
		"\"Synonym\"",
		"\"Synonymous_form\"",
		"\"Source\"",
		"\"Note\"",
		"\"Example\"",
		"\"Dictionary_basis\"",
		"\"General_type\"",
		"\"See\"",
		"\"Qualifier\"",
		"\"Symbol_type\"",
		"\"Necessity\"",
		"\"Possibility\"",
		"\"Concept_type\"",
		"\"Reference_scheme\"",
		"WS"
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 898L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 914L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 48L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 16L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 64L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	
	/*
	 * Overrided to use the Log4j logging
	 */
	public void reportError(String args){
		logger.parser(args.trim());
	}
	
	/*
	 * Overrided to use the Log4j logging
	 */
    public void reportError(RecognitionException ex) {
    	logger.parser(ex.getMessage().trim());
    }
    
    /*
	 * Overrided to use the Log4j logging
	 */
    public void reportWarning(String s) {
        if (getFilename() == null) {
        	logger.parser("warning: ".concat(s.trim()));
        }
        else {
        	logger.parser(getFilename().concat(": warning: ".concat(s.trim())));
        }
    }

	
	}
