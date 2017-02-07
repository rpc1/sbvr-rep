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
 * Modified 2009.09.10 by Vetis project
 */
package org.dbe.businessModeller.vocabulary.enterprise;

import java.util.ArrayList;
import java.util.HashMap;

import org.dbe.businessModeller.enterprise.BusinessModellerDocument;

public class RuleSet extends BusinessModellerDocument {

	private int description;
	private int vocabulary;
	private int note;
	private int source;
	private int text;
	
	private ArrayList<RuleSetEntry> ruleSetEntries;
	
	/** 
	 * HashMap containing each vocabulary entry line number in the
	 * edited document as key (Integer field), and its primary
	 * representation as value (String field).
	 */
	protected HashMap<String, Integer> entryPosition;
	
	private static RuleSet Ruleset;
	
	public static boolean isInstanced()
	{
		if (Ruleset==null)
			return false;
		return true;
	}
	
	public static RuleSet getInstance(){
		if (Ruleset==null)
			Ruleset = new RuleSet();
		return Ruleset;
	}
	
	public RuleSet() {
		ruleSetEntries = new ArrayList<RuleSetEntry>();
		this.entryPosition = new HashMap<String, Integer>();
	}
	
	public ArrayList<RuleSetEntry> getRuleSetEntries() {
		return ruleSetEntries;
	}
	
	public HashMap <String, Integer> getEntryPosition() {
		return entryPosition;
	}
	
	
}
