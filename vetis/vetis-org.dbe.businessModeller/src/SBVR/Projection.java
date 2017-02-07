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
 * A representation of the model object '<em><b>Projection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Projection#getConstrainingFormulation <em>Constraining Formulation</em>}</li>
 *   <li>{@link SBVR.Projection#getProjectionVariable <em>Projection Variable</em>}</li>
 *   <li>{@link SBVR.Projection#getAuxiliaryVariable <em>Auxiliary Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getProjection()
 * @model
 * @generated
 */
public interface Projection extends SemanticFormulation {
	/**
	 * Returns the value of the '<em><b>Constraining Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraining Formulation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraining Formulation</em>' reference.
	 * @see #setConstrainingFormulation(LogicalFormulation)
	 * @see SBVR.SBVRPackage#getProjection_ConstrainingFormulation()
	 * @model
	 * @generated
	 */
	LogicalFormulation getConstrainingFormulation();

	/**
	 * Sets the value of the '{@link SBVR.Projection#getConstrainingFormulation <em>Constraining Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraining Formulation</em>' reference.
	 * @see #getConstrainingFormulation()
	 * @generated
	 */
	void setConstrainingFormulation(LogicalFormulation value);

	/**
	 * Returns the value of the '<em><b>Projection Variable</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection Variable</em>' reference list.
	 * @see SBVR.SBVRPackage#getProjection_ProjectionVariable()
	 * @model required="true"
	 * @generated
	 */
	EList<Variable> getProjectionVariable();

	/**
	 * Returns the value of the '<em><b>Auxiliary Variable</b></em>' reference list.
	 * The list contents are of type {@link SBVR.AuxiliaryVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Variable</em>' reference list.
	 * @see SBVR.SBVRPackage#getProjection_AuxiliaryVariable()
	 * @model
	 * @generated
	 */
	EList<AuxiliaryVariable> getAuxiliaryVariable();

} // Projection
