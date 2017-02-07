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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.NounConcept;

public class ObjectType extends NounConcept{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newAttributesHandler
	 */
	public ObjectType(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newAttributesHandler);
	}
	
	/**
	 * Create object type
	 * @param primaryRepresentation
	 * @return
	 */
	public SBVR.Designation create(String primaryRepresentation){
		
		// check, if there exists such object type
		SBVR.Designation designationFound = list_checker.checkForObjectType(primaryRepresentation);
		
		if(designationFound == null) {
			
			// create ObjectType object
			SBVR.ObjectType object = sbvr_factory.createObjectType();

			// create Text object
			SBVR.Text text = this.createVetisText(primaryRepresentation); 
			
			// create Designation object
			SBVR.Designation designation = this.createVetisDesignation(object, text);
			
			// create Term object
			SBVR.Term term = this.createVetisTerm(object, text);
			term.setPreferred(true);
			
			// add all created objects to conceptList
			conceptualSchema.getConcept().add(object);
			thingList.add(text);
			thingList.add(designation);
			thingList.add(term);
			
			return designation;
		}
		else{
			return designationFound;
		}
	}
	
	/**
	 * Create synonym of the given object type
	 * @param primaryRepresentation
	 * @param synonym
	 * @return
	 */
	public SBVR.Designation createSynonym(String primaryRepresentation, String synonym){
		
		// check, if there exists such object type
		SBVR.Designation designationFound = list_checker.checkForObjectType(synonym);
		
		if(designationFound == null) {
			// synonym not found, 
			
			// let's get parent synonym designation
			SBVR.Designation parentSynonymDesignation = list_checker.checkForObjectType(primaryRepresentation);
			
			if(parentSynonymDesignation != null) {
				//take parent synonym object type, create new text, designation, term
				SBVR.ObjectType object = (SBVR.ObjectType) parentSynonymDesignation.getMeaning();
	
				// create Text object
				SBVR.Text text = this.createVetisText(synonym); 
				
				// create Designation object
				SBVR.Designation designation = this.createVetisDesignation(object, text);
				
				// create Term object
				SBVR.Term term = this.createVetisTerm(object, text);
				term.setProhibited(true);
				
				// add all created objects to conceptList
				thingList.add(text);
				thingList.add(designation);
				thingList.add(term);
				
				return designation;
			}
			else {
				// parent synonym designation not found, create new object type
				return create(synonym);
			}
		}
		else{
			// we already have this synonym
			return designationFound;
		}
	}
}