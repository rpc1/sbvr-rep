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
package org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import SBVR.Text;
import SBVR.impl.FactTypeImpl;

public class ListChecker{

	private SBVRLists thingList;
	
	/**
	 * Constructor
	 * @param newThingsList
	 */
	public ListChecker(SBVRLists newThingsList){
		this.thingList = newThingsList;
	}
	
	/**
	 * Finds object type by given name
	 * @param searchObjectText - object type name
	 * @return designation of the object type
	 */
	public SBVR.Designation checkForObjectType(String searchObjectText){
		SBVR.Designation temp;
		SBVR.Designation designation = null;
		
		if(this.thingList != null) {
			for(Iterator<SBVR.Designation> i = thingList.getDesignationList().iterator();i.hasNext();){
				temp = i.next();
				EObject tempMeaning = ((SBVR.impl.DesignationImpl) temp).getMeaning();
				if(tempMeaning instanceof SBVR.impl.ObjectTypeImpl){ // check only those designations, which meaning is object type
					SBVR.Text text = (SBVR.Text) ((SBVR.impl.DesignationImpl) temp).getExpression();// get text of the designation
					String textValue = text.getValue();
					// if text of the designation equals to our wanted text, get objectType of the designation
					if(textValue.equals(searchObjectText)){
						designation = (SBVR.Designation)temp;
						break;
					}
				}
			}
		}
		return designation;
	}
	
	/**
	 * Finds fact type role, without object type, by given name
	 * @param searchObjectText - name of the role
	 * @return designation of the role
	 */
	public SBVR.Designation checkForFactTypeRole(String searchObjectText){
		SBVR.Designation temp;
		SBVR.Designation designation = null;
		
		if(this.thingList != null) {
			for(Iterator<SBVR.Designation> i = thingList.getDesignationList().iterator();i.hasNext();){
				temp = i.next();
				EObject tempMeaning = ((SBVR.impl.DesignationImpl) temp).getMeaning();
				if(tempMeaning instanceof SBVR.impl.FactTypeRoleImpl){ // check only those designations, which meaning is object type
					EList<SBVR.ObjectType> objectType = ((SBVR.impl.FactTypeRoleImpl) tempMeaning).getObjectType();
					if(objectType.size() == 0) {
						SBVR.Text text = (SBVR.Text) ((SBVR.impl.DesignationImpl) temp).getExpression();// get text of the designation
						if(text != null) {
							String textValue = text.getValue();
							// if text of the designation equals to our wanted text, get objectType of the designation
							if(textValue.equals(searchObjectText)){
								designation = (SBVR.Designation)temp;
								break;
							}
						}
					}
				}
			}
		}
		return designation;
	}
	
	/**
	 * Finds fact type role, having object type, by given name
	 * @param searchObjectText - name of the role
	 * @return designation of the role
	 */
	public SBVR.Designation checkForFactTypeRole2(String searchObjectText){
		SBVR.Designation temp;
		SBVR.Designation designation = null;
		
		if(this.thingList != null) {
			for(Iterator<SBVR.Designation> i = thingList.getDesignationList().iterator();i.hasNext();){
				temp = i.next();
				EObject tempMeaning = ((SBVR.impl.DesignationImpl) temp).getMeaning();
				if(tempMeaning instanceof SBVR.impl.FactTypeRoleImpl){ // check only those designations, which meaning is object type
					EList<SBVR.ObjectType> objectType = ((SBVR.impl.FactTypeRoleImpl) tempMeaning).getObjectType();
					if(objectType.size() > 0) {
						SBVR.Text text = (SBVR.Text) ((SBVR.impl.DesignationImpl) temp).getExpression();// get text of the designation
						if(text != null) {
							String textValue = text.getValue();
							// if text of the designation equals to our wanted text, get objectType of the designation
							if(textValue.equals(searchObjectText)){
								designation = (SBVR.Designation)temp;
								break;
							}
						}
					}
				}
			}
		}
		return designation;
	}
	
