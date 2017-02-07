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
package org.dbe.businessModeller;


import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.dbe.businessModeller.utils.ResourceProvider;

public class BusinessModellerMessages {

	private static final String RESOURCE_BUNDLE= "BusinessModellerMessages";

	private static ResourceBundle fgResourceBundle= ResourceProvider.getResourceBundle(RESOURCE_BUNDLE);

	private BusinessModellerMessages() {
	}

	public static String getString(String key) {
		try {
			return fgResourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return "!" + key + "!";//$NON-NLS-2$ //$NON-NLS-1$
		}
	}
	
	public static ResourceBundle getResourceBundle() {
		return fgResourceBundle;
	}
}
