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
 * Creato il 16-nov-2005
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.enterprise.exchange;


import java.io.File;
import java.io.IOException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import org.dbe.businessModeller.IBusinessModellerDocument;
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;

public abstract class Exporter {
	// modified 2009 04 02
	
	protected ResourceSet resourceSet;
	protected Resource poResource;
	
	protected SBVRLists thingList;
	
	protected SBVR.ConceptualSchema conceptualSchema;
	
	protected boolean preferred = false;
	
	// xmi output file
	protected File xmiFile;
	
	// vocabulary input file
	protected File vocFile;
	
	// ruleset input file
	protected File rulesFile;
	
	// xmi file encoding
	private String encoding = "cp1257";
	
	// xmi file version
	private String xmiVersion = "2.1";
	
	public abstract void parseAndExportVocabulary(int saveToFile);
	public abstract void parseAndExportRuleset();
	public abstract String toProlog(IBusinessModellerDocument vocabulary);
	public abstract void setResource(Resource newPoResource);
	public abstract Resource getResource();
	public abstract void setThingList(SBVRLists newThingList);
	public abstract SBVRLists getThingList();
	public abstract void setConceptualSchema(SBVR.ConceptualSchema newConceptualSchema);
	public abstract SBVR.ConceptualSchema getConceptualSchema();

	/**
	 * Set xmi file 
	 * @param newXMIFile
	 */
	public void setXMIFile(File newXMIFile){
		xmiFile = newXMIFile;
		try {
			xmiFile.createNewFile();
		} catch (IOException e) {}
	}
	
	/**
	 * Get xmi file
	 * @return xmi file
	 */
	public File getXMIFile(){
		return xmiFile;
	}
	
	/**
	 * Set vocabulary file
	 * @param newVocFile
	 */
	public void setVocFile(File newVocFile){
		vocFile = newVocFile;
		try {
			vocFile.createNewFile();
		} catch (IOException e) {}
	}
	
	/**
	 * Get vocabulary file
	 * @return vocabulary file
	 */
	public File getVocFile(){
		return vocFile;
	}
	
	/**
	 * Set rules file
	 * @param newRulesFile
	 */
	public void setRulesFile(File newRulesFile){
		rulesFile = newRulesFile;
		try {
			rulesFile.createNewFile();
		} catch (IOException e) {}
	}
	
	/**
	 * Get rules file 
	 * @return rules file
	 */
	public File getRulesFile(){
		return rulesFile;
	}
	
	/**
	 * Serialiase resource to xmi file
	 */
	protected void saveResourceTofile(){
		try
		{
			// set options for xmi generating
			final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
			saveOptions.put(XMLResource.OPTION_ENCODING, encoding); // set encoding
			saveOptions.put(XMIResource.VERSION_NAME, xmiVersion); // set xmi version 
			saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, true); // set xmi:type
			poResource.save(saveOptions); // generate XMI
			
		}
		catch(Exception exception) {}
	}

	/**
	 * Write all elements from thingList to resource
	 */
	protected void putElementsFromThingListToResource(){
		for(Iterator<EObject> i = thingList.getAllTingsList().iterator(); i.hasNext();){
			EObject obj = i.next();
			if(obj != null)
				poResource.getContents().add(obj);
		}
	}
	
	/**
	 *  Read generated xmi file and return string contents of it
	 * @return xmi contents as string
	 */
	public String readXMIFile(){
		BusinessModellerUtils utils = new BusinessModellerUtils();
		return utils.readFile(xmiFile);
	}

}
