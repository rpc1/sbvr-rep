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
package org.dbe.businessModeller.dictionary.contentprovider;

import java.util.ArrayList;

import net.didion.jwnl.data.Synset;
import net.didion.jwnl.data.Word;

import org.dbe.businessModeller.dictionary.ui.DictionaryWordTO;
import org.dbe.businessModeller.vocabulary.enterprise.BMDictionary;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class HypernymContentProvider implements IStructuredContentProvider {
	public Object[] getElements(Object inputElement) {
		ArrayList dictionaryWords = new ArrayList();
		BMDictionary dictionary = BMDictionary.getInstance();
		Synset[] synonimous = dictionary.getHypernyms(inputElement.toString());
		if (synonimous==null) return null;
		try {
			for (int i = 0; i < synonimous.length; i++)
				for (int j = 0; j < synonimous[i].getWords().length;j++){
					Word word = synonimous[i].getWords()[j];
					DictionaryWordTO dictionaryWord = new DictionaryWordTO();
					dictionaryWord.setLemma(word.getLemma());
					dictionaryWord.setPartOfSpeech(word.getPOS().getLabel());
					dictionaryWord.setDefinition(word.getSynset().getGloss());
					dictionaryWords.add(dictionaryWord);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dictionaryWords.toArray();
	}
	
	public void dispose() {
	}
	
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
}
