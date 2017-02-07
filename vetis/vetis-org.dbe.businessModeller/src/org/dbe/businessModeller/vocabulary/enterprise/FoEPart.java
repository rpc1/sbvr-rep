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


public class FoEPart {

	/** 
	 * @uml.property name="type"
	 */
	private int type;

	/** 
	 * Getter of the property <tt>type</tt>
	 * @return  Returns the type.
	 * @uml.property  name="type"
	 */
	public int getType() {
		return type;
	}

	/** 
	 * Setter of the property <tt>type</tt>
	 * @param type  The type to set.
	 * @uml.property  name="type"
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @uml.property  name="startingCharPosition"
	 */
	private int startingCharPosition;

	/**
	 * Getter of the property <tt>startingCharPosition</tt>
	 * @return  Returns the startingCharPosition.
	 * @uml.property  name="startingCharPosition"
	 */
	public int getStartingCharPosition() {
		return startingCharPosition;
	}

	/**
	 * Setter of the property <tt>startingCharPosition</tt>
	 * @param startingCharPosition  The startingCharPosition to set.
	 * @uml.property  name="startingCharPosition"
	 */
	public void setStartingCharPosition(int startingCharPosition) {
		this.startingCharPosition = startingCharPosition;
	}

	/**
	 * @uml.property  name="designation"
	 * @uml.associationEnd  inverse="foEPart:org.dbe.businessModeller.vocabulary.enterprise.Designation"
	 */
	private PrimaryRepresentation designation;

	/**
	 * Getter of the property <tt>designation</tt>
	 * @return  Returns the designation.
	 * @uml.property  name="designation"
	 */
	public PrimaryRepresentation getPrimaryRepresentation() {
		return designation;
	}

	/**
	 * Setter of the property <tt>designation</tt>
	 * @param designation  The designation to set.
	 * @uml.property  name="designation"
	 */
	public void setPrimaryRepresentation(PrimaryRepresentation designation) {
		this.designation = designation;
	}

}
