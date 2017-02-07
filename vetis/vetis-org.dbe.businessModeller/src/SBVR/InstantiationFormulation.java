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
 * A representation of the model object '<em><b>Instantiation Formulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.InstantiationFormulation#getConcept <em>Concept</em>}</li>
 *   <li>{@link SBVR.InstantiationFormulation#getBindableTarget <em>Bindable Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getInstantiationFormulation()
 * @model
 * @generated
 */
public interface InstantiationFormulation extends LogicalFormulation {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' reference.
	 * @see #setConcept(Concept)
	 * @see SBVR.SBVRPackage#getInstantiationFormulation_Concept()
	 * @model required="true"
	 * @generated
	 */
	Concept getConcept();

	/**
	 * Sets the value of the '{@link SBVR.InstantiationFormulation#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(Concept value);

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
	 * @see SBVR.SBVRPackage#getInstantiationFormulation_BindableTarget()
	 * @model required="true"
	 * @generated
	 */
	BindableTarget getBindableTarget();

	/**
	 * Sets the value of the '{@link SBVR.InstantiationFormulation#getBindableTarget <em>Bindable Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindable Target</em>' reference.
	 * @see #getBindableTarget()
	 * @generated
	 */
	void setBindableTarget(BindableTarget value);

} // InstantiationFormulation