	/**
	 * Finds role by given name
	 * @param searchObjectText - name of the role
	 * @return designation of the role
	 */
	public SBVR.Placeholder checkForRole(String searchObjectText){
		SBVR.Placeholder temp;
		SBVR.Placeholder placeholder = null;
		
		if(this.thingList != null) {
			for(Iterator<SBVR.Placeholder> i = thingList.getPlaceholderList().iterator();i.hasNext();){
				temp = i.next();
				EObject tempMeaning = ((SBVR.impl.PlaceholderImpl) temp).getMeaning();
				if(tempMeaning instanceof SBVR.impl.RoleImpl){ // check only those placeholders, which meaning is object type					
					SBVR.Text text = (Text) temp.getExpression();
				
					if(text != null) {
						String textValue = text.getValue();
						// if text of the designation equals to our wanted text, get objectType of the designation
						if(textValue.equals(searchObjectText)){
							placeholder = (SBVR.Placeholder)temp;
							break;
						}
					}
				}
			}
		}
		return placeholder;
	}
	
	/**
	 * Finds role by given name in designation list
	 * @param searchObjectText - name of the role
	 * @return designation of the role
	 */
	public SBVR.Designation checkForRole2(String searchObjectText){
		SBVR.Designation temp;
		SBVR.Designation designation = null;
		
		if(this.thingList != null) {
			for(Iterator<SBVR.Designation> i = thingList.getDesignationList().iterator();i.hasNext();){
				temp = i.next();
				EObject tempMeaning = ((SBVR.impl.DesignationImpl) temp).getMeaning();
				if(tempMeaning instanceof SBVR.impl.RoleImpl){ // check only those placeholders, which meaning is object type					
					SBVR.Text text = (Text) temp.getExpression();
					if(text != null) {
						String textValue = text.getValue();
						// if text of the designation equals to our wanted text, get objectType of the designation
						if(textValue.equals(searchObjectText)){
							designation = (SBVR.Designation)temp;
							break;
						}
					}
				}
			}
		}
		return designation;
	}
	
	/**
	 * Finds individual concept by given name
	 * @param searchObjectText - individual concept name
	 * @return designation of the individual concept
	 */
	public SBVR.Name checkForIndividualConcept(String searchIndividualConceptText){
		SBVR.Name temp;
		SBVR.Name name = null;
		
		if(this.thingList != null) {
			for(Iterator<SBVR.Name> i = thingList.getNameList().iterator();i.hasNext();){
				temp = i.next();
				EObject tempMeaning = ((SBVR.impl.DesignationImpl) temp).getMeaning();
				if(tempMeaning instanceof SBVR.impl.IndividualConceptImpl){ // check only those designations, which meaning is individual concept
					SBVR.Text text = (SBVR.Text) ((SBVR.impl.DesignationImpl) temp).getExpression();// get text of the designation
					String textValue = text.getValue();
					// if text of the designation equals to our wanted text, get objectType of the designation
					if(textValue.equals(searchIndividualConceptText)){
						name = (SBVR.Name)temp;
						break;
					}
				}
			}
		}
		return name;
	}
	
	/**
	 * Finds categorization type by given name
	 * @param searchObjectText - categorization type name
	 * @return designation of the categorization type
	 */
	public SBVR.Designation checkForCategorizationType(String searchCategorizationTypeText){
		SBVR.Designation temp;
		SBVR.Designation designation = null;
		
		if(this.thingList != null) {
			for(Iterator<SBVR.Designation> i = thingList.getDesignationList().iterator();i.hasNext();){
				temp = i.next();
				EObject tempMeaning = ((SBVR.impl.DesignationImpl) temp).getMeaning();
				if(tempMeaning instanceof SBVR.impl.CategorizationTypeImpl){ // check only those designations, which meaning is individual concept
					SBVR.Text text = (SBVR.Text) ((SBVR.impl.DesignationImpl) temp).getExpression();// get text of the designation
					String textValue = text.getValue();
					// if text of the designation equals to our wanted text, get objectType of the designation
					if(textValue.equals(searchCategorizationTypeText)){
						designation = (SBVR.Designation)temp;
						break;
					}
				}
			}
		}
		return designation;
	}
	
	/**
	 * Finds designation by given object type
	 * @param object - object type
	 * @return designation of the object type
	 */
	public SBVR.Designation getDesignationByObjectType(SBVR.ObjectType object){
		SBVR.Designation temp;
		SBVR.Designation designation = null;

		if(this.thingList != null) {
			for(Iterator<SBVR.Designation> i = thingList.getDesignationList().iterator();i.hasNext();){
				temp = i.next();
				EObject tempMeaning = ((SBVR.impl.DesignationImpl) temp).getMeaning();
				if(tempMeaning instanceof SBVR.impl.ObjectTypeImpl){ // check only those designations, which meaning is object type
					// if objectType of the designation equals to our wanted objectType, get the designation of it
					if(tempMeaning.equals(object)){
						designation = (SBVR.Designation)temp;
						break;
					}
				}
			}
		}
		return designation;		
	}
	
