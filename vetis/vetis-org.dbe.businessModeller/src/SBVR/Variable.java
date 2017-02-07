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
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Variable#getRestrictingFormulation <em>Restricting Formulation</em>}</li>
 *   <li>{@link SBVR.Variable#isIsUnitary <em>Is Unitary</em>}</li>
 *   <li>{@link SBVR.Variable#getQuantification <em>Quantification</em>}</li>
 *   <li>{@link SBVR.Variable#getRangedOverConcept <em>Ranged Over Concept</em>}</li>
 *   <li>{@link SBVR.Variable#getFactTypeRole <em>Fact Type Role</em>}</li>
 *   <li>{@link SBVR.Variable#getProjectionPosition <em>Projection Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends BindableTarget {
	/**
	 * Returns the value of the '<em><b>Restricting Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restricting Formulation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricting Formulation</em>' reference.
	 * @see #setRestrictingFormulation(LogicalFormulation)
	 * @see SBVR.SBVRPackage#getVariable_RestrictingFormulation()
	 * @model
	 * @generated
	 */
	LogicalFormulation getRestrictingFormulation();

	/**
	 * Sets the value of the '{@link SBVR.Variable#getRestrictingFormulation <em>Restricting Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricting Formulation</em>' reference.
	 * @see #getRestrictingFormulation()
	 * @generated
	 */
	void setRestrictingFormulation(LogicalFormulation value);

	/**
	 * Returns the value of the '<em><b>Is Unitary</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unitary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unitary</em>' attribute.
	 * @see #setIsUnitary(boolean)
	 * @see SBVR.SBVRPackage#getVariable_IsUnitary()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsUnitary();

	/**
	 * Sets the value of the '{@link SBVR.Variable#isIsUnitary <em>Is Unitary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unitary</em>' attribute.
	 * @see #isIsUnitary()
	 * @generated
	 */
	void setIsUnitary(boolean value);

	/**
	 * Returns the value of the '<em><b>Quantification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantification</em>' reference.
	 * @see #setQuantification(Quantification)
	 * @see SBVR.SBVRPackage#getVariable_Quantification()
	 * @model
	 * @generated
	 */
	Quantification getQuantification();

	/**
	 * Sets the value of the '{@link SBVR.Variable#getQuantification <em>Quantification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantification</em>' reference.
	 * @see #getQuantification()
	 * @generated
	 */
	void setQuantification(Quantification value);

	/**
	 * Returns the value of the '<em><b>Ranged Over Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranged Over Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranged Over Concept</em>' reference.
	 * @see #setRangedOverConcept(Concept)
	 * @see SBVR.SBVRPackage#getVariable_RangedOverConcept()
	 * @model
	 * @generated
	 */
	Concept getRangedOverConcept();

	/**
	 * Sets the value of the '{@link SBVR.Variable#getRangedOverConcept <em>Ranged Over Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranged Over Concept</em>' reference.
	 * @see #getRangedOverConcept()
	 * @generated
	 */
	void setRangedOverConcept(Concept value);

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
	 * @see SBVR.SBVRPackage#getVariable_FactTypeRole()
	 * @model
	 * @generated
	 */
	FactTypeRole getFactTypeRole();

	/**
	 * Sets the value of the '{@link SBVR.Variable#getFactTypeRole <em>Fact Type Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Type Role</em>' reference.
	 * @see #getFactTypeRole()
	 * @generated
	 */
	void setFactTypeRole(FactTypeRole value);

	/**
	 * Returns the value of the '<em><b>Projection Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection Position</em>' reference.
	 * @see #setProjectionPosition(PositiveInteger)
	 * @see SBVR.SBVRPackage#getVariable_ProjectionPosition()
	 * @model
	 * @generated
	 */
	PositiveInteger getProjectionPosition();

	/**
	 * Sets the value of the '{@link SBVR.Variable#getProjectionPosition <em>Projection Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection Position</em>' reference.
	 * @see #getProjectionPosition()
	 * @generated
	 */
	void setProjectionPosition(PositiveInteger value);

} // Variable
