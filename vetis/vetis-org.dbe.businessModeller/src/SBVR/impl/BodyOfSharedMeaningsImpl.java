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
import SBVR.Concept;
import SBVR.Proposition;
import SBVR.SBVRPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Of Shared Meanings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.BodyOfSharedMeaningsImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link SBVR.impl.BodyOfSharedMeaningsImpl#getProposition <em>Proposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyOfSharedMeaningsImpl extends SetImpl implements BodyOfSharedMeanings {
	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> concept;

	/**
	 * The cached value of the '{@link #getProposition() <em>Proposition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposition()
	 * @generated
	 * @ordered
	 */
	protected EList<Proposition> proposition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyOfSharedMeaningsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.BODY_OF_SHARED_MEANINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<Concept>(Concept.class, this, SBVRPackage.BODY_OF_SHARED_MEANINGS__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Proposition> getProposition() {
		if (proposition == null) {
			proposition = new EObjectContainmentEList<Proposition>(Proposition.class, this, SBVRPackage.BODY_OF_SHARED_MEANINGS__PROPOSITION);
		}
		return proposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SBVRPackage.BODY_OF_SHARED_MEANINGS__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
			case SBVRPackage.BODY_OF_SHARED_MEANINGS__PROPOSITION:
				return ((InternalEList<?>)getProposition()).basicRemove(otherEnd, msgs);
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
			case SBVRPackage.BODY_OF_SHARED_MEANINGS__CONCEPT:
				return getConcept();
			case SBVRPackage.BODY_OF_SHARED_MEANINGS__PROPOSITION:
				return getProposition();
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
			case SBVRPackage.BODY_OF_SHARED_MEANINGS__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends Concept>)newValue);
				return;
			case SBVRPackage.BODY_OF_SHARED_MEANINGS__PROPOSITION:
				getProposition().clear();
				getProposition().addAll((Collection<? extends Proposition>)newValue);
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
			case SBVRPackage.BODY_OF_SHARED_MEANINGS__CONCEPT:
				getConcept().clear();
				return;
			case SBVRPackage.BODY_OF_SHARED_MEANINGS__PROPOSITION:
				getProposition().clear();
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
			case SBVRPackage.BODY_OF_SHARED_MEANINGS__CONCEPT:
				return concept != null && !concept.isEmpty();
			case SBVRPackage.BODY_OF_SHARED_MEANINGS__PROPOSITION:
				return proposition != null && !proposition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyOfSharedMeaningsImpl
