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
// $ANTLR 2.7.5 (20050128): "ruleset.g" -> "RuleSetLexer.java"$
/*
 * Modified 2009.11.11 by Vetis project
 */

package org.dbe.businessModeller.ruleset.enterprise.grammar;

import java.io.InputStream;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.TokenStreamRecognitionException;
import antlr.CharStreamException;
import antlr.CharStreamIOException;
import java.io.Reader;
import java.util.Hashtable;
import antlr.InputBuffer;
import antlr.ByteBuffer;
import antlr.CharBuffer;
import antlr.Token;
import antlr.RecognitionException;
import antlr.NoViableAltForCharException;
import antlr.TokenStream;
import antlr.ANTLRHashString;
import antlr.LexerSharedInputState;

public class RuleSetLexer extends antlr.CharScanner implements RuleSetParserTokenTypes, TokenStream
 {
public RuleSetLexer(InputStream in) {
	this(new ByteBuffer(in));
}
public RuleSetLexer(Reader in) {
	this(new CharBuffer(in));
}
public RuleSetLexer(InputBuffer ib) {
	this(new LexerSharedInputState(ib));
}
public RuleSetLexer(LexerSharedInputState state) {
	super(state);
	caseSensitiveLiterals = true;
	setCaseSensitive(true);
	literals = new Hashtable();
	literals.put(new ANTLRHashString("Note", this), new Integer(14));
	literals.put(new ANTLRHashString("that", this), new Integer(28));
	literals.put(new ANTLRHashString("a", this), new Integer(23));
	literals.put(new ANTLRHashString("Name", this), new Integer(9));
	literals.put(new ANTLRHashString("Source", this), new Integer(13));
	literals.put(new ANTLRHashString("Guidance", this), new Integer(10));
	literals.put(new ANTLRHashString("An", this), new Integer(24));
	literals.put(new ANTLRHashString("one", this), new Integer(59));
	literals.put(new ANTLRHashString("Exaclty", this), new Integer(64));
	literals.put(new ANTLRHashString("At", this), new Integer(60));
	literals.put(new ANTLRHashString("what", this), new Integer(52));
	literals.put(new ANTLRHashString("It", this), new Integer(33));
	literals.put(new ANTLRHashString("another", this), new Integer(48));
	literals.put(new ANTLRHashString(",", this), new Integer(31));
	literals.put(new ANTLRHashString("prohibited", this), new Integer(37));
	literals.put(new ANTLRHashString("which", this), new Integer(29));
	literals.put(new ANTLRHashString("necessary", this), new Integer(38));
	literals.put(new ANTLRHashString("Synonymuos", this), new Integer(16));
	literals.put(new ANTLRHashString("Some", this), new Integer(54));
	literals.put(new ANTLRHashString("of", this), new Integer(45));
	literals.put(new ANTLRHashString("least", this), new Integer(62));
	literals.put(new ANTLRHashString("obligatory", this), new Integer(36));
	literals.put(new ANTLRHashString("an", this), new Integer(25));
	literals.put(new ANTLRHashString("A", this), new Integer(22));
	literals.put(new ANTLRHashString("Enforcement", this), new Integer(18));
	literals.put(new ANTLRHashString("at", this), new Integer(61));
	literals.put(new ANTLRHashString("More", this), new Integer(56));
	literals.put(new ANTLRHashString("impossible", this), new Integer(39));
	literals.put(new ANTLRHashString("or", this), new Integer(32));
	literals.put(new ANTLRHashString("Example", this), new Integer(15));
	literals.put(new ANTLRHashString("it", this), new Integer(34));
	literals.put(new ANTLRHashString("some", this), new Integer(55));
	literals.put(new ANTLRHashString("Each", this), new Integer(53));
	literals.put(new ANTLRHashString("permitted", this), new Integer(41));
	literals.put(new ANTLRHashString("most", this), new Integer(63));
	literals.put(new ANTLRHashString("more", this), new Integer(57));
	literals.put(new ANTLRHashString("possible", this), new Integer(40));
	literals.put(new ANTLRHashString("Who", this), new Integer(49));
	literals.put(new ANTLRHashString("and", this), new Integer(30));
	literals.put(new ANTLRHashString("Level", this), new Integer(19));
	literals.put(new ANTLRHashString("The", this), new Integer(20));
	literals.put(new ANTLRHashString("Form", this), new Integer(17));
	literals.put(new ANTLRHashString("Another", this), new Integer(47));
	literals.put(new ANTLRHashString("Description", this), new Integer(12));
	literals.put(new ANTLRHashString("is", this), new Integer(35));
	literals.put(new ANTLRHashString("who", this), new Integer(50));
	literals.put(new ANTLRHashString("exactly", this), new Integer(65));
	literals.put(new ANTLRHashString("Type", this), new Integer(11));
	literals.put(new ANTLRHashString("each", this), new Integer(46));
	literals.put(new ANTLRHashString("the", this), new Integer(21));
	literals.put(new ANTLRHashString("What", this), new Integer(51));
	literals.put(new ANTLRHashString("than", this), new Integer(58));
	literals.put(new ANTLRHashString("set", this), new Integer(44));
	literals.put(new ANTLRHashString("given", this), new Integer(43));
	
	literals.put(new ANTLRHashString("is_not_greater_than", this), new Integer(70));
	literals.put(new ANTLRHashString("is_greater_than", this), new Integer(71));
	literals.put(new ANTLRHashString("is_not_less_than", this), new Integer(72));
	literals.put(new ANTLRHashString("is_less_than", this), new Integer(73));
	literals.put(new ANTLRHashString("equals", this), new Integer(74));
	
	literals.put(new ANTLRHashString("if", this), new Integer(80));
	
	literals.put(new ANTLRHashString("-", this), new Integer(90));
	literals.put(new ANTLRHashString("Ruleset", this), new Integer(91));
	
	// for rule templates
	literals.put(new ANTLRHashString("[f]", this), new Integer(100));
}

public Token nextToken() throws TokenStreamException {
	Token theRetToken=null;
tryAgain:
	for (;;) {
		Token _token = null;
		int _ttype = Token.INVALID_TYPE;
		resetText();
		try {   // for char stream error handling
			try {   // for lexical error handling
				switch ( LA(1)) {
				case '-':  case '_':  case 'a':  case 'b':
				case 'c':  case 'd':  case 'e':  case 'f':
				case 'g':  case 'h':  case 'i':  case 'j':
				case 'k':  case 'l':  case 'm':  case 'n':
				case 'o':  case 'p':  case 'q':  case 'r':
				case 's':  case 't':  case 'u':  case 'v':
				case 'w':  case 'x':  case 'y':  case 'z':
				case ';':  case ',':  case '"':  case '(':  case ')': case '/': case '[': case ']':
				{
					mSIGNIFIER(true);
					theRetToken=_returnToken;
					break;
				}
				case 'A':  case 'B':  case 'C':  case 'D':
				case 'E':  case 'F':  case 'G':  case 'H':
				case 'I':  case 'J':  case 'K':  case 'L':
				case 'M':  case 'N':  case 'O':  case 'P':
				case 'Q':  case 'R':  case 'S':  case 'T':
				case 'U':  case 'V':  case 'W':  case 'X':
				case 'Y':  case 'Z':
				{
					mICSIGNIFIER(true);
					theRetToken=_returnToken;
					break;
				}
				case '\t':  case ' ':
				{
					mWS(true);
					theRetToken=_returnToken;
					break;
				}
				case '\n':  case '\r':
				{
					mNEWLINE(true);
					theRetToken=_returnToken;
					break;
				}
				case '0':  case '1':  case '2':  case '3':
				case '4':  case '5':  case '6':  case '7':
				case '8':  case '9':
				{
					mNUMBER(true);
					theRetToken=_returnToken;
					break;
				}
				case '\'':
				{
					mQUOTE(true);
					theRetToken=_returnToken;
					break;
				}
				case '.':
				{
					mDOT(true);
					theRetToken=_returnToken;
					break;
				}
				case ':':
				{
					mSEPARATOR(true);
					theRetToken=_returnToken;
					break;
				}
				default:
				{
					if (LA(1)==EOF_CHAR) {uponEOF(); _returnToken = makeToken(Token.EOF_TYPE);}
				else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
				}
				}
				if ( _returnToken==null ) continue tryAgain; // found SKIP token
				_ttype = _returnToken.getType();
				_ttype = testLiteralsTable(_ttype);
				_returnToken.setType(_ttype);
				return _returnToken;
			}
			catch (RecognitionException e) {
				throw new TokenStreamRecognitionException(e);
			}
		}
		catch (CharStreamException cse) {
			if ( cse instanceof CharStreamIOException ) {
				throw new TokenStreamIOException(((CharStreamIOException)cse).io);
			}
			else {
				throw new TokenStreamException(cse.getMessage());
			}
		}
	}
}

	public final void mSIGNIFIER(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SIGNIFIER;
		int _saveIndex;
		
		{
		int _cnt102=0;
		_loop102:
		do {
			switch ( LA(1)) {
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':
			{
				matchRange('a','z');
				break;
			}
			case '-':
			{
				match('-');
				break;
			}
			case '_':
			{
				match('_');
				break;
			}
			case ';':
			{
				match(';');
				break;
			}
			case ',':
			{
				match(',');
				break;
			}
			case '"':
			{
				match('"');
				break;
			}
			case '(':
			{
				match('(');
				break;
			}
			case ')':
			{
				match(')');
				break;
			}
			case '/':
			{
				match('/');
				break;
			}
			case '[':
			{
				match('[');
				break;
			}
			case ']':
			{
				match(']');
				break;
			}
			default:
			{
				if ( _cnt102>=1 ) { break _loop102; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			}
			_cnt102++;
		} while (true);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mICSIGNIFIER(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ICSIGNIFIER;
		int _saveIndex;
		
		{
		matchRange('A','Z');
		}
		{
		_loop106:
		do {
			switch ( LA(1)) {
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':
			{
				matchRange('a','z');
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				matchRange('0','9');
				break;
			}
			case '-':
			{
				match('-');
				break;
			}
			case '_':
			{
				match('_');
				break;
			}
			case ';':
			{
				match(';');
				break;
			}
			case ',':
			{
				match(',');
				break;
			}
			case '"':
			{
				match('"');
				break;
			}
			case '(':
			{
				match('(');
				break;
			}
			case ')':
			{
				match(')');
				break;
			}
			case '/':
			{
				match('/');
				break;
			}
			case 'A':  case 'B':  case 'C':  case 'D':
			case 'E':  case 'F':  case 'G':  case 'H':
			case 'I':  case 'J':  case 'K':  case 'L':
			case 'M':  case 'N':  case 'O':  case 'P':
			case 'Q':  case 'R':  case 'S':  case 'T':
			case 'U':  case 'V':  case 'W':  case 'X':
			case 'Y':  case 'Z':
			{
				matchRange('A','Z');
				break;
			}
			default:
			{
				break _loop106;
			}
			}
		} while (true);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mWS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = WS;
		int _saveIndex;
		
		{
		int _cnt109=0;
		_loop109:
		do {
			switch ( LA(1)) {
			case ' ':
			{
				match(' ');
				break;
			}
			case '\t':
			{
				match('\t');
				break;
			}
			default:
			{
				if ( _cnt109>=1 ) { break _loop109; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			}
			_cnt109++;
		} while (true);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNEWLINE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NEWLINE;
		int _saveIndex;
		
		switch ( LA(1)) {
		case '\r':
		{
			match('\r');
			match('\n');
			break;
		}
		case '\n':
		{
			match('\n');
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNUMBER(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NUMBER;
		int _saveIndex;
		
		{
		int _cnt113=0;
		_loop113:
		do {
			if (((LA(1) >= '0' && LA(1) <= '9'))) {
				matchRange('0','9');
			}
			else {
				if ( _cnt113>=1 ) { break _loop113; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			
			_cnt113++;
		} while (true);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mQUOTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = QUOTE;
		int _saveIndex;
		
		match('\'');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DOT;
		int _saveIndex;
		
		match('.');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSEPARATOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SEPARATOR;
		int _saveIndex;
		
		match(':');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	
	
	}
