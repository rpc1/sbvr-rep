/*******************************************************************************
 * Copyright (c) 2006 DBE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://opensource.org/licenses/eclipse-1.0.php
 *
 * Contributors:
 *     Isufi
 *
 * Authors:
 *	Maurizio De Tommasi
 *	Pierpaolo Cira
 *	Valerio Cisternino
 *
 *******************************************************************************/
/*
 * Modified 2009.11.27 by Vetis project
 */
package org.dbe.businessModeller.vocabulary.enterprise.exchange;


import java.io.StringReader;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.IBusinessModellerDocument;
import org.dbe.businessModeller.XML.XMLDocument;
import org.dbe.businessModeller.XML.XMLElement;
import org.dbe.businessModeller.XML.XMLWrapper;
import org.dbe.businessModeller.enterprise.BusinessModellerDocument;
import org.dbe.businessModeller.enterprise.exchange.Exporter;
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.vocabulary.enterprise.FactType;
import org.dbe.businessModeller.vocabulary.enterprise.FoE;
import org.dbe.businessModeller.vocabulary.enterprise.FoEPart;
import org.dbe.businessModeller.vocabulary.enterprise.IndividualConcept;
import org.dbe.businessModeller.vocabulary.enterprise.ObjectType;
import org.dbe.businessModeller.vocabulary.enterprise.Vocabulary;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttribute;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.concept.NounConceptExporter;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.factType.*;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.individualConcept.IndividualConceptExporter;
import org.dbe.businessModeller.vocabulary.enterprise.grammar.VocabularyLexer;
import org.dbe.businessModeller.vocabulary.enterprise.grammar.VocabularyParser;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import SBVR.*;
import SBVR.impl.*;

public class VocabularyExporter extends Exporter{
	
	// vocabulary attributes handler
	private VocabularyAttributesHandler attributesHandler;

	/**
	 * Set resource
	 */
	public void setResource(Resource newPoResource){
		poResource = newPoResource;
	}
	
	/**
	 * Get resource
	 */
	public Resource getResource(){
		return poResource;
	}
	
	/**
	 * Set thing list
	 */
	public void setThingList(SBVRLists newThingList){
		thingList = newThingList;
	}
	
	/**
	 * Get thing list
	 */
	public SBVRLists getThingList(){
		return thingList;
	}
	
	/**
	 * Set conceptual schema
	 */
	public void setConceptualSchema(SBVR.ConceptualSchema newConceptualSchema){
		conceptualSchema = newConceptualSchema;
	}
	
	/**
	 * Get conceptual schema
	 */
	public SBVR.ConceptualSchema getConceptualSchema(){
		return conceptualSchema;
	}
	
	public void parseAndExportRuleset(){}
	
	/**
	 * Parse vocabulary and export it to xmi file
	 * * @param saveToFile serialise to xmi when 1
	 */
	public void parseAndExportVocabulary(int saveToFile) {
		
		// get input file string contents
		String editorText = BusinessModellerUtils.readFile(vocFile);
		
		// get language document and keywords
	 	XMLWrapper wrapper = new XMLWrapper();
		XMLDocument doc = wrapper.getLanguageDocument();
		XMLElement keywords = doc.getElement("keywords");
		
		// parse vocabulary
		VocabularyLexer lexer = new VocabularyLexer(new StringReader(editorText.trim() + '\n'), keywords);
		VocabularyParser parser = new VocabularyParser(lexer);
		
		try {
			parser.vocabulary();
		} 
		catch (RecognitionException e) {} 
		catch (TokenStreamException e) {}
		Vocabulary vocabulary = (Vocabulary)BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
		
		// create ResourceSet object to keep our vocabulary objects
		resourceSet = new ResourceSetImpl();
		
		// create attributes handler
		attributesHandler  = new VocabularyAttributesHandler();
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"xmi",
				new ResourceFactoryImpl()
				{
				public Resource createResource(URI uri)
				{
				return new XMIResourceImpl(uri)
				{
				protected boolean useUUIDs() { return true; }
				};
				}
				});
		URI fileURI = URI.createFileURI(xmiFile.getAbsolutePath());
		poResource = resourceSet.createResource(fileURI);	

