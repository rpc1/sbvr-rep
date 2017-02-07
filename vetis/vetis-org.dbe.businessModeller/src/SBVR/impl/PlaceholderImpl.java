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

import SBVR.Designation;
import SBVR.Placeholder;
import SBVR.PositiveInteger;
import SBVR.SBVRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.PlaceholderImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link SBVR.impl.PlaceholderImpl#getIsAtStartingCharacterPosition <em>Is At Starting Character Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceholderImpl extends DesignationImpl implements Placeholder {
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected Designation uses;

	/**
	 * The cached value of the '{@link #getIsAtStartingCharacterPosition() <em>Is At Starting Character Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtStartingCharacterPosition()
	 * @generated
	 * @ordered
	 */
	protected PositiveInteger isAtStartingCharacterPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceholderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.PLACEHOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Designation getUses() {
		if (uses != null && uses.eIsProxy()) {
			InternalEObject oldUses = (InternalEObject)uses;
			uses = (Designation)eResolveProxy(oldUses);
			if (uses != oldUses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.PLACEHOLDER__USES, oldUses, uses));
			}
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Designation basicGetUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUses(Designation newUses) {
		Designation oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PLACEHOLDER__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInteger getIsAtStartingCharacterPosition() {
		if (isAtStartingCharacterPosition != null && isAtStartingCharacterPosition.eIsProxy()) {
			InternalEObject oldIsAtStartingCharacterPosition = (InternalEObject)isAtStartingCharacterPosition;
			isAtStartingCharacterPosition = (PositiveInteger)eResolveProxy(oldIsAtStartingCharacterPosition);
			if (isAtStartingCharacterPosition != oldIsAtStartingCharacterPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.PLACEHOLDER__IS_AT_STARTING_CHARACTER_POSITION, oldIsAtStartingCharacterPosition, isAtStartingCharacterPosition));
			}
		}
		return isAtStartingCharacterPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInteger basicGetIsAtStartingCharacterPosition() {
		return isAtStartingCharacterPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAtStartingCharacterPosition(PositiveInteger newIsAtStartingCharacterPosition) {
		PositiveInteger oldIsAtStartingCharacterPosition = isAtStartingCharacterPosition;
		isAtStartingCharacterPosition = newIsAtStartingCharacterPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PLACEHOLDER__IS_AT_STARTING_CHARACTER_POSITION, oldIsAtStartingCharacterPosition, isAtStartingCharacterPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.PLACEHOLDER__USES:
				if (resolve) return getUses();
				return basicGetUses();
			case SBVRPackage.PLACEHOLDER__IS_AT_STARTING_CHARACTER_POSITION:
				if (resolve) return getIsAtStartingCharacterPosition();
				return basicGetIsAtStartingCharacterPosition();
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
			case SBVRPackage.PLACEHOLDER__USES:
				setUses((Designation)newValue);
				return;
			case SBVRPackage.PLACEHOLDER__IS_AT_STARTING_CHARACTER_POSITION:
				setIsAtStartingCharacterPosition((PositiveInteger)newValue);
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
			case SBVRPackage.PLACEHOLDER__USES:
				setUses((Designation)null);
				return;
			case SBVRPackage.PLACEHOLDER__IS_AT_STARTING_CHARACTER_POSITION:
				setIsAtStartingCharacterPosition((PositiveInteger)null);
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
			case SBVRPackage.PLACEHOLDER__USES:
				return uses != null;
			case SBVRPackage.PLACEHOLDER__IS_AT_STARTING_CHARACTER_POSITION:
				return isAtStartingCharacterPosition != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceholderImpl
