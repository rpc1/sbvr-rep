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
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Unit of knowledge created by a unique combination of characteristics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Concept#getDesignation <em>Designation</em>}</li>
 *   <li>{@link SBVR.Concept#getDefinition <em>Definition</em>}</li>
 *   <li>{@link SBVR.Concept#getGeneral <em>General</em>}</li>
 *   <li>{@link SBVR.Concept#getCoextensive <em>Coextensive</em>}</li>
 *   <li>{@link SBVR.Concept#getInstance <em>Instance</em>}</li>
 *   <li>{@link SBVR.Concept#getExtension <em>Extension</em>}</li>
 *   <li>{@link SBVR.Concept#getReferenceScheme <em>Reference Scheme</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getConcept()
 * @model abstract="true"
 * @generated
 */
public interface Concept extends Meaning {
	/**
	 * Returns the value of the '<em><b>Designation</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Designation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation</em>' reference list.
	 * @see SBVR.SBVRPackage#getConcept_Designation()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<Designation> getDesignation();

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
	 * @see SBVR.SBVRPackage#getConcept_Definition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Definition> getDefinition();

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see SBVR.SBVRPackage#getConcept_General()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Concept> getGeneral();

	/**
	 * Returns the value of the '<em><b>Coextensive</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coextensive</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coextensive</em>' reference list.
	 * @see SBVR.SBVRPackage#getConcept_Coextensive()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Concept> getCoextensive();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Thing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference list.
	 * @see SBVR.SBVRPackage#getConcept_Instance()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Thing> getInstance();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference.
	 * @see #setExtension(Set)
	 * @see SBVR.SBVRPackage#getConcept_Extension()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Set getExtension();

	/**
	 * Sets the value of the '{@link SBVR.Concept#getExtension <em>Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(Set value);

	/**
	 * Returns the value of the '<em><b>Reference Scheme</b></em>' reference list.
	 * The list contents are of type {@link SBVR.ReferenceScheme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Scheme</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Scheme</em>' reference list.
	 * @see SBVR.SBVRPackage#getConcept_ReferenceScheme()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ReferenceScheme> getReferenceScheme();

} // Concept
