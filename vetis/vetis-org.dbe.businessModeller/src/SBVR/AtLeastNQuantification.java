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
 * A representation of the model object '<em><b>At Least NQuantification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.AtLeastNQuantification#getMinimumCardinality <em>Minimum Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getAtLeastNQuantification()
 * @model
 * @generated
 */
public interface AtLeastNQuantification extends Quantification {
	/**
	 * Returns the value of the '<em><b>Minimum Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Cardinality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Cardinality</em>' reference.
	 * @see #setMinimumCardinality(NonNegativeInteger)
	 * @see SBVR.SBVRPackage#getAtLeastNQuantification_MinimumCardinality()
	 * @model required="true"
	 * @generated
	 */
	NonNegativeInteger getMinimumCardinality();

	/**
	 * Sets the value of the '{@link SBVR.AtLeastNQuantification#getMinimumCardinality <em>Minimum Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Cardinality</em>' reference.
	 * @see #getMinimumCardinality()
	 * @generated
	 */
	void setMinimumCardinality(NonNegativeInteger value);

} // AtLeastNQuantification
