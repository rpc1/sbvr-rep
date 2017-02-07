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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.role;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.NounConcept;

public class Role extends NounConcept{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newAttributesHandler
	 */
	public Role(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newAttributesHandler);
	}
	
	/**
	 * Create role
	 * @param primaryRepresentation
	 * @return
	 */
	public SBVR.Designation create(String primaryRepresentation){		
			
		// create role object
		SBVR.Role role = sbvr_factory.createRole();
		
		// create Text object
		SBVR.Text text = this.createVetisText(primaryRepresentation); 
		
		// create Designation object
		SBVR.Designation designation = this.createVetisDesignation(role, text);
		
		// create Term object
		SBVR.Term term = this.createVetisTerm(role, text);
								
		// add all created objects to conceptList
		conceptualSchema.getConcept().add(role);
		thingList.add(text);
		thingList.add(designation);
		thingList.add(term);
		
		return designation;
	}
}