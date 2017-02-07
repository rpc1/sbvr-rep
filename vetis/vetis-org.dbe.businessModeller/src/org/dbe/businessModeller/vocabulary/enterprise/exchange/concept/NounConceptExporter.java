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
package org.dbe.businessModeller.vocabulary.enterprise.exchange.concept;

import org.dbe.businessModeller.vocabulary.enterprise.exchange.VocabularyExporter;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;

public class NounConceptExporter extends VocabularyExporter{
	
	/**
	 * Constructor
	 * @param thingListNew
	 * @param newConceptualSchema
	 */
	public NounConceptExporter(SBVRLists thingListNew, SBVR.ConceptualSchema newConceptualSchema){
		thingList = thingListNew;
		conceptualSchema = newConceptualSchema;
	}
	
	/**
	 * Noun concept to SBVR converter
	 * @param primaryRepresentation
	 * @param conceptType
	 * @param additional
	 */
	public void convert(String primaryRepresentation, String conceptType, String additional){
		if(conceptType.equals("ObjectType")) {
			org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType objectType = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType(thingList, conceptualSchema, null);
			objectType.create(primaryRepresentation);
		}
		
		if(conceptType.equals("Synonym")) {
			org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType objectType = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType(thingList, conceptualSchema, null);
			objectType.createSynonym(primaryRepresentation, additional);
		}		
		
		if(conceptType.equals("Role")) {
			org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.role.Role role = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.role.Role(thingList, conceptualSchema, null);
			// role replaced by fact type role 2009 10 06
			//org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.role.factTypeRole.FactTypeRole role = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.role.factTypeRole.FactTypeRole(thingList, conceptualSchema, null);
			role.create(primaryRepresentation);
		}
		
		if(conceptType.equals("FactTypeRole")) {
			org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.role.factTypeRole.FactTypeRole role = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.role.factTypeRole.FactTypeRole(thingList, conceptualSchema, null);
			role.create(primaryRepresentation);
		}
		
		if(conceptType.equals("CategorizationType")) {
			org.dbe.businessModeller.vocabulary.enterprise.sbvr.categorizationType.CategorizationType categorizationType = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.categorizationType.CategorizationType(thingList, conceptualSchema, null);
			categorizationType.create(primaryRepresentation, additional);
		}	
	}
}