		VocabularyEntry entry=null;
				
		// SBVR factories
		SBVRFactoryImpl sbvr_factory = new SBVRFactoryImpl();
		
		// --------------- Header --------------- 
		
			// create vocabulary object
			SBVR.Vocabulary vocab = sbvr_factory.createVocabulary();
			
			// create individual concept1 object
			SBVR.IndividualConcept individualConcept1 = sbvr_factory.createIndividualConcept();
			individualConcept1.getInstance().add(vocab);
			
			// create text1 object
			SBVR.Text text1 = sbvr_factory.createText();
			text1.setValue(vocFile.getName().replace(".voc", ""));
			
			// create name1 object
			SBVR.Name name1 = sbvr_factory.createName();
			name1.setMeaning(individualConcept1);
			name1.setExpression(text1);
			name1.setPreferred(true);
			name1.getRefersTo().add(vocab);
	
			// create language object
			SBVR.Language language = sbvr_factory.createLanguage();
			
			// create individual concept2 object
			SBVR.IndividualConcept individualConcept2 = sbvr_factory.createIndividualConcept();
			individualConcept2.getInstance().add(language);
			
			// create text2 object
			SBVR.Text text2 = sbvr_factory.createText();			
			text2.setValue("English");
			
			// create name2 object
			SBVR.Name name2 = sbvr_factory.createName();
			name2.setMeaning(individualConcept2);
			name2.setExpression(text2);
			name2.setPreferred(true);
			name2.getRefersTo().add(language);
			
			// create URI object
			SBVR.URI uri = sbvr_factory.createURI();
			uri.setValue("http://www.loc.gov/standards/iso639-2/php/English_list.php");
	
		// --------------- Header end ---------------
		
		// --------------- Conceptual schema ---------------
			
			// create ConceptualSchema object
			conceptualSchema = sbvr_factory.createConceptualSchema();
		
			thingList = new SBVRLists();
			
			IndividualConceptExporter IndividualConceptExporter = new IndividualConceptExporter(thingList, conceptualSchema);
			NounConceptExporter ObjectTypeExporter = new NounConceptExporter(thingList, conceptualSchema);
			FactTypeExporter FactTypeExporter = new FactTypeExporter(thingList, conceptualSchema);

			for (Iterator<VocabularyEntry> i = vocabulary.getEntries().iterator();i.hasNext();)
			{
				entry=i.next();
				attributesHandler.setAttributes(entry);
			}
			
