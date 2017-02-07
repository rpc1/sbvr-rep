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
// $ANTLR 2.7.5 (20050128): "ruleset.g" -> "RuleSetParser.java"$
/*
 * Modified 2009.09.15 by Vetis project
 */

package org.dbe.businessModeller.ruleset.enterprise.grammar;

import org.dbe.businessModeller.logger.BusinessModellerLogger;
import org.dbe.businessModeller.ruleset.enterprise.RuleAttribute;
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.ListChecker;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.Rule;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.factType.binaryFactType.BinaryFactType;
import org.eclipse.emf.common.util.EList;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;


import SBVR.FactTypeRole;
import SBVR.impl.FactTypeImpl;
import SBVR.impl.SBVRFactoryImpl;
import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

public class RuleSetParser extends antlr.LLkParser       implements RuleSetParserTokenTypes
 {

	long currentRow=0;
	long lastEntryRow=0;
	private static BusinessModellerLogger logger = (BusinessModellerLogger)BusinessModellerLogger.getLogger(RuleSetParser.class);
	
	// constructing rule
	private Rule rule;
	private Rule ruleComparator;
	private Collection<Rule> ruleClause;
	
	private SBVRLists thingList;
	private SBVR.ConceptualSchema conceptualSchema;
	
	
	private SBVRFactoryImpl sbvr_factory = new SBVRFactoryImpl();
	private ListChecker listChecker;
	
	
	// Rule terms and verbs arrays
	//private ArrayList<String> terms;
	//private ArrayList<String> verbs;
	
	// quantification type marker
	private String quantificationType;
	
	// ruleset array list
	private ArrayList<String> rulesetArray;
	
	// current rule index
	private int ruleIndex = 0;
	
	private int conjunctionFound = 0;
	private int disjunctionFound = 0;
	private String lastRuleType = "";
	
	private Rule lastRuleCreated;
	
	// derivation rule variables
	private ArrayList<String> derPrimaryRepresentationsForTerm1 = null;
	private ArrayList<String> derPrimaryRepresentationsForTerm2 = null;
	private String derComparatorPrimaryRepresentation = "";
	
	public void setThingList(SBVRLists newThingList){
		thingList = newThingList;
		listChecker = new ListChecker(thingList);
	}

	/**
	 * Set conceptual schema
	 */
	public void setConceptualSchema(SBVR.ConceptualSchema newConceptualSchema){
		conceptualSchema = newConceptualSchema;
	}
	
	public void setRuleSetArray(ArrayList<String> newRulesetArrayList){
		rulesetArray = newRulesetArrayList;
	}

	public void checkForFactType(String primaryRepresentation, Rule r) {
		
		String[] tempStr = primaryRepresentation.split(" ");
		String term1 = "";
		String verb = "";
		
		SBVR.impl.FactTypeImpl factType = null;
		
		if(tempStr.length > 2) {
			term1 = tempStr[0];
			verb = tempStr[1];
			
			// fact type is composed, search for this fact type in vocabulary
			factType = listChecker.checkForFactType(primaryRepresentation);
			if(factType == null) { // maybe we have characteristic
				factType = listChecker.checkForFactType(term1 + " " + verb);
			}
			
		} else if(tempStr.length > 1) {
			term1 = tempStr[0];
			verb = tempStr[1];
			factType = listChecker.checkForFactType(term1 + " " + verb);
		}
		
		if(factType != null){											
			r.setFactType(factType);

			// if we have synonymous prohibited fact type, switch the role indexes
			if((listChecker.isOppositeFactType(r.getFactType(), primaryRepresentation) && !(r.getFactType() instanceof SBVR.IsPropertyOfFactType)) 
			|| r.getFactType() instanceof SBVR.CategorizationFactType)	
				r.setRoleIndexes(1, 0);
			else
				r.setRoleIndexes(0, 1);
			
			r.setAtomicFormulation(sbvr_factory.createAtomicFormulation());
			
			r.setRoleBinding1(sbvr_factory.createRoleBinding());
			r.setRoleBinding2(sbvr_factory.createRoleBinding());
								
			r.setVariable1(sbvr_factory.createVariable());
			r.setVariable2(sbvr_factory.createVariable());
			
			r.setUniversalQuantification(sbvr_factory.createUniversalQuantification());
			
			// create proposition, statement, text
			r.setProposition(sbvr_factory.createProposition());
			r.setStatement(sbvr_factory.createStatement());
			
			if(r.getTextValue().equals("")) {
				r.setText(rulesetArray.get(ruleIndex));
			}
		}
	}
	
	/**
	 * Analyses terms and verbs of the gives rule and composes primary representations of the fact types
	 * @param r - rule
	 * @return arraylist of fact type primaryRepresentations
	 */
	private ArrayList<String> solveFactTypePrimaryRepresentations(Rule r) {
		ArrayList<String> primaryRepresentations = new ArrayList<String>();
		
		int numOfVerbs = r.getVerbs().size();
		
		String primaryRepresentation = ""; 
		
		for(int i = 0; i < numOfVerbs; i++) {			
			primaryRepresentation = r.getTerm(i) + " " + r.getVerb(i) + " " + r.getTerm(i + 1); 		
			primaryRepresentations.add(primaryRepresentation.trim());
		}
		
		return primaryRepresentations;
	}
	
	/**
	 * Checks, if each primaryRepresentation has fact type, sets accesedent primaryRepresentations
	 * @param primaryRepresentations
	 * @return
	 */
	private ArrayList<String> repairFactTypePrimaryRepresentations(ArrayList<String> primaryRepresentations) {
		
		ArrayList<String> prevTerms = new ArrayList<String>();
		
		ArrayList<String> primaryRepresentationsRepaired = new ArrayList<String>();
		
		for(String representation: primaryRepresentations) {
			
			// check, if such fact type exists
			SBVR.SententialForm sententialForm = listChecker.getSententialFormByPrimaryRepresentation(representation);
			
			try {
				ArrayList<String> parts = BusinessModellerUtils.splitStringToArrayList(representation, " ");
				String term1 = parts.get(0);
				String term2 = parts.get(2);
				
				prevTerms.add(term1);
				prevTerms.add(term2);
				
				if(sententialForm == null) {
					// fact type do not exists, that means, primary representation must be repaired.
					// If verb of the primary representation is "is", binary fact type must be created.
					// In this case, we have to ensure, that both roles of the fact type belongs to the
					// same object type. If not, check for other first role in previous fact type.
					
					if(parts.get(1).equals("is")) {

						
						SBVR.Designation role1Des = listChecker.checkForFactTypeRole2(term1);
						SBVR.Designation role2Des = listChecker.checkForFactTypeRole2(term2);
						
						SBVR.FactTypeRole role1 = (SBVR.FactTypeRole) role1Des.getMeaning();
						SBVR.FactTypeRole role2 = (SBVR.FactTypeRole) role2Des.getMeaning();
						
						
						if(role1.getObjectType().equals(role2.getObjectType())) {
							// both roles are of the same object type
							
						}
						else {
							// roles are of different fact types, must search for other role1
							
							String newTerm1 = "";
							String newPrimaryRepresentation = "";
							
							for(String term: prevTerms) {
								role1Des = listChecker.checkForFactTypeRole2(term);
								role1 = (SBVR.FactTypeRole) role1Des.getMeaning();
								
								if(role1.getObjectType().equals(role2.getObjectType())) {
									newTerm1 = term;
									break;
								}
							}
							
							if(!newTerm1.equals("")) {
								representation = newTerm1 + " " + parts.get(1) + " " + term2;
								
								//primaryRepresentations.remove(representation);
								
								//primaryRepresentations.add(newPrimaryRepresentation);
							}
						}
					}
				} 
				
			} catch (Exception e) {}
				
			primaryRepresentationsRepaired.add(representation);
		}
		return primaryRepresentationsRepaired;
	}
	
	/**
	 * Split given list of fact types for role1 projections
	 * @param primaryRepresentations
	 * @return
	 */
	private void splitPrimaryRepresentationsByRoles(ArrayList<String> primaryRepresentations, Rule t) {
		derPrimaryRepresentationsForTerm1 = new ArrayList<String>();
		derPrimaryRepresentationsForTerm2 = new ArrayList<String>();
		
		boolean comparatorFound = false;
		
		String verb = "";
		
		for(String representation: primaryRepresentations) {
			
			ArrayList<String> parts = BusinessModellerUtils.splitStringToArrayList(representation, " ");
			
			if(parts.size() > 1) {
				verb =  parts.get(1);
			}
		
			if(verb.equals("is")) {
				// create binary fact type
				comparatorFound = true;
				derComparatorPrimaryRepresentation = representation;
			}
			else {
				
				if(comparatorFound == false) {
					if(verbSuitableForProjection(verb) == true)
						// if verb is suitable for projection, add it to the end of the list
						derPrimaryRepresentationsForTerm1.add(representation);
					else
						// if verb is not suitable for projection, add it to the beggining of the
						// list, it will be taken for antesedent
						derPrimaryRepresentationsForTerm1.add(0, representation);
				}
				else {
					derPrimaryRepresentationsForTerm2.add(representation);
				}
			}	
		}
	}
	
	private boolean verbSuitableForProjection(String verb) {
		if(verb.contains("of") || verb.contains("that"))
			return true;
		return false;
	}
	
	protected RuleSetParser(TokenBuffer tokenBuf, int k) {
	  super(tokenBuf,k);
	  tokenNames = _tokenNames;
	}
	
	public RuleSetParser(TokenBuffer tokenBuf) {
	  this(tokenBuf,1);
	}
	
	protected RuleSetParser(TokenStream lexer, int k) {
	  super(lexer,k);
	  tokenNames = _tokenNames;
	}
	
	public RuleSetParser(TokenStream lexer) {
	  this(lexer,1);
	}
	
	public RuleSetParser(ParserSharedInputState state) {
	  super(state,1);
	  tokenNames = _tokenNames;
	}
	
	public final void ruleSet() throws RecognitionException, TokenStreamException {
		
		try {      // for error handling
			{
			_loop4:
			do {
				
				rule = new Rule(thingList, conceptualSchema, null);
				lastRuleCreated = rule;

				ruleClause = new ArrayList<Rule>();
			
				while(true) {
					if(LA(1) == LITERAL_comment || LA(1) == WS || LA(1) == NEWLINE)
					{
						switch(LA(1)){
						case LITERAL_comment:
						{
							comment();
							break;
						}
						case WS:
						{
							match(WS);
							break;
						}
						case NEWLINE:
						{
							match(NEWLINE);
							break;
						}
						}
					}
					else
						break;
				}
				
				if ((_tokenSet_0.member(LA(1)))) {
					rule();
					{
					switch ( LA(1)) {
					case WS:
					{
						match(WS);
						break;
					}
					case LITERAL_Name:
					case LITERAL_Guidance:
					case LITERAL_Description:
					case LITERAL_Source:
					case LITERAL_Note:
					case LITERAL_Example:
					case LITERAL_Synonymuos:
					case LITERAL_Enforcement:
					{
						attributes();
						break;
					}
					case EOF:
					case LITERAL_The:
					case LITERAL_the:
					case LITERAL_A:
					case LITERAL_a:
					case LITERAL_An:
					case LITERAL_an:
					case LITERAL_It:
					case LITERAL_it:
					case LITERAL_each:
					case LITERAL_Another:
					case LITERAL_another:
					case LITERAL_Who:
					case LITERAL_who:
					case LITERAL_What:
					case LITERAL_what:
					case LITERAL_Each:
					case LITERAL_Some:
					case LITERAL_some:
					case LITERAL_More:
					case LITERAL_more:
					case LITERAL_At:
					case LITERAL_at:
					case LITERAL_Exaclty:
					case LITERAL_exactly:
					{
						break;
					}
					case LITERAL_comment:
					{
						//comment();
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
				}
				else {
					break _loop4;
				}
			
			try {
			
				ArrayList<String> primaryRepresentations = null;
					
				if(rule != null) {
					primaryRepresentations = this.solveFactTypePrimaryRepresentations(rule);
					checkForFactType(primaryRepresentations.get(0), rule);
					rule.constructAtomicFormulation();
					rule.construct();
					rule.putElementsToThingList();
				}
				
				if(ruleComparator != null) {
					ruleComparator.getRoleBinding1().setBindableTarget(rule.getVariable1());
					ruleComparator.getRoleBinding2().setBindableTarget(ruleComparator.getIndividualConcept());
					ruleComparator.setVariable2(null);
					if(ruleComparator.getFactType() != null) {
						ruleComparator.putElementsToThingList();
					}
					rule.getVariable1().setRestrictingFormulation(ruleComparator.getAtomicFormulation());
				}
	
				if(ruleClause.size() > 0) {
					
					
					SBVR.Implication implication = null;
					SBVR.LogicalFormulation antecedent = null;
					SBVR.LogicalFormulation consequent = null;
					Rule prev = null;
					for(Rule t: ruleClause) {
						if(t.getTerm(0).equals("") && prev != null) { // we don't have term1, so take it from previous fact type
							if(!t.getTerm(1).equals(""))
								t.addTerm(prev.getTerm(0));
							
						}
						
						primaryRepresentations = this.solveFactTypePrimaryRepresentations(t);
						
						ArrayList<String> primaryRepresentationsRepaired = repairFactTypePrimaryRepresentations(primaryRepresentations);
						
						splitPrimaryRepresentationsByRoles(primaryRepresentationsRepaired, t);
						
						int numOfFactTypesTerm1 = derPrimaryRepresentationsForTerm1.size();
						
						if(numOfFactTypesTerm1 > 0) {
							// we have more than zero fact types, that means, the first fact type becomes
							// antecedent atomic formulation, and others from second are projections
							checkForFactType(derPrimaryRepresentationsForTerm1.get(0), t);
							t.constructAtomicFormulation();
							antecedent = t.getAtomicFormulation();
							t.construct();
							t.getUniversalQuantification().setVariable(t.getVariable1());
							t.getRoleBinding1().setBindableTarget(t.getVariable1());
							
							
							Rule prevDer = t;
							t.setProposition(null);
							t.setStatement(null);
							t.putElementsToThingList();
							
							for(int j = 1; j < numOfFactTypesTerm1; j++) {
								
								prevDer = createDerivationProjection(j, numOfFactTypesTerm1, prevDer, derPrimaryRepresentationsForTerm1);
								
								antecedent = t.getUniversalQuantification();
							}
							
							rule.getRoleBinding1().setBindableTarget(prevDer.getVariable2());
							
							consequent = rule.getAtomicFormulation();
							
						}
						
						int numOfFactTypesTerm2 = derPrimaryRepresentationsForTerm2.size();
						
						if(numOfFactTypesTerm2 > 0) {
							
							Rule prevDer = t;
							
							for(int j = 1; j < numOfFactTypesTerm2; j++) {
								
								prevDer = createDerivationProjection(j, numOfFactTypesTerm2, prevDer, derPrimaryRepresentationsForTerm1);
								
								antecedent = t.getUniversalQuantification();
							}
						}
							
						if(rule.getAtomicFormulation() != null && rule.getUniversalQuantification() != null) {
							// create implication
							implication = sbvr_factory.createImplication();
							implication.setAntecedent(antecedent);
							implication.setConsequent(consequent);
							rule.getUniversalQuantification().setScopeFormulation(implication);
							
							thingList.add(implication);
						}
						
						if(t.getConnectionType().equals("conjunction") && prev != null) {
							// create conjuncion with previous element
							SBVR.Conjunction conjunction = sbvr_factory.createConjunction();
							conjunction.setLogicalOperand1(prev.getAtomicFormulation());
							conjunction.setLogicalOperand2(t.getAtomicFormulation());
							implication.setAntecedent(conjunction);
							thingList.add(conjunction);
						}
						
						if(t.getConnectionType().equals("disjunction") && prev != null) {
							// create conjuncion with previous element
							SBVR.Disjunction disjunction = sbvr_factory.createDisjunction();
							disjunction.setLogicalOperand1(prev.getAtomicFormulation());
							disjunction.setLogicalOperand2(t.getAtomicFormulation());
							implication.setAntecedent(disjunction);
							thingList.add(disjunction);
						}
						prev = t;
					}
				}
			} catch(NullPointerException e) {e.printStackTrace(); BusinessModellerUtils.showErrorMessage("rule '" + rule.getTextValue() + "' was not formed correctly.");}
			
			ruleComparator = null;
			ruleClause = null;
			conjunctionFound = 0;
			lastRuleType = "";
			ruleIndex++;
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_1);
			} else {
			  throw ex;
			}
		}
	}
	
	private Rule createDerivationProjection(int j, int numOfFactTypes, Rule prevDer, ArrayList<String> primaryRepresenations) {
		// create derivation rules
		Rule der = new Rule(thingList, conceptualSchema, null);
		checkForFactType(primaryRepresenations.get(j), der);
		
		der.getVariable2().setIsUnitary(true);
		
		der.setProjectingFormulation(sbvr_factory.createProjectingFormulation());
		der.setProjection(sbvr_factory.createProjection());
		
		// set variable of projection
		der.getProjectingFormulation().setBindableTarget(der.getVariable2());
		der.getProjection().setVariable(der.getVariable2());

		der.constructAtomicFormulation();
		der.setUniversalQuantification(null);
		der.setProposition(null);
		der.setStatement(null);
		
		// set projection forulation as restricting, for previous formulation
		if(j % 2 == 1) { // even iterations
			prevDer.getVariable1().setRestrictingFormulation(der.getProjectingFormulation());
		}
		else {
			prevDer.getVariable2().setRestrictingFormulation(der.getProjectingFormulation());
		}
		
		thingList.add(der.getAtomicFormulation());
		thingList.add(der.getProjectingFormulation());
		thingList.add(der.getProjection());
		thingList.add(der.getVariable2());
		
		return der;
	}
	
	public final void rule() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			{
			int _cnt7=0;
			_loop7:
			do {
				if ((_tokenSet_0.member(LA(1)))) {
					simpleRule();
				}
				else {
					if ( _cnt7>=1 ) { break _loop7; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt7++;
			} while (true);
			}
			dot();
			{
			switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case NEWLINE:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			int _cnt10=0;
			_loop10:
			do {
				if ((LA(1)==NEWLINE)) {
					match(NEWLINE);
				}
				else {
					if ( _cnt10>=1 ) { break _loop10; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt10++;
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_2);
			} else {
			  throw ex;
			}
		}
	}
	
	public final Collection  attributes() throws RecognitionException, TokenStreamException {
		Collection atts;
		
		
		atts = new ArrayList();
		RuleAttribute att=null;
		
		
		try {      // for error handling
			{
			int _cnt44=0;
			_loop44:
			do {
				if ((_tokenSet_3.member(LA(1)))) {
					{
					switch ( LA(1)) {
					case WS:
					{
						match(WS);
						break;
					}
					case LITERAL_Name:
					case LITERAL_Guidance:
					case LITERAL_Description:
					case LITERAL_Source:
					case LITERAL_Note:
					case LITERAL_Example:
					case LITERAL_Synonymuos:
					case LITERAL_Enforcement:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					{
					att=attribute();
					if ( inputState.guessing==0 ) {
						atts.add(att);
					}
					}
					{
					int _cnt43=0;
					_loop43:
					do {
						if ((LA(1)==NEWLINE)) {
							match(NEWLINE);
							if ( inputState.guessing==0 ) {
								/*currentRow++;*/
							}
						}
						else {
							if ( _cnt43>=1 ) { break _loop43; } else {throw new NoViableAltException(LT(1), getFilename());}
						}
						
						_cnt43++;
					} while (true);
					}
				}
				else {
					if ( _cnt44>=1 ) { break _loop44; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt44++;
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_4);
			} else {
			  throw ex;
			}
		}
		return atts;
	}
	
	public final void simpleRule() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			{
			_loop13:
			do {
				if ((LA(1)==LITERAL_It||LA(1)==LITERAL_it)) {
					claim();
				}
				else {
					break _loop13;
				}
				
			} while (true);

			}
			{
			boolean synPredMatched16 = false;
			if (((_tokenSet_5.member(LA(1))))) {
				int _m16 = mark();
				synPredMatched16 = true;
				inputState.guessing++;
				try {
					{
					keyword();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched16 = false;
				}
				rewind(_m16);
				inputState.guessing--;
			}
			if ( synPredMatched16 ) {
				keyword();
				if ( inputState.guessing==0 ) {

				}
			}
			else if ((_tokenSet_6.member(LA(1)))) {
				{
				switch ( LA(1)) {
				case LITERAL_each:
				case LITERAL_Each:
				case LITERAL_Some:
				case LITERAL_some:
				case LITERAL_More:
				case LITERAL_more:
				case LITERAL_At:
				case LITERAL_at:
				case LITERAL_Exaclty:
				case LITERAL_exactly:
				{
					quantification();
					if ( inputState.guessing==0 ) {

					}
					break;
				}
				case LITERAL_The:
				case LITERAL_the:
				case LITERAL_A:
				case LITERAL_a:
				case LITERAL_An:
				case LITERAL_an:
				{
					article();
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
			}
			else {
				//throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			{
			switch ( LA(1)) {
			case SIGNIFIER:
			{
				concept();
				break;
			}
			case ICSIGNIFIER:
			{
				individualConcept();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case QUOTE:
			{
				text();
				break;
			}
			case NUMBER:
			{
				number();
				break;
			}
			case SIGNIFIER:
			case LITERAL_that:
			case LITERAL_which:
			case LITERAL_if:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			int _cnt31=0;
			_loop31:
			do {
				if ((LA(1)==SIGNIFIER||LA(1)==LITERAL_that||LA(1)==LITERAL_which)||LA(1)==LITERAL_if||LA(1)==LITERAL_is) {
					{
					switch( LA(1) ){
						case LITERAL_if:
						{
							clause();
							match(WS);
							
							switch( LA(1) ){
							case LITERAL_each:
							case LITERAL_Each:
							case LITERAL_Some:
							case LITERAL_some:
							case LITERAL_More:
							case LITERAL_more:
							case LITERAL_At:
							case LITERAL_at:
							case LITERAL_Exaclty:
							case LITERAL_exactly:
							{
								quantification();
								break;
							}
							case LITERAL_The:
							case LITERAL_the:
							case LITERAL_A:
							case LITERAL_a:
							case LITERAL_An:
							case LITERAL_an:
							{
								{
								article();
								}
								break;
							}
							case SIGNIFIER:
							case ICSIGNIFIER:
							{
								break;
							}
							default:
							{
								throw new NoViableAltException(LT(1), getFilename());
							}
							
							}
							concept();
							break;
						}
						default:
						{
							break;
						}
					}
						
					switch ( LA(1)) {
					case LITERAL_that:
					case LITERAL_which:
					{
						pronoun();
						break;
					}
					case SIGNIFIER:
					{
						break;
					}
					case LITERAL_is:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					predicate();
					{
					switch ( LA(1)) {
					case LITERAL_each:
					case LITERAL_Each:
					case LITERAL_Some:
					case LITERAL_some:
					case LITERAL_More:
					case LITERAL_more:
					case LITERAL_At:
					case LITERAL_at:
					case LITERAL_Exaclty:
					case LITERAL_exactly:
					{
						quantification();
						break;
					}
					case LITERAL_The:
					case LITERAL_the:
					case LITERAL_A:
					case LITERAL_a:
					case LITERAL_An:
					case LITERAL_an:
					{
						{
						article();
						}
						break;
					}
					case SIGNIFIER:
					case ICSIGNIFIER:
					case DOT:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					{
					switch ( LA(1)) {
					case SIGNIFIER:
					{
						concept();
						break;
					}
					case ICSIGNIFIER:
					{
						individualConcept();
						break;
					}
					case DOT:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					{
					switch ( LA(1)) {
					case QUOTE:
					{
						text();
						break;
					}
					case NUMBER:
					{
						number();
						break;
					}
					case SIGNIFIER:
					case LITERAL_The:
					case LITERAL_the:
					case LITERAL_A:
					case LITERAL_a:
					case LITERAL_An:
					case LITERAL_an:
					case LITERAL_that:
					case LITERAL_which:
					case LITERAL_and:
					case 31:
					case LITERAL_or:
					case LITERAL_It:
					case LITERAL_it:
					case DOT:
					case LITERAL_each:
					case LITERAL_Another:
					case LITERAL_another:
					case LITERAL_Who:
					case LITERAL_who:
					case LITERAL_What:
					case LITERAL_what:
					case LITERAL_Each:
					case LITERAL_Some:
					case LITERAL_some:
					case LITERAL_More:
					case LITERAL_more:
					case LITERAL_At:
					case LITERAL_at:
					case LITERAL_Exaclty:
					case LITERAL_exactly:
					case LITERAL_if:
					case LITERAL_is:
					{
						break;
					}
					case LITERAL_is_not_greater_than:
					case LITERAL_is_greater_than:
					case LITERAL_is_not_less_than:
					case LITERAL_is_less_than:
					case LITERAL_equals:
					{
						comparator();
						match(WS);
						num2();
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					{
					switch ( LA(1)) {
					case LITERAL_and:
					case 31:
					{
						conjunction();
						break;
					}
					case LITERAL_or:
					{
						disjunction();
						break;
					}
					case SIGNIFIER:
					case LITERAL_The:
					case LITERAL_the:
					case LITERAL_A:
					case LITERAL_a:
					case LITERAL_An:
					case LITERAL_an:
					case LITERAL_that:
					case LITERAL_which:
					case LITERAL_It:
					case LITERAL_it:
					case DOT:
					case LITERAL_each:
					case LITERAL_Another:
					case LITERAL_another:
					case LITERAL_Who:
					case LITERAL_who:
					case LITERAL_What:
					case LITERAL_what:
					case LITERAL_Each:
					case LITERAL_Some:
					case LITERAL_some:
					case LITERAL_More:
					case LITERAL_more:
					case LITERAL_At:
					case LITERAL_at:
					case LITERAL_Exaclty:
					case LITERAL_exactly:
					case LITERAL_if:
					case LITERAL_is:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
				}
				else {
					if ( _cnt31>=1 ) { break _loop31; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt31++;
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void dot() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			match(DOT);
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_8);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void comment() throws RecognitionException, TokenStreamException {
		
		try {      // for error handling
			match(LITERAL_comment);
			while(true){
				switch(LA(1)){
				case(WS):
				{
					match(WS);
					break;
				}
				case(SIGNIFIER):
				{
					match(SIGNIFIER);
					break;
				}
				default:
				{
					consume();
					break;
					//throw new NoViableAltException(LT(1), getFilename());
				}
				}
				if((LA(1)== NEWLINE || LA(1) == EOF)){
					switch(LA(1)){
					case(EOF):
					{
						match(EOF);
						break;
					}
					case(NEWLINE):
					{
						do {
							if ((LA(1)==NEWLINE)) {
								match(NEWLINE);
							}
							else {
								break;
							}
							
						} while (true);
						break;
					}
					}
					break;
				}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_0);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void claim() throws RecognitionException, TokenStreamException {
		
		try {      // for error handling
			{
			{
			switch ( LA(1)) {
			case LITERAL_It:
			{
				match(LITERAL_It);
				break;
			}
			case LITERAL_it:
			{
				match(LITERAL_it);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(WS);
			match(LITERAL_is);
			match(WS);
			{
			switch ( LA(1)) {
			case LITERAL_obligatory:
			{
				match(LITERAL_obligatory);
				rule.setModalFormulation(sbvr_factory.createObligationFormulation());
				break;
			}
			case LITERAL_prohibited:
			{
				match(LITERAL_prohibited);
				break;
			}
			case LITERAL_necessary:
			{
				match(LITERAL_necessary);
				rule.setModalFormulation(sbvr_factory.createNecessityFormulation());
				break;
			}
			case LITERAL_impossible:
			{
				match(LITERAL_impossible);
				break;
			}
			case LITERAL_possible:
			{
				match(LITERAL_possible);
				rule.setModalFormulation(sbvr_factory.createPossibilityFormulation());
				break;
			}
			case LITERAL_permitted:
			{
				match(LITERAL_permitted);
				rule.setModalFormulation(sbvr_factory.createPermissibilityFormulation());
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			
			match(WS);
			match(LITERAL_that);
			}
			{
			match(WS);
			}
			if ( inputState.guessing==0 ) {

			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_0);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void keyword() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_A:
			case LITERAL_a:
			{
				{
				{
				switch ( LA(1)) {
				case LITERAL_A:
				{
					match(LITERAL_A);
					break;
				}
				case LITERAL_a:
				{
					match(LITERAL_a);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				match(WS);
				match(LITERAL_given);
				}
				break;
			}
			case LITERAL_The:
			case LITERAL_the:
			{
				{
				{
				switch ( LA(1)) {
				case LITERAL_The:
				{
					match(LITERAL_The);
					break;
				}
				case LITERAL_the:
				{
					match(LITERAL_the);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				match(WS);
				match(LITERAL_set);
				match(WS);
				match(LITERAL_of);
				match(WS);
				match(LITERAL_each);
				}
				break;
			}
			case LITERAL_Another:
			{
				match(LITERAL_Another);
				break;
			}
			case LITERAL_another:
			{
				match(LITERAL_another);
				break;
			}
			case LITERAL_Who:
			{
				match(LITERAL_Who);
				break;
			}
			case LITERAL_who:
			{
				match(LITERAL_who);
				break;
			}
			case LITERAL_What:
			{
				match(LITERAL_What);
				break;
			}
			case LITERAL_what:
			{
				match(LITERAL_what);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			match(WS);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_9);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void quantification() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_Each:
			{
				match(LITERAL_Each);
				break;
			}
			case LITERAL_each:
			{
				match(LITERAL_each);
				break;
			}
			case LITERAL_Some:
			{
				match(LITERAL_Some);
				break;
			}
			case LITERAL_some:
			{
				match(LITERAL_some);
				break;
			}
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				{
				boolean synPredMatched88 = false;
				if (((_tokenSet_10.member(LA(1))))) {
					int _m88 = mark();
					synPredMatched88 = true;
					inputState.guessing++;
					try {
						{
						quantification2();
						match(WS);
						conjunction();
						quantification2();
						}
					}
					catch (RecognitionException pe) {
						synPredMatched88 = false;
					}
					rewind(_m88);
					inputState.guessing--;
				}
				if ( synPredMatched88 ) {
					{
					quantification2();
					match(WS);
					conjunction();
					quantification2();
					}
				}
				else if ((_tokenSet_10.member(LA(1)))) {
					quantification2();
				}
				else {
					throw new NoViableAltException(LT(1), getFilename());
				}
				
				}
				break;
			}
			case LITERAL_More:
			case LITERAL_more:
			{
				{
				{
				switch ( LA(1)) {
				case LITERAL_More:
				{
					match(LITERAL_More);
					break;
				}
				case LITERAL_more:
				{
					match(LITERAL_more);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				match(WS);
				match(LITERAL_than);
				match(WS);
				match(LITERAL_one);
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			match(WS);
			}
			if ( inputState.guessing==0 ) {
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_9);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void article() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_The:
			{
				match(LITERAL_The);
				break;
			}
			case LITERAL_the:
			{
				match(LITERAL_the);
				break;
			}
			case LITERAL_A:
			{
				match(LITERAL_A);
				break;
			}
			case LITERAL_a:
			{
				match(LITERAL_a);
				break;
			}
			case LITERAL_An:
			{
				match(LITERAL_An);
				break;
			}
			case LITERAL_an:
			{
				match(LITERAL_an);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			match(WS);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_9);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void concept() throws RecognitionException, TokenStreamException {
		
		Token  s = null;
		
		try {      // for error handling
			s = LT(1);
			match(SIGNIFIER);
			
//			if(lastRuleCreated.getTerm1(0).equals(""))
//				if(lastRuleCreated.getVerb(0).equals(""))
//					lastRuleCreated.setTerm1(s.getText());
//				else
//					lastRuleCreated.setTerm2(s.getText());
//			else
//				lastRuleCreated.setTerm2(s.getText());
			

			lastRuleCreated.addTerm(s.getText());
			
			if ( inputState.guessing==0 ) {
				//checkForFactType(s.getText());
				//terms.add(s.getText());
			}
			{
			switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			case LITERAL_The:
			case LITERAL_the:
			case LITERAL_A:
			case LITERAL_a:
			case LITERAL_An:
			case LITERAL_an:
			case QUOTE:
			case NUMBER:
			case LITERAL_that:
			case LITERAL_which:
			case LITERAL_and:
			case 31:
			case LITERAL_or:
			case LITERAL_It:
			case LITERAL_it:
			case DOT:
			case LITERAL_each:
			case LITERAL_Another:
			case LITERAL_another:
			case LITERAL_Who:
			case LITERAL_who:
			case LITERAL_What:
			case LITERAL_what:
			case LITERAL_Each:
			case LITERAL_Some:
			case LITERAL_some:
			case LITERAL_More:
			case LITERAL_more:
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_11);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void individualConcept() throws RecognitionException, TokenStreamException {
		
		Token  s = null;
		
		try {      // for error handling
			s = LT(1);
			match(ICSIGNIFIER);
			
			if ( inputState.guessing==0 ) {
				//terms.add(s.getText());
			}
			{
			switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			case LITERAL_The:
			case LITERAL_the:
			case LITERAL_A:
			case LITERAL_a:
			case LITERAL_An:
			case LITERAL_an:
			case QUOTE:
			case NUMBER:
			case LITERAL_that:
			case LITERAL_which:
			case LITERAL_and:
			case 31:
			case LITERAL_or:
			case LITERAL_It:
			case LITERAL_it:
			case DOT:
			case LITERAL_each:
			case LITERAL_Another:
			case LITERAL_another:
			case LITERAL_Who:
			case LITERAL_who:
			case LITERAL_What:
			case LITERAL_what:
			case LITERAL_Each:
			case LITERAL_Some:
			case LITERAL_some:
			case LITERAL_More:
			case LITERAL_more:
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_11);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void text() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			match(QUOTE);
			match(ICSIGNIFIER);
			match(QUOTE);
			{
			switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			case LITERAL_The:
			case LITERAL_the:
			case LITERAL_A:
			case LITERAL_a:
			case LITERAL_An:
			case LITERAL_an:
			case LITERAL_that:
			case LITERAL_which:
			case LITERAL_and:
			case 31:
			case LITERAL_or:
			case LITERAL_It:
			case LITERAL_it:
			case DOT:
			case LITERAL_each:
			case LITERAL_Another:
			case LITERAL_another:
			case LITERAL_Who:
			case LITERAL_who:
			case LITERAL_What:
			case LITERAL_what:
			case LITERAL_Each:
			case LITERAL_Some:
			case LITERAL_some:
			case LITERAL_More:
			case LITERAL_more:
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_12);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void number() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			num();
			{
			switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			case LITERAL_The:
			case LITERAL_the:
			case LITERAL_A:
			case LITERAL_a:
			case LITERAL_An:
			case LITERAL_an:
			case LITERAL_that:
			case LITERAL_which:
			case LITERAL_and:
			case 31:
			case LITERAL_or:
			case LITERAL_It:
			case LITERAL_it:
			case DOT:
			case LITERAL_each:
			case LITERAL_Another:
			case LITERAL_another:
			case LITERAL_Who:
			case LITERAL_who:
			case LITERAL_What:
			case LITERAL_what:
			case LITERAL_Each:
			case LITERAL_Some:
			case LITERAL_some:
			case LITERAL_More:
			case LITERAL_more:
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_12);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void pronoun() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_that:
			{
				match(LITERAL_that);
				break;
			}
			case LITERAL_which:
			{
				match(LITERAL_which);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_13);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void  comparator() throws RecognitionException, TokenStreamException {
		
		BinaryFactType binaryFactType = null;
		SBVR.impl.FactTypeImpl factType = null;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_is_not_greater_than:
			{
				match(LITERAL_is_not_greater_than);
				binaryFactType = new BinaryFactType(thingList, conceptualSchema, "1", null);
				factType = (FactTypeImpl) binaryFactType.create("number1 is_not_greater_than number2");
				break;
			}
			case LITERAL_is_greater_than:
			{
				match(LITERAL_is_greater_than);
				binaryFactType = new BinaryFactType(thingList, conceptualSchema, "1", null);
				factType = (FactTypeImpl) binaryFactType.create("number1 is_greater_than number2");
				break;
			}
			case LITERAL_is_not_less_than:
			{
				match(LITERAL_is_not_less_than);
				binaryFactType = new BinaryFactType(thingList, conceptualSchema, "1", null);
				factType = (FactTypeImpl) binaryFactType.create("number1 is_not_less_than number2");
				break;
			}
			case LITERAL_is_less_than:
			{
				match(LITERAL_is_less_than);
				binaryFactType = new BinaryFactType(thingList, conceptualSchema, "1", null);
				factType = (FactTypeImpl) binaryFactType.create("number1 is_less_than number2");
				break;
			}
			case LITERAL_equals:
			{
				match(LITERAL_equals);
				binaryFactType = new BinaryFactType(thingList, conceptualSchema, "1", null);
				factType = (FactTypeImpl) binaryFactType.create("number1 equals number2");
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			ruleComparator = new Rule(thingList, conceptualSchema, null);
			
			ruleComparator.setAtomicFormulation(sbvr_factory.createAtomicFormulation());
			
			ruleComparator.setFactType(factType);
			ruleComparator.setRoleIndexes(0, 1);
			
			ruleComparator.setRoleBinding1(sbvr_factory.createRoleBinding());
			ruleComparator.setRoleBinding2(sbvr_factory.createRoleBinding());
		
			ruleComparator.constructAtomicFormulation();
			
			ruleComparator.getAtomicFormulation().setVariable(rule.getVariable1());
			
			ruleComparator.getRoleBinding1().setBindableTarget(rule.getVariable1());
			
			lastRuleType = "comparator";
			lastRuleCreated = ruleComparator;
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_15);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void  clause() throws RecognitionException, TokenStreamException {
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_if:
			{
				match(LITERAL_if);
				Rule t = new Rule(thingList, conceptualSchema, null);
				t.setText(rule.getTextValue());
				ruleClause.add(t);
				
				lastRuleType = "clause";
				lastRuleCreated = t;
				
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_15);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void predicate() throws RecognitionException, TokenStreamException {
		
		Token  s = null;
		
		try {      // for error handling
			s = LT(1);
			
			lastRuleCreated.setVerb(s.getText());
			
			switch(LA(1)) {	
			case SIGNIFIER:
			{
				match(SIGNIFIER);
				break;
			}
			case LITERAL_is:
			{
				match(LITERAL_is);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			
			if ( inputState.guessing==0 ) {
				//verbs.add(s.getText());
			}
			{
			switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			case ICSIGNIFIER:
			case DOT:
			case LITERAL_The:
			case LITERAL_the:
			case LITERAL_A:
			case LITERAL_a:
			case LITERAL_An:
			case LITERAL_an:
			case LITERAL_each:
			case LITERAL_Each:
			case LITERAL_Some:
			case LITERAL_some:
			case LITERAL_More:
			case LITERAL_more:
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_14);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void conjunction() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_and:
			{
				match(LITERAL_and);
				
				if(lastRuleType.equals("clause")) {
					conjunctionFound = 1;
					Rule t = new Rule(thingList, conceptualSchema, null);
					t.setText(rule.getTextValue());
					t.setConnectionType("conjunction");
					ruleClause.add(t);
					
					lastRuleType = "clause";
					lastRuleCreated = t;
				}
				
				break;
			}
			case 31:
			{
				match(31);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			case LITERAL_The:
			case LITERAL_the:
			case LITERAL_A:
			case LITERAL_a:
			case LITERAL_An:
			case LITERAL_an:
			case LITERAL_that:
			case LITERAL_which:
			case LITERAL_It:
			case LITERAL_it:
			case DOT:
			case LITERAL_each:
			case LITERAL_Another:
			case LITERAL_another:
			case LITERAL_Who:
			case LITERAL_who:
			case LITERAL_What:
			case LITERAL_what:
			case LITERAL_Each:
			case LITERAL_Some:
			case LITERAL_some:
			case LITERAL_More:
			case LITERAL_more:
			case LITERAL_At:
			case LITERAL_at:
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_15);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void disjunction() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			match(LITERAL_or);
			
			if(lastRuleType.equals("clause")) {
				disjunctionFound = 1;
				Rule t = new Rule(thingList, conceptualSchema, null);
				t.setText(rule.getTextValue());
				t.setConnectionType("disjunction");
				ruleClause.add(t);
				
				lastRuleType = "clause";
				lastRuleCreated = t;
			}
			
			{
			match(WS);
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_15);
			} else {
			  throw ex;
			}
		}
	}
	
	public final RuleAttribute  attribute() throws RecognitionException, TokenStreamException {
		RuleAttribute att;
		
		Token  s = null;
		
		String value="";
		att = new RuleAttribute();
		String label="";
		
		
		try {      // for error handling
			label=caption();
			if ( inputState.guessing==0 ) {
				att.setCaption(label);
			}
			{
			int _cnt48=0;
			_loop48:
			do {
				if ((LA(1)==SIGNIFIER)) {
					s = LT(1);
					match(SIGNIFIER);
					{
					switch ( LA(1)) {
					case WS:
					{
						match(WS);
						break;
					}
					case NEWLINE:
					case SIGNIFIER:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					if ( inputState.guessing==0 ) {
						value = value + ((value!="")?" ":"") + s.getText();
					}
				}
				else {
					if ( _cnt48>=1 ) { break _loop48; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt48++;
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				att.setValue(value);			
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_16);
			} else {
			  throw ex;
			}
		}
		return att;
	}
	
	public final String  caption() throws RecognitionException, TokenStreamException {
		String l;
		
		
		l="";
		
		
		try {      // for error handling
			l=label();
			match(SEPARATOR);
			{
			switch ( LA(1)) {
			case WS:
			{
				match(WS);
				break;
			}
			case SIGNIFIER:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				l=l + ":";
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_13);
			} else {
			  throw ex;
			}
		}
		return l;
	}
	
	public final String  label() throws RecognitionException, TokenStreamException {
		String l;
		
		
		l="";
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_Name:
			{
				match(LITERAL_Name);
				if ( inputState.guessing==0 ) {
					l="Name";
				}
				break;
			}
			case LITERAL_Guidance:
			{
				{
				match(LITERAL_Guidance);
				match(WS);
				match(LITERAL_Type);
				}
				if ( inputState.guessing==0 ) {
					l="Guidance Type";
				}
				break;
			}
			case LITERAL_Description:
			{
				match(LITERAL_Description);
				if ( inputState.guessing==0 ) {
					l="Description";
				}
				break;
			}
			case LITERAL_Source:
			{
				match(LITERAL_Source);
				if ( inputState.guessing==0 ) {
					l="Source";
				}
				break;
			}
			case LITERAL_Note:
			{
				match(LITERAL_Note);
				if ( inputState.guessing==0 ) {
					l="Note";
				}
				break;
			}
			case LITERAL_Example:
			{
				match(LITERAL_Example);
				if ( inputState.guessing==0 ) {
					l="Example";
				}
				break;
			}
			case LITERAL_Synonymuos:
			{
				{
				match(LITERAL_Synonymuos);
				match(WS);
				match(LITERAL_Form);
				}
				if ( inputState.guessing==0 ) {
					l="Synonymuos Form";
				}
				break;
			}
			case LITERAL_Enforcement:
			{
				{
				match(LITERAL_Enforcement);
				match(WS);
				match(LITERAL_Level);
				}
				if ( inputState.guessing==0 ) {
					l="Enforcement Level";
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_17);
			} else {
			  throw ex;
			}
		}
		return l;
	}
	
	public final void num() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			match(NUMBER);
			
			if(rule.getNonNegativeInteger1() == null) {
				SBVR.NonNegativeInteger temp = sbvr_factory.createNonNegativeInteger();
				temp.setValue(Integer.parseInt(LT(0).getText()));
				rule.setNonNegativeInteger1(temp);
			}
			else {
				SBVR.NonNegativeInteger temp = sbvr_factory.createNonNegativeInteger();
				temp.setValue(Integer.parseInt(LT(0).getText()));
				rule.setNonNegativeInteger2(temp);
			}
			
			if(Integer.parseInt(LT(0).getText()) == 1){
				if(quantificationType == "atLeast")
					rule.setQuantification(sbvr_factory.createExistentialQuantification());
				
				if(quantificationType == "atMost") {
					if(rule.getQuantification() == null)
						rule.setQuantification(sbvr_factory.createAtMostOneQuantification());
					else
						if(rule.getQuantification() instanceof SBVR.AtLeastNQuantification || rule.getQuantification() instanceof SBVR.ExistentialQuantification)
							rule.setQuantification(sbvr_factory.createNumericRangeQuantification());					
				}
				
				if(quantificationType == "exactly")
					rule.setQuantification(sbvr_factory.createExactlyOneQuantification());
			}
			else {
				if(quantificationType == "atLeast")
					rule.setQuantification(sbvr_factory.createAtLeastNQuantification());
					
				if(quantificationType == "atMost"){
					if(rule.getQuantification() == null)
						rule.setQuantification(sbvr_factory.createAtMostNQuantification());
					else
						if(rule.getQuantification() instanceof SBVR.AtLeastNQuantification || rule.getQuantification() instanceof SBVR.ExistentialQuantification)
							rule.setQuantification(sbvr_factory.createNumericRangeQuantification());
				}
				
				if(quantificationType == "exactly")
					rule.setQuantification(sbvr_factory.createExactlyNQuantification());
			}
			
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
	}
	
	public final void num2() throws RecognitionException, TokenStreamException {
		try {      // for error handling
			match(NUMBER);	
			
			try{
				int num = Integer.parseInt(LT(0).getText());
				SBVR.Integer integer = sbvr_factory.createInteger();
				integer.setValue(num);
				
				SBVR.InstantiationFormulation inst = sbvr_factory.createInstantiationFormulation();
				SBVR.IndividualConcept ind = sbvr_factory.createIndividualConcept();
				
				inst.setConcept(integer);
				inst.setBindableTarget(ind);
				
				
				ruleComparator.setInteger(integer);
				ruleComparator.setVariable2(sbvr_factory.createVariable());
				
				ruleComparator.getVariable2().setRangedOverConcept(ruleComparator.getInteger());
				
				ruleComparator.getRoleBinding2().setBindableTarget(ruleComparator.getVariable2());
				
				ruleComparator.setIndividualConcept(ind);
				ruleComparator.setInstantiationFormulation(inst);
				
			}
			catch(Exception e){
				
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}	
	}
	
	public final void quantification2() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case LITERAL_At:
			case LITERAL_at:
			{
				{
				{
				switch ( LA(1)) {
				case LITERAL_At:
				{
					match(LITERAL_At);
					break;
				}
				case LITERAL_at:
				{
					match(LITERAL_at);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				match(WS);
				{
				switch ( LA(1)) {
				case LITERAL_least:
				{
					match(LITERAL_least);
					quantificationType = "atLeast";
					break;
				}
				case LITERAL_most:
				{
					match(LITERAL_most);
					quantificationType = "atMost";
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				}
				break;
			}
			case LITERAL_Exaclty:
			case LITERAL_exactly:
			{
				{
				switch ( LA(1)) {
				case LITERAL_Exaclty:
				{
					match(LITERAL_Exaclty);
					quantificationType = "exactly";
					break;
				}
				case LITERAL_exactly:
				{
					match(LITERAL_exactly);
					quantificationType = "exactly";
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(WS);
			{
			switch ( LA(1)) {
			case LITERAL_one:
			{
				match(LITERAL_one);

				if(rule.getNonNegativeInteger1() == null) {
					SBVR.NonNegativeInteger temp = sbvr_factory.createNonNegativeInteger();
					temp.setValue(1);
					rule.setNonNegativeInteger1(temp);
				}
				else {
					SBVR.NonNegativeInteger temp = sbvr_factory.createNonNegativeInteger();
					temp.setValue(1);
					rule.setNonNegativeInteger2(temp);				
				}
				
				if(quantificationType == "atLeast")
					rule.setQuantification(sbvr_factory.createExistentialQuantification());
				
				if(quantificationType == "atMost"){
					if(rule.getQuantification() == null)
						rule.setQuantification(sbvr_factory.createAtMostOneQuantification());
					else
						if(rule.getQuantification() instanceof SBVR.AtLeastNQuantification || rule.getQuantification() instanceof SBVR.ExistentialQuantification)
							rule.setQuantification(sbvr_factory.createNumericRangeQuantification());
				}
				
				if(quantificationType == "exactly")
					rule.setQuantification(sbvr_factory.createExactlyOneQuantification());
				break;
			}
			case NUMBER:
			{
				num();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_19);
			} else {
			  throw ex;
			}
		}
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"WS",
		"NEWLINE",
		"SIGNIFIER",
		"ICSIGNIFIER",
		"SEPARATOR",
		"\"Name\"",
		"\"Guidance\"",
		"\"Type\"",
		"\"Description\"",
		"\"Source\"",
		"\"Note\"",
		"\"Example\"",
		"\"Synonymuos\"",
		"\"Form\"",
		"\"Enforcement\"",
		"\"Level\"",
		"\"The\"",
		"\"the\"",
		"\"A\"",
		"\"a\"",
		"\"An\"",
		"\"an\"",
		"QUOTE",
		"NUMBER",
		"\"that\"",
		"\"which\"",
		"\"and\"",
		"\",\"",
		"\"or\"",
		"\"It\"",
		"\"it\"",
		"\"is\"",
		"\"obligatory\"",
		"\"prohibited\"",
		"\"necessary\"",
		"\"impossible\"",
		"\"possible\"",
		"\"permitted\"",
		"DOT",
		"\"given\"",
		"\"set\"",
		"\"of\"",
		"\"each\"",
		"\"Another\"",
		"\"another\"",
		"\"Who\"",
		"\"who\"",
		"\"What\"",
		"\"what\"",
		"\"Each\"",
		"\"Some\"",
		"\"some\"",
		"\"More\"",
		"\"more\"",
		"\"than\"",
		"\"one\"",
		"\"At\"",
		"\"at\"",
		"\"least\"",
		"\"most\"",
		"\"Exaclty\"",
		"\"exactly\"",
		"\"is_not_greater_than\"",
		"\"is_greater_than\"",
		"\"is_not_less_than\"",
		"\"is_less_than\"",
		"\"equals\"",
		"\"if\"",
		"\"-\""
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 3746924547063939072L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 3746924547064329746L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 390672L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 3746924547063939074L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 8866461782114304L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 3738058059527749632L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 3746928945110450176L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { 48L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { 192L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = { 3458764513820540928L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {
		long[] data = { 3746928953633275968L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	private static final long[] mk_tokenSet_12() {
		long[] data = { 3746928953431949376L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
	private static final long[] mk_tokenSet_13() {
		long[] data = { 64L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_13 = new BitSet(mk_tokenSet_13());
	private static final long[] mk_tokenSet_14() {
		long[] data = { 3738058059527749824L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_14 = new BitSet(mk_tokenSet_14());
	private static final long[] mk_tokenSet_15() {
		long[] data = { 3746928945915756608L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_15 = new BitSet(mk_tokenSet_15());
	private static final long[] mk_tokenSet_16() {
		long[] data = { 32L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_16 = new BitSet(mk_tokenSet_16());
	private static final long[] mk_tokenSet_17() {
		long[] data = { 256L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_17 = new BitSet(mk_tokenSet_17());
	private static final long[] mk_tokenSet_18() {
		long[] data = { 3746928953431949392L, 3L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_18 = new BitSet(mk_tokenSet_18());
	private static final long[] mk_tokenSet_19() {
		long[] data = { 16L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_19 = new BitSet(mk_tokenSet_19());
	
	}
