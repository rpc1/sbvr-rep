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

import org.dbe.businessModeller.dictionary.contentinserter.SynonymContentInserter;
import org.dbe.businessModeller.dictionary.contentprovider.SynonymContentProvider;
import org.dbe.businessModeller.dictionary.ui.WordNetGeneralAction;
import org.dbe.businessModeller.dictionary.ui.WordNetGeneralRequester;

public class WordNetSynonymAction extends WordNetGeneralAction{
	
	public WordNetSynonymAction(){
		super();
		super.setText("Ask synonym to Wordnet...");
		super.setToolTipText("Ask synonym to Wordnet");
		super.wordNetGeneralAsker.setPopupTitle("Ask synonym to WordNet");
		super.wordNetGeneralAsker.setPopupNoInfoMessage("No available synonym for this Item");
		super.wordNetGeneralAsker.setContentProvider(new SynonymContentProvider());
		super.wordNetGeneralAsker.setContentInserter(new SynonymContentInserter());
	}
	
	public void run() {
		super.run();
		super.wordNetGeneralAsker.ask();
	}
}
