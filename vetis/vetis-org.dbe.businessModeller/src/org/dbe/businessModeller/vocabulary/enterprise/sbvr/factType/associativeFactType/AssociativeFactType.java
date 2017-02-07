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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.associativeFactType;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.FactType;

public class AssociativeFactType extends FactType{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newDirection
	 * @param newAttributesHandler
	 */
	public AssociativeFactType(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, String newDirection, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newDirection, newAttributesHandler);
	}

	/**
	 * Creates associative fact type
	 * @param primaryRepresentation
	 */
	public void create(String primaryRepresentation){
		// create associativeFactType
		factType = sbvr_factory.createAssociativeFactType();
		init(primaryRepresentation, 0);
		super.create(true, false, false);
	}
	
	/**
	 * Creates synonym of the specified associative fact type
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
}