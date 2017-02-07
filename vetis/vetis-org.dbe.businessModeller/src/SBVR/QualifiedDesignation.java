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
 * A representation of the model object '<em><b>Qualified Designation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.QualifiedDesignation#isPreferred <em>Preferred</em>}</li>
 *   <li>{@link SBVR.QualifiedDesignation#isProhibited <em>Prohibited</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getQualifiedDesignation()
 * @model abstract="true"
 * @generated
 */
public interface QualifiedDesignation extends Designation {
	/**
	 * Returns the value of the '<em><b>Preferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred</em>' attribute.
	 * @see #setPreferred(boolean)
	 * @see SBVR.SBVRPackage#getQualifiedDesignation_Preferred()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isPreferred();

	/**
	 * Sets the value of the '{@link SBVR.QualifiedDesignation#isPreferred <em>Preferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred</em>' attribute.
	 * @see #isPreferred()
	 * @generated
	 */
	void setPreferred(boolean value);

	/**
	 * Returns the value of the '<em><b>Prohibited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prohibited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prohibited</em>' attribute.
	 * @see #setProhibited(boolean)
	 * @see SBVR.SBVRPackage#getQualifiedDesignation_Prohibited()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isProhibited();

	/**
	 * Sets the value of the '{@link SBVR.QualifiedDesignation#isProhibited <em>Prohibited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prohibited</em>' attribute.
	 * @see #isProhibited()
	 * @generated
	 */
	void setProhibited(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" signifierRequired="true" signifierOrdered="false"
	 * @generated
	 */
	Designation createSynonym(String signifier);

} // QualifiedDesignation
