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
 * A representation of the model object '<em><b>Fact Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.FactModel#getConceptualSchema <em>Conceptual Schema</em>}</li>
 *   <li>{@link SBVR.FactModel#getFact <em>Fact</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getFactModel()
 * @model
 * @generated
 */
public interface FactModel extends Thing {
	/**
	 * Returns the value of the '<em><b>Conceptual Schema</b></em>' reference list.
	 * The list contents are of type {@link SBVR.ConceptualSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conceptual Schema</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual Schema</em>' reference list.
	 * @see SBVR.SBVRPackage#getFactModel_ConceptualSchema()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ConceptualSchema> getConceptualSchema();

	/**
	 * Returns the value of the '<em><b>Fact</b></em>' containment reference list.
	 * The list contents are of type {@link SBVR.Fact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' containment reference list.
	 * @see SBVR.SBVRPackage#getFactModel_Fact()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Fact> getFact();

} // FactModel
