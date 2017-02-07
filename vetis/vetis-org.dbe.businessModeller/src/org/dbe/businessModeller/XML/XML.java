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

public class XML {
	
	/**
	 * Create a new XML reader
	 */
	public org.xml.sax.XMLReader makeXMLReader()  throws Exception { 
		final javax.xml.parsers.SAXParserFactory saxParserFactory = javax.xml.parsers.SAXParserFactory.newInstance(); 
		final javax.xml.parsers.SAXParser saxParser = saxParserFactory.newSAXParser(); 
		final org.xml.sax.XMLReader parser = saxParser.getXMLReader(); 
		return parser; 
	}
}