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
 * Creato il 18-ott-2005
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.vocabulary.utils;

import java.util.Comparator;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;

/**
 * @author Pierpaolo Cira
 *
 */
public class VocabularyEntriesComparator implements Comparator {

	/* (non Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Object arg0, Object arg1) {
		VocabularyEntry vocabularyEntry0 = (VocabularyEntry)arg0;
		VocabularyEntry vocabularyEntry1 = (VocabularyEntry)arg1;
		String primRep0 = vocabularyEntry0.getPrimaryRepresentation().toString();
		String primRep1 = vocabularyEntry1.getPrimaryRepresentation().toString();
		return primRep0.compareToIgnoreCase(primRep1);
	}

}
