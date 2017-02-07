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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.associativeFactType.isPropertyOfFactType;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.associativeFactType.AssociativeFactType;

public class IsPropertyOfFactType extends AssociativeFactType{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newDirection
	 * @param newAttributesHandler
	 */
	public IsPropertyOfFactType(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, String newDirection, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newDirection, newAttributesHandler);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.associativeFactType.AssociativeFactType#create(java.lang.String)
	 */
	public void create(String primaryRepresentation){
		// initiate variables
		// if user entered isPropertyOfFactType, when the first term means attribute, and
		// the second means class (i.e. rooms is_property_of hotel), it's ok, but if he 
		// entred fact type contrary (i.e. hotel has rooms), then we have
		// to change term1 and term2
		if(direction.equals("1"))
			init(primaryRepresentation, 1);
		else
			init(primaryRepresentation, 0);
		// create isPropertyOfFactType
		factType = sbvr_factory.createIsPropertyOfFactType();
		
		super.create(false, false, false);
		
		// check for concept type in attributes hash map
		String conceptType = attributesHandler.getAttribute(term_first, "General_concept:");
		
		if(conceptType.equals("")){ // if not found, set it to text
			conceptType = "text";
		}
		org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType objectType = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType(thingList, conceptualSchema, attributesHandler);
		SBVR.Designation designation1 = (SBVR.Designation) objectType.create(conceptType);
		SBVR.ObjectType objectType1 = (SBVR.ObjectType) designation1.getMeaning();
		
		// change object type of first fact type role to object type, meaning attribute data type
		try{
			((SBVR.FactTypeRole) factType.getRole().get(0)).getObjectType().add(objectType1);
		}
		catch(Exception e){}
			
		super.addElementsToThingList();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.associativeFactType.AssociativeFactType#createSynonym(java.lang.String, java.lang.String)
	 */
	public void createSynonym(String primaryRepresentation, String synonym) {
		// find parent synonym fact type
		factType = list_checker.checkForFactType(primaryRepresentation);
		init(synonym, 0);
		if(super.create(false, true, false)) {
			super.factSymbol.setPreferred(false);
			super.factSymbol.setProhibited(true);
		}
	}
}