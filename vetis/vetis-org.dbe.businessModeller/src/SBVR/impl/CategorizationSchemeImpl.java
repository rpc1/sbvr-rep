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

import SBVR.CategorizationScheme;
import SBVR.CategorizationType;
import SBVR.Concept;
import SBVR.SBVRPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categorization Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.CategorizationSchemeImpl#getIsBasedOn <em>Is Based On</em>}</li>
 *   <li>{@link SBVR.impl.CategorizationSchemeImpl#getContainsCategory <em>Contains Category</em>}</li>
 *   <li>{@link SBVR.impl.CategorizationSchemeImpl#getIsFor <em>Is For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategorizationSchemeImpl extends SetImpl implements CategorizationScheme {
	/**
	 * The cached value of the '{@link #getIsBasedOn() <em>Is Based On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBasedOn()
	 * @generated
	 * @ordered
	 */
	protected CategorizationType isBasedOn;

	/**
	 * The cached value of the '{@link #getContainsCategory() <em>Contains Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> containsCategory;

	/**
	 * The cached value of the '{@link #getIsFor() <em>Is For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> isFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorizationSchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.CATEGORIZATION_SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorizationType getIsBasedOn() {
		if (isBasedOn != null && isBasedOn.eIsProxy()) {
			InternalEObject oldIsBasedOn = (InternalEObject)isBasedOn;
			isBasedOn = (CategorizationType)eResolveProxy(oldIsBasedOn);
			if (isBasedOn != oldIsBasedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.CATEGORIZATION_SCHEME__IS_BASED_ON, oldIsBasedOn, isBasedOn));
			}
		}
		return isBasedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorizationType basicGetIsBasedOn() {
		return isBasedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBasedOn(CategorizationType newIsBasedOn) {
		CategorizationType oldIsBasedOn = isBasedOn;
		isBasedOn = newIsBasedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.CATEGORIZATION_SCHEME__IS_BASED_ON, oldIsBasedOn, isBasedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getContainsCategory() {
		if (containsCategory == null) {
			containsCategory = new EObjectContainmentEList<Concept>(Concept.class, this, SBVRPackage.CATEGORIZATION_SCHEME__CONTAINS_CATEGORY);
		}
		return containsCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getIsFor() {
		if (isFor == null) {
			isFor = new EObjectResolvingEList<Concept>(Concept.class, this, SBVRPackage.CATEGORIZATION_SCHEME__IS_FOR);
		}
		return isFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SBVRPackage.CATEGORIZATION_SCHEME__CONTAINS_CATEGORY:
				return ((InternalEList<?>)getContainsCategory()).basicRemove(otherEnd, msgs);
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
			case SBVRPackage.CATEGORIZATION_SCHEME__IS_BASED_ON:
				if (resolve) return getIsBasedOn();
				return basicGetIsBasedOn();
			case SBVRPackage.CATEGORIZATION_SCHEME__CONTAINS_CATEGORY:
				return getContainsCategory();
			case SBVRPackage.CATEGORIZATION_SCHEME__IS_FOR:
				return getIsFor();
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
			case SBVRPackage.CATEGORIZATION_SCHEME__IS_BASED_ON:
				setIsBasedOn((CategorizationType)newValue);
				return;
			case SBVRPackage.CATEGORIZATION_SCHEME__CONTAINS_CATEGORY:
				getContainsCategory().clear();
				getContainsCategory().addAll((Collection<? extends Concept>)newValue);
				return;
			case SBVRPackage.CATEGORIZATION_SCHEME__IS_FOR:
				getIsFor().clear();
				getIsFor().addAll((Collection<? extends Concept>)newValue);
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
			case SBVRPackage.CATEGORIZATION_SCHEME__IS_BASED_ON:
				setIsBasedOn((CategorizationType)null);
				return;
			case SBVRPackage.CATEGORIZATION_SCHEME__CONTAINS_CATEGORY:
				getContainsCategory().clear();
				return;
			case SBVRPackage.CATEGORIZATION_SCHEME__IS_FOR:
				getIsFor().clear();
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
			case SBVRPackage.CATEGORIZATION_SCHEME__IS_BASED_ON:
				return isBasedOn != null;
			case SBVRPackage.CATEGORIZATION_SCHEME__CONTAINS_CATEGORY:
				return containsCategory != null && !containsCategory.isEmpty();
			case SBVRPackage.CATEGORIZATION_SCHEME__IS_FOR:
				return isFor != null && !isFor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategorizationSchemeImpl
