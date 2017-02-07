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
 * A representation of the model object '<em><b>Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Representation#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link SBVR.Representation#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getRepresentation()
 * @model abstract="true"
 * @generated
 */
public interface Representation extends Actuality {
	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning</em>' reference.
	 * @see #setMeaning(Meaning)
	 * @see SBVR.SBVRPackage#getRepresentation_Meaning()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Meaning getMeaning();

	/**
	 * Sets the value of the '{@link SBVR.Representation#getMeaning <em>Meaning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' reference.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning(Meaning value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see SBVR.SBVRPackage#getRepresentation_Expression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link SBVR.Representation#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getExpressionText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setExpressionText(String value);

} // Representation
