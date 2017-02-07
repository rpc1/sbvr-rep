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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;

public class Segmentation extends VetisSBVRManager{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newAttributesHandler
	 */
	public Segmentation(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newAttributesHandler);
	}
	
	/**
	 * Create segmentation
	 * @param name
	 * @param categorizationTypeName
	 */
	public void create(SBVR.Name name, String categorizationTypeName) {
		SBVR.Designation catTypeDesignation = list_checker.checkForCategorizationType(categorizationTypeName);
		if(catTypeDesignation != null) {
			SBVR.CategorizationType categorizationType = (SBVR.CategorizationType)catTypeDesignation.getMeaning();
			// categorization type exists, create segmentation
			SBVR.Segmentation segmentation = sbvr_factory.createSegmentation();
			
			// connect categorization scheme with general concept
			segmentation.getIsFor().add(categorizationType.getIsFor().get(0));
			
			// add categorization type
			segmentation.setIsBasedOn(categorizationType);
			
			// connect with individual concept
			((SBVR.IndividualConcept)(name.getMeaning())).getInstance().add(segmentation);
			name.getRefersTo().add(segmentation);
			
			thingList.add(segmentation);
		}
	}
}
