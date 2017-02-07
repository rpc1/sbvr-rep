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
// $ANTLR 2.7.5 (20050128): "rulesetv.g" -> "RuleSetLexer.java"$
/*
 * Modified 2009.09.09 by Vetis project
 */

package org.dbe.businessModeller.ruleset.enterprise.grammar;

public interface RuleSetValidatorTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int WS = 4;
	int NEWLINE = 5;
	int SIGNIFIER = 6;
	int ICSIGNIFIER = 7;
	int SEPARATOR = 8;
	int LITERAL_Name = 9;
	int LITERAL_Guidance = 10;
	int LITERAL_Type = 11;
	int LITERAL_Description = 12;
	int LITERAL_Source = 13;
	int LITERAL_Note = 14;
	int LITERAL_Example = 15;
	int LITERAL_Synonymuos = 16;
	int LITERAL_Form = 17;
	int LITERAL_Enforcement = 18;
	int LITERAL_Level = 19;
	int LITERAL_The = 20;
	int LITERAL_the = 21;
	int LITERAL_A = 22;
	int LITERAL_a = 23;
	int LITERAL_An = 24;
	int LITERAL_an = 25;
	int QUOTE = 26;
	int NUMBER = 27;
	int LITERAL_that = 28;
	int LITERAL_which = 29;
	int LITERAL_and = 30;
	// "," = 31
	int LITERAL_or = 32;
	int LITERAL_It = 33;
	int LITERAL_it = 34;
	int LITERAL_is = 35;
	int LITERAL_obligatory = 36;
	int LITERAL_prohibited = 37;
	int LITERAL_necessary = 38;
	int LITERAL_impossible = 39;
	int LITERAL_possible = 40;
	int LITERAL_permitted = 41;
	int DOT = 42;
	int LITERAL_given = 43;
	int LITERAL_set = 44;
	int LITERAL_of = 45;
	int LITERAL_each = 46;
	int LITERAL_Another = 47;
	int LITERAL_another = 48;
	int LITERAL_Who = 49;
	int LITERAL_who = 50;
	int LITERAL_What = 51;
	int LITERAL_what = 52;
	int LITERAL_Each = 53;
	int LITERAL_Some = 54;
	int LITERAL_some = 55;
	int LITERAL_More = 56;
	int LITERAL_more = 57;
	int LITERAL_than = 58;
	int LITERAL_one = 59;
	int LITERAL_At = 60;
	int LITERAL_at = 61;
	int LITERAL_least = 62;
	int LITERAL_most = 63;
	int LITERAL_Exaclty = 64;
	int LITERAL_exactly = 65;
	
	int LITERAL_is_not_greater_than = 70;
	int LITERAL_is_greater_than = 71;
	int LITERAL_is_not_less_than = 72;
	int LITERAL_is_less_than = 73;
	int LITERAL_equals = 74;
	
	int LITERAL_if = 80;
	
	int LITERAL_comment = 90;
	int LITERAL_ruleset = 91;
}
