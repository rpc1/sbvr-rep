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
 * A representation of the model object '<em><b>Communication Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.CommunicationContent#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getCommunicationContent()
 * @model
 * @generated
 */
public interface CommunicationContent extends Representation {
	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Representation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' reference list.
	 * @see SBVR.SBVRPackage#getCommunicationContent_Representation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Representation> getRepresentation();

} // CommunicationContent
