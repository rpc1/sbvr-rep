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

import SBVR.SBVRPackage;
import SBVR.SpeechCommunity;
import SBVR.Vocabulary;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speech Community</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.SpeechCommunityImpl#getOwnedVocabulary <em>Owned Vocabulary</em>}</li>
 *   <li>{@link SBVR.impl.SpeechCommunityImpl#getUsedVocabulary <em>Used Vocabulary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpeechCommunityImpl extends CommunityImpl implements SpeechCommunity {
	/**
	 * The cached value of the '{@link #getOwnedVocabulary() <em>Owned Vocabulary</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVocabulary()
	 * @generated
	 * @ordered
	 */
	protected EList<Vocabulary> ownedVocabulary;

	/**
	 * The cached value of the '{@link #getUsedVocabulary() <em>Used Vocabulary</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedVocabulary()
	 * @generated
	 * @ordered
	 */
	protected EList<Vocabulary> usedVocabulary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechCommunityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.SPEECH_COMMUNITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vocabulary> getOwnedVocabulary() {
		if (ownedVocabulary == null) {
			ownedVocabulary = new EObjectResolvingEList<Vocabulary>(Vocabulary.class, this, SBVRPackage.SPEECH_COMMUNITY__OWNED_VOCABULARY);
		}
		return ownedVocabulary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vocabulary> getUsedVocabulary() {
		if (usedVocabulary == null) {
			usedVocabulary = new EObjectResolvingEList<Vocabulary>(Vocabulary.class, this, SBVRPackage.SPEECH_COMMUNITY__USED_VOCABULARY);
		}
		return usedVocabulary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.SPEECH_COMMUNITY__OWNED_VOCABULARY:
				return getOwnedVocabulary();
			case SBVRPackage.SPEECH_COMMUNITY__USED_VOCABULARY:
				return getUsedVocabulary();
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
			case SBVRPackage.SPEECH_COMMUNITY__OWNED_VOCABULARY:
				getOwnedVocabulary().clear();
				getOwnedVocabulary().addAll((Collection<? extends Vocabulary>)newValue);
				return;
			case SBVRPackage.SPEECH_COMMUNITY__USED_VOCABULARY:
				getUsedVocabulary().clear();
				getUsedVocabulary().addAll((Collection<? extends Vocabulary>)newValue);
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
			case SBVRPackage.SPEECH_COMMUNITY__OWNED_VOCABULARY:
				getOwnedVocabulary().clear();
				return;
			case SBVRPackage.SPEECH_COMMUNITY__USED_VOCABULARY:
				getUsedVocabulary().clear();
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
			case SBVRPackage.SPEECH_COMMUNITY__OWNED_VOCABULARY:
				return ownedVocabulary != null && !ownedVocabulary.isEmpty();
			case SBVRPackage.SPEECH_COMMUNITY__USED_VOCABULARY:
				return usedVocabulary != null && !usedVocabulary.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpeechCommunityImpl
