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
 * Creato il 8-nov-2005
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.vocabulary.ui.editors;

import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.TextEditorAction;

public class VocabularyOneEntryAction extends TextEditorAction {

	public VocabularyOneEntryAction() {
		super(VocabularyEditorMessages.getResourceBundle(), "VocabularyOneEntryAction.", null); //$NON-NLS-1$
		update();
	}
	
	public void run() {
		ITextEditor editor= getTextEditor();
		editor.resetHighlightRange();
		boolean show= editor.showsHighlightRangeOnly();
		setChecked(!show);
		editor.showHighlightRangeOnly(!show);
	}
	
	public void update() {
		setChecked(getTextEditor() != null && getTextEditor().showsHighlightRangeOnly());
		setEnabled(true);
	}
}
