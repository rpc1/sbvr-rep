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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.binaryFactType.partitiveFactType;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.binaryFactType.BinaryFactType;

public class PartitiveFactType extends BinaryFactType{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newDirection
	 * @param newAttributesHandler
	 */
	public PartitiveFactType(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, String newDirection, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newDirection, newAttributesHandler);
	}

	/*
	 * (non-Javadoc)
	 * @see org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.binaryFactType.BinaryFactType#create(java.lang.String)
	 */
	public SBVR.FactType create(String primaryRepresentation){
		// initiate variables
		init(primaryRepresentation, 0);
		// if user entered partitiveFactType, when the first term means whole thing, and
		// the second means part (i.e. sauna includes pool), it's ok, but if he 
		// entred fact type contrary (i.e. pool is_included_in sauna), then we have
		// to change term1 and term2
		if(direction.equals("1"))
			init(primaryRepresentation, 1);
		else
			init(primaryRepresentation, 0);
		// create partitiveFactType
		factType = sbvr_factory.createPartitiveFactType();
		super.create(true, false, true);
		return factType;
	}
	
	/**
	 * Creates synonym of the given fact type
	 * @param primaryRepresentation
	 * @param synonym
	 */
	public void createSynonym(String primaryRepresentation, String synonym) {
		// find parent synonym fact type
		factType = list_checker.checkForFactType(primaryRepresentation);
		// create binaryFactType
		init(synonym, 0);
		if(super.create(true, true, true)) {
			super.factSymbol.setPreferred(false);
			super.factSymbol.setProhibited(true);
		}
	}
}