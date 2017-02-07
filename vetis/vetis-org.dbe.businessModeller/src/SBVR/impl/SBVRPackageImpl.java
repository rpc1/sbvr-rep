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
package SBVR.impl;

import SBVR.Actuality;
import SBVR.AggregationFormulation;
import SBVR.AnswerNominalization;
import SBVR.AssociativeFactType;
import SBVR.AssortmentFactType;
import SBVR.AtLeastNQuantification;
import SBVR.AtMostNQuantification;
import SBVR.AtMostOneQuantification;
import SBVR.AtomicFormulation;
import SBVR.AttributiveNamespace;
import SBVR.AuxiliaryVariable;
import SBVR.BagProjection;
import SBVR.BinaryFactType;
import SBVR.BinaryLogicalOperation;
import SBVR.BindableTarget;
import SBVR.BodyOfSharedMeanings;
import SBVR.BusinessVocabulary;
import SBVR.CategorizationFactType;
import SBVR.CategorizationScheme;
import SBVR.CategorizationType;
import SBVR.Characteristic;
import SBVR.ClosedLogicalFormulation;
import SBVR.ClosedProjection;
import SBVR.ClosedSemanticFormulation;
import SBVR.CommunicationContent;
import SBVR.Community;
import SBVR.Concept;
import SBVR.ConceptType;
import SBVR.ConceptualSchema;
import SBVR.Conjunction;
import SBVR.ContextualizationFactType;
import SBVR.ContextualizedConcept;
import SBVR.Definition;
import SBVR.Description;
import SBVR.DescriptiveExample;
import SBVR.Designation;
import SBVR.Disjunction;
import SBVR.ElementOfGuidance;
import SBVR.Equivalence;
import SBVR.ExactlyNQuantification;
import SBVR.ExactlyOneQuantification;
import SBVR.ExclusiveDisjunction;
import SBVR.ExistentialQuantification;
import SBVR.Expression;
import SBVR.Facet;
import SBVR.Fact;
import SBVR.FactModel;
import SBVR.FactSymbol;
import SBVR.FactType;
import SBVR.FactTypeForm;
import SBVR.FactTypeNominalization;
import SBVR.FactTypeRole;
import SBVR.FundamentalConcept;
import SBVR.Icon;
import SBVR.Implication;
import SBVR.IndividualConcept;
import SBVR.InstantiationFormulation;
import SBVR.IsFacetOfFactType;
import SBVR.IsPropertyOfFactType;
import SBVR.IsRoleOfFactType;
import SBVR.Language;
import SBVR.LogicalFormulation;
import SBVR.LogicalFormulationKind;
import SBVR.LogicalNegation;
import SBVR.LogicalOperation;
import SBVR.Meaning;
import SBVR.ModalFormulation;
import SBVR.Name;
import SBVR.Namespace;
import SBVR.NandFormulation;
import SBVR.NecessityFormulation;
import SBVR.NonNegativeInteger;
import SBVR.NonverbalDesignation;
import SBVR.NorFormulation;
import SBVR.Note;
import SBVR.NounConcept;
import SBVR.NounConceptNominalization;
import SBVR.NounForm;
import SBVR.NumericRangeQuantification;
import SBVR.ObjectType;
import SBVR.Objectification;
import SBVR.ObligationFormulation;
import SBVR.PartitiveFactType;
import SBVR.PermissibilityFormulation;
import SBVR.Placeholder;
import SBVR.PositiveInteger;
import SBVR.PossibilityFormulation;
import SBVR.ProjectingFormulation;
import SBVR.Projection;
import SBVR.Proposition;
import SBVR.PropositionNominalization;
import SBVR.QualifiedDesignation;
import SBVR.Quantification;
import SBVR.Quantity;
import SBVR.Question;
import SBVR.QuestionNominalization;
import SBVR.Reference;
import SBVR.ReferenceScheme;
import SBVR.Representation;
import SBVR.Role;
import SBVR.RoleBinding;
import SBVR.Rule;
import SBVR.Rulebook;
import SBVR.SBVRFactory;
import SBVR.SBVRPackage;
import SBVR.Segmentation;
import SBVR.SemanticCommunity;
import SBVR.SemanticFormulation;
import SBVR.SententialForm;
import SBVR.Set;
import SBVR.SetProjection;
import SBVR.SituationalRole;
import SBVR.SpecializationFactType;
import SBVR.SpeechCommunity;
import SBVR.StateOfAffairs;
import SBVR.Statement;
import SBVR.SubjectField;
import SBVR.Term;
import SBVR.TerminologicalDictionary;
import SBVR.Text;
import SBVR.Thing;
import SBVR.UniversalQuantification;
import SBVR.Variable;
import SBVR.Vocabulary;
import SBVR.VocabularyNamespace;
import SBVR.WhetherOrNotFormulation;

