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
// $ANTLR 2.7.5 (20050128): "sev.g" -> "VocabularyValidator.java"$
/*
 * Modified 2009.04.15 by Vetis project
 */

package org.dbe.businessModeller.vocabulary.enterprise.grammar;


public interface VocabularyValidatorTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int SIGNIFIER = 4;
	int NEWLINE = 5;
	int ICSIGNIFIER = 6;
	int SEPARATOR = 7;
	int LITERAL_Definition = 8;
	int LITERAL_Synonym = 9;
	int LITERAL_Synonymous_form = 10;
	int LITERAL_Source = 11;
	int LITERAL_Note = 12;
	int LITERAL_Example = 13;
	int LITERAL_Dictionary_basis = 14;
	int LITERAL_General_concept = 15;
	int LITERAL_See = 16;
	int LITERAL_Qualifier = 17;
	int LITERAL_Symbol_type = 18;
	int LITERAL_Necessity = 19;
	int LITERAL_Possibility = 20;
	int LITERAL_Concept_type = 21;
	int LITERAL_Reference_scheme = 22;
	int WS = 23;
}
