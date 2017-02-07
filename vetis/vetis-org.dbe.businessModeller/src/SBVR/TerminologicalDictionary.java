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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminological Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.TerminologicalDictionary#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link SBVR.TerminologicalDictionary#getVocabulary <em>Vocabulary</em>}</li>
 *   <li>{@link SBVR.TerminologicalDictionary#getBodyOfSharedMeaning <em>Body Of Shared Meaning</em>}</li>
 *   <li>{@link SBVR.TerminologicalDictionary#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getTerminologicalDictionary()
 * @model
 * @generated
 */
public interface TerminologicalDictionary extends EObject {
	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference list.
	 * The list contents are of type {@link SBVR.Representation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference list.
	 * @see SBVR.SBVRPackage#getTerminologicalDictionary_Representation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Representation> getRepresentation();

	/**
	 * Returns the value of the '<em><b>Vocabulary</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Vocabulary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vocabulary</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocabulary</em>' reference list.
	 * @see SBVR.SBVRPackage#getTerminologicalDictionary_Vocabulary()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Vocabulary> getVocabulary();

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
	 * @see SBVR.SBVRPackage#getTerminologicalDictionary_BodyOfSharedMeaning()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BodyOfSharedMeanings> getBodyOfSharedMeaning();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' reference list.
	 * The list contents are of type {@link SBVR.URI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' reference list.
	 * @see SBVR.SBVRPackage#getTerminologicalDictionary_Uri()
	 * @model ordered="false"
	 * @generated
	 */
	EList<URI> getUri();

} // TerminologicalDictionary
