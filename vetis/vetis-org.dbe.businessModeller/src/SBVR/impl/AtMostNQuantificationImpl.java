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

import SBVR.AtMostNQuantification;
import SBVR.NonNegativeInteger;
import SBVR.SBVRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>At Most NQuantification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.AtMostNQuantificationImpl#getMaximumCardinality <em>Maximum Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtMostNQuantificationImpl extends QuantificationImpl implements AtMostNQuantification {
	/**
	 * The cached value of the '{@link #getMaximumCardinality() <em>Maximum Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCardinality()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeInteger maximumCardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtMostNQuantificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.AT_MOST_NQUANTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger getMaximumCardinality() {
		if (maximumCardinality != null && maximumCardinality.eIsProxy()) {
			InternalEObject oldMaximumCardinality = (InternalEObject)maximumCardinality;
			maximumCardinality = (NonNegativeInteger)eResolveProxy(oldMaximumCardinality);
			if (maximumCardinality != oldMaximumCardinality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.AT_MOST_NQUANTIFICATION__MAXIMUM_CARDINALITY, oldMaximumCardinality, maximumCardinality));
			}
		}
		return maximumCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger basicGetMaximumCardinality() {
		return maximumCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumCardinality(NonNegativeInteger newMaximumCardinality) {
		NonNegativeInteger oldMaximumCardinality = maximumCardinality;
		maximumCardinality = newMaximumCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.AT_MOST_NQUANTIFICATION__MAXIMUM_CARDINALITY, oldMaximumCardinality, maximumCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.AT_MOST_NQUANTIFICATION__MAXIMUM_CARDINALITY:
				if (resolve) return getMaximumCardinality();
				return basicGetMaximumCardinality();
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
			case SBVRPackage.AT_MOST_NQUANTIFICATION__MAXIMUM_CARDINALITY:
				setMaximumCardinality((NonNegativeInteger)newValue);
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
			case SBVRPackage.AT_MOST_NQUANTIFICATION__MAXIMUM_CARDINALITY:
				setMaximumCardinality((NonNegativeInteger)null);
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
			case SBVRPackage.AT_MOST_NQUANTIFICATION__MAXIMUM_CARDINALITY:
				return maximumCardinality != null;
		}
		return super.eIsSet(featureID);
	}

} //AtMostNQuantificationImpl
