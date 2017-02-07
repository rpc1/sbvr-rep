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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.specializationFactType.categorizationFactType;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.specializationFactType.SpecializationFactType;

import SBVR.CategorizationScheme;

public class CategorizationFactType extends SpecializationFactType{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newDirection
	 * @param newAttributesHandler
	 */
	public CategorizationFactType(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, String newDirection, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newDirection, newAttributesHandler);
	}

	/**
	 * Creates categorization fact type
	 * @param primaryRepresentation
	 */
	public void create(String primaryRepresentation){
		// initiate variables
		if(direction.equals("1"))
			init(primaryRepresentation, 0);
		else
			init(primaryRepresentation, 1);
		// create categorizationFactType
		factType = sbvr_factory.createCategorizationFactType();
		super.create(true, false, true);
	}
	
	/**
	 * Creates synonym of the given categorization fact type
	 * @param primaryRepresentation
	 * @param synonym
	 */
	public void createSynonym(String primaryRepresentation, String synonym) {
		// find parent synonym fact type
		factType = list_checker.checkForFactType(primaryRepresentation);
		// create binaryFactType
		init(synonym, 0);
		if(super.create(true, true, false)) {
			super.factSymbol.setPreferred(false);
			super.factSymbol.setProhibited(true);
		}
	}
	
	/**
	 * Creates categorization type for categorization fact type
	 * @param categorizationTypeName
	 */

	public void createCategorizationType(String categorizationTypeName) {
		SBVR.FactTypeRole factTypeRole1 = super.getFactTypeRole1();
		SBVR.ObjectType objectType = factTypeRole1.getObjectType().get(0);
		
		SBVR.Designation individualConceptDesignation = list_checker.checkForIndividualConcept(categorizationTypeName);
		
		if(individualConceptDesignation != null) {
			SBVR.IndividualConcept ind = (SBVR.IndividualConcept)individualConceptDesignation.getMeaning();
			if(ind != null) {				
				try {
					SBVR.CategorizationScheme catScheme = (CategorizationScheme) ind.getInstance().get(0);
					catScheme.getContainsCategory().add(objectType);
				}
				catch (Exception e) {}
			}
		}
	}
}