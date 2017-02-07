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
import SBVR.SemanticCommunity;
import SBVR.SpeechCommunity;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Community</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.SemanticCommunityImpl#getSpeechCommunity <em>Speech Community</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SemanticCommunityImpl extends CommunityImpl implements SemanticCommunity {
	/**
	 * The cached value of the '{@link #getSpeechCommunity() <em>Speech Community</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechCommunity()
	 * @generated
	 * @ordered
	 */
	protected EList<SpeechCommunity> speechCommunity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticCommunityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.SEMANTIC_COMMUNITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpeechCommunity> getSpeechCommunity() {
		if (speechCommunity == null) {
			speechCommunity = new EObjectResolvingEList<SpeechCommunity>(SpeechCommunity.class, this, SBVRPackage.SEMANTIC_COMMUNITY__SPEECH_COMMUNITY);
		}
		return speechCommunity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.SEMANTIC_COMMUNITY__SPEECH_COMMUNITY:
				return getSpeechCommunity();
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
			case SBVRPackage.SEMANTIC_COMMUNITY__SPEECH_COMMUNITY:
				getSpeechCommunity().clear();
				getSpeechCommunity().addAll((Collection<? extends SpeechCommunity>)newValue);
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
			case SBVRPackage.SEMANTIC_COMMUNITY__SPEECH_COMMUNITY:
				getSpeechCommunity().clear();
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
			case SBVRPackage.SEMANTIC_COMMUNITY__SPEECH_COMMUNITY:
				return speechCommunity != null && !speechCommunity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemanticCommunityImpl
