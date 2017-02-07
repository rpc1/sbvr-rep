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
package org.dbe.businessModeller.vocabulary.enterprise.exchange;

import org.dbe.businessModeller.enterprise.exchange.ExchangeFactory;
import org.dbe.businessModeller.enterprise.exchange.Exporter;
import org.dbe.businessModeller.enterprise.exchange.Importer;

public class VocabularyExchangerFactory extends ExchangeFactory {

	public Exporter createExporter() {
		return new VocabularyExporter();
	}
	
	public Importer createImporter() {
		return new VocabularyImporter();
	}
}
