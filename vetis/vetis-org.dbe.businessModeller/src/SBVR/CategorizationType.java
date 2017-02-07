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
 * A representation of the model object '<em><b>Categorization Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.CategorizationType#getIsFor <em>Is For</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getCategorizationType()
 * @model
 * @generated
 */
public interface CategorizationType extends Concept {
	/**
	 * Returns the value of the '<em><b>Is For</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is For</em>' reference list.
	 * @see SBVR.SBVRPackage#getCategorizationType_IsFor()
	 * @model
	 * @generated
	 */
	EList<Concept> getIsFor();

} // CategorizationType
