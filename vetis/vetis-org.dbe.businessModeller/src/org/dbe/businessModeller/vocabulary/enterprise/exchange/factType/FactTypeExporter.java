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
package org.dbe.businessModeller.vocabulary.enterprise.exchange.factType;

import java.util.HashMap;
import java.util.Iterator;

import org.apache.commons.lang.ArrayUtils;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.VocabularyExporter;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.associativeFactType.AssociativeFactType;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.associativeFactType.isPropertyOfFactType.IsPropertyOfFactType;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.binaryFactType.BinaryFactType;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.binaryFactType.partitiveFactType.PartitiveFactType;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.characteristic.Characteristic;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.specializationFactType.categorizationFactType.CategorizationFactType;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.specializationFactType.contextualizationFactType.isRoleOfFactType.IsRoleOfFactType;
import org.dbe.businessModeller.XML.XMLDocument;
import org.dbe.businessModeller.XML.XMLElement;
import org.dbe.businessModeller.XML.XMLWrapper;

public class FactTypeExporter extends VocabularyExporter{
	
	protected SBVR.ConceptualSchema conceptualSchema;
	protected HashMap <String, String>factTypes;
	protected HashMap <String, String>defaultVerbs;
	protected String defaultFactType;
	
	/**
	 * Constructor
	 * @param thingListNew
	 * @param newConceptualSchema
	 */
	public FactTypeExporter(SBVRLists thingListNew, SBVR.ConceptualSchema newConceptualSchema) {
		thingList = thingListNew;
		conceptualSchema = newConceptualSchema;
		loadFactTypes();
	}
	
	/**
	 * Fact type loader from XML
	 */
	private void loadFactTypes(){
	 	XMLWrapper wrapper = new XMLWrapper();
		XMLDocument doc = wrapper.getLanguageDocument();
		XMLElement factTypesElement = doc.getElement("factTypes");
		
		factTypes = new HashMap<String, String>();
		defaultVerbs = new HashMap<String, String>();
		defaultFactType = "";
		XMLElement element = null, verbElement = null;
		int iteratorIndex = 0;
		for (Iterator<XMLElement> i = factTypesElement.getContents().iterator();i.hasNext();){
			element = (XMLElement) i.next();
			
			verbElement = null;
			iteratorIndex = 0;
			for (Iterator<XMLElement> j = element.getContents().iterator();j.hasNext();){
				verbElement = (XMLElement) j.next();
				// get verbs of fact types for both directions
				XMLElement direction1 = verbElement.getContents().get(0);
				XMLElement direction2 = verbElement.getContents().get(1);
				
				if(iteratorIndex == 0){
					// put default verbs of fact types to hash map: key => fact type, value => default verb 
					defaultVerbs.put(element.getName() + "-1", direction1.getValue());
					defaultVerbs.put(element.getName() + "-2", direction2.getValue());
				}
				// put fact types to hash map: key => verb, value => fact type _ direction
				factTypes.put(direction1.getValue(), element.getName() + "-1");
				factTypes.put(direction2.getValue(), element.getName() + "-2");
				
				// set first found factType as default
				if(defaultFactType == ""){
					defaultFactType = element.getName() + "-1";
				}
				iteratorIndex++;
			}
		}
	}
	
	/**
	 * Fact type getter
	 * @return
	 */
	public HashMap <String, String> getFactTypes() {
		return factTypes;
	}
	
	/**
	 * Default verb of the given fact type getter
	 * @param factType
	 * @return
	 */
	public String getDefaultVerbOfFactType(String factType){
		return defaultVerbs.get(factType);
	}
	
	/**
	 * Fact type to SBVR converter
	 * @param primaryRepresentation
	 * @param attributesHandler
	 * @param synonymousForm
	 * @param categorizationType
	 * @param factConceptType
	 */
	public void convert(String primaryRepresentation, VocabularyAttributesHandler attributesHandler, String synonymousForm, String categorizationType, String factConceptType){
		
		// get verb
		String [] temp = primaryRepresentation.split(" ");
		String type = "";
		String direction = "";
		
		String [] factConceptTypes = 
		{
			"associative_fact_type", 
			"binary_fact_type", 
			"categorization_fact_type", 
			"is_property_of_fact_type", 
			"partitive_fact_type", 
			"characteristic", 
			"is_role_of_fact_type"
		};
		
		if(ArrayUtils.contains(factConceptTypes, factConceptType)) {
			type = factConceptType;
			direction = "1";
		}
		else {
			if(temp.length == 2) { // if fact type consists of term and verb, it is automaticaly partitive fact type
				type = factConceptTypes[5];
			}
			else { // fact type consists of term1, verb and term2, so we have to decide, what kind of fact type it is
				if(temp.length == 3) {
					String verb = temp[1];
					String verbType = factTypes.get(verb); // get fact type and direction by verb from hash map
					if(verbType == null){
						if(defaultFactType != null){
							verbType = defaultFactType;
						}
						else{
							verbType = factConceptTypes[0] + "-1";
						}
					}
	
					if(verbType != null){ // now split result into type and direction 
						String [] temp2 = verbType.split("-");
						if(temp2.length > 1) {
							type = temp2[0];
							direction = temp2[1];
						}
					}
				}
			}
		}
		
		if(type.equals(factConceptTypes[0])) {
			AssociativeFactType factType = new AssociativeFactType(thingList, conceptualSchema, direction, attributesHandler);
			if(synonymousForm == null)
				factType.create(primaryRepresentation);
			else
				factType.createSynonym(primaryRepresentation, synonymousForm);
		}

		if(type.equals(factConceptTypes[1])) {
			BinaryFactType factType = new BinaryFactType(thingList, conceptualSchema, direction, attributesHandler);
			factType.create(primaryRepresentation);
		}
		
		if(type.equals(factConceptTypes[2])) {
			CategorizationFactType factType = new CategorizationFactType(thingList, conceptualSchema, direction, attributesHandler);
			if(synonymousForm == null)
				factType.create(primaryRepresentation);
			else
				factType.createSynonym(primaryRepresentation, synonymousForm);
			
			if(!categorizationType.equals("")) {
				// create categorization type
				factType.createCategorizationType(categorizationType);
			}
			
		}

		if(type.equals(factConceptTypes[3])) {
			IsPropertyOfFactType factType = new IsPropertyOfFactType(thingList, conceptualSchema, direction, attributesHandler);
			if(synonymousForm == null)
				factType.create(primaryRepresentation);
			else
				factType.createSynonym(primaryRepresentation, synonymousForm);
		}

		if(type.equals(factConceptTypes[4])) {
			PartitiveFactType factType = new PartitiveFactType(thingList, conceptualSchema, direction, attributesHandler);
			if(synonymousForm == null)
				factType.create(primaryRepresentation);
			else
				factType.createSynonym(primaryRepresentation, synonymousForm);
		}

		if(type.equals(factConceptTypes[5])) {
			Characteristic factType = new Characteristic(thingList, conceptualSchema, direction, attributesHandler);
			factType.create(primaryRepresentation);
		}
		
		if(type.equals(factConceptTypes[6])) {
			IsRoleOfFactType factType = new IsRoleOfFactType(thingList, conceptualSchema, direction, attributesHandler);
			factType.create(primaryRepresentation);
		}
	}

}