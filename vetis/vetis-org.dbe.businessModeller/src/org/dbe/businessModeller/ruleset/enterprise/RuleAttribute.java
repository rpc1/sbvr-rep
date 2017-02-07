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
 * Modified 2009.11.26 by Vetis project
 */

package org.dbe.businessModeller.ruleset.enterprise;

public class RuleAttribute {
	
	private String caption;
	private Object value;
	
	public RuleAttribute(){
	}
	
	public RuleAttribute(String caption, Object value) {
		super();
		// TODO Auto-generated constructor stub
		this.caption = caption;
		this.value = value;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
}
