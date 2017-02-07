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
 * A representation of the model object '<em><b>Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SBVR.SBVRPackage#getObjectType()
 * @model
 * @generated
 */
public interface ObjectType extends NounConcept {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" signifierRequired="true" signifierOrdered="false"
	 * @generated
	 */
	Characteristic createCharacteristic(String signifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" targetRequired="true" targetOrdered="false" signifierRequired="true" signifierOrdered="false"
	 * @generated
	 */
	BinaryFactType createBinaryFactType(ObjectType target, String signifier);

} // ObjectType
