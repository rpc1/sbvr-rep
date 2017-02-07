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
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
public class VetisContentHandler implements ContentHandler {
	
	private int depth;
	private XMLElement current;
	private XMLDocument document;
	
	/**
	 * Constructor
	 */
	public VetisContentHandler(){
		depth = 0;
		current = null;
		document = new XMLDocument();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.xml.sax.ContentHandler#startDocument()
	 */
	public void startDocument() {
		depth = 0;
		current = null;
		document = new XMLDocument();
	}
	 
	/*
	 * (non-Javadoc)
	 * @see org.xml.sax.ContentHandler#endDocument()
	 */
	public void endDocument() {
		depth = 0;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.xml.sax.ContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	final public void startElement(final String namespace, final String localname, final String type, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException { 
		depth++;		
		
		XMLElement element = new XMLElement();
		element.setName(type);
		
		if(attributes.getLength() > 0) {
			element.setAttributes(attributes);
		}
		
		if(depth == 1){
			document.setRootEntry(element);
		}
		else{
			if(current != null){
				element.setParent(current);
				current.getContents().add(element);
			}
		}
		current = element;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.xml.sax.ContentHandler#endElement(java.lang.String, java.lang.String, java.lang.String)
	 */
	final public void endElement(final String namespace, final String localname,  final String type) throws org.xml.sax.SAXException { 
		current = current.getParent();
		depth--;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.xml.sax.ContentHandler#characters(char[], int, int)
	 */
	final public void characters(final char[] ch, final int start, final int len) { 
		final String text = new String( ch, start, len ); 
		final String text1 = text.trim(); 
		current.setValue(text1);
	}
	
	/*
	 * 
	 */
	public XMLDocument getDocument() {
		return document;
	}
	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ignorableWhitespace(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void processingInstruction(String target, String data)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setDocumentLocator(Locator locator) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void skippedEntity(String name) throws SAXException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void startPrefixMapping(String prefix, String uri)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}
	
}