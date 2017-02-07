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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Vocabulary#getDesignation <em>Designation</em>}</li>
 *   <li>{@link SBVR.Vocabulary#getFactTypeForm <em>Fact Type Form</em>}</li>
 *   <li>{@link SBVR.Vocabulary#getBodyOfSharedMeaning <em>Body Of Shared Meaning</em>}</li>
 *   <li>{@link SBVR.Vocabulary#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link SBVR.Vocabulary#getIncorporatedVocabulary <em>Incorporated Vocabulary</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getVocabulary()
 * @model
 * @generated
 */
public interface Vocabulary extends Set {
	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference list.
	 * The list contents are of type {@link SBVR.Designation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference list.
	 * @see SBVR.SBVRPackage#getVocabulary_Designation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Designation> getDesignation();

	/**
	 * Returns the value of the '<em><b>Fact Type Form</b></em>' containment reference list.
	 * The list contents are of type {@link SBVR.FactTypeForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact Type Form</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Form</em>' containment reference list.
	 * @see SBVR.SBVRPackage#getVocabulary_FactTypeForm()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FactTypeForm> getFactTypeForm();

	/**
	 * Returns the value of the '<em><b>Body Of Shared Meaning</b></em>' reference list.
	 * The list contents are of type {@link SBVR.BodyOfSharedMeanings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Of Shared Meaning</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Of Shared Meaning</em>' reference list.
	 * @see SBVR.SBVRPackage#getVocabulary_BodyOfSharedMeaning()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BodyOfSharedMeanings> getBodyOfSharedMeaning();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference list.
	 * The list contents are of type {@link SBVR.VocabularyNamespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference list.
	 * @see SBVR.SBVRPackage#getVocabulary_Namespace()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VocabularyNamespace> getNamespace();

	/**
	 * Returns the value of the '<em><b>Incorporated Vocabulary</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Vocabulary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incorporated Vocabulary</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incorporated Vocabulary</em>' reference list.
	 * @see SBVR.SBVRPackage#getVocabulary_IncorporatedVocabulary()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Vocabulary> getIncorporatedVocabulary();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" signifierRequired="true" signifierOrdered="false"
	 * @generated
	 */
	Term createTerm(String signifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" signifierRequired="true" signifierOrdered="false"
	 * @generated
	 */
	Name createName(String signifier);

} // Vocabulary
