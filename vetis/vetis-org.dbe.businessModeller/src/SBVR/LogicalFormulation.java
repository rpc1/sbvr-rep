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
 * A representation of the model object '<em><b>Logical Formulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.LogicalFormulation#getStatement <em>Statement</em>}</li>
 *   <li>{@link SBVR.LogicalFormulation#getProposition <em>Proposition</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getLogicalFormulation()
 * @model
 * @generated
 */
public interface LogicalFormulation extends SemanticFormulation {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' reference list.
	 * @see SBVR.SBVRPackage#getLogicalFormulation_Statement()
	 * @model
	 * @generated
	 */
	EList<Statement> getStatement();

	/**
	 * Returns the value of the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposition</em>' reference.
	 * @see #setProposition(Proposition)
	 * @see SBVR.SBVRPackage#getLogicalFormulation_Proposition()
	 * @model required="true"
	 * @generated
	 */
	Proposition getProposition();

	/**
	 * Sets the value of the '{@link SBVR.LogicalFormulation#getProposition <em>Proposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposition</em>' reference.
	 * @see #getProposition()
	 * @generated
	 */
	void setProposition(Proposition value);

} // LogicalFormulation
