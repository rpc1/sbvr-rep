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
 * A representation of the model object '<em><b>Modal Formulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.ModalFormulation#getLogicalFormulation <em>Logical Formulation</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getModalFormulation()
 * @model
 * @generated
 */
public interface ModalFormulation extends LogicalFormulation {
	/**
	 * Returns the value of the '<em><b>Logical Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Formulation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Formulation</em>' reference.
	 * @see #setLogicalFormulation(LogicalFormulation)
	 * @see SBVR.SBVRPackage#getModalFormulation_LogicalFormulation()
	 * @model required="true"
	 * @generated
	 */
	LogicalFormulation getLogicalFormulation();

	/**
	 * Sets the value of the '{@link SBVR.ModalFormulation#getLogicalFormulation <em>Logical Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Formulation</em>' reference.
	 * @see #getLogicalFormulation()
	 * @generated
	 */
	void setLogicalFormulation(LogicalFormulation value);

} // ModalFormulation
