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
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Quantity#getEqualTo <em>Equal To</em>}</li>
 *   <li>{@link SBVR.Quantity#getLessThan <em>Less Than</em>}</li>
 *   <li>{@link SBVR.Quantity#getGreaterThan <em>Greater Than</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getQuantity()
 * @model abstract="true"
 * @generated
 */
public interface Quantity extends NounConcept {
	/**
	 * Returns the value of the '<em><b>Equal To</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Quantity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equal To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equal To</em>' reference list.
	 * @see SBVR.SBVRPackage#getQuantity_EqualTo()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Quantity> getEqualTo();

	/**
	 * Returns the value of the '<em><b>Less Than</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Quantity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Less Than</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Less Than</em>' reference list.
	 * @see SBVR.SBVRPackage#getQuantity_LessThan()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Quantity> getLessThan();

	/**
	 * Returns the value of the '<em><b>Greater Than</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Quantity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Greater Than</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greater Than</em>' reference list.
	 * @see SBVR.SBVRPackage#getQuantity_GreaterThan()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Quantity> getGreaterThan();

} // Quantity