			for (Iterator<VocabularyEntry> i = vocabulary.getEntries().iterator();i.hasNext();)
			{
				entry=i.next();
				
				if (entry instanceof IndividualConcept){
					
					String necessity = attributesHandler.getAttribute(entry.getPrimaryRepresentation().toString(), "Necessity:");
					String conceptTypeName = BusinessModellerUtils.extractWordFromString(necessity, " ", -1);
					String catScheme = BusinessModellerUtils.extractWordFromString(necessity, " ", 1);
					
					IndividualConceptExporter.convert(entry, conceptTypeName, catScheme);
					
					// now check, if this object type don't have general concept
					String generalConceptName = attributesHandler.getAttribute(entry.getPrimaryRepresentation().toString(), "General_concept:"); 
					
					// general concept found, concept type is not role, create categorization fact type
					if(generalConceptName != ""){
						String defaultCategorizationVerb = FactTypeExporter.getDefaultVerbOfFactType("categorization_fact_type-1");
						FactTypeExporter.convert(entry.getPrimaryRepresentation().toString() + " " + defaultCategorizationVerb + " " + generalConceptName , attributesHandler, null, "", "");
					}
				}
					
					
				if (entry instanceof ObjectType){					
					// find out concept type
					String conceptType = attributesHandler.getAttribute(entry.getPrimaryRepresentation().toString(), "Concept_type:");
					
					if(conceptType.equalsIgnoreCase("role"))
						conceptType = "fact_type_role";
					// FIXME
					// it can be either role, if is in isPropertyOf fact type
					if(this.isRole(vocabulary, entry.getPrimaryRepresentation().toString(), FactTypeExporter.getFactTypes()))
						conceptType = "role"; 
					//else 
						//conceptType = "fact_type_role";
					
					if(conceptType.equals("role") || conceptType.equals("fact_type_role")){ // create role
						if(conceptType.equals("role"))
							ObjectTypeExporter.convert(entry.getPrimaryRepresentation().toString(), "Role", null);
						else {							
							// now check, if this role type don't have general concept
							String generalConceptName = attributesHandler.getAttribute(entry.getPrimaryRepresentation().toString(), "General_concept:"); 
							
							// general concept found, concept type is not role, create categorization fact type
							if(generalConceptName != ""){
								ObjectTypeExporter.convert(entry.getPrimaryRepresentation().toString(), "FactTypeRole", null);
								String defaultIsRoleOfVerb = FactTypeExporter.getDefaultVerbOfFactType("is_role_of_fact_type-1");
								FactTypeExporter.convert(entry.getPrimaryRepresentation().toString() + " " + defaultIsRoleOfVerb + " " + generalConceptName , attributesHandler, null, "", "");
							}
							else { // general concept not entered, that means, user wants to create role for attribute
								ObjectTypeExporter.convert(entry.getPrimaryRepresentation().toString(), "Role", null);
							}
						}
						
					}
					else if(conceptType.equals("categorization_type")) {
						// first, get general concept
						String necessity = attributesHandler.getAttribute(entry.getPrimaryRepresentation().toString(), "Necessity:");
						String generalConceptName = BusinessModellerUtils.extractWordFromString(necessity, " ", -1);
						if(!generalConceptName.equals("")) {
							ObjectTypeExporter.convert(entry.getPrimaryRepresentation().toString(), "CategorizationType", generalConceptName);
						}
					}
					else { // create object type
						ObjectTypeExporter.convert(entry.getPrimaryRepresentation().toString(), "ObjectType", null);
						
						// now check, if this object type don't have general concept
						String generalConceptName = attributesHandler.getAttribute(entry.getPrimaryRepresentation().toString(), "General_concept:"); 
						
						// general concept found, concept type is not role, create categorization fact type
						if(generalConceptName != ""){
							// check, if this object type has categorization type
							String temp = attributesHandler.getAttribute(entry.getPrimaryRepresentation().toString(), "Necessity:");							
							
							String segmentationName = BusinessModellerUtils.extractWordFromString(temp, " ", -1);
							
							String defaultCategorizationVerb = FactTypeExporter.getDefaultVerbOfFactType("categorization_fact_type-1");
							FactTypeExporter.convert(entry.getPrimaryRepresentation().toString() + " " + defaultCategorizationVerb + " " + generalConceptName , attributesHandler, null, segmentationName, "");
							
							
						}
						
						// now check, if this object type don't have synonyms
						String synonyms = attributesHandler.getAttribute(entry.getPrimaryRepresentation().toString(), "Synonym:");
						
						if(!synonyms.equals("")) {
							String [] synonymsArray = synonyms.split(",");
							for(int u = 0; u < synonymsArray.length; u++) {
								String synonym = synonymsArray[u].replaceAll(" ", "");
								ObjectTypeExporter.convert(entry.getPrimaryRepresentation().toString(), "Synonym", synonym);
								
							}
						}
					}
				}
					
				else if (entry instanceof FactType){				
					// check, if user entered cancept type of the fact type
					String factConceptType = attributesHandler.getAttribute(entry.getPrimaryRepresentation().toString(), "Concept_type:");
					
					// convert fact type
					FactTypeExporter.convert(entry.getPrimaryRepresentation().toString(), attributesHandler, null, "", factConceptType);
					
					// now check, if this fact type don't have synonymous form
					String synonymous_form = attributesHandler.getAttribute(entry.getPrimaryRepresentation().toString(), "Synonymous_form:");
					
					// check, if it is not "is_a" relation
					String [] temp = entry.getPrimaryRepresentation().toString().split(" ");
					if(temp.length > 2) {
						if(temp[1].equalsIgnoreCase("is_a")) { // we have is_a relation, add synonymous form
							String comma = synonymous_form.equals("") ? "" : ",";
							String isASynonymousForm = comma + temp[2] + " " + temp[1] + " " + temp[0];
							synonymous_form += isASynonymousForm; 
						}
					}
					
					
					
					if(!synonymous_form.equals("")) {
						String [] synonymsArray = synonymous_form.split(",");
						for(int u = 0; u < synonymsArray.length; u++) {
							String synonym = synonymsArray[u];
							FactTypeExporter.convert(entry.getPrimaryRepresentation().toString(), attributesHandler, synonym, "", "");
						}
					}
				}	    
			}//end for

