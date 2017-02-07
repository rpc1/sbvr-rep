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
package SBVR;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SBVR.SBVRPackage
 * @generated
 */
public interface SBVRFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SBVRFactory eINSTANCE = SBVR.impl.SBVRFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Body Of Shared Meanings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Of Shared Meanings</em>'.
	 * @generated
	 */
	BodyOfSharedMeanings createBodyOfSharedMeanings();

	/**
	 * Returns a new object of class '<em>Terminological Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminological Dictionary</em>'.
	 * @generated
	 */
	TerminologicalDictionary createTerminologicalDictionary();

	/**
	 * Returns a new object of class '<em>Vocabulary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vocabulary</em>'.
	 * @generated
	 */
	Vocabulary createVocabulary();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	Term createTerm();

	/**
	 * Returns a new object of class '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name</em>'.
	 * @generated
	 */
	Name createName();

	/**
	 * Returns a new object of class '<em>Fact Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact Symbol</em>'.
	 * @generated
	 */
	FactSymbol createFactSymbol();

	/**
	 * Returns a new object of class '<em>Rulebook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rulebook</em>'.
	 * @generated
	 */
	Rulebook createRulebook();

	/**
	 * Returns a new object of class '<em>Business Vocabulary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Vocabulary</em>'.
	 * @generated
	 */
	BusinessVocabulary createBusinessVocabulary();

	/**
	 * Returns a new object of class '<em>Subject Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subject Field</em>'.
	 * @generated
	 */
	SubjectField createSubjectField();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	Description createDescription();

	/**
	 * Returns a new object of class '<em>Descriptive Example</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptive Example</em>'.
	 * @generated
	 */
	DescriptiveExample createDescriptiveExample();

	/**
	 * Returns a new object of class '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note</em>'.
	 * @generated
	 */
	Note createNote();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Communication Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Content</em>'.
	 * @generated
	 */
	CommunicationContent createCommunicationContent();

	/**
	 * Returns a new object of class '<em>Community</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Community</em>'.
	 * @generated
	 */
	Community createCommunity();

	/**
	 * Returns a new object of class '<em>Semantic Community</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Community</em>'.
	 * @generated
	 */
	SemanticCommunity createSemanticCommunity();

	/**
	 * Returns a new object of class '<em>Speech Community</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Community</em>'.
	 * @generated
	 */
	SpeechCommunity createSpeechCommunity();

	/**
	 * Returns a new object of class '<em>Nonverbal Designation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nonverbal Designation</em>'.
	 * @generated
	 */
	NonverbalDesignation createNonverbalDesignation();

	/**
	 * Returns a new object of class '<em>Icon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Icon</em>'.
	 * @generated
	 */
	Icon createIcon();

	/**
	 * Returns a new object of class '<em>Partitive Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partitive Fact Type</em>'.
	 * @generated
	 */
	PartitiveFactType createPartitiveFactType();

	/**
	 * Returns a new object of class '<em>Fundamental Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fundamental Concept</em>'.
	 * @generated
	 */
	FundamentalConcept createFundamentalConcept();

	/**
	 * Returns a new object of class '<em>Situational Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Situational Role</em>'.
	 * @generated
	 */
	SituationalRole createSituationalRole();

	/**
	 * Returns a new object of class '<em>Associative Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Associative Fact Type</em>'.
	 * @generated
	 */
	AssociativeFactType createAssociativeFactType();

	/**
	 * Returns a new object of class '<em>Is Property Of Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Property Of Fact Type</em>'.
	 * @generated
	 */
	IsPropertyOfFactType createIsPropertyOfFactType();

	/**
	 * Returns a new object of class '<em>Assortment Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assortment Fact Type</em>'.
	 * @generated
	 */
	AssortmentFactType createAssortmentFactType();

	/**
	 * Returns a new object of class '<em>Specialization Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialization Fact Type</em>'.
	 * @generated
	 */
	SpecializationFactType createSpecializationFactType();

	/**
	 * Returns a new object of class '<em>Categorization Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorization Fact Type</em>'.
	 * @generated
	 */
	CategorizationFactType createCategorizationFactType();

	/**
	 * Returns a new object of class '<em>Contextualization Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contextualization Fact Type</em>'.
	 * @generated
	 */
	ContextualizationFactType createContextualizationFactType();

	/**
	 * Returns a new object of class '<em>Contextualized Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contextualized Concept</em>'.
	 * @generated
	 */
	ContextualizedConcept createContextualizedConcept();

	/**
	 * Returns a new object of class '<em>Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facet</em>'.
	 * @generated
	 */
	Facet createFacet();

	/**
	 * Returns a new object of class '<em>Is Role Of Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Role Of Fact Type</em>'.
	 * @generated
	 */
	IsRoleOfFactType createIsRoleOfFactType();

	/**
	 * Returns a new object of class '<em>Is Facet Of Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Facet Of Fact Type</em>'.
	 * @generated
	 */
	IsFacetOfFactType createIsFacetOfFactType();

	/**
	 * Returns a new object of class '<em>Element Of Guidance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Of Guidance</em>'.
	 * @generated
	 */
	ElementOfGuidance createElementOfGuidance();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	SBVR.Package createPackage();

	/**
	 * Returns a new object of class '<em>Conceptual Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conceptual Schema</em>'.
	 * @generated
	 */
	ConceptualSchema createConceptualSchema();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	Definition createDefinition();

	/**
	 * Returns a new object of class '<em>Designation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Designation</em>'.
	 * @generated
	 */
	Designation createDesignation();

	/**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	Set createSet();

	/**
	 * Returns a new object of class '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer</em>'.
	 * @generated
	 */
	SBVR.Integer createInteger();

	/**
	 * Returns a new object of class '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number</em>'.
	 * @generated
	 */
	SBVR.Number createNumber();

	/**
	 * Returns a new object of class '<em>Reference Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Scheme</em>'.
	 * @generated
	 */
	ReferenceScheme createReferenceScheme();

	/**
	 * Returns a new object of class '<em>Fact Type Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact Type Role</em>'.
	 * @generated
	 */
	FactTypeRole createFactTypeRole();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Type</em>'.
	 * @generated
	 */
	ObjectType createObjectType();

	/**
	 * Returns a new object of class '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic</em>'.
	 * @generated
	 */
	Characteristic createCharacteristic();

	/**
	 * Returns a new object of class '<em>Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact Type</em>'.
	 * @generated
	 */
	FactType createFactType();

	/**
	 * Returns a new object of class '<em>Fact Type Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact Type Form</em>'.
	 * @generated
	 */
	FactTypeForm createFactTypeForm();

	/**
	 * Returns a new object of class '<em>Placeholder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placeholder</em>'.
	 * @generated
	 */
	Placeholder createPlaceholder();

	/**
	 * Returns a new object of class '<em>Binary Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Fact Type</em>'.
	 * @generated
	 */
	BinaryFactType createBinaryFactType();

	/**
	 * Returns a new object of class '<em>Fact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact</em>'.
	 * @generated
	 */
	Fact createFact();

	/**
	 * Returns a new object of class '<em>Proposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proposition</em>'.
	 * @generated
	 */
	Proposition createProposition();

	/**
	 * Returns a new object of class '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement</em>'.
	 * @generated
	 */
	Statement createStatement();

	/**
	 * Returns a new object of class '<em>Fact Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact Model</em>'.
	 * @generated
	 */
	FactModel createFactModel();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace</em>'.
	 * @generated
	 */
	Namespace createNamespace();

	/**
	 * Returns a new object of class '<em>URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URI</em>'.
	 * @generated
	 */
	URI createURI();

	/**
	 * Returns a new object of class '<em>Individual Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Concept</em>'.
	 * @generated
	 */
	IndividualConcept createIndividualConcept();

	/**
	 * Returns a new object of class '<em>Concept Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Type</em>'.
	 * @generated
	 */
	ConceptType createConceptType();

	/**
	 * Returns a new object of class '<em>Non Negative Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Negative Integer</em>'.
	 * @generated
	 */
	NonNegativeInteger createNonNegativeInteger();

	/**
	 * Returns a new object of class '<em>Positive Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Integer</em>'.
	 * @generated
	 */
	PositiveInteger createPositiveInteger();

	/**
	 * Returns a new object of class '<em>Sentential Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sentential Form</em>'.
	 * @generated
	 */
	SententialForm createSententialForm();

	/**
	 * Returns a new object of class '<em>Noun Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Noun Form</em>'.
	 * @generated
	 */
	NounForm createNounForm();

	/**
	 * Returns a new object of class '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language</em>'.
	 * @generated
	 */
	Language createLanguage();

	/**
	 * Returns a new object of class '<em>Vocabulary Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vocabulary Namespace</em>'.
	 * @generated
	 */
	VocabularyNamespace createVocabularyNamespace();

	/**
	 * Returns a new object of class '<em>Attributive Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributive Namespace</em>'.
	 * @generated
	 */
	AttributiveNamespace createAttributiveNamespace();

	/**
	 * Returns a new object of class '<em>Semantic Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Formulation</em>'.
	 * @generated
	 */
	SemanticFormulation createSemanticFormulation();

	/**
	 * Returns a new object of class '<em>Closed Semantic Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closed Semantic Formulation</em>'.
	 * @generated
	 */
	ClosedSemanticFormulation createClosedSemanticFormulation();

	/**
	 * Returns a new object of class '<em>Logical Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Formulation</em>'.
	 * @generated
	 */
	LogicalFormulation createLogicalFormulation();

	/**
	 * Returns a new object of class '<em>Projection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projection</em>'.
	 * @generated
	 */
	Projection createProjection();

	/**
	 * Returns a new object of class '<em>Atomic Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Formulation</em>'.
	 * @generated
	 */
	AtomicFormulation createAtomicFormulation();

	/**
	 * Returns a new object of class '<em>Instantiation Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instantiation Formulation</em>'.
	 * @generated
	 */
	InstantiationFormulation createInstantiationFormulation();

	/**
	 * Returns a new object of class '<em>Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantification</em>'.
	 * @generated
	 */
	Quantification createQuantification();

	/**
	 * Returns a new object of class '<em>Objectification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objectification</em>'.
	 * @generated
	 */
	Objectification createObjectification();

	/**
	 * Returns a new object of class '<em>Proposition Nominalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proposition Nominalization</em>'.
	 * @generated
	 */
	PropositionNominalization createPropositionNominalization();

	/**
	 * Returns a new object of class '<em>Closed Logical Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closed Logical Formulation</em>'.
	 * @generated
	 */
	ClosedLogicalFormulation createClosedLogicalFormulation();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Role Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Binding</em>'.
	 * @generated
	 */
	RoleBinding createRoleBinding();

	/**
	 * Returns a new object of class '<em>Modal Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modal Formulation</em>'.
	 * @generated
	 */
	ModalFormulation createModalFormulation();

	/**
	 * Returns a new object of class '<em>Necessity Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Necessity Formulation</em>'.
	 * @generated
	 */
	NecessityFormulation createNecessityFormulation();

	/**
	 * Returns a new object of class '<em>Obligation Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obligation Formulation</em>'.
	 * @generated
	 */
	ObligationFormulation createObligationFormulation();

	/**
	 * Returns a new object of class '<em>Permissibility Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Permissibility Formulation</em>'.
	 * @generated
	 */
	PermissibilityFormulation createPermissibilityFormulation();

	/**
	 * Returns a new object of class '<em>Possibility Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Possibility Formulation</em>'.
	 * @generated
	 */
	PossibilityFormulation createPossibilityFormulation();

	/**
	 * Returns a new object of class '<em>Logical Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Operation</em>'.
	 * @generated
	 */
	LogicalOperation createLogicalOperation();

	/**
	 * Returns a new object of class '<em>Logical Negation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Negation</em>'.
	 * @generated
	 */
	LogicalNegation createLogicalNegation();

	/**
	 * Returns a new object of class '<em>Binary Logical Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Logical Operation</em>'.
	 * @generated
	 */
	BinaryLogicalOperation createBinaryLogicalOperation();

	/**
	 * Returns a new object of class '<em>Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjunction</em>'.
	 * @generated
	 */
	Conjunction createConjunction();

	/**
	 * Returns a new object of class '<em>Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjunction</em>'.
	 * @generated
	 */
	Disjunction createDisjunction();

	/**
	 * Returns a new object of class '<em>Equivalence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalence</em>'.
	 * @generated
	 */
	Equivalence createEquivalence();

	/**
	 * Returns a new object of class '<em>Exclusive Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Disjunction</em>'.
	 * @generated
	 */
	ExclusiveDisjunction createExclusiveDisjunction();

	/**
	 * Returns a new object of class '<em>Implication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implication</em>'.
	 * @generated
	 */
	Implication createImplication();

	/**
	 * Returns a new object of class '<em>Nand Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nand Formulation</em>'.
	 * @generated
	 */
	NandFormulation createNandFormulation();

	/**
	 * Returns a new object of class '<em>Nor Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nor Formulation</em>'.
	 * @generated
	 */
	NorFormulation createNorFormulation();

	/**
	 * Returns a new object of class '<em>Whether Or Not Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Whether Or Not Formulation</em>'.
	 * @generated
	 */
	WhetherOrNotFormulation createWhetherOrNotFormulation();

	/**
	 * Returns a new object of class '<em>Universal Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universal Quantification</em>'.
	 * @generated
	 */
	UniversalQuantification createUniversalQuantification();

	/**
	 * Returns a new object of class '<em>At Least NQuantification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At Least NQuantification</em>'.
	 * @generated
	 */
	AtLeastNQuantification createAtLeastNQuantification();

	/**
	 * Returns a new object of class '<em>Existential Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existential Quantification</em>'.
	 * @generated
	 */
	ExistentialQuantification createExistentialQuantification();

	/**
	 * Returns a new object of class '<em>Numeric Range Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Range Quantification</em>'.
	 * @generated
	 */
	NumericRangeQuantification createNumericRangeQuantification();

	/**
	 * Returns a new object of class '<em>At Most NQuantification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At Most NQuantification</em>'.
	 * @generated
	 */
	AtMostNQuantification createAtMostNQuantification();

	/**
	 * Returns a new object of class '<em>At Most One Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At Most One Quantification</em>'.
	 * @generated
	 */
	AtMostOneQuantification createAtMostOneQuantification();

	/**
	 * Returns a new object of class '<em>Exactly NQuantification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exactly NQuantification</em>'.
	 * @generated
	 */
	ExactlyNQuantification createExactlyNQuantification();

	/**
	 * Returns a new object of class '<em>Exactly One Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exactly One Quantification</em>'.
	 * @generated
	 */
	ExactlyOneQuantification createExactlyOneQuantification();

	/**
	 * Returns a new object of class '<em>Projecting Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projecting Formulation</em>'.
	 * @generated
	 */
	ProjectingFormulation createProjectingFormulation();

	/**
	 * Returns a new object of class '<em>Aggregation Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation Formulation</em>'.
	 * @generated
	 */
	AggregationFormulation createAggregationFormulation();

	/**
	 * Returns a new object of class '<em>Noun Concept Nominalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Noun Concept Nominalization</em>'.
	 * @generated
	 */
	NounConceptNominalization createNounConceptNominalization();

	/**
	 * Returns a new object of class '<em>Fact Type Nominalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fact Type Nominalization</em>'.
	 * @generated
	 */
	FactTypeNominalization createFactTypeNominalization();

	/**
	 * Returns a new object of class '<em>Question Nominalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Nominalization</em>'.
	 * @generated
	 */
	QuestionNominalization createQuestionNominalization();

	/**
	 * Returns a new object of class '<em>Answer Nominalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer Nominalization</em>'.
	 * @generated
	 */
	AnswerNominalization createAnswerNominalization();

	/**
	 * Returns a new object of class '<em>Auxiliary Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auxiliary Variable</em>'.
	 * @generated
	 */
	AuxiliaryVariable createAuxiliaryVariable();

	/**
	 * Returns a new object of class '<em>Bag Projection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag Projection</em>'.
	 * @generated
	 */
	BagProjection createBagProjection();

	/**
	 * Returns a new object of class '<em>Set Projection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Projection</em>'.
	 * @generated
	 */
	SetProjection createSetProjection();

	/**
	 * Returns a new object of class '<em>Logical Formulation Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Formulation Kind</em>'.
	 * @generated
	 */
	LogicalFormulationKind createLogicalFormulationKind();

	/**
	 * Returns a new object of class '<em>Closed Projection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closed Projection</em>'.
	 * @generated
	 */
	ClosedProjection createClosedProjection();

	/**
	 * Returns a new object of class '<em>Categorization Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorization Scheme</em>'.
	 * @generated
	 */
	CategorizationScheme createCategorizationScheme();

	/**
	 * Returns a new object of class '<em>Categorization Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorization Type</em>'.
	 * @generated
	 */
	CategorizationType createCategorizationType();

	/**
	 * Returns a new object of class '<em>Segmentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segmentation</em>'.
	 * @generated
	 */
	Segmentation createSegmentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SBVRPackage getSBVRPackage();

} //SBVRFactory
