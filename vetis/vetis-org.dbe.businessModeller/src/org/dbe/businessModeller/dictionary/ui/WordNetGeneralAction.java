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

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.texteditor.ITextEditor;

public abstract class WordNetGeneralAction extends Action{
	protected ISelectionProvider selectionProvider;
	protected ITextEditor textEditor;
	protected WordNetGeneralRequester wordNetGeneralAsker;
	
	public WordNetGeneralAction(){
		wordNetGeneralAsker = new WordNetGeneralRequester();
		super.setText("Ask to Wordnet...");
		super.setToolTipText("Ask to Wordnet");
	}
	
	public void prepareWordNetAction(ISelectionProvider selectionProvider, 
										ITextEditor textEditor,
										ImageDescriptor imageDescriptor){
		this.selectionProvider = selectionProvider;
		this.textEditor = textEditor;
		super.setImageDescriptor(imageDescriptor);
	}
	
	public void run(){
		wordNetGeneralAsker.setSelectionProvider(this.selectionProvider);
		wordNetGeneralAsker.setTextEditor(this.textEditor);
	}
}
