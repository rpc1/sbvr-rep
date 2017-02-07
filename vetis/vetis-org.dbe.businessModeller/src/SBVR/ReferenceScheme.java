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
 * A representation of the model object '<em><b>Reference Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.ReferenceScheme#getExtensionallyUsedRole <em>Extensionally Used Role</em>}</li>
 *   <li>{@link SBVR.ReferenceScheme#getSimplyUsedRole <em>Simply Used Role</em>}</li>
 *   <li>{@link SBVR.ReferenceScheme#getIdentifyingCharacteristic <em>Identifying Characteristic</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getReferenceScheme()
 * @model
 * @generated
 */
public interface ReferenceScheme extends Thing {
	/**
	 * Returns the value of the '<em><b>Extensionally Used Role</b></em>' reference list.
	 * The list contents are of type {@link SBVR.FactTypeRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensionally Used Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensionally Used Role</em>' reference list.
	 * @see SBVR.SBVRPackage#getReferenceScheme_ExtensionallyUsedRole()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FactTypeRole> getExtensionallyUsedRole();

	/**
	 * Returns the value of the '<em><b>Simply Used Role</b></em>' reference list.
	 * The list contents are of type {@link SBVR.FactTypeRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simply Used Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simply Used Role</em>' reference list.
	 * @see SBVR.SBVRPackage#getReferenceScheme_SimplyUsedRole()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FactTypeRole> getSimplyUsedRole();

	/**
	 * Returns the value of the '<em><b>Identifying Characteristic</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Characteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifying Characteristic</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifying Characteristic</em>' reference list.
	 * @see SBVR.SBVRPackage#getReferenceScheme_IdentifyingCharacteristic()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Characteristic> getIdentifyingCharacteristic();

} // ReferenceScheme
