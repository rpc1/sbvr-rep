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
 * A representation of the model object '<em><b>Vocabulary Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.VocabularyNamespace#getLanguage <em>Language</em>}</li>
 *   <li>{@link SBVR.VocabularyNamespace#getAttributiveNamespace <em>Attributive Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getVocabularyNamespace()
 * @model
 * @generated
 */
public interface VocabularyNamespace extends Namespace {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference list.
	 * The list contents are of type {@link SBVR.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference list.
	 * @see SBVR.SBVRPackage#getVocabularyNamespace_Language()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Language> getLanguage();

	/**
	 * Returns the value of the '<em><b>Attributive Namespace</b></em>' reference list.
	 * The list contents are of type {@link SBVR.AttributiveNamespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributive Namespace</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributive Namespace</em>' reference list.
	 * @see SBVR.SBVRPackage#getVocabularyNamespace_AttributiveNamespace()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AttributiveNamespace> getAttributiveNamespace();

} // VocabularyNamespace
