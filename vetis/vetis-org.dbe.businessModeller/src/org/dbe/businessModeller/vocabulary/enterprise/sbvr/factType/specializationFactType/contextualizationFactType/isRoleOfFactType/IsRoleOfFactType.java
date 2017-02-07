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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.specializationFactType.contextualizationFactType.isRoleOfFactType;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.specializationFactType.contextualizationFactType.ContextualizationFactType;

public class IsRoleOfFactType extends ContextualizationFactType{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newDirection
	 * @param newAttributesHandler
	 */
	public IsRoleOfFactType(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, String newDirection, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newDirection, newAttributesHandler);
	}
	
	/**
	 * Creates isRoleOf fact type
	 * @param primaryRepresentation
	 */
	public void create(String primaryRepresentation){
		// initiate variables
		init(primaryRepresentation, 0);
		// create isRoleOfFactType
		factType = sbvr_factory.createIsRoleOfFactType();
		super.create(true, false, true);
	}
}