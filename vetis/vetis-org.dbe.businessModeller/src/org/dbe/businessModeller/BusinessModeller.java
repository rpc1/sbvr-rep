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
 * Modified 2009.09.14 by Vetis project
 */
package org.dbe.businessModeller;


public class BusinessModeller {

	/* Constants declaration */
	// FoEPart type
	public static final int PREDICATE = 0;
	public static final int PLACEHOLDER = 1;
	
	// FontStyle type
	public static final int DEFAULT_STYLE = 0;
	public static final int TERM = 1;
	public static final int NAME = 2;
	public static final int VERB = 3;
	public static final int KEYWORD = 4;
	public static final int TAG = 5;
	// Non � un FontStyle type, ma serviva  
	public static final int FACT = 6;
	public static final int ERROR = 7;
	
	// comment font style
	public static final int COMMENT = 8;
	// ruleset and rule font styles
	public static final int RULESET = 9;
	public static final int RULE = 10;
	
	// Outline view constants
	public static final String STRING_TERM = "Terms";
	public static final String STRING_NAME = "Names";
	public static final String STRING_FACT = "Fact types";
	
	// Image
	public static final int DEFAULT_IMAGE = 0;
	
	// Editor Types
	public static final int DOCUMENT_VOCABULARY = 0;
	public static final int DOCUMENT_RULESET = 1;
	public static final int DOCUMENT_FACTS = 2;
}
