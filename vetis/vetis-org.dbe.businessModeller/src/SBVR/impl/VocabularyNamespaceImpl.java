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
package SBVR.impl;

import SBVR.AttributiveNamespace;
import SBVR.Language;
import SBVR.SBVRPackage;
import SBVR.VocabularyNamespace;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.VocabularyNamespaceImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link SBVR.impl.VocabularyNamespaceImpl#getAttributiveNamespace <em>Attributive Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocabularyNamespaceImpl extends NamespaceImpl implements VocabularyNamespace {
	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> language;

	/**
	 * The cached value of the '{@link #getAttributiveNamespace() <em>Attributive Namespace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributiveNamespace()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributiveNamespace> attributiveNamespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyNamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.VOCABULARY_NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Language> getLanguage() {
		if (language == null) {
			language = new EObjectResolvingEList<Language>(Language.class, this, SBVRPackage.VOCABULARY_NAMESPACE__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributiveNamespace> getAttributiveNamespace() {
		if (attributiveNamespace == null) {
			attributiveNamespace = new EObjectResolvingEList<AttributiveNamespace>(AttributiveNamespace.class, this, SBVRPackage.VOCABULARY_NAMESPACE__ATTRIBUTIVE_NAMESPACE);
		}
		return attributiveNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.VOCABULARY_NAMESPACE__LANGUAGE:
				return getLanguage();
			case SBVRPackage.VOCABULARY_NAMESPACE__ATTRIBUTIVE_NAMESPACE:
				return getAttributiveNamespace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SBVRPackage.VOCABULARY_NAMESPACE__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends Language>)newValue);
				return;
			case SBVRPackage.VOCABULARY_NAMESPACE__ATTRIBUTIVE_NAMESPACE:
				getAttributiveNamespace().clear();
				getAttributiveNamespace().addAll((Collection<? extends AttributiveNamespace>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SBVRPackage.VOCABULARY_NAMESPACE__LANGUAGE:
				getLanguage().clear();
				return;
			case SBVRPackage.VOCABULARY_NAMESPACE__ATTRIBUTIVE_NAMESPACE:
				getAttributiveNamespace().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SBVRPackage.VOCABULARY_NAMESPACE__LANGUAGE:
				return language != null && !language.isEmpty();
			case SBVRPackage.VOCABULARY_NAMESPACE__ATTRIBUTIVE_NAMESPACE:
				return attributiveNamespace != null && !attributiveNamespace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VocabularyNamespaceImpl
