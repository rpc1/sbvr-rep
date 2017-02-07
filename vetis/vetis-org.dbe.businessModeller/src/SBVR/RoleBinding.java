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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.RoleBinding#getAtomicFormulation <em>Atomic Formulation</em>}</li>
 *   <li>{@link SBVR.RoleBinding#getBindableTarget <em>Bindable Target</em>}</li>
 *   <li>{@link SBVR.RoleBinding#getFactTypeRole <em>Fact Type Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getRoleBinding()
 * @model
 * @generated
 */
public interface RoleBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Atomic Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atomic Formulation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomic Formulation</em>' reference.
	 * @see #setAtomicFormulation(AtomicFormulation)
	 * @see SBVR.SBVRPackage#getRoleBinding_AtomicFormulation()
	 * @model required="true"
	 * @generated
	 */
	AtomicFormulation getAtomicFormulation();

	/**
	 * Sets the value of the '{@link SBVR.RoleBinding#getAtomicFormulation <em>Atomic Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atomic Formulation</em>' reference.
	 * @see #getAtomicFormulation()
	 * @generated
	 */
	void setAtomicFormulation(AtomicFormulation value);

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
	 * @see SBVR.SBVRPackage#getRoleBinding_BindableTarget()
	 * @model required="true"
	 * @generated
	 */
	BindableTarget getBindableTarget();

	/**
	 * Sets the value of the '{@link SBVR.RoleBinding#getBindableTarget <em>Bindable Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindable Target</em>' reference.
	 * @see #getBindableTarget()
	 * @generated
	 */
	void setBindableTarget(BindableTarget value);

	/**
	 * Returns the value of the '<em><b>Fact Type Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact Type Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Role</em>' reference.
	 * @see #setFactTypeRole(FactTypeRole)
	 * @see SBVR.SBVRPackage#getRoleBinding_FactTypeRole()
	 * @model required="true"
	 * @generated
	 */
	FactTypeRole getFactTypeRole();

	/**
	 * Sets the value of the '{@link SBVR.RoleBinding#getFactTypeRole <em>Fact Type Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Type Role</em>' reference.
	 * @see #getFactTypeRole()
	 * @generated
	 */
	void setFactTypeRole(FactTypeRole value);

} // RoleBinding
