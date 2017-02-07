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
package SBVR.util;

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
import SBVR.URI;
import SBVR.UniversalQuantification;
import SBVR.Variable;
import SBVR.Vocabulary;
import SBVR.VocabularyNamespace;
import SBVR.WhetherOrNotFormulation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SBVR.SBVRPackage
 * @generated
 */
public class SBVRAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SBVRPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SBVRAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SBVRPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SBVRSwitch<Adapter> modelSwitch =
		new SBVRSwitch<Adapter>() {
			@Override
			public Adapter caseBodyOfSharedMeanings(BodyOfSharedMeanings object) {
				return createBodyOfSharedMeaningsAdapter();
			}
			@Override
			public Adapter caseTerminologicalDictionary(TerminologicalDictionary object) {
				return createTerminologicalDictionaryAdapter();
			}
			@Override
			public Adapter caseVocabulary(Vocabulary object) {
				return createVocabularyAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseQualifiedDesignation(QualifiedDesignation object) {
				return createQualifiedDesignationAdapter();
			}
			@Override
			public Adapter caseName(Name object) {
				return createNameAdapter();
			}
			@Override
			public Adapter caseFactSymbol(FactSymbol object) {
				return createFactSymbolAdapter();
			}
			@Override
			public Adapter caseRulebook(Rulebook object) {
				return createRulebookAdapter();
			}
			@Override
			public Adapter caseBusinessVocabulary(BusinessVocabulary object) {
				return createBusinessVocabularyAdapter();
			}
			@Override
			public Adapter caseSubjectField(SubjectField object) {
				return createSubjectFieldAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter caseDescriptiveExample(DescriptiveExample object) {
				return createDescriptiveExampleAdapter();
			}
			@Override
			public Adapter caseNote(Note object) {
				return createNoteAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseCommunicationContent(CommunicationContent object) {
				return createCommunicationContentAdapter();
			}
			@Override
			public Adapter caseCommunity(Community object) {
				return createCommunityAdapter();
			}
			@Override
			public Adapter caseSemanticCommunity(SemanticCommunity object) {
				return createSemanticCommunityAdapter();
			}
			@Override
			public Adapter caseSpeechCommunity(SpeechCommunity object) {
				return createSpeechCommunityAdapter();
			}
			@Override
			public Adapter caseNonverbalDesignation(NonverbalDesignation object) {
				return createNonverbalDesignationAdapter();
			}
			@Override
			public Adapter caseIcon(Icon object) {
				return createIconAdapter();
			}
			@Override
			public Adapter casePartitiveFactType(PartitiveFactType object) {
				return createPartitiveFactTypeAdapter();
			}
			@Override
			public Adapter caseFundamentalConcept(FundamentalConcept object) {
				return createFundamentalConceptAdapter();
			}
			@Override
			public Adapter caseSituationalRole(SituationalRole object) {
				return createSituationalRoleAdapter();
			}
			@Override
			public Adapter caseAssociativeFactType(AssociativeFactType object) {
				return createAssociativeFactTypeAdapter();
			}
			@Override
			public Adapter caseIsPropertyOfFactType(IsPropertyOfFactType object) {
				return createIsPropertyOfFactTypeAdapter();
			}
			@Override
			public Adapter caseAssortmentFactType(AssortmentFactType object) {
				return createAssortmentFactTypeAdapter();
			}
			@Override
			public Adapter caseSpecializationFactType(SpecializationFactType object) {
				return createSpecializationFactTypeAdapter();
			}
			@Override
			public Adapter caseCategorizationFactType(CategorizationFactType object) {
				return createCategorizationFactTypeAdapter();
			}
			@Override
			public Adapter caseContextualizationFactType(ContextualizationFactType object) {
				return createContextualizationFactTypeAdapter();
			}
			@Override
			public Adapter caseContextualizedConcept(ContextualizedConcept object) {
				return createContextualizedConceptAdapter();
			}
			@Override
			public Adapter caseFacet(Facet object) {
				return createFacetAdapter();
			}
			@Override
			public Adapter caseIsRoleOfFactType(IsRoleOfFactType object) {
				return createIsRoleOfFactTypeAdapter();
			}
			@Override
			public Adapter caseIsFacetOfFactType(IsFacetOfFactType object) {
				return createIsFacetOfFactTypeAdapter();
			}
			@Override
			public Adapter caseElementOfGuidance(ElementOfGuidance object) {
				return createElementOfGuidanceAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter casePackage(SBVR.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseThing(Thing object) {
				return createThingAdapter();
			}
			@Override
			public Adapter caseConceptualSchema(ConceptualSchema object) {
				return createConceptualSchemaAdapter();
			}
			@Override
			public Adapter caseConcept(Concept object) {
				return createConceptAdapter();
			}
			@Override
			public Adapter caseMeaning(Meaning object) {
				return createMeaningAdapter();
			}
			@Override
			public Adapter caseRepresentation(Representation object) {
				return createRepresentationAdapter();
			}
			@Override
			public Adapter caseActuality(Actuality object) {
				return createActualityAdapter();
			}
			@Override
			public Adapter caseStateOfAffairs(StateOfAffairs object) {
				return createStateOfAffairsAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseBindableTarget(BindableTarget object) {
				return createBindableTargetAdapter();
			}
			@Override
			public Adapter caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			@Override
			public Adapter caseDesignation(Designation object) {
				return createDesignationAdapter();
			}
			@Override
			public Adapter caseSet(Set object) {
				return createSetAdapter();
			}
			@Override
			public Adapter caseInteger(SBVR.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseNumber(SBVR.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseNounConcept(NounConcept object) {
				return createNounConceptAdapter();
			}
			@Override
			public Adapter caseReferenceScheme(ReferenceScheme object) {
				return createReferenceSchemeAdapter();
			}
			@Override
			public Adapter caseFactTypeRole(FactTypeRole object) {
				return createFactTypeRoleAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter caseCharacteristic(Characteristic object) {
				return createCharacteristicAdapter();
			}
			@Override
			public Adapter caseFactType(FactType object) {
				return createFactTypeAdapter();
			}
			@Override
			public Adapter caseFactTypeForm(FactTypeForm object) {
				return createFactTypeFormAdapter();
			}
			@Override
			public Adapter casePlaceholder(Placeholder object) {
				return createPlaceholderAdapter();
			}
			@Override
			public Adapter caseBinaryFactType(BinaryFactType object) {
				return createBinaryFactTypeAdapter();
			}
			@Override
			public Adapter caseFact(Fact object) {
				return createFactAdapter();
			}
			@Override
			public Adapter caseProposition(Proposition object) {
				return createPropositionAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseFactModel(FactModel object) {
				return createFactModelAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseURI(URI object) {
				return createURIAdapter();
			}
			@Override
			public Adapter caseIndividualConcept(IndividualConcept object) {
				return createIndividualConceptAdapter();
			}
			@Override
			public Adapter caseConceptType(ConceptType object) {
				return createConceptTypeAdapter();
			}
			@Override
			public Adapter caseNonNegativeInteger(NonNegativeInteger object) {
				return createNonNegativeIntegerAdapter();
			}
			@Override
			public Adapter casePositiveInteger(PositiveInteger object) {
				return createPositiveIntegerAdapter();
			}
			@Override
			public Adapter caseSententialForm(SententialForm object) {
				return createSententialFormAdapter();
			}
			@Override
			public Adapter caseNounForm(NounForm object) {
				return createNounFormAdapter();
			}
			@Override
			public Adapter caseLanguage(Language object) {
				return createLanguageAdapter();
			}
			@Override
			public Adapter caseVocabularyNamespace(VocabularyNamespace object) {
				return createVocabularyNamespaceAdapter();
			}
			@Override
			public Adapter caseAttributiveNamespace(AttributiveNamespace object) {
				return createAttributiveNamespaceAdapter();
			}
			@Override
			public Adapter caseSemanticFormulation(SemanticFormulation object) {
				return createSemanticFormulationAdapter();
			}
			@Override
			public Adapter caseClosedSemanticFormulation(ClosedSemanticFormulation object) {
				return createClosedSemanticFormulationAdapter();
			}
			@Override
			public Adapter caseLogicalFormulation(LogicalFormulation object) {
				return createLogicalFormulationAdapter();
			}
			@Override
			public Adapter caseProjection(Projection object) {
				return createProjectionAdapter();
			}
			@Override
			public Adapter caseAtomicFormulation(AtomicFormulation object) {
				return createAtomicFormulationAdapter();
			}
			@Override
			public Adapter caseInstantiationFormulation(InstantiationFormulation object) {
				return createInstantiationFormulationAdapter();
			}
			@Override
			public Adapter caseQuantification(Quantification object) {
				return createQuantificationAdapter();
			}
			@Override
			public Adapter caseObjectification(Objectification object) {
				return createObjectificationAdapter();
			}
			@Override
			public Adapter casePropositionNominalization(PropositionNominalization object) {
				return createPropositionNominalizationAdapter();
			}
			@Override
			public Adapter caseClosedLogicalFormulation(ClosedLogicalFormulation object) {
				return createClosedLogicalFormulationAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseRoleBinding(RoleBinding object) {
				return createRoleBindingAdapter();
			}
			@Override
			public Adapter caseModalFormulation(ModalFormulation object) {
				return createModalFormulationAdapter();
			}
			@Override
			public Adapter caseNecessityFormulation(NecessityFormulation object) {
				return createNecessityFormulationAdapter();
			}
			@Override
			public Adapter caseObligationFormulation(ObligationFormulation object) {
				return createObligationFormulationAdapter();
			}
			@Override
			public Adapter casePermissibilityFormulation(PermissibilityFormulation object) {
				return createPermissibilityFormulationAdapter();
			}
			@Override
			public Adapter casePossibilityFormulation(PossibilityFormulation object) {
				return createPossibilityFormulationAdapter();
			}
			@Override
			public Adapter caseLogicalOperation(LogicalOperation object) {
				return createLogicalOperationAdapter();
			}
			@Override
			public Adapter caseLogicalNegation(LogicalNegation object) {
				return createLogicalNegationAdapter();
			}
			@Override
			public Adapter caseBinaryLogicalOperation(BinaryLogicalOperation object) {
				return createBinaryLogicalOperationAdapter();
			}
			@Override
			public Adapter caseConjunction(Conjunction object) {
				return createConjunctionAdapter();
			}
			@Override
			public Adapter caseDisjunction(Disjunction object) {
				return createDisjunctionAdapter();
			}
			@Override
			public Adapter caseEquivalence(Equivalence object) {
				return createEquivalenceAdapter();
			}
			@Override
			public Adapter caseExclusiveDisjunction(ExclusiveDisjunction object) {
				return createExclusiveDisjunctionAdapter();
			}
			@Override
			public Adapter caseImplication(Implication object) {
				return createImplicationAdapter();
			}
			@Override
			public Adapter caseNandFormulation(NandFormulation object) {
				return createNandFormulationAdapter();
			}
			@Override
			public Adapter caseNorFormulation(NorFormulation object) {
				return createNorFormulationAdapter();
			}
			@Override
			public Adapter caseWhetherOrNotFormulation(WhetherOrNotFormulation object) {
				return createWhetherOrNotFormulationAdapter();
			}
			@Override
			public Adapter caseUniversalQuantification(UniversalQuantification object) {
				return createUniversalQuantificationAdapter();
			}
			@Override
			public Adapter caseAtLeastNQuantification(AtLeastNQuantification object) {
				return createAtLeastNQuantificationAdapter();
			}
			@Override
			public Adapter caseExistentialQuantification(ExistentialQuantification object) {
				return createExistentialQuantificationAdapter();
			}
			@Override
			public Adapter caseNumericRangeQuantification(NumericRangeQuantification object) {
				return createNumericRangeQuantificationAdapter();
			}
			@Override
			public Adapter caseAtMostNQuantification(AtMostNQuantification object) {
				return createAtMostNQuantificationAdapter();
			}
			@Override
			public Adapter caseAtMostOneQuantification(AtMostOneQuantification object) {
				return createAtMostOneQuantificationAdapter();
			}
			@Override
			public Adapter caseExactlyNQuantification(ExactlyNQuantification object) {
				return createExactlyNQuantificationAdapter();
			}
			@Override
			public Adapter caseExactlyOneQuantification(ExactlyOneQuantification object) {
				return createExactlyOneQuantificationAdapter();
			}
			@Override
			public Adapter caseProjectingFormulation(ProjectingFormulation object) {
				return createProjectingFormulationAdapter();
			}
			@Override
			public Adapter caseAggregationFormulation(AggregationFormulation object) {
				return createAggregationFormulationAdapter();
			}
			@Override
			public Adapter caseNounConceptNominalization(NounConceptNominalization object) {
				return createNounConceptNominalizationAdapter();
			}
			@Override
			public Adapter caseFactTypeNominalization(FactTypeNominalization object) {
				return createFactTypeNominalizationAdapter();
			}
			@Override
			public Adapter caseQuestionNominalization(QuestionNominalization object) {
				return createQuestionNominalizationAdapter();
			}
			@Override
			public Adapter caseAnswerNominalization(AnswerNominalization object) {
				return createAnswerNominalizationAdapter();
			}
			@Override
			public Adapter caseAuxiliaryVariable(AuxiliaryVariable object) {
				return createAuxiliaryVariableAdapter();
			}
			@Override
			public Adapter caseBagProjection(BagProjection object) {
				return createBagProjectionAdapter();
			}
			@Override
			public Adapter caseSetProjection(SetProjection object) {
				return createSetProjectionAdapter();
			}
			@Override
			public Adapter caseLogicalFormulationKind(LogicalFormulationKind object) {
				return createLogicalFormulationKindAdapter();
			}
			@Override
			public Adapter caseClosedProjection(ClosedProjection object) {
				return createClosedProjectionAdapter();
			}
			@Override
			public Adapter caseCategorizationScheme(CategorizationScheme object) {
				return createCategorizationSchemeAdapter();
			}
			@Override
			public Adapter caseCategorizationType(CategorizationType object) {
				return createCategorizationTypeAdapter();
			}
			@Override
			public Adapter caseSegmentation(Segmentation object) {
				return createSegmentationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link SBVR.BodyOfSharedMeanings <em>Body Of Shared Meanings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.BodyOfSharedMeanings
	 * @generated
	 */
	public Adapter createBodyOfSharedMeaningsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.TerminologicalDictionary <em>Terminological Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.TerminologicalDictionary
	 * @generated
	 */
	public Adapter createTerminologicalDictionaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Vocabulary <em>Vocabulary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Vocabulary
	 * @generated
	 */
	public Adapter createVocabularyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.QualifiedDesignation <em>Qualified Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.QualifiedDesignation
	 * @generated
	 */
	public Adapter createQualifiedDesignationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Name
	 * @generated
	 */
	public Adapter createNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.FactSymbol <em>Fact Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.FactSymbol
	 * @generated
	 */
	public Adapter createFactSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Rulebook <em>Rulebook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Rulebook
	 * @generated
	 */
	public Adapter createRulebookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.BusinessVocabulary <em>Business Vocabulary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.BusinessVocabulary
	 * @generated
	 */
	public Adapter createBusinessVocabularyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.SubjectField <em>Subject Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.SubjectField
	 * @generated
	 */
	public Adapter createSubjectFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.DescriptiveExample <em>Descriptive Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.DescriptiveExample
	 * @generated
	 */
	public Adapter createDescriptiveExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.CommunicationContent <em>Communication Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.CommunicationContent
	 * @generated
	 */
	public Adapter createCommunicationContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Community <em>Community</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Community
	 * @generated
	 */
	public Adapter createCommunityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.SemanticCommunity <em>Semantic Community</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.SemanticCommunity
	 * @generated
	 */
	public Adapter createSemanticCommunityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.SpeechCommunity <em>Speech Community</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.SpeechCommunity
	 * @generated
	 */
	public Adapter createSpeechCommunityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.NonverbalDesignation <em>Nonverbal Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.NonverbalDesignation
	 * @generated
	 */
	public Adapter createNonverbalDesignationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Icon
	 * @generated
	 */
	public Adapter createIconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.PartitiveFactType <em>Partitive Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.PartitiveFactType
	 * @generated
	 */
	public Adapter createPartitiveFactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.FundamentalConcept <em>Fundamental Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.FundamentalConcept
	 * @generated
	 */
	public Adapter createFundamentalConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.SituationalRole <em>Situational Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.SituationalRole
	 * @generated
	 */
	public Adapter createSituationalRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.AssociativeFactType <em>Associative Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.AssociativeFactType
	 * @generated
	 */
	public Adapter createAssociativeFactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.IsPropertyOfFactType <em>Is Property Of Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.IsPropertyOfFactType
	 * @generated
	 */
	public Adapter createIsPropertyOfFactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.AssortmentFactType <em>Assortment Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.AssortmentFactType
	 * @generated
	 */
	public Adapter createAssortmentFactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.SpecializationFactType <em>Specialization Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.SpecializationFactType
	 * @generated
	 */
	public Adapter createSpecializationFactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.CategorizationFactType <em>Categorization Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.CategorizationFactType
	 * @generated
	 */
	public Adapter createCategorizationFactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ContextualizationFactType <em>Contextualization Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ContextualizationFactType
	 * @generated
	 */
	public Adapter createContextualizationFactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ContextualizedConcept <em>Contextualized Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ContextualizedConcept
	 * @generated
	 */
	public Adapter createContextualizedConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Facet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Facet
	 * @generated
	 */
	public Adapter createFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.IsRoleOfFactType <em>Is Role Of Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.IsRoleOfFactType
	 * @generated
	 */
	public Adapter createIsRoleOfFactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.IsFacetOfFactType <em>Is Facet Of Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.IsFacetOfFactType
	 * @generated
	 */
	public Adapter createIsFacetOfFactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ElementOfGuidance <em>Element Of Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ElementOfGuidance
	 * @generated
	 */
	public Adapter createElementOfGuidanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Thing
	 * @generated
	 */
	public Adapter createThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ConceptualSchema <em>Conceptual Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ConceptualSchema
	 * @generated
	 */
	public Adapter createConceptualSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Meaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Meaning
	 * @generated
	 */
	public Adapter createMeaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Representation
	 * @generated
	 */
	public Adapter createRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Actuality <em>Actuality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Actuality
	 * @generated
	 */
	public Adapter createActualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.StateOfAffairs <em>State Of Affairs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.StateOfAffairs
	 * @generated
	 */
	public Adapter createStateOfAffairsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.BindableTarget <em>Bindable Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.BindableTarget
	 * @generated
	 */
	public Adapter createBindableTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Designation <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Designation
	 * @generated
	 */
	public Adapter createDesignationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Set
	 * @generated
	 */
	public Adapter createSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.NounConcept <em>Noun Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.NounConcept
	 * @generated
	 */
	public Adapter createNounConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ReferenceScheme <em>Reference Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ReferenceScheme
	 * @generated
	 */
	public Adapter createReferenceSchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.FactTypeRole <em>Fact Type Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.FactTypeRole
	 * @generated
	 */
	public Adapter createFactTypeRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Characteristic
	 * @generated
	 */
	public Adapter createCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.FactType <em>Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.FactType
	 * @generated
	 */
	public Adapter createFactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.FactTypeForm <em>Fact Type Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.FactTypeForm
	 * @generated
	 */
	public Adapter createFactTypeFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Placeholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Placeholder
	 * @generated
	 */
	public Adapter createPlaceholderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.BinaryFactType <em>Binary Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.BinaryFactType
	 * @generated
	 */
	public Adapter createBinaryFactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Fact
	 * @generated
	 */
	public Adapter createFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Proposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Proposition
	 * @generated
	 */
	public Adapter createPropositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.FactModel <em>Fact Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.FactModel
	 * @generated
	 */
	public Adapter createFactModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.URI
	 * @generated
	 */
	public Adapter createURIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.IndividualConcept <em>Individual Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.IndividualConcept
	 * @generated
	 */
	public Adapter createIndividualConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ConceptType <em>Concept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ConceptType
	 * @generated
	 */
	public Adapter createConceptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.NonNegativeInteger <em>Non Negative Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.NonNegativeInteger
	 * @generated
	 */
	public Adapter createNonNegativeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.PositiveInteger <em>Positive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.PositiveInteger
	 * @generated
	 */
	public Adapter createPositiveIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.SententialForm <em>Sentential Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.SententialForm
	 * @generated
	 */
	public Adapter createSententialFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.NounForm <em>Noun Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.NounForm
	 * @generated
	 */
	public Adapter createNounFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Language
	 * @generated
	 */
	public Adapter createLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.VocabularyNamespace <em>Vocabulary Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.VocabularyNamespace
	 * @generated
	 */
	public Adapter createVocabularyNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.AttributiveNamespace <em>Attributive Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.AttributiveNamespace
	 * @generated
	 */
	public Adapter createAttributiveNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.SemanticFormulation <em>Semantic Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.SemanticFormulation
	 * @generated
	 */
	public Adapter createSemanticFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ClosedSemanticFormulation <em>Closed Semantic Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ClosedSemanticFormulation
	 * @generated
	 */
	public Adapter createClosedSemanticFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.LogicalFormulation <em>Logical Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.LogicalFormulation
	 * @generated
	 */
	public Adapter createLogicalFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Projection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Projection
	 * @generated
	 */
	public Adapter createProjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.AtomicFormulation <em>Atomic Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.AtomicFormulation
	 * @generated
	 */
	public Adapter createAtomicFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.InstantiationFormulation <em>Instantiation Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.InstantiationFormulation
	 * @generated
	 */
	public Adapter createInstantiationFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Quantification <em>Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Quantification
	 * @generated
	 */
	public Adapter createQuantificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Objectification <em>Objectification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Objectification
	 * @generated
	 */
	public Adapter createObjectificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.PropositionNominalization <em>Proposition Nominalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.PropositionNominalization
	 * @generated
	 */
	public Adapter createPropositionNominalizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ClosedLogicalFormulation <em>Closed Logical Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ClosedLogicalFormulation
	 * @generated
	 */
	public Adapter createClosedLogicalFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.RoleBinding <em>Role Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.RoleBinding
	 * @generated
	 */
	public Adapter createRoleBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ModalFormulation <em>Modal Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ModalFormulation
	 * @generated
	 */
	public Adapter createModalFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.NecessityFormulation <em>Necessity Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.NecessityFormulation
	 * @generated
	 */
	public Adapter createNecessityFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ObligationFormulation <em>Obligation Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ObligationFormulation
	 * @generated
	 */
	public Adapter createObligationFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.PermissibilityFormulation <em>Permissibility Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.PermissibilityFormulation
	 * @generated
	 */
	public Adapter createPermissibilityFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.PossibilityFormulation <em>Possibility Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.PossibilityFormulation
	 * @generated
	 */
	public Adapter createPossibilityFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.LogicalOperation <em>Logical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.LogicalOperation
	 * @generated
	 */
	public Adapter createLogicalOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.LogicalNegation <em>Logical Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.LogicalNegation
	 * @generated
	 */
	public Adapter createLogicalNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.BinaryLogicalOperation <em>Binary Logical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.BinaryLogicalOperation
	 * @generated
	 */
	public Adapter createBinaryLogicalOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Conjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Conjunction
	 * @generated
	 */
	public Adapter createConjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Disjunction
	 * @generated
	 */
	public Adapter createDisjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Equivalence <em>Equivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Equivalence
	 * @generated
	 */
	public Adapter createEquivalenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ExclusiveDisjunction <em>Exclusive Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ExclusiveDisjunction
	 * @generated
	 */
	public Adapter createExclusiveDisjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Implication
	 * @generated
	 */
	public Adapter createImplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.NandFormulation <em>Nand Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.NandFormulation
	 * @generated
	 */
	public Adapter createNandFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.NorFormulation <em>Nor Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.NorFormulation
	 * @generated
	 */
	public Adapter createNorFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.WhetherOrNotFormulation <em>Whether Or Not Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.WhetherOrNotFormulation
	 * @generated
	 */
	public Adapter createWhetherOrNotFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.UniversalQuantification <em>Universal Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.UniversalQuantification
	 * @generated
	 */
	public Adapter createUniversalQuantificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.AtLeastNQuantification <em>At Least NQuantification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.AtLeastNQuantification
	 * @generated
	 */
	public Adapter createAtLeastNQuantificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ExistentialQuantification <em>Existential Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ExistentialQuantification
	 * @generated
	 */
	public Adapter createExistentialQuantificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.NumericRangeQuantification <em>Numeric Range Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.NumericRangeQuantification
	 * @generated
	 */
	public Adapter createNumericRangeQuantificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.AtMostNQuantification <em>At Most NQuantification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.AtMostNQuantification
	 * @generated
	 */
	public Adapter createAtMostNQuantificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.AtMostOneQuantification <em>At Most One Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.AtMostOneQuantification
	 * @generated
	 */
	public Adapter createAtMostOneQuantificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ExactlyNQuantification <em>Exactly NQuantification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ExactlyNQuantification
	 * @generated
	 */
	public Adapter createExactlyNQuantificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ExactlyOneQuantification <em>Exactly One Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ExactlyOneQuantification
	 * @generated
	 */
	public Adapter createExactlyOneQuantificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ProjectingFormulation <em>Projecting Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ProjectingFormulation
	 * @generated
	 */
	public Adapter createProjectingFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.AggregationFormulation <em>Aggregation Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.AggregationFormulation
	 * @generated
	 */
	public Adapter createAggregationFormulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.NounConceptNominalization <em>Noun Concept Nominalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.NounConceptNominalization
	 * @generated
	 */
	public Adapter createNounConceptNominalizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.FactTypeNominalization <em>Fact Type Nominalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.FactTypeNominalization
	 * @generated
	 */
	public Adapter createFactTypeNominalizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.QuestionNominalization <em>Question Nominalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.QuestionNominalization
	 * @generated
	 */
	public Adapter createQuestionNominalizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.AnswerNominalization <em>Answer Nominalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.AnswerNominalization
	 * @generated
	 */
	public Adapter createAnswerNominalizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.AuxiliaryVariable <em>Auxiliary Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.AuxiliaryVariable
	 * @generated
	 */
	public Adapter createAuxiliaryVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.BagProjection <em>Bag Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.BagProjection
	 * @generated
	 */
	public Adapter createBagProjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.SetProjection <em>Set Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.SetProjection
	 * @generated
	 */
	public Adapter createSetProjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.LogicalFormulationKind <em>Logical Formulation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.LogicalFormulationKind
	 * @generated
	 */
	public Adapter createLogicalFormulationKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.ClosedProjection <em>Closed Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.ClosedProjection
	 * @generated
	 */
	public Adapter createClosedProjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.CategorizationScheme <em>Categorization Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.CategorizationScheme
	 * @generated
	 */
	public Adapter createCategorizationSchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.CategorizationType <em>Categorization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.CategorizationType
	 * @generated
	 */
	public Adapter createCategorizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SBVR.Segmentation <em>Segmentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SBVR.Segmentation
	 * @generated
	 */
	public Adapter createSegmentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SBVRAdapterFactory
