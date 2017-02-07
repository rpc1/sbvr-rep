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
 * Creato il 2-dic-2005
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.dictionary.ui;

public class DictionaryWordTO {

	private String lemma;
	private String definition;
	private String partOfSpeech;
	private int cardinalNumber;
	
	/**
	 * @return Restituisce pos.
	 */
	public String getPartOfSpeech() {
		return partOfSpeech;
	}
	/**
	 * @param Imposta il valore di pos.
	 */
	public void setPartOfSpeech(String pos) {
		partOfSpeech = pos;
	}
	/**
	 * @return Restituisce definition.
	 */
	public String getDefinition() {
		return definition;
	}
	/**
	 * @param Imposta il valore di definition.
	 */
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	/**
	 * @return Restituisce lemma.
	 */
	public String getLemma() {
		return lemma;
	}
	/**
	 * @param Imposta il valore di lemma.
	 */
	public void setLemma(String lemma) {
		this.lemma = lemma;
	}
	/**
	 * @return Restituisce cardinalNumber.
	 */
	public int getCardinalNumber() {
		return cardinalNumber;
	}
	/**
	 * @param Imposta il valore di cardinalNumber.
	 */
	public void setCardinalNumber(int cardinalNumber) {
		this.cardinalNumber = cardinalNumber;
	}
}
