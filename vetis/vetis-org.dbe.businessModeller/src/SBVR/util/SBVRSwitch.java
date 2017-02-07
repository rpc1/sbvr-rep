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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see SBVR.SBVRPackage
 * @generated
 */
public class SBVRSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SBVRPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SBVRSwitch() {
		if (modelPackage == null) {
			modelPackage = SBVRPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SBVRPackage.BODY_OF_SHARED_MEANINGS: {
				BodyOfSharedMeanings bodyOfSharedMeanings = (BodyOfSharedMeanings)theEObject;
				T result = caseBodyOfSharedMeanings(bodyOfSharedMeanings);
				if (result == null) result = caseSet(bodyOfSharedMeanings);
				if (result == null) result = caseThing(bodyOfSharedMeanings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY: {
				TerminologicalDictionary terminologicalDictionary = (TerminologicalDictionary)theEObject;
				T result = caseTerminologicalDictionary(terminologicalDictionary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.VOCABULARY: {
				Vocabulary vocabulary = (Vocabulary)theEObject;
				T result = caseVocabulary(vocabulary);
				if (result == null) result = caseSet(vocabulary);
				if (result == null) result = caseThing(vocabulary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseQualifiedDesignation(term);
				if (result == null) result = caseDesignation(term);
				if (result == null) result = caseRepresentation(term);
				if (result == null) result = caseActuality(term);
				if (result == null) result = caseStateOfAffairs(term);
				if (result == null) result = caseThing(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.QUALIFIED_DESIGNATION: {
				QualifiedDesignation qualifiedDesignation = (QualifiedDesignation)theEObject;
				T result = caseQualifiedDesignation(qualifiedDesignation);
				if (result == null) result = caseDesignation(qualifiedDesignation);
				if (result == null) result = caseRepresentation(qualifiedDesignation);
				if (result == null) result = caseActuality(qualifiedDesignation);
				if (result == null) result = caseStateOfAffairs(qualifiedDesignation);
				if (result == null) result = caseThing(qualifiedDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NAME: {
				Name name = (Name)theEObject;
				T result = caseName(name);
				if (result == null) result = caseQualifiedDesignation(name);
				if (result == null) result = caseDesignation(name);
				if (result == null) result = caseRepresentation(name);
				if (result == null) result = caseActuality(name);
				if (result == null) result = caseStateOfAffairs(name);
				if (result == null) result = caseThing(name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.FACT_SYMBOL: {
				FactSymbol factSymbol = (FactSymbol)theEObject;
				T result = caseFactSymbol(factSymbol);
				if (result == null) result = caseQualifiedDesignation(factSymbol);
				if (result == null) result = caseDesignation(factSymbol);
				if (result == null) result = caseRepresentation(factSymbol);
				if (result == null) result = caseActuality(factSymbol);
				if (result == null) result = caseStateOfAffairs(factSymbol);
				if (result == null) result = caseThing(factSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.RULEBOOK: {
				Rulebook rulebook = (Rulebook)theEObject;
				T result = caseRulebook(rulebook);
				if (result == null) result = caseSet(rulebook);
				if (result == null) result = caseThing(rulebook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.BUSINESS_VOCABULARY: {
				BusinessVocabulary businessVocabulary = (BusinessVocabulary)theEObject;
				T result = caseBusinessVocabulary(businessVocabulary);
				if (result == null) result = caseVocabulary(businessVocabulary);
				if (result == null) result = caseSet(businessVocabulary);
				if (result == null) result = caseThing(businessVocabulary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.SUBJECT_FIELD: {
				SubjectField subjectField = (SubjectField)theEObject;
				T result = caseSubjectField(subjectField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = caseRepresentation(description);
				if (result == null) result = caseActuality(description);
				if (result == null) result = caseStateOfAffairs(description);
				if (result == null) result = caseThing(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.DESCRIPTIVE_EXAMPLE: {
				DescriptiveExample descriptiveExample = (DescriptiveExample)theEObject;
				T result = caseDescriptiveExample(descriptiveExample);
				if (result == null) result = caseRepresentation(descriptiveExample);
				if (result == null) result = caseActuality(descriptiveExample);
				if (result == null) result = caseStateOfAffairs(descriptiveExample);
				if (result == null) result = caseThing(descriptiveExample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NOTE: {
				Note note = (Note)theEObject;
				T result = caseNote(note);
				if (result == null) result = caseRepresentation(note);
				if (result == null) result = caseActuality(note);
				if (result == null) result = caseStateOfAffairs(note);
				if (result == null) result = caseThing(note);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseRepresentation(reference);
				if (result == null) result = caseActuality(reference);
				if (result == null) result = caseStateOfAffairs(reference);
				if (result == null) result = caseThing(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.COMMUNICATION_CONTENT: {
				CommunicationContent communicationContent = (CommunicationContent)theEObject;
				T result = caseCommunicationContent(communicationContent);
				if (result == null) result = caseRepresentation(communicationContent);
				if (result == null) result = caseActuality(communicationContent);
				if (result == null) result = caseStateOfAffairs(communicationContent);
				if (result == null) result = caseThing(communicationContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.COMMUNITY: {
				Community community = (Community)theEObject;
				T result = caseCommunity(community);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.SEMANTIC_COMMUNITY: {
				SemanticCommunity semanticCommunity = (SemanticCommunity)theEObject;
				T result = caseSemanticCommunity(semanticCommunity);
				if (result == null) result = caseCommunity(semanticCommunity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.SPEECH_COMMUNITY: {
				SpeechCommunity speechCommunity = (SpeechCommunity)theEObject;
				T result = caseSpeechCommunity(speechCommunity);
				if (result == null) result = caseCommunity(speechCommunity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NONVERBAL_DESIGNATION: {
				NonverbalDesignation nonverbalDesignation = (NonverbalDesignation)theEObject;
				T result = caseNonverbalDesignation(nonverbalDesignation);
				if (result == null) result = caseQualifiedDesignation(nonverbalDesignation);
				if (result == null) result = caseDesignation(nonverbalDesignation);
				if (result == null) result = caseRepresentation(nonverbalDesignation);
				if (result == null) result = caseActuality(nonverbalDesignation);
				if (result == null) result = caseStateOfAffairs(nonverbalDesignation);
				if (result == null) result = caseThing(nonverbalDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.ICON: {
				Icon icon = (Icon)theEObject;
				T result = caseIcon(icon);
				if (result == null) result = caseNonverbalDesignation(icon);
				if (result == null) result = caseQualifiedDesignation(icon);
				if (result == null) result = caseDesignation(icon);
				if (result == null) result = caseRepresentation(icon);
				if (result == null) result = caseActuality(icon);
				if (result == null) result = caseStateOfAffairs(icon);
				if (result == null) result = caseThing(icon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.PARTITIVE_FACT_TYPE: {
				PartitiveFactType partitiveFactType = (PartitiveFactType)theEObject;
				T result = casePartitiveFactType(partitiveFactType);
				if (result == null) result = caseBinaryFactType(partitiveFactType);
				if (result == null) result = caseFactType(partitiveFactType);
				if (result == null) result = caseConcept(partitiveFactType);
				if (result == null) result = caseMeaning(partitiveFactType);
				if (result == null) result = caseThing(partitiveFactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.FUNDAMENTAL_CONCEPT: {
				FundamentalConcept fundamentalConcept = (FundamentalConcept)theEObject;
				T result = caseFundamentalConcept(fundamentalConcept);
				if (result == null) result = caseObjectType(fundamentalConcept);
				if (result == null) result = caseNounConcept(fundamentalConcept);
				if (result == null) result = caseConcept(fundamentalConcept);
				if (result == null) result = caseMeaning(fundamentalConcept);
				if (result == null) result = caseThing(fundamentalConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.SITUATIONAL_ROLE: {
				SituationalRole situationalRole = (SituationalRole)theEObject;
				T result = caseSituationalRole(situationalRole);
				if (result == null) result = caseRole(situationalRole);
				if (result == null) result = caseObjectType(situationalRole);
				if (result == null) result = caseNounConcept(situationalRole);
				if (result == null) result = caseConcept(situationalRole);
				if (result == null) result = caseMeaning(situationalRole);
				if (result == null) result = caseThing(situationalRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.ASSOCIATIVE_FACT_TYPE: {
				AssociativeFactType associativeFactType = (AssociativeFactType)theEObject;
				T result = caseAssociativeFactType(associativeFactType);
				if (result == null) result = caseFactType(associativeFactType);
				if (result == null) result = caseConcept(associativeFactType);
				if (result == null) result = caseMeaning(associativeFactType);
				if (result == null) result = caseThing(associativeFactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.IS_PROPERTY_OF_FACT_TYPE: {
				IsPropertyOfFactType isPropertyOfFactType = (IsPropertyOfFactType)theEObject;
				T result = caseIsPropertyOfFactType(isPropertyOfFactType);
				if (result == null) result = caseAssociativeFactType(isPropertyOfFactType);
				if (result == null) result = caseFactType(isPropertyOfFactType);
				if (result == null) result = caseConcept(isPropertyOfFactType);
				if (result == null) result = caseMeaning(isPropertyOfFactType);
				if (result == null) result = caseThing(isPropertyOfFactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.ASSORTMENT_FACT_TYPE: {
				AssortmentFactType assortmentFactType = (AssortmentFactType)theEObject;
				T result = caseAssortmentFactType(assortmentFactType);
				if (result == null) result = caseFactType(assortmentFactType);
				if (result == null) result = caseConcept(assortmentFactType);
				if (result == null) result = caseMeaning(assortmentFactType);
				if (result == null) result = caseThing(assortmentFactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.SPECIALIZATION_FACT_TYPE: {
				SpecializationFactType specializationFactType = (SpecializationFactType)theEObject;
				T result = caseSpecializationFactType(specializationFactType);
				if (result == null) result = caseFactType(specializationFactType);
				if (result == null) result = caseConcept(specializationFactType);
				if (result == null) result = caseMeaning(specializationFactType);
				if (result == null) result = caseThing(specializationFactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CATEGORIZATION_FACT_TYPE: {
				CategorizationFactType categorizationFactType = (CategorizationFactType)theEObject;
				T result = caseCategorizationFactType(categorizationFactType);
				if (result == null) result = caseSpecializationFactType(categorizationFactType);
				if (result == null) result = caseFactType(categorizationFactType);
				if (result == null) result = caseConcept(categorizationFactType);
				if (result == null) result = caseMeaning(categorizationFactType);
				if (result == null) result = caseThing(categorizationFactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CONTEXTUALIZATION_FACT_TYPE: {
				ContextualizationFactType contextualizationFactType = (ContextualizationFactType)theEObject;
				T result = caseContextualizationFactType(contextualizationFactType);
				if (result == null) result = caseSpecializationFactType(contextualizationFactType);
				if (result == null) result = caseFactType(contextualizationFactType);
				if (result == null) result = caseConcept(contextualizationFactType);
				if (result == null) result = caseMeaning(contextualizationFactType);
				if (result == null) result = caseThing(contextualizationFactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CONTEXTUALIZED_CONCEPT: {
				ContextualizedConcept contextualizedConcept = (ContextualizedConcept)theEObject;
				T result = caseContextualizedConcept(contextualizedConcept);
				if (result == null) result = caseNounConcept(contextualizedConcept);
				if (result == null) result = caseConcept(contextualizedConcept);
				if (result == null) result = caseMeaning(contextualizedConcept);
				if (result == null) result = caseThing(contextualizedConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.FACET: {
				Facet facet = (Facet)theEObject;
				T result = caseFacet(facet);
				if (result == null) result = caseContextualizedConcept(facet);
				if (result == null) result = caseNounConcept(facet);
				if (result == null) result = caseConcept(facet);
				if (result == null) result = caseMeaning(facet);
				if (result == null) result = caseThing(facet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.IS_ROLE_OF_FACT_TYPE: {
				IsRoleOfFactType isRoleOfFactType = (IsRoleOfFactType)theEObject;
				T result = caseIsRoleOfFactType(isRoleOfFactType);
				if (result == null) result = caseContextualizationFactType(isRoleOfFactType);
				if (result == null) result = caseSpecializationFactType(isRoleOfFactType);
				if (result == null) result = caseFactType(isRoleOfFactType);
				if (result == null) result = caseConcept(isRoleOfFactType);
				if (result == null) result = caseMeaning(isRoleOfFactType);
				if (result == null) result = caseThing(isRoleOfFactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.IS_FACET_OF_FACT_TYPE: {
				IsFacetOfFactType isFacetOfFactType = (IsFacetOfFactType)theEObject;
				T result = caseIsFacetOfFactType(isFacetOfFactType);
				if (result == null) result = caseContextualizationFactType(isFacetOfFactType);
				if (result == null) result = caseSpecializationFactType(isFacetOfFactType);
				if (result == null) result = caseFactType(isFacetOfFactType);
				if (result == null) result = caseConcept(isFacetOfFactType);
				if (result == null) result = caseMeaning(isFacetOfFactType);
				if (result == null) result = caseThing(isFacetOfFactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.ELEMENT_OF_GUIDANCE: {
				ElementOfGuidance elementOfGuidance = (ElementOfGuidance)theEObject;
				T result = caseElementOfGuidance(elementOfGuidance);
				if (result == null) result = caseProposition(elementOfGuidance);
				if (result == null) result = caseMeaning(elementOfGuidance);
				if (result == null) result = caseThing(elementOfGuidance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseProposition(rule);
				if (result == null) result = caseMeaning(rule);
				if (result == null) result = caseThing(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.PACKAGE: {
				SBVR.Package package_ = (SBVR.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.THING: {
				Thing thing = (Thing)theEObject;
				T result = caseThing(thing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CONCEPTUAL_SCHEMA: {
				ConceptualSchema conceptualSchema = (ConceptualSchema)theEObject;
				T result = caseConceptualSchema(conceptualSchema);
				if (result == null) result = caseThing(conceptualSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CONCEPT: {
				Concept concept = (Concept)theEObject;
				T result = caseConcept(concept);
				if (result == null) result = caseMeaning(concept);
				if (result == null) result = caseThing(concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.MEANING: {
				Meaning meaning = (Meaning)theEObject;
				T result = caseMeaning(meaning);
				if (result == null) result = caseThing(meaning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.REPRESENTATION: {
				Representation representation = (Representation)theEObject;
				T result = caseRepresentation(representation);
				if (result == null) result = caseActuality(representation);
				if (result == null) result = caseStateOfAffairs(representation);
				if (result == null) result = caseThing(representation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.ACTUALITY: {
				Actuality actuality = (Actuality)theEObject;
				T result = caseActuality(actuality);
				if (result == null) result = caseStateOfAffairs(actuality);
				if (result == null) result = caseThing(actuality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.STATE_OF_AFFAIRS: {
				StateOfAffairs stateOfAffairs = (StateOfAffairs)theEObject;
				T result = caseStateOfAffairs(stateOfAffairs);
				if (result == null) result = caseThing(stateOfAffairs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseBindableTarget(expression);
				if (result == null) result = caseThing(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.BINDABLE_TARGET: {
				BindableTarget bindableTarget = (BindableTarget)theEObject;
				T result = caseBindableTarget(bindableTarget);
				if (result == null) result = caseThing(bindableTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = caseRepresentation(definition);
				if (result == null) result = caseActuality(definition);
				if (result == null) result = caseStateOfAffairs(definition);
				if (result == null) result = caseThing(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.DESIGNATION: {
				Designation designation = (Designation)theEObject;
				T result = caseDesignation(designation);
				if (result == null) result = caseRepresentation(designation);
				if (result == null) result = caseActuality(designation);
				if (result == null) result = caseStateOfAffairs(designation);
				if (result == null) result = caseThing(designation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.SET: {
				Set set = (Set)theEObject;
				T result = caseSet(set);
				if (result == null) result = caseThing(set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.INTEGER: {
				SBVR.Integer integer = (SBVR.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseNumber(integer);
				if (result == null) result = caseQuantity(integer);
				if (result == null) result = caseNounConcept(integer);
				if (result == null) result = caseConcept(integer);
				if (result == null) result = caseMeaning(integer);
				if (result == null) result = caseThing(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NUMBER: {
				SBVR.Number number = (SBVR.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = caseQuantity(number);
				if (result == null) result = caseNounConcept(number);
				if (result == null) result = caseConcept(number);
				if (result == null) result = caseMeaning(number);
				if (result == null) result = caseThing(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = caseNounConcept(quantity);
				if (result == null) result = caseConcept(quantity);
				if (result == null) result = caseMeaning(quantity);
				if (result == null) result = caseThing(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NOUN_CONCEPT: {
				NounConcept nounConcept = (NounConcept)theEObject;
				T result = caseNounConcept(nounConcept);
				if (result == null) result = caseConcept(nounConcept);
				if (result == null) result = caseMeaning(nounConcept);
				if (result == null) result = caseThing(nounConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.REFERENCE_SCHEME: {
				ReferenceScheme referenceScheme = (ReferenceScheme)theEObject;
				T result = caseReferenceScheme(referenceScheme);
				if (result == null) result = caseThing(referenceScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.FACT_TYPE_ROLE: {
				FactTypeRole factTypeRole = (FactTypeRole)theEObject;
				T result = caseFactTypeRole(factTypeRole);
				if (result == null) result = caseRole(factTypeRole);
				if (result == null) result = caseNounConcept(factTypeRole);
				if (result == null) result = caseConcept(factTypeRole);
				if (result == null) result = caseMeaning(factTypeRole);
				if (result == null) result = caseThing(factTypeRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseNounConcept(role);
				if (result == null) result = caseConcept(role);
				if (result == null) result = caseMeaning(role);
				if (result == null) result = caseThing(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.OBJECT_TYPE: {
				ObjectType objectType = (ObjectType)theEObject;
				T result = caseObjectType(objectType);
				if (result == null) result = caseNounConcept(objectType);
				if (result == null) result = caseConcept(objectType);
				if (result == null) result = caseMeaning(objectType);
				if (result == null) result = caseThing(objectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CHARACTERISTIC: {
				Characteristic characteristic = (Characteristic)theEObject;
				T result = caseCharacteristic(characteristic);
				if (result == null) result = caseFactType(characteristic);
				if (result == null) result = caseConcept(characteristic);
				if (result == null) result = caseMeaning(characteristic);
				if (result == null) result = caseThing(characteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.FACT_TYPE: {
				FactType factType = (FactType)theEObject;
				T result = caseFactType(factType);
				if (result == null) result = caseConcept(factType);
				if (result == null) result = caseMeaning(factType);
				if (result == null) result = caseThing(factType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.FACT_TYPE_FORM: {
				FactTypeForm factTypeForm = (FactTypeForm)theEObject;
				T result = caseFactTypeForm(factTypeForm);
				if (result == null) result = caseRepresentation(factTypeForm);
				if (result == null) result = caseActuality(factTypeForm);
				if (result == null) result = caseStateOfAffairs(factTypeForm);
				if (result == null) result = caseThing(factTypeForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.PLACEHOLDER: {
				Placeholder placeholder = (Placeholder)theEObject;
				T result = casePlaceholder(placeholder);
				if (result == null) result = caseDesignation(placeholder);
				if (result == null) result = caseRepresentation(placeholder);
				if (result == null) result = caseActuality(placeholder);
				if (result == null) result = caseStateOfAffairs(placeholder);
				if (result == null) result = caseThing(placeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.BINARY_FACT_TYPE: {
				BinaryFactType binaryFactType = (BinaryFactType)theEObject;
				T result = caseBinaryFactType(binaryFactType);
				if (result == null) result = caseFactType(binaryFactType);
				if (result == null) result = caseConcept(binaryFactType);
				if (result == null) result = caseMeaning(binaryFactType);
				if (result == null) result = caseThing(binaryFactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.FACT: {
				Fact fact = (Fact)theEObject;
				T result = caseFact(fact);
				if (result == null) result = caseProposition(fact);
				if (result == null) result = caseMeaning(fact);
				if (result == null) result = caseThing(fact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.PROPOSITION: {
				Proposition proposition = (Proposition)theEObject;
				T result = caseProposition(proposition);
				if (result == null) result = caseMeaning(proposition);
				if (result == null) result = caseThing(proposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseRepresentation(statement);
				if (result == null) result = caseActuality(statement);
				if (result == null) result = caseStateOfAffairs(statement);
				if (result == null) result = caseThing(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.FACT_MODEL: {
				FactModel factModel = (FactModel)theEObject;
				T result = caseFactModel(factModel);
				if (result == null) result = caseThing(factModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseExpression(text);
				if (result == null) result = caseBindableTarget(text);
				if (result == null) result = caseThing(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = caseMeaning(question);
				if (result == null) result = caseThing(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = caseThing(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.URI: {
				URI uri = (URI)theEObject;
				T result = caseURI(uri);
				if (result == null) result = caseText(uri);
				if (result == null) result = caseExpression(uri);
				if (result == null) result = caseBindableTarget(uri);
				if (result == null) result = caseThing(uri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.INDIVIDUAL_CONCEPT: {
				IndividualConcept individualConcept = (IndividualConcept)theEObject;
				T result = caseIndividualConcept(individualConcept);
				if (result == null) result = caseNounConcept(individualConcept);
				if (result == null) result = caseBindableTarget(individualConcept);
				if (result == null) result = caseConcept(individualConcept);
				if (result == null) result = caseThing(individualConcept);
				if (result == null) result = caseMeaning(individualConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CONCEPT_TYPE: {
				ConceptType conceptType = (ConceptType)theEObject;
				T result = caseConceptType(conceptType);
				if (result == null) result = caseObjectType(conceptType);
				if (result == null) result = caseNounConcept(conceptType);
				if (result == null) result = caseConcept(conceptType);
				if (result == null) result = caseMeaning(conceptType);
				if (result == null) result = caseThing(conceptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NON_NEGATIVE_INTEGER: {
				NonNegativeInteger nonNegativeInteger = (NonNegativeInteger)theEObject;
				T result = caseNonNegativeInteger(nonNegativeInteger);
				if (result == null) result = caseInteger(nonNegativeInteger);
				if (result == null) result = caseNumber(nonNegativeInteger);
				if (result == null) result = caseQuantity(nonNegativeInteger);
				if (result == null) result = caseNounConcept(nonNegativeInteger);
				if (result == null) result = caseConcept(nonNegativeInteger);
				if (result == null) result = caseMeaning(nonNegativeInteger);
				if (result == null) result = caseThing(nonNegativeInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.POSITIVE_INTEGER: {
				PositiveInteger positiveInteger = (PositiveInteger)theEObject;
				T result = casePositiveInteger(positiveInteger);
				if (result == null) result = caseNonNegativeInteger(positiveInteger);
				if (result == null) result = caseInteger(positiveInteger);
				if (result == null) result = caseNumber(positiveInteger);
				if (result == null) result = caseQuantity(positiveInteger);
				if (result == null) result = caseNounConcept(positiveInteger);
				if (result == null) result = caseConcept(positiveInteger);
				if (result == null) result = caseMeaning(positiveInteger);
				if (result == null) result = caseThing(positiveInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.SENTENTIAL_FORM: {
				SententialForm sententialForm = (SententialForm)theEObject;
				T result = caseSententialForm(sententialForm);
				if (result == null) result = caseFactTypeForm(sententialForm);
				if (result == null) result = caseRepresentation(sententialForm);
				if (result == null) result = caseActuality(sententialForm);
				if (result == null) result = caseStateOfAffairs(sententialForm);
				if (result == null) result = caseThing(sententialForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NOUN_FORM: {
				NounForm nounForm = (NounForm)theEObject;
				T result = caseNounForm(nounForm);
				if (result == null) result = caseFactTypeForm(nounForm);
				if (result == null) result = caseRepresentation(nounForm);
				if (result == null) result = caseActuality(nounForm);
				if (result == null) result = caseStateOfAffairs(nounForm);
				if (result == null) result = caseThing(nounForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.LANGUAGE: {
				Language language = (Language)theEObject;
				T result = caseLanguage(language);
				if (result == null) result = caseThing(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.VOCABULARY_NAMESPACE: {
				VocabularyNamespace vocabularyNamespace = (VocabularyNamespace)theEObject;
				T result = caseVocabularyNamespace(vocabularyNamespace);
				if (result == null) result = caseNamespace(vocabularyNamespace);
				if (result == null) result = caseThing(vocabularyNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.ATTRIBUTIVE_NAMESPACE: {
				AttributiveNamespace attributiveNamespace = (AttributiveNamespace)theEObject;
				T result = caseAttributiveNamespace(attributiveNamespace);
				if (result == null) result = caseNamespace(attributiveNamespace);
				if (result == null) result = caseThing(attributiveNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.SEMANTIC_FORMULATION: {
				SemanticFormulation semanticFormulation = (SemanticFormulation)theEObject;
				T result = caseSemanticFormulation(semanticFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CLOSED_SEMANTIC_FORMULATION: {
				ClosedSemanticFormulation closedSemanticFormulation = (ClosedSemanticFormulation)theEObject;
				T result = caseClosedSemanticFormulation(closedSemanticFormulation);
				if (result == null) result = caseSemanticFormulation(closedSemanticFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.LOGICAL_FORMULATION: {
				LogicalFormulation logicalFormulation = (LogicalFormulation)theEObject;
				T result = caseLogicalFormulation(logicalFormulation);
				if (result == null) result = caseSemanticFormulation(logicalFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.PROJECTION: {
				Projection projection = (Projection)theEObject;
				T result = caseProjection(projection);
				if (result == null) result = caseSemanticFormulation(projection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.ATOMIC_FORMULATION: {
				AtomicFormulation atomicFormulation = (AtomicFormulation)theEObject;
				T result = caseAtomicFormulation(atomicFormulation);
				if (result == null) result = caseLogicalFormulation(atomicFormulation);
				if (result == null) result = caseSemanticFormulation(atomicFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.INSTANTIATION_FORMULATION: {
				InstantiationFormulation instantiationFormulation = (InstantiationFormulation)theEObject;
				T result = caseInstantiationFormulation(instantiationFormulation);
				if (result == null) result = caseLogicalFormulation(instantiationFormulation);
				if (result == null) result = caseSemanticFormulation(instantiationFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.QUANTIFICATION: {
				Quantification quantification = (Quantification)theEObject;
				T result = caseQuantification(quantification);
				if (result == null) result = caseLogicalFormulation(quantification);
				if (result == null) result = caseSemanticFormulation(quantification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.OBJECTIFICATION: {
				Objectification objectification = (Objectification)theEObject;
				T result = caseObjectification(objectification);
				if (result == null) result = caseLogicalFormulation(objectification);
				if (result == null) result = caseSemanticFormulation(objectification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.PROPOSITION_NOMINALIZATION: {
				PropositionNominalization propositionNominalization = (PropositionNominalization)theEObject;
				T result = casePropositionNominalization(propositionNominalization);
				if (result == null) result = caseLogicalFormulation(propositionNominalization);
				if (result == null) result = caseSemanticFormulation(propositionNominalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CLOSED_LOGICAL_FORMULATION: {
				ClosedLogicalFormulation closedLogicalFormulation = (ClosedLogicalFormulation)theEObject;
				T result = caseClosedLogicalFormulation(closedLogicalFormulation);
				if (result == null) result = caseClosedSemanticFormulation(closedLogicalFormulation);
				if (result == null) result = caseLogicalFormulation(closedLogicalFormulation);
				if (result == null) result = caseSemanticFormulation(closedLogicalFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseBindableTarget(variable);
				if (result == null) result = caseThing(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.ROLE_BINDING: {
				RoleBinding roleBinding = (RoleBinding)theEObject;
				T result = caseRoleBinding(roleBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.MODAL_FORMULATION: {
				ModalFormulation modalFormulation = (ModalFormulation)theEObject;
				T result = caseModalFormulation(modalFormulation);
				if (result == null) result = caseLogicalFormulation(modalFormulation);
				if (result == null) result = caseSemanticFormulation(modalFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NECESSITY_FORMULATION: {
				NecessityFormulation necessityFormulation = (NecessityFormulation)theEObject;
				T result = caseNecessityFormulation(necessityFormulation);
				if (result == null) result = caseModalFormulation(necessityFormulation);
				if (result == null) result = caseLogicalFormulation(necessityFormulation);
				if (result == null) result = caseSemanticFormulation(necessityFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.OBLIGATION_FORMULATION: {
				ObligationFormulation obligationFormulation = (ObligationFormulation)theEObject;
				T result = caseObligationFormulation(obligationFormulation);
				if (result == null) result = caseModalFormulation(obligationFormulation);
				if (result == null) result = caseLogicalFormulation(obligationFormulation);
				if (result == null) result = caseSemanticFormulation(obligationFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.PERMISSIBILITY_FORMULATION: {
				PermissibilityFormulation permissibilityFormulation = (PermissibilityFormulation)theEObject;
				T result = casePermissibilityFormulation(permissibilityFormulation);
				if (result == null) result = caseModalFormulation(permissibilityFormulation);
				if (result == null) result = caseLogicalFormulation(permissibilityFormulation);
				if (result == null) result = caseSemanticFormulation(permissibilityFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.POSSIBILITY_FORMULATION: {
				PossibilityFormulation possibilityFormulation = (PossibilityFormulation)theEObject;
				T result = casePossibilityFormulation(possibilityFormulation);
				if (result == null) result = caseModalFormulation(possibilityFormulation);
				if (result == null) result = caseLogicalFormulation(possibilityFormulation);
				if (result == null) result = caseSemanticFormulation(possibilityFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.LOGICAL_OPERATION: {
				LogicalOperation logicalOperation = (LogicalOperation)theEObject;
				T result = caseLogicalOperation(logicalOperation);
				if (result == null) result = caseLogicalFormulation(logicalOperation);
				if (result == null) result = caseSemanticFormulation(logicalOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.LOGICAL_NEGATION: {
				LogicalNegation logicalNegation = (LogicalNegation)theEObject;
				T result = caseLogicalNegation(logicalNegation);
				if (result == null) result = caseLogicalOperation(logicalNegation);
				if (result == null) result = caseLogicalFormulation(logicalNegation);
				if (result == null) result = caseSemanticFormulation(logicalNegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.BINARY_LOGICAL_OPERATION: {
				BinaryLogicalOperation binaryLogicalOperation = (BinaryLogicalOperation)theEObject;
				T result = caseBinaryLogicalOperation(binaryLogicalOperation);
				if (result == null) result = caseLogicalOperation(binaryLogicalOperation);
				if (result == null) result = caseLogicalFormulation(binaryLogicalOperation);
				if (result == null) result = caseSemanticFormulation(binaryLogicalOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CONJUNCTION: {
				Conjunction conjunction = (Conjunction)theEObject;
				T result = caseConjunction(conjunction);
				if (result == null) result = caseBinaryLogicalOperation(conjunction);
				if (result == null) result = caseLogicalOperation(conjunction);
				if (result == null) result = caseLogicalFormulation(conjunction);
				if (result == null) result = caseSemanticFormulation(conjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.DISJUNCTION: {
				Disjunction disjunction = (Disjunction)theEObject;
				T result = caseDisjunction(disjunction);
				if (result == null) result = caseBinaryLogicalOperation(disjunction);
				if (result == null) result = caseLogicalOperation(disjunction);
				if (result == null) result = caseLogicalFormulation(disjunction);
				if (result == null) result = caseSemanticFormulation(disjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.EQUIVALENCE: {
				Equivalence equivalence = (Equivalence)theEObject;
				T result = caseEquivalence(equivalence);
				if (result == null) result = caseBinaryLogicalOperation(equivalence);
				if (result == null) result = caseLogicalOperation(equivalence);
				if (result == null) result = caseLogicalFormulation(equivalence);
				if (result == null) result = caseSemanticFormulation(equivalence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.EXCLUSIVE_DISJUNCTION: {
				ExclusiveDisjunction exclusiveDisjunction = (ExclusiveDisjunction)theEObject;
				T result = caseExclusiveDisjunction(exclusiveDisjunction);
				if (result == null) result = caseBinaryLogicalOperation(exclusiveDisjunction);
				if (result == null) result = caseLogicalOperation(exclusiveDisjunction);
				if (result == null) result = caseLogicalFormulation(exclusiveDisjunction);
				if (result == null) result = caseSemanticFormulation(exclusiveDisjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.IMPLICATION: {
				Implication implication = (Implication)theEObject;
				T result = caseImplication(implication);
				if (result == null) result = caseBinaryLogicalOperation(implication);
				if (result == null) result = caseLogicalOperation(implication);
				if (result == null) result = caseLogicalFormulation(implication);
				if (result == null) result = caseSemanticFormulation(implication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NAND_FORMULATION: {
				NandFormulation nandFormulation = (NandFormulation)theEObject;
				T result = caseNandFormulation(nandFormulation);
				if (result == null) result = caseBinaryLogicalOperation(nandFormulation);
				if (result == null) result = caseLogicalOperation(nandFormulation);
				if (result == null) result = caseLogicalFormulation(nandFormulation);
				if (result == null) result = caseSemanticFormulation(nandFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NOR_FORMULATION: {
				NorFormulation norFormulation = (NorFormulation)theEObject;
				T result = caseNorFormulation(norFormulation);
				if (result == null) result = caseBinaryLogicalOperation(norFormulation);
				if (result == null) result = caseLogicalOperation(norFormulation);
				if (result == null) result = caseLogicalFormulation(norFormulation);
				if (result == null) result = caseSemanticFormulation(norFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.WHETHER_OR_NOT_FORMULATION: {
				WhetherOrNotFormulation whetherOrNotFormulation = (WhetherOrNotFormulation)theEObject;
				T result = caseWhetherOrNotFormulation(whetherOrNotFormulation);
				if (result == null) result = caseBinaryLogicalOperation(whetherOrNotFormulation);
				if (result == null) result = caseLogicalOperation(whetherOrNotFormulation);
				if (result == null) result = caseLogicalFormulation(whetherOrNotFormulation);
				if (result == null) result = caseSemanticFormulation(whetherOrNotFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.UNIVERSAL_QUANTIFICATION: {
				UniversalQuantification universalQuantification = (UniversalQuantification)theEObject;
				T result = caseUniversalQuantification(universalQuantification);
				if (result == null) result = caseQuantification(universalQuantification);
				if (result == null) result = caseLogicalFormulation(universalQuantification);
				if (result == null) result = caseSemanticFormulation(universalQuantification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.AT_LEAST_NQUANTIFICATION: {
				AtLeastNQuantification atLeastNQuantification = (AtLeastNQuantification)theEObject;
				T result = caseAtLeastNQuantification(atLeastNQuantification);
				if (result == null) result = caseQuantification(atLeastNQuantification);
				if (result == null) result = caseLogicalFormulation(atLeastNQuantification);
				if (result == null) result = caseSemanticFormulation(atLeastNQuantification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.EXISTENTIAL_QUANTIFICATION: {
				ExistentialQuantification existentialQuantification = (ExistentialQuantification)theEObject;
				T result = caseExistentialQuantification(existentialQuantification);
				if (result == null) result = caseAtLeastNQuantification(existentialQuantification);
				if (result == null) result = caseQuantification(existentialQuantification);
				if (result == null) result = caseLogicalFormulation(existentialQuantification);
				if (result == null) result = caseSemanticFormulation(existentialQuantification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NUMERIC_RANGE_QUANTIFICATION: {
				NumericRangeQuantification numericRangeQuantification = (NumericRangeQuantification)theEObject;
				T result = caseNumericRangeQuantification(numericRangeQuantification);
				if (result == null) result = caseQuantification(numericRangeQuantification);
				if (result == null) result = caseLogicalFormulation(numericRangeQuantification);
				if (result == null) result = caseSemanticFormulation(numericRangeQuantification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.AT_MOST_NQUANTIFICATION: {
				AtMostNQuantification atMostNQuantification = (AtMostNQuantification)theEObject;
				T result = caseAtMostNQuantification(atMostNQuantification);
				if (result == null) result = caseQuantification(atMostNQuantification);
				if (result == null) result = caseLogicalFormulation(atMostNQuantification);
				if (result == null) result = caseSemanticFormulation(atMostNQuantification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.AT_MOST_ONE_QUANTIFICATION: {
				AtMostOneQuantification atMostOneQuantification = (AtMostOneQuantification)theEObject;
				T result = caseAtMostOneQuantification(atMostOneQuantification);
				if (result == null) result = caseAtMostNQuantification(atMostOneQuantification);
				if (result == null) result = caseQuantification(atMostOneQuantification);
				if (result == null) result = caseLogicalFormulation(atMostOneQuantification);
				if (result == null) result = caseSemanticFormulation(atMostOneQuantification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.EXACTLY_NQUANTIFICATION: {
				ExactlyNQuantification exactlyNQuantification = (ExactlyNQuantification)theEObject;
				T result = caseExactlyNQuantification(exactlyNQuantification);
				if (result == null) result = caseQuantification(exactlyNQuantification);
				if (result == null) result = caseLogicalFormulation(exactlyNQuantification);
				if (result == null) result = caseSemanticFormulation(exactlyNQuantification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.EXACTLY_ONE_QUANTIFICATION: {
				ExactlyOneQuantification exactlyOneQuantification = (ExactlyOneQuantification)theEObject;
				T result = caseExactlyOneQuantification(exactlyOneQuantification);
				if (result == null) result = caseExactlyNQuantification(exactlyOneQuantification);
				if (result == null) result = caseQuantification(exactlyOneQuantification);
				if (result == null) result = caseLogicalFormulation(exactlyOneQuantification);
				if (result == null) result = caseSemanticFormulation(exactlyOneQuantification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.PROJECTING_FORMULATION: {
				ProjectingFormulation projectingFormulation = (ProjectingFormulation)theEObject;
				T result = caseProjectingFormulation(projectingFormulation);
				if (result == null) result = caseLogicalFormulation(projectingFormulation);
				if (result == null) result = caseSemanticFormulation(projectingFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.AGGREGATION_FORMULATION: {
				AggregationFormulation aggregationFormulation = (AggregationFormulation)theEObject;
				T result = caseAggregationFormulation(aggregationFormulation);
				if (result == null) result = caseProjectingFormulation(aggregationFormulation);
				if (result == null) result = caseLogicalFormulation(aggregationFormulation);
				if (result == null) result = caseSemanticFormulation(aggregationFormulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.NOUN_CONCEPT_NOMINALIZATION: {
				NounConceptNominalization nounConceptNominalization = (NounConceptNominalization)theEObject;
				T result = caseNounConceptNominalization(nounConceptNominalization);
				if (result == null) result = caseProjectingFormulation(nounConceptNominalization);
				if (result == null) result = caseLogicalFormulation(nounConceptNominalization);
				if (result == null) result = caseSemanticFormulation(nounConceptNominalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.FACT_TYPE_NOMINALIZATION: {
				FactTypeNominalization factTypeNominalization = (FactTypeNominalization)theEObject;
				T result = caseFactTypeNominalization(factTypeNominalization);
				if (result == null) result = caseProjectingFormulation(factTypeNominalization);
				if (result == null) result = caseLogicalFormulation(factTypeNominalization);
				if (result == null) result = caseSemanticFormulation(factTypeNominalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.QUESTION_NOMINALIZATION: {
				QuestionNominalization questionNominalization = (QuestionNominalization)theEObject;
				T result = caseQuestionNominalization(questionNominalization);
				if (result == null) result = caseProjectingFormulation(questionNominalization);
				if (result == null) result = caseLogicalFormulation(questionNominalization);
				if (result == null) result = caseSemanticFormulation(questionNominalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.ANSWER_NOMINALIZATION: {
				AnswerNominalization answerNominalization = (AnswerNominalization)theEObject;
				T result = caseAnswerNominalization(answerNominalization);
				if (result == null) result = caseProjectingFormulation(answerNominalization);
				if (result == null) result = caseLogicalFormulation(answerNominalization);
				if (result == null) result = caseSemanticFormulation(answerNominalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.AUXILIARY_VARIABLE: {
				AuxiliaryVariable auxiliaryVariable = (AuxiliaryVariable)theEObject;
				T result = caseAuxiliaryVariable(auxiliaryVariable);
				if (result == null) result = caseVariable(auxiliaryVariable);
				if (result == null) result = caseBindableTarget(auxiliaryVariable);
				if (result == null) result = caseThing(auxiliaryVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.BAG_PROJECTION: {
				BagProjection bagProjection = (BagProjection)theEObject;
				T result = caseBagProjection(bagProjection);
				if (result == null) result = caseProjection(bagProjection);
				if (result == null) result = caseSemanticFormulation(bagProjection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.SET_PROJECTION: {
				SetProjection setProjection = (SetProjection)theEObject;
				T result = caseSetProjection(setProjection);
				if (result == null) result = caseProjection(setProjection);
				if (result == null) result = caseSemanticFormulation(setProjection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.LOGICAL_FORMULATION_KIND: {
				LogicalFormulationKind logicalFormulationKind = (LogicalFormulationKind)theEObject;
				T result = caseLogicalFormulationKind(logicalFormulationKind);
				if (result == null) result = caseObjectType(logicalFormulationKind);
				if (result == null) result = caseNounConcept(logicalFormulationKind);
				if (result == null) result = caseConcept(logicalFormulationKind);
				if (result == null) result = caseMeaning(logicalFormulationKind);
				if (result == null) result = caseThing(logicalFormulationKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CLOSED_PROJECTION: {
				ClosedProjection closedProjection = (ClosedProjection)theEObject;
				T result = caseClosedProjection(closedProjection);
				if (result == null) result = caseClosedSemanticFormulation(closedProjection);
				if (result == null) result = caseProjection(closedProjection);
				if (result == null) result = caseSemanticFormulation(closedProjection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CATEGORIZATION_SCHEME: {
				CategorizationScheme categorizationScheme = (CategorizationScheme)theEObject;
				T result = caseCategorizationScheme(categorizationScheme);
				if (result == null) result = caseSet(categorizationScheme);
				if (result == null) result = caseThing(categorizationScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.CATEGORIZATION_TYPE: {
				CategorizationType categorizationType = (CategorizationType)theEObject;
				T result = caseCategorizationType(categorizationType);
				if (result == null) result = caseConcept(categorizationType);
				if (result == null) result = caseMeaning(categorizationType);
				if (result == null) result = caseThing(categorizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SBVRPackage.SEGMENTATION: {
				Segmentation segmentation = (Segmentation)theEObject;
				T result = caseSegmentation(segmentation);
				if (result == null) result = caseCategorizationScheme(segmentation);
				if (result == null) result = caseSet(segmentation);
				if (result == null) result = caseThing(segmentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Of Shared Meanings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Of Shared Meanings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyOfSharedMeanings(BodyOfSharedMeanings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminological Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminological Dictionary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologicalDictionary(TerminologicalDictionary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabulary(Vocabulary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedDesignation(QualifiedDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName(Name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactSymbol(FactSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rulebook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rulebook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRulebook(Rulebook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Vocabulary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Vocabulary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessVocabulary(BusinessVocabulary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectField(SubjectField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptive Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptive Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptiveExample(DescriptiveExample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationContent(CommunicationContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Community</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Community</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunity(Community object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Community</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Community</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticCommunity(SemanticCommunity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Community</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Community</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechCommunity(SpeechCommunity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonverbal Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonverbal Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonverbalDesignation(NonverbalDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIcon(Icon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partitive Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partitive Fact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitiveFactType(PartitiveFactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fundamental Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fundamental Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFundamentalConcept(FundamentalConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Situational Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Situational Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSituationalRole(SituationalRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associative Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associative Fact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociativeFactType(AssociativeFactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Property Of Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Property Of Fact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsPropertyOfFactType(IsPropertyOfFactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assortment Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assortment Fact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssortmentFactType(AssortmentFactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialization Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialization Fact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecializationFactType(SpecializationFactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorization Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorization Fact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorizationFactType(CategorizationFactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contextualization Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contextualization Fact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextualizationFactType(ContextualizationFactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contextualized Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contextualized Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextualizedConcept(ContextualizedConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacet(Facet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Role Of Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Role Of Fact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsRoleOfFactType(IsRoleOfFactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Facet Of Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Facet Of Fact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsFacetOfFactType(IsFacetOfFactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Of Guidance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Of Guidance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementOfGuidance(ElementOfGuidance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(SBVR.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThing(Thing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conceptual Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conceptual Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualSchema(ConceptualSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcept(Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meaning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meaning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeaning(Meaning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentation(Representation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuality(Actuality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Of Affairs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Of Affairs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateOfAffairs(StateOfAffairs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bindable Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bindable Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindableTarget(BindableTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignation(Designation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(SBVR.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(SBVR.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Noun Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Noun Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNounConcept(NounConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceScheme(ReferenceScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeRole(FactTypeRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectType(ObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristic(Characteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactType(FactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeForm(FactTypeForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceholder(Placeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Fact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Fact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryFactType(BinaryFactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFact(Fact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProposition(Proposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactModel(FactModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURI(URI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualConcept(IndividualConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptType(ConceptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Negative Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Negative Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonNegativeInteger(NonNegativeInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveInteger(PositiveInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sentential Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sentential Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSententialForm(SententialForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Noun Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Noun Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNounForm(NounForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguage(Language object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabularyNamespace(VocabularyNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributive Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributive Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributiveNamespace(AttributiveNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticFormulation(SemanticFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closed Semantic Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closed Semantic Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosedSemanticFormulation(ClosedSemanticFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalFormulation(LogicalFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjection(Projection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicFormulation(AtomicFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantiation Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantiation Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantiationFormulation(InstantiationFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantification(Quantification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objectification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objectification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectification(Objectification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proposition Nominalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proposition Nominalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropositionNominalization(PropositionNominalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closed Logical Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closed Logical Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosedLogicalFormulation(ClosedLogicalFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleBinding(RoleBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modal Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modal Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModalFormulation(ModalFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Necessity Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Necessity Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNecessityFormulation(NecessityFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obligation Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obligation Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObligationFormulation(ObligationFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permissibility Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permissibility Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermissibilityFormulation(PermissibilityFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Possibility Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Possibility Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePossibilityFormulation(PossibilityFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalOperation(LogicalOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalNegation(LogicalNegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Logical Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Logical Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryLogicalOperation(BinaryLogicalOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjunction(Conjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjunction(Disjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalence(Equivalence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveDisjunction(ExclusiveDisjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplication(Implication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nand Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nand Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNandFormulation(NandFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nor Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nor Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNorFormulation(NorFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whether Or Not Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whether Or Not Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhetherOrNotFormulation(WhetherOrNotFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universal Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universal Quantification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalQuantification(UniversalQuantification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At Least NQuantification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At Least NQuantification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtLeastNQuantification(AtLeastNQuantification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existential Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existential Quantification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistentialQuantification(ExistentialQuantification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Range Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Range Quantification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericRangeQuantification(NumericRangeQuantification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At Most NQuantification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At Most NQuantification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtMostNQuantification(AtMostNQuantification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At Most One Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At Most One Quantification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtMostOneQuantification(AtMostOneQuantification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exactly NQuantification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exactly NQuantification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExactlyNQuantification(ExactlyNQuantification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exactly One Quantification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exactly One Quantification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExactlyOneQuantification(ExactlyOneQuantification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projecting Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projecting Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectingFormulation(ProjectingFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationFormulation(AggregationFormulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Noun Concept Nominalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Noun Concept Nominalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNounConceptNominalization(NounConceptNominalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Nominalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Nominalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeNominalization(FactTypeNominalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Nominalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Nominalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionNominalization(QuestionNominalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer Nominalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer Nominalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswerNominalization(AnswerNominalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auxiliary Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auxiliary Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxiliaryVariable(AuxiliaryVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Projection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Projection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagProjection(BagProjection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Projection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Projection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetProjection(SetProjection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Formulation Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Formulation Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalFormulationKind(LogicalFormulationKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closed Projection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closed Projection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosedProjection(ClosedProjection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorization Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorization Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorizationScheme(CategorizationScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorizationType(CategorizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segmentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segmentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentation(Segmentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SBVRSwitch
