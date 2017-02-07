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
 * Creato il 21-nov-2005
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller;

import java.util.Collection;
import java.util.HashMap;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;

public interface IBusinessModellerDocument {
	/**
	 * @return Return entryPosition.
	 */
	public HashMap getEntryPosition();
	
	/**
	 * @param Set entryPosition.
	 */
	public void setEntryPosition(HashMap vocabularyEntryPosition);

	public boolean hasEntry(String representation);
	
	public VocabularyEntry getEntry(String representation);
	
	public boolean hasEntry(VocabularyEntry entry);

	/** 
	 * Getter of the property <tt>vocabularyEntries</tt>
	 * @return  Returns the vocabularyEntry.
	 * @uml.property  name="vocabularyEntries"
	 */
	public Collection getEntries();
	/** 
	 * Setter of the property <tt>vocabularyEntries</tt>
	 * @param vocabularyEntries  The vocabularyEntry to set.
	 * @uml.property  name="vocabularyEntries"
	 */
	public void setEntries(Collection vocabularyEntries);
	
	//public static IBusinessModellerDocument getInstance(int editorType);
	
	//public static boolean isInstanced(int editorType);
	
	public String getName();
	public void setName(String name);
	public String getDescription();
	public void setDescription(String description);
	public String getNote();
	public void setNote(String note);
	public String getSource();
	public void setSource(String source);
}
