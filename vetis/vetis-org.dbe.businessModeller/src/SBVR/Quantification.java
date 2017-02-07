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
 * A representation of the model object '<em><b>Quantification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Quantification#getScopeFormulation <em>Scope Formulation</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getQuantification()
 * @model
 * @generated
 */
public interface Quantification extends LogicalFormulation {
	/**
	 * Returns the value of the '<em><b>Scope Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Formulation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Formulation</em>' reference.
	 * @see #setScopeFormulation(LogicalFormulation)
	 * @see SBVR.SBVRPackage#getQuantification_ScopeFormulation()
	 * @model
	 * @generated
	 */
	LogicalFormulation getScopeFormulation();

	/**
	 * Sets the value of the '{@link SBVR.Quantification#getScopeFormulation <em>Scope Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Formulation</em>' reference.
	 * @see #getScopeFormulation()
	 * @generated
	 */
	void setScopeFormulation(LogicalFormulation value);

} // Quantification
