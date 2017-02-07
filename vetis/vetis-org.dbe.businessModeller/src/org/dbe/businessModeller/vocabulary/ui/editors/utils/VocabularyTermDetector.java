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

import org.eclipse.jface.text.rules.IWordDetector;

public class VocabularyTermDetector implements IWordDetector {

	public boolean isWordStart(char c) {
		return Character.isLowerCase(c);
	}

	public boolean isWordPart(char c) {
		// TODO PP: Controllare return (Character.isLetter(c) || c=='_');
		// return Character.isLetter(c);
		return (Character.isLetter(c) || c=='_');
	}
}
