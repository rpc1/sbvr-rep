/*******************************************************************************
 * Copyright (c) 2009 Vetis.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://opensource.org/licenses/eclipse-1.0.php

 * Author:
 *	KTU  Department of Information Systems, http://www.isd.ktu.lt
 *
 *******************************************************************************/
package org.dbe.businessModeller.vocabulary.enterprise.sbvr;

import java.util.ArrayList;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;

public class Rule extends VetisSBVRManager{

	/**
	 * term1 of the fact type
	 */
	private ArrayList<String> terms = new ArrayList<String>();
	
	/**
	 * verb of the fact type
	 */
	private ArrayList<String> verbs = new ArrayList<String>();
	
	/**
	 * connection type with previous rule, conjunction or disjunction
	 */
	private String connectionType = "";
	
	/**
	 * fact types of the rule
	 */
	private SBVR.impl.FactTypeImpl factType = null;
	
	/**
	 * atomic formulation
	 */
	private SBVR.AtomicFormulation atomicFormulation = null;
	
	/**
	 * modal formulation
	 */
	private SBVR.ModalFormulation modalFormulation = null;
	
	/**
	 * projecting formulation
	 */
	private SBVR.ProjectingFormulation projectingFormulation = null;
	
	/**
	 * projection
	 */
	private SBVR.Projection projection = null;
	
	/**
	 * universal quantification2
	 */
	private SBVR.UniversalQuantification universalQuantification = null;
	
	/**
	 * quantification
	 */
	private SBVR.Quantification quantification = null;
	
	/**
	 * non-negative integers
	 */
	private SBVR.NonNegativeInteger nonNegativeInteger1 = null;
	private SBVR.NonNegativeInteger nonNegativeInteger2 = null;
	
	/**
	 * integer
	 */
	private SBVR.Integer integer = null;
	
	/**
	 * role bindings
	 */
	private SBVR.RoleBinding roleBinding1 = null;
	private SBVR.RoleBinding roleBinding2 = null;
	
	/**
	 * propositions
	 */
	private SBVR.Proposition proposition = null;
	
	/**
	 * statements
	 */
	private SBVR.Statement statement = null;
	
	/**
	 * text
	 */
	private SBVR.Text text = null;
	
	/**
	 * variables
	 */
	private SBVR.Variable variable1 = null;
	private SBVR.Variable variable2 = null;
	
	/**
	 * role indexes
	 */
	private int role1Index = 0;
	private int role2Index = 0;
	
	/**
	 * individual concept
	 */
	private SBVR.IndividualConcept individualConcept = null;
	
