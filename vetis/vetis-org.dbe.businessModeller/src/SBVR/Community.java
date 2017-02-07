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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Community</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Community#getUri <em>Uri</em>}</li>
 *   <li>{@link SBVR.Community#getSubCommunity <em>Sub Community</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getCommunity()
 * @model
 * @generated
 */
public interface Community extends EObject {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' reference list.
	 * The list contents are of type {@link SBVR.URI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' reference list.
	 * @see SBVR.SBVRPackage#getCommunity_Uri()
	 * @model ordered="false"
	 * @generated
	 */
	EList<URI> getUri();

	/**
	 * Returns the value of the '<em><b>Sub Community</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Community}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Community</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Community</em>' reference list.
	 * @see SBVR.SBVRPackage#getCommunity_SubCommunity()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Community> getSubCommunity();

} // Community
