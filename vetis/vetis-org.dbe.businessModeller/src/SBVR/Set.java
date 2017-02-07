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
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Set#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link SBVR.Set#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends Thing {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' reference.
	 * @see #setCardinality(SBVR.Integer)
	 * @see SBVR.SBVRPackage#getSet_Cardinality()
	 * @model ordered="false"
	 * @generated
	 */
	SBVR.Integer getCardinality();

	/**
	 * Sets the value of the '{@link SBVR.Set#getCardinality <em>Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(SBVR.Integer value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Thing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference list.
	 * @see SBVR.SBVRPackage#getSet_Element()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Thing> getElement();

} // Set
