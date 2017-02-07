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
 * A representation of the model object '<em><b>Objectification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Objectification#getLogicalFormulation <em>Logical Formulation</em>}</li>
 *   <li>{@link SBVR.Objectification#getBindableTarget <em>Bindable Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getObjectification()
 * @model
 * @generated
 */
public interface Objectification extends LogicalFormulation {
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
	 * @see SBVR.SBVRPackage#getObjectification_LogicalFormulation()
	 * @model required="true"
	 * @generated
	 */
	LogicalFormulation getLogicalFormulation();

	/**
	 * Sets the value of the '{@link SBVR.Objectification#getLogicalFormulation <em>Logical Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Formulation</em>' reference.
	 * @see #getLogicalFormulation()
	 * @generated
	 */
	void setLogicalFormulation(LogicalFormulation value);

	/**
	 * Returns the value of the '<em><b>Bindable Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindable Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindable Target</em>' reference.
	 * @see #setBindableTarget(BindableTarget)
	 * @see SBVR.SBVRPackage#getObjectification_BindableTarget()
	 * @model required="true"
	 * @generated
	 */
	BindableTarget getBindableTarget();

	/**
	 * Sets the value of the '{@link SBVR.Objectification#getBindableTarget <em>Bindable Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindable Target</em>' reference.
	 * @see #getBindableTarget()
	 * @generated
	 */
	void setBindableTarget(BindableTarget value);

} // Objectification