	/**
	 * Finds placeholder by given fact type role
	 * @param object - fact tpe role
	 * @return designation of the fact type role
	 */
	public SBVR.Placeholder getPlaceholderByFactTypeRole(SBVR.FactTypeRole role){
		SBVR.Placeholder temp;
		SBVR.Placeholder placeholder = null;

		if(this.thingList != null) {
			for(Iterator<SBVR.Placeholder> i = thingList.getPlaceholderList().iterator();i.hasNext();){
				temp = i.next();
				EObject tempMeaning = ((SBVR.impl.DesignationImpl) temp).getMeaning();
				if(tempMeaning instanceof SBVR.impl.FactTypeRoleImpl){ // check only those designations, which meaning is object type
					// if objectType of the designation equals to our wanted objectType, get the designation of it
					if(tempMeaning.equals(role)){
						placeholder = (SBVR.Placeholder)temp;
						break;
					}
				}
			}
		}
		return placeholder;		
	}
	
	/**
	 * Finds designation by given individual concept
	 * @param individualConcept
	 * @return designation of the individual concept
	 */
	public SBVR.Name getNameByIndividualConcept(SBVR.IndividualConcept individualConcept){
		SBVR.Name temp;
		SBVR.Name name = null;
		
		if(this.thingList != null) {
			for(Iterator<SBVR.Name> i = thingList.getNameList().iterator();i.hasNext();){
				temp = i.next();
				EObject tempMeaning = ((SBVR.impl.DesignationImpl) temp).getMeaning();
				if(tempMeaning instanceof SBVR.impl.IndividualConceptImpl){ // check only those designations, which meaning is individual concept
					// if individual concept of the designation equals to our wanted objectType, get the designation of it
					if(tempMeaning.equals(individualConcept)){
						name = (SBVR.Name)temp;
						break;
					}
				}
			}
		}
		return name;		
	}
	
	/**
	 * Finds sentential form of the given fact type
	 * @param fact fact type
	 * @return sentential form of the fact type
	 */
	public SBVR.SententialForm getSententialFormByFactType(SBVR.FactType fact){
		SBVR.SententialForm temp;
		SBVR.SententialForm sententialForm = null;
		
		if(this.thingList != null) {
			for(Iterator<SBVR.SententialForm> i = thingList.getSententialFormList().iterator();i.hasNext();){
				temp = i.next();
				SBVR.FactType tempMeaning = (SBVR.FactType) ((SBVR.impl.SententialFormImpl) temp).getMeaning();
				if(tempMeaning instanceof SBVR.impl.FactTypeImpl){ // check only those designations, which meaning is object type
					// if objectType of the designation equals to our wanted objectType, get the designation of it
					if(tempMeaning.equals(fact)){
						sententialForm = (SBVR.SententialForm)temp;
						break;
					}
				}
			}
		}
		return sententialForm;		
	}
	
	/**
	 * Finds sentential form of the given primary representation
	 * @param fact fact type
	 * @return sentential form of the primary representation
	 */
	public SBVR.SententialForm getSententialFormByPrimaryRepresentation(String primaryRepresentation){
		SBVR.SententialForm temp;
		SBVR.SententialForm sententialForm = null;
		
		if(this.thingList != null) {
			for(Iterator<SBVR.SententialForm> i = thingList.getSententialFormList().iterator();i.hasNext();) {
				temp = i.next();
				SBVR.Text tempExpression = (SBVR.Text) ((SBVR.impl.SententialFormImpl) temp).getExpression();
				
				if(tempExpression.getValue().equals(primaryRepresentation)) {
					sententialForm = (SBVR.SententialForm)temp;
				}
			}
		}
		return sententialForm;		
	}
	
