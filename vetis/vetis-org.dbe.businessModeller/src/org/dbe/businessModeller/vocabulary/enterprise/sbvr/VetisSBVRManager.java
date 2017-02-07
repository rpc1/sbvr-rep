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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr;

import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.*;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;

import SBVR.impl.SBVRFactoryImpl;


public class VetisSBVRManager {
	
	/**
	 * Lists for saving SBVR components
	 */
	protected SBVRLists thingList;
	
	/**
	 * SBVR conceptual schema
	 */
	protected SBVR.ConceptualSchema conceptualSchema;
	
	/**
	 * SBVR elements factory
	 */
	protected SBVR.impl.SBVRFactoryImpl sbvr_factory;
	
	/**
	 * SBVR lists checker
	 */
	protected ListChecker list_checker;
	
	/**
	 * Attributes handler
	 */
	protected VocabularyAttributesHandler attributesHandler;
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newAttributesHandler
	 */
	public VetisSBVRManager(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, VocabularyAttributesHandler newAttributesHandler){
		thingList = newThingList;
		conceptualSchema = newConceptualSchema;
		attributesHandler = newAttributesHandler;
		sbvr_factory = new SBVRFactoryImpl();
		list_checker = new ListChecker(this.thingList);
	}
	
	/**
	 * Create SBVR text element
	 * @param textValue
	 * @return
	 */
	public SBVR.Text createVetisText(String textValue){
		SBVR.Text text = list_checker.checkForText(textValue); 
		if(text == null){
			text = sbvr_factory.createText();
			text.setValue(textValue);
		}
		return text;
	}
	
	/**
	 * Create SBVR positive integer element
	 * @param integerValue
	 * @return
	 */
	public SBVR.PositiveInteger createVetisPositiveInteger(int integerValue){
		SBVR.PositiveInteger positiveInteger = list_checker.checkForPositiveInteger(integerValue); 
		if(positiveInteger == null){
			positiveInteger = sbvr_factory.createPositiveInteger();
			positiveInteger.setValue(integerValue);
		}
		return positiveInteger;
	}
	
	/**
	 * Create SBVR designation element
	 * @param meaning
	 * @param expression
	 * @return
	 */
	public SBVR.Designation createVetisDesignation(SBVR.Meaning meaning, SBVR.Expression expression){
		SBVR.Designation designation = sbvr_factory.createDesignation();
		designation.setMeaning(meaning);
		designation.setExpression(expression);
		return designation;
	}
	
	/**
	 * Create SBVR term element
	 * @param meaning
	 * @param expression
	 * @return
	 */
	public SBVR.Term createVetisTerm(SBVR.Meaning meaning, SBVR.Expression expression){
		SBVR.Term term = sbvr_factory.createTerm();
		term.setMeaning(meaning);
		term.setExpression(expression);
		return term;
	}

	/**
	 * Create SBVR name element
	 * @param meaning
	 * @param expression
	 * @return
	 */
	public SBVR.Name createVetisName(SBVR.Meaning meaning, SBVR.Expression expression){
		SBVR.Name name = sbvr_factory.createName();
		name.setMeaning(meaning);
		name.setExpression(expression);
		return name;
	}
	
	/**
	 * Create SBVR placeholder element
	 * @param meaning
	 * @param expression
	 * @param isAtStartingCharacterPosition
	 * @return
	 */
	public SBVR.Placeholder createVetisPlaceholder(SBVR.Meaning meaning, SBVR.Expression expression, SBVR.PositiveInteger isAtStartingCharacterPosition){
		SBVR.Placeholder placeholder = sbvr_factory.createPlaceholder();
		placeholder.setMeaning(meaning);
		placeholder.setExpression(expression);
		placeholder.setIsAtStartingCharacterPosition(isAtStartingCharacterPosition);
		return placeholder;
	}
	
	
	/**
	 * Create SBVR sentential form element
	 * @param meaning
	 * @param expression
	 * @return
	 */
	public SBVR.SententialForm createVetisSententialForm(SBVR.Meaning meaning, SBVR.Expression expression){
		SBVR.SententialForm sententialForm = sbvr_factory.createSententialForm();
		sententialForm.setMeaning(meaning);
		sententialForm.setExpression(expression);
		return sententialForm;
	}
	
	/**
	 * Create SBVR fact symbol element
	 * @param meaning
	 * @param expression
	 * @return
	 */
	public SBVR.FactSymbol createVetisFactSymbol(SBVR.Meaning meaning, SBVR.Expression expression){
		SBVR.FactSymbol factSymbol = sbvr_factory.createFactSymbol();
		factSymbol.setMeaning(meaning);
		factSymbol.setExpression(expression);
		return factSymbol;
	}
}