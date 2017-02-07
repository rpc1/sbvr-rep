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
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Name#getRefersTo <em>Refers To</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getName_()
 * @model
 * @generated
 */
public interface Name extends QualifiedDesignation {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Thing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference list.
	 * @see SBVR.SBVRPackage#getName_RefersTo()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Thing> getRefersTo();

} // Name