	/**
	 * Returns text object by given text string 
	 * @param searchObjectText
	 * @return
	 */
	public SBVR.Text checkForText(String searchObjectText){
		SBVR.Text temp;
		SBVR.Text text = null;
		
		if(thingList != null) {
			for(Iterator<SBVR.Text> i = thingList.getTextList().iterator();i.hasNext();){
				temp = i.next();
				String textValue = (String) ((SBVR.impl.TextImpl) temp).getValue(); // get text of the designation
				if(textValue.equals(searchObjectText)){ // if text of the designation equals to our wanted text, get objectType of the designation
					text = (SBVR.impl.TextImpl) temp;
					break;
				}
			}
		}
		return text;
	}
	
	public SBVR.Placeholder checkForPlaceholder(String searchObjectText){
		SBVR.Placeholder temp;
		SBVR.Placeholder placeholder = null;

		if(this.thingList != null) {
			for(Iterator<SBVR.Placeholder> i = thingList.getPlaceholderList().iterator();i.hasNext();){
				temp = i.next();
				SBVR.Text text = (SBVR.Text) ((SBVR.impl.PlaceholderImpl) temp).getExpression();// get text of the designation
				String textValue = text.getValue();
				// if text of the designation equals to our wanted text, get objectType of the designation
				if(textValue.equals(searchObjectText)){
					placeholder = (SBVR.Placeholder) temp;
					break;
				}
			}
		}
		return placeholder;
	}
	
	public SBVR.PositiveInteger checkForPositiveInteger(int searchInteger){
		SBVR.PositiveInteger temp;
		SBVR.PositiveInteger integer = null;

		if(this.thingList != null) {
			for(Iterator<SBVR.PositiveInteger> i = thingList.getPositiveIntegerList().iterator();i.hasNext();){
				temp = i.next();
				Integer integ = ((SBVR.impl.PositiveIntegerImpl) temp).getValue();// get text of the placeholder
				if(integ.equals(searchInteger)){
					integer = (SBVR.PositiveInteger) temp;
					break;
				}
			}
		}
		return integer;
	}
	
	public SBVR.impl.FactTypeImpl checkForFactType(String factNameWanted){
		SBVR.SententialForm temp;
		SBVR.impl.FactTypeImpl factType = null;

		if(this.thingList != null) {			
			for (Iterator<SBVR.SententialForm> i = thingList.getSententialFormList().iterator();i.hasNext();){
				temp = i.next(); 
				SBVR.Text text = (SBVR.Text) ((SBVR.impl.SententialFormImpl) temp).getExpression();	
				if(text.getValue().equals(factNameWanted)){
					factType = (FactTypeImpl) ((SBVR.impl.SententialFormImpl) temp).getMeaning();
					break;
				}
			}
		}
		return factType;
	}
	
	/**
	 * Get term2 of the fact type, which has given term1 and verb
	 * @param term1
	 * @param verb
	 * @return
	 */
	public String checkForTerm2InSententialForm(String term1, String verb){
		SBVR.SententialForm temp;
		String founTerm2 = "";

		for (Iterator<SBVR.SententialForm> i = thingList.getSententialFormList().iterator();i.hasNext();){
			temp = i.next();
			SBVR.Text text = (SBVR.Text) ((SBVR.impl.SententialFormImpl) temp).getExpression();
			String t = text.getValue();
			String[] t2 = t.split(" ");
			if(t2.length > 2) {
				if(t2[0].equals(term1) && t2[1].equals(verb)){
					founTerm2 = t2[2];
					break;
				}
			}
		}
		return founTerm2;
	}
	
	/**
	 * Get list of the fact symbols with meaning of factType
	 * @param factType
	 * @return list of fact symbols with meaning of the given fact type
	 */
	public EList<SBVR.FactSymbol> checkForFactSymbol(SBVR.FactType factType) {
		SBVR.FactSymbol temp;
		EList<SBVR.FactSymbol> factSymbols = new  BasicEList<SBVR.FactSymbol>();

		for (Iterator<SBVR.FactSymbol> i = thingList.getFactSymbolList().iterator();i.hasNext();){
			temp = i.next();
			if(((SBVR.impl.FactSymbolImpl) temp).getMeaning() instanceof SBVR.FactType) {
				SBVR.FactType fact = (SBVR.FactType)((SBVR.impl.FactSymbolImpl) temp).getMeaning();
				if(fact.equals(factType)){ // fact type of the fact symbol is the same, put it in the list
					factSymbols.add((SBVR.impl.FactSymbolImpl)temp);
				}
			}
		}
		return factSymbols;
	}
	
