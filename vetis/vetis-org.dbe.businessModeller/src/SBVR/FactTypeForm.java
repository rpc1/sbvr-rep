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
 * A representation of the model object '<em><b>Fact Type Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.FactTypeForm#getDesignation <em>Designation</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getFactTypeForm()
 * @model
 * @generated
 */
public interface FactTypeForm extends Representation {
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
	 * @see SBVR.SBVRPackage#getFactTypeForm_Designation()
	 * @model required="true"
	 * @generated
	 */
	EList<Designation> getDesignation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Placeholder> getPlaceholders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	Designation getDemonstrated();

} // FactTypeForm
