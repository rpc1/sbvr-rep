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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.characteristic;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.FactType;

public class Characteristic extends FactType{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newDirection
	 * @param newAttributesHandler
	 */
	public Characteristic(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, String newDirection, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newDirection, newAttributesHandler);
	}
	
	/**
	 * Creates characteristic fact type
	 * @param primaryRepresentation
	 */
	public void create(String primaryRepresentation){
		// create associativeFactType
		factType = sbvr_factory.createCharacteristic();
		init(primaryRepresentation, 0);
		super.create(true, false, false);
		
		// create boolean object type
		org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType booleanObjectType = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType(thingList, conceptualSchema, attributesHandler);
		booleanObjectType.create("boolean");
	}
}