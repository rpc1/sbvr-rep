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
package org.dbe.businessModeller.XML;
import java.util.ArrayList;
import java.util.HashMap;
public class XMLElement{
	
	private String name;
	private String value;
	private HashMap<String, String> attributes;
	
	XMLElement parent;
	
	private ArrayList<XMLElement> contents;
	
	/**
	 * Constructor
	 */
	public XMLElement(){
		name = "";
		value = "";
		attributes = new HashMap<String, String>();
		
		parent = null;
		
		contents = new ArrayList<XMLElement>();
	}
	
	/**
	 * Name setter
	 * @param newName
	 */
	public void setName(String newName){
		name = newName;
	}
	/**
	 * Value setter
	 * @param newValue
	 */
	public void setValue(String newValue){
		value = newValue;
	}
	
	/**
	 * Name getter
	 * @return
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Value getter
	 * @return
	 */
	public String getValue(){
		return value;
	}
	
	/**
	 * Attributes setter
	 * @param newAttributes
	 */
	public void setAttributes(org.xml.sax.Attributes newAttributes){
		for(int i = 0; i < newAttributes.getLength(); i++){
			attributes.put(newAttributes.getQName(i), newAttributes.getValue(i));
		}
	}
	
	/**
	 * Attributes getter
	 * @return
	 */
	public HashMap<String, String> getAttributes(){
		return attributes;
	}
	
	/**
	 * Contents getter
	 * @return
	 */
	public ArrayList<XMLElement> getContents() {
		if (contents == null) {
			contents = new ArrayList<XMLElement>();
		}
		return contents;
	}
	
	/**
	 * Parent getter
	 * @return
	 */
	public XMLElement getParent(){
		return parent;
	}
	
	/**
	 * Parent setter
	 * @param parentNew
	 */
	public void setParent(XMLElement parentNew){
		parent = parentNew;
	}
}