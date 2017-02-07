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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.individualConcept;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.NounConcept;

public class IndividualConcept extends NounConcept{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newAttributesHandler
	 */
	public IndividualConcept(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newAttributesHandler);
	}
	
	/**
	 * Create individual concept
	 * @param primaryRepresentation
	 * @return
	 */
	public SBVR.Name create(String primaryRepresentation){
			
		// create ObjectType object
		SBVR.IndividualConcept individualConcept = sbvr_factory.createIndividualConcept();
		
		// create Text object
		SBVR.Text text = this.createVetisText(primaryRepresentation); 
		
		// create Designation object
		SBVR.Designation designation = this.createVetisDesignation(individualConcept, text);
		
		// create Term object
		SBVR.Name name = this.createVetisName(individualConcept, text);
								
		// add all created objects to conceptList
		conceptualSchema.getConcept().add(individualConcept);
		thingList.add(text);
		thingList.add(designation);
		thingList.add(name);
		
		return name;
	}
}