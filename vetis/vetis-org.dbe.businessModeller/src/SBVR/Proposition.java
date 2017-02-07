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
 * A representation of the model object '<em><b>Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Meaning that is true or false. Every meaning that is true or is false is a proposition. That is, a proposition is a meaning that
 * has a truth value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Proposition#getStatement <em>Statement</em>}</li>
 *   <li>{@link SBVR.Proposition#getIsTrue <em>Is True</em>}</li>
 *   <li>{@link SBVR.Proposition#getIsFalse <em>Is False</em>}</li>
 *   <li>{@link SBVR.Proposition#getIsNecessarilyTrue <em>Is Necessarily True</em>}</li>
 *   <li>{@link SBVR.Proposition#getIsPossibilyTrue <em>Is Possibily True</em>}</li>
 *   <li>{@link SBVR.Proposition#getIsObligatedToBeTrue <em>Is Obligated To Be True</em>}</li>
 *   <li>{@link SBVR.Proposition#getIsPermittedToBeTrue <em>Is Permitted To Be True</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getProposition()
 * @model
 * @generated
 */
public interface Proposition extends Meaning {
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
	 * @see SBVR.SBVRPackage#getProposition_Statement()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Statement> getStatement();

	/**
	 * Returns the value of the '<em><b>Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is True</em>' attribute.
	 * @see #setIsTrue(Boolean)
	 * @see SBVR.SBVRPackage#getProposition_IsTrue()
	 * @model unique="false" dataType="SBVR.BooleanObject" ordered="false"
	 * @generated
	 */
	Boolean getIsTrue();

	/**
	 * Sets the value of the '{@link SBVR.Proposition#getIsTrue <em>Is True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is True</em>' attribute.
	 * @see #getIsTrue()
	 * @generated
	 */
	void setIsTrue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is False</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is False</em>' attribute.
	 * @see #setIsFalse(Boolean)
	 * @see SBVR.SBVRPackage#getProposition_IsFalse()
	 * @model unique="false" dataType="SBVR.BooleanObject" ordered="false"
	 * @generated
	 */
	Boolean getIsFalse();

	/**
	 * Sets the value of the '{@link SBVR.Proposition#getIsFalse <em>Is False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is False</em>' attribute.
	 * @see #getIsFalse()
	 * @generated
	 */
	void setIsFalse(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Necessarily True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Necessarily True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Necessarily True</em>' attribute.
	 * @see #setIsNecessarilyTrue(Boolean)
	 * @see SBVR.SBVRPackage#getProposition_IsNecessarilyTrue()
	 * @model unique="false" dataType="SBVR.BooleanObject" ordered="false"
	 * @generated
	 */
	Boolean getIsNecessarilyTrue();

	/**
	 * Sets the value of the '{@link SBVR.Proposition#getIsNecessarilyTrue <em>Is Necessarily True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Necessarily True</em>' attribute.
	 * @see #getIsNecessarilyTrue()
	 * @generated
	 */
	void setIsNecessarilyTrue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Possibily True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Possibily True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Possibily True</em>' attribute.
	 * @see #setIsPossibilyTrue(Boolean)
	 * @see SBVR.SBVRPackage#getProposition_IsPossibilyTrue()
	 * @model unique="false" dataType="SBVR.BooleanObject" ordered="false"
	 * @generated
	 */
	Boolean getIsPossibilyTrue();

	/**
	 * Sets the value of the '{@link SBVR.Proposition#getIsPossibilyTrue <em>Is Possibily True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Possibily True</em>' attribute.
	 * @see #getIsPossibilyTrue()
	 * @generated
	 */
	void setIsPossibilyTrue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Obligated To Be True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Obligated To Be True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Obligated To Be True</em>' attribute.
	 * @see #setIsObligatedToBeTrue(Boolean)
	 * @see SBVR.SBVRPackage#getProposition_IsObligatedToBeTrue()
	 * @model unique="false" dataType="SBVR.BooleanObject" ordered="false"
	 * @generated
	 */
	Boolean getIsObligatedToBeTrue();

	/**
	 * Sets the value of the '{@link SBVR.Proposition#getIsObligatedToBeTrue <em>Is Obligated To Be True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Obligated To Be True</em>' attribute.
	 * @see #getIsObligatedToBeTrue()
	 * @generated
	 */
	void setIsObligatedToBeTrue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Permitted To Be True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Permitted To Be True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Permitted To Be True</em>' attribute.
	 * @see #setIsPermittedToBeTrue(Boolean)
	 * @see SBVR.SBVRPackage#getProposition_IsPermittedToBeTrue()
	 * @model unique="false" dataType="SBVR.BooleanObject" ordered="false"
	 * @generated
	 */
	Boolean getIsPermittedToBeTrue();

	/**
	 * Sets the value of the '{@link SBVR.Proposition#getIsPermittedToBeTrue <em>Is Permitted To Be True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Permitted To Be True</em>' attribute.
	 * @see #getIsPermittedToBeTrue()
	 * @generated
	 */
	void setIsPermittedToBeTrue(Boolean value);

} // Proposition
