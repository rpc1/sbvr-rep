
/*******************************************************************************
 * Copyright (c) 2009 Vetis.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://opensource.org/licenses/eclipse-1.0.php

 * Author:
 *	KTU  Department of Information Systems, http://www.isd.ktu.lt
 *
 *******************************************************************************/package org.dbe.businessModeller.vocabulary.enterprise.sbvr.categorizationType;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.VetisSBVRManager;

import SBVR.Concept;

public class CategorizationType extends VetisSBVRManager{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newAttributesHandler
	 */
	public CategorizationType(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newAttributesHandler);
	}
	
	/**
	 * Creates SBVR categorization type
	 * @param primaryRepresentation
	 * @param generalConceptName
	 * @return designation of the created categorization type
	 */
	public SBVR.Designation create(String primaryRepresentation, String generalConceptName){
		
		// check, if there exists such categorization type
		SBVR.Designation designationFound = list_checker.checkForCategorizationType(primaryRepresentation);
		
		if(designationFound == null) {
			
			// create ObjectType object
			SBVR.CategorizationType categorizationType = sbvr_factory.createCategorizationType();

			// create Text object
			SBVR.Text text = this.createVetisText(primaryRepresentation); 
			
			// create Designation object
			SBVR.Designation designation = this.createVetisDesignation(categorizationType, text);
			
			// create Term object
			SBVR.Term term = this.createVetisTerm(categorizationType, text);
			term.setPreferred(true);
			
			org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType generalConceptType = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType(thingList, conceptualSchema, null);
			SBVR.Designation generalDesignation = generalConceptType.create(generalConceptName);
			
			// set general concept
			categorizationType.getIsFor().add((Concept) generalDesignation.getMeaning());
			
			// add all created objects to conceptList
			conceptualSchema.getConcept().add(categorizationType);
			thingList.add(text);
			thingList.add(designation);
			thingList.add(term);
			
			return designation;
		}
		else{
			return designationFound;
		}
	}
}
