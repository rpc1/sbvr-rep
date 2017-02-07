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
 * Creato il 8-mag-2006
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

public class BMLoggerFactory implements LoggerFactory {

	public BMLoggerFactory() {
		super();
    }

	public Logger makeNewLoggerInstance(String name) {
        return new BusinessModellerLogger(name);
    }

}
