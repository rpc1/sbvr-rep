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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SBVR.SBVRFactory
 * @model kind="package"
 * @generated
 */
public interface SBVRPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SBVR";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sbvr/1.0.0/SBVR";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SBVR";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SBVRPackage eINSTANCE = SBVR.impl.SBVRPackageImpl.init();

	/**
	 * The meta object id for the '{@link SBVR.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ThingImpl
	 * @see SBVR.impl.SBVRPackageImpl#getThing()
	 * @generated
	 */
	int THING = 36;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.SetImpl
	 * @see SBVR.impl.SBVRPackageImpl#getSet()
	 * @generated
	 */
	int SET = 47;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__CARDINALITY = THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__ELEMENT = THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = THING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.BodyOfSharedMeaningsImpl <em>Body Of Shared Meanings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.BodyOfSharedMeaningsImpl
	 * @see SBVR.impl.SBVRPackageImpl#getBodyOfSharedMeanings()
	 * @generated
	 */
	int BODY_OF_SHARED_MEANINGS = 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OF_SHARED_MEANINGS__CARDINALITY = SET__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OF_SHARED_MEANINGS__ELEMENT = SET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OF_SHARED_MEANINGS__CONCEPT = SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OF_SHARED_MEANINGS__PROPOSITION = SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Body Of Shared Meanings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OF_SHARED_MEANINGS_FEATURE_COUNT = SET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.TerminologicalDictionaryImpl <em>Terminological Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.TerminologicalDictionaryImpl
	 * @see SBVR.impl.SBVRPackageImpl#getTerminologicalDictionary()
	 * @generated
	 */
	int TERMINOLOGICAL_DICTIONARY = 1;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGICAL_DICTIONARY__REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Vocabulary</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGICAL_DICTIONARY__VOCABULARY = 1;

	/**
	 * The feature id for the '<em><b>Body Of Shared Meaning</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGICAL_DICTIONARY__BODY_OF_SHARED_MEANING = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGICAL_DICTIONARY__URI = 3;

	/**
	 * The number of structural features of the '<em>Terminological Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGICAL_DICTIONARY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link SBVR.impl.VocabularyImpl <em>Vocabulary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.VocabularyImpl
	 * @see SBVR.impl.SBVRPackageImpl#getVocabulary()
	 * @generated
	 */
	int VOCABULARY = 2;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY__CARDINALITY = SET__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY__ELEMENT = SET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY__DESIGNATION = SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY__FACT_TYPE_FORM = SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body Of Shared Meaning</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY__BODY_OF_SHARED_MEANING = SET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY__NAMESPACE = SET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incorporated Vocabulary</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY__INCORPORATED_VOCABULARY = SET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vocabulary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_FEATURE_COUNT = SET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link SBVR.impl.StateOfAffairsImpl <em>State Of Affairs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.StateOfAffairsImpl
	 * @see SBVR.impl.SBVRPackageImpl#getStateOfAffairs()
	 * @generated
	 */
	int STATE_OF_AFFAIRS = 42;

	/**
	 * The number of structural features of the '<em>State Of Affairs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OF_AFFAIRS_FEATURE_COUNT = THING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ActualityImpl <em>Actuality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ActualityImpl
	 * @see SBVR.impl.SBVRPackageImpl#getActuality()
	 * @generated
	 */
	int ACTUALITY = 41;

	/**
	 * The number of structural features of the '<em>Actuality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALITY_FEATURE_COUNT = STATE_OF_AFFAIRS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.RepresentationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 40;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__MEANING = ACTUALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__EXPRESSION = ACTUALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = ACTUALITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.DesignationImpl <em>Designation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.DesignationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getDesignation()
	 * @generated
	 */
	int DESIGNATION = 46;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__MEANING = REPRESENTATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATION__EXPRESSION = REPRESENTATION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Designation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGNATION_FEATURE_COUNT = REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.QualifiedDesignationImpl <em>Qualified Designation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.QualifiedDesignationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getQualifiedDesignation()
	 * @generated
	 */
	int QUALIFIED_DESIGNATION = 4;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_DESIGNATION__MEANING = DESIGNATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_DESIGNATION__EXPRESSION = DESIGNATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Preferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_DESIGNATION__PREFERRED = DESIGNATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prohibited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_DESIGNATION__PROHIBITED = DESIGNATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qualified Designation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_DESIGNATION_FEATURE_COUNT = DESIGNATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.TermImpl
	 * @see SBVR.impl.SBVRPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 3;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__MEANING = QUALIFIED_DESIGNATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__EXPRESSION = QUALIFIED_DESIGNATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Preferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__PREFERRED = QUALIFIED_DESIGNATION__PREFERRED;

	/**
	 * The feature id for the '<em><b>Prohibited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__PROHIBITED = QUALIFIED_DESIGNATION__PROHIBITED;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = QUALIFIED_DESIGNATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NameImpl
	 * @see SBVR.impl.SBVRPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 5;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__MEANING = QUALIFIED_DESIGNATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__EXPRESSION = QUALIFIED_DESIGNATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Preferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__PREFERRED = QUALIFIED_DESIGNATION__PREFERRED;

	/**
	 * The feature id for the '<em><b>Prohibited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__PROHIBITED = QUALIFIED_DESIGNATION__PROHIBITED;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__REFERS_TO = QUALIFIED_DESIGNATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = QUALIFIED_DESIGNATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.FactSymbolImpl <em>Fact Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.FactSymbolImpl
	 * @see SBVR.impl.SBVRPackageImpl#getFactSymbol()
	 * @generated
	 */
	int FACT_SYMBOL = 6;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_SYMBOL__MEANING = QUALIFIED_DESIGNATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_SYMBOL__EXPRESSION = QUALIFIED_DESIGNATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Preferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_SYMBOL__PREFERRED = QUALIFIED_DESIGNATION__PREFERRED;

	/**
	 * The feature id for the '<em><b>Prohibited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_SYMBOL__PROHIBITED = QUALIFIED_DESIGNATION__PROHIBITED;

	/**
	 * The number of structural features of the '<em>Fact Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_SYMBOL_FEATURE_COUNT = QUALIFIED_DESIGNATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.RulebookImpl <em>Rulebook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.RulebookImpl
	 * @see SBVR.impl.SBVRPackageImpl#getRulebook()
	 * @generated
	 */
	int RULEBOOK = 7;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULEBOOK__CARDINALITY = SET__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULEBOOK__ELEMENT = SET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULEBOOK__REPRESENTATION = SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rulebook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULEBOOK_FEATURE_COUNT = SET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.BusinessVocabularyImpl <em>Business Vocabulary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.BusinessVocabularyImpl
	 * @see SBVR.impl.SBVRPackageImpl#getBusinessVocabulary()
	 * @generated
	 */
	int BUSINESS_VOCABULARY = 8;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VOCABULARY__CARDINALITY = VOCABULARY__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VOCABULARY__ELEMENT = VOCABULARY__ELEMENT;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VOCABULARY__DESIGNATION = VOCABULARY__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VOCABULARY__FACT_TYPE_FORM = VOCABULARY__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Body Of Shared Meaning</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VOCABULARY__BODY_OF_SHARED_MEANING = VOCABULARY__BODY_OF_SHARED_MEANING;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VOCABULARY__NAMESPACE = VOCABULARY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Incorporated Vocabulary</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VOCABULARY__INCORPORATED_VOCABULARY = VOCABULARY__INCORPORATED_VOCABULARY;

	/**
	 * The number of structural features of the '<em>Business Vocabulary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_VOCABULARY_FEATURE_COUNT = VOCABULARY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.SubjectFieldImpl <em>Subject Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.SubjectFieldImpl
	 * @see SBVR.impl.SBVRPackageImpl#getSubjectField()
	 * @generated
	 */
	int SUBJECT_FIELD = 9;

	/**
	 * The number of structural features of the '<em>Subject Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FIELD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.DescriptionImpl
	 * @see SBVR.impl.SBVRPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__MEANING = REPRESENTATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__EXPRESSION = REPRESENTATION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.DescriptiveExampleImpl <em>Descriptive Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.DescriptiveExampleImpl
	 * @see SBVR.impl.SBVRPackageImpl#getDescriptiveExample()
	 * @generated
	 */
	int DESCRIPTIVE_EXAMPLE = 11;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_EXAMPLE__MEANING = REPRESENTATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_EXAMPLE__EXPRESSION = REPRESENTATION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Descriptive Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_EXAMPLE_FEATURE_COUNT = REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NoteImpl
	 * @see SBVR.impl.SBVRPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 12;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__MEANING = REPRESENTATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__EXPRESSION = REPRESENTATION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ReferenceImpl
	 * @see SBVR.impl.SBVRPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MEANING = REPRESENTATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__EXPRESSION = REPRESENTATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Information Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__INFORMATION_SOURCE = REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.CommunicationContentImpl <em>Communication Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.CommunicationContentImpl
	 * @see SBVR.impl.SBVRPackageImpl#getCommunicationContent()
	 * @generated
	 */
	int COMMUNICATION_CONTENT = 14;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTENT__MEANING = REPRESENTATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTENT__EXPRESSION = REPRESENTATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTENT__REPRESENTATION = REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communication Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTENT_FEATURE_COUNT = REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.CommunityImpl <em>Community</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.CommunityImpl
	 * @see SBVR.impl.SBVRPackageImpl#getCommunity()
	 * @generated
	 */
	int COMMUNITY = 15;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNITY__URI = 0;

	/**
	 * The feature id for the '<em><b>Sub Community</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNITY__SUB_COMMUNITY = 1;

	/**
	 * The number of structural features of the '<em>Community</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.SemanticCommunityImpl <em>Semantic Community</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.SemanticCommunityImpl
	 * @see SBVR.impl.SBVRPackageImpl#getSemanticCommunity()
	 * @generated
	 */
	int SEMANTIC_COMMUNITY = 16;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_COMMUNITY__URI = COMMUNITY__URI;

	/**
	 * The feature id for the '<em><b>Sub Community</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_COMMUNITY__SUB_COMMUNITY = COMMUNITY__SUB_COMMUNITY;

	/**
	 * The feature id for the '<em><b>Speech Community</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_COMMUNITY__SPEECH_COMMUNITY = COMMUNITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Semantic Community</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_COMMUNITY_FEATURE_COUNT = COMMUNITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.SpeechCommunityImpl <em>Speech Community</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.SpeechCommunityImpl
	 * @see SBVR.impl.SBVRPackageImpl#getSpeechCommunity()
	 * @generated
	 */
	int SPEECH_COMMUNITY = 17;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_COMMUNITY__URI = COMMUNITY__URI;

	/**
	 * The feature id for the '<em><b>Sub Community</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_COMMUNITY__SUB_COMMUNITY = COMMUNITY__SUB_COMMUNITY;

	/**
	 * The feature id for the '<em><b>Owned Vocabulary</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_COMMUNITY__OWNED_VOCABULARY = COMMUNITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Used Vocabulary</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_COMMUNITY__USED_VOCABULARY = COMMUNITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Speech Community</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_COMMUNITY_FEATURE_COUNT = COMMUNITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.NonverbalDesignationImpl <em>Nonverbal Designation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NonverbalDesignationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getNonverbalDesignation()
	 * @generated
	 */
	int NONVERBAL_DESIGNATION = 18;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONVERBAL_DESIGNATION__MEANING = QUALIFIED_DESIGNATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONVERBAL_DESIGNATION__EXPRESSION = QUALIFIED_DESIGNATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Preferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONVERBAL_DESIGNATION__PREFERRED = QUALIFIED_DESIGNATION__PREFERRED;

	/**
	 * The feature id for the '<em><b>Prohibited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONVERBAL_DESIGNATION__PROHIBITED = QUALIFIED_DESIGNATION__PROHIBITED;

	/**
	 * The number of structural features of the '<em>Nonverbal Designation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONVERBAL_DESIGNATION_FEATURE_COUNT = QUALIFIED_DESIGNATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.IconImpl
	 * @see SBVR.impl.SBVRPackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 19;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__MEANING = NONVERBAL_DESIGNATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__EXPRESSION = NONVERBAL_DESIGNATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Preferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__PREFERRED = NONVERBAL_DESIGNATION__PREFERRED;

	/**
	 * The feature id for the '<em><b>Prohibited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__PROHIBITED = NONVERBAL_DESIGNATION__PROHIBITED;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = NONVERBAL_DESIGNATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.MeaningImpl <em>Meaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.MeaningImpl
	 * @see SBVR.impl.SBVRPackageImpl#getMeaning()
	 * @generated
	 */
	int MEANING = 39;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__REPRESENTATION = THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING_FEATURE_COUNT = THING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ConceptImpl
	 * @see SBVR.impl.SBVRPackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 38;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__REPRESENTATION = MEANING__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__DESIGNATION = MEANING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__DEFINITION = MEANING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__GENERAL = MEANING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__COEXTENSIVE = MEANING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__INSTANCE = MEANING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__EXTENSION = MEANING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__REFERENCE_SCHEME = MEANING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = MEANING_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link SBVR.impl.FactTypeImpl <em>Fact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.FactTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getFactType()
	 * @generated
	 */
	int FACT_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE__REPRESENTATION = CONCEPT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE__DESIGNATION = CONCEPT__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE__DEFINITION = CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE__GENERAL = CONCEPT__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE__COEXTENSIVE = CONCEPT__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE__INSTANCE = CONCEPT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE__EXTENSION = CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE__REFERENCE_SCHEME = CONCEPT__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE__FACT_TYPE_FORM = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE__ROLE = CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE__HAS = CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link SBVR.impl.BinaryFactTypeImpl <em>Binary Fact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.BinaryFactTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getBinaryFactType()
	 * @generated
	 */
	int BINARY_FACT_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FACT_TYPE__REPRESENTATION = FACT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FACT_TYPE__DESIGNATION = FACT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FACT_TYPE__DEFINITION = FACT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FACT_TYPE__GENERAL = FACT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FACT_TYPE__COEXTENSIVE = FACT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FACT_TYPE__INSTANCE = FACT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FACT_TYPE__EXTENSION = FACT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FACT_TYPE__REFERENCE_SCHEME = FACT_TYPE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FACT_TYPE__FACT_TYPE_FORM = FACT_TYPE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FACT_TYPE__ROLE = FACT_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FACT_TYPE__HAS = FACT_TYPE__HAS;

	/**
	 * The number of structural features of the '<em>Binary Fact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FACT_TYPE_FEATURE_COUNT = FACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.PartitiveFactTypeImpl <em>Partitive Fact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.PartitiveFactTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getPartitiveFactType()
	 * @generated
	 */
	int PARTITIVE_FACT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIVE_FACT_TYPE__REPRESENTATION = BINARY_FACT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIVE_FACT_TYPE__DESIGNATION = BINARY_FACT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIVE_FACT_TYPE__DEFINITION = BINARY_FACT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIVE_FACT_TYPE__GENERAL = BINARY_FACT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIVE_FACT_TYPE__COEXTENSIVE = BINARY_FACT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIVE_FACT_TYPE__INSTANCE = BINARY_FACT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIVE_FACT_TYPE__EXTENSION = BINARY_FACT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIVE_FACT_TYPE__REFERENCE_SCHEME = BINARY_FACT_TYPE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIVE_FACT_TYPE__FACT_TYPE_FORM = BINARY_FACT_TYPE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIVE_FACT_TYPE__ROLE = BINARY_FACT_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIVE_FACT_TYPE__HAS = BINARY_FACT_TYPE__HAS;

	/**
	 * The number of structural features of the '<em>Partitive Fact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIVE_FACT_TYPE_FEATURE_COUNT = BINARY_FACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.NounConceptImpl <em>Noun Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NounConceptImpl
	 * @see SBVR.impl.SBVRPackageImpl#getNounConcept()
	 * @generated
	 */
	int NOUN_CONCEPT = 51;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT__REPRESENTATION = CONCEPT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT__DESIGNATION = CONCEPT__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT__DEFINITION = CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT__GENERAL = CONCEPT__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT__COEXTENSIVE = CONCEPT__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT__INSTANCE = CONCEPT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT__EXTENSION = CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT__REFERENCE_SCHEME = CONCEPT__REFERENCE_SCHEME;

	/**
	 * The number of structural features of the '<em>Noun Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ObjectTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__REPRESENTATION = NOUN_CONCEPT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__DESIGNATION = NOUN_CONCEPT__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__DEFINITION = NOUN_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__GENERAL = NOUN_CONCEPT__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__COEXTENSIVE = NOUN_CONCEPT__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__INSTANCE = NOUN_CONCEPT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__EXTENSION = NOUN_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__REFERENCE_SCHEME = NOUN_CONCEPT__REFERENCE_SCHEME;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = NOUN_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.FundamentalConceptImpl <em>Fundamental Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.FundamentalConceptImpl
	 * @see SBVR.impl.SBVRPackageImpl#getFundamentalConcept()
	 * @generated
	 */
	int FUNDAMENTAL_CONCEPT = 21;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTAL_CONCEPT__REPRESENTATION = OBJECT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTAL_CONCEPT__DESIGNATION = OBJECT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTAL_CONCEPT__DEFINITION = OBJECT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTAL_CONCEPT__GENERAL = OBJECT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTAL_CONCEPT__COEXTENSIVE = OBJECT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTAL_CONCEPT__INSTANCE = OBJECT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTAL_CONCEPT__EXTENSION = OBJECT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTAL_CONCEPT__REFERENCE_SCHEME = OBJECT_TYPE__REFERENCE_SCHEME;

	/**
	 * The number of structural features of the '<em>Fundamental Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTAL_CONCEPT_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.RoleImpl
	 * @see SBVR.impl.SBVRPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 54;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REPRESENTATION = NOUN_CONCEPT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESIGNATION = NOUN_CONCEPT__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DEFINITION = NOUN_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__GENERAL = NOUN_CONCEPT__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__COEXTENSIVE = NOUN_CONCEPT__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INSTANCE = NOUN_CONCEPT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__EXTENSION = NOUN_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REFERENCE_SCHEME = NOUN_CONCEPT__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OBJECT_TYPE = NOUN_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = NOUN_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.SituationalRoleImpl <em>Situational Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.SituationalRoleImpl
	 * @see SBVR.impl.SBVRPackageImpl#getSituationalRole()
	 * @generated
	 */
	int SITUATIONAL_ROLE = 22;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATIONAL_ROLE__REPRESENTATION = ROLE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATIONAL_ROLE__DESIGNATION = ROLE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATIONAL_ROLE__DEFINITION = ROLE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATIONAL_ROLE__GENERAL = ROLE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATIONAL_ROLE__COEXTENSIVE = ROLE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATIONAL_ROLE__INSTANCE = ROLE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATIONAL_ROLE__EXTENSION = ROLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATIONAL_ROLE__REFERENCE_SCHEME = ROLE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATIONAL_ROLE__OBJECT_TYPE = ROLE__OBJECT_TYPE;

	/**
	 * The number of structural features of the '<em>Situational Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATIONAL_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.AssociativeFactTypeImpl <em>Associative Fact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.AssociativeFactTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getAssociativeFactType()
	 * @generated
	 */
	int ASSOCIATIVE_FACT_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_FACT_TYPE__REPRESENTATION = FACT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_FACT_TYPE__DESIGNATION = FACT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_FACT_TYPE__DEFINITION = FACT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_FACT_TYPE__GENERAL = FACT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_FACT_TYPE__COEXTENSIVE = FACT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_FACT_TYPE__INSTANCE = FACT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_FACT_TYPE__EXTENSION = FACT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_FACT_TYPE__REFERENCE_SCHEME = FACT_TYPE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_FACT_TYPE__FACT_TYPE_FORM = FACT_TYPE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_FACT_TYPE__ROLE = FACT_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_FACT_TYPE__HAS = FACT_TYPE__HAS;

	/**
	 * The number of structural features of the '<em>Associative Fact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_FACT_TYPE_FEATURE_COUNT = FACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.IsPropertyOfFactTypeImpl <em>Is Property Of Fact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.IsPropertyOfFactTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getIsPropertyOfFactType()
	 * @generated
	 */
	int IS_PROPERTY_OF_FACT_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OF_FACT_TYPE__REPRESENTATION = ASSOCIATIVE_FACT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OF_FACT_TYPE__DESIGNATION = ASSOCIATIVE_FACT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OF_FACT_TYPE__DEFINITION = ASSOCIATIVE_FACT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OF_FACT_TYPE__GENERAL = ASSOCIATIVE_FACT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OF_FACT_TYPE__COEXTENSIVE = ASSOCIATIVE_FACT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OF_FACT_TYPE__INSTANCE = ASSOCIATIVE_FACT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OF_FACT_TYPE__EXTENSION = ASSOCIATIVE_FACT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OF_FACT_TYPE__REFERENCE_SCHEME = ASSOCIATIVE_FACT_TYPE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OF_FACT_TYPE__FACT_TYPE_FORM = ASSOCIATIVE_FACT_TYPE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OF_FACT_TYPE__ROLE = ASSOCIATIVE_FACT_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OF_FACT_TYPE__HAS = ASSOCIATIVE_FACT_TYPE__HAS;

	/**
	 * The number of structural features of the '<em>Is Property Of Fact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OF_FACT_TYPE_FEATURE_COUNT = ASSOCIATIVE_FACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.AssortmentFactTypeImpl <em>Assortment Fact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.AssortmentFactTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getAssortmentFactType()
	 * @generated
	 */
	int ASSORTMENT_FACT_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSORTMENT_FACT_TYPE__REPRESENTATION = FACT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSORTMENT_FACT_TYPE__DESIGNATION = FACT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSORTMENT_FACT_TYPE__DEFINITION = FACT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSORTMENT_FACT_TYPE__GENERAL = FACT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSORTMENT_FACT_TYPE__COEXTENSIVE = FACT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSORTMENT_FACT_TYPE__INSTANCE = FACT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSORTMENT_FACT_TYPE__EXTENSION = FACT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSORTMENT_FACT_TYPE__REFERENCE_SCHEME = FACT_TYPE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSORTMENT_FACT_TYPE__FACT_TYPE_FORM = FACT_TYPE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSORTMENT_FACT_TYPE__ROLE = FACT_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSORTMENT_FACT_TYPE__HAS = FACT_TYPE__HAS;

	/**
	 * The number of structural features of the '<em>Assortment Fact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSORTMENT_FACT_TYPE_FEATURE_COUNT = FACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.SpecializationFactTypeImpl <em>Specialization Fact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.SpecializationFactTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getSpecializationFactType()
	 * @generated
	 */
	int SPECIALIZATION_FACT_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FACT_TYPE__REPRESENTATION = FACT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FACT_TYPE__DESIGNATION = FACT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FACT_TYPE__DEFINITION = FACT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FACT_TYPE__GENERAL = FACT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FACT_TYPE__COEXTENSIVE = FACT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FACT_TYPE__INSTANCE = FACT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FACT_TYPE__EXTENSION = FACT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FACT_TYPE__REFERENCE_SCHEME = FACT_TYPE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FACT_TYPE__FACT_TYPE_FORM = FACT_TYPE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FACT_TYPE__ROLE = FACT_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FACT_TYPE__HAS = FACT_TYPE__HAS;

	/**
	 * The number of structural features of the '<em>Specialization Fact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FACT_TYPE_FEATURE_COUNT = FACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.CategorizationFactTypeImpl <em>Categorization Fact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.CategorizationFactTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getCategorizationFactType()
	 * @generated
	 */
	int CATEGORIZATION_FACT_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FACT_TYPE__REPRESENTATION = SPECIALIZATION_FACT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FACT_TYPE__DESIGNATION = SPECIALIZATION_FACT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FACT_TYPE__DEFINITION = SPECIALIZATION_FACT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FACT_TYPE__GENERAL = SPECIALIZATION_FACT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FACT_TYPE__COEXTENSIVE = SPECIALIZATION_FACT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FACT_TYPE__INSTANCE = SPECIALIZATION_FACT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FACT_TYPE__EXTENSION = SPECIALIZATION_FACT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FACT_TYPE__REFERENCE_SCHEME = SPECIALIZATION_FACT_TYPE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FACT_TYPE__FACT_TYPE_FORM = SPECIALIZATION_FACT_TYPE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FACT_TYPE__ROLE = SPECIALIZATION_FACT_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FACT_TYPE__HAS = SPECIALIZATION_FACT_TYPE__HAS;

	/**
	 * The number of structural features of the '<em>Categorization Fact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FACT_TYPE_FEATURE_COUNT = SPECIALIZATION_FACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ContextualizationFactTypeImpl <em>Contextualization Fact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ContextualizationFactTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getContextualizationFactType()
	 * @generated
	 */
	int CONTEXTUALIZATION_FACT_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZATION_FACT_TYPE__REPRESENTATION = SPECIALIZATION_FACT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZATION_FACT_TYPE__DESIGNATION = SPECIALIZATION_FACT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZATION_FACT_TYPE__DEFINITION = SPECIALIZATION_FACT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZATION_FACT_TYPE__GENERAL = SPECIALIZATION_FACT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZATION_FACT_TYPE__COEXTENSIVE = SPECIALIZATION_FACT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZATION_FACT_TYPE__INSTANCE = SPECIALIZATION_FACT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZATION_FACT_TYPE__EXTENSION = SPECIALIZATION_FACT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZATION_FACT_TYPE__REFERENCE_SCHEME = SPECIALIZATION_FACT_TYPE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZATION_FACT_TYPE__FACT_TYPE_FORM = SPECIALIZATION_FACT_TYPE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZATION_FACT_TYPE__ROLE = SPECIALIZATION_FACT_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZATION_FACT_TYPE__HAS = SPECIALIZATION_FACT_TYPE__HAS;

	/**
	 * The number of structural features of the '<em>Contextualization Fact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZATION_FACT_TYPE_FEATURE_COUNT = SPECIALIZATION_FACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ContextualizedConceptImpl <em>Contextualized Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ContextualizedConceptImpl
	 * @see SBVR.impl.SBVRPackageImpl#getContextualizedConcept()
	 * @generated
	 */
	int CONTEXTUALIZED_CONCEPT = 29;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZED_CONCEPT__REPRESENTATION = NOUN_CONCEPT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZED_CONCEPT__DESIGNATION = NOUN_CONCEPT__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZED_CONCEPT__DEFINITION = NOUN_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZED_CONCEPT__GENERAL = NOUN_CONCEPT__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZED_CONCEPT__COEXTENSIVE = NOUN_CONCEPT__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZED_CONCEPT__INSTANCE = NOUN_CONCEPT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZED_CONCEPT__EXTENSION = NOUN_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZED_CONCEPT__REFERENCE_SCHEME = NOUN_CONCEPT__REFERENCE_SCHEME;

	/**
	 * The number of structural features of the '<em>Contextualized Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUALIZED_CONCEPT_FEATURE_COUNT = NOUN_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.FacetImpl <em>Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.FacetImpl
	 * @see SBVR.impl.SBVRPackageImpl#getFacet()
	 * @generated
	 */
	int FACET = 30;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__REPRESENTATION = CONTEXTUALIZED_CONCEPT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__DESIGNATION = CONTEXTUALIZED_CONCEPT__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__DEFINITION = CONTEXTUALIZED_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__GENERAL = CONTEXTUALIZED_CONCEPT__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__COEXTENSIVE = CONTEXTUALIZED_CONCEPT__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__INSTANCE = CONTEXTUALIZED_CONCEPT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__EXTENSION = CONTEXTUALIZED_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__REFERENCE_SCHEME = CONTEXTUALIZED_CONCEPT__REFERENCE_SCHEME;

	/**
	 * The number of structural features of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_FEATURE_COUNT = CONTEXTUALIZED_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.IsRoleOfFactTypeImpl <em>Is Role Of Fact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.IsRoleOfFactTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getIsRoleOfFactType()
	 * @generated
	 */
	int IS_ROLE_OF_FACT_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_OF_FACT_TYPE__REPRESENTATION = CONTEXTUALIZATION_FACT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_OF_FACT_TYPE__DESIGNATION = CONTEXTUALIZATION_FACT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_OF_FACT_TYPE__DEFINITION = CONTEXTUALIZATION_FACT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_OF_FACT_TYPE__GENERAL = CONTEXTUALIZATION_FACT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_OF_FACT_TYPE__COEXTENSIVE = CONTEXTUALIZATION_FACT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_OF_FACT_TYPE__INSTANCE = CONTEXTUALIZATION_FACT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_OF_FACT_TYPE__EXTENSION = CONTEXTUALIZATION_FACT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_OF_FACT_TYPE__REFERENCE_SCHEME = CONTEXTUALIZATION_FACT_TYPE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_OF_FACT_TYPE__FACT_TYPE_FORM = CONTEXTUALIZATION_FACT_TYPE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_OF_FACT_TYPE__ROLE = CONTEXTUALIZATION_FACT_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_OF_FACT_TYPE__HAS = CONTEXTUALIZATION_FACT_TYPE__HAS;

	/**
	 * The number of structural features of the '<em>Is Role Of Fact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ROLE_OF_FACT_TYPE_FEATURE_COUNT = CONTEXTUALIZATION_FACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.IsFacetOfFactTypeImpl <em>Is Facet Of Fact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.IsFacetOfFactTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getIsFacetOfFactType()
	 * @generated
	 */
	int IS_FACET_OF_FACT_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FACET_OF_FACT_TYPE__REPRESENTATION = CONTEXTUALIZATION_FACT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FACET_OF_FACT_TYPE__DESIGNATION = CONTEXTUALIZATION_FACT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FACET_OF_FACT_TYPE__DEFINITION = CONTEXTUALIZATION_FACT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FACET_OF_FACT_TYPE__GENERAL = CONTEXTUALIZATION_FACT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FACET_OF_FACT_TYPE__COEXTENSIVE = CONTEXTUALIZATION_FACT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FACET_OF_FACT_TYPE__INSTANCE = CONTEXTUALIZATION_FACT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FACET_OF_FACT_TYPE__EXTENSION = CONTEXTUALIZATION_FACT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FACET_OF_FACT_TYPE__REFERENCE_SCHEME = CONTEXTUALIZATION_FACT_TYPE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FACET_OF_FACT_TYPE__FACT_TYPE_FORM = CONTEXTUALIZATION_FACT_TYPE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FACET_OF_FACT_TYPE__ROLE = CONTEXTUALIZATION_FACT_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FACET_OF_FACT_TYPE__HAS = CONTEXTUALIZATION_FACT_TYPE__HAS;

	/**
	 * The number of structural features of the '<em>Is Facet Of Fact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FACET_OF_FACT_TYPE_FEATURE_COUNT = CONTEXTUALIZATION_FACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.PropositionImpl <em>Proposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.PropositionImpl
	 * @see SBVR.impl.SBVRPackageImpl#getProposition()
	 * @generated
	 */
	int PROPOSITION = 62;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__REPRESENTATION = MEANING__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__STATEMENT = MEANING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__IS_TRUE = MEANING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__IS_FALSE = MEANING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Necessarily True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__IS_NECESSARILY_TRUE = MEANING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Possibily True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__IS_POSSIBILY_TRUE = MEANING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Obligated To Be True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__IS_OBLIGATED_TO_BE_TRUE = MEANING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Permitted To Be True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__IS_PERMITTED_TO_BE_TRUE = MEANING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_FEATURE_COUNT = MEANING_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link SBVR.impl.ElementOfGuidanceImpl <em>Element Of Guidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ElementOfGuidanceImpl
	 * @see SBVR.impl.SBVRPackageImpl#getElementOfGuidance()
	 * @generated
	 */
	int ELEMENT_OF_GUIDANCE = 33;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OF_GUIDANCE__REPRESENTATION = PROPOSITION__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OF_GUIDANCE__STATEMENT = PROPOSITION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OF_GUIDANCE__IS_TRUE = PROPOSITION__IS_TRUE;

	/**
	 * The feature id for the '<em><b>Is False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OF_GUIDANCE__IS_FALSE = PROPOSITION__IS_FALSE;

	/**
	 * The feature id for the '<em><b>Is Necessarily True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OF_GUIDANCE__IS_NECESSARILY_TRUE = PROPOSITION__IS_NECESSARILY_TRUE;

	/**
	 * The feature id for the '<em><b>Is Possibily True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OF_GUIDANCE__IS_POSSIBILY_TRUE = PROPOSITION__IS_POSSIBILY_TRUE;

	/**
	 * The feature id for the '<em><b>Is Obligated To Be True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OF_GUIDANCE__IS_OBLIGATED_TO_BE_TRUE = PROPOSITION__IS_OBLIGATED_TO_BE_TRUE;

	/**
	 * The feature id for the '<em><b>Is Permitted To Be True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OF_GUIDANCE__IS_PERMITTED_TO_BE_TRUE = PROPOSITION__IS_PERMITTED_TO_BE_TRUE;

	/**
	 * The number of structural features of the '<em>Element Of Guidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OF_GUIDANCE_FEATURE_COUNT = PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.RuleImpl
	 * @see SBVR.impl.SBVRPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 34;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__REPRESENTATION = PROPOSITION__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__STATEMENT = PROPOSITION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_TRUE = PROPOSITION__IS_TRUE;

	/**
	 * The feature id for the '<em><b>Is False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_FALSE = PROPOSITION__IS_FALSE;

	/**
	 * The feature id for the '<em><b>Is Necessarily True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_NECESSARILY_TRUE = PROPOSITION__IS_NECESSARILY_TRUE;

	/**
	 * The feature id for the '<em><b>Is Possibily True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_POSSIBILY_TRUE = PROPOSITION__IS_POSSIBILY_TRUE;

	/**
	 * The feature id for the '<em><b>Is Obligated To Be True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_OBLIGATED_TO_BE_TRUE = PROPOSITION__IS_OBLIGATED_TO_BE_TRUE;

	/**
	 * The feature id for the '<em><b>Is Permitted To Be True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_PERMITTED_TO_BE_TRUE = PROPOSITION__IS_PERMITTED_TO_BE_TRUE;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.PackageImpl
	 * @see SBVR.impl.SBVRPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 35;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NESTED_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link SBVR.impl.ConceptualSchemaImpl <em>Conceptual Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ConceptualSchemaImpl
	 * @see SBVR.impl.SBVRPackageImpl#getConceptualSchema()
	 * @generated
	 */
	int CONCEPTUAL_SCHEMA = 37;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SCHEMA__CONCEPT = THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SCHEMA__FACT = THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conceptual Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SCHEMA_FEATURE_COUNT = THING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.BindableTargetImpl <em>Bindable Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.BindableTargetImpl
	 * @see SBVR.impl.SBVRPackageImpl#getBindableTarget()
	 * @generated
	 */
	int BINDABLE_TARGET = 44;

	/**
	 * The number of structural features of the '<em>Bindable Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDABLE_TARGET_FEATURE_COUNT = THING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ExpressionImpl
	 * @see SBVR.impl.SBVRPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 43;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = BINDABLE_TARGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.DefinitionImpl
	 * @see SBVR.impl.SBVRPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 45;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__MEANING = REPRESENTATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__EXPRESSION = REPRESENTATION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.QuantityImpl
	 * @see SBVR.impl.SBVRPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 50;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__REPRESENTATION = NOUN_CONCEPT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__DESIGNATION = NOUN_CONCEPT__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__DEFINITION = NOUN_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__GENERAL = NOUN_CONCEPT__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__COEXTENSIVE = NOUN_CONCEPT__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__INSTANCE = NOUN_CONCEPT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__EXTENSION = NOUN_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__REFERENCE_SCHEME = NOUN_CONCEPT__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Equal To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__EQUAL_TO = NOUN_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Less Than</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__LESS_THAN = NOUN_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Greater Than</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__GREATER_THAN = NOUN_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = NOUN_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link SBVR.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NumberImpl
	 * @see SBVR.impl.SBVRPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 49;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__REPRESENTATION = QUANTITY__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__DESIGNATION = QUANTITY__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__DEFINITION = QUANTITY__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__GENERAL = QUANTITY__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__COEXTENSIVE = QUANTITY__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__INSTANCE = QUANTITY__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__REFERENCE_SCHEME = QUANTITY__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Equal To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__EQUAL_TO = QUANTITY__EQUAL_TO;

	/**
	 * The feature id for the '<em><b>Less Than</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__LESS_THAN = QUANTITY__LESS_THAN;

	/**
	 * The feature id for the '<em><b>Greater Than</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__GREATER_THAN = QUANTITY__GREATER_THAN;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.IntegerImpl
	 * @see SBVR.impl.SBVRPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 48;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__REPRESENTATION = NUMBER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__DESIGNATION = NUMBER__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__DEFINITION = NUMBER__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__GENERAL = NUMBER__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__COEXTENSIVE = NUMBER__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__INSTANCE = NUMBER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__EXTENSION = NUMBER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__REFERENCE_SCHEME = NUMBER__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Equal To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__EQUAL_TO = NUMBER__EQUAL_TO;

	/**
	 * The feature id for the '<em><b>Less Than</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__LESS_THAN = NUMBER__LESS_THAN;

	/**
	 * The feature id for the '<em><b>Greater Than</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__GREATER_THAN = NUMBER__GREATER_THAN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.ReferenceSchemeImpl <em>Reference Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ReferenceSchemeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getReferenceScheme()
	 * @generated
	 */
	int REFERENCE_SCHEME = 52;

	/**
	 * The feature id for the '<em><b>Extensionally Used Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEME__EXTENSIONALLY_USED_ROLE = THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simply Used Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEME__SIMPLY_USED_ROLE = THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identifying Characteristic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEME__IDENTIFYING_CHARACTERISTIC = THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SCHEME_FEATURE_COUNT = THING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link SBVR.impl.FactTypeRoleImpl <em>Fact Type Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.FactTypeRoleImpl
	 * @see SBVR.impl.SBVRPackageImpl#getFactTypeRole()
	 * @generated
	 */
	int FACT_TYPE_ROLE = 53;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_ROLE__REPRESENTATION = ROLE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_ROLE__DESIGNATION = ROLE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_ROLE__DEFINITION = ROLE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_ROLE__GENERAL = ROLE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_ROLE__COEXTENSIVE = ROLE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_ROLE__INSTANCE = ROLE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_ROLE__EXTENSION = ROLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_ROLE__REFERENCE_SCHEME = ROLE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_ROLE__OBJECT_TYPE = ROLE__OBJECT_TYPE;

	/**
	 * The number of structural features of the '<em>Fact Type Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.CharacteristicImpl
	 * @see SBVR.impl.SBVRPackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 56;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__REPRESENTATION = FACT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__DESIGNATION = FACT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__DEFINITION = FACT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__GENERAL = FACT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__COEXTENSIVE = FACT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__INSTANCE = FACT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__EXTENSION = FACT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__REFERENCE_SCHEME = FACT_TYPE__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__FACT_TYPE_FORM = FACT_TYPE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__ROLE = FACT_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__HAS = FACT_TYPE__HAS;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FEATURE_COUNT = FACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.FactTypeFormImpl <em>Fact Type Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.FactTypeFormImpl
	 * @see SBVR.impl.SBVRPackageImpl#getFactTypeForm()
	 * @generated
	 */
	int FACT_TYPE_FORM = 58;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_FORM__MEANING = REPRESENTATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_FORM__EXPRESSION = REPRESENTATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_FORM__DESIGNATION = REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fact Type Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_FORM_FEATURE_COUNT = REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.PlaceholderImpl <em>Placeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.PlaceholderImpl
	 * @see SBVR.impl.SBVRPackageImpl#getPlaceholder()
	 * @generated
	 */
	int PLACEHOLDER = 59;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__MEANING = DESIGNATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__EXPRESSION = DESIGNATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__USES = DESIGNATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is At Starting Character Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER__IS_AT_STARTING_CHARACTER_POSITION = DESIGNATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Placeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_FEATURE_COUNT = DESIGNATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.FactImpl <em>Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.FactImpl
	 * @see SBVR.impl.SBVRPackageImpl#getFact()
	 * @generated
	 */
	int FACT = 61;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__REPRESENTATION = PROPOSITION__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__STATEMENT = PROPOSITION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__IS_TRUE = PROPOSITION__IS_TRUE;

	/**
	 * The feature id for the '<em><b>Is False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__IS_FALSE = PROPOSITION__IS_FALSE;

	/**
	 * The feature id for the '<em><b>Is Necessarily True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__IS_NECESSARILY_TRUE = PROPOSITION__IS_NECESSARILY_TRUE;

	/**
	 * The feature id for the '<em><b>Is Possibily True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__IS_POSSIBILY_TRUE = PROPOSITION__IS_POSSIBILY_TRUE;

	/**
	 * The feature id for the '<em><b>Is Obligated To Be True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__IS_OBLIGATED_TO_BE_TRUE = PROPOSITION__IS_OBLIGATED_TO_BE_TRUE;

	/**
	 * The feature id for the '<em><b>Is Permitted To Be True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__IS_PERMITTED_TO_BE_TRUE = PROPOSITION__IS_PERMITTED_TO_BE_TRUE;

	/**
	 * The number of structural features of the '<em>Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_FEATURE_COUNT = PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.StatementImpl
	 * @see SBVR.impl.SBVRPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 63;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__MEANING = REPRESENTATION__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__EXPRESSION = REPRESENTATION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.FactModelImpl <em>Fact Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.FactModelImpl
	 * @see SBVR.impl.SBVRPackageImpl#getFactModel()
	 * @generated
	 */
	int FACT_MODEL = 64;

	/**
	 * The feature id for the '<em><b>Conceptual Schema</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_MODEL__CONCEPTUAL_SCHEMA = THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_MODEL__FACT = THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fact Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_MODEL_FEATURE_COUNT = THING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.TextImpl
	 * @see SBVR.impl.SBVRPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 65;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.QuestionImpl
	 * @see SBVR.impl.SBVRPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 66;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REPRESENTATION = MEANING__REPRESENTATION;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = MEANING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NamespaceImpl
	 * @see SBVR.impl.SBVRPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 67;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__DESIGNATION = THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__FACT_TYPE_FORM = THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__URI = THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incorporated Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__INCORPORATED_NAMESPACE = THING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = THING_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link SBVR.impl.URIImpl <em>URI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.URIImpl
	 * @see SBVR.impl.SBVRPackageImpl#getURI()
	 * @generated
	 */
	int URI = 68;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__VALUE = TEXT__VALUE;

	/**
	 * The number of structural features of the '<em>URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.IndividualConceptImpl <em>Individual Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.IndividualConceptImpl
	 * @see SBVR.impl.SBVRPackageImpl#getIndividualConcept()
	 * @generated
	 */
	int INDIVIDUAL_CONCEPT = 69;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONCEPT__REPRESENTATION = NOUN_CONCEPT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONCEPT__DESIGNATION = NOUN_CONCEPT__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONCEPT__DEFINITION = NOUN_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONCEPT__GENERAL = NOUN_CONCEPT__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONCEPT__COEXTENSIVE = NOUN_CONCEPT__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONCEPT__INSTANCE = NOUN_CONCEPT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONCEPT__EXTENSION = NOUN_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONCEPT__REFERENCE_SCHEME = NOUN_CONCEPT__REFERENCE_SCHEME;

	/**
	 * The number of structural features of the '<em>Individual Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONCEPT_FEATURE_COUNT = NOUN_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ConceptTypeImpl <em>Concept Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ConceptTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getConceptType()
	 * @generated
	 */
	int CONCEPT_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE__REPRESENTATION = OBJECT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE__DESIGNATION = OBJECT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE__DEFINITION = OBJECT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE__GENERAL = OBJECT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE__COEXTENSIVE = OBJECT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE__INSTANCE = OBJECT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE__EXTENSION = OBJECT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE__REFERENCE_SCHEME = OBJECT_TYPE__REFERENCE_SCHEME;

	/**
	 * The number of structural features of the '<em>Concept Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.NonNegativeIntegerImpl <em>Non Negative Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NonNegativeIntegerImpl
	 * @see SBVR.impl.SBVRPackageImpl#getNonNegativeInteger()
	 * @generated
	 */
	int NON_NEGATIVE_INTEGER = 71;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__REPRESENTATION = INTEGER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__DESIGNATION = INTEGER__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__DEFINITION = INTEGER__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__GENERAL = INTEGER__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__COEXTENSIVE = INTEGER__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__INSTANCE = INTEGER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__EXTENSION = INTEGER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__REFERENCE_SCHEME = INTEGER__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Equal To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__EQUAL_TO = INTEGER__EQUAL_TO;

	/**
	 * The feature id for the '<em><b>Less Than</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__LESS_THAN = INTEGER__LESS_THAN;

	/**
	 * The feature id for the '<em><b>Greater Than</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__GREATER_THAN = INTEGER__GREATER_THAN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__VALUE = INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>Non Negative Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.PositiveIntegerImpl <em>Positive Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.PositiveIntegerImpl
	 * @see SBVR.impl.SBVRPackageImpl#getPositiveInteger()
	 * @generated
	 */
	int POSITIVE_INTEGER = 72;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER__REPRESENTATION = NON_NEGATIVE_INTEGER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER__DESIGNATION = NON_NEGATIVE_INTEGER__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER__DEFINITION = NON_NEGATIVE_INTEGER__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER__GENERAL = NON_NEGATIVE_INTEGER__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER__COEXTENSIVE = NON_NEGATIVE_INTEGER__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER__INSTANCE = NON_NEGATIVE_INTEGER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER__EXTENSION = NON_NEGATIVE_INTEGER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER__REFERENCE_SCHEME = NON_NEGATIVE_INTEGER__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Equal To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER__EQUAL_TO = NON_NEGATIVE_INTEGER__EQUAL_TO;

	/**
	 * The feature id for the '<em><b>Less Than</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER__LESS_THAN = NON_NEGATIVE_INTEGER__LESS_THAN;

	/**
	 * The feature id for the '<em><b>Greater Than</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER__GREATER_THAN = NON_NEGATIVE_INTEGER__GREATER_THAN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER__VALUE = NON_NEGATIVE_INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>Positive Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER_FEATURE_COUNT = NON_NEGATIVE_INTEGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.SententialFormImpl <em>Sentential Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.SententialFormImpl
	 * @see SBVR.impl.SBVRPackageImpl#getSententialForm()
	 * @generated
	 */
	int SENTENTIAL_FORM = 73;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENTIAL_FORM__MEANING = FACT_TYPE_FORM__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENTIAL_FORM__EXPRESSION = FACT_TYPE_FORM__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENTIAL_FORM__DESIGNATION = FACT_TYPE_FORM__DESIGNATION;

	/**
	 * The number of structural features of the '<em>Sentential Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENTIAL_FORM_FEATURE_COUNT = FACT_TYPE_FORM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.NounFormImpl <em>Noun Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NounFormImpl
	 * @see SBVR.impl.SBVRPackageImpl#getNounForm()
	 * @generated
	 */
	int NOUN_FORM = 74;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_FORM__MEANING = FACT_TYPE_FORM__MEANING;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_FORM__EXPRESSION = FACT_TYPE_FORM__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_FORM__DESIGNATION = FACT_TYPE_FORM__DESIGNATION;

	/**
	 * The number of structural features of the '<em>Noun Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_FORM_FEATURE_COUNT = FACT_TYPE_FORM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.LanguageImpl
	 * @see SBVR.impl.SBVRPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 75;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = THING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.VocabularyNamespaceImpl <em>Vocabulary Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.VocabularyNamespaceImpl
	 * @see SBVR.impl.SBVRPackageImpl#getVocabularyNamespace()
	 * @generated
	 */
	int VOCABULARY_NAMESPACE = 76;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_NAMESPACE__DESIGNATION = NAMESPACE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_NAMESPACE__FACT_TYPE_FORM = NAMESPACE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_NAMESPACE__URI = NAMESPACE__URI;

	/**
	 * The feature id for the '<em><b>Incorporated Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_NAMESPACE__INCORPORATED_NAMESPACE = NAMESPACE__INCORPORATED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_NAMESPACE__LANGUAGE = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributive Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_NAMESPACE__ATTRIBUTIVE_NAMESPACE = NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vocabulary Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_NAMESPACE_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.AttributiveNamespaceImpl <em>Attributive Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.AttributiveNamespaceImpl
	 * @see SBVR.impl.SBVRPackageImpl#getAttributiveNamespace()
	 * @generated
	 */
	int ATTRIBUTIVE_NAMESPACE = 77;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTIVE_NAMESPACE__DESIGNATION = NAMESPACE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Fact Type Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTIVE_NAMESPACE__FACT_TYPE_FORM = NAMESPACE__FACT_TYPE_FORM;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTIVE_NAMESPACE__URI = NAMESPACE__URI;

	/**
	 * The feature id for the '<em><b>Incorporated Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTIVE_NAMESPACE__INCORPORATED_NAMESPACE = NAMESPACE__INCORPORATED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Subject Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTIVE_NAMESPACE__SUBJECT_CONCEPT = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attributive Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTIVE_NAMESPACE_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.SemanticFormulationImpl <em>Semantic Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.SemanticFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getSemanticFormulation()
	 * @generated
	 */
	int SEMANTIC_FORMULATION = 78;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_FORMULATION__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Semantic Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_FORMULATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.ClosedSemanticFormulationImpl <em>Closed Semantic Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ClosedSemanticFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getClosedSemanticFormulation()
	 * @generated
	 */
	int CLOSED_SEMANTIC_FORMULATION = 79;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_SEMANTIC_FORMULATION__VARIABLE = SEMANTIC_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_SEMANTIC_FORMULATION__MEANING = SEMANTIC_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Closed Semantic Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_SEMANTIC_FORMULATION_FEATURE_COUNT = SEMANTIC_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.LogicalFormulationImpl <em>Logical Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.LogicalFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getLogicalFormulation()
	 * @generated
	 */
	int LOGICAL_FORMULATION = 80;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION__VARIABLE = SEMANTIC_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION__STATEMENT = SEMANTIC_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION__PROPOSITION = SEMANTIC_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION_FEATURE_COUNT = SEMANTIC_FORMULATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.ProjectionImpl <em>Projection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ProjectionImpl
	 * @see SBVR.impl.SBVRPackageImpl#getProjection()
	 * @generated
	 */
	int PROJECTION = 81;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION__VARIABLE = SEMANTIC_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Constraining Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION__CONSTRAINING_FORMULATION = SEMANTIC_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Projection Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION__PROJECTION_VARIABLE = SEMANTIC_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auxiliary Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION__AUXILIARY_VARIABLE = SEMANTIC_FORMULATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_FEATURE_COUNT = SEMANTIC_FORMULATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link SBVR.impl.AtomicFormulationImpl <em>Atomic Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.AtomicFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getAtomicFormulation()
	 * @generated
	 */
	int ATOMIC_FORMULATION = 82;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FORMULATION__VARIABLE = LOGICAL_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FORMULATION__STATEMENT = LOGICAL_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FORMULATION__PROPOSITION = LOGICAL_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Fact Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FORMULATION__FACT_TYPE = LOGICAL_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FORMULATION_FEATURE_COUNT = LOGICAL_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.InstantiationFormulationImpl <em>Instantiation Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.InstantiationFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getInstantiationFormulation()
	 * @generated
	 */
	int INSTANTIATION_FORMULATION = 83;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_FORMULATION__VARIABLE = LOGICAL_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_FORMULATION__STATEMENT = LOGICAL_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_FORMULATION__PROPOSITION = LOGICAL_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_FORMULATION__CONCEPT = LOGICAL_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindable Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_FORMULATION__BINDABLE_TARGET = LOGICAL_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instantiation Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_FORMULATION_FEATURE_COUNT = LOGICAL_FORMULATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.QuantificationImpl <em>Quantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.QuantificationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getQuantification()
	 * @generated
	 */
	int QUANTIFICATION = 84;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__VARIABLE = LOGICAL_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__STATEMENT = LOGICAL_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__PROPOSITION = LOGICAL_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Scope Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__SCOPE_FORMULATION = LOGICAL_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION_FEATURE_COUNT = LOGICAL_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.ObjectificationImpl <em>Objectification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ObjectificationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getObjectification()
	 * @generated
	 */
	int OBJECTIFICATION = 85;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFICATION__VARIABLE = LOGICAL_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFICATION__STATEMENT = LOGICAL_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFICATION__PROPOSITION = LOGICAL_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFICATION__LOGICAL_FORMULATION = LOGICAL_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindable Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFICATION__BINDABLE_TARGET = LOGICAL_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Objectification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFICATION_FEATURE_COUNT = LOGICAL_FORMULATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.PropositionNominalizationImpl <em>Proposition Nominalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.PropositionNominalizationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getPropositionNominalization()
	 * @generated
	 */
	int PROPOSITION_NOMINALIZATION = 86;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_NOMINALIZATION__VARIABLE = LOGICAL_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_NOMINALIZATION__STATEMENT = LOGICAL_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_NOMINALIZATION__PROPOSITION = LOGICAL_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_NOMINALIZATION__LOGICAL_FORMULATION = LOGICAL_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindable Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_NOMINALIZATION__BINDABLE_TARGET = LOGICAL_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Proposition Nominalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_NOMINALIZATION_FEATURE_COUNT = LOGICAL_FORMULATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.ClosedLogicalFormulationImpl <em>Closed Logical Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ClosedLogicalFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getClosedLogicalFormulation()
	 * @generated
	 */
	int CLOSED_LOGICAL_FORMULATION = 87;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_LOGICAL_FORMULATION__VARIABLE = CLOSED_SEMANTIC_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_LOGICAL_FORMULATION__MEANING = CLOSED_SEMANTIC_FORMULATION__MEANING;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_LOGICAL_FORMULATION__STATEMENT = CLOSED_SEMANTIC_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_LOGICAL_FORMULATION__PROPOSITION = CLOSED_SEMANTIC_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Closed Logical Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_LOGICAL_FORMULATION_FEATURE_COUNT = CLOSED_SEMANTIC_FORMULATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.VariableImpl
	 * @see SBVR.impl.SBVRPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 88;

	/**
	 * The feature id for the '<em><b>Restricting Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__RESTRICTING_FORMULATION = BINDABLE_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Unitary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IS_UNITARY = BINDABLE_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__QUANTIFICATION = BINDABLE_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ranged Over Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__RANGED_OVER_CONCEPT = BINDABLE_TARGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fact Type Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FACT_TYPE_ROLE = BINDABLE_TARGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Projection Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PROJECTION_POSITION = BINDABLE_TARGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = BINDABLE_TARGET_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link SBVR.impl.RoleBindingImpl <em>Role Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.RoleBindingImpl
	 * @see SBVR.impl.SBVRPackageImpl#getRoleBinding()
	 * @generated
	 */
	int ROLE_BINDING = 89;

	/**
	 * The feature id for the '<em><b>Atomic Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING__ATOMIC_FORMULATION = 0;

	/**
	 * The feature id for the '<em><b>Bindable Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING__BINDABLE_TARGET = 1;

	/**
	 * The feature id for the '<em><b>Fact Type Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING__FACT_TYPE_ROLE = 2;

	/**
	 * The number of structural features of the '<em>Role Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link SBVR.impl.ModalFormulationImpl <em>Modal Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ModalFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getModalFormulation()
	 * @generated
	 */
	int MODAL_FORMULATION = 90;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FORMULATION__VARIABLE = LOGICAL_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FORMULATION__STATEMENT = LOGICAL_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FORMULATION__PROPOSITION = LOGICAL_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FORMULATION__LOGICAL_FORMULATION = LOGICAL_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modal Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FORMULATION_FEATURE_COUNT = LOGICAL_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.NecessityFormulationImpl <em>Necessity Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NecessityFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getNecessityFormulation()
	 * @generated
	 */
	int NECESSITY_FORMULATION = 91;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSITY_FORMULATION__VARIABLE = MODAL_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSITY_FORMULATION__STATEMENT = MODAL_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSITY_FORMULATION__PROPOSITION = MODAL_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSITY_FORMULATION__LOGICAL_FORMULATION = MODAL_FORMULATION__LOGICAL_FORMULATION;

	/**
	 * The number of structural features of the '<em>Necessity Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSITY_FORMULATION_FEATURE_COUNT = MODAL_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ObligationFormulationImpl <em>Obligation Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ObligationFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getObligationFormulation()
	 * @generated
	 */
	int OBLIGATION_FORMULATION = 92;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_FORMULATION__VARIABLE = MODAL_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_FORMULATION__STATEMENT = MODAL_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_FORMULATION__PROPOSITION = MODAL_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_FORMULATION__LOGICAL_FORMULATION = MODAL_FORMULATION__LOGICAL_FORMULATION;

	/**
	 * The number of structural features of the '<em>Obligation Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_FORMULATION_FEATURE_COUNT = MODAL_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.PermissibilityFormulationImpl <em>Permissibility Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.PermissibilityFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getPermissibilityFormulation()
	 * @generated
	 */
	int PERMISSIBILITY_FORMULATION = 93;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBILITY_FORMULATION__VARIABLE = MODAL_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBILITY_FORMULATION__STATEMENT = MODAL_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBILITY_FORMULATION__PROPOSITION = MODAL_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBILITY_FORMULATION__LOGICAL_FORMULATION = MODAL_FORMULATION__LOGICAL_FORMULATION;

	/**
	 * The number of structural features of the '<em>Permissibility Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBILITY_FORMULATION_FEATURE_COUNT = MODAL_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.PossibilityFormulationImpl <em>Possibility Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.PossibilityFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getPossibilityFormulation()
	 * @generated
	 */
	int POSSIBILITY_FORMULATION = 94;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBILITY_FORMULATION__VARIABLE = MODAL_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBILITY_FORMULATION__STATEMENT = MODAL_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBILITY_FORMULATION__PROPOSITION = MODAL_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBILITY_FORMULATION__LOGICAL_FORMULATION = MODAL_FORMULATION__LOGICAL_FORMULATION;

	/**
	 * The number of structural features of the '<em>Possibility Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBILITY_FORMULATION_FEATURE_COUNT = MODAL_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.LogicalOperationImpl <em>Logical Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.LogicalOperationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getLogicalOperation()
	 * @generated
	 */
	int LOGICAL_OPERATION = 95;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATION__VARIABLE = LOGICAL_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATION__STATEMENT = LOGICAL_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATION__PROPOSITION = LOGICAL_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATION__LOGICAL_OPERAND = LOGICAL_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATION_FEATURE_COUNT = LOGICAL_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.LogicalNegationImpl <em>Logical Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.LogicalNegationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getLogicalNegation()
	 * @generated
	 */
	int LOGICAL_NEGATION = 96;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_NEGATION__VARIABLE = LOGICAL_OPERATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_NEGATION__STATEMENT = LOGICAL_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_NEGATION__PROPOSITION = LOGICAL_OPERATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_NEGATION__LOGICAL_OPERAND = LOGICAL_OPERATION__LOGICAL_OPERAND;

	/**
	 * The number of structural features of the '<em>Logical Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_NEGATION_FEATURE_COUNT = LOGICAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.BinaryLogicalOperationImpl <em>Binary Logical Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.BinaryLogicalOperationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getBinaryLogicalOperation()
	 * @generated
	 */
	int BINARY_LOGICAL_OPERATION = 97;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_OPERATION__VARIABLE = LOGICAL_OPERATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_OPERATION__STATEMENT = LOGICAL_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_OPERATION__PROPOSITION = LOGICAL_OPERATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND = LOGICAL_OPERATION__LOGICAL_OPERAND;

	/**
	 * The feature id for the '<em><b>Logical Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1 = LOGICAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2 = LOGICAL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Logical Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_OPERATION_FEATURE_COUNT = LOGICAL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.ConjunctionImpl <em>Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ConjunctionImpl
	 * @see SBVR.impl.SBVRPackageImpl#getConjunction()
	 * @generated
	 */
	int CONJUNCTION = 98;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__VARIABLE = BINARY_LOGICAL_OPERATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__STATEMENT = BINARY_LOGICAL_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__PROPOSITION = BINARY_LOGICAL_OPERATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__LOGICAL_OPERAND = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND;

	/**
	 * The feature id for the '<em><b>Logical Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__LOGICAL_OPERAND1 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1;

	/**
	 * The feature id for the '<em><b>Logical Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__LOGICAL_OPERAND2 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2;

	/**
	 * The number of structural features of the '<em>Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_FEATURE_COUNT = BINARY_LOGICAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.DisjunctionImpl <em>Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.DisjunctionImpl
	 * @see SBVR.impl.SBVRPackageImpl#getDisjunction()
	 * @generated
	 */
	int DISJUNCTION = 99;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__VARIABLE = BINARY_LOGICAL_OPERATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__STATEMENT = BINARY_LOGICAL_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__PROPOSITION = BINARY_LOGICAL_OPERATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__LOGICAL_OPERAND = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND;

	/**
	 * The feature id for the '<em><b>Logical Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__LOGICAL_OPERAND1 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1;

	/**
	 * The feature id for the '<em><b>Logical Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__LOGICAL_OPERAND2 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2;

	/**
	 * The number of structural features of the '<em>Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_FEATURE_COUNT = BINARY_LOGICAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.EquivalenceImpl <em>Equivalence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.EquivalenceImpl
	 * @see SBVR.impl.SBVRPackageImpl#getEquivalence()
	 * @generated
	 */
	int EQUIVALENCE = 100;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE__VARIABLE = BINARY_LOGICAL_OPERATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE__STATEMENT = BINARY_LOGICAL_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE__PROPOSITION = BINARY_LOGICAL_OPERATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE__LOGICAL_OPERAND = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND;

	/**
	 * The feature id for the '<em><b>Logical Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE__LOGICAL_OPERAND1 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1;

	/**
	 * The feature id for the '<em><b>Logical Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE__LOGICAL_OPERAND2 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2;

	/**
	 * The number of structural features of the '<em>Equivalence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_FEATURE_COUNT = BINARY_LOGICAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ExclusiveDisjunctionImpl <em>Exclusive Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ExclusiveDisjunctionImpl
	 * @see SBVR.impl.SBVRPackageImpl#getExclusiveDisjunction()
	 * @generated
	 */
	int EXCLUSIVE_DISJUNCTION = 101;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_DISJUNCTION__VARIABLE = BINARY_LOGICAL_OPERATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_DISJUNCTION__STATEMENT = BINARY_LOGICAL_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_DISJUNCTION__PROPOSITION = BINARY_LOGICAL_OPERATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_DISJUNCTION__LOGICAL_OPERAND = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND;

	/**
	 * The feature id for the '<em><b>Logical Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_DISJUNCTION__LOGICAL_OPERAND1 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1;

	/**
	 * The feature id for the '<em><b>Logical Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_DISJUNCTION__LOGICAL_OPERAND2 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2;

	/**
	 * The number of structural features of the '<em>Exclusive Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_DISJUNCTION_FEATURE_COUNT = BINARY_LOGICAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ImplicationImpl <em>Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ImplicationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getImplication()
	 * @generated
	 */
	int IMPLICATION = 102;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__VARIABLE = BINARY_LOGICAL_OPERATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__STATEMENT = BINARY_LOGICAL_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__PROPOSITION = BINARY_LOGICAL_OPERATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__LOGICAL_OPERAND = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND;

	/**
	 * The feature id for the '<em><b>Logical Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__LOGICAL_OPERAND1 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1;

	/**
	 * The feature id for the '<em><b>Logical Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__LOGICAL_OPERAND2 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__ANTECEDENT = BINARY_LOGICAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consequent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__CONSEQUENT = BINARY_LOGICAL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FEATURE_COUNT = BINARY_LOGICAL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.NandFormulationImpl <em>Nand Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NandFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getNandFormulation()
	 * @generated
	 */
	int NAND_FORMULATION = 103;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_FORMULATION__VARIABLE = BINARY_LOGICAL_OPERATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_FORMULATION__STATEMENT = BINARY_LOGICAL_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_FORMULATION__PROPOSITION = BINARY_LOGICAL_OPERATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_FORMULATION__LOGICAL_OPERAND = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND;

	/**
	 * The feature id for the '<em><b>Logical Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_FORMULATION__LOGICAL_OPERAND1 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1;

	/**
	 * The feature id for the '<em><b>Logical Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_FORMULATION__LOGICAL_OPERAND2 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2;

	/**
	 * The number of structural features of the '<em>Nand Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_FORMULATION_FEATURE_COUNT = BINARY_LOGICAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.NorFormulationImpl <em>Nor Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NorFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getNorFormulation()
	 * @generated
	 */
	int NOR_FORMULATION = 104;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR_FORMULATION__VARIABLE = BINARY_LOGICAL_OPERATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR_FORMULATION__STATEMENT = BINARY_LOGICAL_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR_FORMULATION__PROPOSITION = BINARY_LOGICAL_OPERATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR_FORMULATION__LOGICAL_OPERAND = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND;

	/**
	 * The feature id for the '<em><b>Logical Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR_FORMULATION__LOGICAL_OPERAND1 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1;

	/**
	 * The feature id for the '<em><b>Logical Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR_FORMULATION__LOGICAL_OPERAND2 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2;

	/**
	 * The number of structural features of the '<em>Nor Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOR_FORMULATION_FEATURE_COUNT = BINARY_LOGICAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.WhetherOrNotFormulationImpl <em>Whether Or Not Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.WhetherOrNotFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getWhetherOrNotFormulation()
	 * @generated
	 */
	int WHETHER_OR_NOT_FORMULATION = 105;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHETHER_OR_NOT_FORMULATION__VARIABLE = BINARY_LOGICAL_OPERATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHETHER_OR_NOT_FORMULATION__STATEMENT = BINARY_LOGICAL_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHETHER_OR_NOT_FORMULATION__PROPOSITION = BINARY_LOGICAL_OPERATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Logical Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHETHER_OR_NOT_FORMULATION__LOGICAL_OPERAND = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND;

	/**
	 * The feature id for the '<em><b>Logical Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHETHER_OR_NOT_FORMULATION__LOGICAL_OPERAND1 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1;

	/**
	 * The feature id for the '<em><b>Logical Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHETHER_OR_NOT_FORMULATION__LOGICAL_OPERAND2 = BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2;

	/**
	 * The feature id for the '<em><b>Consequent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHETHER_OR_NOT_FORMULATION__CONSEQUENT = BINARY_LOGICAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inconsequent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHETHER_OR_NOT_FORMULATION__INCONSEQUENT = BINARY_LOGICAL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Whether Or Not Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHETHER_OR_NOT_FORMULATION_FEATURE_COUNT = BINARY_LOGICAL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.UniversalQuantificationImpl <em>Universal Quantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.UniversalQuantificationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getUniversalQuantification()
	 * @generated
	 */
	int UNIVERSAL_QUANTIFICATION = 106;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANTIFICATION__VARIABLE = QUANTIFICATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANTIFICATION__STATEMENT = QUANTIFICATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANTIFICATION__PROPOSITION = QUANTIFICATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Scope Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANTIFICATION__SCOPE_FORMULATION = QUANTIFICATION__SCOPE_FORMULATION;

	/**
	 * The number of structural features of the '<em>Universal Quantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_QUANTIFICATION_FEATURE_COUNT = QUANTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.AtLeastNQuantificationImpl <em>At Least NQuantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.AtLeastNQuantificationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getAtLeastNQuantification()
	 * @generated
	 */
	int AT_LEAST_NQUANTIFICATION = 107;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_NQUANTIFICATION__VARIABLE = QUANTIFICATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_NQUANTIFICATION__STATEMENT = QUANTIFICATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_NQUANTIFICATION__PROPOSITION = QUANTIFICATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Scope Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_NQUANTIFICATION__SCOPE_FORMULATION = QUANTIFICATION__SCOPE_FORMULATION;

	/**
	 * The feature id for the '<em><b>Minimum Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_NQUANTIFICATION__MINIMUM_CARDINALITY = QUANTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>At Least NQuantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LEAST_NQUANTIFICATION_FEATURE_COUNT = QUANTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.ExistentialQuantificationImpl <em>Existential Quantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ExistentialQuantificationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getExistentialQuantification()
	 * @generated
	 */
	int EXISTENTIAL_QUANTIFICATION = 108;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_QUANTIFICATION__VARIABLE = AT_LEAST_NQUANTIFICATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_QUANTIFICATION__STATEMENT = AT_LEAST_NQUANTIFICATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_QUANTIFICATION__PROPOSITION = AT_LEAST_NQUANTIFICATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Scope Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_QUANTIFICATION__SCOPE_FORMULATION = AT_LEAST_NQUANTIFICATION__SCOPE_FORMULATION;

	/**
	 * The feature id for the '<em><b>Minimum Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_QUANTIFICATION__MINIMUM_CARDINALITY = AT_LEAST_NQUANTIFICATION__MINIMUM_CARDINALITY;

	/**
	 * The number of structural features of the '<em>Existential Quantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_QUANTIFICATION_FEATURE_COUNT = AT_LEAST_NQUANTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.NumericRangeQuantificationImpl <em>Numeric Range Quantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NumericRangeQuantificationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getNumericRangeQuantification()
	 * @generated
	 */
	int NUMERIC_RANGE_QUANTIFICATION = 109;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_RANGE_QUANTIFICATION__VARIABLE = QUANTIFICATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_RANGE_QUANTIFICATION__STATEMENT = QUANTIFICATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_RANGE_QUANTIFICATION__PROPOSITION = QUANTIFICATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Scope Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_RANGE_QUANTIFICATION__SCOPE_FORMULATION = QUANTIFICATION__SCOPE_FORMULATION;

	/**
	 * The feature id for the '<em><b>Minimum Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_RANGE_QUANTIFICATION__MINIMUM_CARDINALITY = QUANTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_RANGE_QUANTIFICATION__MAXIMUM_CARDINALITY = QUANTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Numeric Range Quantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_RANGE_QUANTIFICATION_FEATURE_COUNT = QUANTIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.AtMostNQuantificationImpl <em>At Most NQuantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.AtMostNQuantificationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getAtMostNQuantification()
	 * @generated
	 */
	int AT_MOST_NQUANTIFICATION = 110;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_NQUANTIFICATION__VARIABLE = QUANTIFICATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_NQUANTIFICATION__STATEMENT = QUANTIFICATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_NQUANTIFICATION__PROPOSITION = QUANTIFICATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Scope Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_NQUANTIFICATION__SCOPE_FORMULATION = QUANTIFICATION__SCOPE_FORMULATION;

	/**
	 * The feature id for the '<em><b>Maximum Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_NQUANTIFICATION__MAXIMUM_CARDINALITY = QUANTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>At Most NQuantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_NQUANTIFICATION_FEATURE_COUNT = QUANTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.AtMostOneQuantificationImpl <em>At Most One Quantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.AtMostOneQuantificationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getAtMostOneQuantification()
	 * @generated
	 */
	int AT_MOST_ONE_QUANTIFICATION = 111;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_ONE_QUANTIFICATION__VARIABLE = AT_MOST_NQUANTIFICATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_ONE_QUANTIFICATION__STATEMENT = AT_MOST_NQUANTIFICATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_ONE_QUANTIFICATION__PROPOSITION = AT_MOST_NQUANTIFICATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Scope Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_ONE_QUANTIFICATION__SCOPE_FORMULATION = AT_MOST_NQUANTIFICATION__SCOPE_FORMULATION;

	/**
	 * The feature id for the '<em><b>Maximum Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_ONE_QUANTIFICATION__MAXIMUM_CARDINALITY = AT_MOST_NQUANTIFICATION__MAXIMUM_CARDINALITY;

	/**
	 * The number of structural features of the '<em>At Most One Quantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_MOST_ONE_QUANTIFICATION_FEATURE_COUNT = AT_MOST_NQUANTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ExactlyNQuantificationImpl <em>Exactly NQuantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ExactlyNQuantificationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getExactlyNQuantification()
	 * @generated
	 */
	int EXACTLY_NQUANTIFICATION = 112;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_NQUANTIFICATION__VARIABLE = QUANTIFICATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_NQUANTIFICATION__STATEMENT = QUANTIFICATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_NQUANTIFICATION__PROPOSITION = QUANTIFICATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Scope Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_NQUANTIFICATION__SCOPE_FORMULATION = QUANTIFICATION__SCOPE_FORMULATION;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_NQUANTIFICATION__CARDINALITY = QUANTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exactly NQuantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_NQUANTIFICATION_FEATURE_COUNT = QUANTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.ExactlyOneQuantificationImpl <em>Exactly One Quantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ExactlyOneQuantificationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getExactlyOneQuantification()
	 * @generated
	 */
	int EXACTLY_ONE_QUANTIFICATION = 113;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_ONE_QUANTIFICATION__VARIABLE = EXACTLY_NQUANTIFICATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_ONE_QUANTIFICATION__STATEMENT = EXACTLY_NQUANTIFICATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_ONE_QUANTIFICATION__PROPOSITION = EXACTLY_NQUANTIFICATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Scope Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_ONE_QUANTIFICATION__SCOPE_FORMULATION = EXACTLY_NQUANTIFICATION__SCOPE_FORMULATION;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_ONE_QUANTIFICATION__CARDINALITY = EXACTLY_NQUANTIFICATION__CARDINALITY;

	/**
	 * The number of structural features of the '<em>Exactly One Quantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTLY_ONE_QUANTIFICATION_FEATURE_COUNT = EXACTLY_NQUANTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ProjectingFormulationImpl <em>Projecting Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ProjectingFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getProjectingFormulation()
	 * @generated
	 */
	int PROJECTING_FORMULATION = 114;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTING_FORMULATION__VARIABLE = LOGICAL_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTING_FORMULATION__STATEMENT = LOGICAL_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTING_FORMULATION__PROPOSITION = LOGICAL_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTING_FORMULATION__PROJECTION = LOGICAL_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindable Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTING_FORMULATION__BINDABLE_TARGET = LOGICAL_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Projecting Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTING_FORMULATION_FEATURE_COUNT = LOGICAL_FORMULATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SBVR.impl.AggregationFormulationImpl <em>Aggregation Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.AggregationFormulationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getAggregationFormulation()
	 * @generated
	 */
	int AGGREGATION_FORMULATION = 115;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FORMULATION__VARIABLE = PROJECTING_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FORMULATION__STATEMENT = PROJECTING_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FORMULATION__PROPOSITION = PROJECTING_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FORMULATION__PROJECTION = PROJECTING_FORMULATION__PROJECTION;

	/**
	 * The feature id for the '<em><b>Bindable Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FORMULATION__BINDABLE_TARGET = PROJECTING_FORMULATION__BINDABLE_TARGET;

	/**
	 * The number of structural features of the '<em>Aggregation Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FORMULATION_FEATURE_COUNT = PROJECTING_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.NounConceptNominalizationImpl <em>Noun Concept Nominalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.NounConceptNominalizationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getNounConceptNominalization()
	 * @generated
	 */
	int NOUN_CONCEPT_NOMINALIZATION = 116;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT_NOMINALIZATION__VARIABLE = PROJECTING_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT_NOMINALIZATION__STATEMENT = PROJECTING_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT_NOMINALIZATION__PROPOSITION = PROJECTING_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT_NOMINALIZATION__PROJECTION = PROJECTING_FORMULATION__PROJECTION;

	/**
	 * The feature id for the '<em><b>Bindable Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT_NOMINALIZATION__BINDABLE_TARGET = PROJECTING_FORMULATION__BINDABLE_TARGET;

	/**
	 * The number of structural features of the '<em>Noun Concept Nominalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_CONCEPT_NOMINALIZATION_FEATURE_COUNT = PROJECTING_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.FactTypeNominalizationImpl <em>Fact Type Nominalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.FactTypeNominalizationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getFactTypeNominalization()
	 * @generated
	 */
	int FACT_TYPE_NOMINALIZATION = 117;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_NOMINALIZATION__VARIABLE = PROJECTING_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_NOMINALIZATION__STATEMENT = PROJECTING_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_NOMINALIZATION__PROPOSITION = PROJECTING_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_NOMINALIZATION__PROJECTION = PROJECTING_FORMULATION__PROJECTION;

	/**
	 * The feature id for the '<em><b>Bindable Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_NOMINALIZATION__BINDABLE_TARGET = PROJECTING_FORMULATION__BINDABLE_TARGET;

	/**
	 * The number of structural features of the '<em>Fact Type Nominalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_NOMINALIZATION_FEATURE_COUNT = PROJECTING_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.QuestionNominalizationImpl <em>Question Nominalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.QuestionNominalizationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getQuestionNominalization()
	 * @generated
	 */
	int QUESTION_NOMINALIZATION = 118;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_NOMINALIZATION__VARIABLE = PROJECTING_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_NOMINALIZATION__STATEMENT = PROJECTING_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_NOMINALIZATION__PROPOSITION = PROJECTING_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_NOMINALIZATION__PROJECTION = PROJECTING_FORMULATION__PROJECTION;

	/**
	 * The feature id for the '<em><b>Bindable Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_NOMINALIZATION__BINDABLE_TARGET = PROJECTING_FORMULATION__BINDABLE_TARGET;

	/**
	 * The number of structural features of the '<em>Question Nominalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_NOMINALIZATION_FEATURE_COUNT = PROJECTING_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.AnswerNominalizationImpl <em>Answer Nominalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.AnswerNominalizationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getAnswerNominalization()
	 * @generated
	 */
	int ANSWER_NOMINALIZATION = 119;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_NOMINALIZATION__VARIABLE = PROJECTING_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_NOMINALIZATION__STATEMENT = PROJECTING_FORMULATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_NOMINALIZATION__PROPOSITION = PROJECTING_FORMULATION__PROPOSITION;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_NOMINALIZATION__PROJECTION = PROJECTING_FORMULATION__PROJECTION;

	/**
	 * The feature id for the '<em><b>Bindable Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_NOMINALIZATION__BINDABLE_TARGET = PROJECTING_FORMULATION__BINDABLE_TARGET;

	/**
	 * The number of structural features of the '<em>Answer Nominalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_NOMINALIZATION_FEATURE_COUNT = PROJECTING_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.AuxiliaryVariableImpl <em>Auxiliary Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.AuxiliaryVariableImpl
	 * @see SBVR.impl.SBVRPackageImpl#getAuxiliaryVariable()
	 * @generated
	 */
	int AUXILIARY_VARIABLE = 120;

	/**
	 * The feature id for the '<em><b>Restricting Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE__RESTRICTING_FORMULATION = VARIABLE__RESTRICTING_FORMULATION;

	/**
	 * The feature id for the '<em><b>Is Unitary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE__IS_UNITARY = VARIABLE__IS_UNITARY;

	/**
	 * The feature id for the '<em><b>Quantification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE__QUANTIFICATION = VARIABLE__QUANTIFICATION;

	/**
	 * The feature id for the '<em><b>Ranged Over Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE__RANGED_OVER_CONCEPT = VARIABLE__RANGED_OVER_CONCEPT;

	/**
	 * The feature id for the '<em><b>Fact Type Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE__FACT_TYPE_ROLE = VARIABLE__FACT_TYPE_ROLE;

	/**
	 * The feature id for the '<em><b>Projection Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE__PROJECTION_POSITION = VARIABLE__PROJECTION_POSITION;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE__PROJECTION = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auxiliary Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.BagProjectionImpl <em>Bag Projection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.BagProjectionImpl
	 * @see SBVR.impl.SBVRPackageImpl#getBagProjection()
	 * @generated
	 */
	int BAG_PROJECTION = 121;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_PROJECTION__VARIABLE = PROJECTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Constraining Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_PROJECTION__CONSTRAINING_FORMULATION = PROJECTION__CONSTRAINING_FORMULATION;

	/**
	 * The feature id for the '<em><b>Projection Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_PROJECTION__PROJECTION_VARIABLE = PROJECTION__PROJECTION_VARIABLE;

	/**
	 * The feature id for the '<em><b>Auxiliary Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_PROJECTION__AUXILIARY_VARIABLE = PROJECTION__AUXILIARY_VARIABLE;

	/**
	 * The number of structural features of the '<em>Bag Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_PROJECTION_FEATURE_COUNT = PROJECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.SetProjectionImpl <em>Set Projection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.SetProjectionImpl
	 * @see SBVR.impl.SBVRPackageImpl#getSetProjection()
	 * @generated
	 */
	int SET_PROJECTION = 122;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROJECTION__VARIABLE = PROJECTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Constraining Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROJECTION__CONSTRAINING_FORMULATION = PROJECTION__CONSTRAINING_FORMULATION;

	/**
	 * The feature id for the '<em><b>Projection Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROJECTION__PROJECTION_VARIABLE = PROJECTION__PROJECTION_VARIABLE;

	/**
	 * The feature id for the '<em><b>Auxiliary Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROJECTION__AUXILIARY_VARIABLE = PROJECTION__AUXILIARY_VARIABLE;

	/**
	 * The number of structural features of the '<em>Set Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROJECTION_FEATURE_COUNT = PROJECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.LogicalFormulationKindImpl <em>Logical Formulation Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.LogicalFormulationKindImpl
	 * @see SBVR.impl.SBVRPackageImpl#getLogicalFormulationKind()
	 * @generated
	 */
	int LOGICAL_FORMULATION_KIND = 123;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION_KIND__REPRESENTATION = OBJECT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION_KIND__DESIGNATION = OBJECT_TYPE__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION_KIND__DEFINITION = OBJECT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION_KIND__GENERAL = OBJECT_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION_KIND__COEXTENSIVE = OBJECT_TYPE__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION_KIND__INSTANCE = OBJECT_TYPE__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION_KIND__EXTENSION = OBJECT_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION_KIND__REFERENCE_SCHEME = OBJECT_TYPE__REFERENCE_SCHEME;

	/**
	 * The number of structural features of the '<em>Logical Formulation Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FORMULATION_KIND_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SBVR.impl.ClosedProjectionImpl <em>Closed Projection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.ClosedProjectionImpl
	 * @see SBVR.impl.SBVRPackageImpl#getClosedProjection()
	 * @generated
	 */
	int CLOSED_PROJECTION = 124;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROJECTION__VARIABLE = CLOSED_SEMANTIC_FORMULATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROJECTION__MEANING = CLOSED_SEMANTIC_FORMULATION__MEANING;

	/**
	 * The feature id for the '<em><b>Constraining Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROJECTION__CONSTRAINING_FORMULATION = CLOSED_SEMANTIC_FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Projection Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROJECTION__PROJECTION_VARIABLE = CLOSED_SEMANTIC_FORMULATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auxiliary Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROJECTION__AUXILIARY_VARIABLE = CLOSED_SEMANTIC_FORMULATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROJECTION__DEFINITION = CLOSED_SEMANTIC_FORMULATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROJECTION__OBJECT_TYPE = CLOSED_SEMANTIC_FORMULATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fact Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROJECTION__FACT_TYPE = CLOSED_SEMANTIC_FORMULATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROJECTION__QUESTION = CLOSED_SEMANTIC_FORMULATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Closed Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROJECTION_FEATURE_COUNT = CLOSED_SEMANTIC_FORMULATION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link SBVR.impl.CategorizationSchemeImpl <em>Categorization Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.CategorizationSchemeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getCategorizationScheme()
	 * @generated
	 */
	int CATEGORIZATION_SCHEME = 125;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_SCHEME__CARDINALITY = SET__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_SCHEME__ELEMENT = SET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_SCHEME__IS_BASED_ON = SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_SCHEME__CONTAINS_CATEGORY = SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_SCHEME__IS_FOR = SET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Categorization Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_SCHEME_FEATURE_COUNT = SET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link SBVR.impl.CategorizationTypeImpl <em>Categorization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.CategorizationTypeImpl
	 * @see SBVR.impl.SBVRPackageImpl#getCategorizationType()
	 * @generated
	 */
	int CATEGORIZATION_TYPE = 126;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_TYPE__REPRESENTATION = CONCEPT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_TYPE__DESIGNATION = CONCEPT__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_TYPE__DEFINITION = CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_TYPE__GENERAL = CONCEPT__GENERAL;

	/**
	 * The feature id for the '<em><b>Coextensive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_TYPE__COEXTENSIVE = CONCEPT__COEXTENSIVE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_TYPE__INSTANCE = CONCEPT__INSTANCE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_TYPE__EXTENSION = CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_TYPE__REFERENCE_SCHEME = CONCEPT__REFERENCE_SCHEME;

	/**
	 * The feature id for the '<em><b>Is For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_TYPE__IS_FOR = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Categorization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_TYPE_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SBVR.impl.SegmentationImpl <em>Segmentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SBVR.impl.SegmentationImpl
	 * @see SBVR.impl.SBVRPackageImpl#getSegmentation()
	 * @generated
	 */
	int SEGMENTATION = 127;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTATION__CARDINALITY = CATEGORIZATION_SCHEME__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTATION__ELEMENT = CATEGORIZATION_SCHEME__ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTATION__IS_BASED_ON = CATEGORIZATION_SCHEME__IS_BASED_ON;

	/**
	 * The feature id for the '<em><b>Contains Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTATION__CONTAINS_CATEGORY = CATEGORIZATION_SCHEME__CONTAINS_CATEGORY;

	/**
	 * The feature id for the '<em><b>Is For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTATION__IS_FOR = CATEGORIZATION_SCHEME__IS_FOR;

	/**
	 * The number of structural features of the '<em>Segmentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTATION_FEATURE_COUNT = CATEGORIZATION_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>EClass</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EClass
	 * @see SBVR.impl.SBVRPackageImpl#getEClass()
	 * @generated
	 */
	int ECLASS = 128;

	/**
	 * The meta object id for the '<em>Integer Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see SBVR.impl.SBVRPackageImpl#getIntegerObject()
	 * @generated
	 */
	int INTEGER_OBJECT = 129;

	/**
	 * The meta object id for the '<em>Boolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see SBVR.impl.SBVRPackageImpl#getBooleanObject()
	 * @generated
	 */
	int BOOLEAN_OBJECT = 130;


	/**
	 * Returns the meta object for class '{@link SBVR.BodyOfSharedMeanings <em>Body Of Shared Meanings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Of Shared Meanings</em>'.
	 * @see SBVR.BodyOfSharedMeanings
	 * @generated
	 */
	EClass getBodyOfSharedMeanings();

	/**
	 * Returns the meta object for the containment reference list '{@link SBVR.BodyOfSharedMeanings#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept</em>'.
	 * @see SBVR.BodyOfSharedMeanings#getConcept()
	 * @see #getBodyOfSharedMeanings()
	 * @generated
	 */
	EReference getBodyOfSharedMeanings_Concept();

	/**
	 * Returns the meta object for the containment reference list '{@link SBVR.BodyOfSharedMeanings#getProposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proposition</em>'.
	 * @see SBVR.BodyOfSharedMeanings#getProposition()
	 * @see #getBodyOfSharedMeanings()
	 * @generated
	 */
	EReference getBodyOfSharedMeanings_Proposition();

	/**
	 * Returns the meta object for class '{@link SBVR.TerminologicalDictionary <em>Terminological Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminological Dictionary</em>'.
	 * @see SBVR.TerminologicalDictionary
	 * @generated
	 */
	EClass getTerminologicalDictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link SBVR.TerminologicalDictionary#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representation</em>'.
	 * @see SBVR.TerminologicalDictionary#getRepresentation()
	 * @see #getTerminologicalDictionary()
	 * @generated
	 */
	EReference getTerminologicalDictionary_Representation();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.TerminologicalDictionary#getVocabulary <em>Vocabulary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vocabulary</em>'.
	 * @see SBVR.TerminologicalDictionary#getVocabulary()
	 * @see #getTerminologicalDictionary()
	 * @generated
	 */
	EReference getTerminologicalDictionary_Vocabulary();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.TerminologicalDictionary#getBodyOfSharedMeaning <em>Body Of Shared Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Of Shared Meaning</em>'.
	 * @see SBVR.TerminologicalDictionary#getBodyOfSharedMeaning()
	 * @see #getTerminologicalDictionary()
	 * @generated
	 */
	EReference getTerminologicalDictionary_BodyOfSharedMeaning();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.TerminologicalDictionary#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uri</em>'.
	 * @see SBVR.TerminologicalDictionary#getUri()
	 * @see #getTerminologicalDictionary()
	 * @generated
	 */
	EReference getTerminologicalDictionary_Uri();

	/**
	 * Returns the meta object for class '{@link SBVR.Vocabulary <em>Vocabulary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vocabulary</em>'.
	 * @see SBVR.Vocabulary
	 * @generated
	 */
	EClass getVocabulary();

	/**
	 * Returns the meta object for the containment reference list '{@link SBVR.Vocabulary#getDesignation <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Designation</em>'.
	 * @see SBVR.Vocabulary#getDesignation()
	 * @see #getVocabulary()
	 * @generated
	 */
	EReference getVocabulary_Designation();

	/**
	 * Returns the meta object for the containment reference list '{@link SBVR.Vocabulary#getFactTypeForm <em>Fact Type Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fact Type Form</em>'.
	 * @see SBVR.Vocabulary#getFactTypeForm()
	 * @see #getVocabulary()
	 * @generated
	 */
	EReference getVocabulary_FactTypeForm();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Vocabulary#getBodyOfSharedMeaning <em>Body Of Shared Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Of Shared Meaning</em>'.
	 * @see SBVR.Vocabulary#getBodyOfSharedMeaning()
	 * @see #getVocabulary()
	 * @generated
	 */
	EReference getVocabulary_BodyOfSharedMeaning();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Vocabulary#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Namespace</em>'.
	 * @see SBVR.Vocabulary#getNamespace()
	 * @see #getVocabulary()
	 * @generated
	 */
	EReference getVocabulary_Namespace();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Vocabulary#getIncorporatedVocabulary <em>Incorporated Vocabulary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incorporated Vocabulary</em>'.
	 * @see SBVR.Vocabulary#getIncorporatedVocabulary()
	 * @see #getVocabulary()
	 * @generated
	 */
	EReference getVocabulary_IncorporatedVocabulary();

	/**
	 * Returns the meta object for class '{@link SBVR.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see SBVR.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link SBVR.QualifiedDesignation <em>Qualified Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Designation</em>'.
	 * @see SBVR.QualifiedDesignation
	 * @generated
	 */
	EClass getQualifiedDesignation();

	/**
	 * Returns the meta object for the attribute '{@link SBVR.QualifiedDesignation#isPreferred <em>Preferred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred</em>'.
	 * @see SBVR.QualifiedDesignation#isPreferred()
	 * @see #getQualifiedDesignation()
	 * @generated
	 */
	EAttribute getQualifiedDesignation_Preferred();

	/**
	 * Returns the meta object for the attribute '{@link SBVR.QualifiedDesignation#isProhibited <em>Prohibited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prohibited</em>'.
	 * @see SBVR.QualifiedDesignation#isProhibited()
	 * @see #getQualifiedDesignation()
	 * @generated
	 */
	EAttribute getQualifiedDesignation_Prohibited();

	/**
	 * Returns the meta object for class '{@link SBVR.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see SBVR.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Name#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refers To</em>'.
	 * @see SBVR.Name#getRefersTo()
	 * @see #getName_()
	 * @generated
	 */
	EReference getName_RefersTo();

	/**
	 * Returns the meta object for class '{@link SBVR.FactSymbol <em>Fact Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Symbol</em>'.
	 * @see SBVR.FactSymbol
	 * @generated
	 */
	EClass getFactSymbol();

	/**
	 * Returns the meta object for class '{@link SBVR.Rulebook <em>Rulebook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rulebook</em>'.
	 * @see SBVR.Rulebook
	 * @generated
	 */
	EClass getRulebook();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Rulebook#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Representation</em>'.
	 * @see SBVR.Rulebook#getRepresentation()
	 * @see #getRulebook()
	 * @generated
	 */
	EReference getRulebook_Representation();

	/**
	 * Returns the meta object for class '{@link SBVR.BusinessVocabulary <em>Business Vocabulary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Vocabulary</em>'.
	 * @see SBVR.BusinessVocabulary
	 * @generated
	 */
	EClass getBusinessVocabulary();

	/**
	 * Returns the meta object for class '{@link SBVR.SubjectField <em>Subject Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Field</em>'.
	 * @see SBVR.SubjectField
	 * @generated
	 */
	EClass getSubjectField();

	/**
	 * Returns the meta object for class '{@link SBVR.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see SBVR.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for class '{@link SBVR.DescriptiveExample <em>Descriptive Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptive Example</em>'.
	 * @see SBVR.DescriptiveExample
	 * @generated
	 */
	EClass getDescriptiveExample();

	/**
	 * Returns the meta object for class '{@link SBVR.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see SBVR.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for class '{@link SBVR.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see SBVR.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Reference#getInformationSource <em>Information Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Information Source</em>'.
	 * @see SBVR.Reference#getInformationSource()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_InformationSource();

	/**
	 * Returns the meta object for class '{@link SBVR.CommunicationContent <em>Communication Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Content</em>'.
	 * @see SBVR.CommunicationContent
	 * @generated
	 */
	EClass getCommunicationContent();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.CommunicationContent#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Representation</em>'.
	 * @see SBVR.CommunicationContent#getRepresentation()
	 * @see #getCommunicationContent()
	 * @generated
	 */
	EReference getCommunicationContent_Representation();

	/**
	 * Returns the meta object for class '{@link SBVR.Community <em>Community</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Community</em>'.
	 * @see SBVR.Community
	 * @generated
	 */
	EClass getCommunity();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Community#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uri</em>'.
	 * @see SBVR.Community#getUri()
	 * @see #getCommunity()
	 * @generated
	 */
	EReference getCommunity_Uri();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Community#getSubCommunity <em>Sub Community</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Community</em>'.
	 * @see SBVR.Community#getSubCommunity()
	 * @see #getCommunity()
	 * @generated
	 */
	EReference getCommunity_SubCommunity();

	/**
	 * Returns the meta object for class '{@link SBVR.SemanticCommunity <em>Semantic Community</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Community</em>'.
	 * @see SBVR.SemanticCommunity
	 * @generated
	 */
	EClass getSemanticCommunity();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.SemanticCommunity#getSpeechCommunity <em>Speech Community</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Speech Community</em>'.
	 * @see SBVR.SemanticCommunity#getSpeechCommunity()
	 * @see #getSemanticCommunity()
	 * @generated
	 */
	EReference getSemanticCommunity_SpeechCommunity();

	/**
	 * Returns the meta object for class '{@link SBVR.SpeechCommunity <em>Speech Community</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Community</em>'.
	 * @see SBVR.SpeechCommunity
	 * @generated
	 */
	EClass getSpeechCommunity();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.SpeechCommunity#getOwnedVocabulary <em>Owned Vocabulary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Vocabulary</em>'.
	 * @see SBVR.SpeechCommunity#getOwnedVocabulary()
	 * @see #getSpeechCommunity()
	 * @generated
	 */
	EReference getSpeechCommunity_OwnedVocabulary();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.SpeechCommunity#getUsedVocabulary <em>Used Vocabulary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Vocabulary</em>'.
	 * @see SBVR.SpeechCommunity#getUsedVocabulary()
	 * @see #getSpeechCommunity()
	 * @generated
	 */
	EReference getSpeechCommunity_UsedVocabulary();

	/**
	 * Returns the meta object for class '{@link SBVR.NonverbalDesignation <em>Nonverbal Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nonverbal Designation</em>'.
	 * @see SBVR.NonverbalDesignation
	 * @generated
	 */
	EClass getNonverbalDesignation();

	/**
	 * Returns the meta object for class '{@link SBVR.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see SBVR.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for class '{@link SBVR.PartitiveFactType <em>Partitive Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partitive Fact Type</em>'.
	 * @see SBVR.PartitiveFactType
	 * @generated
	 */
	EClass getPartitiveFactType();

	/**
	 * Returns the meta object for class '{@link SBVR.FundamentalConcept <em>Fundamental Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fundamental Concept</em>'.
	 * @see SBVR.FundamentalConcept
	 * @generated
	 */
	EClass getFundamentalConcept();

	/**
	 * Returns the meta object for class '{@link SBVR.SituationalRole <em>Situational Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Situational Role</em>'.
	 * @see SBVR.SituationalRole
	 * @generated
	 */
	EClass getSituationalRole();

	/**
	 * Returns the meta object for class '{@link SBVR.AssociativeFactType <em>Associative Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associative Fact Type</em>'.
	 * @see SBVR.AssociativeFactType
	 * @generated
	 */
	EClass getAssociativeFactType();

	/**
	 * Returns the meta object for class '{@link SBVR.IsPropertyOfFactType <em>Is Property Of Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Property Of Fact Type</em>'.
	 * @see SBVR.IsPropertyOfFactType
	 * @generated
	 */
	EClass getIsPropertyOfFactType();

	/**
	 * Returns the meta object for class '{@link SBVR.AssortmentFactType <em>Assortment Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assortment Fact Type</em>'.
	 * @see SBVR.AssortmentFactType
	 * @generated
	 */
	EClass getAssortmentFactType();

	/**
	 * Returns the meta object for class '{@link SBVR.SpecializationFactType <em>Specialization Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization Fact Type</em>'.
	 * @see SBVR.SpecializationFactType
	 * @generated
	 */
	EClass getSpecializationFactType();

	/**
	 * Returns the meta object for class '{@link SBVR.CategorizationFactType <em>Categorization Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorization Fact Type</em>'.
	 * @see SBVR.CategorizationFactType
	 * @generated
	 */
	EClass getCategorizationFactType();

	/**
	 * Returns the meta object for class '{@link SBVR.ContextualizationFactType <em>Contextualization Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextualization Fact Type</em>'.
	 * @see SBVR.ContextualizationFactType
	 * @generated
	 */
	EClass getContextualizationFactType();

	/**
	 * Returns the meta object for class '{@link SBVR.ContextualizedConcept <em>Contextualized Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextualized Concept</em>'.
	 * @see SBVR.ContextualizedConcept
	 * @generated
	 */
	EClass getContextualizedConcept();

	/**
	 * Returns the meta object for class '{@link SBVR.Facet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet</em>'.
	 * @see SBVR.Facet
	 * @generated
	 */
	EClass getFacet();

	/**
	 * Returns the meta object for class '{@link SBVR.IsRoleOfFactType <em>Is Role Of Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Role Of Fact Type</em>'.
	 * @see SBVR.IsRoleOfFactType
	 * @generated
	 */
	EClass getIsRoleOfFactType();

	/**
	 * Returns the meta object for class '{@link SBVR.IsFacetOfFactType <em>Is Facet Of Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Facet Of Fact Type</em>'.
	 * @see SBVR.IsFacetOfFactType
	 * @generated
	 */
	EClass getIsFacetOfFactType();

	/**
	 * Returns the meta object for class '{@link SBVR.ElementOfGuidance <em>Element Of Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Of Guidance</em>'.
	 * @see SBVR.ElementOfGuidance
	 * @generated
	 */
	EClass getElementOfGuidance();

	/**
	 * Returns the meta object for class '{@link SBVR.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see SBVR.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for class '{@link SBVR.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see SBVR.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link SBVR.Package#getPackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
	 * @see SBVR.Package#getPackagedElement()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PackagedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link SBVR.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Package</em>'.
	 * @see SBVR.Package#getNestedPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_NestedPackage();

	/**
	 * Returns the meta object for the attribute '{@link SBVR.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SBVR.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for class '{@link SBVR.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see SBVR.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for class '{@link SBVR.ConceptualSchema <em>Conceptual Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Schema</em>'.
	 * @see SBVR.ConceptualSchema
	 * @generated
	 */
	EClass getConceptualSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link SBVR.ConceptualSchema#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept</em>'.
	 * @see SBVR.ConceptualSchema#getConcept()
	 * @see #getConceptualSchema()
	 * @generated
	 */
	EReference getConceptualSchema_Concept();

	/**
	 * Returns the meta object for the containment reference list '{@link SBVR.ConceptualSchema#getFact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fact</em>'.
	 * @see SBVR.ConceptualSchema#getFact()
	 * @see #getConceptualSchema()
	 * @generated
	 */
	EReference getConceptualSchema_Fact();

	/**
	 * Returns the meta object for class '{@link SBVR.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see SBVR.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Concept#getDesignation <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Designation</em>'.
	 * @see SBVR.Concept#getDesignation()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Designation();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Concept#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Definition</em>'.
	 * @see SBVR.Concept#getDefinition()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Definition();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Concept#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General</em>'.
	 * @see SBVR.Concept#getGeneral()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_General();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Concept#getCoextensive <em>Coextensive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coextensive</em>'.
	 * @see SBVR.Concept#getCoextensive()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Coextensive();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Concept#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance</em>'.
	 * @see SBVR.Concept#getInstance()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Instance();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Concept#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extension</em>'.
	 * @see SBVR.Concept#getExtension()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Extension();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Concept#getReferenceScheme <em>Reference Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference Scheme</em>'.
	 * @see SBVR.Concept#getReferenceScheme()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_ReferenceScheme();

	/**
	 * Returns the meta object for class '{@link SBVR.Meaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meaning</em>'.
	 * @see SBVR.Meaning
	 * @generated
	 */
	EClass getMeaning();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Meaning#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Representation</em>'.
	 * @see SBVR.Meaning#getRepresentation()
	 * @see #getMeaning()
	 * @generated
	 */
	EReference getMeaning_Representation();

	/**
	 * Returns the meta object for class '{@link SBVR.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see SBVR.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Representation#getMeaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meaning</em>'.
	 * @see SBVR.Representation#getMeaning()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_Meaning();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Representation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see SBVR.Representation#getExpression()
	 * @see #getRepresentation()
	 * @generated
	 */
	EReference getRepresentation_Expression();

	/**
	 * Returns the meta object for class '{@link SBVR.Actuality <em>Actuality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuality</em>'.
	 * @see SBVR.Actuality
	 * @generated
	 */
	EClass getActuality();

	/**
	 * Returns the meta object for class '{@link SBVR.StateOfAffairs <em>State Of Affairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Of Affairs</em>'.
	 * @see SBVR.StateOfAffairs
	 * @generated
	 */
	EClass getStateOfAffairs();

	/**
	 * Returns the meta object for class '{@link SBVR.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see SBVR.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link SBVR.BindableTarget <em>Bindable Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bindable Target</em>'.
	 * @see SBVR.BindableTarget
	 * @generated
	 */
	EClass getBindableTarget();

	/**
	 * Returns the meta object for class '{@link SBVR.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see SBVR.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for class '{@link SBVR.Designation <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Designation</em>'.
	 * @see SBVR.Designation
	 * @generated
	 */
	EClass getDesignation();

	/**
	 * Returns the meta object for class '{@link SBVR.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see SBVR.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Set#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cardinality</em>'.
	 * @see SBVR.Set#getCardinality()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Cardinality();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Set#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element</em>'.
	 * @see SBVR.Set#getElement()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Element();

	/**
	 * Returns the meta object for class '{@link SBVR.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see SBVR.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link SBVR.Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SBVR.Integer#getValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Value();

	/**
	 * Returns the meta object for class '{@link SBVR.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see SBVR.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link SBVR.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see SBVR.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Quantity#getEqualTo <em>Equal To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equal To</em>'.
	 * @see SBVR.Quantity#getEqualTo()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_EqualTo();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Quantity#getLessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Less Than</em>'.
	 * @see SBVR.Quantity#getLessThan()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_LessThan();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Quantity#getGreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Greater Than</em>'.
	 * @see SBVR.Quantity#getGreaterThan()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_GreaterThan();

	/**
	 * Returns the meta object for class '{@link SBVR.NounConcept <em>Noun Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noun Concept</em>'.
	 * @see SBVR.NounConcept
	 * @generated
	 */
	EClass getNounConcept();

	/**
	 * Returns the meta object for class '{@link SBVR.ReferenceScheme <em>Reference Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Scheme</em>'.
	 * @see SBVR.ReferenceScheme
	 * @generated
	 */
	EClass getReferenceScheme();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.ReferenceScheme#getExtensionallyUsedRole <em>Extensionally Used Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extensionally Used Role</em>'.
	 * @see SBVR.ReferenceScheme#getExtensionallyUsedRole()
	 * @see #getReferenceScheme()
	 * @generated
	 */
	EReference getReferenceScheme_ExtensionallyUsedRole();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.ReferenceScheme#getSimplyUsedRole <em>Simply Used Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simply Used Role</em>'.
	 * @see SBVR.ReferenceScheme#getSimplyUsedRole()
	 * @see #getReferenceScheme()
	 * @generated
	 */
	EReference getReferenceScheme_SimplyUsedRole();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.ReferenceScheme#getIdentifyingCharacteristic <em>Identifying Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifying Characteristic</em>'.
	 * @see SBVR.ReferenceScheme#getIdentifyingCharacteristic()
	 * @see #getReferenceScheme()
	 * @generated
	 */
	EReference getReferenceScheme_IdentifyingCharacteristic();

	/**
	 * Returns the meta object for class '{@link SBVR.FactTypeRole <em>Fact Type Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Type Role</em>'.
	 * @see SBVR.FactTypeRole
	 * @generated
	 */
	EClass getFactTypeRole();

	/**
	 * Returns the meta object for class '{@link SBVR.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see SBVR.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Role#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Type</em>'.
	 * @see SBVR.Role#getObjectType()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ObjectType();

	/**
	 * Returns the meta object for class '{@link SBVR.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see SBVR.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for class '{@link SBVR.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see SBVR.Characteristic
	 * @generated
	 */
	EClass getCharacteristic();

	/**
	 * Returns the meta object for class '{@link SBVR.FactType <em>Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Type</em>'.
	 * @see SBVR.FactType
	 * @generated
	 */
	EClass getFactType();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.FactType#getFactTypeForm <em>Fact Type Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fact Type Form</em>'.
	 * @see SBVR.FactType#getFactTypeForm()
	 * @see #getFactType()
	 * @generated
	 */
	EReference getFactType_FactTypeForm();

	/**
	 * Returns the meta object for the containment reference list '{@link SBVR.FactType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see SBVR.FactType#getRole()
	 * @see #getFactType()
	 * @generated
	 */
	EReference getFactType_Role();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.FactType#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has</em>'.
	 * @see SBVR.FactType#getHas()
	 * @see #getFactType()
	 * @generated
	 */
	EReference getFactType_Has();

	/**
	 * Returns the meta object for class '{@link SBVR.FactTypeForm <em>Fact Type Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Type Form</em>'.
	 * @see SBVR.FactTypeForm
	 * @generated
	 */
	EClass getFactTypeForm();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.FactTypeForm#getDesignation <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Designation</em>'.
	 * @see SBVR.FactTypeForm#getDesignation()
	 * @see #getFactTypeForm()
	 * @generated
	 */
	EReference getFactTypeForm_Designation();

	/**
	 * Returns the meta object for class '{@link SBVR.Placeholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placeholder</em>'.
	 * @see SBVR.Placeholder
	 * @generated
	 */
	EClass getPlaceholder();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Placeholder#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see SBVR.Placeholder#getUses()
	 * @see #getPlaceholder()
	 * @generated
	 */
	EReference getPlaceholder_Uses();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Placeholder#getIsAtStartingCharacterPosition <em>Is At Starting Character Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is At Starting Character Position</em>'.
	 * @see SBVR.Placeholder#getIsAtStartingCharacterPosition()
	 * @see #getPlaceholder()
	 * @generated
	 */
	EReference getPlaceholder_IsAtStartingCharacterPosition();

	/**
	 * Returns the meta object for class '{@link SBVR.BinaryFactType <em>Binary Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Fact Type</em>'.
	 * @see SBVR.BinaryFactType
	 * @generated
	 */
	EClass getBinaryFactType();

	/**
	 * Returns the meta object for class '{@link SBVR.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact</em>'.
	 * @see SBVR.Fact
	 * @generated
	 */
	EClass getFact();

	/**
	 * Returns the meta object for class '{@link SBVR.Proposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposition</em>'.
	 * @see SBVR.Proposition
	 * @generated
	 */
	EClass getProposition();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Proposition#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Statement</em>'.
	 * @see SBVR.Proposition#getStatement()
	 * @see #getProposition()
	 * @generated
	 */
	EReference getProposition_Statement();

	/**
	 * Returns the meta object for the attribute '{@link SBVR.Proposition#getIsTrue <em>Is True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is True</em>'.
	 * @see SBVR.Proposition#getIsTrue()
	 * @see #getProposition()
	 * @generated
	 */
	EAttribute getProposition_IsTrue();

	/**
	 * Returns the meta object for the attribute '{@link SBVR.Proposition#getIsFalse <em>Is False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is False</em>'.
	 * @see SBVR.Proposition#getIsFalse()
	 * @see #getProposition()
	 * @generated
	 */
	EAttribute getProposition_IsFalse();

	/**
	 * Returns the meta object for the attribute '{@link SBVR.Proposition#getIsNecessarilyTrue <em>Is Necessarily True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Necessarily True</em>'.
	 * @see SBVR.Proposition#getIsNecessarilyTrue()
	 * @see #getProposition()
	 * @generated
	 */
	EAttribute getProposition_IsNecessarilyTrue();

	/**
	 * Returns the meta object for the attribute '{@link SBVR.Proposition#getIsPossibilyTrue <em>Is Possibily True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Possibily True</em>'.
	 * @see SBVR.Proposition#getIsPossibilyTrue()
	 * @see #getProposition()
	 * @generated
	 */
	EAttribute getProposition_IsPossibilyTrue();

	/**
	 * Returns the meta object for the attribute '{@link SBVR.Proposition#getIsObligatedToBeTrue <em>Is Obligated To Be True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Obligated To Be True</em>'.
	 * @see SBVR.Proposition#getIsObligatedToBeTrue()
	 * @see #getProposition()
	 * @generated
	 */
	EAttribute getProposition_IsObligatedToBeTrue();

	/**
	 * Returns the meta object for the attribute '{@link SBVR.Proposition#getIsPermittedToBeTrue <em>Is Permitted To Be True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Permitted To Be True</em>'.
	 * @see SBVR.Proposition#getIsPermittedToBeTrue()
	 * @see #getProposition()
	 * @generated
	 */
	EAttribute getProposition_IsPermittedToBeTrue();

	/**
	 * Returns the meta object for class '{@link SBVR.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see SBVR.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link SBVR.FactModel <em>Fact Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Model</em>'.
	 * @see SBVR.FactModel
	 * @generated
	 */
	EClass getFactModel();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.FactModel#getConceptualSchema <em>Conceptual Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conceptual Schema</em>'.
	 * @see SBVR.FactModel#getConceptualSchema()
	 * @see #getFactModel()
	 * @generated
	 */
	EReference getFactModel_ConceptualSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link SBVR.FactModel#getFact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fact</em>'.
	 * @see SBVR.FactModel#getFact()
	 * @see #getFactModel()
	 * @generated
	 */
	EReference getFactModel_Fact();

	/**
	 * Returns the meta object for class '{@link SBVR.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see SBVR.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link SBVR.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SBVR.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Value();

	/**
	 * Returns the meta object for class '{@link SBVR.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see SBVR.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for class '{@link SBVR.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see SBVR.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Namespace#getDesignation <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Designation</em>'.
	 * @see SBVR.Namespace#getDesignation()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Designation();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Namespace#getFactTypeForm <em>Fact Type Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fact Type Form</em>'.
	 * @see SBVR.Namespace#getFactTypeForm()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_FactTypeForm();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Namespace#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uri</em>'.
	 * @see SBVR.Namespace#getUri()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Uri();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Namespace#getIncorporatedNamespace <em>Incorporated Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incorporated Namespace</em>'.
	 * @see SBVR.Namespace#getIncorporatedNamespace()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_IncorporatedNamespace();

	/**
	 * Returns the meta object for class '{@link SBVR.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URI</em>'.
	 * @see SBVR.URI
	 * @generated
	 */
	EClass getURI();

	/**
	 * Returns the meta object for class '{@link SBVR.IndividualConcept <em>Individual Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Concept</em>'.
	 * @see SBVR.IndividualConcept
	 * @generated
	 */
	EClass getIndividualConcept();

	/**
	 * Returns the meta object for class '{@link SBVR.ConceptType <em>Concept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Type</em>'.
	 * @see SBVR.ConceptType
	 * @generated
	 */
	EClass getConceptType();

	/**
	 * Returns the meta object for class '{@link SBVR.NonNegativeInteger <em>Non Negative Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Negative Integer</em>'.
	 * @see SBVR.NonNegativeInteger
	 * @generated
	 */
	EClass getNonNegativeInteger();

	/**
	 * Returns the meta object for class '{@link SBVR.PositiveInteger <em>Positive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Integer</em>'.
	 * @see SBVR.PositiveInteger
	 * @generated
	 */
	EClass getPositiveInteger();

	/**
	 * Returns the meta object for class '{@link SBVR.SententialForm <em>Sentential Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentential Form</em>'.
	 * @see SBVR.SententialForm
	 * @generated
	 */
	EClass getSententialForm();

	/**
	 * Returns the meta object for class '{@link SBVR.NounForm <em>Noun Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noun Form</em>'.
	 * @see SBVR.NounForm
	 * @generated
	 */
	EClass getNounForm();

	/**
	 * Returns the meta object for class '{@link SBVR.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see SBVR.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for class '{@link SBVR.VocabularyNamespace <em>Vocabulary Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vocabulary Namespace</em>'.
	 * @see SBVR.VocabularyNamespace
	 * @generated
	 */
	EClass getVocabularyNamespace();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.VocabularyNamespace#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Language</em>'.
	 * @see SBVR.VocabularyNamespace#getLanguage()
	 * @see #getVocabularyNamespace()
	 * @generated
	 */
	EReference getVocabularyNamespace_Language();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.VocabularyNamespace#getAttributiveNamespace <em>Attributive Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributive Namespace</em>'.
	 * @see SBVR.VocabularyNamespace#getAttributiveNamespace()
	 * @see #getVocabularyNamespace()
	 * @generated
	 */
	EReference getVocabularyNamespace_AttributiveNamespace();

	/**
	 * Returns the meta object for class '{@link SBVR.AttributiveNamespace <em>Attributive Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributive Namespace</em>'.
	 * @see SBVR.AttributiveNamespace
	 * @generated
	 */
	EClass getAttributiveNamespace();

	/**
	 * Returns the meta object for the reference '{@link SBVR.AttributiveNamespace#getSubjectConcept <em>Subject Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject Concept</em>'.
	 * @see SBVR.AttributiveNamespace#getSubjectConcept()
	 * @see #getAttributiveNamespace()
	 * @generated
	 */
	EReference getAttributiveNamespace_SubjectConcept();

	/**
	 * Returns the meta object for class '{@link SBVR.SemanticFormulation <em>Semantic Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Formulation</em>'.
	 * @see SBVR.SemanticFormulation
	 * @generated
	 */
	EClass getSemanticFormulation();

	/**
	 * Returns the meta object for the reference '{@link SBVR.SemanticFormulation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see SBVR.SemanticFormulation#getVariable()
	 * @see #getSemanticFormulation()
	 * @generated
	 */
	EReference getSemanticFormulation_Variable();

	/**
	 * Returns the meta object for class '{@link SBVR.ClosedSemanticFormulation <em>Closed Semantic Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closed Semantic Formulation</em>'.
	 * @see SBVR.ClosedSemanticFormulation
	 * @generated
	 */
	EClass getClosedSemanticFormulation();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.ClosedSemanticFormulation#getMeaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meaning</em>'.
	 * @see SBVR.ClosedSemanticFormulation#getMeaning()
	 * @see #getClosedSemanticFormulation()
	 * @generated
	 */
	EReference getClosedSemanticFormulation_Meaning();

	/**
	 * Returns the meta object for class '{@link SBVR.LogicalFormulation <em>Logical Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Formulation</em>'.
	 * @see SBVR.LogicalFormulation
	 * @generated
	 */
	EClass getLogicalFormulation();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.LogicalFormulation#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Statement</em>'.
	 * @see SBVR.LogicalFormulation#getStatement()
	 * @see #getLogicalFormulation()
	 * @generated
	 */
	EReference getLogicalFormulation_Statement();

	/**
	 * Returns the meta object for the reference '{@link SBVR.LogicalFormulation#getProposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proposition</em>'.
	 * @see SBVR.LogicalFormulation#getProposition()
	 * @see #getLogicalFormulation()
	 * @generated
	 */
	EReference getLogicalFormulation_Proposition();

	/**
	 * Returns the meta object for class '{@link SBVR.Projection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projection</em>'.
	 * @see SBVR.Projection
	 * @generated
	 */
	EClass getProjection();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Projection#getConstrainingFormulation <em>Constraining Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraining Formulation</em>'.
	 * @see SBVR.Projection#getConstrainingFormulation()
	 * @see #getProjection()
	 * @generated
	 */
	EReference getProjection_ConstrainingFormulation();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Projection#getProjectionVariable <em>Projection Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projection Variable</em>'.
	 * @see SBVR.Projection#getProjectionVariable()
	 * @see #getProjection()
	 * @generated
	 */
	EReference getProjection_ProjectionVariable();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.Projection#getAuxiliaryVariable <em>Auxiliary Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auxiliary Variable</em>'.
	 * @see SBVR.Projection#getAuxiliaryVariable()
	 * @see #getProjection()
	 * @generated
	 */
	EReference getProjection_AuxiliaryVariable();

	/**
	 * Returns the meta object for class '{@link SBVR.AtomicFormulation <em>Atomic Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Formulation</em>'.
	 * @see SBVR.AtomicFormulation
	 * @generated
	 */
	EClass getAtomicFormulation();

	/**
	 * Returns the meta object for the reference '{@link SBVR.AtomicFormulation#getFactType <em>Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fact Type</em>'.
	 * @see SBVR.AtomicFormulation#getFactType()
	 * @see #getAtomicFormulation()
	 * @generated
	 */
	EReference getAtomicFormulation_FactType();

	/**
	 * Returns the meta object for class '{@link SBVR.InstantiationFormulation <em>Instantiation Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation Formulation</em>'.
	 * @see SBVR.InstantiationFormulation
	 * @generated
	 */
	EClass getInstantiationFormulation();

	/**
	 * Returns the meta object for the reference '{@link SBVR.InstantiationFormulation#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see SBVR.InstantiationFormulation#getConcept()
	 * @see #getInstantiationFormulation()
	 * @generated
	 */
	EReference getInstantiationFormulation_Concept();

	/**
	 * Returns the meta object for the reference '{@link SBVR.InstantiationFormulation#getBindableTarget <em>Bindable Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bindable Target</em>'.
	 * @see SBVR.InstantiationFormulation#getBindableTarget()
	 * @see #getInstantiationFormulation()
	 * @generated
	 */
	EReference getInstantiationFormulation_BindableTarget();

	/**
	 * Returns the meta object for class '{@link SBVR.Quantification <em>Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantification</em>'.
	 * @see SBVR.Quantification
	 * @generated
	 */
	EClass getQuantification();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Quantification#getScopeFormulation <em>Scope Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope Formulation</em>'.
	 * @see SBVR.Quantification#getScopeFormulation()
	 * @see #getQuantification()
	 * @generated
	 */
	EReference getQuantification_ScopeFormulation();

	/**
	 * Returns the meta object for class '{@link SBVR.Objectification <em>Objectification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objectification</em>'.
	 * @see SBVR.Objectification
	 * @generated
	 */
	EClass getObjectification();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Objectification#getLogicalFormulation <em>Logical Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Formulation</em>'.
	 * @see SBVR.Objectification#getLogicalFormulation()
	 * @see #getObjectification()
	 * @generated
	 */
	EReference getObjectification_LogicalFormulation();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Objectification#getBindableTarget <em>Bindable Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bindable Target</em>'.
	 * @see SBVR.Objectification#getBindableTarget()
	 * @see #getObjectification()
	 * @generated
	 */
	EReference getObjectification_BindableTarget();

	/**
	 * Returns the meta object for class '{@link SBVR.PropositionNominalization <em>Proposition Nominalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposition Nominalization</em>'.
	 * @see SBVR.PropositionNominalization
	 * @generated
	 */
	EClass getPropositionNominalization();

	/**
	 * Returns the meta object for the reference '{@link SBVR.PropositionNominalization#getLogicalFormulation <em>Logical Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Formulation</em>'.
	 * @see SBVR.PropositionNominalization#getLogicalFormulation()
	 * @see #getPropositionNominalization()
	 * @generated
	 */
	EReference getPropositionNominalization_LogicalFormulation();

	/**
	 * Returns the meta object for the reference '{@link SBVR.PropositionNominalization#getBindableTarget <em>Bindable Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bindable Target</em>'.
	 * @see SBVR.PropositionNominalization#getBindableTarget()
	 * @see #getPropositionNominalization()
	 * @generated
	 */
	EReference getPropositionNominalization_BindableTarget();

	/**
	 * Returns the meta object for class '{@link SBVR.ClosedLogicalFormulation <em>Closed Logical Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closed Logical Formulation</em>'.
	 * @see SBVR.ClosedLogicalFormulation
	 * @generated
	 */
	EClass getClosedLogicalFormulation();

	/**
	 * Returns the meta object for class '{@link SBVR.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see SBVR.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Variable#getRestrictingFormulation <em>Restricting Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Restricting Formulation</em>'.
	 * @see SBVR.Variable#getRestrictingFormulation()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_RestrictingFormulation();

	/**
	 * Returns the meta object for the attribute '{@link SBVR.Variable#isIsUnitary <em>Is Unitary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unitary</em>'.
	 * @see SBVR.Variable#isIsUnitary()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_IsUnitary();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Variable#getQuantification <em>Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantification</em>'.
	 * @see SBVR.Variable#getQuantification()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Quantification();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Variable#getRangedOverConcept <em>Ranged Over Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ranged Over Concept</em>'.
	 * @see SBVR.Variable#getRangedOverConcept()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_RangedOverConcept();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Variable#getFactTypeRole <em>Fact Type Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fact Type Role</em>'.
	 * @see SBVR.Variable#getFactTypeRole()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_FactTypeRole();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Variable#getProjectionPosition <em>Projection Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projection Position</em>'.
	 * @see SBVR.Variable#getProjectionPosition()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_ProjectionPosition();

	/**
	 * Returns the meta object for class '{@link SBVR.RoleBinding <em>Role Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Binding</em>'.
	 * @see SBVR.RoleBinding
	 * @generated
	 */
	EClass getRoleBinding();

	/**
	 * Returns the meta object for the reference '{@link SBVR.RoleBinding#getAtomicFormulation <em>Atomic Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atomic Formulation</em>'.
	 * @see SBVR.RoleBinding#getAtomicFormulation()
	 * @see #getRoleBinding()
	 * @generated
	 */
	EReference getRoleBinding_AtomicFormulation();

	/**
	 * Returns the meta object for the reference '{@link SBVR.RoleBinding#getBindableTarget <em>Bindable Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bindable Target</em>'.
	 * @see SBVR.RoleBinding#getBindableTarget()
	 * @see #getRoleBinding()
	 * @generated
	 */
	EReference getRoleBinding_BindableTarget();

	/**
	 * Returns the meta object for the reference '{@link SBVR.RoleBinding#getFactTypeRole <em>Fact Type Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fact Type Role</em>'.
	 * @see SBVR.RoleBinding#getFactTypeRole()
	 * @see #getRoleBinding()
	 * @generated
	 */
	EReference getRoleBinding_FactTypeRole();

	/**
	 * Returns the meta object for class '{@link SBVR.ModalFormulation <em>Modal Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modal Formulation</em>'.
	 * @see SBVR.ModalFormulation
	 * @generated
	 */
	EClass getModalFormulation();

	/**
	 * Returns the meta object for the reference '{@link SBVR.ModalFormulation#getLogicalFormulation <em>Logical Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Formulation</em>'.
	 * @see SBVR.ModalFormulation#getLogicalFormulation()
	 * @see #getModalFormulation()
	 * @generated
	 */
	EReference getModalFormulation_LogicalFormulation();

	/**
	 * Returns the meta object for class '{@link SBVR.NecessityFormulation <em>Necessity Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Necessity Formulation</em>'.
	 * @see SBVR.NecessityFormulation
	 * @generated
	 */
	EClass getNecessityFormulation();

	/**
	 * Returns the meta object for class '{@link SBVR.ObligationFormulation <em>Obligation Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obligation Formulation</em>'.
	 * @see SBVR.ObligationFormulation
	 * @generated
	 */
	EClass getObligationFormulation();

	/**
	 * Returns the meta object for class '{@link SBVR.PermissibilityFormulation <em>Permissibility Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permissibility Formulation</em>'.
	 * @see SBVR.PermissibilityFormulation
	 * @generated
	 */
	EClass getPermissibilityFormulation();

	/**
	 * Returns the meta object for class '{@link SBVR.PossibilityFormulation <em>Possibility Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possibility Formulation</em>'.
	 * @see SBVR.PossibilityFormulation
	 * @generated
	 */
	EClass getPossibilityFormulation();

	/**
	 * Returns the meta object for class '{@link SBVR.LogicalOperation <em>Logical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operation</em>'.
	 * @see SBVR.LogicalOperation
	 * @generated
	 */
	EClass getLogicalOperation();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.LogicalOperation#getLogicalOperand <em>Logical Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logical Operand</em>'.
	 * @see SBVR.LogicalOperation#getLogicalOperand()
	 * @see #getLogicalOperation()
	 * @generated
	 */
	EReference getLogicalOperation_LogicalOperand();

	/**
	 * Returns the meta object for class '{@link SBVR.LogicalNegation <em>Logical Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Negation</em>'.
	 * @see SBVR.LogicalNegation
	 * @generated
	 */
	EClass getLogicalNegation();

	/**
	 * Returns the meta object for class '{@link SBVR.BinaryLogicalOperation <em>Binary Logical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Logical Operation</em>'.
	 * @see SBVR.BinaryLogicalOperation
	 * @generated
	 */
	EClass getBinaryLogicalOperation();

	/**
	 * Returns the meta object for the reference '{@link SBVR.BinaryLogicalOperation#getLogicalOperand1 <em>Logical Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Operand1</em>'.
	 * @see SBVR.BinaryLogicalOperation#getLogicalOperand1()
	 * @see #getBinaryLogicalOperation()
	 * @generated
	 */
	EReference getBinaryLogicalOperation_LogicalOperand1();

	/**
	 * Returns the meta object for the reference '{@link SBVR.BinaryLogicalOperation#getLogicalOperand2 <em>Logical Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Operand2</em>'.
	 * @see SBVR.BinaryLogicalOperation#getLogicalOperand2()
	 * @see #getBinaryLogicalOperation()
	 * @generated
	 */
	EReference getBinaryLogicalOperation_LogicalOperand2();

	/**
	 * Returns the meta object for class '{@link SBVR.Conjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunction</em>'.
	 * @see SBVR.Conjunction
	 * @generated
	 */
	EClass getConjunction();

	/**
	 * Returns the meta object for class '{@link SBVR.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunction</em>'.
	 * @see SBVR.Disjunction
	 * @generated
	 */
	EClass getDisjunction();

	/**
	 * Returns the meta object for class '{@link SBVR.Equivalence <em>Equivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalence</em>'.
	 * @see SBVR.Equivalence
	 * @generated
	 */
	EClass getEquivalence();

	/**
	 * Returns the meta object for class '{@link SBVR.ExclusiveDisjunction <em>Exclusive Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Disjunction</em>'.
	 * @see SBVR.ExclusiveDisjunction
	 * @generated
	 */
	EClass getExclusiveDisjunction();

	/**
	 * Returns the meta object for class '{@link SBVR.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication</em>'.
	 * @see SBVR.Implication
	 * @generated
	 */
	EClass getImplication();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Implication#getAntecedent <em>Antecedent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent</em>'.
	 * @see SBVR.Implication#getAntecedent()
	 * @see #getImplication()
	 * @generated
	 */
	EReference getImplication_Antecedent();

	/**
	 * Returns the meta object for the reference '{@link SBVR.Implication#getConsequent <em>Consequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consequent</em>'.
	 * @see SBVR.Implication#getConsequent()
	 * @see #getImplication()
	 * @generated
	 */
	EReference getImplication_Consequent();

	/**
	 * Returns the meta object for class '{@link SBVR.NandFormulation <em>Nand Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nand Formulation</em>'.
	 * @see SBVR.NandFormulation
	 * @generated
	 */
	EClass getNandFormulation();

	/**
	 * Returns the meta object for class '{@link SBVR.NorFormulation <em>Nor Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nor Formulation</em>'.
	 * @see SBVR.NorFormulation
	 * @generated
	 */
	EClass getNorFormulation();

	/**
	 * Returns the meta object for class '{@link SBVR.WhetherOrNotFormulation <em>Whether Or Not Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Whether Or Not Formulation</em>'.
	 * @see SBVR.WhetherOrNotFormulation
	 * @generated
	 */
	EClass getWhetherOrNotFormulation();

	/**
	 * Returns the meta object for the reference '{@link SBVR.WhetherOrNotFormulation#getConsequent <em>Consequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consequent</em>'.
	 * @see SBVR.WhetherOrNotFormulation#getConsequent()
	 * @see #getWhetherOrNotFormulation()
	 * @generated
	 */
	EReference getWhetherOrNotFormulation_Consequent();

	/**
	 * Returns the meta object for the reference '{@link SBVR.WhetherOrNotFormulation#getInconsequent <em>Inconsequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inconsequent</em>'.
	 * @see SBVR.WhetherOrNotFormulation#getInconsequent()
	 * @see #getWhetherOrNotFormulation()
	 * @generated
	 */
	EReference getWhetherOrNotFormulation_Inconsequent();

	/**
	 * Returns the meta object for class '{@link SBVR.UniversalQuantification <em>Universal Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universal Quantification</em>'.
	 * @see SBVR.UniversalQuantification
	 * @generated
	 */
	EClass getUniversalQuantification();

	/**
	 * Returns the meta object for class '{@link SBVR.AtLeastNQuantification <em>At Least NQuantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Least NQuantification</em>'.
	 * @see SBVR.AtLeastNQuantification
	 * @generated
	 */
	EClass getAtLeastNQuantification();

	/**
	 * Returns the meta object for the reference '{@link SBVR.AtLeastNQuantification#getMinimumCardinality <em>Minimum Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Minimum Cardinality</em>'.
	 * @see SBVR.AtLeastNQuantification#getMinimumCardinality()
	 * @see #getAtLeastNQuantification()
	 * @generated
	 */
	EReference getAtLeastNQuantification_MinimumCardinality();

	/**
	 * Returns the meta object for class '{@link SBVR.ExistentialQuantification <em>Existential Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existential Quantification</em>'.
	 * @see SBVR.ExistentialQuantification
	 * @generated
	 */
	EClass getExistentialQuantification();

	/**
	 * Returns the meta object for class '{@link SBVR.NumericRangeQuantification <em>Numeric Range Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Range Quantification</em>'.
	 * @see SBVR.NumericRangeQuantification
	 * @generated
	 */
	EClass getNumericRangeQuantification();

	/**
	 * Returns the meta object for the reference '{@link SBVR.NumericRangeQuantification#getMinimumCardinality <em>Minimum Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Minimum Cardinality</em>'.
	 * @see SBVR.NumericRangeQuantification#getMinimumCardinality()
	 * @see #getNumericRangeQuantification()
	 * @generated
	 */
	EReference getNumericRangeQuantification_MinimumCardinality();

	/**
	 * Returns the meta object for the reference '{@link SBVR.NumericRangeQuantification#getMaximumCardinality <em>Maximum Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maximum Cardinality</em>'.
	 * @see SBVR.NumericRangeQuantification#getMaximumCardinality()
	 * @see #getNumericRangeQuantification()
	 * @generated
	 */
	EReference getNumericRangeQuantification_MaximumCardinality();

	/**
	 * Returns the meta object for class '{@link SBVR.AtMostNQuantification <em>At Most NQuantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Most NQuantification</em>'.
	 * @see SBVR.AtMostNQuantification
	 * @generated
	 */
	EClass getAtMostNQuantification();

	/**
	 * Returns the meta object for the reference '{@link SBVR.AtMostNQuantification#getMaximumCardinality <em>Maximum Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maximum Cardinality</em>'.
	 * @see SBVR.AtMostNQuantification#getMaximumCardinality()
	 * @see #getAtMostNQuantification()
	 * @generated
	 */
	EReference getAtMostNQuantification_MaximumCardinality();

	/**
	 * Returns the meta object for class '{@link SBVR.AtMostOneQuantification <em>At Most One Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Most One Quantification</em>'.
	 * @see SBVR.AtMostOneQuantification
	 * @generated
	 */
	EClass getAtMostOneQuantification();

	/**
	 * Returns the meta object for class '{@link SBVR.ExactlyNQuantification <em>Exactly NQuantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exactly NQuantification</em>'.
	 * @see SBVR.ExactlyNQuantification
	 * @generated
	 */
	EClass getExactlyNQuantification();

	/**
	 * Returns the meta object for the reference '{@link SBVR.ExactlyNQuantification#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cardinality</em>'.
	 * @see SBVR.ExactlyNQuantification#getCardinality()
	 * @see #getExactlyNQuantification()
	 * @generated
	 */
	EReference getExactlyNQuantification_Cardinality();

	/**
	 * Returns the meta object for class '{@link SBVR.ExactlyOneQuantification <em>Exactly One Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exactly One Quantification</em>'.
	 * @see SBVR.ExactlyOneQuantification
	 * @generated
	 */
	EClass getExactlyOneQuantification();

	/**
	 * Returns the meta object for class '{@link SBVR.ProjectingFormulation <em>Projecting Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projecting Formulation</em>'.
	 * @see SBVR.ProjectingFormulation
	 * @generated
	 */
	EClass getProjectingFormulation();

	/**
	 * Returns the meta object for the reference '{@link SBVR.ProjectingFormulation#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projection</em>'.
	 * @see SBVR.ProjectingFormulation#getProjection()
	 * @see #getProjectingFormulation()
	 * @generated
	 */
	EReference getProjectingFormulation_Projection();

	/**
	 * Returns the meta object for the reference '{@link SBVR.ProjectingFormulation#getBindableTarget <em>Bindable Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bindable Target</em>'.
	 * @see SBVR.ProjectingFormulation#getBindableTarget()
	 * @see #getProjectingFormulation()
	 * @generated
	 */
	EReference getProjectingFormulation_BindableTarget();

	/**
	 * Returns the meta object for class '{@link SBVR.AggregationFormulation <em>Aggregation Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Formulation</em>'.
	 * @see SBVR.AggregationFormulation
	 * @generated
	 */
	EClass getAggregationFormulation();

	/**
	 * Returns the meta object for class '{@link SBVR.NounConceptNominalization <em>Noun Concept Nominalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noun Concept Nominalization</em>'.
	 * @see SBVR.NounConceptNominalization
	 * @generated
	 */
	EClass getNounConceptNominalization();

	/**
	 * Returns the meta object for class '{@link SBVR.FactTypeNominalization <em>Fact Type Nominalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Type Nominalization</em>'.
	 * @see SBVR.FactTypeNominalization
	 * @generated
	 */
	EClass getFactTypeNominalization();

	/**
	 * Returns the meta object for class '{@link SBVR.QuestionNominalization <em>Question Nominalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Nominalization</em>'.
	 * @see SBVR.QuestionNominalization
	 * @generated
	 */
	EClass getQuestionNominalization();

	/**
	 * Returns the meta object for class '{@link SBVR.AnswerNominalization <em>Answer Nominalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Nominalization</em>'.
	 * @see SBVR.AnswerNominalization
	 * @generated
	 */
	EClass getAnswerNominalization();

	/**
	 * Returns the meta object for class '{@link SBVR.AuxiliaryVariable <em>Auxiliary Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Variable</em>'.
	 * @see SBVR.AuxiliaryVariable
	 * @generated
	 */
	EClass getAuxiliaryVariable();

	/**
	 * Returns the meta object for the reference '{@link SBVR.AuxiliaryVariable#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projection</em>'.
	 * @see SBVR.AuxiliaryVariable#getProjection()
	 * @see #getAuxiliaryVariable()
	 * @generated
	 */
	EReference getAuxiliaryVariable_Projection();

	/**
	 * Returns the meta object for class '{@link SBVR.BagProjection <em>Bag Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Projection</em>'.
	 * @see SBVR.BagProjection
	 * @generated
	 */
	EClass getBagProjection();

	/**
	 * Returns the meta object for class '{@link SBVR.SetProjection <em>Set Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Projection</em>'.
	 * @see SBVR.SetProjection
	 * @generated
	 */
	EClass getSetProjection();

	/**
	 * Returns the meta object for class '{@link SBVR.LogicalFormulationKind <em>Logical Formulation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Formulation Kind</em>'.
	 * @see SBVR.LogicalFormulationKind
	 * @generated
	 */
	EClass getLogicalFormulationKind();

	/**
	 * Returns the meta object for class '{@link SBVR.ClosedProjection <em>Closed Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closed Projection</em>'.
	 * @see SBVR.ClosedProjection
	 * @generated
	 */
	EClass getClosedProjection();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.ClosedProjection#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Definition</em>'.
	 * @see SBVR.ClosedProjection#getDefinition()
	 * @see #getClosedProjection()
	 * @generated
	 */
	EReference getClosedProjection_Definition();

	/**
	 * Returns the meta object for the reference '{@link SBVR.ClosedProjection#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Type</em>'.
	 * @see SBVR.ClosedProjection#getObjectType()
	 * @see #getClosedProjection()
	 * @generated
	 */
	EReference getClosedProjection_ObjectType();

	/**
	 * Returns the meta object for the reference '{@link SBVR.ClosedProjection#getFactType <em>Fact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fact Type</em>'.
	 * @see SBVR.ClosedProjection#getFactType()
	 * @see #getClosedProjection()
	 * @generated
	 */
	EReference getClosedProjection_FactType();

	/**
	 * Returns the meta object for the reference '{@link SBVR.ClosedProjection#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Question</em>'.
	 * @see SBVR.ClosedProjection#getQuestion()
	 * @see #getClosedProjection()
	 * @generated
	 */
	EReference getClosedProjection_Question();

	/**
	 * Returns the meta object for class '{@link SBVR.CategorizationScheme <em>Categorization Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorization Scheme</em>'.
	 * @see SBVR.CategorizationScheme
	 * @generated
	 */
	EClass getCategorizationScheme();

	/**
	 * Returns the meta object for the reference '{@link SBVR.CategorizationScheme#getIsBasedOn <em>Is Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Based On</em>'.
	 * @see SBVR.CategorizationScheme#getIsBasedOn()
	 * @see #getCategorizationScheme()
	 * @generated
	 */
	EReference getCategorizationScheme_IsBasedOn();

	/**
	 * Returns the meta object for the containment reference list '{@link SBVR.CategorizationScheme#getContainsCategory <em>Contains Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Category</em>'.
	 * @see SBVR.CategorizationScheme#getContainsCategory()
	 * @see #getCategorizationScheme()
	 * @generated
	 */
	EReference getCategorizationScheme_ContainsCategory();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.CategorizationScheme#getIsFor <em>Is For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is For</em>'.
	 * @see SBVR.CategorizationScheme#getIsFor()
	 * @see #getCategorizationScheme()
	 * @generated
	 */
	EReference getCategorizationScheme_IsFor();

	/**
	 * Returns the meta object for class '{@link SBVR.CategorizationType <em>Categorization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorization Type</em>'.
	 * @see SBVR.CategorizationType
	 * @generated
	 */
	EClass getCategorizationType();

	/**
	 * Returns the meta object for the reference list '{@link SBVR.CategorizationType#getIsFor <em>Is For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is For</em>'.
	 * @see SBVR.CategorizationType#getIsFor()
	 * @see #getCategorizationType()
	 * @generated
	 */
	EReference getCategorizationType_IsFor();

	/**
	 * Returns the meta object for class '{@link SBVR.Segmentation <em>Segmentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segmentation</em>'.
	 * @see SBVR.Segmentation
	 * @generated
	 */
	EClass getSegmentation();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EClass</em>'.
	 * @see org.eclipse.emf.ecore.EClass
	 * @model instanceClass="org.eclipse.emf.ecore.EClass"
	 * @generated
	 */
	EDataType getEClass();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getIntegerObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBooleanObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SBVRFactory getSBVRFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SBVR.impl.BodyOfSharedMeaningsImpl <em>Body Of Shared Meanings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.BodyOfSharedMeaningsImpl
		 * @see SBVR.impl.SBVRPackageImpl#getBodyOfSharedMeanings()
		 * @generated
		 */
		EClass BODY_OF_SHARED_MEANINGS = eINSTANCE.getBodyOfSharedMeanings();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_OF_SHARED_MEANINGS__CONCEPT = eINSTANCE.getBodyOfSharedMeanings_Concept();

		/**
		 * The meta object literal for the '<em><b>Proposition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_OF_SHARED_MEANINGS__PROPOSITION = eINSTANCE.getBodyOfSharedMeanings_Proposition();

		/**
		 * The meta object literal for the '{@link SBVR.impl.TerminologicalDictionaryImpl <em>Terminological Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.TerminologicalDictionaryImpl
		 * @see SBVR.impl.SBVRPackageImpl#getTerminologicalDictionary()
		 * @generated
		 */
		EClass TERMINOLOGICAL_DICTIONARY = eINSTANCE.getTerminologicalDictionary();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGICAL_DICTIONARY__REPRESENTATION = eINSTANCE.getTerminologicalDictionary_Representation();

		/**
		 * The meta object literal for the '<em><b>Vocabulary</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGICAL_DICTIONARY__VOCABULARY = eINSTANCE.getTerminologicalDictionary_Vocabulary();

		/**
		 * The meta object literal for the '<em><b>Body Of Shared Meaning</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGICAL_DICTIONARY__BODY_OF_SHARED_MEANING = eINSTANCE.getTerminologicalDictionary_BodyOfSharedMeaning();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGICAL_DICTIONARY__URI = eINSTANCE.getTerminologicalDictionary_Uri();

		/**
		 * The meta object literal for the '{@link SBVR.impl.VocabularyImpl <em>Vocabulary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.VocabularyImpl
		 * @see SBVR.impl.SBVRPackageImpl#getVocabulary()
		 * @generated
		 */
		EClass VOCABULARY = eINSTANCE.getVocabulary();

		/**
		 * The meta object literal for the '<em><b>Designation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOCABULARY__DESIGNATION = eINSTANCE.getVocabulary_Designation();

		/**
		 * The meta object literal for the '<em><b>Fact Type Form</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOCABULARY__FACT_TYPE_FORM = eINSTANCE.getVocabulary_FactTypeForm();

		/**
		 * The meta object literal for the '<em><b>Body Of Shared Meaning</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOCABULARY__BODY_OF_SHARED_MEANING = eINSTANCE.getVocabulary_BodyOfSharedMeaning();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOCABULARY__NAMESPACE = eINSTANCE.getVocabulary_Namespace();

		/**
		 * The meta object literal for the '<em><b>Incorporated Vocabulary</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOCABULARY__INCORPORATED_VOCABULARY = eINSTANCE.getVocabulary_IncorporatedVocabulary();

		/**
		 * The meta object literal for the '{@link SBVR.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.TermImpl
		 * @see SBVR.impl.SBVRPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link SBVR.impl.QualifiedDesignationImpl <em>Qualified Designation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.QualifiedDesignationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getQualifiedDesignation()
		 * @generated
		 */
		EClass QUALIFIED_DESIGNATION = eINSTANCE.getQualifiedDesignation();

		/**
		 * The meta object literal for the '<em><b>Preferred</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_DESIGNATION__PREFERRED = eINSTANCE.getQualifiedDesignation_Preferred();

		/**
		 * The meta object literal for the '<em><b>Prohibited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_DESIGNATION__PROHIBITED = eINSTANCE.getQualifiedDesignation_Prohibited();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NameImpl
		 * @see SBVR.impl.SBVRPackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME__REFERS_TO = eINSTANCE.getName_RefersTo();

		/**
		 * The meta object literal for the '{@link SBVR.impl.FactSymbolImpl <em>Fact Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.FactSymbolImpl
		 * @see SBVR.impl.SBVRPackageImpl#getFactSymbol()
		 * @generated
		 */
		EClass FACT_SYMBOL = eINSTANCE.getFactSymbol();

		/**
		 * The meta object literal for the '{@link SBVR.impl.RulebookImpl <em>Rulebook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.RulebookImpl
		 * @see SBVR.impl.SBVRPackageImpl#getRulebook()
		 * @generated
		 */
		EClass RULEBOOK = eINSTANCE.getRulebook();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULEBOOK__REPRESENTATION = eINSTANCE.getRulebook_Representation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.BusinessVocabularyImpl <em>Business Vocabulary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.BusinessVocabularyImpl
		 * @see SBVR.impl.SBVRPackageImpl#getBusinessVocabulary()
		 * @generated
		 */
		EClass BUSINESS_VOCABULARY = eINSTANCE.getBusinessVocabulary();

		/**
		 * The meta object literal for the '{@link SBVR.impl.SubjectFieldImpl <em>Subject Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.SubjectFieldImpl
		 * @see SBVR.impl.SBVRPackageImpl#getSubjectField()
		 * @generated
		 */
		EClass SUBJECT_FIELD = eINSTANCE.getSubjectField();

		/**
		 * The meta object literal for the '{@link SBVR.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.DescriptionImpl
		 * @see SBVR.impl.SBVRPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '{@link SBVR.impl.DescriptiveExampleImpl <em>Descriptive Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.DescriptiveExampleImpl
		 * @see SBVR.impl.SBVRPackageImpl#getDescriptiveExample()
		 * @generated
		 */
		EClass DESCRIPTIVE_EXAMPLE = eINSTANCE.getDescriptiveExample();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NoteImpl
		 * @see SBVR.impl.SBVRPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ReferenceImpl
		 * @see SBVR.impl.SBVRPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Information Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__INFORMATION_SOURCE = eINSTANCE.getReference_InformationSource();

		/**
		 * The meta object literal for the '{@link SBVR.impl.CommunicationContentImpl <em>Communication Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.CommunicationContentImpl
		 * @see SBVR.impl.SBVRPackageImpl#getCommunicationContent()
		 * @generated
		 */
		EClass COMMUNICATION_CONTENT = eINSTANCE.getCommunicationContent();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_CONTENT__REPRESENTATION = eINSTANCE.getCommunicationContent_Representation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.CommunityImpl <em>Community</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.CommunityImpl
		 * @see SBVR.impl.SBVRPackageImpl#getCommunity()
		 * @generated
		 */
		EClass COMMUNITY = eINSTANCE.getCommunity();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNITY__URI = eINSTANCE.getCommunity_Uri();

		/**
		 * The meta object literal for the '<em><b>Sub Community</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNITY__SUB_COMMUNITY = eINSTANCE.getCommunity_SubCommunity();

		/**
		 * The meta object literal for the '{@link SBVR.impl.SemanticCommunityImpl <em>Semantic Community</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.SemanticCommunityImpl
		 * @see SBVR.impl.SBVRPackageImpl#getSemanticCommunity()
		 * @generated
		 */
		EClass SEMANTIC_COMMUNITY = eINSTANCE.getSemanticCommunity();

		/**
		 * The meta object literal for the '<em><b>Speech Community</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_COMMUNITY__SPEECH_COMMUNITY = eINSTANCE.getSemanticCommunity_SpeechCommunity();

		/**
		 * The meta object literal for the '{@link SBVR.impl.SpeechCommunityImpl <em>Speech Community</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.SpeechCommunityImpl
		 * @see SBVR.impl.SBVRPackageImpl#getSpeechCommunity()
		 * @generated
		 */
		EClass SPEECH_COMMUNITY = eINSTANCE.getSpeechCommunity();

		/**
		 * The meta object literal for the '<em><b>Owned Vocabulary</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH_COMMUNITY__OWNED_VOCABULARY = eINSTANCE.getSpeechCommunity_OwnedVocabulary();

		/**
		 * The meta object literal for the '<em><b>Used Vocabulary</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEECH_COMMUNITY__USED_VOCABULARY = eINSTANCE.getSpeechCommunity_UsedVocabulary();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NonverbalDesignationImpl <em>Nonverbal Designation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NonverbalDesignationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getNonverbalDesignation()
		 * @generated
		 */
		EClass NONVERBAL_DESIGNATION = eINSTANCE.getNonverbalDesignation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.IconImpl
		 * @see SBVR.impl.SBVRPackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '{@link SBVR.impl.PartitiveFactTypeImpl <em>Partitive Fact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.PartitiveFactTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getPartitiveFactType()
		 * @generated
		 */
		EClass PARTITIVE_FACT_TYPE = eINSTANCE.getPartitiveFactType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.FundamentalConceptImpl <em>Fundamental Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.FundamentalConceptImpl
		 * @see SBVR.impl.SBVRPackageImpl#getFundamentalConcept()
		 * @generated
		 */
		EClass FUNDAMENTAL_CONCEPT = eINSTANCE.getFundamentalConcept();

		/**
		 * The meta object literal for the '{@link SBVR.impl.SituationalRoleImpl <em>Situational Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.SituationalRoleImpl
		 * @see SBVR.impl.SBVRPackageImpl#getSituationalRole()
		 * @generated
		 */
		EClass SITUATIONAL_ROLE = eINSTANCE.getSituationalRole();

		/**
		 * The meta object literal for the '{@link SBVR.impl.AssociativeFactTypeImpl <em>Associative Fact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.AssociativeFactTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getAssociativeFactType()
		 * @generated
		 */
		EClass ASSOCIATIVE_FACT_TYPE = eINSTANCE.getAssociativeFactType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.IsPropertyOfFactTypeImpl <em>Is Property Of Fact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.IsPropertyOfFactTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getIsPropertyOfFactType()
		 * @generated
		 */
		EClass IS_PROPERTY_OF_FACT_TYPE = eINSTANCE.getIsPropertyOfFactType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.AssortmentFactTypeImpl <em>Assortment Fact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.AssortmentFactTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getAssortmentFactType()
		 * @generated
		 */
		EClass ASSORTMENT_FACT_TYPE = eINSTANCE.getAssortmentFactType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.SpecializationFactTypeImpl <em>Specialization Fact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.SpecializationFactTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getSpecializationFactType()
		 * @generated
		 */
		EClass SPECIALIZATION_FACT_TYPE = eINSTANCE.getSpecializationFactType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.CategorizationFactTypeImpl <em>Categorization Fact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.CategorizationFactTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getCategorizationFactType()
		 * @generated
		 */
		EClass CATEGORIZATION_FACT_TYPE = eINSTANCE.getCategorizationFactType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ContextualizationFactTypeImpl <em>Contextualization Fact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ContextualizationFactTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getContextualizationFactType()
		 * @generated
		 */
		EClass CONTEXTUALIZATION_FACT_TYPE = eINSTANCE.getContextualizationFactType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ContextualizedConceptImpl <em>Contextualized Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ContextualizedConceptImpl
		 * @see SBVR.impl.SBVRPackageImpl#getContextualizedConcept()
		 * @generated
		 */
		EClass CONTEXTUALIZED_CONCEPT = eINSTANCE.getContextualizedConcept();

		/**
		 * The meta object literal for the '{@link SBVR.impl.FacetImpl <em>Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.FacetImpl
		 * @see SBVR.impl.SBVRPackageImpl#getFacet()
		 * @generated
		 */
		EClass FACET = eINSTANCE.getFacet();

		/**
		 * The meta object literal for the '{@link SBVR.impl.IsRoleOfFactTypeImpl <em>Is Role Of Fact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.IsRoleOfFactTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getIsRoleOfFactType()
		 * @generated
		 */
		EClass IS_ROLE_OF_FACT_TYPE = eINSTANCE.getIsRoleOfFactType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.IsFacetOfFactTypeImpl <em>Is Facet Of Fact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.IsFacetOfFactTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getIsFacetOfFactType()
		 * @generated
		 */
		EClass IS_FACET_OF_FACT_TYPE = eINSTANCE.getIsFacetOfFactType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ElementOfGuidanceImpl <em>Element Of Guidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ElementOfGuidanceImpl
		 * @see SBVR.impl.SBVRPackageImpl#getElementOfGuidance()
		 * @generated
		 */
		EClass ELEMENT_OF_GUIDANCE = eINSTANCE.getElementOfGuidance();

		/**
		 * The meta object literal for the '{@link SBVR.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.RuleImpl
		 * @see SBVR.impl.SBVRPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '{@link SBVR.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.PackageImpl
		 * @see SBVR.impl.SBVRPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGED_ELEMENT = eINSTANCE.getPackage_PackagedElement();

		/**
		 * The meta object literal for the '<em><b>Nested Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__NESTED_PACKAGE = eINSTANCE.getPackage_NestedPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ThingImpl
		 * @see SBVR.impl.SBVRPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ConceptualSchemaImpl <em>Conceptual Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ConceptualSchemaImpl
		 * @see SBVR.impl.SBVRPackageImpl#getConceptualSchema()
		 * @generated
		 */
		EClass CONCEPTUAL_SCHEMA = eINSTANCE.getConceptualSchema();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_SCHEMA__CONCEPT = eINSTANCE.getConceptualSchema_Concept();

		/**
		 * The meta object literal for the '<em><b>Fact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_SCHEMA__FACT = eINSTANCE.getConceptualSchema_Fact();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ConceptImpl
		 * @see SBVR.impl.SBVRPackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '<em><b>Designation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__DESIGNATION = eINSTANCE.getConcept_Designation();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__DEFINITION = eINSTANCE.getConcept_Definition();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__GENERAL = eINSTANCE.getConcept_General();

		/**
		 * The meta object literal for the '<em><b>Coextensive</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__COEXTENSIVE = eINSTANCE.getConcept_Coextensive();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__INSTANCE = eINSTANCE.getConcept_Instance();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__EXTENSION = eINSTANCE.getConcept_Extension();

		/**
		 * The meta object literal for the '<em><b>Reference Scheme</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__REFERENCE_SCHEME = eINSTANCE.getConcept_ReferenceScheme();

		/**
		 * The meta object literal for the '{@link SBVR.impl.MeaningImpl <em>Meaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.MeaningImpl
		 * @see SBVR.impl.SBVRPackageImpl#getMeaning()
		 * @generated
		 */
		EClass MEANING = eINSTANCE.getMeaning();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEANING__REPRESENTATION = eINSTANCE.getMeaning_Representation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.RepresentationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getRepresentation()
		 * @generated
		 */
		EClass REPRESENTATION = eINSTANCE.getRepresentation();

		/**
		 * The meta object literal for the '<em><b>Meaning</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__MEANING = eINSTANCE.getRepresentation_Meaning();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION__EXPRESSION = eINSTANCE.getRepresentation_Expression();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ActualityImpl <em>Actuality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ActualityImpl
		 * @see SBVR.impl.SBVRPackageImpl#getActuality()
		 * @generated
		 */
		EClass ACTUALITY = eINSTANCE.getActuality();

		/**
		 * The meta object literal for the '{@link SBVR.impl.StateOfAffairsImpl <em>State Of Affairs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.StateOfAffairsImpl
		 * @see SBVR.impl.SBVRPackageImpl#getStateOfAffairs()
		 * @generated
		 */
		EClass STATE_OF_AFFAIRS = eINSTANCE.getStateOfAffairs();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ExpressionImpl
		 * @see SBVR.impl.SBVRPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link SBVR.impl.BindableTargetImpl <em>Bindable Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.BindableTargetImpl
		 * @see SBVR.impl.SBVRPackageImpl#getBindableTarget()
		 * @generated
		 */
		EClass BINDABLE_TARGET = eINSTANCE.getBindableTarget();

		/**
		 * The meta object literal for the '{@link SBVR.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.DefinitionImpl
		 * @see SBVR.impl.SBVRPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '{@link SBVR.impl.DesignationImpl <em>Designation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.DesignationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getDesignation()
		 * @generated
		 */
		EClass DESIGNATION = eINSTANCE.getDesignation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.SetImpl
		 * @see SBVR.impl.SBVRPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__CARDINALITY = eINSTANCE.getSet_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__ELEMENT = eINSTANCE.getSet_Element();

		/**
		 * The meta object literal for the '{@link SBVR.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.IntegerImpl
		 * @see SBVR.impl.SBVRPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NumberImpl
		 * @see SBVR.impl.SBVRPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link SBVR.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.QuantityImpl
		 * @see SBVR.impl.SBVRPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Equal To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__EQUAL_TO = eINSTANCE.getQuantity_EqualTo();

		/**
		 * The meta object literal for the '<em><b>Less Than</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__LESS_THAN = eINSTANCE.getQuantity_LessThan();

		/**
		 * The meta object literal for the '<em><b>Greater Than</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__GREATER_THAN = eINSTANCE.getQuantity_GreaterThan();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NounConceptImpl <em>Noun Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NounConceptImpl
		 * @see SBVR.impl.SBVRPackageImpl#getNounConcept()
		 * @generated
		 */
		EClass NOUN_CONCEPT = eINSTANCE.getNounConcept();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ReferenceSchemeImpl <em>Reference Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ReferenceSchemeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getReferenceScheme()
		 * @generated
		 */
		EClass REFERENCE_SCHEME = eINSTANCE.getReferenceScheme();

		/**
		 * The meta object literal for the '<em><b>Extensionally Used Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_SCHEME__EXTENSIONALLY_USED_ROLE = eINSTANCE.getReferenceScheme_ExtensionallyUsedRole();

		/**
		 * The meta object literal for the '<em><b>Simply Used Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_SCHEME__SIMPLY_USED_ROLE = eINSTANCE.getReferenceScheme_SimplyUsedRole();

		/**
		 * The meta object literal for the '<em><b>Identifying Characteristic</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_SCHEME__IDENTIFYING_CHARACTERISTIC = eINSTANCE.getReferenceScheme_IdentifyingCharacteristic();

		/**
		 * The meta object literal for the '{@link SBVR.impl.FactTypeRoleImpl <em>Fact Type Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.FactTypeRoleImpl
		 * @see SBVR.impl.SBVRPackageImpl#getFactTypeRole()
		 * @generated
		 */
		EClass FACT_TYPE_ROLE = eINSTANCE.getFactTypeRole();

		/**
		 * The meta object literal for the '{@link SBVR.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.RoleImpl
		 * @see SBVR.impl.SBVRPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__OBJECT_TYPE = eINSTANCE.getRole_ObjectType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ObjectTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getObjectType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getObjectType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.CharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.CharacteristicImpl
		 * @see SBVR.impl.SBVRPackageImpl#getCharacteristic()
		 * @generated
		 */
		EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

		/**
		 * The meta object literal for the '{@link SBVR.impl.FactTypeImpl <em>Fact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.FactTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getFactType()
		 * @generated
		 */
		EClass FACT_TYPE = eINSTANCE.getFactType();

		/**
		 * The meta object literal for the '<em><b>Fact Type Form</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_TYPE__FACT_TYPE_FORM = eINSTANCE.getFactType_FactTypeForm();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_TYPE__ROLE = eINSTANCE.getFactType_Role();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_TYPE__HAS = eINSTANCE.getFactType_Has();

		/**
		 * The meta object literal for the '{@link SBVR.impl.FactTypeFormImpl <em>Fact Type Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.FactTypeFormImpl
		 * @see SBVR.impl.SBVRPackageImpl#getFactTypeForm()
		 * @generated
		 */
		EClass FACT_TYPE_FORM = eINSTANCE.getFactTypeForm();

		/**
		 * The meta object literal for the '<em><b>Designation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_TYPE_FORM__DESIGNATION = eINSTANCE.getFactTypeForm_Designation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.PlaceholderImpl <em>Placeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.PlaceholderImpl
		 * @see SBVR.impl.SBVRPackageImpl#getPlaceholder()
		 * @generated
		 */
		EClass PLACEHOLDER = eINSTANCE.getPlaceholder();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACEHOLDER__USES = eINSTANCE.getPlaceholder_Uses();

		/**
		 * The meta object literal for the '<em><b>Is At Starting Character Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACEHOLDER__IS_AT_STARTING_CHARACTER_POSITION = eINSTANCE.getPlaceholder_IsAtStartingCharacterPosition();

		/**
		 * The meta object literal for the '{@link SBVR.impl.BinaryFactTypeImpl <em>Binary Fact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.BinaryFactTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getBinaryFactType()
		 * @generated
		 */
		EClass BINARY_FACT_TYPE = eINSTANCE.getBinaryFactType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.FactImpl <em>Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.FactImpl
		 * @see SBVR.impl.SBVRPackageImpl#getFact()
		 * @generated
		 */
		EClass FACT = eINSTANCE.getFact();

		/**
		 * The meta object literal for the '{@link SBVR.impl.PropositionImpl <em>Proposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.PropositionImpl
		 * @see SBVR.impl.SBVRPackageImpl#getProposition()
		 * @generated
		 */
		EClass PROPOSITION = eINSTANCE.getProposition();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSITION__STATEMENT = eINSTANCE.getProposition_Statement();

		/**
		 * The meta object literal for the '<em><b>Is True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSITION__IS_TRUE = eINSTANCE.getProposition_IsTrue();

		/**
		 * The meta object literal for the '<em><b>Is False</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSITION__IS_FALSE = eINSTANCE.getProposition_IsFalse();

		/**
		 * The meta object literal for the '<em><b>Is Necessarily True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSITION__IS_NECESSARILY_TRUE = eINSTANCE.getProposition_IsNecessarilyTrue();

		/**
		 * The meta object literal for the '<em><b>Is Possibily True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSITION__IS_POSSIBILY_TRUE = eINSTANCE.getProposition_IsPossibilyTrue();

		/**
		 * The meta object literal for the '<em><b>Is Obligated To Be True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSITION__IS_OBLIGATED_TO_BE_TRUE = eINSTANCE.getProposition_IsObligatedToBeTrue();

		/**
		 * The meta object literal for the '<em><b>Is Permitted To Be True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSITION__IS_PERMITTED_TO_BE_TRUE = eINSTANCE.getProposition_IsPermittedToBeTrue();

		/**
		 * The meta object literal for the '{@link SBVR.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.StatementImpl
		 * @see SBVR.impl.SBVRPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link SBVR.impl.FactModelImpl <em>Fact Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.FactModelImpl
		 * @see SBVR.impl.SBVRPackageImpl#getFactModel()
		 * @generated
		 */
		EClass FACT_MODEL = eINSTANCE.getFactModel();

		/**
		 * The meta object literal for the '<em><b>Conceptual Schema</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_MODEL__CONCEPTUAL_SCHEMA = eINSTANCE.getFactModel_ConceptualSchema();

		/**
		 * The meta object literal for the '<em><b>Fact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_MODEL__FACT = eINSTANCE.getFactModel_Fact();

		/**
		 * The meta object literal for the '{@link SBVR.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.TextImpl
		 * @see SBVR.impl.SBVRPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

		/**
		 * The meta object literal for the '{@link SBVR.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.QuestionImpl
		 * @see SBVR.impl.SBVRPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NamespaceImpl
		 * @see SBVR.impl.SBVRPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Designation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__DESIGNATION = eINSTANCE.getNamespace_Designation();

		/**
		 * The meta object literal for the '<em><b>Fact Type Form</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__FACT_TYPE_FORM = eINSTANCE.getNamespace_FactTypeForm();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__URI = eINSTANCE.getNamespace_Uri();

		/**
		 * The meta object literal for the '<em><b>Incorporated Namespace</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__INCORPORATED_NAMESPACE = eINSTANCE.getNamespace_IncorporatedNamespace();

		/**
		 * The meta object literal for the '{@link SBVR.impl.URIImpl <em>URI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.URIImpl
		 * @see SBVR.impl.SBVRPackageImpl#getURI()
		 * @generated
		 */
		EClass URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '{@link SBVR.impl.IndividualConceptImpl <em>Individual Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.IndividualConceptImpl
		 * @see SBVR.impl.SBVRPackageImpl#getIndividualConcept()
		 * @generated
		 */
		EClass INDIVIDUAL_CONCEPT = eINSTANCE.getIndividualConcept();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ConceptTypeImpl <em>Concept Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ConceptTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getConceptType()
		 * @generated
		 */
		EClass CONCEPT_TYPE = eINSTANCE.getConceptType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NonNegativeIntegerImpl <em>Non Negative Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NonNegativeIntegerImpl
		 * @see SBVR.impl.SBVRPackageImpl#getNonNegativeInteger()
		 * @generated
		 */
		EClass NON_NEGATIVE_INTEGER = eINSTANCE.getNonNegativeInteger();

		/**
		 * The meta object literal for the '{@link SBVR.impl.PositiveIntegerImpl <em>Positive Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.PositiveIntegerImpl
		 * @see SBVR.impl.SBVRPackageImpl#getPositiveInteger()
		 * @generated
		 */
		EClass POSITIVE_INTEGER = eINSTANCE.getPositiveInteger();

		/**
		 * The meta object literal for the '{@link SBVR.impl.SententialFormImpl <em>Sentential Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.SententialFormImpl
		 * @see SBVR.impl.SBVRPackageImpl#getSententialForm()
		 * @generated
		 */
		EClass SENTENTIAL_FORM = eINSTANCE.getSententialForm();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NounFormImpl <em>Noun Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NounFormImpl
		 * @see SBVR.impl.SBVRPackageImpl#getNounForm()
		 * @generated
		 */
		EClass NOUN_FORM = eINSTANCE.getNounForm();

		/**
		 * The meta object literal for the '{@link SBVR.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.LanguageImpl
		 * @see SBVR.impl.SBVRPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '{@link SBVR.impl.VocabularyNamespaceImpl <em>Vocabulary Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.VocabularyNamespaceImpl
		 * @see SBVR.impl.SBVRPackageImpl#getVocabularyNamespace()
		 * @generated
		 */
		EClass VOCABULARY_NAMESPACE = eINSTANCE.getVocabularyNamespace();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOCABULARY_NAMESPACE__LANGUAGE = eINSTANCE.getVocabularyNamespace_Language();

		/**
		 * The meta object literal for the '<em><b>Attributive Namespace</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOCABULARY_NAMESPACE__ATTRIBUTIVE_NAMESPACE = eINSTANCE.getVocabularyNamespace_AttributiveNamespace();

		/**
		 * The meta object literal for the '{@link SBVR.impl.AttributiveNamespaceImpl <em>Attributive Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.AttributiveNamespaceImpl
		 * @see SBVR.impl.SBVRPackageImpl#getAttributiveNamespace()
		 * @generated
		 */
		EClass ATTRIBUTIVE_NAMESPACE = eINSTANCE.getAttributiveNamespace();

		/**
		 * The meta object literal for the '<em><b>Subject Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTIVE_NAMESPACE__SUBJECT_CONCEPT = eINSTANCE.getAttributiveNamespace_SubjectConcept();

		/**
		 * The meta object literal for the '{@link SBVR.impl.SemanticFormulationImpl <em>Semantic Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.SemanticFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getSemanticFormulation()
		 * @generated
		 */
		EClass SEMANTIC_FORMULATION = eINSTANCE.getSemanticFormulation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_FORMULATION__VARIABLE = eINSTANCE.getSemanticFormulation_Variable();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ClosedSemanticFormulationImpl <em>Closed Semantic Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ClosedSemanticFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getClosedSemanticFormulation()
		 * @generated
		 */
		EClass CLOSED_SEMANTIC_FORMULATION = eINSTANCE.getClosedSemanticFormulation();

		/**
		 * The meta object literal for the '<em><b>Meaning</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOSED_SEMANTIC_FORMULATION__MEANING = eINSTANCE.getClosedSemanticFormulation_Meaning();

		/**
		 * The meta object literal for the '{@link SBVR.impl.LogicalFormulationImpl <em>Logical Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.LogicalFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getLogicalFormulation()
		 * @generated
		 */
		EClass LOGICAL_FORMULATION = eINSTANCE.getLogicalFormulation();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_FORMULATION__STATEMENT = eINSTANCE.getLogicalFormulation_Statement();

		/**
		 * The meta object literal for the '<em><b>Proposition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_FORMULATION__PROPOSITION = eINSTANCE.getLogicalFormulation_Proposition();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ProjectionImpl <em>Projection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ProjectionImpl
		 * @see SBVR.impl.SBVRPackageImpl#getProjection()
		 * @generated
		 */
		EClass PROJECTION = eINSTANCE.getProjection();

		/**
		 * The meta object literal for the '<em><b>Constraining Formulation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION__CONSTRAINING_FORMULATION = eINSTANCE.getProjection_ConstrainingFormulation();

		/**
		 * The meta object literal for the '<em><b>Projection Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION__PROJECTION_VARIABLE = eINSTANCE.getProjection_ProjectionVariable();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION__AUXILIARY_VARIABLE = eINSTANCE.getProjection_AuxiliaryVariable();

		/**
		 * The meta object literal for the '{@link SBVR.impl.AtomicFormulationImpl <em>Atomic Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.AtomicFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getAtomicFormulation()
		 * @generated
		 */
		EClass ATOMIC_FORMULATION = eINSTANCE.getAtomicFormulation();

		/**
		 * The meta object literal for the '<em><b>Fact Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_FORMULATION__FACT_TYPE = eINSTANCE.getAtomicFormulation_FactType();

		/**
		 * The meta object literal for the '{@link SBVR.impl.InstantiationFormulationImpl <em>Instantiation Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.InstantiationFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getInstantiationFormulation()
		 * @generated
		 */
		EClass INSTANTIATION_FORMULATION = eINSTANCE.getInstantiationFormulation();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_FORMULATION__CONCEPT = eINSTANCE.getInstantiationFormulation_Concept();

		/**
		 * The meta object literal for the '<em><b>Bindable Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_FORMULATION__BINDABLE_TARGET = eINSTANCE.getInstantiationFormulation_BindableTarget();

		/**
		 * The meta object literal for the '{@link SBVR.impl.QuantificationImpl <em>Quantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.QuantificationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getQuantification()
		 * @generated
		 */
		EClass QUANTIFICATION = eINSTANCE.getQuantification();

		/**
		 * The meta object literal for the '<em><b>Scope Formulation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFICATION__SCOPE_FORMULATION = eINSTANCE.getQuantification_ScopeFormulation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ObjectificationImpl <em>Objectification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ObjectificationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getObjectification()
		 * @generated
		 */
		EClass OBJECTIFICATION = eINSTANCE.getObjectification();

		/**
		 * The meta object literal for the '<em><b>Logical Formulation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIFICATION__LOGICAL_FORMULATION = eINSTANCE.getObjectification_LogicalFormulation();

		/**
		 * The meta object literal for the '<em><b>Bindable Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIFICATION__BINDABLE_TARGET = eINSTANCE.getObjectification_BindableTarget();

		/**
		 * The meta object literal for the '{@link SBVR.impl.PropositionNominalizationImpl <em>Proposition Nominalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.PropositionNominalizationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getPropositionNominalization()
		 * @generated
		 */
		EClass PROPOSITION_NOMINALIZATION = eINSTANCE.getPropositionNominalization();

		/**
		 * The meta object literal for the '<em><b>Logical Formulation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSITION_NOMINALIZATION__LOGICAL_FORMULATION = eINSTANCE.getPropositionNominalization_LogicalFormulation();

		/**
		 * The meta object literal for the '<em><b>Bindable Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSITION_NOMINALIZATION__BINDABLE_TARGET = eINSTANCE.getPropositionNominalization_BindableTarget();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ClosedLogicalFormulationImpl <em>Closed Logical Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ClosedLogicalFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getClosedLogicalFormulation()
		 * @generated
		 */
		EClass CLOSED_LOGICAL_FORMULATION = eINSTANCE.getClosedLogicalFormulation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.VariableImpl
		 * @see SBVR.impl.SBVRPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Restricting Formulation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__RESTRICTING_FORMULATION = eINSTANCE.getVariable_RestrictingFormulation();

		/**
		 * The meta object literal for the '<em><b>Is Unitary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__IS_UNITARY = eINSTANCE.getVariable_IsUnitary();

		/**
		 * The meta object literal for the '<em><b>Quantification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__QUANTIFICATION = eINSTANCE.getVariable_Quantification();

		/**
		 * The meta object literal for the '<em><b>Ranged Over Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__RANGED_OVER_CONCEPT = eINSTANCE.getVariable_RangedOverConcept();

		/**
		 * The meta object literal for the '<em><b>Fact Type Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__FACT_TYPE_ROLE = eINSTANCE.getVariable_FactTypeRole();

		/**
		 * The meta object literal for the '<em><b>Projection Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__PROJECTION_POSITION = eINSTANCE.getVariable_ProjectionPosition();

		/**
		 * The meta object literal for the '{@link SBVR.impl.RoleBindingImpl <em>Role Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.RoleBindingImpl
		 * @see SBVR.impl.SBVRPackageImpl#getRoleBinding()
		 * @generated
		 */
		EClass ROLE_BINDING = eINSTANCE.getRoleBinding();

		/**
		 * The meta object literal for the '<em><b>Atomic Formulation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_BINDING__ATOMIC_FORMULATION = eINSTANCE.getRoleBinding_AtomicFormulation();

		/**
		 * The meta object literal for the '<em><b>Bindable Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_BINDING__BINDABLE_TARGET = eINSTANCE.getRoleBinding_BindableTarget();

		/**
		 * The meta object literal for the '<em><b>Fact Type Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_BINDING__FACT_TYPE_ROLE = eINSTANCE.getRoleBinding_FactTypeRole();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ModalFormulationImpl <em>Modal Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ModalFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getModalFormulation()
		 * @generated
		 */
		EClass MODAL_FORMULATION = eINSTANCE.getModalFormulation();

		/**
		 * The meta object literal for the '<em><b>Logical Formulation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODAL_FORMULATION__LOGICAL_FORMULATION = eINSTANCE.getModalFormulation_LogicalFormulation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NecessityFormulationImpl <em>Necessity Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NecessityFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getNecessityFormulation()
		 * @generated
		 */
		EClass NECESSITY_FORMULATION = eINSTANCE.getNecessityFormulation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ObligationFormulationImpl <em>Obligation Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ObligationFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getObligationFormulation()
		 * @generated
		 */
		EClass OBLIGATION_FORMULATION = eINSTANCE.getObligationFormulation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.PermissibilityFormulationImpl <em>Permissibility Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.PermissibilityFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getPermissibilityFormulation()
		 * @generated
		 */
		EClass PERMISSIBILITY_FORMULATION = eINSTANCE.getPermissibilityFormulation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.PossibilityFormulationImpl <em>Possibility Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.PossibilityFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getPossibilityFormulation()
		 * @generated
		 */
		EClass POSSIBILITY_FORMULATION = eINSTANCE.getPossibilityFormulation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.LogicalOperationImpl <em>Logical Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.LogicalOperationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getLogicalOperation()
		 * @generated
		 */
		EClass LOGICAL_OPERATION = eINSTANCE.getLogicalOperation();

		/**
		 * The meta object literal for the '<em><b>Logical Operand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OPERATION__LOGICAL_OPERAND = eINSTANCE.getLogicalOperation_LogicalOperand();

		/**
		 * The meta object literal for the '{@link SBVR.impl.LogicalNegationImpl <em>Logical Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.LogicalNegationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getLogicalNegation()
		 * @generated
		 */
		EClass LOGICAL_NEGATION = eINSTANCE.getLogicalNegation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.BinaryLogicalOperationImpl <em>Binary Logical Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.BinaryLogicalOperationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getBinaryLogicalOperation()
		 * @generated
		 */
		EClass BINARY_LOGICAL_OPERATION = eINSTANCE.getBinaryLogicalOperation();

		/**
		 * The meta object literal for the '<em><b>Logical Operand1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1 = eINSTANCE.getBinaryLogicalOperation_LogicalOperand1();

		/**
		 * The meta object literal for the '<em><b>Logical Operand2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2 = eINSTANCE.getBinaryLogicalOperation_LogicalOperand2();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ConjunctionImpl <em>Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ConjunctionImpl
		 * @see SBVR.impl.SBVRPackageImpl#getConjunction()
		 * @generated
		 */
		EClass CONJUNCTION = eINSTANCE.getConjunction();

		/**
		 * The meta object literal for the '{@link SBVR.impl.DisjunctionImpl <em>Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.DisjunctionImpl
		 * @see SBVR.impl.SBVRPackageImpl#getDisjunction()
		 * @generated
		 */
		EClass DISJUNCTION = eINSTANCE.getDisjunction();

		/**
		 * The meta object literal for the '{@link SBVR.impl.EquivalenceImpl <em>Equivalence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.EquivalenceImpl
		 * @see SBVR.impl.SBVRPackageImpl#getEquivalence()
		 * @generated
		 */
		EClass EQUIVALENCE = eINSTANCE.getEquivalence();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ExclusiveDisjunctionImpl <em>Exclusive Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ExclusiveDisjunctionImpl
		 * @see SBVR.impl.SBVRPackageImpl#getExclusiveDisjunction()
		 * @generated
		 */
		EClass EXCLUSIVE_DISJUNCTION = eINSTANCE.getExclusiveDisjunction();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ImplicationImpl <em>Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ImplicationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getImplication()
		 * @generated
		 */
		EClass IMPLICATION = eINSTANCE.getImplication();

		/**
		 * The meta object literal for the '<em><b>Antecedent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION__ANTECEDENT = eINSTANCE.getImplication_Antecedent();

		/**
		 * The meta object literal for the '<em><b>Consequent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION__CONSEQUENT = eINSTANCE.getImplication_Consequent();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NandFormulationImpl <em>Nand Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NandFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getNandFormulation()
		 * @generated
		 */
		EClass NAND_FORMULATION = eINSTANCE.getNandFormulation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NorFormulationImpl <em>Nor Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NorFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getNorFormulation()
		 * @generated
		 */
		EClass NOR_FORMULATION = eINSTANCE.getNorFormulation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.WhetherOrNotFormulationImpl <em>Whether Or Not Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.WhetherOrNotFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getWhetherOrNotFormulation()
		 * @generated
		 */
		EClass WHETHER_OR_NOT_FORMULATION = eINSTANCE.getWhetherOrNotFormulation();

		/**
		 * The meta object literal for the '<em><b>Consequent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHETHER_OR_NOT_FORMULATION__CONSEQUENT = eINSTANCE.getWhetherOrNotFormulation_Consequent();

		/**
		 * The meta object literal for the '<em><b>Inconsequent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHETHER_OR_NOT_FORMULATION__INCONSEQUENT = eINSTANCE.getWhetherOrNotFormulation_Inconsequent();

		/**
		 * The meta object literal for the '{@link SBVR.impl.UniversalQuantificationImpl <em>Universal Quantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.UniversalQuantificationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getUniversalQuantification()
		 * @generated
		 */
		EClass UNIVERSAL_QUANTIFICATION = eINSTANCE.getUniversalQuantification();

		/**
		 * The meta object literal for the '{@link SBVR.impl.AtLeastNQuantificationImpl <em>At Least NQuantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.AtLeastNQuantificationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getAtLeastNQuantification()
		 * @generated
		 */
		EClass AT_LEAST_NQUANTIFICATION = eINSTANCE.getAtLeastNQuantification();

		/**
		 * The meta object literal for the '<em><b>Minimum Cardinality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AT_LEAST_NQUANTIFICATION__MINIMUM_CARDINALITY = eINSTANCE.getAtLeastNQuantification_MinimumCardinality();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ExistentialQuantificationImpl <em>Existential Quantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ExistentialQuantificationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getExistentialQuantification()
		 * @generated
		 */
		EClass EXISTENTIAL_QUANTIFICATION = eINSTANCE.getExistentialQuantification();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NumericRangeQuantificationImpl <em>Numeric Range Quantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NumericRangeQuantificationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getNumericRangeQuantification()
		 * @generated
		 */
		EClass NUMERIC_RANGE_QUANTIFICATION = eINSTANCE.getNumericRangeQuantification();

		/**
		 * The meta object literal for the '<em><b>Minimum Cardinality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_RANGE_QUANTIFICATION__MINIMUM_CARDINALITY = eINSTANCE.getNumericRangeQuantification_MinimumCardinality();

		/**
		 * The meta object literal for the '<em><b>Maximum Cardinality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_RANGE_QUANTIFICATION__MAXIMUM_CARDINALITY = eINSTANCE.getNumericRangeQuantification_MaximumCardinality();

		/**
		 * The meta object literal for the '{@link SBVR.impl.AtMostNQuantificationImpl <em>At Most NQuantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.AtMostNQuantificationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getAtMostNQuantification()
		 * @generated
		 */
		EClass AT_MOST_NQUANTIFICATION = eINSTANCE.getAtMostNQuantification();

		/**
		 * The meta object literal for the '<em><b>Maximum Cardinality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AT_MOST_NQUANTIFICATION__MAXIMUM_CARDINALITY = eINSTANCE.getAtMostNQuantification_MaximumCardinality();

		/**
		 * The meta object literal for the '{@link SBVR.impl.AtMostOneQuantificationImpl <em>At Most One Quantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.AtMostOneQuantificationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getAtMostOneQuantification()
		 * @generated
		 */
		EClass AT_MOST_ONE_QUANTIFICATION = eINSTANCE.getAtMostOneQuantification();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ExactlyNQuantificationImpl <em>Exactly NQuantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ExactlyNQuantificationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getExactlyNQuantification()
		 * @generated
		 */
		EClass EXACTLY_NQUANTIFICATION = eINSTANCE.getExactlyNQuantification();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXACTLY_NQUANTIFICATION__CARDINALITY = eINSTANCE.getExactlyNQuantification_Cardinality();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ExactlyOneQuantificationImpl <em>Exactly One Quantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ExactlyOneQuantificationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getExactlyOneQuantification()
		 * @generated
		 */
		EClass EXACTLY_ONE_QUANTIFICATION = eINSTANCE.getExactlyOneQuantification();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ProjectingFormulationImpl <em>Projecting Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ProjectingFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getProjectingFormulation()
		 * @generated
		 */
		EClass PROJECTING_FORMULATION = eINSTANCE.getProjectingFormulation();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTING_FORMULATION__PROJECTION = eINSTANCE.getProjectingFormulation_Projection();

		/**
		 * The meta object literal for the '<em><b>Bindable Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTING_FORMULATION__BINDABLE_TARGET = eINSTANCE.getProjectingFormulation_BindableTarget();

		/**
		 * The meta object literal for the '{@link SBVR.impl.AggregationFormulationImpl <em>Aggregation Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.AggregationFormulationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getAggregationFormulation()
		 * @generated
		 */
		EClass AGGREGATION_FORMULATION = eINSTANCE.getAggregationFormulation();

		/**
		 * The meta object literal for the '{@link SBVR.impl.NounConceptNominalizationImpl <em>Noun Concept Nominalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.NounConceptNominalizationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getNounConceptNominalization()
		 * @generated
		 */
		EClass NOUN_CONCEPT_NOMINALIZATION = eINSTANCE.getNounConceptNominalization();

		/**
		 * The meta object literal for the '{@link SBVR.impl.FactTypeNominalizationImpl <em>Fact Type Nominalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.FactTypeNominalizationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getFactTypeNominalization()
		 * @generated
		 */
		EClass FACT_TYPE_NOMINALIZATION = eINSTANCE.getFactTypeNominalization();

		/**
		 * The meta object literal for the '{@link SBVR.impl.QuestionNominalizationImpl <em>Question Nominalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.QuestionNominalizationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getQuestionNominalization()
		 * @generated
		 */
		EClass QUESTION_NOMINALIZATION = eINSTANCE.getQuestionNominalization();

		/**
		 * The meta object literal for the '{@link SBVR.impl.AnswerNominalizationImpl <em>Answer Nominalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.AnswerNominalizationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getAnswerNominalization()
		 * @generated
		 */
		EClass ANSWER_NOMINALIZATION = eINSTANCE.getAnswerNominalization();

		/**
		 * The meta object literal for the '{@link SBVR.impl.AuxiliaryVariableImpl <em>Auxiliary Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.AuxiliaryVariableImpl
		 * @see SBVR.impl.SBVRPackageImpl#getAuxiliaryVariable()
		 * @generated
		 */
		EClass AUXILIARY_VARIABLE = eINSTANCE.getAuxiliaryVariable();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_VARIABLE__PROJECTION = eINSTANCE.getAuxiliaryVariable_Projection();

		/**
		 * The meta object literal for the '{@link SBVR.impl.BagProjectionImpl <em>Bag Projection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.BagProjectionImpl
		 * @see SBVR.impl.SBVRPackageImpl#getBagProjection()
		 * @generated
		 */
		EClass BAG_PROJECTION = eINSTANCE.getBagProjection();

		/**
		 * The meta object literal for the '{@link SBVR.impl.SetProjectionImpl <em>Set Projection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.SetProjectionImpl
		 * @see SBVR.impl.SBVRPackageImpl#getSetProjection()
		 * @generated
		 */
		EClass SET_PROJECTION = eINSTANCE.getSetProjection();

		/**
		 * The meta object literal for the '{@link SBVR.impl.LogicalFormulationKindImpl <em>Logical Formulation Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.LogicalFormulationKindImpl
		 * @see SBVR.impl.SBVRPackageImpl#getLogicalFormulationKind()
		 * @generated
		 */
		EClass LOGICAL_FORMULATION_KIND = eINSTANCE.getLogicalFormulationKind();

		/**
		 * The meta object literal for the '{@link SBVR.impl.ClosedProjectionImpl <em>Closed Projection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.ClosedProjectionImpl
		 * @see SBVR.impl.SBVRPackageImpl#getClosedProjection()
		 * @generated
		 */
		EClass CLOSED_PROJECTION = eINSTANCE.getClosedProjection();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOSED_PROJECTION__DEFINITION = eINSTANCE.getClosedProjection_Definition();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOSED_PROJECTION__OBJECT_TYPE = eINSTANCE.getClosedProjection_ObjectType();

		/**
		 * The meta object literal for the '<em><b>Fact Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOSED_PROJECTION__FACT_TYPE = eINSTANCE.getClosedProjection_FactType();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOSED_PROJECTION__QUESTION = eINSTANCE.getClosedProjection_Question();

		/**
		 * The meta object literal for the '{@link SBVR.impl.CategorizationSchemeImpl <em>Categorization Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.CategorizationSchemeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getCategorizationScheme()
		 * @generated
		 */
		EClass CATEGORIZATION_SCHEME = eINSTANCE.getCategorizationScheme();

		/**
		 * The meta object literal for the '<em><b>Is Based On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIZATION_SCHEME__IS_BASED_ON = eINSTANCE.getCategorizationScheme_IsBasedOn();

		/**
		 * The meta object literal for the '<em><b>Contains Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIZATION_SCHEME__CONTAINS_CATEGORY = eINSTANCE.getCategorizationScheme_ContainsCategory();

		/**
		 * The meta object literal for the '<em><b>Is For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIZATION_SCHEME__IS_FOR = eINSTANCE.getCategorizationScheme_IsFor();

		/**
		 * The meta object literal for the '{@link SBVR.impl.CategorizationTypeImpl <em>Categorization Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.CategorizationTypeImpl
		 * @see SBVR.impl.SBVRPackageImpl#getCategorizationType()
		 * @generated
		 */
		EClass CATEGORIZATION_TYPE = eINSTANCE.getCategorizationType();

		/**
		 * The meta object literal for the '<em><b>Is For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIZATION_TYPE__IS_FOR = eINSTANCE.getCategorizationType_IsFor();

		/**
		 * The meta object literal for the '{@link SBVR.impl.SegmentationImpl <em>Segmentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SBVR.impl.SegmentationImpl
		 * @see SBVR.impl.SBVRPackageImpl#getSegmentation()
		 * @generated
		 */
		EClass SEGMENTATION = eINSTANCE.getSegmentation();

		/**
		 * The meta object literal for the '<em>EClass</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.EClass
		 * @see SBVR.impl.SBVRPackageImpl#getEClass()
		 * @generated
		 */
		EDataType ECLASS = eINSTANCE.getEClass();

		/**
		 * The meta object literal for the '<em>Integer Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see SBVR.impl.SBVRPackageImpl#getIntegerObject()
		 * @generated
		 */
		EDataType INTEGER_OBJECT = eINSTANCE.getIntegerObject();

		/**
		 * The meta object literal for the '<em>Boolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see SBVR.impl.SBVRPackageImpl#getBooleanObject()
		 * @generated
		 */
		EDataType BOOLEAN_OBJECT = eINSTANCE.getBooleanObject();

	}

} //SBVRPackage
