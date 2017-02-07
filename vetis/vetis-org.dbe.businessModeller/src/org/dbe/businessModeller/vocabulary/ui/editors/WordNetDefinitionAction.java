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
 * Creato il 18-nov-2005
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.vocabulary.ui.editors;

import org.dbe.businessModeller.dictionary.contentinserter.DefinitionContentInserter;
import org.dbe.businessModeller.dictionary.contentprovider.DefinitionContentProvider;
import org.dbe.businessModeller.dictionary.ui.WordNetGeneralAction;

public class WordNetDefinitionAction extends WordNetGeneralAction{
	
	public WordNetDefinitionAction(){
		super();
		super.setText("Ask definition to Wordnet...");
		super.setToolTipText("Ask definition to Wordnet");
		super.wordNetGeneralAsker.setPopupTitle("Ask definition to WordNet");
		super.wordNetGeneralAsker.setPopupNoInfoMessage("No available definition for this Item");
		super.wordNetGeneralAsker.setContentProvider(new DefinitionContentProvider());
		super.wordNetGeneralAsker.setContentInserter(new DefinitionContentInserter());
	}
	
	public void run() {
		super.run();
		super.wordNetGeneralAsker.ask();
	}

}
