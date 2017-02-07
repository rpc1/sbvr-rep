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
 * A representation of the model object '<em><b>Auxiliary Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.AuxiliaryVariable#getProjection <em>Projection</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getAuxiliaryVariable()
 * @model
 * @generated
 */
public interface AuxiliaryVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection</em>' reference.
	 * @see #setProjection(Projection)
	 * @see SBVR.SBVRPackage#getAuxiliaryVariable_Projection()
	 * @model required="true"
	 * @generated
	 */
	Projection getProjection();

	/**
	 * Sets the value of the '{@link SBVR.AuxiliaryVariable#getProjection <em>Projection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection</em>' reference.
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(Projection value);

} // AuxiliaryVariable
