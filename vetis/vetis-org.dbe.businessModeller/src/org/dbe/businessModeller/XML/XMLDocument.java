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
public class XMLDocument{
	
	private XMLElement rootEntry;
	
	/**
	 * Constructor
	 */
	public XMLDocument(){
		rootEntry = null;
	}
	
	/**
	 * Root XML entry setter
	 * @param entry
	 */
	public void setRootEntry(XMLElement entry){
		rootEntry = entry;
	}
	
	/**
	 * Root XML entry getter
	 * @return
	 */
	public XMLElement getRootEntry(){
		return rootEntry;
	}
	
	/**
	 * Child elements getter
	 * @param key
	 * @return
	 */
	public XMLElement getElement(String key){
		//return rootEntry.getContents().get(0).getContents().get(i);
		return searchRecursively(rootEntry, key);
	}
	
	/**
	 * Element searcher for given parent entry
	 * @param entry
	 * @param key
	 * @return
	 */
	private XMLElement searchRecursively(XMLElement entry, String key){
		String entryName = entry.getName();
		if(entryName.equals(key)){
			return entry;
		}
		else{
			for(int i = 0; i < entry.getContents().size(); i++){
				XMLElement entr = entry.getContents().get(i);
				XMLElement e = searchRecursively(entr, key);
				if(e != null){
					return e;
				}
			}
		}
		return null;
	}
}