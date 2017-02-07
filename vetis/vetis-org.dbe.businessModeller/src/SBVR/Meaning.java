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

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meaning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * What is meant by a word, sign, statement, or description; what someone intends to express or
 * what someone understands.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Meaning#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getMeaning()
 * @model abstract="true"
 * @generated
 */
public interface Meaning extends Thing {
	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Representation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' reference list.
	 * @see SBVR.SBVRPackage#getMeaning_Representation()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<Representation> getRepresentation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" textRequired="true" textOrdered="false"
	 * @generated
	 */
	Definition createDefinition(String text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" textRequired="true" textOrdered="false" eClassDataType="SBVR.EClass" eClassRequired="true" eClassOrdered="false"
	 * @generated
	 */
	Representation createRepresentation(String text, EClass eClass);

} // Meaning
