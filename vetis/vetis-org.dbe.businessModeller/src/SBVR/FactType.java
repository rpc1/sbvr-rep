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
 * A representation of the model object '<em><b>Fact Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.FactType#getFactTypeForm <em>Fact Type Form</em>}</li>
 *   <li>{@link SBVR.FactType#getRole <em>Role</em>}</li>
 *   <li>{@link SBVR.FactType#getHas <em>Has</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getFactType()
 * @model
 * @generated
 */
public interface FactType extends Concept {
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
	 * @see SBVR.SBVRPackage#getFactType_FactTypeForm()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<FactTypeForm> getFactTypeForm();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link SBVR.FactTypeRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see SBVR.SBVRPackage#getFactType_Role()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FactTypeRole> getRole();

	/**
	 * Returns the value of the '<em><b>Has</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Placeholder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' reference list.
	 * @see SBVR.SBVRPackage#getFactType_Has()
	 * @model required="true"
	 * @generated
	 */
	EList<Placeholder> getHas();

} // FactType
