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

import SBVR.LogicalFormulation;
import SBVR.Quantification;
import SBVR.SBVRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.QuantificationImpl#getScopeFormulation <em>Scope Formulation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantificationImpl extends LogicalFormulationImpl implements Quantification {
	/**
	 * The cached value of the '{@link #getScopeFormulation() <em>Scope Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeFormulation()
	 * @generated
	 * @ordered
	 */
	protected LogicalFormulation scopeFormulation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.QUANTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation getScopeFormulation() {
		if (scopeFormulation != null && scopeFormulation.eIsProxy()) {
			InternalEObject oldScopeFormulation = (InternalEObject)scopeFormulation;
			scopeFormulation = (LogicalFormulation)eResolveProxy(oldScopeFormulation);
			if (scopeFormulation != oldScopeFormulation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.QUANTIFICATION__SCOPE_FORMULATION, oldScopeFormulation, scopeFormulation));
			}
		}
		return scopeFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation basicGetScopeFormulation() {
		return scopeFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeFormulation(LogicalFormulation newScopeFormulation) {
		LogicalFormulation oldScopeFormulation = scopeFormulation;
		scopeFormulation = newScopeFormulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.QUANTIFICATION__SCOPE_FORMULATION, oldScopeFormulation, scopeFormulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.QUANTIFICATION__SCOPE_FORMULATION:
				if (resolve) return getScopeFormulation();
				return basicGetScopeFormulation();
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
			case SBVRPackage.QUANTIFICATION__SCOPE_FORMULATION:
				setScopeFormulation((LogicalFormulation)newValue);
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
			case SBVRPackage.QUANTIFICATION__SCOPE_FORMULATION:
				setScopeFormulation((LogicalFormulation)null);
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
			case SBVRPackage.QUANTIFICATION__SCOPE_FORMULATION:
				return scopeFormulation != null;
		}
		return super.eIsSet(featureID);
	}

} //QuantificationImpl
