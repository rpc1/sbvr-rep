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

import SBVR.Characteristic;
import SBVR.FactTypeRole;
import SBVR.ReferenceScheme;
import SBVR.SBVRPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.ReferenceSchemeImpl#getExtensionallyUsedRole <em>Extensionally Used Role</em>}</li>
 *   <li>{@link SBVR.impl.ReferenceSchemeImpl#getSimplyUsedRole <em>Simply Used Role</em>}</li>
 *   <li>{@link SBVR.impl.ReferenceSchemeImpl#getIdentifyingCharacteristic <em>Identifying Characteristic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceSchemeImpl extends ThingImpl implements ReferenceScheme {
	/**
	 * The cached value of the '{@link #getExtensionallyUsedRole() <em>Extensionally Used Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionallyUsedRole()
	 * @generated
	 * @ordered
	 */
	protected EList<FactTypeRole> extensionallyUsedRole;

	/**
	 * The cached value of the '{@link #getSimplyUsedRole() <em>Simply Used Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplyUsedRole()
	 * @generated
	 * @ordered
	 */
	protected EList<FactTypeRole> simplyUsedRole;

	/**
	 * The cached value of the '{@link #getIdentifyingCharacteristic() <em>Identifying Characteristic</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<Characteristic> identifyingCharacteristic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceSchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.REFERENCE_SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactTypeRole> getExtensionallyUsedRole() {
		if (extensionallyUsedRole == null) {
			extensionallyUsedRole = new EObjectResolvingEList<FactTypeRole>(FactTypeRole.class, this, SBVRPackage.REFERENCE_SCHEME__EXTENSIONALLY_USED_ROLE);
		}
		return extensionallyUsedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactTypeRole> getSimplyUsedRole() {
		if (simplyUsedRole == null) {
			simplyUsedRole = new EObjectResolvingEList<FactTypeRole>(FactTypeRole.class, this, SBVRPackage.REFERENCE_SCHEME__SIMPLY_USED_ROLE);
		}
		return simplyUsedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Characteristic> getIdentifyingCharacteristic() {
		if (identifyingCharacteristic == null) {
			identifyingCharacteristic = new EObjectResolvingEList<Characteristic>(Characteristic.class, this, SBVRPackage.REFERENCE_SCHEME__IDENTIFYING_CHARACTERISTIC);
		}
		return identifyingCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.REFERENCE_SCHEME__EXTENSIONALLY_USED_ROLE:
				return getExtensionallyUsedRole();
			case SBVRPackage.REFERENCE_SCHEME__SIMPLY_USED_ROLE:
				return getSimplyUsedRole();
			case SBVRPackage.REFERENCE_SCHEME__IDENTIFYING_CHARACTERISTIC:
				return getIdentifyingCharacteristic();
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
			case SBVRPackage.REFERENCE_SCHEME__EXTENSIONALLY_USED_ROLE:
				getExtensionallyUsedRole().clear();
				getExtensionallyUsedRole().addAll((Collection<? extends FactTypeRole>)newValue);
				return;
			case SBVRPackage.REFERENCE_SCHEME__SIMPLY_USED_ROLE:
				getSimplyUsedRole().clear();
				getSimplyUsedRole().addAll((Collection<? extends FactTypeRole>)newValue);
				return;
			case SBVRPackage.REFERENCE_SCHEME__IDENTIFYING_CHARACTERISTIC:
				getIdentifyingCharacteristic().clear();
				getIdentifyingCharacteristic().addAll((Collection<? extends Characteristic>)newValue);
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
			case SBVRPackage.REFERENCE_SCHEME__EXTENSIONALLY_USED_ROLE:
				getExtensionallyUsedRole().clear();
				return;
			case SBVRPackage.REFERENCE_SCHEME__SIMPLY_USED_ROLE:
				getSimplyUsedRole().clear();
				return;
			case SBVRPackage.REFERENCE_SCHEME__IDENTIFYING_CHARACTERISTIC:
				getIdentifyingCharacteristic().clear();
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
			case SBVRPackage.REFERENCE_SCHEME__EXTENSIONALLY_USED_ROLE:
				return extensionallyUsedRole != null && !extensionallyUsedRole.isEmpty();
			case SBVRPackage.REFERENCE_SCHEME__SIMPLY_USED_ROLE:
				return simplyUsedRole != null && !simplyUsedRole.isEmpty();
			case SBVRPackage.REFERENCE_SCHEME__IDENTIFYING_CHARACTERISTIC:
				return identifyingCharacteristic != null && !identifyingCharacteristic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferenceSchemeImpl
