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

import org.dbe.businessModeller.vocabulary.enterprise.exchange.VocabularyExporter;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;

public class CategorizationType extends VocabularyExporter{
	
	/**
	 * Constructor
	 * @param thingListNew
	 * @param newConceptualSchema
	 */
	public CategorizationType(SBVRLists thingListNew, SBVR.ConceptualSchema newConceptualSchema){
		thingList = thingListNew;
		conceptualSchema = newConceptualSchema;
	}
	
	/**
	 * Categorization type to SBVR converter
	 * @param primaryRepresentation
	 * @param generalConceptName
	 */
	public void convert(String primaryRepresentation, String generalConceptName){
		// create categorization type
		//org.dbe.businessModeller.vocabulary.enterprise.sbvr.categorizationType.CategorizationType categorizationType = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.categorizationType.CategorizationType(thingList, conceptualSchema, null);
		//SBVR.Designation designation = categorizationType.create(primaryRepresentation);
		
		// create general concept
		//org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType generalConcept = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType(thingList, conceptualSchema, null);
		//generalConcept.create(generalConceptName);
		
		// connect categorization type with general concept
		//((SBVR.CategorizationType)designation.getMeaning()).getIsFor().add((Concept) generalConcept);
	}
}
