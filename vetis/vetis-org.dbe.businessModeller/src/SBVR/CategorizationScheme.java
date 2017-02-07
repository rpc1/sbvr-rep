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
 * A representation of the model object '<em><b>Categorization Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.CategorizationScheme#getIsBasedOn <em>Is Based On</em>}</li>
 *   <li>{@link SBVR.CategorizationScheme#getContainsCategory <em>Contains Category</em>}</li>
 *   <li>{@link SBVR.CategorizationScheme#getIsFor <em>Is For</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getCategorizationScheme()
 * @model
 * @generated
 */
public interface CategorizationScheme extends Set {
	/**
	 * Returns the value of the '<em><b>Is Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Based On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Based On</em>' reference.
	 * @see #setIsBasedOn(CategorizationType)
	 * @see SBVR.SBVRPackage#getCategorizationScheme_IsBasedOn()
	 * @model required="true"
	 * @generated
	 */
	CategorizationType getIsBasedOn();

	/**
	 * Sets the value of the '{@link SBVR.CategorizationScheme#getIsBasedOn <em>Is Based On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Based On</em>' reference.
	 * @see #getIsBasedOn()
	 * @generated
	 */
	void setIsBasedOn(CategorizationType value);

	/**
	 * Returns the value of the '<em><b>Contains Category</b></em>' containment reference list.
	 * The list contents are of type {@link SBVR.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Category</em>' containment reference list.
	 * @see SBVR.SBVRPackage#getCategorizationScheme_ContainsCategory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Concept> getContainsCategory();

	/**
	 * Returns the value of the '<em><b>Is For</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is For</em>' reference list.
	 * @see SBVR.SBVRPackage#getCategorizationScheme_IsFor()
	 * @model
	 * @generated
	 */
	EList<Concept> getIsFor();

} // CategorizationScheme
