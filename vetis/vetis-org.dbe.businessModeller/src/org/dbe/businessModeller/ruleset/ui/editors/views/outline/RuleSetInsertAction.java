/*******************************************************************************
 * Copyright (c) 2009 Vetis.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://opensource.org/licenses/eclipse-1.0.php

 * Author:
 *	KTU  Department of Information Systems, http://www.isd.ktu.lt
 *
 *******************************************************************************/
package org.dbe.businessModeller.ruleset.ui.editors.views.outline;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.texteditor.ITextEditor;

public class RuleSetInsertAction extends Action{

	public RuleSetInsertAction() {
		
	}
	
	/**
	 * Ruleset inserter
	 * @param offset
	 * @param moveCursorOffset
	 * @param textEditor
	 * @param text
	 */
	public void insertNewRuleset(int offset, int moveCursorOffset, ITextEditor textEditor, String text) {
		try {
			IDocument document = textEditor.getDocumentProvider().getDocument(textEditor.getEditorInput());
			
			// insert new text to document
			document.replace(offset, 0, text);
			
			// set focus to new ruleset
			textEditor.setHighlightRange(moveCursorOffset, 1, true);
			
		} catch (BadLocationException e) {}
	}
}
