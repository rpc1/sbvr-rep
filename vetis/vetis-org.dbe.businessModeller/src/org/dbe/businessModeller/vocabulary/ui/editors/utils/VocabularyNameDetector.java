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

public class VocabularyNameDetector implements IWordDetector {

	public boolean isWordStart(char c) {
		return Character.isUpperCase(c);
	}

	public boolean isWordPart(char c) {
		return Character.isLetterOrDigit(c) || c==':' || c=='_';
	}

}
