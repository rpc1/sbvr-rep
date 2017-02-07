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
import java.util.Iterator;


public class FoE extends org.dbe.businessModeller.vocabulary.enterprise.PrimaryRepresentation {

	/**
	 * @uml.property  name="foEPart"
	 * @uml.associationEnd  multiplicity="(1 -1)" inverse="foE:org.dbe.businessModeller.vocabulary.enterprise.FoEPart"
	 */
	private Collection foEParts;

	/**
	 * Getter of the property <tt>foEPart</tt>
	 * @return  Returns the foEPart.
	 * @uml.property  name="foEPart"
	 */
	public Collection getFoEParts() {
		return foEParts;
	}

	/**
	 * Setter of the property <tt>foEPart</tt>
	 * @param foEPart  The foEPart to set.
	 * @uml.property  name="foEPart"
	 */
	public void setFoEParts(Collection foEParts) {
		this.foEParts = foEParts;
	}
	
	public String toString(){
		if (foEParts==null||foEParts.isEmpty())
			return "VUOTO";
		Iterator i = foEParts.iterator();
		String retVal="";
		while (i.hasNext())
			retVal = retVal + ((retVal!="")?" ":"") + ((Designation)((FoEPart)i.next()).getPrimaryRepresentation()).toString();
		return retVal;
	}

}
