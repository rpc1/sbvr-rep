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
 * A representation of the model object '<em><b>Atomic Formulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.AtomicFormulation#getFactType <em>Fact Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getAtomicFormulation()
 * @model
 * @generated
 */
public interface AtomicFormulation extends LogicalFormulation {
	/**
	 * Returns the value of the '<em><b>Fact Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type</em>' reference.
	 * @see #setFactType(FactType)
	 * @see SBVR.SBVRPackage#getAtomicFormulation_FactType()
	 * @model required="true"
	 * @generated
	 */
	FactType getFactType();

	/**
	 * Sets the value of the '{@link SBVR.AtomicFormulation#getFactType <em>Fact Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Type</em>' reference.
	 * @see #getFactType()
	 * @generated
	 */
	void setFactType(FactType value);

} // AtomicFormulation
