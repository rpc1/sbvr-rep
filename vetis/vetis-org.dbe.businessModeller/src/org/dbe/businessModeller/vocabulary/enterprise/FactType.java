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

public class FactType extends VocabularyEntry {

	/**
	 * @uml.property  name="foE"
	 * @uml.associationEnd  inverse="factType:org.dbe.businessModeller.vocabulary.enterprise.FoE"
	 */
	private PrimaryRepresentation foE;

	/**
	 * Getter of the property <tt>foE</tt>
	 * @return  Returns the foE.
	 * @uml.property  name="foE"
	 */
	public PrimaryRepresentation getPrimaryRepresentation() {
		return foE;
	}

	/**
	 * Setter of the property <tt>foE</tt>
	 * @param foE  The foE to set.
	 * @uml.property  name="foE"
	 */
	public void setPrimaryRepresentation(PrimaryRepresentation foE) {
		this.foE = foE;
	}
}
