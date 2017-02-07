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
 * Creato il 17-nov-2005
 * @author Pierpaolo Cira
 */
/*
 * Modified 2009.11.26 by Vetis project
 */
package org.dbe.businessModeller.vocabulary.enterprise.exchange;


import org.dbe.businessModeller.enterprise.exchange.Importer;
import org.eclipse.emf.common.util.URI;


public class VocabularyImporter extends Importer {
	
	
	public VocabularyImporter() {
	}
	
	public String fromXMI(URI fileURI){
		//TODO implement
		// create SBVR objects from xmi file
		/*
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.createResource(fileURI);
		
		Resource poResource = resourceSet.getResource(fileURI, true);
		
		// first classify objects from xmi
		Iterator iterator = poResource.getContents().iterator();
		EList<SBVR.Concept> concepts = new BasicEList();
		EList designations = new BasicEList();
		EList sententialForms = new BasicEList();
		while(iterator.hasNext()){
			EObject obj = (EObject) iterator.next();
			if(obj instanceof SBVR.ConceptualSchema){
				concepts = ((SBVR.ConceptualSchema) obj).getConcept(); // get concepts from conceptual schema
			}
			if(obj instanceof SBVR.Designation){
				designations.add((SBVR.Designation) obj);
			}
			if(obj instanceof SBVR.SententialForm){
				sententialForms.add((SBVR.SententialForm) obj);
			}
		}
		
		// then analyze concepts
		Iterator iterator2 = concepts.iterator();
		String naturalLanguage = "";
		ListChecker designationListChecker = new ListChecker(designations);
		ListChecker sententialFormlistChecker = new ListChecker(sententialForms);
		String ending = "\r\n\r\n";
		while(iterator2.hasNext()){
			EObject obj = (EObject) iterator2.next();
			if(iterator2.hasNext() == false){
				ending = "";
			}
			if(obj instanceof SBVR.IndividualConcept){
				SBVR.Designation des = designationListChecker.getDesignationByIndividualConcept((SBVR.IndividualConcept) obj);
				SBVR.Text text = (Text) des.getExpression();
				naturalLanguage += text.getValue() + ending;
			}
			if(obj instanceof SBVR.ObjectType){
				SBVR.Designation des = designationListChecker.getDesignationByObjectType((SBVR.ObjectType) obj);
				SBVR.Text text = (Text) des.getExpression();
				naturalLanguage += text.getValue() + ending;
			}
			if(obj instanceof SBVR.FactType){
				SBVR.SententialForm sent = sententialFormlistChecker.getSententialFormByFactType((SBVR.FactType) obj);
				SBVR.Text text = (Text) sent.getExpression();
				naturalLanguage += text.getValue() + ending;
			}
		}	
		return naturalLanguage;*/
		return null;
	}
}
