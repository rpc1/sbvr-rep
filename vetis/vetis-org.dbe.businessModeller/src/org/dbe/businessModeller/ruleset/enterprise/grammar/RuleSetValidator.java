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
// $ANTLR 2.7.5 (20050128): "rulesetv.g" -> "RuleSetValidator.java"$
/*
 * Modified 2009.09.13 by Vetis project
 */

package org.dbe.businessModeller.ruleset.enterprise.grammar;

import org.dbe.businessModeller.logger.BusinessModellerLogger;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

public class RuleSetValidator extends antlr.LLkParser       implements RuleSetValidatorTokenTypes
 {

	private static BusinessModellerLogger logger = (BusinessModellerLogger)BusinessModellerLogger.getLogger(RuleSetValidator.class);
	
protected RuleSetValidator(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public RuleSetValidator(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected RuleSetValidator(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public RuleSetValidator(TokenStream lexer) {
  this(lexer,1);
}

public RuleSetValidator(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final boolean  isRuleSet() throws RecognitionException, TokenStreamException {
		boolean isruleset;
		
		
		boolean isrule = false;
		isruleset=false;
		
		
		try {      // for error handling
			{
			_loop4:
			do {
				if ((_tokenSet_0.member(LA(1)))) {
					isrule=isRule();
					{
					switch ( LA(1)) {
					case WS:
					case LITERAL_Name:
					case LITERAL_Guidance:
					case LITERAL_Description:
					case LITERAL_Source:
					case LITERAL_Note:
					case LITERAL_Example:
					case LITERAL_Synonymuos:
					case LITERAL_Enforcement:
					{
						isAttributes();
						break;
					}
					case EOF:
					case LITERAL_The:
					case LITERAL_the:
					case LITERAL_A:
					case LITERAL_a:
					case LITERAL_An:
					case LITERAL_an:
					case LITERAL_It:
					case LITERAL_it:
					case LITERAL_each:
					case LITERAL_Another:
					case LITERAL_another:
					case LITERAL_Who:
					case LITERAL_who:
					case LITERAL_What:
					case LITERAL_what:
					case LITERAL_Each:
					case LITERAL_Some:
					case LITERAL_some:
					case LITERAL_More:
					case LITERAL_more:
					case LITERAL_At:
					case LITERAL_at:
					case LITERAL_Exaclty:
					case LITERAL_exactly:
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
				else {
					break _loop4;
				}
				
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				
							if (isrule)
							isruleset=true;
						
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
		return isruleset;
	}
	
	public final boolean  isRule() throws RecognitionException, TokenStreamException {
		boolean isrule;
		
		
		isrule=false;
		
		
		try {      // for error handling
			{
			int _cnt7=0;
			_loop7:
			do {
				if ((_tokenSet_0.member(LA(1)))) {
					isSimpleRule();
				}
				else {
					if ( _cnt7>=1 ) { break _loop7; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt7++;
			} while (true);
			}
			dot();
			{
			switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case NEWLINE:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			int _cnt10=0;
			_loop10:
			do {
				if ((LA(1)==NEWLINE)) {
					match(NEWLINE);
				}
				else {
					if ( _cnt10>=1 ) { break _loop10; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt10++;
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				isrule=true;
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
		return isrule;
	}
	
	public final boolean  isAttributes() throws RecognitionException, TokenStreamException {
		boolean isatts;
		
		
		isatts = false;
		
		
		try {      // for error handling
			{
			int _cnt44=0;
			_loop44:
			do {
				if ((_tokenSet_3.member(LA(1)))) {
					{
					switch ( LA(1)) {
					case WS:
					{
						match(WS);
						break;
					}
					case LITERAL_Name:
					case LITERAL_Guidance:
					case LITERAL_Description:
					case LITERAL_Source:
					case LITERAL_Note:
					case LITERAL_Example:
					case LITERAL_Synonymuos:
					case LITERAL_Enforcement:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					{
					isAttribute();
					if ( inputState.guessing==0 ) {
						isatts = true;
					}
					}
					{
					int _cnt43=0;
					_loop43:
					do {
						if ((LA(1)==NEWLINE)) {
							match(NEWLINE);
							if ( inputState.guessing==0 ) {
								/*currentRow++;*/
							}
						}
						else {
							if ( _cnt43>=1 ) { break _loop43; } else {throw new NoViableAltException(LT(1), getFilename());}
						}
						
						_cnt43++;
					} while (true);
					}
				}
				else {
					if ( _cnt44>=1 ) { break _loop44; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt44++;
			} while (true);
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
		return isatts;
	}
	
	public final boolean  isSimpleRule() throws RecognitionException, TokenStreamException {
		boolean issimplerule;
		
		
		issimplerule=false;
		
		
		try {      // for error handling
			{
			_loop13:
			do {
				if ((LA(1)==LITERAL_It||LA(1)==LITERAL_it)) {
					isClaim();
				}
				else {
					break _loop13;
				}
				
			} while (true);
			}
			{
			boolean synPredMatched16 = false;
			if (((_tokenSet_5.member(LA(1))))) {
				int _m16 = mark();
				synPredMatched16 = true;
				inputState.guessing++;
				try {
					{
					isKeyword();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched16 = false;
				}
				rewind(_m16);
				inputState.guessing--;
			}
			if ( synPredMatched16 ) {
				isKeyword();
			}
			else if ((_tokenSet_6.member(LA(1)))) {
				{
				switch ( LA(1)) {
				case LITERAL_each:
				case LITERAL_Each:
				case LITERAL_Some:
				case LITERAL_some:
				case LITERAL_More:
				case LITERAL_more:
				case LITERAL_At:
				case LITERAL_at:
				case LITERAL_Exaclty:
				case LITERAL_exactly:
				{
					isQuantification();
					break;
				}
				case LITERAL_The:
				case LITERAL_the:
				case LITERAL_A:
				case LITERAL_a:
				case LITERAL_An:
				case LITERAL_an:
				{
					isArticle();
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			{
			switch ( LA(1)) {
			case SIGNIFIER:
			{
				isConcept();
				break;
			}
			case ICSIGNIFIER:
			{
				isIndividualConcept();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case QUOTE:
			{
				isText();
				break;
			}
			case NUMBER:
			{
				isNumber();
				break;
			}
			case SIGNIFIER:
			case LITERAL_that:
			case LITERAL_which:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			int _cnt31=0;
			_loop31:
			do {
				if ((LA(1)==SIGNIFIER||LA(1)==LITERAL_that||LA(1)==LITERAL_which)) {
					{
					switch ( LA(1)) {
					case LITERAL_that:
					case LITERAL_which:
					{
						isPronoun();
						break;
					}
					case SIGNIFIER:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					isPredicate();
					{
					switch ( LA(1)) {
					case LITERAL_each:
					case LITERAL_Each:
					case LITERAL_Some:
					case LITERAL_some:
					case LITERAL_More:
					case LITERAL_more:
					case LITERAL_At:
					case LITERAL_at:
					case LITERAL_Exaclty:
					case LITERAL_exactly:
					{
						isQuantification();
						break;
					}
					case LITERAL_The:
					case LITERAL_the:
					case LITERAL_A:
					case LITERAL_a:
					case LITERAL_An:
					case LITERAL_an:
					{
						{
						isArticle();
						}
						break;
					}
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
					{
					switch ( LA(1)) {
					case SIGNIFIER:
					{
						isConcept();
						break;
					}
					case ICSIGNIFIER:
					{
						isIndividualConcept();
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					{
					switch ( LA(1)) {
					case QUOTE:
					{
						isText();
						break;
					}
					case NUMBER:
					{
						isNumber();
						break;
					}
					case SIGNIFIER:
					case LITERAL_The:
					case LITERAL_the:
					case LITERAL_A:
					case LITERAL_a:
					case LITERAL_An:
					case LITERAL_an:
					case LITERAL_that:
					case LITERAL_which:
					case LITERAL_and:
					case 31:
					case LITERAL_or:
					case LITERAL_It:
					case LITERAL_it:
					case DOT:
					case LITERAL_each:
					case LITERAL_Another:
					case LITERAL_another:
					case LITERAL_Who:
					case LITERAL_who:
					case LITERAL_What:
					case LITERAL_what:
					case LITERAL_Each:
					case LITERAL_Some:
					case LITERAL_some:
					case LITERAL_More:
					case LITERAL_more:
					case LITERAL_At:
					case LITERAL_at:
					case LITERAL_Exaclty:
					case LITERAL_exactly:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					{
					switch ( LA(1)) {
					case LITERAL_and:
					case 31:
					{
						isConjunction();
						break;
					}
					case LITERAL_or:
					{
						isDisjunction();
						break;
					}
					case SIGNIFIER:
					case LITERAL_The:
					case LITERAL_the:
					case LITERAL_A:
					case LITERAL_a:
					case LITERAL_An:
					case LITERAL_an:
					case LITERAL_that:
					case LITERAL_which:
					case LITERAL_It:
					case LITERAL_it:
					case DOT:
					case LITERAL_each:
					case LITERAL_Another:
					case LITERAL_another:
					case LITERAL_Who:
					case LITERAL_who:
					case LITERAL_What:
					case LITERAL_what:
					case LITERAL_Each:
					case LITERAL_Some:
					case LITERAL_some:
					case LITERAL_More:
					case LITERAL_more:
					case LITERAL_At:
					case LITERAL_at:
					case LITERAL_Exaclty:
					case LITERAL_exactly:
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
				else {
					if ( _cnt31>=1 ) { break _loop31; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt31++;
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				issimplerule=true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		return issimplerule;
	}
	
	public final void dot() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			match(DOT);
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_8);
			} else {
			  throw ex;
			}
		}
	}
	
	public final boolean  isClaim() throws RecognitionException, TokenStreamException {
		boolean isclaim;
		
		
		isclaim = false;
		
		
		try {      // for error handling
			{
			{
			switch ( LA(1)) {
			case LITERAL_It:
			{
				match(LITERAL_It);
				break;
			}
			case LITERAL_it:
			{
				match(LITERAL_it);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(WS);
			match(LITERAL_is);
			match(WS);
			{
			switch ( LA(1)) {
			case LITERAL_obligatory:
			{
				match(LITERAL_obligatory);
				break;
			}
			case LITERAL_prohibited:
			{
				match(LITERAL_prohibited);
				break;
			}
			case LITERAL_necessary:
			{
				match(LITERAL_necessary);
				break;
			}
			case LITERAL_impossible:
			{
				match(LITERAL_impossible);
				break;
			}
			case LITERAL_possible:
			{
				match(LITERAL_possible);
				break;
			}
			case LITERAL_permitted:
			{
				match(LITERAL_permitted);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(WS);
			match(LITERAL_that);
			}
			{// TODO VERIFICA DI MAURIZIO 
				//match(WS);
			}
			if ( inputState.guessing==0 ) {
				isclaim = true;
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
		return isclaim;
	}
	
	public final boolean  isKeyword() throws RecognitionException, TokenStreamException {
		boolean iskey;
		
		
		iskey = false;
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_A:
			case LITERAL_a:
			{
				{
				{
				switch ( LA(1)) {
				case LITERAL_A:
				{
					match(LITERAL_A);
					break;
				}
				case LITERAL_a:
				{
					match(LITERAL_a);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				match(WS);
				match(LITERAL_given);
				}
				break;
			}
			case LITERAL_The:
			case LITERAL_the:
			{
				{
				{
				switch ( LA(1)) {
				case LITERAL_The:
				{
					match(LITERAL_The);
					break;
				}
				case LITERAL_the:
				{
					match(LITERAL_the);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				match(WS);
				match(LITERAL_set);
				match(WS);
				match(LITERAL_of);
				match(WS);
				match(LITERAL_each);
				}
				break;
			}
			case LITERAL_Another:
			{
				match(LITERAL_Another);
				break;
			}
			case LITERAL_another:
			{
				match(LITERAL_another);
				break;
			}
			case LITERAL_Who:
			{
				match(LITERAL_Who);
				break;
			}
			case LITERAL_who:
			{
				match(LITERAL_who);
				break;
			}
			case LITERAL_What:
			{
				match(LITERAL_What);
				break;
			}
			case LITERAL_what:
			{
				match(LITERAL_what);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{// TODO VERIFICA DI MAURIZIO 
				//match(WS);
			}
			if ( inputState.guessing==0 ) {
				iskey = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_9);
			} else {
			  throw ex;
			}
		}
		return iskey;
	}
	
	public final boolean  isQuantification() throws RecognitionException, TokenStreamException {
		boolean isq;
		
		
		isq = false;
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_Each:
			{
				match(LITERAL_Each);
				break;
			}
			case LITERAL_each:
			{
				match(LITERAL_each);
				break;
			}
			case LITERAL_Some:
			{
				match(LITERAL_Some);
				break;
			}
			case LITERAL_some:
			{
				match(LITERAL_some);
				break;
			}
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				{
				boolean synPredMatched90 = false;
				if (((_tokenSet_10.member(LA(1))))) {
					int _m90 = mark();
					synPredMatched90 = true;
					inputState.guessing++;
					try {
						{
						quantification2();
						match(WS);
						isConjunction();
						quantification2();
						}
					}
					catch (RecognitionException pe) {
						synPredMatched90 = false;
					}
					rewind(_m90);
					inputState.guessing--;
				}
				if ( synPredMatched90 ) {
					{
					quantification2();
					match(WS);
					isConjunction();
					quantification2();
					}
				}
				else if ((_tokenSet_10.member(LA(1)))) {
					quantification2();
				}
				else {
					throw new NoViableAltException(LT(1), getFilename());
				}
				
				}
				break;
			}
			case LITERAL_More:
			case LITERAL_more:
			{
				{
				{
				switch ( LA(1)) {
				case LITERAL_More:
				{
					match(LITERAL_More);
					break;
				}
				case LITERAL_more:
				{
					match(LITERAL_more);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				match(WS);
				match(LITERAL_than);
				match(WS);
				match(LITERAL_one);
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{// TODO VERIFICA DI MAURIZIO 
				//match(WS);
			}
			if ( inputState.guessing==0 ) {
				//System.out.println("-- Quantification found");
			}
			if ( inputState.guessing==0 ) {
				isq = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_9);
			} else {
			  throw ex;
			}
		}
		return isq;
	}
	
	public final boolean  isQuantification2() throws RecognitionException, TokenStreamException {
		boolean isq;
		
		
		isq = false;
		
		
		try {      // for error handling
			
			switch ( LA(1)) {
			case LITERAL_Each:
			case LITERAL_each:
			case LITERAL_Some:
			case LITERAL_some:
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			case LITERAL_More:
			case LITERAL_more:
			case LITERAL_least:
			case LITERAL_most:
			{
				consume();
				isq = true;
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
				recover(ex,_tokenSet_9);
			} else {
			  throw ex;
			}
		}
		return isq;
	}
	
	public final boolean  isArticle() throws RecognitionException, TokenStreamException {
		boolean isarticle;
		
		
		isarticle = false;
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_The:
			{
				match(LITERAL_The);
				break;
			}
			case LITERAL_the:
			{
				match(LITERAL_the);
				break;
			}
			case LITERAL_A:
			{
				match(LITERAL_A);
				break;
			}
			case LITERAL_a:
			{
				match(LITERAL_a);
				break;
			}
			case LITERAL_An:
			{
				match(LITERAL_An);
				break;
			}
			case LITERAL_an:
			{
				match(LITERAL_an);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
				// TODO VERIFICA DI MAURIZIO 
				//match(WS);
			}
			if ( inputState.guessing==0 ) {
				isarticle = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_9);
			} else {
			  throw ex;
			}
		}
		return isarticle;
	}
	
	public final boolean  isConcept() throws RecognitionException, TokenStreamException {
		boolean isconcept;
		
		Token  s = null;
		
		isconcept = false;
		
		
		try {      // for error handling
			s = LT(1);
			match(SIGNIFIER);
			if ( inputState.guessing==0 ) {
				logger.parser("concept: " + s.getText());
			}
			{// TODO VERIFICA DI MAURIZIO 
			/*switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			case LITERAL_The:
			case LITERAL_the:
			case LITERAL_A:
			case LITERAL_a:
			case LITERAL_An:
			case LITERAL_an:
			case QUOTE:
			case NUMBER:
			case LITERAL_that:
			case LITERAL_which:
			case LITERAL_and:
			case 31:
			case LITERAL_or:
			case LITERAL_It:
			case LITERAL_it:
			case DOT:
			case LITERAL_each:
			case LITERAL_Another:
			case LITERAL_another:
			case LITERAL_Who:
			case LITERAL_who:
			case LITERAL_What:
			case LITERAL_what:
			case LITERAL_Each:
			case LITERAL_Some:
			case LITERAL_some:
			case LITERAL_More:
			case LITERAL_more:
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}*/
			}
			if ( inputState.guessing==0 ) {
				isconcept = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_11);
			} else {
			  throw ex;
			}
		}
		return isconcept;
	}
	
	public final boolean  isIndividualConcept() throws RecognitionException, TokenStreamException {
		boolean isindconcept;
		
		
		isindconcept = false;
		
		
		try {      // for error handling
			match(ICSIGNIFIER);
			{// TODO VERIFICA DI MAURIZIO 		
			/*switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			case LITERAL_The:
			case LITERAL_the:
			case LITERAL_A:
			case LITERAL_a:
			case LITERAL_An:
			case LITERAL_an:
			case QUOTE:
			case NUMBER:
			case LITERAL_that:
			case LITERAL_which:
			case LITERAL_and:
			case 31:
			case LITERAL_or:
			case LITERAL_It:
			case LITERAL_it:
			case DOT:
			case LITERAL_each:
			case LITERAL_Another:
			case LITERAL_another:
			case LITERAL_Who:
			case LITERAL_who:
			case LITERAL_What:
			case LITERAL_what:
			case LITERAL_Each:
			case LITERAL_Some:
			case LITERAL_some:
			case LITERAL_More:
			case LITERAL_more:
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}*/
			}
			if ( inputState.guessing==0 ) {
				isindconcept = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_11);
			} else {
			  throw ex;
			}
		}
		return isindconcept;
	}
	
	public final boolean  isText() throws RecognitionException, TokenStreamException {
		boolean istext;
		
		
		istext = false;
		
		
		try {      // for error handling
			match(QUOTE);
			match(ICSIGNIFIER);
			match(QUOTE);
			{// TODO VERIFICA DI MAURIZIO 
			/*switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			case LITERAL_The:
			case LITERAL_the:
			case LITERAL_A:
			case LITERAL_a:
			case LITERAL_An:
			case LITERAL_an:
			case LITERAL_that:
			case LITERAL_which:
			case LITERAL_and:
			case 31:
			case LITERAL_or:
			case LITERAL_It:
			case LITERAL_it:
			case DOT:
			case LITERAL_each:
			case LITERAL_Another:
			case LITERAL_another:
			case LITERAL_Who:
			case LITERAL_who:
			case LITERAL_What:
			case LITERAL_what:
			case LITERAL_Each:
			case LITERAL_Some:
			case LITERAL_some:
			case LITERAL_More:
			case LITERAL_more:
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}*/
			}
			if ( inputState.guessing==0 ) {
				istext = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_12);
			} else {
			  throw ex;
			}
		}
		return istext;
	}
	
	public final boolean  isNumber() throws RecognitionException, TokenStreamException {
		boolean isnumber;
		
		
		isnumber = false;
		
		try{
			
			switch ( LA(1)) {
			case LITERAL_one:
			{
				match(LITERAL_one);
				break;
			}
			case NUMBER:
			{
				num();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			
			
			if ( inputState.guessing==0 ) {
				isnumber = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_12);
			} else {
			  throw ex;
			}
		}
		return isnumber;
	}
	
	public final boolean  isPronoun() throws RecognitionException, TokenStreamException {
		boolean ispronoun;
		
		
		ispronoun = false;
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_that:
			{
				match(LITERAL_that);
				break;
			}
			case LITERAL_which:
			{
				match(LITERAL_which);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{// TODO VERIFICA DI MAURIZIO 
			/*switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}*/
			}
			if ( inputState.guessing==0 ) {
				ispronoun = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_13);
			} else {
			  throw ex;
			}
		}
		return ispronoun;
	}
	
	public final boolean  isComparator() throws RecognitionException, TokenStreamException {
		boolean iscomparator;
		
		
		iscomparator = false;
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_is_not_greater_than:
			{
				match(LITERAL_is_not_greater_than);
				break;
			}
			case LITERAL_is_greater_than:
			{
				match(LITERAL_is_greater_than);
				break;
			}
			case LITERAL_is_not_less_than:
			{
				match(LITERAL_is_not_less_than);
				break;
			}
			case LITERAL_is_less_than:
			{
				match(LITERAL_is_less_than);
				break;
			}
			case LITERAL_equals:
			{
				match(LITERAL_equals);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				iscomparator = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_15);
			} else {
			  throw ex;
			}
		}
		return iscomparator;
	}
	
	public final boolean  isObjectComparator() throws RecognitionException, TokenStreamException {
		boolean iscomparator;
		
		
		iscomparator = false;
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_is:
			{
				match(LITERAL_is);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				iscomparator = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_15);
			} else {
			  throw ex;
			}
		}
		return iscomparator;
	}
	
	public final boolean  isClause() throws RecognitionException, TokenStreamException {
		boolean isclause;
		
		
		isclause = false;
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_if:
			{
				match(LITERAL_if);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				isclause = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_15);
			} else {
			  throw ex;
			}
		}
		return isclause;
	}
	
	public final boolean  isPredicate() throws RecognitionException, TokenStreamException {
		boolean ispredicate;
		
		Token  s = null;
		
		ispredicate = false;
		
		
		try {      // for error handling
			s = LT(1);
			match(SIGNIFIER);
			if ( inputState.guessing==0 ) {
				logger.parser("predicate: " + s.getText());
			}
			{// TODO VERIFICA DI MAURIZIO 
			/*switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			case ICSIGNIFIER:
			case LITERAL_The:
			case LITERAL_the:
			case LITERAL_A:
			case LITERAL_a:
			case LITERAL_An:
			case LITERAL_an:
			case LITERAL_each:
			case LITERAL_Each:
			case LITERAL_Some:
			case LITERAL_some:
			case LITERAL_More:
			case LITERAL_more:
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}*/
			}
			if ( inputState.guessing==0 ) {
				ispredicate = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_14);
			} else {
			  throw ex;
			}
		}
		return ispredicate;
	}
	
	public final boolean  isConjunction() throws RecognitionException, TokenStreamException {
		boolean isconj;
		
		
		isconj = false;
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_and:
			{
				match(LITERAL_and);
				break;
			}
			case 31:
			{
				match(31);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{// TODO VERIFICA DI MAURIZIO 
			/*switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			case LITERAL_The:
			case LITERAL_the:
			case LITERAL_A:
			case LITERAL_a:
			case LITERAL_An:
			case LITERAL_an:
			case LITERAL_that:
			case LITERAL_which:
			case LITERAL_It:
			case LITERAL_it:
			case DOT:
			case LITERAL_each:
			case LITERAL_Another:
			case LITERAL_another:
			case LITERAL_Who:
			case LITERAL_who:
			case LITERAL_What:
			case LITERAL_what:
			case LITERAL_Each:
			case LITERAL_Some:
			case LITERAL_some:
			case LITERAL_More:
			case LITERAL_more:
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}*/
			}
			if ( inputState.guessing==0 ) {
				isconj = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_15);
			} else {
			  throw ex;
			}
		}
		return isconj;
	}
	
	public final boolean  isDisjunction() throws RecognitionException, TokenStreamException {
		boolean isdisj;
		
		
		isdisj = false;
		
		
		try {      // for error handling
			match(LITERAL_or);
			{
			// TODO VERIFICA DI MAURIZIO 
				//match(WS);
			}
			if ( inputState.guessing==0 ) {
				isdisj = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_15);
			} else {
			  throw ex;
			}
		}
		return isdisj;
	}
	
	public final boolean  isAttribute() throws RecognitionException, TokenStreamException {
		boolean isatt;
		
		isatt = false;
		
		
		try {      // for error handling
			isCaption();
			{
			int _cnt48=0;
			_loop48:
			do {
				if ((LA(1)==SIGNIFIER)) {
					match(SIGNIFIER);
					{
					switch ( LA(1)) {
					case WS:
					{
						match(WS);
						break;
					}
					case NEWLINE:
					case SIGNIFIER:
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
				else {
					if ( _cnt48>=1 ) { break _loop48; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt48++;
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				isatt = true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		return isatt;
	}
	
	public final boolean  isCaption() throws RecognitionException, TokenStreamException {
		boolean iscaption;
		
		
		iscaption=false;
		
		
		try {      // for error handling
			isLabel();
			match(SEPARATOR);
			{
			switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
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
				iscaption=true;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_13);
			} else {
			  throw ex;
			}
		}
		return iscaption;
	}
	
	public final boolean  isLabel() throws RecognitionException, TokenStreamException {
		boolean islabel;
		
		
		islabel=false;
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_Name:
			{
				match(LITERAL_Name);
				if ( inputState.guessing==0 ) {
					islabel=true;
				}
				break;
			}
			case LITERAL_Guidance:
			{
				{
				match(LITERAL_Guidance);
				match(WS);
				match(LITERAL_Type);
				}
				if ( inputState.guessing==0 ) {
					islabel=true;
				}
				break;
			}
			case LITERAL_Description:
			{
				match(LITERAL_Description);
				if ( inputState.guessing==0 ) {
					islabel=true;
				}
				break;
			}
			case LITERAL_Source:
			{
				match(LITERAL_Source);
				if ( inputState.guessing==0 ) {
					islabel=true;
				}
				break;
			}
			case LITERAL_Note:
			{
				match(LITERAL_Note);
				if ( inputState.guessing==0 ) {
					islabel=true;
				}
				break;
			}
			case LITERAL_Example:
			{
				match(LITERAL_Example);
				if ( inputState.guessing==0 ) {
					islabel=true;
				}
				break;
			}
			case LITERAL_Synonymuos:
			{
				{
				match(LITERAL_Synonymuos);
				match(WS);
				match(LITERAL_Form);
				}
				if ( inputState.guessing==0 ) {
					islabel=true;
				}
				break;
			}
			case LITERAL_Enforcement:
			{
				{
				match(LITERAL_Enforcement);
				match(WS);
				match(LITERAL_Level);
				}
				if ( inputState.guessing==0 ) {
					islabel=true;
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
				recover(ex,_tokenSet_17);
			} else {
			  throw ex;
			}
		}
		return islabel;
	}
	
	
	public final boolean isRulesetKeyword() throws RecognitionException, TokenStreamException {
		
		boolean isRulesetKeyword = false;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_ruleset:
			{
				match(LITERAL_ruleset);
				if ( inputState.guessing==0 ) {
					isRulesetKeyword=true;
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
				recover(ex,_tokenSet_17);
			} else {
			  throw ex;
			}
		}
		return isRulesetKeyword;
		
	}
	
	public final String  getText() throws RecognitionException, TokenStreamException {
		String text;
		
		Token  s = null;
		
		text="";
		
		
		try {      // for error handling
			match(QUOTE);
			s = LT(1);
			match(ICSIGNIFIER);
			if ( inputState.guessing==0 ) {
				text=s.getText();
			}
			match(QUOTE);
			{
			switch ( LA(1)) {
			case WS:
			{// TODO VERIFICA DI MAURIZIO 
				//match(WS);
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
				recover(ex,_tokenSet_1);
			} else {
			  throw ex;
			}
		}
		return text;
	}
	
	public final void num() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			match(NUMBER);
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void quantification2() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_At:
			case LITERAL_at:
			{
				{
				{
				switch ( LA(1)) {
				case LITERAL_At:
				{
					match(LITERAL_At);
					break;
				}
				case LITERAL_at:
				{
					match(LITERAL_at);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				match(WS);
				{
				switch ( LA(1)) {
				case LITERAL_least:
				{
					match(LITERAL_least);
					break;
				}
				case LITERAL_most:
				{
					match(LITERAL_most);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				}
				break;
			}
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				{
				switch ( LA(1)) {
				case LITERAL_Exaclty:
				{
					match(LITERAL_Exaclty);
					break;
				}
				case LITERAL_exactly:
				{
					match(LITERAL_exactly);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(WS);
			{
			switch ( LA(1)) {
			case LITERAL_one:
			{
				match(LITERAL_one);
				break;
			}
			case NUMBER:
			{
				num();
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
				recover(ex,_tokenSet_19);
			} else {
			  throw ex;
			}
		}
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"WS",
		"NEWLINE",
		"SIGNIFIER",
		"ICSIGNIFIER",
		"SEPARATOR",
		"\"Name\"",
		"\"Guidance\"",
		"\"Type\"",
		"\"Description\"",
		"\"Source\"",
		"\"Note\"",
		"\"Example\"",
		"\"Synonymuos\"",
		"\"Form\"",
		"\"Enforcement\"",
		"\"Level\"",
		"\"The\"",
		"\"the\"",
		"\"A\"",
		"\"a\"",
		"\"An\"",
		"\"an\"",
		"QUOTE",
		"NUMBER",
		"\"that\"",
		"\"which\"",
		"\"and\"",
		"\",\"",
		"\"or\"",
		"\"It\"",
		"\"it\"",
		"\"is\"",
		"\"obligatory\"",
		"\"prohibited\"",
		"\"necessary\"",
		"\"impossible\"",
		"\"possible\"",
		"\"permitted\"",
		"DOT",
		"\"given\"",
		"\"set\"",
		"\"of\"",
		"\"each\"",
		"\"Another\"",
		"\"another\"",
		"\"Who\"",
		"\"who\"",
		"\"What\"",
		"\"what\"",
		"\"Each\"",
		"\"Some\"",
		"\"some\"",
		"\"More\"",
		"\"more\"",
		"\"than\"",
		"\"one\"",
		"\"At\"",
		"\"at\"",
		"\"least\"",
		"\"most\"",
		"\"Exaclty\"",
		"\"exactly\""
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 3746924547063939072L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 3746924547064329746L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 390672L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 3746924547063939074L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 8866461782114304L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 3738058059527749632L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 3746928945110450176L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { 48L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { 192L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = { 3458764513820540928L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {
		long[] data = { 3746928953633275968L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	private static final long[] mk_tokenSet_12() {
		long[] data = { 3746928953431949376L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
	private static final long[] mk_tokenSet_13() {
		long[] data = { 64L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_13 = new BitSet(mk_tokenSet_13());
	private static final long[] mk_tokenSet_14() {
		long[] data = { 3738058059527749824L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_14 = new BitSet(mk_tokenSet_14());
	private static final long[] mk_tokenSet_15() {
		long[] data = { 3746928945915756608L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_15 = new BitSet(mk_tokenSet_15());
	private static final long[] mk_tokenSet_16() {
		long[] data = { 32L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_16 = new BitSet(mk_tokenSet_16());
	private static final long[] mk_tokenSet_17() {
		long[] data = { 256L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_17 = new BitSet(mk_tokenSet_17());
	private static final long[] mk_tokenSet_18() {
		long[] data = { 3746928953431949392L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_18 = new BitSet(mk_tokenSet_18());
	private static final long[] mk_tokenSet_19() {
		long[] data = { 16L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_19 = new BitSet(mk_tokenSet_19());
	
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