	/**
	 * Get categorization scheme by categorization type
	 * @param factType
	 * @return categorizationScheme
	 */
	public SBVR.CategorizationScheme checkForCategorizationScheme(SBVR.CategorizationType categorizationType) {
		SBVR.CategorizationScheme temp;
		SBVR.CategorizationScheme categorizationScheme = null;

		for (Iterator<SBVR.CategorizationScheme> i = thingList.getCategorizationSchemeList().iterator();i.hasNext();){
			temp = i.next();
			try {
				if(temp.getIsBasedOn().equals(categorizationType)) {
					categorizationScheme = temp;
					break;
				}
			}
			catch(NullPointerException e) {}
			
		}
		return categorizationScheme;
	}
	
	/**
	 * Get categorization scheme by categorization type
	 * @param factType
	 * @return categorizationScheme
	 */
	public SBVR.ObjectType checkForGeneralConceptFactTypeRole(SBVR.FactTypeRole factTypeRole) {
		SBVR.SententialForm temp;
		SBVR.ObjectType generalObjectType = null;

		for (Iterator<SBVR.SententialForm> i = thingList.getSententialFormList().iterator();i.hasNext();){
			temp = i.next();
			try {				
				if(temp.getMeaning() instanceof SBVR.IsRoleOfFactType) {
					SBVR.IsRoleOfFactType factType = (SBVR.IsRoleOfFactType) temp.getMeaning();
					if(factType.getRole().get(0).equals(factTypeRole)) {
						generalObjectType = factType.getRole().get(1).getObjectType().get(0);
						break;
					}
				}
			}
			catch(NullPointerException e) {}
			
		}
		return generalObjectType;
	}
	
	/**
	 * Checks, if given synonymous fact type has opposite direction
	 * @return opposite
	 */
	public boolean isOppositeFactType(SBVR.FactType factType, String primaryRepresentation) {
	
		boolean opposite = false;
		
		// split primary representation
		String [] temp = primaryRepresentation.split(" ");
		
		try {
			// get term1
			String term1 = temp[0];
			
			// get first fact type role
			SBVR.FactTypeRole role = factType.getRole().get(0);
			
			// find placeholder of it
			SBVR.Placeholder rolePl = this.getPlaceholderByFactTypeRole(role);
			
			// get text of it
			SBVR.Text roleText = (SBVR.Text) rolePl.getExpression();
			
			// if term1 not equal value of first role, fact type is opposite 
			if(!roleText.getValue().equals(term1)) {
				opposite = true;
			}
		}
		catch(NullPointerException e){}
		catch(IndexOutOfBoundsException e){}

		return opposite;
	}
	
	/**
	 * Checks, if exists the same fact type, but with opposite role direction
	 * @param role1
	 * @param role2
	 * @return true, if the same fact type exists, false, opposite
	 */
	public boolean existsSameOrOppositeFactType(SBVR.FactTypeRole role1, SBVR.FactTypeRole role2) {
		SBVR.SententialForm temp;
		for (Iterator<SBVR.SententialForm> i = thingList.getSententialFormList().iterator();i.hasNext();){
			temp = i.next();
			try {
				EList<SBVR.FactTypeRole> roleList = ((SBVR.FactType)temp.getMeaning()).getRole();
				if(roleList.size() > 1) {
					SBVR.FactTypeRole r1 = (SBVR.FactTypeRole)roleList.get(0);
					SBVR.FactTypeRole r2 = (SBVR.FactTypeRole)roleList.get(1);
					SBVR.ObjectType o1 = (SBVR.ObjectType)r1.getObjectType().get(0);
					SBVR.ObjectType o2 = (SBVR.ObjectType)r2.getObjectType().get(0);
					
					SBVR.ObjectType objectType1 = role1.getObjectType().get(0);
					SBVR.ObjectType objectType2 = role2.getObjectType().get(0);
					
					if((o1.equals(objectType2) && o2.equals(objectType1)) || (o1.equals(objectType1) && o2.equals(objectType2))) {
						return true;
					}
					
				}
				else {
					return false; // it is characteristic
				}
			}
			catch(NullPointerException e) {}
			catch(Exception e) {}
		}
		return false;
	}
}