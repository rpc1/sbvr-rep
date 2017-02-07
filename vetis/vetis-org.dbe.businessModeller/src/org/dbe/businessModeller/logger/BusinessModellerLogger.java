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
/*
 * Modified 2009.08.17 by Vetis project
 */
package org.dbe.businessModeller.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

public class BusinessModellerLogger extends Logger {

	static String FQCN = BusinessModellerLogger.class.getName() + ".";
	private static BMLoggerFactory bmLoggerFactory = new BMLoggerFactory();
	
	public BusinessModellerLogger(String name) {
		super(name);
	}
	
	public static Logger getLogger(String name) {
		return Logger.getLogger(name, bmLoggerFactory);
	}
	
	public static Logger getLogger(Class clazz) {
		return getLogger(clazz.getName());
	}

	public void parser(Object message) {
		super.log(FQCN, BusinessModellerLevel.PARSER, message, null); 
	}
	
	protected void forcedLog(String fqcn, Priority level, Object message, Throwable t) {
		if (message instanceof Exception) {
			Exception ex = (Exception) message;
			StringBuffer textMessage = new StringBuffer(ex.toString());
            StackTraceElement[] trace = ex.getStackTrace();
            for (int i=0; i < trace.length; i++)
            	textMessage.append("\n\tat " + trace[i]);
            super.forcedLog(fqcn, level, textMessage, t);
		}else{
			super.forcedLog(fqcn, level, message, t);
		}
	  }

}
