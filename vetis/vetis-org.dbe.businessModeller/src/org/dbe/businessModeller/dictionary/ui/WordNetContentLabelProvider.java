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
 * Creato il 11-gen-2006
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.dictionary.ui;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class WordNetContentLabelProvider extends LabelProvider{
	
	public Image getImage(Object obj) {
		Image image = null;
		return image;
	}
	
	public String getText(Object obj){
		String toReturn = "";
		DictionaryWordTO dictionaryWord  = (DictionaryWordTO)obj;
		int numeroParola = dictionaryWord.getCardinalNumber();
		String lemma = dictionaryWord.getLemma();
		String pos = dictionaryWord.getPartOfSpeech();
		if (numeroParola!=0)
			toReturn = toReturn + numeroParola + ". ";
		toReturn = toReturn + lemma + " (" + pos + ")";
		return toReturn;
	}
}
