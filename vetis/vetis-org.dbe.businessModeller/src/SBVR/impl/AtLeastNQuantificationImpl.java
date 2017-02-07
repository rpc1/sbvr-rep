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

import SBVR.AtLeastNQuantification;
import SBVR.NonNegativeInteger;
import SBVR.SBVRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>At Least NQuantification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.AtLeastNQuantificationImpl#getMinimumCardinality <em>Minimum Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtLeastNQuantificationImpl extends QuantificationImpl implements AtLeastNQuantification {
	/**
	 * The cached value of the '{@link #getMinimumCardinality() <em>Minimum Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCardinality()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeInteger minimumCardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtLeastNQuantificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.AT_LEAST_NQUANTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger getMinimumCardinality() {
		if (minimumCardinality != null && minimumCardinality.eIsProxy()) {
			InternalEObject oldMinimumCardinality = (InternalEObject)minimumCardinality;
			minimumCardinality = (NonNegativeInteger)eResolveProxy(oldMinimumCardinality);
			if (minimumCardinality != oldMinimumCardinality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.AT_LEAST_NQUANTIFICATION__MINIMUM_CARDINALITY, oldMinimumCardinality, minimumCardinality));
			}
		}
		return minimumCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger basicGetMinimumCardinality() {
		return minimumCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumCardinality(NonNegativeInteger newMinimumCardinality) {
		NonNegativeInteger oldMinimumCardinality = minimumCardinality;
		minimumCardinality = newMinimumCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.AT_LEAST_NQUANTIFICATION__MINIMUM_CARDINALITY, oldMinimumCardinality, minimumCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.AT_LEAST_NQUANTIFICATION__MINIMUM_CARDINALITY:
				if (resolve) return getMinimumCardinality();
				return basicGetMinimumCardinality();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SBVRPackage.AT_LEAST_NQUANTIFICATION__MINIMUM_CARDINALITY:
				setMinimumCardinality((NonNegativeInteger)newValue);
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
			case SBVRPackage.AT_LEAST_NQUANTIFICATION__MINIMUM_CARDINALITY:
				setMinimumCardinality((NonNegativeInteger)null);
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
			case SBVRPackage.AT_LEAST_NQUANTIFICATION__MINIMUM_CARDINALITY:
				return minimumCardinality != null;
		}
		return super.eIsSet(featureID);
	}

} //AtLeastNQuantificationImpl
