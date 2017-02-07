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

import SBVR.Quantity;
import SBVR.SBVRPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.QuantityImpl#getEqualTo <em>Equal To</em>}</li>
 *   <li>{@link SBVR.impl.QuantityImpl#getLessThan <em>Less Than</em>}</li>
 *   <li>{@link SBVR.impl.QuantityImpl#getGreaterThan <em>Greater Than</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class QuantityImpl extends NounConceptImpl implements Quantity {
	/**
	 * The cached value of the '{@link #getEqualTo() <em>Equal To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> equalTo;

	/**
	 * The cached value of the '{@link #getLessThan() <em>Less Than</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLessThan()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> lessThan;

	/**
	 * The cached value of the '{@link #getGreaterThan() <em>Greater Than</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreaterThan()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> greaterThan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.QUANTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quantity> getEqualTo() {
		if (equalTo == null) {
			equalTo = new EObjectResolvingEList<Quantity>(Quantity.class, this, SBVRPackage.QUANTITY__EQUAL_TO);
		}
		return equalTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quantity> getLessThan() {
		if (lessThan == null) {
			lessThan = new EObjectResolvingEList<Quantity>(Quantity.class, this, SBVRPackage.QUANTITY__LESS_THAN);
		}
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quantity> getGreaterThan() {
		if (greaterThan == null) {
			greaterThan = new EObjectResolvingEList<Quantity>(Quantity.class, this, SBVRPackage.QUANTITY__GREATER_THAN);
		}
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.QUANTITY__EQUAL_TO:
				return getEqualTo();
			case SBVRPackage.QUANTITY__LESS_THAN:
				return getLessThan();
			case SBVRPackage.QUANTITY__GREATER_THAN:
				return getGreaterThan();
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
			case SBVRPackage.QUANTITY__EQUAL_TO:
				getEqualTo().clear();
				getEqualTo().addAll((Collection<? extends Quantity>)newValue);
				return;
			case SBVRPackage.QUANTITY__LESS_THAN:
				getLessThan().clear();
				getLessThan().addAll((Collection<? extends Quantity>)newValue);
				return;
			case SBVRPackage.QUANTITY__GREATER_THAN:
				getGreaterThan().clear();
				getGreaterThan().addAll((Collection<? extends Quantity>)newValue);
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
			case SBVRPackage.QUANTITY__EQUAL_TO:
				getEqualTo().clear();
				return;
			case SBVRPackage.QUANTITY__LESS_THAN:
				getLessThan().clear();
				return;
			case SBVRPackage.QUANTITY__GREATER_THAN:
				getGreaterThan().clear();
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
			case SBVRPackage.QUANTITY__EQUAL_TO:
				return equalTo != null && !equalTo.isEmpty();
			case SBVRPackage.QUANTITY__LESS_THAN:
				return lessThan != null && !lessThan.isEmpty();
			case SBVRPackage.QUANTITY__GREATER_THAN:
				return greaterThan != null && !greaterThan.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuantityImpl
