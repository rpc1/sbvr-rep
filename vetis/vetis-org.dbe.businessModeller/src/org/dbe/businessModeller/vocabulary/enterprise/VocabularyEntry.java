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

import java.util.Collection;


public abstract class VocabularyEntry {

	private Collection attributes;
	/**
	 * Getter of the property <tt>primaryRepresentation</tt>
	 * @return  Returns the primaryRepresentation.
	 * @uml.property  name="primaryRepresentation"
	 */
	public abstract PrimaryRepresentation getPrimaryRepresentation();
	/**
	 * Setter of the property <tt>primaryRepresentation</tt>
	 * @param primaryRepresentation  The primaryRepresentation to set.
	 * @uml.property  name="primaryRepresentation"
	 */
	public abstract void setPrimaryRepresentation(PrimaryRepresentation primaryRepresentation);
	public Collection getAttributes() {
		return attributes;
	}
	public void setAttributes(Collection attributes) {
		this.attributes = attributes;
	}
}
