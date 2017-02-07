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
 * A representation of the model object '<em><b>Speech Community</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.SpeechCommunity#getOwnedVocabulary <em>Owned Vocabulary</em>}</li>
 *   <li>{@link SBVR.SpeechCommunity#getUsedVocabulary <em>Used Vocabulary</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getSpeechCommunity()
 * @model
 * @generated
 */
public interface SpeechCommunity extends Community {
	/**
	 * Returns the value of the '<em><b>Owned Vocabulary</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Vocabulary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Vocabulary</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Vocabulary</em>' reference list.
	 * @see SBVR.SBVRPackage#getSpeechCommunity_OwnedVocabulary()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Vocabulary> getOwnedVocabulary();

	/**
	 * Returns the value of the '<em><b>Used Vocabulary</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Vocabulary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Vocabulary</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Vocabulary</em>' reference list.
	 * @see SBVR.SBVRPackage#getSpeechCommunity_UsedVocabulary()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Vocabulary> getUsedVocabulary();

} // SpeechCommunity
