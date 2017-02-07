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
package org.dbe.businessModeller.dictionary.contentinserter;

import org.dbe.businessModeller.dictionary.ui.WordNetContentInserter;
import org.eclipse.jface.text.BadLocationException;

public class SynonymContentInserter extends WordNetContentInserter {

	public void insert() throws BadLocationException {
		String label = "\tSynonym: ";
		int offset = super.positionLocator.getPositionOfLastLabel();
		String textToInsert = dictionaryWord.getLemma();
		textToInsert = label.concat(textToInsert);
		textToInsert = super.lineSeparator.concat(textToInsert);
		document.replace(offset, 0, textToInsert);
	}

}
