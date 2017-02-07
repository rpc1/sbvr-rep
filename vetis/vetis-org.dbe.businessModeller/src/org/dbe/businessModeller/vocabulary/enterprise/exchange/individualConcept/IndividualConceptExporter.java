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
package org.dbe.businessModeller.vocabulary.enterprise.exchange.individualConcept;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.VocabularyExporter;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;

public class IndividualConceptExporter extends VocabularyExporter{
	
	/**
	 * Constructor
	 * @param thingListNew
	 * @param newConceptualSchema
	 */
	public IndividualConceptExporter(SBVRLists thingListNew, SBVR.ConceptualSchema newConceptualSchema){
		thingList = thingListNew;
		conceptualSchema = newConceptualSchema;
	}
	
	/**
	 * Individual concept to SBVR converter
	 * @param entry
	 * @param categorizationType
	 * @param categorization
	 */
	public void convert(VocabularyEntry entry, String categorizationType, String categorization){
		org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.individualConcept.IndividualConcept individualConcept = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.individualConcept.IndividualConcept(thingList, conceptualSchema, null);
		SBVR.Name name = individualConcept.create(entry.getPrimaryRepresentation().toString());
		
		if(!categorizationType.equals("")) {
			if(categorization.equals("segmentation")) {
				// create segmentation
				org.dbe.businessModeller.vocabulary.enterprise.sbvr.Segmentation segmentation = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.Segmentation(thingList, conceptualSchema, null);
				segmentation.create(name, categorizationType);	
			}
			else {
				// create categorization scheme
				org.dbe.businessModeller.vocabulary.enterprise.sbvr.CategorizationScheme categorizationScheme = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.CategorizationScheme(thingList, conceptualSchema, null);
				categorizationScheme.create(name, categorizationType);			
			}
		}
	}	
}