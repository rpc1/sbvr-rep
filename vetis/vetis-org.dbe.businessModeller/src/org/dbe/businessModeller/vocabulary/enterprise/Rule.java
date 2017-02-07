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

public class Rule extends RuleSet{

	/**
	 * @uml.property  name="name"
	 */
	private int Name;
	private int Description;
	
	private String text;
	
	public Rule(String newText) {
		text = newText;
	}
	
	/**
	 * Title getter
	 * @return title
	 */
	public String getText() {
		return text;
	}
}
