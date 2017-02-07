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
package org.dbe.businessModeller.vocabulary.ui.editors;

import org.dbe.businessModeller.dictionary.contentinserter.HyponymContentInserter;
import org.dbe.businessModeller.dictionary.contentprovider.HyponymContentProvider;
import org.dbe.businessModeller.dictionary.ui.WordNetGeneralAction;

public class WordNetHyponymAction extends WordNetGeneralAction{
	
	public WordNetHyponymAction(){
		super();
		super.setText("Ask hyponym to Wordnet...");
		super.setToolTipText("Ask hyponym to Wordnet");
		super.wordNetGeneralAsker.setPopupTitle("Ask hyponym to WordNet");
		super.wordNetGeneralAsker.setPopupNoInfoMessage("No available hyponym for this Item");
		super.wordNetGeneralAsker.setContentProvider(new HyponymContentProvider());
		super.wordNetGeneralAsker.setContentInserter(new HyponymContentInserter());
	}
	
	public void run() {
		super.run();
		super.wordNetGeneralAsker.ask();
	}
}