		// --------------- Conceptual schema end ---------------
		
		// --------------- Footer ---------------
			
			// create FactModel
			SBVR.FactModel factModel = sbvr_factory.createFactModel();
			factModel.getConceptualSchema().add(conceptualSchema);
			
			// create vocabulary namespace
			SBVR.VocabularyNamespace vocabularyNamespace = sbvr_factory.createVocabularyNamespace();
			vocabularyNamespace.getDesignation().add(name1);
			vocabularyNamespace.getDesignation().add(name2);
			vocabularyNamespace.getUri().add(uri);
			vocabularyNamespace.getLanguage().add(language);
			
			// create concepts
			for(Iterator<EObject> i = thingList.getAllTingsList().iterator(); i.hasNext();){
				EObject obj = i.next();
				
				// set designations, terms and placeholders for vocabularyNamespace
				if(obj instanceof SBVR.Designation || obj instanceof SBVR.Term || obj instanceof SBVR.Placeholder){
					vocabularyNamespace.getDesignation().add((Designation) obj);
				}
				// TODO noun form now is not in use
				//if(obj instanceof mrv.SententialForm || obj instanceof mrv.NounForm){
				//	vocabularyNamespace.getFactTypeForm().add((FactTypeForm) obj);
				//}
			}

		// --------------- Footer end ---------------
		
		if(saveToFile == 0){ // we will parse rules next, so create null object type for them
			org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType nullObjectType = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType(thingList, conceptualSchema, attributesHandler);
			nullObjectType.create("null");	
		}
			
		// add all elements to resource
		poResource.getContents().add(vocab);
		poResource.getContents().add(name1);
		poResource.getContents().add(text1);
		poResource.getContents().add(individualConcept1);
		poResource.getContents().add(language);
		poResource.getContents().add(name2);
		poResource.getContents().add(individualConcept2);
		poResource.getContents().add(text2);
		poResource.getContents().add(uri);
		poResource.getContents().add(conceptualSchema);
		poResource.getContents().add(factModel);
		poResource.getContents().add(vocabularyNamespace);
		
		// add elements from thingList
		super.putElementsFromThingListToResource();
		
