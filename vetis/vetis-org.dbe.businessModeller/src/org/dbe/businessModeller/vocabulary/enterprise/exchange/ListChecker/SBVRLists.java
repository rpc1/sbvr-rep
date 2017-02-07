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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class SBVRLists {
	private EList<EObject> allTingsList = null; // common list for all sbvr objects
	private EList<SBVR.Designation> designationList = null; // list only for designations
	private EList<SBVR.Name> nameList = null; // list only for names
	private EList<SBVR.SententialForm> sententialFormList = null; // list only for sentential forms
	private EList<SBVR.Text> textList = null; // list only for texts
	private EList<SBVR.Placeholder> placeholderList = null; // list only for placeholders 
	private EList<SBVR.PositiveInteger> positiveIntegerList = null; // list only for positive integers
	private EList<SBVR.FactSymbol> factSymbolList = null; // list only for fact symbols
	private EList<SBVR.CategorizationScheme> categorizationSchemeList = null; //list only for categorization schemes
	private EList<SBVR.CategorizationType> categorizationTypeList = null; //list only for categorization types
	
	/**
	 * Constructor
	 */
	public SBVRLists(){
		allTingsList = new BasicEList<EObject>();
		designationList = new BasicEList<SBVR.Designation>();
		nameList = new BasicEList<SBVR.Name>();
		sententialFormList = new BasicEList<SBVR.SententialForm>();
		textList = new BasicEList<SBVR.Text>();
		placeholderList = new BasicEList<SBVR.Placeholder>();
		positiveIntegerList = new BasicEList<SBVR.PositiveInteger>();
		factSymbolList = new BasicEList<SBVR.FactSymbol>();
		categorizationSchemeList = new BasicEList<SBVR.CategorizationScheme>();
		categorizationTypeList = new BasicEList<SBVR.CategorizationType>();
	}
	
	/**
	 * Adder to list
	 * @param sbvrObject
	 */
	public void add(EObject sbvrObject){
		// first add object to common list
		allTingsList.add(sbvrObject);
		
		// now try to add object to other list, which will be used in object search operations
		if(sbvrObject instanceof SBVR.Designation)
			designationList.add((SBVR.Designation) sbvrObject);
		
		if(sbvrObject instanceof SBVR.Name)
			nameList.add((SBVR.Name) sbvrObject);
		
		if(sbvrObject instanceof SBVR.SententialForm)
			sententialFormList.add((SBVR.SententialForm) sbvrObject);
			
		if(sbvrObject instanceof SBVR.Text)
			textList.add((SBVR.Text) sbvrObject);
			
		if(sbvrObject instanceof SBVR.Placeholder)
			placeholderList.add((SBVR.Placeholder) sbvrObject);
			
		if(sbvrObject instanceof SBVR.PositiveInteger)
			positiveIntegerList.add((SBVR.PositiveInteger) sbvrObject);
			
		if(sbvrObject instanceof SBVR.FactSymbol)
			factSymbolList.add((SBVR.FactSymbol) sbvrObject);
		
		if(sbvrObject instanceof SBVR.CategorizationScheme)
			categorizationSchemeList.add((SBVR.CategorizationScheme) sbvrObject);
		
		if(sbvrObject instanceof SBVR.CategorizationType)
			categorizationTypeList.add((SBVR.CategorizationType) sbvrObject);
	}
	
	/**
	 * All elements list getter
	 * @return
	 */
	public EList<EObject> getAllTingsList(){
		return allTingsList;
	}
	
	/**
	 * Designation list getter
	 * @return
	 */
	public EList<SBVR.Designation> getDesignationList(){
		return designationList;
	}
	
	/**
	 * Name list getter
	 * @return
	 */
	public EList<SBVR.Name> getNameList(){
		return nameList;
	}
	
	/**
	 * Sentential forms list getter
	 * @return
	 */
	public EList<SBVR.SententialForm> getSententialFormList(){
		return sententialFormList;
	}
	
	/**
	 * Text list getter
	 * @return
	 */
	public EList<SBVR.Text> getTextList(){
		return textList;
	}
	
	/**
	 * Placeholders list getter
	 * @return
	 */
	public EList<SBVR.Placeholder> getPlaceholderList(){
		return placeholderList;
	}
	
	/**
	 * Positive integers list getter 
	 * @return
	 */
	public EList<SBVR.PositiveInteger> getPositiveIntegerList(){
		return positiveIntegerList;
	}
	
	/**
	 * Fact symbols list getter
	 * @return
	 */
	public EList<SBVR.FactSymbol> getFactSymbolList(){
		return factSymbolList;
	}
	
	/**
	 * Categorization schemes list getter
	 * @return
	 */
	public EList<SBVR.CategorizationScheme> getCategorizationSchemeList(){
		return categorizationSchemeList;
	}
	
	/**
	 * Categorization types list getter
	 * @return
	 */
	public EList<SBVR.CategorizationType> getCategorizationTypeList(){
		return categorizationTypeList;
	}
	
}
