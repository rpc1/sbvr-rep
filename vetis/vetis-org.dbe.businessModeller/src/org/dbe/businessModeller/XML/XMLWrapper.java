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
import java.io.IOException;
import java.io.InputStream;
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.utils.ResourceProvider;
import org.xml.sax.SAXException;
public class XMLWrapper{
	
	private VetisContentHandler contentHandler;
	private org.xml.sax.XMLReader reader;
	
	/**
	 * Constructor
	 */
	public XMLWrapper(){
		contentHandler = new VetisContentHandler();
		
		try {
			XML xml = new XML();
			reader = xml.makeXMLReader(); 
			reader.setContentHandler(contentHandler); 
		}
		catch(Exception e){
		    e.printStackTrace();
		}
	}
	
	/**
	 * Language document getter
	 * @return
	 */
	public XMLDocument getLanguageDocument(){
		
		InputStream inputStream = null;
		try {
			inputStream = ResourceProvider.getInputStream("language/config.xml");
			reader.parse(new org.xml.sax.InputSource(inputStream));
			
			XMLDocument config = contentHandler.getDocument();
			inputStream = ResourceProvider.getInputStream("language/" + config.getElement("language").getValue() + ".xml");
			reader.parse(new org.xml.sax.InputSource(inputStream));
			
		} catch (IOException e) {
			BusinessModellerUtils.showMessage("Configuration or language file not found");
		} catch (SAXException e) {
		}
		return contentHandler.getDocument();
	}
}