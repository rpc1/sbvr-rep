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
package org.dbe.businessModeller.vocabulary.enterprise.exchange.concept;
//import java.util.Collection;

import org.dbe.businessModeller.vocabulary.enterprise.*;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.VocabularyExporter;

public class ObjectTypeImporter extends VocabularyExporter{
	
	/**
	 * Constructor
	 */
	public ObjectTypeImporter(){

	}
	
	/**
	 * SBVR object type to vocabulary entry converter
	 * @param designation
	 * @return
	 */
	public Object convert(SBVR.Designation designation){
		VocabularyEntry entry = new ObjectType();
		Designation representation = new Designation();
		
		// set primary representation
		SBVR.Text text = (SBVR.Text) designation.getExpression();
		representation.setSignifier(text.getValue());
		
		// TODO add attributes
		//entry.setAttributes(atts);
		
		// set representation and attributes for vocabulary entry
		entry.setPrimaryRepresentation(representation);
		
		return entry;
	}	
}