import java.lang.Integer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SBVRPackageImpl extends EPackageImpl implements SBVRPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyOfSharedMeaningsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologicalDictionaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedDesignationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulebookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessVocabularyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptiveExampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticCommunityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechCommunityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonverbalDesignationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitiveFactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fundamentalConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass situationalRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associativeFactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isPropertyOfFactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assortmentFactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationFactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorizationFactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextualizationFactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextualizedConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isRoleOfFactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isFacetOfFactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementOfGuidanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meaningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateOfAffairsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindableTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nounConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceSchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeholderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryFactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonNegativeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sententialFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nounFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributiveNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closedSemanticFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantiationFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propositionNominalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closedLogicalFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass necessityFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obligationFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissibilityFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass possibilityFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalNegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryLogicalOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveDisjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nandFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass norFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whetherOrNotFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalQuantificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atLeastNQuantificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existentialQuantificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericRangeQuantificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atMostNQuantificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atMostOneQuantificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exactlyNQuantificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exactlyOneQuantificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectingFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationFormulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nounConceptNominalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeNominalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionNominalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerNominalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxiliaryVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagProjectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setProjectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalFormulationKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closedProjectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorizationSchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eClassEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see SBVR.SBVRPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SBVRPackageImpl() {
		super(eNS_URI, SBVRFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SBVRPackage init() {
		if (isInited) return (SBVRPackage)EPackage.Registry.INSTANCE.getEPackage(SBVRPackage.eNS_URI);

		// Obtain or create and register package
		SBVRPackageImpl theSBVRPackage = (SBVRPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SBVRPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SBVRPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSBVRPackage.createPackageContents();

		// Initialize created meta-data
		theSBVRPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSBVRPackage.freeze();

		return theSBVRPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyOfSharedMeanings() {
		return bodyOfSharedMeaningsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyOfSharedMeanings_Concept() {
		return (EReference)bodyOfSharedMeaningsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyOfSharedMeanings_Proposition() {
		return (EReference)bodyOfSharedMeaningsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologicalDictionary() {
		return terminologicalDictionaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologicalDictionary_Representation() {
		return (EReference)terminologicalDictionaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologicalDictionary_Vocabulary() {
		return (EReference)terminologicalDictionaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologicalDictionary_BodyOfSharedMeaning() {
		return (EReference)terminologicalDictionaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologicalDictionary_Uri() {
		return (EReference)terminologicalDictionaryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabulary() {
		return vocabularyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabulary_Designation() {
		return (EReference)vocabularyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabulary_FactTypeForm() {
		return (EReference)vocabularyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabulary_BodyOfSharedMeaning() {
		return (EReference)vocabularyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabulary_Namespace() {
		return (EReference)vocabularyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabulary_IncorporatedVocabulary() {
		return (EReference)vocabularyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedDesignation() {
		return qualifiedDesignationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedDesignation_Preferred() {
		return (EAttribute)qualifiedDesignationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedDesignation_Prohibited() {
		return (EAttribute)qualifiedDesignationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getName_() {
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getName_RefersTo() {
		return (EReference)nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactSymbol() {
		return factSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRulebook() {
		return rulebookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRulebook_Representation() {
		return (EReference)rulebookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessVocabulary() {
		return businessVocabularyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectField() {
		return subjectFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptiveExample() {
		return descriptiveExampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_InformationSource() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationContent() {
		return communicationContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationContent_Representation() {
		return (EReference)communicationContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunity() {
		return communityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunity_Uri() {
		return (EReference)communityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunity_SubCommunity() {
		return (EReference)communityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticCommunity() {
		return semanticCommunityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticCommunity_SpeechCommunity() {
		return (EReference)semanticCommunityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechCommunity() {
		return speechCommunityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeechCommunity_OwnedVocabulary() {
		return (EReference)speechCommunityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeechCommunity_UsedVocabulary() {
		return (EReference)speechCommunityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonverbalDesignation() {
		return nonverbalDesignationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIcon() {
		return iconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitiveFactType() {
		return partitiveFactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFundamentalConcept() {
		return fundamentalConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSituationalRole() {
		return situationalRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociativeFactType() {
		return associativeFactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsPropertyOfFactType() {
		return isPropertyOfFactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssortmentFactType() {
		return assortmentFactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecializationFactType() {
		return specializationFactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorizationFactType() {
		return categorizationFactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextualizationFactType() {
		return contextualizationFactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextualizedConcept() {
		return contextualizedConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacet() {
		return facetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsRoleOfFactType() {
		return isRoleOfFactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsFacetOfFactType() {
		return isFacetOfFactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementOfGuidance() {
		return elementOfGuidanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackagedElement() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestedPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Name() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThing() {
		return thingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualSchema() {
		return conceptualSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptualSchema_Concept() {
		return (EReference)conceptualSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptualSchema_Fact() {
		return (EReference)conceptualSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Designation() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Definition() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_General() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Coextensive() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Instance() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Extension() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_ReferenceScheme() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeaning() {
		return meaningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeaning_Representation() {
		return (EReference)meaningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentation() {
		return representationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentation_Meaning() {
		return (EReference)representationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentation_Expression() {
		return (EReference)representationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuality() {
		return actualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateOfAffairs() {
		return stateOfAffairsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindableTarget() {
		return bindableTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignation() {
		return designationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Cardinality() {
		return (EReference)setEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Element() {
		return (EReference)setEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_Value() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber() {
		return numberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_EqualTo() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_LessThan() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_GreaterThan() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNounConcept() {
		return nounConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceScheme() {
		return referenceSchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceScheme_ExtensionallyUsedRole() {
		return (EReference)referenceSchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceScheme_SimplyUsedRole() {
		return (EReference)referenceSchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceScheme_IdentifyingCharacteristic() {
		return (EReference)referenceSchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeRole() {
		return factTypeRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_ObjectType() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectType() {
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristic() {
		return characteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactType() {
		return factTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactType_FactTypeForm() {
		return (EReference)factTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactType_Role() {
		return (EReference)factTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactType_Has() {
		return (EReference)factTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeForm() {
		return factTypeFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeForm_Designation() {
		return (EReference)factTypeFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceholder() {
		return placeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceholder_Uses() {
		return (EReference)placeholderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceholder_IsAtStartingCharacterPosition() {
		return (EReference)placeholderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryFactType() {
		return binaryFactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFact() {
		return factEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProposition() {
		return propositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProposition_Statement() {
		return (EReference)propositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProposition_IsTrue() {
		return (EAttribute)propositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProposition_IsFalse() {
		return (EAttribute)propositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProposition_IsNecessarilyTrue() {
		return (EAttribute)propositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProposition_IsPossibilyTrue() {
		return (EAttribute)propositionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProposition_IsObligatedToBeTrue() {
		return (EAttribute)propositionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProposition_IsPermittedToBeTrue() {
		return (EAttribute)propositionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactModel() {
		return factModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactModel_ConceptualSchema() {
		return (EReference)factModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactModel_Fact() {
		return (EReference)factModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Value() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_Designation() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_FactTypeForm() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_Uri() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_IncorporatedNamespace() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURI() {
		return uriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualConcept() {
		return individualConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptType() {
		return conceptTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonNegativeInteger() {
		return nonNegativeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveInteger() {
		return positiveIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSententialForm() {
		return sententialFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNounForm() {
		return nounFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabularyNamespace() {
		return vocabularyNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyNamespace_Language() {
		return (EReference)vocabularyNamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyNamespace_AttributiveNamespace() {
		return (EReference)vocabularyNamespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributiveNamespace() {
		return attributiveNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributiveNamespace_SubjectConcept() {
		return (EReference)attributiveNamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticFormulation() {
		return semanticFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticFormulation_Variable() {
		return (EReference)semanticFormulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosedSemanticFormulation() {
		return closedSemanticFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClosedSemanticFormulation_Meaning() {
		return (EReference)closedSemanticFormulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalFormulation() {
		return logicalFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalFormulation_Statement() {
		return (EReference)logicalFormulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalFormulation_Proposition() {
		return (EReference)logicalFormulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjection() {
		return projectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjection_ConstrainingFormulation() {
		return (EReference)projectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjection_ProjectionVariable() {
		return (EReference)projectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjection_AuxiliaryVariable() {
		return (EReference)projectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicFormulation() {
		return atomicFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicFormulation_FactType() {
		return (EReference)atomicFormulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantiationFormulation() {
		return instantiationFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiationFormulation_Concept() {
		return (EReference)instantiationFormulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiationFormulation_BindableTarget() {
		return (EReference)instantiationFormulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantification() {
		return quantificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantification_ScopeFormulation() {
		return (EReference)quantificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectification() {
		return objectificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectification_LogicalFormulation() {
		return (EReference)objectificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectification_BindableTarget() {
		return (EReference)objectificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropositionNominalization() {
		return propositionNominalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropositionNominalization_LogicalFormulation() {
		return (EReference)propositionNominalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropositionNominalization_BindableTarget() {
		return (EReference)propositionNominalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosedLogicalFormulation() {
		return closedLogicalFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_RestrictingFormulation() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_IsUnitary() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Quantification() {
		return (EReference)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_RangedOverConcept() {
		return (EReference)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_FactTypeRole() {
		return (EReference)variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_ProjectionPosition() {
		return (EReference)variableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleBinding() {
		return roleBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBinding_AtomicFormulation() {
		return (EReference)roleBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBinding_BindableTarget() {
		return (EReference)roleBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBinding_FactTypeRole() {
		return (EReference)roleBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalFormulation() {
		return modalFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModalFormulation_LogicalFormulation() {
		return (EReference)modalFormulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNecessityFormulation() {
		return necessityFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObligationFormulation() {
		return obligationFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermissibilityFormulation() {
		return permissibilityFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPossibilityFormulation() {
		return possibilityFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalOperation() {
		return logicalOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalOperation_LogicalOperand() {
		return (EReference)logicalOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalNegation() {
		return logicalNegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryLogicalOperation() {
		return binaryLogicalOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryLogicalOperation_LogicalOperand1() {
		return (EReference)binaryLogicalOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryLogicalOperation_LogicalOperand2() {
		return (EReference)binaryLogicalOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjunction() {
		return conjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjunction() {
		return disjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalence() {
		return equivalenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveDisjunction() {
		return exclusiveDisjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplication() {
		return implicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplication_Antecedent() {
		return (EReference)implicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplication_Consequent() {
		return (EReference)implicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNandFormulation() {
		return nandFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNorFormulation() {
		return norFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhetherOrNotFormulation() {
		return whetherOrNotFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhetherOrNotFormulation_Consequent() {
		return (EReference)whetherOrNotFormulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhetherOrNotFormulation_Inconsequent() {
		return (EReference)whetherOrNotFormulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversalQuantification() {
		return universalQuantificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtLeastNQuantification() {
		return atLeastNQuantificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtLeastNQuantification_MinimumCardinality() {
		return (EReference)atLeastNQuantificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistentialQuantification() {
		return existentialQuantificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericRangeQuantification() {
		return numericRangeQuantificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericRangeQuantification_MinimumCardinality() {
		return (EReference)numericRangeQuantificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericRangeQuantification_MaximumCardinality() {
		return (EReference)numericRangeQuantificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtMostNQuantification() {
		return atMostNQuantificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtMostNQuantification_MaximumCardinality() {
		return (EReference)atMostNQuantificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtMostOneQuantification() {
		return atMostOneQuantificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExactlyNQuantification() {
		return exactlyNQuantificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExactlyNQuantification_Cardinality() {
		return (EReference)exactlyNQuantificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExactlyOneQuantification() {
		return exactlyOneQuantificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectingFormulation() {
		return projectingFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectingFormulation_Projection() {
		return (EReference)projectingFormulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectingFormulation_BindableTarget() {
		return (EReference)projectingFormulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationFormulation() {
		return aggregationFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNounConceptNominalization() {
		return nounConceptNominalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeNominalization() {
		return factTypeNominalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionNominalization() {
		return questionNominalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswerNominalization() {
		return answerNominalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuxiliaryVariable() {
		return auxiliaryVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryVariable_Projection() {
		return (EReference)auxiliaryVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagProjection() {
		return bagProjectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetProjection() {
		return setProjectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalFormulationKind() {
		return logicalFormulationKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosedProjection() {
		return closedProjectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClosedProjection_Definition() {
		return (EReference)closedProjectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClosedProjection_ObjectType() {
		return (EReference)closedProjectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClosedProjection_FactType() {
		return (EReference)closedProjectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClosedProjection_Question() {
		return (EReference)closedProjectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorizationScheme() {
		return categorizationSchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorizationScheme_IsBasedOn() {
		return (EReference)categorizationSchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorizationScheme_ContainsCategory() {
		return (EReference)categorizationSchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorizationScheme_IsFor() {
		return (EReference)categorizationSchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorizationType() {
		return categorizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorizationType_IsFor() {
		return (EReference)categorizationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegmentation() {
		return segmentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEClass() {
		return eClassEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerObject() {
		return integerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanObject() {
		return booleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SBVRFactory getSBVRFactory() {
		return (SBVRFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bodyOfSharedMeaningsEClass = createEClass(BODY_OF_SHARED_MEANINGS);
		createEReference(bodyOfSharedMeaningsEClass, BODY_OF_SHARED_MEANINGS__CONCEPT);
		createEReference(bodyOfSharedMeaningsEClass, BODY_OF_SHARED_MEANINGS__PROPOSITION);

		terminologicalDictionaryEClass = createEClass(TERMINOLOGICAL_DICTIONARY);
		createEReference(terminologicalDictionaryEClass, TERMINOLOGICAL_DICTIONARY__REPRESENTATION);
		createEReference(terminologicalDictionaryEClass, TERMINOLOGICAL_DICTIONARY__VOCABULARY);
		createEReference(terminologicalDictionaryEClass, TERMINOLOGICAL_DICTIONARY__BODY_OF_SHARED_MEANING);
		createEReference(terminologicalDictionaryEClass, TERMINOLOGICAL_DICTIONARY__URI);

		vocabularyEClass = createEClass(VOCABULARY);
		createEReference(vocabularyEClass, VOCABULARY__DESIGNATION);
		createEReference(vocabularyEClass, VOCABULARY__FACT_TYPE_FORM);
		createEReference(vocabularyEClass, VOCABULARY__BODY_OF_SHARED_MEANING);
		createEReference(vocabularyEClass, VOCABULARY__NAMESPACE);
		createEReference(vocabularyEClass, VOCABULARY__INCORPORATED_VOCABULARY);

		termEClass = createEClass(TERM);

		qualifiedDesignationEClass = createEClass(QUALIFIED_DESIGNATION);
		createEAttribute(qualifiedDesignationEClass, QUALIFIED_DESIGNATION__PREFERRED);
		createEAttribute(qualifiedDesignationEClass, QUALIFIED_DESIGNATION__PROHIBITED);

		nameEClass = createEClass(NAME);
		createEReference(nameEClass, NAME__REFERS_TO);

		factSymbolEClass = createEClass(FACT_SYMBOL);

		rulebookEClass = createEClass(RULEBOOK);
		createEReference(rulebookEClass, RULEBOOK__REPRESENTATION);

		businessVocabularyEClass = createEClass(BUSINESS_VOCABULARY);

		subjectFieldEClass = createEClass(SUBJECT_FIELD);

		descriptionEClass = createEClass(DESCRIPTION);

		descriptiveExampleEClass = createEClass(DESCRIPTIVE_EXAMPLE);

		noteEClass = createEClass(NOTE);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__INFORMATION_SOURCE);

		communicationContentEClass = createEClass(COMMUNICATION_CONTENT);
		createEReference(communicationContentEClass, COMMUNICATION_CONTENT__REPRESENTATION);

		communityEClass = createEClass(COMMUNITY);
		createEReference(communityEClass, COMMUNITY__URI);
		createEReference(communityEClass, COMMUNITY__SUB_COMMUNITY);

		semanticCommunityEClass = createEClass(SEMANTIC_COMMUNITY);
		createEReference(semanticCommunityEClass, SEMANTIC_COMMUNITY__SPEECH_COMMUNITY);

		speechCommunityEClass = createEClass(SPEECH_COMMUNITY);
		createEReference(speechCommunityEClass, SPEECH_COMMUNITY__OWNED_VOCABULARY);
		createEReference(speechCommunityEClass, SPEECH_COMMUNITY__USED_VOCABULARY);

		nonverbalDesignationEClass = createEClass(NONVERBAL_DESIGNATION);

		iconEClass = createEClass(ICON);

		partitiveFactTypeEClass = createEClass(PARTITIVE_FACT_TYPE);

		fundamentalConceptEClass = createEClass(FUNDAMENTAL_CONCEPT);

		situationalRoleEClass = createEClass(SITUATIONAL_ROLE);

		associativeFactTypeEClass = createEClass(ASSOCIATIVE_FACT_TYPE);

		isPropertyOfFactTypeEClass = createEClass(IS_PROPERTY_OF_FACT_TYPE);

		assortmentFactTypeEClass = createEClass(ASSORTMENT_FACT_TYPE);

		specializationFactTypeEClass = createEClass(SPECIALIZATION_FACT_TYPE);

		categorizationFactTypeEClass = createEClass(CATEGORIZATION_FACT_TYPE);

		contextualizationFactTypeEClass = createEClass(CONTEXTUALIZATION_FACT_TYPE);

		contextualizedConceptEClass = createEClass(CONTEXTUALIZED_CONCEPT);

		facetEClass = createEClass(FACET);

		isRoleOfFactTypeEClass = createEClass(IS_ROLE_OF_FACT_TYPE);

		isFacetOfFactTypeEClass = createEClass(IS_FACET_OF_FACT_TYPE);

		elementOfGuidanceEClass = createEClass(ELEMENT_OF_GUIDANCE);

		ruleEClass = createEClass(RULE);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__PACKAGED_ELEMENT);
		createEReference(packageEClass, PACKAGE__NESTED_PACKAGE);
		createEAttribute(packageEClass, PACKAGE__NAME);

		thingEClass = createEClass(THING);

		conceptualSchemaEClass = createEClass(CONCEPTUAL_SCHEMA);
		createEReference(conceptualSchemaEClass, CONCEPTUAL_SCHEMA__CONCEPT);
		createEReference(conceptualSchemaEClass, CONCEPTUAL_SCHEMA__FACT);

		conceptEClass = createEClass(CONCEPT);
		createEReference(conceptEClass, CONCEPT__DESIGNATION);
		createEReference(conceptEClass, CONCEPT__DEFINITION);
		createEReference(conceptEClass, CONCEPT__GENERAL);
		createEReference(conceptEClass, CONCEPT__COEXTENSIVE);
		createEReference(conceptEClass, CONCEPT__INSTANCE);
		createEReference(conceptEClass, CONCEPT__EXTENSION);
		createEReference(conceptEClass, CONCEPT__REFERENCE_SCHEME);

		meaningEClass = createEClass(MEANING);
		createEReference(meaningEClass, MEANING__REPRESENTATION);

		representationEClass = createEClass(REPRESENTATION);
		createEReference(representationEClass, REPRESENTATION__MEANING);
		createEReference(representationEClass, REPRESENTATION__EXPRESSION);

		actualityEClass = createEClass(ACTUALITY);

		stateOfAffairsEClass = createEClass(STATE_OF_AFFAIRS);

		expressionEClass = createEClass(EXPRESSION);

		bindableTargetEClass = createEClass(BINDABLE_TARGET);

		definitionEClass = createEClass(DEFINITION);

		designationEClass = createEClass(DESIGNATION);

		setEClass = createEClass(SET);
		createEReference(setEClass, SET__CARDINALITY);
		createEReference(setEClass, SET__ELEMENT);

		integerEClass = createEClass(INTEGER);
		createEAttribute(integerEClass, INTEGER__VALUE);

		numberEClass = createEClass(NUMBER);

		quantityEClass = createEClass(QUANTITY);
		createEReference(quantityEClass, QUANTITY__EQUAL_TO);
		createEReference(quantityEClass, QUANTITY__LESS_THAN);
		createEReference(quantityEClass, QUANTITY__GREATER_THAN);

		nounConceptEClass = createEClass(NOUN_CONCEPT);

		referenceSchemeEClass = createEClass(REFERENCE_SCHEME);
		createEReference(referenceSchemeEClass, REFERENCE_SCHEME__EXTENSIONALLY_USED_ROLE);
		createEReference(referenceSchemeEClass, REFERENCE_SCHEME__SIMPLY_USED_ROLE);
		createEReference(referenceSchemeEClass, REFERENCE_SCHEME__IDENTIFYING_CHARACTERISTIC);

		factTypeRoleEClass = createEClass(FACT_TYPE_ROLE);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__OBJECT_TYPE);

		objectTypeEClass = createEClass(OBJECT_TYPE);

		characteristicEClass = createEClass(CHARACTERISTIC);

		factTypeEClass = createEClass(FACT_TYPE);
		createEReference(factTypeEClass, FACT_TYPE__FACT_TYPE_FORM);
		createEReference(factTypeEClass, FACT_TYPE__ROLE);
		createEReference(factTypeEClass, FACT_TYPE__HAS);

		factTypeFormEClass = createEClass(FACT_TYPE_FORM);
		createEReference(factTypeFormEClass, FACT_TYPE_FORM__DESIGNATION);

		placeholderEClass = createEClass(PLACEHOLDER);
		createEReference(placeholderEClass, PLACEHOLDER__USES);
		createEReference(placeholderEClass, PLACEHOLDER__IS_AT_STARTING_CHARACTER_POSITION);

		binaryFactTypeEClass = createEClass(BINARY_FACT_TYPE);

		factEClass = createEClass(FACT);

		propositionEClass = createEClass(PROPOSITION);
		createEReference(propositionEClass, PROPOSITION__STATEMENT);
		createEAttribute(propositionEClass, PROPOSITION__IS_TRUE);
		createEAttribute(propositionEClass, PROPOSITION__IS_FALSE);
		createEAttribute(propositionEClass, PROPOSITION__IS_NECESSARILY_TRUE);
		createEAttribute(propositionEClass, PROPOSITION__IS_POSSIBILY_TRUE);
		createEAttribute(propositionEClass, PROPOSITION__IS_OBLIGATED_TO_BE_TRUE);
		createEAttribute(propositionEClass, PROPOSITION__IS_PERMITTED_TO_BE_TRUE);

		statementEClass = createEClass(STATEMENT);

		factModelEClass = createEClass(FACT_MODEL);
		createEReference(factModelEClass, FACT_MODEL__CONCEPTUAL_SCHEMA);
		createEReference(factModelEClass, FACT_MODEL__FACT);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__VALUE);

		questionEClass = createEClass(QUESTION);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__DESIGNATION);
		createEReference(namespaceEClass, NAMESPACE__FACT_TYPE_FORM);
		createEReference(namespaceEClass, NAMESPACE__URI);
		createEReference(namespaceEClass, NAMESPACE__INCORPORATED_NAMESPACE);

		uriEClass = createEClass(URI);

		individualConceptEClass = createEClass(INDIVIDUAL_CONCEPT);

		conceptTypeEClass = createEClass(CONCEPT_TYPE);

		nonNegativeIntegerEClass = createEClass(NON_NEGATIVE_INTEGER);

		positiveIntegerEClass = createEClass(POSITIVE_INTEGER);

		sententialFormEClass = createEClass(SENTENTIAL_FORM);

		nounFormEClass = createEClass(NOUN_FORM);

		languageEClass = createEClass(LANGUAGE);

		vocabularyNamespaceEClass = createEClass(VOCABULARY_NAMESPACE);
		createEReference(vocabularyNamespaceEClass, VOCABULARY_NAMESPACE__LANGUAGE);
		createEReference(vocabularyNamespaceEClass, VOCABULARY_NAMESPACE__ATTRIBUTIVE_NAMESPACE);

		attributiveNamespaceEClass = createEClass(ATTRIBUTIVE_NAMESPACE);
		createEReference(attributiveNamespaceEClass, ATTRIBUTIVE_NAMESPACE__SUBJECT_CONCEPT);

		semanticFormulationEClass = createEClass(SEMANTIC_FORMULATION);
		createEReference(semanticFormulationEClass, SEMANTIC_FORMULATION__VARIABLE);

		closedSemanticFormulationEClass = createEClass(CLOSED_SEMANTIC_FORMULATION);
		createEReference(closedSemanticFormulationEClass, CLOSED_SEMANTIC_FORMULATION__MEANING);

		logicalFormulationEClass = createEClass(LOGICAL_FORMULATION);
		createEReference(logicalFormulationEClass, LOGICAL_FORMULATION__STATEMENT);
		createEReference(logicalFormulationEClass, LOGICAL_FORMULATION__PROPOSITION);

		projectionEClass = createEClass(PROJECTION);
		createEReference(projectionEClass, PROJECTION__CONSTRAINING_FORMULATION);
		createEReference(projectionEClass, PROJECTION__PROJECTION_VARIABLE);
		createEReference(projectionEClass, PROJECTION__AUXILIARY_VARIABLE);

		atomicFormulationEClass = createEClass(ATOMIC_FORMULATION);
		createEReference(atomicFormulationEClass, ATOMIC_FORMULATION__FACT_TYPE);

		instantiationFormulationEClass = createEClass(INSTANTIATION_FORMULATION);
		createEReference(instantiationFormulationEClass, INSTANTIATION_FORMULATION__CONCEPT);
		createEReference(instantiationFormulationEClass, INSTANTIATION_FORMULATION__BINDABLE_TARGET);

		quantificationEClass = createEClass(QUANTIFICATION);
		createEReference(quantificationEClass, QUANTIFICATION__SCOPE_FORMULATION);

		objectificationEClass = createEClass(OBJECTIFICATION);
		createEReference(objectificationEClass, OBJECTIFICATION__LOGICAL_FORMULATION);
		createEReference(objectificationEClass, OBJECTIFICATION__BINDABLE_TARGET);

		propositionNominalizationEClass = createEClass(PROPOSITION_NOMINALIZATION);
		createEReference(propositionNominalizationEClass, PROPOSITION_NOMINALIZATION__LOGICAL_FORMULATION);
		createEReference(propositionNominalizationEClass, PROPOSITION_NOMINALIZATION__BINDABLE_TARGET);

		closedLogicalFormulationEClass = createEClass(CLOSED_LOGICAL_FORMULATION);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__RESTRICTING_FORMULATION);
		createEAttribute(variableEClass, VARIABLE__IS_UNITARY);
		createEReference(variableEClass, VARIABLE__QUANTIFICATION);
		createEReference(variableEClass, VARIABLE__RANGED_OVER_CONCEPT);
		createEReference(variableEClass, VARIABLE__FACT_TYPE_ROLE);
		createEReference(variableEClass, VARIABLE__PROJECTION_POSITION);

		roleBindingEClass = createEClass(ROLE_BINDING);
		createEReference(roleBindingEClass, ROLE_BINDING__ATOMIC_FORMULATION);
		createEReference(roleBindingEClass, ROLE_BINDING__BINDABLE_TARGET);
		createEReference(roleBindingEClass, ROLE_BINDING__FACT_TYPE_ROLE);

		modalFormulationEClass = createEClass(MODAL_FORMULATION);
		createEReference(modalFormulationEClass, MODAL_FORMULATION__LOGICAL_FORMULATION);

		necessityFormulationEClass = createEClass(NECESSITY_FORMULATION);

		obligationFormulationEClass = createEClass(OBLIGATION_FORMULATION);

		permissibilityFormulationEClass = createEClass(PERMISSIBILITY_FORMULATION);

		possibilityFormulationEClass = createEClass(POSSIBILITY_FORMULATION);

		logicalOperationEClass = createEClass(LOGICAL_OPERATION);
		createEReference(logicalOperationEClass, LOGICAL_OPERATION__LOGICAL_OPERAND);

		logicalNegationEClass = createEClass(LOGICAL_NEGATION);

		binaryLogicalOperationEClass = createEClass(BINARY_LOGICAL_OPERATION);
		createEReference(binaryLogicalOperationEClass, BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1);
		createEReference(binaryLogicalOperationEClass, BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2);

		conjunctionEClass = createEClass(CONJUNCTION);

		disjunctionEClass = createEClass(DISJUNCTION);

		equivalenceEClass = createEClass(EQUIVALENCE);

		exclusiveDisjunctionEClass = createEClass(EXCLUSIVE_DISJUNCTION);

		implicationEClass = createEClass(IMPLICATION);
		createEReference(implicationEClass, IMPLICATION__ANTECEDENT);
		createEReference(implicationEClass, IMPLICATION__CONSEQUENT);

		nandFormulationEClass = createEClass(NAND_FORMULATION);

		norFormulationEClass = createEClass(NOR_FORMULATION);

		whetherOrNotFormulationEClass = createEClass(WHETHER_OR_NOT_FORMULATION);
		createEReference(whetherOrNotFormulationEClass, WHETHER_OR_NOT_FORMULATION__CONSEQUENT);
		createEReference(whetherOrNotFormulationEClass, WHETHER_OR_NOT_FORMULATION__INCONSEQUENT);

		universalQuantificationEClass = createEClass(UNIVERSAL_QUANTIFICATION);

		atLeastNQuantificationEClass = createEClass(AT_LEAST_NQUANTIFICATION);
		createEReference(atLeastNQuantificationEClass, AT_LEAST_NQUANTIFICATION__MINIMUM_CARDINALITY);

		existentialQuantificationEClass = createEClass(EXISTENTIAL_QUANTIFICATION);

		numericRangeQuantificationEClass = createEClass(NUMERIC_RANGE_QUANTIFICATION);
		createEReference(numericRangeQuantificationEClass, NUMERIC_RANGE_QUANTIFICATION__MINIMUM_CARDINALITY);
		createEReference(numericRangeQuantificationEClass, NUMERIC_RANGE_QUANTIFICATION__MAXIMUM_CARDINALITY);

		atMostNQuantificationEClass = createEClass(AT_MOST_NQUANTIFICATION);
		createEReference(atMostNQuantificationEClass, AT_MOST_NQUANTIFICATION__MAXIMUM_CARDINALITY);

		atMostOneQuantificationEClass = createEClass(AT_MOST_ONE_QUANTIFICATION);

		exactlyNQuantificationEClass = createEClass(EXACTLY_NQUANTIFICATION);
		createEReference(exactlyNQuantificationEClass, EXACTLY_NQUANTIFICATION__CARDINALITY);

		exactlyOneQuantificationEClass = createEClass(EXACTLY_ONE_QUANTIFICATION);

		projectingFormulationEClass = createEClass(PROJECTING_FORMULATION);
		createEReference(projectingFormulationEClass, PROJECTING_FORMULATION__PROJECTION);
		createEReference(projectingFormulationEClass, PROJECTING_FORMULATION__BINDABLE_TARGET);

		aggregationFormulationEClass = createEClass(AGGREGATION_FORMULATION);

		nounConceptNominalizationEClass = createEClass(NOUN_CONCEPT_NOMINALIZATION);

		factTypeNominalizationEClass = createEClass(FACT_TYPE_NOMINALIZATION);

		questionNominalizationEClass = createEClass(QUESTION_NOMINALIZATION);

		answerNominalizationEClass = createEClass(ANSWER_NOMINALIZATION);

		auxiliaryVariableEClass = createEClass(AUXILIARY_VARIABLE);
		createEReference(auxiliaryVariableEClass, AUXILIARY_VARIABLE__PROJECTION);

		bagProjectionEClass = createEClass(BAG_PROJECTION);

		setProjectionEClass = createEClass(SET_PROJECTION);

		logicalFormulationKindEClass = createEClass(LOGICAL_FORMULATION_KIND);

		closedProjectionEClass = createEClass(CLOSED_PROJECTION);
		createEReference(closedProjectionEClass, CLOSED_PROJECTION__DEFINITION);
		createEReference(closedProjectionEClass, CLOSED_PROJECTION__OBJECT_TYPE);
		createEReference(closedProjectionEClass, CLOSED_PROJECTION__FACT_TYPE);
		createEReference(closedProjectionEClass, CLOSED_PROJECTION__QUESTION);

		categorizationSchemeEClass = createEClass(CATEGORIZATION_SCHEME);
		createEReference(categorizationSchemeEClass, CATEGORIZATION_SCHEME__IS_BASED_ON);
		createEReference(categorizationSchemeEClass, CATEGORIZATION_SCHEME__CONTAINS_CATEGORY);
		createEReference(categorizationSchemeEClass, CATEGORIZATION_SCHEME__IS_FOR);

		categorizationTypeEClass = createEClass(CATEGORIZATION_TYPE);
		createEReference(categorizationTypeEClass, CATEGORIZATION_TYPE__IS_FOR);

		segmentationEClass = createEClass(SEGMENTATION);

		// Create data types
		eClassEDataType = createEDataType(ECLASS);
		integerObjectEDataType = createEDataType(INTEGER_OBJECT);
		booleanObjectEDataType = createEDataType(BOOLEAN_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bodyOfSharedMeaningsEClass.getESuperTypes().add(this.getSet());
		vocabularyEClass.getESuperTypes().add(this.getSet());
		termEClass.getESuperTypes().add(this.getQualifiedDesignation());
		qualifiedDesignationEClass.getESuperTypes().add(this.getDesignation());
		nameEClass.getESuperTypes().add(this.getQualifiedDesignation());
		factSymbolEClass.getESuperTypes().add(this.getQualifiedDesignation());
		rulebookEClass.getESuperTypes().add(this.getSet());
		businessVocabularyEClass.getESuperTypes().add(this.getVocabulary());
		descriptionEClass.getESuperTypes().add(this.getRepresentation());
		descriptiveExampleEClass.getESuperTypes().add(this.getRepresentation());
		noteEClass.getESuperTypes().add(this.getRepresentation());
		referenceEClass.getESuperTypes().add(this.getRepresentation());
		communicationContentEClass.getESuperTypes().add(this.getRepresentation());
		semanticCommunityEClass.getESuperTypes().add(this.getCommunity());
		speechCommunityEClass.getESuperTypes().add(this.getCommunity());
		nonverbalDesignationEClass.getESuperTypes().add(this.getQualifiedDesignation());
		iconEClass.getESuperTypes().add(this.getNonverbalDesignation());
		partitiveFactTypeEClass.getESuperTypes().add(this.getBinaryFactType());
		fundamentalConceptEClass.getESuperTypes().add(this.getObjectType());
		situationalRoleEClass.getESuperTypes().add(this.getRole());
		situationalRoleEClass.getESuperTypes().add(this.getObjectType());
		associativeFactTypeEClass.getESuperTypes().add(this.getFactType());
		isPropertyOfFactTypeEClass.getESuperTypes().add(this.getAssociativeFactType());
		assortmentFactTypeEClass.getESuperTypes().add(this.getFactType());
		specializationFactTypeEClass.getESuperTypes().add(this.getFactType());
		categorizationFactTypeEClass.getESuperTypes().add(this.getSpecializationFactType());
		contextualizationFactTypeEClass.getESuperTypes().add(this.getSpecializationFactType());
		contextualizedConceptEClass.getESuperTypes().add(this.getNounConcept());
		facetEClass.getESuperTypes().add(this.getContextualizedConcept());
		isRoleOfFactTypeEClass.getESuperTypes().add(this.getContextualizationFactType());
		isFacetOfFactTypeEClass.getESuperTypes().add(this.getContextualizationFactType());
		elementOfGuidanceEClass.getESuperTypes().add(this.getProposition());
		ruleEClass.getESuperTypes().add(this.getProposition());
		conceptualSchemaEClass.getESuperTypes().add(this.getThing());
		conceptEClass.getESuperTypes().add(this.getMeaning());
		meaningEClass.getESuperTypes().add(this.getThing());
		representationEClass.getESuperTypes().add(this.getActuality());
		actualityEClass.getESuperTypes().add(this.getStateOfAffairs());
		stateOfAffairsEClass.getESuperTypes().add(this.getThing());
		expressionEClass.getESuperTypes().add(this.getBindableTarget());
		bindableTargetEClass.getESuperTypes().add(this.getThing());
		definitionEClass.getESuperTypes().add(this.getRepresentation());
		designationEClass.getESuperTypes().add(this.getRepresentation());
		setEClass.getESuperTypes().add(this.getThing());
		integerEClass.getESuperTypes().add(this.getNumber());
		numberEClass.getESuperTypes().add(this.getQuantity());
		quantityEClass.getESuperTypes().add(this.getNounConcept());
		nounConceptEClass.getESuperTypes().add(this.getConcept());
		referenceSchemeEClass.getESuperTypes().add(this.getThing());
		factTypeRoleEClass.getESuperTypes().add(this.getRole());
		roleEClass.getESuperTypes().add(this.getNounConcept());
		objectTypeEClass.getESuperTypes().add(this.getNounConcept());
		characteristicEClass.getESuperTypes().add(this.getFactType());
		factTypeEClass.getESuperTypes().add(this.getConcept());
		factTypeFormEClass.getESuperTypes().add(this.getRepresentation());
		placeholderEClass.getESuperTypes().add(this.getDesignation());
		binaryFactTypeEClass.getESuperTypes().add(this.getFactType());
		factEClass.getESuperTypes().add(this.getProposition());
		propositionEClass.getESuperTypes().add(this.getMeaning());
		statementEClass.getESuperTypes().add(this.getRepresentation());
		factModelEClass.getESuperTypes().add(this.getThing());
		textEClass.getESuperTypes().add(this.getExpression());
		questionEClass.getESuperTypes().add(this.getMeaning());
		namespaceEClass.getESuperTypes().add(this.getThing());
		uriEClass.getESuperTypes().add(this.getText());
		individualConceptEClass.getESuperTypes().add(this.getNounConcept());
		individualConceptEClass.getESuperTypes().add(this.getBindableTarget());
		conceptTypeEClass.getESuperTypes().add(this.getObjectType());
		nonNegativeIntegerEClass.getESuperTypes().add(this.getInteger());
		positiveIntegerEClass.getESuperTypes().add(this.getNonNegativeInteger());
		sententialFormEClass.getESuperTypes().add(this.getFactTypeForm());
		nounFormEClass.getESuperTypes().add(this.getFactTypeForm());
		languageEClass.getESuperTypes().add(this.getThing());
		vocabularyNamespaceEClass.getESuperTypes().add(this.getNamespace());
		attributiveNamespaceEClass.getESuperTypes().add(this.getNamespace());
		closedSemanticFormulationEClass.getESuperTypes().add(this.getSemanticFormulation());
		logicalFormulationEClass.getESuperTypes().add(this.getSemanticFormulation());
		projectionEClass.getESuperTypes().add(this.getSemanticFormulation());
		atomicFormulationEClass.getESuperTypes().add(this.getLogicalFormulation());
		instantiationFormulationEClass.getESuperTypes().add(this.getLogicalFormulation());
		quantificationEClass.getESuperTypes().add(this.getLogicalFormulation());
		objectificationEClass.getESuperTypes().add(this.getLogicalFormulation());
		propositionNominalizationEClass.getESuperTypes().add(this.getLogicalFormulation());
		closedLogicalFormulationEClass.getESuperTypes().add(this.getClosedSemanticFormulation());
		closedLogicalFormulationEClass.getESuperTypes().add(this.getLogicalFormulation());
		variableEClass.getESuperTypes().add(this.getBindableTarget());
		modalFormulationEClass.getESuperTypes().add(this.getLogicalFormulation());
		necessityFormulationEClass.getESuperTypes().add(this.getModalFormulation());
		obligationFormulationEClass.getESuperTypes().add(this.getModalFormulation());
		permissibilityFormulationEClass.getESuperTypes().add(this.getModalFormulation());
		possibilityFormulationEClass.getESuperTypes().add(this.getModalFormulation());
		logicalOperationEClass.getESuperTypes().add(this.getLogicalFormulation());
		logicalNegationEClass.getESuperTypes().add(this.getLogicalOperation());
		binaryLogicalOperationEClass.getESuperTypes().add(this.getLogicalOperation());
		conjunctionEClass.getESuperTypes().add(this.getBinaryLogicalOperation());
		disjunctionEClass.getESuperTypes().add(this.getBinaryLogicalOperation());
		equivalenceEClass.getESuperTypes().add(this.getBinaryLogicalOperation());
		exclusiveDisjunctionEClass.getESuperTypes().add(this.getBinaryLogicalOperation());
		implicationEClass.getESuperTypes().add(this.getBinaryLogicalOperation());
		nandFormulationEClass.getESuperTypes().add(this.getBinaryLogicalOperation());
		norFormulationEClass.getESuperTypes().add(this.getBinaryLogicalOperation());
		whetherOrNotFormulationEClass.getESuperTypes().add(this.getBinaryLogicalOperation());
		universalQuantificationEClass.getESuperTypes().add(this.getQuantification());
		atLeastNQuantificationEClass.getESuperTypes().add(this.getQuantification());
		existentialQuantificationEClass.getESuperTypes().add(this.getAtLeastNQuantification());
		numericRangeQuantificationEClass.getESuperTypes().add(this.getQuantification());
		atMostNQuantificationEClass.getESuperTypes().add(this.getQuantification());
		atMostOneQuantificationEClass.getESuperTypes().add(this.getAtMostNQuantification());
		exactlyNQuantificationEClass.getESuperTypes().add(this.getQuantification());
		exactlyOneQuantificationEClass.getESuperTypes().add(this.getExactlyNQuantification());
		projectingFormulationEClass.getESuperTypes().add(this.getLogicalFormulation());
		aggregationFormulationEClass.getESuperTypes().add(this.getProjectingFormulation());
		nounConceptNominalizationEClass.getESuperTypes().add(this.getProjectingFormulation());
		factTypeNominalizationEClass.getESuperTypes().add(this.getProjectingFormulation());
		questionNominalizationEClass.getESuperTypes().add(this.getProjectingFormulation());
		answerNominalizationEClass.getESuperTypes().add(this.getProjectingFormulation());
		auxiliaryVariableEClass.getESuperTypes().add(this.getVariable());
		bagProjectionEClass.getESuperTypes().add(this.getProjection());
		setProjectionEClass.getESuperTypes().add(this.getProjection());
		logicalFormulationKindEClass.getESuperTypes().add(this.getObjectType());
		closedProjectionEClass.getESuperTypes().add(this.getClosedSemanticFormulation());
		closedProjectionEClass.getESuperTypes().add(this.getProjection());
		categorizationSchemeEClass.getESuperTypes().add(this.getSet());
		categorizationTypeEClass.getESuperTypes().add(this.getConcept());
		segmentationEClass.getESuperTypes().add(this.getCategorizationScheme());

		// Initialize classes and features; add operations and parameters
		initEClass(bodyOfSharedMeaningsEClass, BodyOfSharedMeanings.class, "BodyOfSharedMeanings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodyOfSharedMeanings_Concept(), this.getConcept(), null, "concept", null, 0, -1, BodyOfSharedMeanings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBodyOfSharedMeanings_Proposition(), this.getProposition(), null, "proposition", null, 0, -1, BodyOfSharedMeanings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(terminologicalDictionaryEClass, TerminologicalDictionary.class, "TerminologicalDictionary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminologicalDictionary_Representation(), this.getRepresentation(), null, "representation", null, 0, -1, TerminologicalDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerminologicalDictionary_Vocabulary(), this.getVocabulary(), null, "vocabulary", null, 1, -1, TerminologicalDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerminologicalDictionary_BodyOfSharedMeaning(), this.getBodyOfSharedMeanings(), null, "bodyOfSharedMeaning", null, 0, -1, TerminologicalDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerminologicalDictionary_Uri(), this.getURI(), null, "uri", null, 0, -1, TerminologicalDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vocabularyEClass, Vocabulary.class, "Vocabulary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVocabulary_Designation(), this.getDesignation(), null, "designation", null, 0, -1, Vocabulary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocabulary_FactTypeForm(), this.getFactTypeForm(), null, "factTypeForm", null, 0, -1, Vocabulary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocabulary_BodyOfSharedMeaning(), this.getBodyOfSharedMeanings(), null, "bodyOfSharedMeaning", null, 0, -1, Vocabulary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocabulary_Namespace(), this.getVocabularyNamespace(), null, "namespace", null, 0, -1, Vocabulary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocabulary_IncorporatedVocabulary(), this.getVocabulary(), null, "incorporatedVocabulary", null, 0, -1, Vocabulary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(vocabularyEClass, this.getTerm(), "createTerm", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(vocabularyEClass, this.getName_(), "createName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(termEClass, this.getCharacteristic(), "createCharacteristic", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(termEClass, this.getBinaryFactType(), "createBinaryFactType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getTerm(), "target", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(qualifiedDesignationEClass, QualifiedDesignation.class, "QualifiedDesignation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualifiedDesignation_Preferred(), ecorePackage.getEBoolean(), "preferred", null, 0, 1, QualifiedDesignation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQualifiedDesignation_Prohibited(), ecorePackage.getEBoolean(), "prohibited", null, 0, 1, QualifiedDesignation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(qualifiedDesignationEClass, this.getDesignation(), "createSynonym", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getName_RefersTo(), this.getThing(), null, "refersTo", null, 0, -1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(factSymbolEClass, FactSymbol.class, "FactSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rulebookEClass, Rulebook.class, "Rulebook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRulebook_Representation(), this.getRepresentation(), null, "representation", null, 0, -1, Rulebook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(businessVocabularyEClass, BusinessVocabulary.class, "BusinessVocabulary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subjectFieldEClass, SubjectField.class, "SubjectField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptiveExampleEClass, DescriptiveExample.class, "DescriptiveExample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_InformationSource(), this.getCommunicationContent(), null, "informationSource", null, 0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(communicationContentEClass, CommunicationContent.class, "CommunicationContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationContent_Representation(), this.getRepresentation(), null, "representation", null, 0, -1, CommunicationContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(communityEClass, Community.class, "Community", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunity_Uri(), this.getURI(), null, "uri", null, 0, -1, Community.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCommunity_SubCommunity(), this.getCommunity(), null, "subCommunity", null, 0, -1, Community.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(semanticCommunityEClass, SemanticCommunity.class, "SemanticCommunity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemanticCommunity_SpeechCommunity(), this.getSpeechCommunity(), null, "speechCommunity", null, 0, -1, SemanticCommunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(speechCommunityEClass, SpeechCommunity.class, "SpeechCommunity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpeechCommunity_OwnedVocabulary(), this.getVocabulary(), null, "ownedVocabulary", null, 0, -1, SpeechCommunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpeechCommunity_UsedVocabulary(), this.getVocabulary(), null, "usedVocabulary", null, 0, -1, SpeechCommunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nonverbalDesignationEClass, NonverbalDesignation.class, "NonverbalDesignation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iconEClass, Icon.class, "Icon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partitiveFactTypeEClass, PartitiveFactType.class, "PartitiveFactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fundamentalConceptEClass, FundamentalConcept.class, "FundamentalConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(situationalRoleEClass, SituationalRole.class, "SituationalRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associativeFactTypeEClass, AssociativeFactType.class, "AssociativeFactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isPropertyOfFactTypeEClass, IsPropertyOfFactType.class, "IsPropertyOfFactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assortmentFactTypeEClass, AssortmentFactType.class, "AssortmentFactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specializationFactTypeEClass, SpecializationFactType.class, "SpecializationFactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(categorizationFactTypeEClass, CategorizationFactType.class, "CategorizationFactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextualizationFactTypeEClass, ContextualizationFactType.class, "ContextualizationFactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextualizedConceptEClass, ContextualizedConcept.class, "ContextualizedConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(facetEClass, Facet.class, "Facet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isRoleOfFactTypeEClass, IsRoleOfFactType.class, "IsRoleOfFactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isFacetOfFactTypeEClass, IsFacetOfFactType.class, "IsFacetOfFactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementOfGuidanceEClass, ElementOfGuidance.class, "ElementOfGuidance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageEClass, SBVR.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_PackagedElement(), this.getThing(), null, "packagedElement", null, 0, -1, SBVR.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_NestedPackage(), this.getPackage(), null, "nestedPackage", null, 0, -1, SBVR.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, SBVR.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(thingEClass, Thing.class, "Thing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(thingEClass, this.getPackage(), "getNearestPackage", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(thingEClass, this.getPackage(), "getOuterPackage", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(conceptualSchemaEClass, ConceptualSchema.class, "ConceptualSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptualSchema_Concept(), this.getConcept(), null, "concept", null, 0, -1, ConceptualSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConceptualSchema_Fact(), this.getFact(), null, "fact", null, 0, -1, ConceptualSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conceptEClass, Concept.class, "Concept", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcept_Designation(), this.getDesignation(), null, "designation", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConcept_Definition(), this.getDefinition(), null, "definition", null, 0, -1, Concept.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConcept_General(), this.getConcept(), null, "general", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConcept_Coextensive(), this.getConcept(), null, "coextensive", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConcept_Instance(), this.getThing(), null, "instance", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConcept_Extension(), this.getSet(), null, "extension", null, 1, 1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConcept_ReferenceScheme(), this.getReferenceScheme(), null, "referenceScheme", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(meaningEClass, Meaning.class, "Meaning", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeaning_Representation(), this.getRepresentation(), null, "representation", null, 0, -1, Meaning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = addEOperation(meaningEClass, this.getDefinition(), "createDefinition", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(meaningEClass, this.getRepresentation(), "createRepresentation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEClass(), "eClass", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(representationEClass, Representation.class, "Representation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepresentation_Meaning(), this.getMeaning(), null, "meaning", null, 1, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRepresentation_Expression(), this.getExpression(), null, "expression", null, 1, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(representationEClass, ecorePackage.getEString(), "getExpressionText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(representationEClass, null, "setExpressionText", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(actualityEClass, Actuality.class, "Actuality", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateOfAffairsEClass, StateOfAffairs.class, "StateOfAffairs", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindableTargetEClass, BindableTarget.class, "BindableTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(designationEClass, Designation.class, "Designation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSet_Cardinality(), this.getInteger(), null, "cardinality", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSet_Element(), this.getThing(), null, "element", null, 0, -1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(integerEClass, SBVR.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteger_Value(), this.getIntegerObject(), "value", null, 0, 1, SBVR.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numberEClass, SBVR.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityEClass, Quantity.class, "Quantity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantity_EqualTo(), this.getQuantity(), null, "equalTo", null, 0, -1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQuantity_LessThan(), this.getQuantity(), null, "lessThan", null, 0, -1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQuantity_GreaterThan(), this.getQuantity(), null, "greaterThan", null, 0, -1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nounConceptEClass, NounConcept.class, "NounConcept", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceSchemeEClass, ReferenceScheme.class, "ReferenceScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceScheme_ExtensionallyUsedRole(), this.getFactTypeRole(), null, "extensionallyUsedRole", null, 0, -1, ReferenceScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceScheme_SimplyUsedRole(), this.getFactTypeRole(), null, "simplyUsedRole", null, 0, -1, ReferenceScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceScheme_IdentifyingCharacteristic(), this.getCharacteristic(), null, "identifyingCharacteristic", null, 0, -1, ReferenceScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(factTypeRoleEClass, FactTypeRole.class, "FactTypeRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_ObjectType(), this.getObjectType(), null, "objectType", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectTypeEClass, ObjectType.class, "ObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(objectTypeEClass, this.getCharacteristic(), "createCharacteristic", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(objectTypeEClass, this.getBinaryFactType(), "createBinaryFactType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getObjectType(), "target", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(characteristicEClass, Characteristic.class, "Characteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(factTypeEClass, FactType.class, "FactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactType_FactTypeForm(), this.getFactTypeForm(), null, "factTypeForm", null, 0, -1, FactType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFactType_Role(), this.getFactTypeRole(), null, "role", null, 1, -1, FactType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactType_Has(), this.getPlaceholder(), null, "has", null, 1, -1, FactType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factTypeFormEClass, FactTypeForm.class, "FactTypeForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactTypeForm_Designation(), this.getDesignation(), null, "designation", null, 1, -1, FactTypeForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(factTypeFormEClass, this.getPlaceholder(), "getPlaceholders", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(factTypeFormEClass, this.getDesignation(), "getDemonstrated", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(placeholderEClass, Placeholder.class, "Placeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceholder_Uses(), this.getDesignation(), null, "uses", null, 1, 1, Placeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaceholder_IsAtStartingCharacterPosition(), this.getPositiveInteger(), null, "isAtStartingCharacterPosition", null, 1, 1, Placeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryFactTypeEClass, BinaryFactType.class, "BinaryFactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(factEClass, Fact.class, "Fact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propositionEClass, Proposition.class, "Proposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProposition_Statement(), this.getStatement(), null, "statement", null, 0, -1, Proposition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProposition_IsTrue(), this.getBooleanObject(), "isTrue", null, 0, 1, Proposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProposition_IsFalse(), this.getBooleanObject(), "isFalse", null, 0, 1, Proposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProposition_IsNecessarilyTrue(), this.getBooleanObject(), "isNecessarilyTrue", null, 0, 1, Proposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProposition_IsPossibilyTrue(), this.getBooleanObject(), "isPossibilyTrue", null, 0, 1, Proposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProposition_IsObligatedToBeTrue(), this.getBooleanObject(), "isObligatedToBeTrue", null, 0, 1, Proposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProposition_IsPermittedToBeTrue(), this.getBooleanObject(), "isPermittedToBeTrue", null, 0, 1, Proposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(factModelEClass, FactModel.class, "FactModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactModel_ConceptualSchema(), this.getConceptualSchema(), null, "conceptualSchema", null, 0, -1, FactModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFactModel_Fact(), this.getFact(), null, "fact", null, 0, -1, FactModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Value(), ecorePackage.getEString(), "value", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_Designation(), this.getDesignation(), null, "designation", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_FactTypeForm(), this.getFactTypeForm(), null, "factTypeForm", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_Uri(), this.getURI(), null, "uri", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_IncorporatedNamespace(), this.getNamespace(), null, "incorporatedNamespace", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(uriEClass, SBVR.URI.class, "URI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(individualConceptEClass, IndividualConcept.class, "IndividualConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conceptTypeEClass, ConceptType.class, "ConceptType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonNegativeIntegerEClass, NonNegativeInteger.class, "NonNegativeInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveIntegerEClass, PositiveInteger.class, "PositiveInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sententialFormEClass, SententialForm.class, "SententialForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nounFormEClass, NounForm.class, "NounForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vocabularyNamespaceEClass, VocabularyNamespace.class, "VocabularyNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVocabularyNamespace_Language(), this.getLanguage(), null, "language", null, 0, -1, VocabularyNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocabularyNamespace_AttributiveNamespace(), this.getAttributiveNamespace(), null, "attributiveNamespace", null, 0, -1, VocabularyNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributiveNamespaceEClass, AttributiveNamespace.class, "AttributiveNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributiveNamespace_SubjectConcept(), this.getConcept(), null, "subjectConcept", null, 1, 1, AttributiveNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(semanticFormulationEClass, SemanticFormulation.class, "SemanticFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemanticFormulation_Variable(), this.getVariable(), null, "variable", null, 0, 1, SemanticFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(closedSemanticFormulationEClass, ClosedSemanticFormulation.class, "ClosedSemanticFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClosedSemanticFormulation_Meaning(), this.getMeaning(), null, "meaning", null, 0, -1, ClosedSemanticFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(logicalFormulationEClass, LogicalFormulation.class, "LogicalFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalFormulation_Statement(), this.getStatement(), null, "statement", null, 0, -1, LogicalFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalFormulation_Proposition(), this.getProposition(), null, "proposition", null, 1, 1, LogicalFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectionEClass, Projection.class, "Projection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjection_ConstrainingFormulation(), this.getLogicalFormulation(), null, "constrainingFormulation", null, 0, 1, Projection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjection_ProjectionVariable(), this.getVariable(), null, "projectionVariable", null, 1, -1, Projection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjection_AuxiliaryVariable(), this.getAuxiliaryVariable(), null, "auxiliaryVariable", null, 0, -1, Projection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicFormulationEClass, AtomicFormulation.class, "AtomicFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicFormulation_FactType(), this.getFactType(), null, "factType", null, 1, 1, AtomicFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantiationFormulationEClass, InstantiationFormulation.class, "InstantiationFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstantiationFormulation_Concept(), this.getConcept(), null, "concept", null, 1, 1, InstantiationFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstantiationFormulation_BindableTarget(), this.getBindableTarget(), null, "bindableTarget", null, 1, 1, InstantiationFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantificationEClass, Quantification.class, "Quantification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantification_ScopeFormulation(), this.getLogicalFormulation(), null, "scopeFormulation", null, 0, 1, Quantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectificationEClass, Objectification.class, "Objectification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectification_LogicalFormulation(), this.getLogicalFormulation(), null, "logicalFormulation", null, 1, 1, Objectification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectification_BindableTarget(), this.getBindableTarget(), null, "bindableTarget", null, 1, 1, Objectification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propositionNominalizationEClass, PropositionNominalization.class, "PropositionNominalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropositionNominalization_LogicalFormulation(), this.getLogicalFormulation(), null, "logicalFormulation", null, 1, 1, PropositionNominalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropositionNominalization_BindableTarget(), this.getBindableTarget(), null, "bindableTarget", null, 1, 1, PropositionNominalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(closedLogicalFormulationEClass, ClosedLogicalFormulation.class, "ClosedLogicalFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_RestrictingFormulation(), this.getLogicalFormulation(), null, "restrictingFormulation", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_IsUnitary(), ecorePackage.getEBoolean(), "isUnitary", "false", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Quantification(), this.getQuantification(), null, "quantification", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_RangedOverConcept(), this.getConcept(), null, "rangedOverConcept", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_FactTypeRole(), this.getFactTypeRole(), null, "factTypeRole", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_ProjectionPosition(), this.getPositiveInteger(), null, "projectionPosition", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleBindingEClass, RoleBinding.class, "RoleBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleBinding_AtomicFormulation(), this.getAtomicFormulation(), null, "atomicFormulation", null, 1, 1, RoleBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleBinding_BindableTarget(), this.getBindableTarget(), null, "bindableTarget", null, 1, 1, RoleBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleBinding_FactTypeRole(), this.getFactTypeRole(), null, "factTypeRole", null, 1, 1, RoleBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalFormulationEClass, ModalFormulation.class, "ModalFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModalFormulation_LogicalFormulation(), this.getLogicalFormulation(), null, "logicalFormulation", null, 1, 1, ModalFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(necessityFormulationEClass, NecessityFormulation.class, "NecessityFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(obligationFormulationEClass, ObligationFormulation.class, "ObligationFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(permissibilityFormulationEClass, PermissibilityFormulation.class, "PermissibilityFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(possibilityFormulationEClass, PossibilityFormulation.class, "PossibilityFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalOperationEClass, LogicalOperation.class, "LogicalOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalOperation_LogicalOperand(), this.getLogicalFormulation(), null, "logicalOperand", null, 1, -1, LogicalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalNegationEClass, LogicalNegation.class, "LogicalNegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryLogicalOperationEClass, BinaryLogicalOperation.class, "BinaryLogicalOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryLogicalOperation_LogicalOperand1(), this.getLogicalFormulation(), null, "logicalOperand1", null, 1, 1, BinaryLogicalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryLogicalOperation_LogicalOperand2(), this.getLogicalFormulation(), null, "logicalOperand2", null, 1, 1, BinaryLogicalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disjunctionEClass, Disjunction.class, "Disjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equivalenceEClass, Equivalence.class, "Equivalence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusiveDisjunctionEClass, ExclusiveDisjunction.class, "ExclusiveDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implicationEClass, Implication.class, "Implication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplication_Antecedent(), this.getLogicalFormulation(), null, "antecedent", null, 1, 1, Implication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplication_Consequent(), this.getLogicalFormulation(), null, "consequent", null, 1, 1, Implication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nandFormulationEClass, NandFormulation.class, "NandFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(norFormulationEClass, NorFormulation.class, "NorFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whetherOrNotFormulationEClass, WhetherOrNotFormulation.class, "WhetherOrNotFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhetherOrNotFormulation_Consequent(), this.getLogicalFormulation(), null, "consequent", null, 1, 1, WhetherOrNotFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhetherOrNotFormulation_Inconsequent(), this.getLogicalFormulation(), null, "inconsequent", null, 1, 1, WhetherOrNotFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universalQuantificationEClass, UniversalQuantification.class, "UniversalQuantification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atLeastNQuantificationEClass, AtLeastNQuantification.class, "AtLeastNQuantification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtLeastNQuantification_MinimumCardinality(), this.getNonNegativeInteger(), null, "minimumCardinality", null, 1, 1, AtLeastNQuantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existentialQuantificationEClass, ExistentialQuantification.class, "ExistentialQuantification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericRangeQuantificationEClass, NumericRangeQuantification.class, "NumericRangeQuantification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericRangeQuantification_MinimumCardinality(), this.getNonNegativeInteger(), null, "minimumCardinality", null, 1, 1, NumericRangeQuantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericRangeQuantification_MaximumCardinality(), this.getNonNegativeInteger(), null, "maximumCardinality", null, 1, 1, NumericRangeQuantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atMostNQuantificationEClass, AtMostNQuantification.class, "AtMostNQuantification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtMostNQuantification_MaximumCardinality(), this.getNonNegativeInteger(), null, "maximumCardinality", null, 1, 1, AtMostNQuantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atMostOneQuantificationEClass, AtMostOneQuantification.class, "AtMostOneQuantification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exactlyNQuantificationEClass, ExactlyNQuantification.class, "ExactlyNQuantification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExactlyNQuantification_Cardinality(), this.getNonNegativeInteger(), null, "cardinality", null, 1, 1, ExactlyNQuantification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exactlyOneQuantificationEClass, ExactlyOneQuantification.class, "ExactlyOneQuantification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(projectingFormulationEClass, ProjectingFormulation.class, "ProjectingFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectingFormulation_Projection(), this.getProjection(), null, "projection", null, 1, 1, ProjectingFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectingFormulation_BindableTarget(), this.getBindableTarget(), null, "bindableTarget", null, 1, 1, ProjectingFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationFormulationEClass, AggregationFormulation.class, "AggregationFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nounConceptNominalizationEClass, NounConceptNominalization.class, "NounConceptNominalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(factTypeNominalizationEClass, FactTypeNominalization.class, "FactTypeNominalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionNominalizationEClass, QuestionNominalization.class, "QuestionNominalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(answerNominalizationEClass, AnswerNominalization.class, "AnswerNominalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(auxiliaryVariableEClass, AuxiliaryVariable.class, "AuxiliaryVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuxiliaryVariable_Projection(), this.getProjection(), null, "projection", null, 1, 1, AuxiliaryVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bagProjectionEClass, BagProjection.class, "BagProjection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setProjectionEClass, SetProjection.class, "SetProjection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalFormulationKindEClass, LogicalFormulationKind.class, "LogicalFormulationKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(closedProjectionEClass, ClosedProjection.class, "ClosedProjection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClosedProjection_Definition(), this.getDefinition(), null, "definition", null, 0, -1, ClosedProjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClosedProjection_ObjectType(), this.getObjectType(), null, "objectType", null, 0, 1, ClosedProjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClosedProjection_FactType(), this.getFactType(), null, "factType", null, 0, 1, ClosedProjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClosedProjection_Question(), this.getQuestion(), null, "question", null, 0, 1, ClosedProjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categorizationSchemeEClass, CategorizationScheme.class, "CategorizationScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorizationScheme_IsBasedOn(), this.getCategorizationType(), null, "isBasedOn", null, 1, 1, CategorizationScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategorizationScheme_ContainsCategory(), this.getConcept(), null, "containsCategory", null, 0, -1, CategorizationScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategorizationScheme_IsFor(), this.getConcept(), null, "isFor", null, 0, -1, CategorizationScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categorizationTypeEClass, CategorizationType.class, "CategorizationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorizationType_IsFor(), this.getConcept(), null, "isFor", null, 0, -1, CategorizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segmentationEClass, Segmentation.class, "Segmentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(eClassEDataType, EClass.class, "EClass", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerObjectEDataType, Integer.class, "IntegerObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanObjectEDataType, Boolean.class, "BooleanObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SBVRPackageImpl
