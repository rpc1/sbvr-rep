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
 * Modified 2009.09.13 by Vetis project
 */
package org.dbe.businessModeller.vocabulary.enterprise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.dbe.businessModeller.enterprise.BusinessModellerDocument;

public class Vocabulary  extends BusinessModellerDocument {

	/** 
	 * @uml.property name="description"
	 */
	private String description = "";
	/** 
	 * @uml.property name="speechCommunity"
	 */
	private String speechCommunity = "";
	/** 
	 * @uml.property name="language"
	 */
	private String language = "";
	/** 
	 * @uml.property name="includedVocabulary"
	 */
	private String includedVocabulary = "";
	/** 
	 * @uml.property name="note"
	 */
	private String note = "";
	/** 
	 * @uml.property name="name"
	 */
	private String name;
	
	private String source = null;
	
	private Collection extTerms = null;
	
	private Collection verbs = null;
	
	private static Vocabulary vocabulary;
	
	public static boolean isInstanced()
	{
		if (vocabulary==null)
			return false;
		return true;
	}
	
	public static Vocabulary getInstance(){
		if (vocabulary==null)
			vocabulary = new Vocabulary();
		return vocabulary;
	}
	
	private Vocabulary(){
		super.entries = new ArrayList();
		super.entryPosition = new HashMap();
		extTerms = new ArrayList();
		verbs = new ArrayList();
		// add additional verbs
		verbs.add("is");
	}
	
	/**
	 * Getter of the property <tt>description</tt>
	 * @return  Returns the description.
	 * @uml.property  name="description"
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Setter of the property <tt>description</tt>
	 * @param description  The description to set.
	 * @uml.property  name="description"
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Getter of the property <tt>speechCommunity</tt>
	 * @return  Returns the speechCommunity.
	 * @uml.property  name="speechCommunity"
	 */
	public String getSpeechCommunity() {
		return speechCommunity;
	}
	/**
	 * Setter of the property <tt>speechCommunity</tt>
	 * @param speechCommunity  The speechCommunity to set.
	 * @uml.property  name="speechCommunity"
	 */
	public void setSpeechCommunity(String speechCommunity) {
		this.speechCommunity = speechCommunity;
	}
	/**
	 * Getter of the property <tt>language</tt>
	 * @return  Returns the language.
	 * @uml.property  name="language"
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * Setter of the property <tt>language</tt>
	 * @param language  The language to set.
	 * @uml.property  name="language"
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * Getter of the property <tt>includedVocabulary</tt>
	 * @return  Returns the includedVocabulary.
	 * @uml.property  name="includedVocabulary"
	 */
	public String getIncludedVocabulary() {
		return includedVocabulary;
	}
	/**
	 * Setter of the property <tt>includedVocabulary</tt>
	 * @param includedVocabulary  The includedVocabulary to set.
	 * @uml.property  name="includedVocabulary"
	 */
	public void setIncludedVocabulary(String includedVocabulary) {
		this.includedVocabulary = includedVocabulary;
	}
	/**
	 * Getter of the property <tt>note</tt>
	 * @return  Returns the note.
	 * @uml.property  name="note"
	 */
	public String getNote() {
		return note;
	}
	/**
	 * Setter of the property <tt>note</tt>
	 * @param note  The note to set.
	 * @uml.property  name="note"
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * Getter of the property <tt>name</tt>
	 * @return  Returns the name.
	 * @uml.property  name="name"
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter of the property <tt>name</tt>
	 * @param name  The name to set.
	 * @uml.property  name="name"
	 */
	// TODO is necessary to extend here the next methods?
	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Collection getExtTerms() {
		return extTerms;
	}

	public void setExtTerms(Collection extEntries) {
		this.extTerms = extEntries;
	}

	public void addExtTerms(String extEntry)
	{
		this.extTerms.add(extEntry);
	}
	
	public Collection getVerbs() {
		return verbs;
	}

	public void setVerbs(Collection verbs) {
		this.verbs = verbs;
	}
	
	public void addVerbs(String verb)
	{
		this.verbs.add(verb);
	}
}
