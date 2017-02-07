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
 * A representation of the model object '<em><b>At Most NQuantification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.AtMostNQuantification#getMaximumCardinality <em>Maximum Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getAtMostNQuantification()
 * @model
 * @generated
 */
public interface AtMostNQuantification extends Quantification {
	/**
	 * Returns the value of the '<em><b>Maximum Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Cardinality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Cardinality</em>' reference.
	 * @see #setMaximumCardinality(NonNegativeInteger)
	 * @see SBVR.SBVRPackage#getAtMostNQuantification_MaximumCardinality()
	 * @model required="true"
	 * @generated
	 */
	NonNegativeInteger getMaximumCardinality();

	/**
	 * Sets the value of the '{@link SBVR.AtMostNQuantification#getMaximumCardinality <em>Maximum Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Cardinality</em>' reference.
	 * @see #getMaximumCardinality()
	 * @generated
	 */
	void setMaximumCardinality(NonNegativeInteger value);

} // AtMostNQuantification