	/**
	 * instanttiation formulation
	 */
	private SBVR.InstantiationFormulation instantiationFormulation = null;
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newAttributesHandler
	 */
	public Rule(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newAttributesHandler);
	}
	
	/**
	 * Term adder
	 * @param newTerm1
	 */
	public void addTerm(String newTerm) {
		terms.add(newTerm);
	}

	/**
	 * Verb setter
	 * @param newVerb
	 */
	public void setVerb(String newVerb) {
		verbs.add(newVerb);
	}
	
	/**
	 * Term getter 
	 * @return term
	 */
	public String getTerm(int index) {
		if(terms.size() > index) {
			return terms.get(index); 
		}
		return "";
	}
	
	/**
	 * Terms1 array getter
	 * @return terms1
	 */
	public ArrayList<String> getTerms1() {
		return terms;
	}
	
	/**
	 * Verb getter 
	 * @return verb
	 */
	public String getVerb(int index) {
		if(verbs.size() > index) {
			return verbs.get(index); 
		}
		return "";
	}
	
	/**
	 * Verbs array getter
	 * @return verbs
	 */
	public ArrayList<String> getVerbs() {
		return verbs;
	}
	
	/**
	 * Connection type setter
	 * @param newConnectionType
	 */
	public void setConnectionType(String newConnectionType) {
		connectionType = newConnectionType;
	}
	
	/**
	 * Connection type getter
	 * @return connectionType
	 */
	public String getConnectionType() {
		return connectionType;
	}
	
	/**
	 * FactType setter
	 * @param newFactType
	 */
	public void setFactType(SBVR.impl.FactTypeImpl newFactType){
		factType = newFactType;
	}
	
	/**
	 * FactType getter
	 * @return
	 */
	public SBVR.FactType getFactType(){
		return factType;
	}
	
	/**
	 * AtomicFormulation setter
	 * @param newAtomicFormulation
	 */
	public void setAtomicFormulation(SBVR.AtomicFormulation newAtomicFormulation){
		atomicFormulation = newAtomicFormulation;
	}

	/**
	 * AtomicFormulation getter
	 * @return atomicFormulation
	 */
	public SBVR.AtomicFormulation getAtomicFormulation(){
		return atomicFormulation;
	}
	
	/**
	 * ModalFormulation setter
	 * @param newModalFormulation
	 */
	public void setModalFormulation(SBVR.ModalFormulation newModalFormulation) {
		modalFormulation = newModalFormulation;
	}
	
	/**
	 * ProjectingFormulation setter
	 * @param newLogicalFormulation
	 */
	public void setProjectingFormulation(SBVR.ProjectingFormulation newProjectingFormulation) {
		projectingFormulation = newProjectingFormulation;
	}
	
	/**
	 * ProjectingFormulation getter
	 * return projectingFormulation
	 */
	public SBVR.ProjectingFormulation getProjectingFormulation() {
		return projectingFormulation;
	}
	
	/**
	 * Projection setter
	 * @param newProjection
	 */
	public void setProjection(SBVR.Projection newProjection) {
		projection = newProjection;
	}
	
	/**
	 * Projection getter
	 * return projection
	 */
	public SBVR.Projection getProjection() {
		return projection;
	}
	

	/**
	 * UniversalQuantification setter
	 * @param newUniversalQuantification
	 */
	public void setUniversalQuantification(SBVR.UniversalQuantification newUniversalQuantification) {
		universalQuantification = newUniversalQuantification;
	}
	
	/**
	 * UniversalQuantification getter
	 * @return universalQuantification
	 */
	public SBVR.UniversalQuantification getUniversalQuantification() {
		return universalQuantification;
	}
	
	/**
	 * Quantification setter
	 * @param newQuantification
	 */
	public void setQuantification(SBVR.Quantification newQuantification) {
		quantification = newQuantification;
	}
	
	/**
	 * Quantification getter
	 * @return quantification
	 */
	public SBVR.Quantification getQuantification() {
		return quantification;
	}
	
	/**
	 * NonNegativeInteger1 setter
	 * @param newNonNegativeInteger1
	 */
	public void setNonNegativeInteger1(SBVR.NonNegativeInteger newNonNegativeInteger1) {
		nonNegativeInteger1 = newNonNegativeInteger1;
	}

	/**
	 * NonNegativeInteger1 getter
	 * @return nonNegativeInteger1
	 */
	public SBVR.NonNegativeInteger getNonNegativeInteger1() {
		return nonNegativeInteger1;
	}
	
	/**
	 * NonNegativeInteger2 setter
	 * @param newNonNegativeInteger2
	 */
	public void setNonNegativeInteger2(SBVR.NonNegativeInteger newNonNegativeInteger2) {
		nonNegativeInteger2 = newNonNegativeInteger2;
	}
	
	/**
	 * NonNegativeInteger2 getter
	 * @return nonNegativeInteger2
	 */
	public SBVR.NonNegativeInteger getNonNegativeInteger2() {
		return nonNegativeInteger2;
	}
	
	/**
	 * Integer setter
	 * @param newInteger
	 */
	public void setInteger(SBVR.Integer newInteger) {
		integer = newInteger;
	}
	
	/**
	 * Integer getter
	 * @return integer
	 */
	public SBVR.Integer getInteger() {
		return integer;
	}
	
	/**
	 * RoleBinding1 setter
	 * @param newRoleBinding1
	 */
	public void setRoleBinding1(SBVR.RoleBinding newRoleBinding1) {
		roleBinding1 = newRoleBinding1;
	}

	/**
	 * RoleBinding1 getter
	 * @return roleBinding1
	 */
	public SBVR.RoleBinding getRoleBinding1() {
		return roleBinding1;
	}
	
	/**
	 * RoleBinding2 setter
	 * @param newRoleBinding2
	 */
	public void setRoleBinding2(SBVR.RoleBinding newRoleBinding2) {
		roleBinding2 = newRoleBinding2;
	}
	
	/**
	 * RoleBinding2 getter
	 * @return roleBinding2
	 */
	public SBVR.RoleBinding getRoleBinding2() {
		return roleBinding2;
	}
	
	/**
	 * Proposition setter
	 * @param newProposition
	 */
	public void setProposition(SBVR.Proposition newProposition) {
		proposition = newProposition;
	}
	
	/**
	 * Statement setter
	 * @param newStatement
	 */
	public void setStatement(SBVR.Statement newStatement) {
		statement = newStatement;
	}
	
	/**
	 * Text setter
	 * @param newText
	 */
	public void setText(String newText) {
		text = super.createVetisText(newText);
	}
	
	/**
	 * Text value getter
	 * @return text value
	 */
	public String getTextValue() {
		if(text != null)
			return text.getValue();
		return "";
	}
	
	/**
	 * Variables1 setter
	 * @param newVariable1
	 */
	public void setVariable1(SBVR.Variable newVariable1) {
		variable1 = newVariable1;
	}
	
	/**
	 * Variable1 getter
	 * @return variable1
	 */
	public SBVR.Variable getVariable1() {
		return variable1;
	}
	
	/**
	 * Variables2 setter
	 * @param newVariable2
	 */
	public void setVariable2(SBVR.Variable newVariable2) {
		variable2 = newVariable2;
	}
	
	/**
	 * Variable2 getter
	 * @return variable2
	 */
	public SBVR.Variable getVariable2() {
		return variable2;
	}
	
	/**
	 * Role indexes setter
	 * @param newRole1Index
	 * @param newRole2Index
	 */
	public void setRoleIndexes(int newRole1Index, int newRole2Index){
		role1Index = newRole1Index;
		role2Index = newRole2Index;
	}
	/**
	 * Role1 index getter
	 * @return role1Index
	 */
	public int getRole1Index() {
		return role1Index;
	}

	/**
	 * Role2 index getter
	 * @return role2Index
	 */
	public int getRole2Index() {
		return role2Index;
	}
	
	/**
	 * Instantiation formulation setter
	 * @param newInstantiationFormulation
	 */
	public void setInstantiationFormulation(SBVR.InstantiationFormulation newInstantiationFormulation) {
		instantiationFormulation = newInstantiationFormulation;
	}

	/**
	 * Instantiation formulation getter
	 * @return
	 */
	public SBVR.InstantiationFormulation getInstantiationFormulation() {
		return instantiationFormulation;
	}
	
	/**
	 * Individual concept setter
	 * @param newIndividualConcept
	 */
	public void setIndividualConcept(SBVR.IndividualConcept newIndividualConcept) {
		individualConcept = newIndividualConcept;
	}
	
	/**
	 * Individual concept getter
	 * @return
	 */
	public SBVR.IndividualConcept getIndividualConcept() {
		return individualConcept;
	}
	
	/**
	 * Atomic formulation constructor
	 * @return
	 */
	public boolean constructAtomicFormulation(){
		try {
			if(atomicFormulation != null && factType != null)
				atomicFormulation.setFactType(factType);
			
			try {
				if(roleBinding1 != null && factType != null)
					roleBinding1.setFactTypeRole(factType.getRole().get(role1Index));
			
				if(roleBinding2 != null && factType != null)
					roleBinding2.setFactTypeRole(factType.getRole().get(role2Index));
			}
			catch (IndexOutOfBoundsException e) {}
			
			if(roleBinding1 != null && atomicFormulation != null)
				roleBinding1.setAtomicFormulation(atomicFormulation);
			
			if(roleBinding2 != null && atomicFormulation != null)
				roleBinding2.setAtomicFormulation(atomicFormulation);
			
			if(variable1 != null && factType != null)
				variable1.setFactTypeRole(factType.getRole().get(role1Index));
			
			if(variable2 != null)
				variable2.setFactTypeRole(factType.getRole().get(role2Index));
			
			if(roleBinding1 != null && variable1 != null)
				roleBinding1.setBindableTarget(variable1);
			
			if(roleBinding2 != null && variable2 != null)
				roleBinding2.setBindableTarget(variable2);
			
			if(universalQuantification != null && variable1 != null)
				universalQuantification.setVariable(variable1);
			
			if(statement != null && proposition != null)
				statement.setMeaning(proposition);
			
			if(statement != null && text != null)
				statement.setExpression(text);
			
			if(projectingFormulation != null && projection != null)
				projectingFormulation.setProjection(projection);
			
			if(atomicFormulation != null && projection != null)
				projection.setConstrainingFormulation(atomicFormulation);
		}
		catch(Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Rule constructor
	 */
	public void construct(){
		if(modalFormulation != null && universalQuantification != null) {
			modalFormulation.setLogicalFormulation(universalQuantification);
		}

		if(quantification != null)
			quantification.setScopeFormulation(atomicFormulation);
		
		if(universalQuantification != null) {
			if(quantification != null)
				universalQuantification.setScopeFormulation(quantification);
			else if(atomicFormulation != null)
				universalQuantification.setScopeFormulation(atomicFormulation);
		}
		
		if(quantification != null && variable2 != null)
			quantification.setVariable(variable2);

		if(modalFormulation != null && proposition != null)
			modalFormulation.setProposition(proposition);
				
		
		if(quantification instanceof SBVR.ExactlyNQuantification){
			((SBVR.ExactlyNQuantification) quantification).setCardinality(nonNegativeInteger1);
		}

		if(quantification instanceof SBVR.AtLeastNQuantification){
			((SBVR.AtLeastNQuantification) quantification).setMinimumCardinality(nonNegativeInteger1);
		}

		if(quantification instanceof SBVR.AtMostNQuantification){
			((SBVR.AtMostNQuantification) quantification).setMaximumCardinality(nonNegativeInteger1);
		}
		
		if(quantification instanceof SBVR.NumericRangeQuantification) {
			((SBVR.NumericRangeQuantification) quantification).setMinimumCardinality(nonNegativeInteger1);
			((SBVR.NumericRangeQuantification) quantification).setMaximumCardinality(nonNegativeInteger2);
		}
	}
	
	/**
	 * Put all created elements to appropriate lists
	 */
	public void putElementsToThingList(){
		if(atomicFormulation != null && atomicFormulation.getFactType() != null)
			thingList.add(atomicFormulation);
		if(modalFormulation != null && modalFormulation.getProposition() != null)
			thingList.add(modalFormulation);
		if(universalQuantification != null && universalQuantification.getVariable() != null)
			thingList.add(universalQuantification);
		
		if(quantification != null)
			thingList.add(quantification);
		if(nonNegativeInteger1 != null)
			thingList.add(nonNegativeInteger1);
		if(nonNegativeInteger2 != null)
			thingList.add(nonNegativeInteger2);
		if(integer != null)
			thingList.add(integer);
		if(roleBinding1 != null && roleBinding1.getBindableTarget() != null)
			thingList.add(roleBinding1);
		if(roleBinding2 != null && roleBinding2.getBindableTarget() != null)
			thingList.add(roleBinding2);
		if(proposition != null && modalFormulation != null && modalFormulation.getProposition() != null)
			thingList.add(proposition);
		if(statement != null && statement.getExpression() != null && statement.getMeaning() != null)
			thingList.add(statement);
		if(text != null && statement != null && statement.getExpression() != null)
			thingList.add(text);
		if(variable1 != null && variable1.getFactTypeRole() != null)
			thingList.add(variable1);
		if(variable2 != null  && variable2.getFactTypeRole() != null)
			thingList.add(variable2);
		if(individualConcept != null)
			thingList.add(individualConcept);
		if(instantiationFormulation != null)
			thingList.add(instantiationFormulation);
		if(projectingFormulation != null)
			thingList.add(projectingFormulation);
		if(projection != null)
			thingList.add(projection);
	}
	
}
