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
 * Modified 2009.09.09 by Vetis project
 */
package org.dbe.businessModeller.ruleset.ui.editors.utils;

public class RulesetRuleMemory {
	
	private static RulesetRuleMemory ruleMemory;

	// Ultima parola verificata nella riga
	private static boolean lastWord;
	// Posizione ultima parola verificata nella riga
	private static int positionInFacts;
	// Prima volta
	private static boolean firstTime;
	// Tiene traccia della presenza di un token error 
	private static boolean problem;
	// Tiene traccia della presenza di un token warning 
	private static boolean warning;
	// Tiene traccia della presenza di un token warning 
	private static String msgMarker;
	// 
	private static boolean updateFoldingStructure;
	// Verifica se � arrivata alla fine del file
	private static boolean endOfDocument;
	// Permette di effettuare il conteggio dell'offset
	private static boolean countable;
	// Conta l'offset
	private static int counter;
	// line type indicator
	private static boolean isComment;

	public static RulesetRuleMemory getInstance()
	{
		if (ruleMemory==null)
			{
				ruleMemory = new RulesetRuleMemory();
			    lastWord = false;
			    positionInFacts = 1;
			    firstTime = true;
			    problem=false;
			    warning=false;
			    msgMarker=null;
			    updateFoldingStructure = false;
			    endOfDocument = false;
			    countable=false;
			    counter=0;
			    isComment = false;
			}
		return ruleMemory;
	}
	
	public boolean isLastWord() {
		return lastWord;
	}

	public void setLastWord(boolean lastWord) {
		RulesetRuleMemory.lastWord = lastWord;
	}

	public int getPositionInFacts() {
		return positionInFacts;
	}

	public void setPositionInFacts(int positionInFacts) {
		RulesetRuleMemory.positionInFacts = positionInFacts;
	}


	public boolean isFirstTime() {
		return firstTime;
	}

	public void setFirstTime(boolean firstTime) {
		RulesetRuleMemory.firstTime = firstTime;
	}
	
	public boolean isProblem() {
		return problem;
	}

	public void setProblem(boolean problem) {
		RulesetRuleMemory.problem = problem;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		RulesetRuleMemory.warning = warning;
	}

	public String getMsgMarker() {
		return msgMarker;
	}

	public void setMsgMarker(String msgMarker) {
		RulesetRuleMemory.msgMarker = msgMarker;
	}

	public boolean isUpdateFoldingStructure() {
		return updateFoldingStructure;
	}

	public void setUpdateFoldingStructure(boolean updateFoldingStructure) {
		RulesetRuleMemory.updateFoldingStructure = updateFoldingStructure;
	}

	public boolean isEndOfDocument() {
		return endOfDocument;
	}

	public void setEndOfDocument(boolean endOfDocument) {
		RulesetRuleMemory.endOfDocument = endOfDocument;
	}

	public boolean isCountable() {
		return countable;
	}

	public void setCountable(boolean countable) {
		RulesetRuleMemory.countable = countable;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		RulesetRuleMemory.counter = counter;
	}
	
	public boolean isComment() {
		return isComment;
	}

	public void setIsComment(boolean isComment) {
		RulesetRuleMemory.isComment = isComment;
	}
}
