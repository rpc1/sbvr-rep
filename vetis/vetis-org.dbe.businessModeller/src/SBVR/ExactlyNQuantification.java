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
 * A representation of the model object '<em><b>Exactly NQuantification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.ExactlyNQuantification#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getExactlyNQuantification()
 * @model
 * @generated
 */
public interface ExactlyNQuantification extends Quantification {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' reference.
	 * @see #setCardinality(NonNegativeInteger)
	 * @see SBVR.SBVRPackage#getExactlyNQuantification_Cardinality()
	 * @model required="true"
	 * @generated
	 */
	NonNegativeInteger getCardinality();

	/**
	 * Sets the value of the '{@link SBVR.ExactlyNQuantification#getCardinality <em>Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(NonNegativeInteger value);

} // ExactlyNQuantification
