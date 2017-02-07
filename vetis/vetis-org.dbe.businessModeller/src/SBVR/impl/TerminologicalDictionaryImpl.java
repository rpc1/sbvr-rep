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

import SBVR.BodyOfSharedMeanings;
import SBVR.Representation;
import SBVR.SBVRPackage;
import SBVR.TerminologicalDictionary;
import SBVR.URI;
import SBVR.Vocabulary;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminological Dictionary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.TerminologicalDictionaryImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link SBVR.impl.TerminologicalDictionaryImpl#getVocabulary <em>Vocabulary</em>}</li>
 *   <li>{@link SBVR.impl.TerminologicalDictionaryImpl#getBodyOfSharedMeaning <em>Body Of Shared Meaning</em>}</li>
 *   <li>{@link SBVR.impl.TerminologicalDictionaryImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminologicalDictionaryImpl extends EObjectImpl implements TerminologicalDictionary {
	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Representation> representation;

	/**
	 * The cached value of the '{@link #getVocabulary() <em>Vocabulary</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabulary()
	 * @generated
	 * @ordered
	 */
	protected EList<Vocabulary> vocabulary;

	/**
	 * The cached value of the '{@link #getBodyOfSharedMeaning() <em>Body Of Shared Meaning</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyOfSharedMeaning()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyOfSharedMeanings> bodyOfSharedMeaning;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected EList<URI> uri;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologicalDictionaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.TERMINOLOGICAL_DICTIONARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Representation> getRepresentation() {
		if (representation == null) {
			representation = new EObjectContainmentEList<Representation>(Representation.class, this, SBVRPackage.TERMINOLOGICAL_DICTIONARY__REPRESENTATION);
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vocabulary> getVocabulary() {
		if (vocabulary == null) {
			vocabulary = new EObjectResolvingEList<Vocabulary>(Vocabulary.class, this, SBVRPackage.TERMINOLOGICAL_DICTIONARY__VOCABULARY);
		}
		return vocabulary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodyOfSharedMeanings> getBodyOfSharedMeaning() {
		if (bodyOfSharedMeaning == null) {
			bodyOfSharedMeaning = new EObjectResolvingEList<BodyOfSharedMeanings>(BodyOfSharedMeanings.class, this, SBVRPackage.TERMINOLOGICAL_DICTIONARY__BODY_OF_SHARED_MEANING);
		}
		return bodyOfSharedMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URI> getUri() {
		if (uri == null) {
			uri = new EObjectResolvingEList<URI>(URI.class, this, SBVRPackage.TERMINOLOGICAL_DICTIONARY__URI);
		}
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__REPRESENTATION:
				return ((InternalEList<?>)getRepresentation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__REPRESENTATION:
				return getRepresentation();
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__VOCABULARY:
				return getVocabulary();
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__BODY_OF_SHARED_MEANING:
				return getBodyOfSharedMeaning();
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__URI:
				return getUri();
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
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__REPRESENTATION:
				getRepresentation().clear();
				getRepresentation().addAll((Collection<? extends Representation>)newValue);
				return;
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__VOCABULARY:
				getVocabulary().clear();
				getVocabulary().addAll((Collection<? extends Vocabulary>)newValue);
				return;
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__BODY_OF_SHARED_MEANING:
				getBodyOfSharedMeaning().clear();
				getBodyOfSharedMeaning().addAll((Collection<? extends BodyOfSharedMeanings>)newValue);
				return;
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends URI>)newValue);
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
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__REPRESENTATION:
				getRepresentation().clear();
				return;
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__VOCABULARY:
				getVocabulary().clear();
				return;
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__BODY_OF_SHARED_MEANING:
				getBodyOfSharedMeaning().clear();
				return;
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__URI:
				getUri().clear();
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
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__REPRESENTATION:
				return representation != null && !representation.isEmpty();
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__VOCABULARY:
				return vocabulary != null && !vocabulary.isEmpty();
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__BODY_OF_SHARED_MEANING:
				return bodyOfSharedMeaning != null && !bodyOfSharedMeaning.isEmpty();
			case SBVRPackage.TERMINOLOGICAL_DICTIONARY__URI:
				return uri != null && !uri.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TerminologicalDictionaryImpl
