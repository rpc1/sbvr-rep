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
 * Creato il 16-nov-2005
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.enterprise.exchange;

import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.ruleset.enterprise.exchange.RulesetExchangerFactory;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.VocabularyExchangerFactory;

public abstract class ExchangeFactory {
	public abstract Exporter createExporter();
	public abstract Importer createImporter();
	
	public static ExchangeFactory getExchangeFactory(int editorType){
		ExchangeFactory exchangeFactory;
		switch (editorType) {
		case BusinessModeller.DOCUMENT_VOCABULARY:
			exchangeFactory = new VocabularyExchangerFactory();
			break;
		case BusinessModeller.DOCUMENT_RULESET:
			exchangeFactory = new RulesetExchangerFactory();
			break;
		case BusinessModeller.DOCUMENT_FACTS:
			exchangeFactory = null;
			break;
		default:
			return null;
		}
		return exchangeFactory;
	}
}
