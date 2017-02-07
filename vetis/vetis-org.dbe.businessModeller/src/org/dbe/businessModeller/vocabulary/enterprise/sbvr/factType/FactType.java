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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType;

import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.VetisSBVRManager;

import SBVR.FactTypeRole;

public class FactType extends VetisSBVRManager{

	/**
	 * Fact type direction
	 */
	protected String direction;
	
	/**
	 * Fact type primary representation
	 */
	protected String primaryRepresentation;
	
	/**
	 * Terms
	 */
	protected String term_first = null, term_second = null;
	
	/**
	 * Verb
	 */
	protected String verb = null;
	
	/**
	 * Terms beginning indexes in primary representation
	 */
	protected int term1Offset = 0, term2Offset = 0;
	
	/**
	 * Integers to save offsets
	 */
	protected SBVR.PositiveInteger integer1 = null, integer2 = null;
	
	/**
	 * Texts
	 */
	protected SBVR.Text text1 = null, text2 = null, text3 = null, text4 = null;
	
	/**
	 * Other fact type components
	 */
	protected SBVR.Placeholder placeholder1 = null, placeholder2 = null;
	protected SBVR.Designation designation = null;
	protected SBVR.SententialForm sententialForm = null;
	protected SBVR.FactSymbol factSymbol = null;
	protected SBVR.FactType factType;
	protected SBVR.FactTypeRole factTypeRole1 = null, factTypeRole2 = null;
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newDirection
	 * @param newAttributesHandler
	 */
	public FactType(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, String newDirection, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newAttributesHandler);
		direction = newDirection;
	}
	
	/**
	 * FactTypRole1 getter
	 * @return factTypeRole1
	 */
	public SBVR.FactTypeRole getFactTypeRole1() {
		return factTypeRole1;
	}

	/**
	 * FactTypRole2 getter
	 * @return factTypeRole2
	 */
	public SBVR.FactTypeRole getFactTypeRole2() {
		return factTypeRole2;
	}
	
	/**
	 * Initialise fact type export variables
	 * @param newPrimaryRepresentation - fact type primary representation
	 * @param termOrder 0 - do not change terms, 1 - change term positions
	 */
	protected void init(String newPrimaryRepresentation, int termOrder){
		// set primary representation
		primaryRepresentation = newPrimaryRepresentation;
		
		// check if there is no equal factType in the Resource 
		SBVR.Text reusedFactType = list_checker.checkForText(primaryRepresentation);
		
		int term1Index = 0, term2Index = 0;
		
		if(termOrder == 0)
			term2Index = 2;
		else
			term1Index = 2;
		
		if(reusedFactType == null){
			String [] temp = primaryRepresentation.split(" ");
			if(temp.length > 2) { // term verb term
				term_first = temp[term1Index];
				verb = temp[1];
				term_second = temp[term2Index];
				term1Offset = primaryRepresentation.indexOf(term_first) + 1;
				term2Offset = primaryRepresentation.indexOf(term_second) + 1;
				// create text for verb
				text3 = super.createVetisText(verb);
				
				// create text for factType. We dont't use createVetisText here, because it is unnecessary to check for reused text
				text4 = sbvr_factory.createText();
				text4.setValue(primaryRepresentation);
				
				// create integers
				integer1 = super.createVetisPositiveInteger(term1Offset);
				integer2 = super.createVetisPositiveInteger(term2Offset);
			}
			else if(temp.length > 1){ // characteristic - term verb
				term_first = temp[term1Index];
				verb = temp[1];
				term_second = "";
				term1Offset = 1;
				term2Offset = 0;
				
				// create text for verb
				text3 = super.createVetisText(verb);
				
				// create text for factType. We dont't use createVetisText here, because it is unnecessary to check for reused text
				text4 = sbvr_factory.createText();
				text4.setValue(primaryRepresentation);
				
				// create integer
				integer1 = super.createVetisPositiveInteger(term1Offset);
			}
		}
	}
	
	/**
	 * Find factTypeRole for the given term
	 * @param term
	 * @param type
	 * @param synonymousForm
	 * @return
	 */
	protected SBVR.FactTypeRole findRole(String term, String type, boolean synonymousForm){
		SBVR.FactTypeRole factTypeRole = null;
		SBVR.Text text = null;
		
		// first check for fact type role in the list
		SBVR.Designation factTypeRoleDesignation = list_checker.checkForFactTypeRole(term);
		
		// check for role in the list
		SBVR.Placeholder plac = null;
		if(synonymousForm == true)
			plac = list_checker.checkForRole(term);

		if(plac == null) {
			if(factTypeRoleDesignation == null){
				org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType objectTypeFactory = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType(thingList, conceptualSchema, attributesHandler);
				// create ObjectType1
				SBVR.Designation designation = (SBVR.Designation) objectTypeFactory.create(term);
				SBVR.ObjectType objectType = (SBVR.ObjectType) designation.getMeaning();
				text = (SBVR.Text) designation.getExpression();
				// fact type role not found in the list, so create new, with the object type in it
				factTypeRole = sbvr_factory.createFactTypeRole();
				factTypeRole.getObjectType().add(objectType);			
				
			}
			else {
				// find general concept of the role
				String generalConceptName = list_checker.checkForTerm2InSententialForm(term, "ranges_over");
				SBVR.Designation generalObjectTypeDesignation = list_checker.checkForObjectType(generalConceptName);
				SBVR.ObjectType generalObjectType = null;
				if(generalObjectTypeDesignation != null)
					generalObjectType = (SBVR.ObjectType) generalObjectTypeDesignation.getMeaning();
				
				// fact type role found in the list
				org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.role.factTypeRole.FactTypeRole factTypeRoleFactory = new org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.role.factTypeRole.FactTypeRole(thingList, conceptualSchema, attributesHandler);
				SBVR.Designation factTypeRoleDesignation2 = factTypeRoleFactory.create(term);
				factTypeRole = (SBVR.FactTypeRole) factTypeRoleDesignation2.getMeaning();
				if(generalObjectType != null)
					factTypeRole.getObjectType().add(generalObjectType);
				text = (SBVR.Text) factTypeRoleDesignation2.getExpression();
			}
		}
		else {
			factTypeRole = (FactTypeRole) plac.getMeaning();
			text = (SBVR.Text) plac.getExpression();
		}
		
		if(type.equals("first"))
			placeholder1 = super.createVetisPlaceholder(factTypeRole, text, integer1);
		else
			placeholder2 = super.createVetisPlaceholder(factTypeRole, text, integer2);
		
		return factTypeRole;
	}
	
	/**
	 * Create fact type
	 * @param addElementsToThingList
	 * @param synonymousForm
	 * @param checkForOpposite
	 * @return
	 */
	public boolean create(boolean addElementsToThingList, boolean synonymousForm, boolean checkForOpposite){
			
		if(safeContinue() == true){
			// create fact type roles

			if(createRoles(term_first, term_second, synonymousForm) == true) {
				// create designation for factType
	 			designation = super.createVetisDesignation(factType, text3); 
				
				// create sententialForm
				sententialForm = super.createVetisSententialForm(factType, text4); 
				
				// add placeholder1 to sentential form 
				if(placeholder1 != null)
					sententialForm.getDesignation().add(placeholder1);
				
				// add placeholder2 to sentential form
				if(placeholder2 != null)
					sententialForm.getDesignation().add(placeholder2);
				
				// create factSymbol
				factSymbol = super.createVetisFactSymbol(factType, text3);
				factSymbol.setPreferred(true);
				
				
				
				// add factType concept to conceptualSchema if same opposite fact type do not exists
				if(checkForOpposite == false || !super.list_checker.existsSameOrOppositeFactType(factTypeRole1, factTypeRole2)) {
					conceptualSchema.getConcept().add(factType);
					addElementsToThingList();
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else 
			return false;
	}
	
	/**
	 * Creates fact type roles
	 * @param first
	 * @param second
	 * @param synonymousForm
	 * @return
	 */
	protected boolean createRoles(String first, String second, boolean synonymousForm){
		if(!first.equals("") && factTypeRole1 == null) {
			if(!(factType instanceof SBVR.IsPropertyOfFactType))
				factTypeRole1 = findRole(first, "first", synonymousForm);
			else{
				factTypeRole1 = sbvr_factory.createFactTypeRole();
				// create placeholder1 for term1
				SBVR.Text attributeName = super.createVetisText(term_first);
				
				SBVR.Designation roleDes = list_checker.checkForRole2(term_first);
				
				if(roleDes == null) {
					BusinessModellerUtils.showWarningMessage("attribute '" + term_first + "' not defined or defined bellow the fact type");
					return false;
				}
				
				//factTypeRole1 = findRole(first, "first", synonymousForm);
				
				placeholder1 = super.createVetisPlaceholder(factTypeRole1, attributeName, integer1); 
			}
		}
			
		if(!second.equals("") && factTypeRole2 == null)
			factTypeRole2 = findRole(second, "second", synonymousForm);

		// add factTypeRole1 and factTypeRole2 for factType only when the role list is empty, to prevent from adding more than two roles
		if(factType.getRole().size() == 0) {
			if(factTypeRole1 != null)
				factType.getRole().add(factTypeRole1);
			if(factTypeRole2 != null)
				factType.getRole().add(factTypeRole2);
		}
		return true;
	}
	
	/**
	 * Check, if we have all required variables for fact type construction
	 * @return
	 */
	protected boolean safeContinue(){
		if(term_first != null && verb != null && term_second != null) { // equal factType not found	
			return true;
		}
		else {
			BusinessModellerUtils.showInfoMessage("vocabulary has duplicated fact type: " + primaryRepresentation);
			return false;
		}
		
	}
	
	/**
	 * Save all elements of the fact type to the appropriate lists
	 */
	protected void addElementsToThingList(){
		// add all created objects to thingList
		if(designation != null)
			thingList.add(designation);
		if(sententialForm != null)
			thingList.add(sententialForm);
		if(integer1 != null)
			thingList.add(integer1);
		if(text3 != null)
			thingList.add(text3);
		if(placeholder1 != null)
			thingList.add(placeholder1);
		if(integer2 != null)
			thingList.add(integer2);
		if(text4 != null)
			thingList.add(text4);
		if(placeholder2 != null)
			thingList.add(placeholder2);
		if(factSymbol != null)
			thingList.add(factSymbol);
	}
}