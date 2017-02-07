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
 * A representation of the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Implication#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link SBVR.Implication#getConsequent <em>Consequent</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getImplication()
 * @model
 * @generated
 */
public interface Implication extends BinaryLogicalOperation {
	/**
	 * Returns the value of the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent</em>' reference.
	 * @see #setAntecedent(LogicalFormulation)
	 * @see SBVR.SBVRPackage#getImplication_Antecedent()
	 * @model required="true"
	 * @generated
	 */
	LogicalFormulation getAntecedent();

	/**
	 * Sets the value of the '{@link SBVR.Implication#getAntecedent <em>Antecedent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent</em>' reference.
	 * @see #getAntecedent()
	 * @generated
	 */
	void setAntecedent(LogicalFormulation value);

	/**
	 * Returns the value of the '<em><b>Consequent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequent</em>' reference.
	 * @see #setConsequent(LogicalFormulation)
	 * @see SBVR.SBVRPackage#getImplication_Consequent()
	 * @model required="true"
	 * @generated
	 */
	LogicalFormulation getConsequent();

	/**
	 * Sets the value of the '{@link SBVR.Implication#getConsequent <em>Consequent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequent</em>' reference.
	 * @see #getConsequent()
	 * @generated
	 */
	void setConsequent(LogicalFormulation value);

} // Implication
