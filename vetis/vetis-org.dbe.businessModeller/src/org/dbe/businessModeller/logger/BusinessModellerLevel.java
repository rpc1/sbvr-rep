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

import org.apache.log4j.Level;

public class BusinessModellerLevel extends Level {
	
	static final long serialVersionUID = 12041984;

	public final static int PARSER_INT = 5000;
	public final static String PARSER_STR = "PARSER";
	
	public final static BusinessModellerLevel PARSER = new BusinessModellerLevel(PARSER_INT, PARSER_STR, 7);
	
	public BusinessModellerLevel(int level, String levelStr, int syslogEquivalent) {
		super(level, levelStr, syslogEquivalent);
	}
	
	public static Level toLevel(String sArg) {
		return toLevel(sArg, BusinessModellerLevel.PARSER);
	}

	public static Level toLevel(String sArg, Level defaultValue) {
//		if(sArg == null) {
//			return defaultValue;
//		}
//		String stringVal = sArg.toUpperCase();
//		if(stringVal.equals(PARSER_STR)) {
//			return BusinessModellerLevel.PARSER;
//		}
//		return Level.toLevel(sArg, (Level) defaultValue);
		// To improve logging performance
		return (sArg==null)?defaultValue:( (sArg.equalsIgnoreCase(BusinessModellerLevel.PARSER_STR))?BusinessModellerLevel.PARSER:Level.toLevel(sArg, (Level) defaultValue) );
	}

	public static Level toLevel(int i) throws  IllegalArgumentException {
		return Level.toLevel(i, BusinessModellerLevel.PARSER);
	}

}
