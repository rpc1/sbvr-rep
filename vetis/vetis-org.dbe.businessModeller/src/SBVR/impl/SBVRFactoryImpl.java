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
import SBVR.ModalFormulation;
import SBVR.Name;
import SBVR.Namespace;
import SBVR.NandFormulation;
import SBVR.NecessityFormulation;
import SBVR.NonNegativeInteger;
import SBVR.NonverbalDesignation;
import SBVR.NorFormulation;
import SBVR.Note;
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
import SBVR.Quantification;
import SBVR.Question;
import SBVR.QuestionNominalization;
import SBVR.Reference;
import SBVR.ReferenceScheme;
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
import SBVR.Statement;
import SBVR.SubjectField;
import SBVR.Term;
import SBVR.TerminologicalDictionary;
import SBVR.Text;
import SBVR.URI;
import SBVR.UniversalQuantification;
import SBVR.Variable;
import SBVR.Vocabulary;
import SBVR.VocabularyNamespace;
import SBVR.WhetherOrNotFormulation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SBVRFactoryImpl extends EFactoryImpl implements SBVRFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SBVRFactory init() {
		try {
			SBVRFactory theSBVRFactory = (SBVRFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/sbvr/1.0.0/SBVR"); 
			if (theSBVRFactory != null) {
				return theSBVRFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SBVRFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SBVRFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SBVRPackage.BODY_OF_SHARED_MEANINGS: return createBodyOfSharedMeanings();
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY: return createTerminologicalDictionary();
			case SBVRPackage.VOCABULARY: return createVocabulary();
			case SBVRPackage.TERM: return createTerm();
			case SBVRPackage.NAME: return createName();
			case SBVRPackage.FACT_SYMBOL: return createFactSymbol();
			case SBVRPackage.RULEBOOK: return createRulebook();
			case SBVRPackage.BUSINESS_VOCABULARY: return createBusinessVocabulary();
			case SBVRPackage.SUBJECT_FIELD: return createSubjectField();
			case SBVRPackage.DESCRIPTION: return createDescription();
			case SBVRPackage.DESCRIPTIVE_EXAMPLE: return createDescriptiveExample();
			case SBVRPackage.NOTE: return createNote();
			case SBVRPackage.REFERENCE: return createReference();
			case SBVRPackage.COMMUNICATION_CONTENT: return createCommunicationContent();
			case SBVRPackage.COMMUNITY: return createCommunity();
			case SBVRPackage.SEMANTIC_COMMUNITY: return createSemanticCommunity();
			case SBVRPackage.SPEECH_COMMUNITY: return createSpeechCommunity();
			case SBVRPackage.NONVERBAL_DESIGNATION: return createNonverbalDesignation();
			case SBVRPackage.ICON: return createIcon();
			case SBVRPackage.PARTITIVE_FACT_TYPE: return createPartitiveFactType();
			case SBVRPackage.FUNDAMENTAL_CONCEPT: return createFundamentalConcept();
			case SBVRPackage.SITUATIONAL_ROLE: return createSituationalRole();
			case SBVRPackage.ASSOCIATIVE_FACT_TYPE: return createAssociativeFactType();
			case SBVRPackage.IS_PROPERTY_OF_FACT_TYPE: return createIsPropertyOfFactType();
			case SBVRPackage.ASSORTMENT_FACT_TYPE: return createAssortmentFactType();
			case SBVRPackage.SPECIALIZATION_FACT_TYPE: return createSpecializationFactType();
			case SBVRPackage.CATEGORIZATION_FACT_TYPE: return createCategorizationFactType();
			case SBVRPackage.CONTEXTUALIZATION_FACT_TYPE: return createContextualizationFactType();
			case SBVRPackage.CONTEXTUALIZED_CONCEPT: return createContextualizedConcept();
			case SBVRPackage.FACET: return createFacet();
			case SBVRPackage.IS_ROLE_OF_FACT_TYPE: return createIsRoleOfFactType();
			case SBVRPackage.IS_FACET_OF_FACT_TYPE: return createIsFacetOfFactType();
			case SBVRPackage.ELEMENT_OF_GUIDANCE: return createElementOfGuidance();
			case SBVRPackage.RULE: return createRule();
			case SBVRPackage.PACKAGE: return createPackage();
			case SBVRPackage.CONCEPTUAL_SCHEMA: return createConceptualSchema();
			case SBVRPackage.DEFINITION: return createDefinition();
			case SBVRPackage.DESIGNATION: return createDesignation();
			case SBVRPackage.SET: return createSet();
			case SBVRPackage.INTEGER: return createInteger();
			case SBVRPackage.NUMBER: return createNumber();
			case SBVRPackage.REFERENCE_SCHEME: return createReferenceScheme();
			case SBVRPackage.FACT_TYPE_ROLE: return createFactTypeRole();
			case SBVRPackage.ROLE: return createRole();
			case SBVRPackage.OBJECT_TYPE: return createObjectType();
			case SBVRPackage.CHARACTERISTIC: return createCharacteristic();
			case SBVRPackage.FACT_TYPE: return createFactType();
			case SBVRPackage.FACT_TYPE_FORM: return createFactTypeForm();
			case SBVRPackage.PLACEHOLDER: return createPlaceholder();
			case SBVRPackage.BINARY_FACT_TYPE: return createBinaryFactType();
			case SBVRPackage.FACT: return createFact();
			case SBVRPackage.PROPOSITION: return createProposition();
			case SBVRPackage.STATEMENT: return createStatement();
			case SBVRPackage.FACT_MODEL: return createFactModel();
			case SBVRPackage.TEXT: return createText();
			case SBVRPackage.QUESTION: return createQuestion();
			case SBVRPackage.NAMESPACE: return createNamespace();
			case SBVRPackage.URI: return createURI();
			case SBVRPackage.INDIVIDUAL_CONCEPT: return createIndividualConcept();
			case SBVRPackage.CONCEPT_TYPE: return createConceptType();
			case SBVRPackage.NON_NEGATIVE_INTEGER: return createNonNegativeInteger();
			case SBVRPackage.POSITIVE_INTEGER: return createPositiveInteger();
			case SBVRPackage.SENTENTIAL_FORM: return createSententialForm();
			case SBVRPackage.NOUN_FORM: return createNounForm();
			case SBVRPackage.LANGUAGE: return createLanguage();
			case SBVRPackage.VOCABULARY_NAMESPACE: return createVocabularyNamespace();
			case SBVRPackage.ATTRIBUTIVE_NAMESPACE: return createAttributiveNamespace();
			case SBVRPackage.SEMANTIC_FORMULATION: return createSemanticFormulation();
			case SBVRPackage.CLOSED_SEMANTIC_FORMULATION: return createClosedSemanticFormulation();
			case SBVRPackage.LOGICAL_FORMULATION: return createLogicalFormulation();
			case SBVRPackage.PROJECTION: return createProjection();
			case SBVRPackage.ATOMIC_FORMULATION: return createAtomicFormulation();
			case SBVRPackage.INSTANTIATION_FORMULATION: return createInstantiationFormulation();
			case SBVRPackage.QUANTIFICATION: return createQuantification();
			case SBVRPackage.OBJECTIFICATION: return createObjectification();
			case SBVRPackage.PROPOSITION_NOMINALIZATION: return createPropositionNominalization();
			case SBVRPackage.CLOSED_LOGICAL_FORMULATION: return createClosedLogicalFormulation();
			case SBVRPackage.VARIABLE: return createVariable();
			case SBVRPackage.ROLE_BINDING: return createRoleBinding();
			case SBVRPackage.MODAL_FORMULATION: return createModalFormulation();
			case SBVRPackage.NECESSITY_FORMULATION: return createNecessityFormulation();
			case SBVRPackage.OBLIGATION_FORMULATION: return createObligationFormulation();
			case SBVRPackage.PERMISSIBILITY_FORMULATION: return createPermissibilityFormulation();
			case SBVRPackage.POSSIBILITY_FORMULATION: return createPossibilityFormulation();
			case SBVRPackage.LOGICAL_OPERATION: return createLogicalOperation();
			case SBVRPackage.LOGICAL_NEGATION: return createLogicalNegation();
			case SBVRPackage.BINARY_LOGICAL_OPERATION: return createBinaryLogicalOperation();
			case SBVRPackage.CONJUNCTION: return createConjunction();
			case SBVRPackage.DISJUNCTION: return createDisjunction();
			case SBVRPackage.EQUIVALENCE: return createEquivalence();
			case SBVRPackage.EXCLUSIVE_DISJUNCTION: return createExclusiveDisjunction();
			case SBVRPackage.IMPLICATION: return createImplication();
			case SBVRPackage.NAND_FORMULATION: return createNandFormulation();
			case SBVRPackage.NOR_FORMULATION: return createNorFormulation();
			case SBVRPackage.WHETHER_OR_NOT_FORMULATION: return createWhetherOrNotFormulation();
			case SBVRPackage.UNIVERSAL_QUANTIFICATION: return createUniversalQuantification();
			case SBVRPackage.AT_LEAST_NQUANTIFICATION: return createAtLeastNQuantification();
			case SBVRPackage.EXISTENTIAL_QUANTIFICATION: return createExistentialQuantification();
			case SBVRPackage.NUMERIC_RANGE_QUANTIFICATION: return createNumericRangeQuantification();
			case SBVRPackage.AT_MOST_NQUANTIFICATION: return createAtMostNQuantification();
			case SBVRPackage.AT_MOST_ONE_QUANTIFICATION: return createAtMostOneQuantification();
			case SBVRPackage.EXACTLY_NQUANTIFICATION: return createExactlyNQuantification();
			case SBVRPackage.EXACTLY_ONE_QUANTIFICATION: return createExactlyOneQuantification();
			case SBVRPackage.PROJECTING_FORMULATION: return createProjectingFormulation();
			case SBVRPackage.AGGREGATION_FORMULATION: return createAggregationFormulation();
			case SBVRPackage.NOUN_CONCEPT_NOMINALIZATION: return createNounConceptNominalization();
			case SBVRPackage.FACT_TYPE_NOMINALIZATION: return createFactTypeNominalization();
			case SBVRPackage.QUESTION_NOMINALIZATION: return createQuestionNominalization();
			case SBVRPackage.ANSWER_NOMINALIZATION: return createAnswerNominalization();
			case SBVRPackage.AUXILIARY_VARIABLE: return createAuxiliaryVariable();
			case SBVRPackage.BAG_PROJECTION: return createBagProjection();
			case SBVRPackage.SET_PROJECTION: return createSetProjection();
			case SBVRPackage.LOGICAL_FORMULATION_KIND: return createLogicalFormulationKind();
			case SBVRPackage.CLOSED_PROJECTION: return createClosedProjection();
			case SBVRPackage.CATEGORIZATION_SCHEME: return createCategorizationScheme();
			case SBVRPackage.CATEGORIZATION_TYPE: return createCategorizationType();
			case SBVRPackage.SEGMENTATION: return createSegmentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SBVRPackage.ECLASS:
				return createEClassFromString(eDataType, initialValue);
			case SBVRPackage.INTEGER_OBJECT:
				return createIntegerObjectFromString(eDataType, initialValue);
			case SBVRPackage.BOOLEAN_OBJECT:
				return createBooleanObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SBVRPackage.ECLASS:
				return convertEClassToString(eDataType, instanceValue);
			case SBVRPackage.INTEGER_OBJECT:
				return convertIntegerObjectToString(eDataType, instanceValue);
			case SBVRPackage.BOOLEAN_OBJECT:
				return convertBooleanObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyOfSharedMeanings createBodyOfSharedMeanings() {
		BodyOfSharedMeaningsImpl bodyOfSharedMeanings = new BodyOfSharedMeaningsImpl();
		return bodyOfSharedMeanings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologicalDictionary createTerminologicalDictionary() {
		TerminologicalDictionaryImpl terminologicalDictionary = new TerminologicalDictionaryImpl();
		return terminologicalDictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vocabulary createVocabulary() {
		VocabularyImpl vocabulary = new VocabularyImpl();
		return vocabulary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactSymbol createFactSymbol() {
		FactSymbolImpl factSymbol = new FactSymbolImpl();
		return factSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rulebook createRulebook() {
		RulebookImpl rulebook = new RulebookImpl();
		return rulebook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessVocabulary createBusinessVocabulary() {
		BusinessVocabularyImpl businessVocabulary = new BusinessVocabularyImpl();
		return businessVocabulary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectField createSubjectField() {
		SubjectFieldImpl subjectField = new SubjectFieldImpl();
		return subjectField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptiveExample createDescriptiveExample() {
		DescriptiveExampleImpl descriptiveExample = new DescriptiveExampleImpl();
		return descriptiveExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationContent createCommunicationContent() {
		CommunicationContentImpl communicationContent = new CommunicationContentImpl();
		return communicationContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Community createCommunity() {
		CommunityImpl community = new CommunityImpl();
		return community;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticCommunity createSemanticCommunity() {
		SemanticCommunityImpl semanticCommunity = new SemanticCommunityImpl();
		return semanticCommunity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechCommunity createSpeechCommunity() {
		SpeechCommunityImpl speechCommunity = new SpeechCommunityImpl();
		return speechCommunity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonverbalDesignation createNonverbalDesignation() {
		NonverbalDesignationImpl nonverbalDesignation = new NonverbalDesignationImpl();
		return nonverbalDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon createIcon() {
		IconImpl icon = new IconImpl();
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitiveFactType createPartitiveFactType() {
		PartitiveFactTypeImpl partitiveFactType = new PartitiveFactTypeImpl();
		return partitiveFactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FundamentalConcept createFundamentalConcept() {
		FundamentalConceptImpl fundamentalConcept = new FundamentalConceptImpl();
		return fundamentalConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SituationalRole createSituationalRole() {
		SituationalRoleImpl situationalRole = new SituationalRoleImpl();
		return situationalRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociativeFactType createAssociativeFactType() {
		AssociativeFactTypeImpl associativeFactType = new AssociativeFactTypeImpl();
		return associativeFactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsPropertyOfFactType createIsPropertyOfFactType() {
		IsPropertyOfFactTypeImpl isPropertyOfFactType = new IsPropertyOfFactTypeImpl();
		return isPropertyOfFactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssortmentFactType createAssortmentFactType() {
		AssortmentFactTypeImpl assortmentFactType = new AssortmentFactTypeImpl();
		return assortmentFactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializationFactType createSpecializationFactType() {
		SpecializationFactTypeImpl specializationFactType = new SpecializationFactTypeImpl();
		return specializationFactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorizationFactType createCategorizationFactType() {
		CategorizationFactTypeImpl categorizationFactType = new CategorizationFactTypeImpl();
		return categorizationFactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualizationFactType createContextualizationFactType() {
		ContextualizationFactTypeImpl contextualizationFactType = new ContextualizationFactTypeImpl();
		return contextualizationFactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualizedConcept createContextualizedConcept() {
		ContextualizedConceptImpl contextualizedConcept = new ContextualizedConceptImpl();
		return contextualizedConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facet createFacet() {
		FacetImpl facet = new FacetImpl();
		return facet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsRoleOfFactType createIsRoleOfFactType() {
		IsRoleOfFactTypeImpl isRoleOfFactType = new IsRoleOfFactTypeImpl();
		return isRoleOfFactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsFacetOfFactType createIsFacetOfFactType() {
		IsFacetOfFactTypeImpl isFacetOfFactType = new IsFacetOfFactTypeImpl();
		return isFacetOfFactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementOfGuidance createElementOfGuidance() {
		ElementOfGuidanceImpl elementOfGuidance = new ElementOfGuidanceImpl();
		return elementOfGuidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SBVR.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualSchema createConceptualSchema() {
		ConceptualSchemaImpl conceptualSchema = new ConceptualSchemaImpl();
		return conceptualSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Designation createDesignation() {
		DesignationImpl designation = new DesignationImpl();
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SBVR.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SBVR.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceScheme createReferenceScheme() {
		ReferenceSchemeImpl referenceScheme = new ReferenceSchemeImpl();
		return referenceScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeRole createFactTypeRole() {
		FactTypeRoleImpl factTypeRole = new FactTypeRoleImpl();
		return factTypeRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType createObjectType() {
		ObjectTypeImpl objectType = new ObjectTypeImpl();
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic createCharacteristic() {
		CharacteristicImpl characteristic = new CharacteristicImpl();
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactType createFactType() {
		FactTypeImpl factType = new FactTypeImpl();
		return factType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeForm createFactTypeForm() {
		FactTypeFormImpl factTypeForm = new FactTypeFormImpl();
		return factTypeForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placeholder createPlaceholder() {
		PlaceholderImpl placeholder = new PlaceholderImpl();
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryFactType createBinaryFactType() {
		BinaryFactTypeImpl binaryFactType = new BinaryFactTypeImpl();
		return binaryFactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fact createFact() {
		FactImpl fact = new FactImpl();
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition createProposition() {
		PropositionImpl proposition = new PropositionImpl();
		return proposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactModel createFactModel() {
		FactModelImpl factModel = new FactModelImpl();
		return factModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURI() {
		URIImpl uri = new URIImpl();
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualConcept createIndividualConcept() {
		IndividualConceptImpl individualConcept = new IndividualConceptImpl();
		return individualConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptType createConceptType() {
		ConceptTypeImpl conceptType = new ConceptTypeImpl();
		return conceptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger createNonNegativeInteger() {
		NonNegativeIntegerImpl nonNegativeInteger = new NonNegativeIntegerImpl();
		return nonNegativeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInteger createPositiveInteger() {
		PositiveIntegerImpl positiveInteger = new PositiveIntegerImpl();
		return positiveInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SententialForm createSententialForm() {
		SententialFormImpl sententialForm = new SententialFormImpl();
		return sententialForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NounForm createNounForm() {
		NounFormImpl nounForm = new NounFormImpl();
		return nounForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyNamespace createVocabularyNamespace() {
		VocabularyNamespaceImpl vocabularyNamespace = new VocabularyNamespaceImpl();
		return vocabularyNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributiveNamespace createAttributiveNamespace() {
		AttributiveNamespaceImpl attributiveNamespace = new AttributiveNamespaceImpl();
		return attributiveNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticFormulation createSemanticFormulation() {
		SemanticFormulationImpl semanticFormulation = new SemanticFormulationImpl();
		return semanticFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedSemanticFormulation createClosedSemanticFormulation() {
		ClosedSemanticFormulationImpl closedSemanticFormulation = new ClosedSemanticFormulationImpl();
		return closedSemanticFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation createLogicalFormulation() {
		LogicalFormulationImpl logicalFormulation = new LogicalFormulationImpl();
		return logicalFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projection createProjection() {
		ProjectionImpl projection = new ProjectionImpl();
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicFormulation createAtomicFormulation() {
		AtomicFormulationImpl atomicFormulation = new AtomicFormulationImpl();
		return atomicFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationFormulation createInstantiationFormulation() {
		InstantiationFormulationImpl instantiationFormulation = new InstantiationFormulationImpl();
		return instantiationFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantification createQuantification() {
		QuantificationImpl quantification = new QuantificationImpl();
		return quantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objectification createObjectification() {
		ObjectificationImpl objectification = new ObjectificationImpl();
		return objectification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropositionNominalization createPropositionNominalization() {
		PropositionNominalizationImpl propositionNominalization = new PropositionNominalizationImpl();
		return propositionNominalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedLogicalFormulation createClosedLogicalFormulation() {
		ClosedLogicalFormulationImpl closedLogicalFormulation = new ClosedLogicalFormulationImpl();
		return closedLogicalFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleBinding createRoleBinding() {
		RoleBindingImpl roleBinding = new RoleBindingImpl();
		return roleBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalFormulation createModalFormulation() {
		ModalFormulationImpl modalFormulation = new ModalFormulationImpl();
		return modalFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NecessityFormulation createNecessityFormulation() {
		NecessityFormulationImpl necessityFormulation = new NecessityFormulationImpl();
		return necessityFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligationFormulation createObligationFormulation() {
		ObligationFormulationImpl obligationFormulation = new ObligationFormulationImpl();
		return obligationFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissibilityFormulation createPermissibilityFormulation() {
		PermissibilityFormulationImpl permissibilityFormulation = new PermissibilityFormulationImpl();
		return permissibilityFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibilityFormulation createPossibilityFormulation() {
		PossibilityFormulationImpl possibilityFormulation = new PossibilityFormulationImpl();
		return possibilityFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperation createLogicalOperation() {
		LogicalOperationImpl logicalOperation = new LogicalOperationImpl();
		return logicalOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalNegation createLogicalNegation() {
		LogicalNegationImpl logicalNegation = new LogicalNegationImpl();
		return logicalNegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryLogicalOperation createBinaryLogicalOperation() {
		BinaryLogicalOperationImpl binaryLogicalOperation = new BinaryLogicalOperationImpl();
		return binaryLogicalOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conjunction createConjunction() {
		ConjunctionImpl conjunction = new ConjunctionImpl();
		return conjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disjunction createDisjunction() {
		DisjunctionImpl disjunction = new DisjunctionImpl();
		return disjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equivalence createEquivalence() {
		EquivalenceImpl equivalence = new EquivalenceImpl();
		return equivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveDisjunction createExclusiveDisjunction() {
		ExclusiveDisjunctionImpl exclusiveDisjunction = new ExclusiveDisjunctionImpl();
		return exclusiveDisjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implication createImplication() {
		ImplicationImpl implication = new ImplicationImpl();
		return implication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NandFormulation createNandFormulation() {
		NandFormulationImpl nandFormulation = new NandFormulationImpl();
		return nandFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NorFormulation createNorFormulation() {
		NorFormulationImpl norFormulation = new NorFormulationImpl();
		return norFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhetherOrNotFormulation createWhetherOrNotFormulation() {
		WhetherOrNotFormulationImpl whetherOrNotFormulation = new WhetherOrNotFormulationImpl();
		return whetherOrNotFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversalQuantification createUniversalQuantification() {
		UniversalQuantificationImpl universalQuantification = new UniversalQuantificationImpl();
		return universalQuantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtLeastNQuantification createAtLeastNQuantification() {
		AtLeastNQuantificationImpl atLeastNQuantification = new AtLeastNQuantificationImpl();
		return atLeastNQuantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistentialQuantification createExistentialQuantification() {
		ExistentialQuantificationImpl existentialQuantification = new ExistentialQuantificationImpl();
		return existentialQuantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericRangeQuantification createNumericRangeQuantification() {
		NumericRangeQuantificationImpl numericRangeQuantification = new NumericRangeQuantificationImpl();
		return numericRangeQuantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtMostNQuantification createAtMostNQuantification() {
		AtMostNQuantificationImpl atMostNQuantification = new AtMostNQuantificationImpl();
		return atMostNQuantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtMostOneQuantification createAtMostOneQuantification() {
		AtMostOneQuantificationImpl atMostOneQuantification = new AtMostOneQuantificationImpl();
		return atMostOneQuantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExactlyNQuantification createExactlyNQuantification() {
		ExactlyNQuantificationImpl exactlyNQuantification = new ExactlyNQuantificationImpl();
		return exactlyNQuantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExactlyOneQuantification createExactlyOneQuantification() {
		ExactlyOneQuantificationImpl exactlyOneQuantification = new ExactlyOneQuantificationImpl();
		return exactlyOneQuantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectingFormulation createProjectingFormulation() {
		ProjectingFormulationImpl projectingFormulation = new ProjectingFormulationImpl();
		return projectingFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationFormulation createAggregationFormulation() {
		AggregationFormulationImpl aggregationFormulation = new AggregationFormulationImpl();
		return aggregationFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NounConceptNominalization createNounConceptNominalization() {
		NounConceptNominalizationImpl nounConceptNominalization = new NounConceptNominalizationImpl();
		return nounConceptNominalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeNominalization createFactTypeNominalization() {
		FactTypeNominalizationImpl factTypeNominalization = new FactTypeNominalizationImpl();
		return factTypeNominalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionNominalization createQuestionNominalization() {
		QuestionNominalizationImpl questionNominalization = new QuestionNominalizationImpl();
		return questionNominalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerNominalization createAnswerNominalization() {
		AnswerNominalizationImpl answerNominalization = new AnswerNominalizationImpl();
		return answerNominalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryVariable createAuxiliaryVariable() {
		AuxiliaryVariableImpl auxiliaryVariable = new AuxiliaryVariableImpl();
		return auxiliaryVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagProjection createBagProjection() {
		BagProjectionImpl bagProjection = new BagProjectionImpl();
		return bagProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetProjection createSetProjection() {
		SetProjectionImpl setProjection = new SetProjectionImpl();
		return setProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulationKind createLogicalFormulationKind() {
		LogicalFormulationKindImpl logicalFormulationKind = new LogicalFormulationKindImpl();
		return logicalFormulationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedProjection createClosedProjection() {
		ClosedProjectionImpl closedProjection = new ClosedProjectionImpl();
		return closedProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorizationScheme createCategorizationScheme() {
		CategorizationSchemeImpl categorizationScheme = new CategorizationSchemeImpl();
		return categorizationScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorizationType createCategorizationType() {
		CategorizationTypeImpl categorizationType = new CategorizationTypeImpl();
		return categorizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segmentation createSegmentation() {
		SegmentationImpl segmentation = new SegmentationImpl();
		return segmentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass createEClassFromString(EDataType eDataType, String initialValue) {
		return (EClass)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerObjectFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SBVRPackage getSBVRPackage() {
		return (SBVRPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SBVRPackage getPackage() {
		return SBVRPackage.eINSTANCE;
	}

} //SBVRFactoryImpl
