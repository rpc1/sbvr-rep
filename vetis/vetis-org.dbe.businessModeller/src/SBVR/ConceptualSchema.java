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
 * A representation of the model object '<em><b>Conceptual Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.ConceptualSchema#getConcept <em>Concept</em>}</li>
 *   <li>{@link SBVR.ConceptualSchema#getFact <em>Fact</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getConceptualSchema()
 * @model
 * @generated
 */
public interface ConceptualSchema extends Thing {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link SBVR.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see SBVR.SBVRPackage#getConceptualSchema_Concept()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Concept> getConcept();

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
	 * @see SBVR.SBVRPackage#getConceptualSchema_Fact()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Fact> getFact();

} // ConceptualSchema