		if(saveToFile == 1){
			super.saveResourceTofile();
		}
	}
	
	/**
	 * Checks, if term exists in vocabulary as a role, in isPropertyOf fact type
	 * @param vocabulary
	 * @param term
	 * @param factTypes
	 * @return true, if term is role, false, otherwise
	 */
	private boolean isRole(Vocabulary vocabulary, String term, HashMap<String, String> factTypes) {
		VocabularyEntry entry;
		for (Iterator<VocabularyEntry> i = vocabulary.getEntries().iterator();i.hasNext();) {
			entry=i.next();
			try {
				if(entry instanceof FactType) {
					String primaryRepresenation = entry.getPrimaryRepresentation().toString();
					String [] temp = primaryRepresenation.split(" ");
					
					if(temp.length < 3) { // characteristic
						
					}
					else {
						
						String term1 = temp[0];
						String verb = temp[1];
						String term2 = temp[2];
						
						String verbType = factTypes.get(verb);
						
						String type = "";
						String direction = "";
						
						if(verbType != null){ // now split result into type and direction 
							String [] temp2 = verbType.split("-");
							if(temp2.length > 1) {
								type = temp2[0];
								direction = temp2[1];
							}
						}
						// FIXME
						if(type.equalsIgnoreCase("is_property_of_fact_type")) {

							String conceptType = attributesHandler.getAttribute(entry.getPrimaryRepresentation().toString(), "Concept_type:");
							if(conceptType.equalsIgnoreCase("") || conceptType.equalsIgnoreCase("is_property_of_fact_type")) {
								String predictedRole = "";
								if(direction.equals("1")) {
									predictedRole = term2;
								}
								else {
									predictedRole = term1;
								}
								if(predictedRole.equals(term)) {
									return true;
								}
							}
							
						}
					}
				}
			} catch(Exception e){} 
		}
		return false;
	}
	
	public String toProlog(IBusinessModellerDocument vocabulary){
		String retVal = "";
		String fact = "";
		int id=0;
		
		// set vocabulary
		// vocabulary(ID, Name, “Description”, Source, Speech_Community, Language, Included_VocabularyID, “Note”).
		fact = "vocabulary(" 
				+ id++ + "," 
				+ "\"" + vocabulary.getName().toLowerCase() + "\"," 
				+ "\"" + vocabulary.getDescription() + "\"," 
				+ "\"" + vocabulary.getSource() + ","
				+ "\"" + ((Vocabulary) vocabulary).getSpeechCommunity().toLowerCase() + "\","
				+ "\"" + ((Vocabulary) vocabulary).getLanguage().toLowerCase() + "\","
				+ "\"" + ((Vocabulary) vocabulary).getIncludedVocabulary().toLowerCase() + "\","
				+ "\"" + vocabulary.getNote() + "\""
				+ ")."; 
		retVal += fact + "\n";
		
		for (Iterator i = vocabulary.getEntries().iterator(); i.hasNext();id++){
			VocabularyEntry entry = (VocabularyEntry)i.next();
			//set fact type
			// factType(ID, Term1, Verb, Term2).
			if (entry instanceof FactType){
				FoE foe = (FoE)entry.getPrimaryRepresentation();
				Collection  foeParts = foe.getFoEParts();
				String foePartSignifier = "";
				for (Iterator j = foeParts.iterator(); j.hasNext();)
					foePartSignifier += ((FoEPart)j.next()).getPrimaryRepresentation().toString() + ",";
				fact = "factType("
						+ id + ","
						+ foePartSignifier.substring(0,foePartSignifier.length()-1)
						+ ").";
			}
			//set Individual Concept
			// name(ID, "Name").
			else if (entry instanceof IndividualConcept){
				fact = "name("
						+ id +","
						+ "\"" + entry.getPrimaryRepresentation() + "\""
						+ ").";
			}
			//set Object Type
			// term(ID, term).
			else if (entry instanceof ObjectType){
				fact = "term("
						+ id +","
						+ entry.getPrimaryRepresentation()
						+ ").";
			}
			fact += setAttributes(entry, id);
			retVal += fact + "\n";
		}// end for
		
		return retVal;
	}// end toProlog()
	
	
	private String setAttributes(VocabularyEntry entry, int id){
		Collection attributes = entry.getAttributes();
		String retVal = "";
		if (attributes==null)
			return retVal;
		VocabularyAttribute attribute = null;
		for (Iterator i = attributes.iterator(); i.hasNext();){
			attribute = (VocabularyAttribute)i.next();
			// set attributes
			retVal += "\n" 
				+ attribute.getCaption().toLowerCase().replace(' ', '_').replaceAll(":", "") + "("
				+ id + ","
				+ "\"" + attribute.getValue() + "\").";
		}
		return retVal;
	}
}
