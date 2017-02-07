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
package org.dbe.businessModeller.vocabulary.ui.editors.utils;

public class VocabularyRuleMemory {
	
	private static VocabularyRuleMemory ruleMemory;

	// Ultima riga verifica (può essere FactType o VocabularyAttribute) 
	private static String lastVerified;
	// Ultima parola verificata nella riga
	private static boolean lastWord;
	// Ultima parola verificata nella riga
	private static int numWordFactType;
	// Operazione di parserizzazione
	private static boolean parsed;
	// Tipo di caption
	private static String captionType;
	// Tiene traccia della presenza di un token undefined 
	private static boolean tokenUndefined;
	// Permette di verificare se è necessario creare i markers o meno
	private static boolean updateFoldingStructure;
	// Permette di effettuare il conteggio dell'offset
	private static boolean countable;
	// Conta l'offset
	private static int counter;
	
	public static VocabularyRuleMemory getInstance()
	{
		if (ruleMemory==null)
		{
			ruleMemory = new VocabularyRuleMemory();
		    lastVerified = "none";
		    lastWord = false;
		    parsed = false;
		    numWordFactType = 0;
		    captionType = "none";
		    tokenUndefined = false;
		    updateFoldingStructure = false;
		    counter=0;
		    countable=true;
		}
		return ruleMemory;
	}
	
	public String getLastVerified() {
		return lastVerified;
	}

	public void setLastVerified(String lastVerified) {
		VocabularyRuleMemory.lastVerified = lastVerified;
	}
	
	public boolean isLastWord() {
		return lastWord;
	}

	public void setLastWord(boolean lastWord) {
		VocabularyRuleMemory.lastWord = lastWord;
	}

	public boolean isParsed() {
		return parsed;
	}

	public void setParsed(boolean parsed) {
		VocabularyRuleMemory.parsed = parsed;
	}

	public int getNumWordFactType() {
		return numWordFactType;
	}

	public void setNumWordFactType(int numWordFactType) {
		VocabularyRuleMemory.numWordFactType = numWordFactType;
	}

	public String getCaptionType() {
		return captionType;
	}

	public void setCaptionType(String captionType) {
		VocabularyRuleMemory.captionType = captionType;
	}

	public boolean isTokenUndefined() {
		return tokenUndefined;
	}

	public void setTokenUndefined(boolean tokenUndefined) {
		VocabularyRuleMemory.tokenUndefined = tokenUndefined;
	}

	public boolean isUpdateFoldingStructure() {
		return updateFoldingStructure;
	}

	public void setUpdateFoldingStructure(boolean updateFoldingStructure) {
		VocabularyRuleMemory.updateFoldingStructure = updateFoldingStructure;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		VocabularyRuleMemory.counter = counter;
	}

	public boolean isCountable() {
		return countable;
	}

	public void setCountable(boolean countable) {
		VocabularyRuleMemory.countable = countable;
	}
}
