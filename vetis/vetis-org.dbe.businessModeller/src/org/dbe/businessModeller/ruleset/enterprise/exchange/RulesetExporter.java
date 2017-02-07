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
 * Creato il 16-nov-2005
 * @author Pierpaolo Cira
 */
/*
 * Modified 2009.10.13 by Vetis project
 */
package org.dbe.businessModeller.ruleset.enterprise.exchange;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;


import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.IBusinessModellerDocument;
import org.dbe.businessModeller.enterprise.BusinessModellerDocument;
import org.dbe.businessModeller.enterprise.exchange.Exporter;
import org.dbe.businessModeller.ruleset.enterprise.grammar.RuleSetLexer;
import org.dbe.businessModeller.ruleset.enterprise.grammar.RuleSetParser;
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.vocabulary.enterprise.Rule;
import org.dbe.businessModeller.vocabulary.enterprise.RuleSet;
import org.dbe.businessModeller.vocabulary.enterprise.RuleSetEntry;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.eclipse.emf.ecore.resource.Resource;

import antlr.RecognitionException;
import antlr.TokenStreamException;

public class RulesetExporter extends Exporter {

	public RulesetExporter() {
		super();
	}
	
	/**
	 * Set resource
	 */
	public void setResource(Resource newPoResource){
		poResource = newPoResource;
	}

	/**
	 * Get resource
	 */
	public Resource getResource(){
		return poResource;
	}
	
	/**
	 * Set thing list
	 */
	public void setThingList(SBVRLists newThingList){
		thingList = newThingList;
	}
	
	/**
	 * Get thing list
	 */
	public SBVRLists getThingList(){
		return thingList;
	}
	
	/**
	 * Set conceptual schema
	 */
	public void setConceptualSchema(SBVR.ConceptualSchema newConceptualSchema){
		conceptualSchema = newConceptualSchema;
	}
	
	/**
	 * Get conceptual schema
	 */
	public SBVR.ConceptualSchema getConceptualSchema(){
		return conceptualSchema;
	}
	
	public void parseAndExportVocabulary(int saveToFile){}
	
	/**
	 * Calculates position of searchText occurence in text
	 * @param text - whole text
	 * @param searchText - part of the text
	 * @return position
	 */
	private int calculatePosition(String text, String searchText) {
		// char index of our ruleset title in file
		int index = text.indexOf(searchText);
		
		// count new line characters for position setting
		int newLineNumber = 0;
		try {
			for(int s = 0; s < index; s++) {
				if(text.charAt(s) == '\n') {
					newLineNumber++;
				}
			}
		}
		catch(Exception e){}
		
		if(index + newLineNumber == 0)
			index++;
		
		return index + newLineNumber;
	}
	
	public void formatRuleSetEntriesArray() {
		
		// get ruleset document
		RuleSet ruleset = (RuleSet) BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_RULESET);
		ruleset.getRuleSetEntries().clear();
		
		// get rules file contents
		String ruleSetEditorText = BusinessModellerUtils.readFile(rulesFile);
		
		// format ruleset array
		String rules[] = ruleSetEditorText.split("\n");
		try {
			for(int i = 0; i < rules.length; i++) {
				rules[i] = rules[i].replace("\r", "").replace("\t", "").trim();
				if(rules[i].startsWith("It is")) { // create new rule
					if(ruleset.getRuleSetEntries().size() == 0) {
						RuleSetEntry miscEntry = new RuleSetEntry("misc"); // ruleset entry for non structured rules
						ruleset.getRuleSetEntries().add(miscEntry);	
					}
					
					// get last created ruleset
					RuleSetEntry lastRulesetEntry = ruleset.getRuleSetEntries().get(ruleset.getRuleSetEntries().size() - 1);
					
					// set rule
					Rule rule = new Rule(rules[i]);					
					lastRulesetEntry.getRules().add(rule);
					
					// calculate position
					int position = calculatePosition(ruleSetEditorText, rules[i]);

					// set entry position
					rule.getEntryPosition().put(rules[i], position);
				}
					
				
				if(rules[i].contains("Ruleset")) { // create new ruleset
					// format ruleset title
					String rulesetTitle = rules[i].substring(rules[i].indexOf("Ruleset") + 7);
					
					// set ruleset
					RuleSetEntry entry = new RuleSetEntry(rulesetTitle);
					ruleset.getRuleSetEntries().add(entry);
					
					// calculate position
					int position = calculatePosition(ruleSetEditorText, rulesetTitle);
					 
					// set entry position
					ruleset.getEntryPosition().put(rulesetTitle, position);
				}
			}
		}catch(Exception e) {}
	}
	
	/**
	 * Parse rules and write them to xmi file
	 */
	public void parseAndExportRuleset() {
		String ruleSetEditorText = BusinessModellerUtils.readFile(rulesFile);
		
		// get ruleset document
		RuleSet ruleset = (RuleSet) BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_RULESET);
		
		// extract rules from ruleset
		ArrayList<String> rules = new ArrayList<String>();
		try {
			for(Iterator<RuleSetEntry> i = ruleset.getRuleSetEntries().iterator(); i.hasNext();) {
				RuleSetEntry entry = i.next();
				for(Iterator<Rule> j = entry.getRules().iterator(); j.hasNext();) {
					Rule rule = j.next();
					rules.add(rule.getText());
				}
			}
		} catch(NullPointerException e) {}
	
		
		if(rules.size() > 0) {
			// parse rules
			RuleSetLexer lexer = new RuleSetLexer(new StringReader(ruleSetEditorText));
			RuleSetParser parser = new RuleSetParser(lexer);
			parser.setThingList(thingList);
			parser.setConceptualSchema(conceptualSchema);
			parser.setRuleSetArray(rules);
			try {
				parser.ruleSet();
			} 
			catch (RecognitionException e) {} 
			catch (TokenStreamException e) {}
			catch (Exception e) {}
		}
		// add elements from thingList
		super.putElementsFromThingListToResource();
			
		// save rules to xmi file
		super.saveResourceTofile();
	}
	
	public String toProlog(IBusinessModellerDocument ruleset) {
		return null;
	}

}
