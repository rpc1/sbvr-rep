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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Placeholder#getUses <em>Uses</em>}</li>
 *   <li>{@link SBVR.Placeholder#getIsAtStartingCharacterPosition <em>Is At Starting Character Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getPlaceholder()
 * @model
 * @generated
 */
public interface Placeholder extends Designation {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference.
	 * @see #setUses(Designation)
	 * @see SBVR.SBVRPackage#getPlaceholder_Uses()
	 * @model required="true"
	 * @generated
	 */
	Designation getUses();

	/**
	 * Sets the value of the '{@link SBVR.Placeholder#getUses <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(Designation value);

	/**
	 * Returns the value of the '<em><b>Is At Starting Character Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is At Starting Character Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is At Starting Character Position</em>' reference.
	 * @see #setIsAtStartingCharacterPosition(PositiveInteger)
	 * @see SBVR.SBVRPackage#getPlaceholder_IsAtStartingCharacterPosition()
	 * @model required="true"
	 * @generated
	 */
	PositiveInteger getIsAtStartingCharacterPosition();

	/**
	 * Sets the value of the '{@link SBVR.Placeholder#getIsAtStartingCharacterPosition <em>Is At Starting Character Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is At Starting Character Position</em>' reference.
	 * @see #getIsAtStartingCharacterPosition()
	 * @generated
	 */
	void setIsAtStartingCharacterPosition(PositiveInteger value);

} // Placeholder
