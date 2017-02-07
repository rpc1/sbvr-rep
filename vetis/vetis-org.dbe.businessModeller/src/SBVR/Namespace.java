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
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Namespace#getDesignation <em>Designation</em>}</li>
 *   <li>{@link SBVR.Namespace#getFactTypeForm <em>Fact Type Form</em>}</li>
 *   <li>{@link SBVR.Namespace#getUri <em>Uri</em>}</li>
 *   <li>{@link SBVR.Namespace#getIncorporatedNamespace <em>Incorporated Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends Thing {
	/**
	 * Returns the value of the '<em><b>Designation</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Designation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation</em>' reference list.
	 * @see SBVR.SBVRPackage#getNamespace_Designation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Designation> getDesignation();

	/**
	 * Returns the value of the '<em><b>Fact Type Form</b></em>' reference list.
	 * The list contents are of type {@link SBVR.FactTypeForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact Type Form</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Form</em>' reference list.
	 * @see SBVR.SBVRPackage#getNamespace_FactTypeForm()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FactTypeForm> getFactTypeForm();

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
	 * @see SBVR.SBVRPackage#getNamespace_Uri()
	 * @model ordered="false"
	 * @generated
	 */
	EList<URI> getUri();

	/**
	 * Returns the value of the '<em><b>Incorporated Namespace</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Namespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incorporated Namespace</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incorporated Namespace</em>' reference list.
	 * @see SBVR.SBVRPackage#getNamespace_IncorporatedNamespace()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Namespace> getIncorporatedNamespace();

} // Namespace
