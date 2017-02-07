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
 * Creato il 17-feb-2006
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.dictionary.ui;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

public abstract class WordNetContentInserter{
	protected VocabularyEntry vocabularyEntry;
	protected DictionaryWordTO dictionaryWord;
	protected VocabularyDocumentPositionLocator positionLocator;
	protected IDocument document;	
	protected final String lineSeparator = System.getProperty("line.separator");
	
	public void prepareInserter(IDocument document, VocabularyEntry vocabularyEntry, DictionaryWordTO dictionaryWord,
								VocabularyDocumentPositionLocator positionLocator){
		this.vocabularyEntry = vocabularyEntry;
		this.dictionaryWord = dictionaryWord;
		this.positionLocator = positionLocator;
		this.document = document;
	}
	
	public abstract void insert() throws BadLocationException;
}
