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
 * A representation of the model object '<em><b>Whether Or Not Formulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.WhetherOrNotFormulation#getConsequent <em>Consequent</em>}</li>
 *   <li>{@link SBVR.WhetherOrNotFormulation#getInconsequent <em>Inconsequent</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getWhetherOrNotFormulation()
 * @model
 * @generated
 */
public interface WhetherOrNotFormulation extends BinaryLogicalOperation {
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
	 * @see SBVR.SBVRPackage#getWhetherOrNotFormulation_Consequent()
	 * @model required="true"
	 * @generated
	 */
	LogicalFormulation getConsequent();

	/**
	 * Sets the value of the '{@link SBVR.WhetherOrNotFormulation#getConsequent <em>Consequent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequent</em>' reference.
	 * @see #getConsequent()
	 * @generated
	 */
	void setConsequent(LogicalFormulation value);

	/**
	 * Returns the value of the '<em><b>Inconsequent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inconsequent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inconsequent</em>' reference.
	 * @see #setInconsequent(LogicalFormulation)
	 * @see SBVR.SBVRPackage#getWhetherOrNotFormulation_Inconsequent()
	 * @model required="true"
	 * @generated
	 */
	LogicalFormulation getInconsequent();

	/**
	 * Sets the value of the '{@link SBVR.WhetherOrNotFormulation#getInconsequent <em>Inconsequent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inconsequent</em>' reference.
	 * @see #getInconsequent()
	 * @generated
	 */
	void setInconsequent(LogicalFormulation value);

} // WhetherOrNotFormulation
