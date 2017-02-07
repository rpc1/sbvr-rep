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
// $ANTLR 2.7.5 (20050128): "se4.g" -> "VocabularyLexer.java"$
/*
 * Modified 2009.10.10 by Vetis project
 */

package org.dbe.businessModeller.vocabulary.enterprise.grammar;

import org.dbe.businessModeller.XML.XMLElement;

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

public class VocabularyLexer extends antlr.CharScanner implements VocabularyParserTokenTypes, TokenStream
 {
public VocabularyLexer(InputStream in, XMLElement keywords) {
	this(new ByteBuffer(in), keywords);
}
public VocabularyLexer(Reader in, XMLElement keywords) {
	this(new CharBuffer(in), keywords);
}
public VocabularyLexer(InputBuffer ib, XMLElement keywords) {
	this(new LexerSharedInputState(ib), keywords);
}
public VocabularyLexer(LexerSharedInputState state, XMLElement keywords) {
	super(state);
	caseSensitiveLiterals = true;
	setCaseSensitive(true);
	
	// modified 2009 04 16, lithuanian letters added, integer codes modified to comply with VocabuaryValidatorTokenTypes.java
	
	literals = new Hashtable();
	literals.put(new ANTLRHashString(keywords.getContents().get(2).getContents().get(0).getValue(), this), new Integer(14));
	literals.put(new ANTLRHashString(keywords.getContents().get(10).getContents().get(0).getValue(), this), new Integer(13));
	literals.put(new ANTLRHashString(keywords.getContents().get(8).getContents().get(0).getValue(), this), new Integer(22));
	literals.put(new ANTLRHashString(keywords.getContents().get(7).getContents().get(0).getValue(), this), new Integer(20));
	literals.put(new ANTLRHashString(keywords.getContents().get(4).getContents().get(0).getValue(), this), new Integer(21));
	literals.put(new ANTLRHashString(keywords.getContents().get(5).getContents().get(0).getValue(), this), new Integer(18));
	literals.put(new ANTLRHashString(keywords.getContents().get(3).getContents().get(0).getValue(), this), new Integer(15));
	literals.put(new ANTLRHashString(keywords.getContents().get(11).getContents().get(0).getValue(), this), new Integer(9));
	literals.put(new ANTLRHashString(keywords.getContents().get(1).getContents().get(0).getValue(), this), new Integer(11));
	literals.put(new ANTLRHashString(keywords.getContents().get(9).getContents().get(0).getValue(), this), new Integer(12));
	literals.put(new ANTLRHashString(keywords.getContents().get(13).getContents().get(0).getValue(), this), new Integer(16));
	literals.put(new ANTLRHashString(keywords.getContents().get(6).getContents().get(0).getValue(), this), new Integer(19));
	literals.put(new ANTLRHashString(keywords.getContents().get(14).getContents().get(0).getValue(), this), new Integer(17));
	literals.put(new ANTLRHashString(keywords.getContents().get(0).getContents().get(0).getValue(), this), new Integer(8));
	literals.put(new ANTLRHashString(keywords.getContents().get(12).getContents().get(0).getValue(), this), new Integer(10));
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
				case '"':  case '\'': case '/':  case '(':  case ')':
				case ',':  case '-':  case '.':  case ';':
				case '_':  case 'a':  case 'b':  case 'c':
				case 'd':  case 'e':  case 'f':  case 'g':
				case 'h':  case 'i':  case 'j':  case 'k':
				case 'l':  case 'm':  case 'n':  case 'o':
				case 'p':  case 'q':  case 'r':  case 's':
				case 't':  case 'u':  case 'v':  case 'w':
				case 'x':  case 'y':  case 'z':  case '\u00e0': 
				case('ą'): case('č'): case('ę'): case('ė'): // modified 2009 04 16, lithuanian letters added
				case('į'): case('š'): case('ų'): case('ū'):
				case('ž'):
				case '\u00e8':  case '\u00ec':  case '\u00f2':  case '\u00f9':
				{
					mSIGNIFIER(true);
					theRetToken=_returnToken;
					break;
				}
				case '0':  case '1':  case '2':  case '3':
				case '4':  case '5':  case '6':  case '7':
				case '8':  case '9':  case 'A':  case 'B':
				case 'C':  case 'D':  case 'E':  case 'F':
				case 'G':  case 'H':  case 'I':  case 'J':
				case 'K':  case 'L':  case 'M':  case 'N':
				case 'O':  case 'P':  case 'Q':  case 'R':
				case 'S':  case 'T':  case 'U':  case 'V':
				case 'W':  case 'X':  case 'Y':  case 'Z':
				case 'Ą':  case 'Č':  case 'Ę':  case 'Ė': // modified 2009 04 16, lithuanian letters added
				case 'Į':  case 'Š':  case 'Ų':  case 'Ū':
				case 'Ž':
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
		int _cnt43=0;
		_loop43:
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
			// modified 2009 04 16, lithuanian letters added
			case 'ą':
			{
				match('ą');
				break;
			}
			case 'č':
			{
				match('č');
				break;
			}
			case 'ę':
			{
				match('ę');
				break;
			}
			case 'ė':
			{
				match('ė');
				break;
			}
			case 'į':
			{
				match('į');
				break;
			}
			case 'š':
			{
				match('š');
				break;
			}
			case 'ų':
			{
				match('ų');
				break;
			}
			case 'ū':
			{
				match('ū');
				break;
			}
			case 'ž':
			{
				match('ž');
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
			case '\u00e0':
			{
				match('�');
				break;
			}
			case '\u00e8':
			{
				match('�');
				break;
			}
			case '\u00ec':
			{
				match('�');
				break;
			}
			case '\u00f2':
			{
				match('�');
				break;
			}
			case '\u00f9':
			{
				match('�');
				break;
			}
			case '.':
			{
				match('.');
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
			case '\'':
			{
				match('\'');
				break;
			}
			case '/':
			{
				match('/');
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
			default:
			{
				if ( _cnt43>=1 ) { break _loop43; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			}
			_cnt43++;
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
		switch ( LA(1)) {
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
		// modified 2009 04 16, lithuanian letters added
		case 'Ą':
		{
			match('Ą');
			break;
		}
		case 'Č':
		{
			match('Č');
			break;
		}
		case 'Ę':
		{
			match('Ę');
			break;
		}
		case 'Ė':
		{
			match('Ė');
			break;
		}
		case 'Į':
		{
			match('Į');
			break;
		}
		case 'Š':
		{
			match('Š');
			break;
		}
		case 'Ų':
		{
			match('Ų');
			break;
		}
		case 'Ū':
		{
			match('Ū');
			break;
		}
		case 'Ž':
		{
			match('Ž');
			break;
		}
		case '0':  case '1':  case '2':  case '3':
		case '4':  case '5':  case '6':  case '7':
		case '8':  case '9':
		{
			matchRange('0','9');
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		_loop47:
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
			// modified 2009 04 16, lithuanian letters added
			case 'ą':
			{
				match('ą');
				break;
			}
			case 'č':
			{
				match('č');
				break;
			}
			case 'ę':
			{
				match('ę');
				break;
			}
			case 'ė':
			{
				match('ė');
				break;
			}
			case 'į':
			{
				match('į');
				break;
			}
			case 'š':
			{
				match('š');
				break;
			}
			case 'ų':
			{
				match('ų');
				break;
			}
			case 'ū':
			{
				match('ū');
				break;
			}
			case 'ž':
			{
				match('ž');
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
			case '\u00e0':
			{
				match('�');
				break;
			}
			case '\u00e8':
			{
				match('�');
				break;
			}
			case '\u00ec':
			{
				match('�');
				break;
			}
			case '\u00f2':
			{
				match('�');
				break;
			}
			case '\u00f9':
			{
				match('�');
				break;
			}
			default:
			{
				break _loop47;
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
		int _cnt50=0;
		_loop50:
		do {
			switch ( LA(1)) {
			case ' ':
			{
				match(' ');
				_ttype = Token.SKIP;
				break;
			}
			case '\t':
			{
				match('\t');
				_ttype = Token.SKIP;
				break;
			}
			default:
			{
				if ( _cnt50>=1 ) { break _loop50; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			}
			_cnt50++;
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
