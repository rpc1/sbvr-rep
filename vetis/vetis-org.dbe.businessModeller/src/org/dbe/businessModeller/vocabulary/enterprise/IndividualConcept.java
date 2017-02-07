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

public class IndividualConcept extends VocabularyEntry {

	/** 
	 * @uml.property name="designation"
	 * @uml.associationEnd inverse="indivudualConcept:org.dbe.businessModeller.vocabulary.enterprise.Designation"
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
