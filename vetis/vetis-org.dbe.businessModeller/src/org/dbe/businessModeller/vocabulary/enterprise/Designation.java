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
package org.dbe.businessModeller.vocabulary.enterprise;

public class Designation extends PrimaryRepresentation {

	/**
	 * @uml.property  name="signifier"
	 */
	private String signifier = "";
	
	public Designation(){
	}

	public Designation(FontStyle style, String signifier) {
		super();
		fontStyle = style;
		this.signifier = signifier;
	}

	/**
	 * Getter of the property <tt>signifier</tt>
	 * @return  Returns the signifier.
	 * @uml.property  name="signifier"
	 */
	public String getSignifier() {
		return signifier;
	}

	/**
	 * Setter of the property <tt>signifier</tt>
	 * @param signifier  The signifier to set.
	 * @uml.property  name="signifier"
	 */
	public void setSignifier(String signifier) {
		this.signifier = signifier;
	}

	/**
	 * @uml.property  name="fontStyle"
	 * @uml.associationEnd  inverse="designation1:org.dbe.businessModeller.vocabulary.enterprise.FontStyle"
	 */
	private FontStyle fontStyle;

	/**
	 * Getter of the property <tt>fontStyle</tt>
	 * @return  Returns the fontStyle.
	 * @uml.property  name="fontStyle"
	 */
	public FontStyle getFontStyle() {
		return fontStyle;
	}

	/**
	 * Setter of the property <tt>fontStyle</tt>
	 * @param fontStyle  The fontStyle to set.
	 * @uml.property  name="fontStyle"
	 */
	public void setFontStyle(FontStyle fontStyle) {
		this.fontStyle = fontStyle;
	}
	
	public String toString(){
		return signifier;
	}
}
