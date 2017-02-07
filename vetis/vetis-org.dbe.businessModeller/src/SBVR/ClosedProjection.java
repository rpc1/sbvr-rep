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
 * A representation of the model object '<em><b>Closed Projection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.ClosedProjection#getDefinition <em>Definition</em>}</li>
 *   <li>{@link SBVR.ClosedProjection#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link SBVR.ClosedProjection#getFactType <em>Fact Type</em>}</li>
 *   <li>{@link SBVR.ClosedProjection#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getClosedProjection()
 * @model
 * @generated
 */
public interface ClosedProjection extends ClosedSemanticFormulation, Projection {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Definition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference list.
	 * @see SBVR.SBVRPackage#getClosedProjection_Definition()
	 * @model
	 * @generated
	 */
	EList<Definition> getDefinition();

	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' reference.
	 * @see #setObjectType(ObjectType)
	 * @see SBVR.SBVRPackage#getClosedProjection_ObjectType()
	 * @model
	 * @generated
	 */
	ObjectType getObjectType();

	/**
	 * Sets the value of the '{@link SBVR.ClosedProjection#getObjectType <em>Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' reference.
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(ObjectType value);

	/**
	 * Returns the value of the '<em><b>Fact Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type</em>' reference.
	 * @see #setFactType(FactType)
	 * @see SBVR.SBVRPackage#getClosedProjection_FactType()
	 * @model
	 * @generated
	 */
	FactType getFactType();

	/**
	 * Sets the value of the '{@link SBVR.ClosedProjection#getFactType <em>Fact Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Type</em>' reference.
	 * @see #getFactType()
	 * @generated
	 */
	void setFactType(FactType value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' reference.
	 * @see #setQuestion(Question)
	 * @see SBVR.SBVRPackage#getClosedProjection_Question()
	 * @model
	 * @generated
	 */
	Question getQuestion();

	/**
	 * Sets the value of the '{@link SBVR.ClosedProjection#getQuestion <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(Question value);

} // ClosedProjection
