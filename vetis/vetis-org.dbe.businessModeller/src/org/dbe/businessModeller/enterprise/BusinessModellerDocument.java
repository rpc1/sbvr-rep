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
 * Creato il 17-nov-2005
 * @author Pierpaolo Cira
 */
/*
 * Modified 2009.11.20 by Vetis project
 */
package org.dbe.businessModeller.enterprise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.IBusinessModellerDocument;
import org.dbe.businessModeller.vocabulary.enterprise.RuleSet;
import org.dbe.businessModeller.vocabulary.enterprise.Vocabulary;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttribute;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;

public class BusinessModellerDocument implements IBusinessModellerDocument{

	/** 
	 * @uml.property name="vocabularyEntries"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="vocabulary:org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry"
	 */
	protected Collection entries;
	/** 
	 * HashMap containing each vocabulary entry line number in the
	 * edited document as key (Integer field), and its primary
	 * representation as value (String field).
	 */
	protected HashMap entryPosition;
	
	protected String name;
	protected String description;
	protected String note;
	protected String source;
	
	/**
	 * @return Return entryPosition.
	 */
	public HashMap getEntryPosition() {
		return entryPosition;
	}

	/**
	 * @param Set entryPosition.
	 */
	public void setEntryPosition(HashMap vocabularyEntryPosition) {
		this.entryPosition = vocabularyEntryPosition;
	}

	public boolean hasEntry(String representation){
		return (entryPosition.containsKey(representation) || entryPosition.containsValue(representation));
	}
	
	public VocabularyEntry getEntry(String representation){
		Iterator i = entries.iterator();
		while (i.hasNext()){
			VocabularyEntry vocEntr = (VocabularyEntry)i.next();
			if (vocEntr.getPrimaryRepresentation().toString().equals(representation))
				return vocEntr;
		}
		return null;
	}
	
	public boolean hasEntry(VocabularyEntry entry){
		String representation=entry.getPrimaryRepresentation().toString();
		return this.hasEntry(representation);
	}
	
	/**
	 * Checks, if vocabulary has entry with given attribute
	 * @param caption
	 * @param value
	 * @return
	 */
	public boolean hasAttribute(String caption, String value) {
		Iterator i = entries.iterator();
		while (i.hasNext()){
			VocabularyEntry vocEntr = (VocabularyEntry)i.next();
			Collection atts = vocEntr.getAttributes();
			if(atts != null) {
				Iterator j = atts.iterator();
				while (j.hasNext()){
					VocabularyAttribute att = (VocabularyAttribute) j.next();
					if(att.getCaption().equalsIgnoreCase(caption) && att.getValue().equals(value)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/** 
	 * Getter of the property <tt>vocabularyEntries</tt>
	 * @return  Returns the vocabularyEntry.
	 * @uml.property  name="vocabularyEntries"
	 */
	public Collection getEntries() {
		return entries;
	}
	/** 
	 * Setter of the property <tt>vocabularyEntries</tt>
	 * @param vocabularyEntries  The vocabularyEntry to set.
	 * @uml.property  name="vocabularyEntries"
	 */
	public void setEntries(Collection vocabularyEntries) {
		this.entries = vocabularyEntries;
	}
	
	public static IBusinessModellerDocument getInstance(int editorType){
		switch (editorType) {
		case BusinessModeller.DOCUMENT_VOCABULARY:
			return Vocabulary.getInstance();
		case BusinessModeller.DOCUMENT_RULESET:
			return RuleSet.getInstance();
		case BusinessModeller.DOCUMENT_FACTS:
				// TODO to implement
			return null;//Vocabulary.getInstance();
		default:
			return null;
		}
	}
	
	public static boolean isInstanced(int editorType){
		switch (editorType) {
		case BusinessModeller.DOCUMENT_VOCABULARY:
				return Vocabulary.isInstanced();
		case BusinessModeller.DOCUMENT_RULESET:
				// TODO to implement
			return false;//Vocabulary.isInstanced();
		case BusinessModeller.DOCUMENT_FACTS:
				// TODO to implement
			return false;//Vocabulary.isInstanced();
		default:
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
}
