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
 * A representation of the model object '<em><b>Attributive Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.AttributiveNamespace#getSubjectConcept <em>Subject Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getAttributiveNamespace()
 * @model
 * @generated
 */
public interface AttributiveNamespace extends Namespace {
	/**
	 * Returns the value of the '<em><b>Subject Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Concept</em>' reference.
	 * @see #setSubjectConcept(Concept)
	 * @see SBVR.SBVRPackage#getAttributiveNamespace_SubjectConcept()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Concept getSubjectConcept();

	/**
	 * Sets the value of the '{@link SBVR.AttributiveNamespace#getSubjectConcept <em>Subject Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Concept</em>' reference.
	 * @see #getSubjectConcept()
	 * @generated
	 */
	void setSubjectConcept(Concept value);

} // AttributiveNamespace
