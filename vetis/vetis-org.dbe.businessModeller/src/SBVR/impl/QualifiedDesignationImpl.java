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
import SBVR.QualifiedDesignation;
import SBVR.SBVRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Designation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.QualifiedDesignationImpl#isPreferred <em>Preferred</em>}</li>
 *   <li>{@link SBVR.impl.QualifiedDesignationImpl#isProhibited <em>Prohibited</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class QualifiedDesignationImpl extends DesignationImpl implements QualifiedDesignation {
	/**
	 * The default value of the '{@link #isPreferred() <em>Preferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreferred()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREFERRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreferred() <em>Preferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreferred()
	 * @generated
	 * @ordered
	 */
	protected boolean preferred = PREFERRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isProhibited() <em>Prohibited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProhibited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROHIBITED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProhibited() <em>Prohibited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProhibited()
	 * @generated
	 * @ordered
	 */
	protected boolean prohibited = PROHIBITED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifiedDesignationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.QUALIFIED_DESIGNATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreferred() {
		return preferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferred(boolean newPreferred) {
		boolean oldPreferred = preferred;
		preferred = newPreferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.QUALIFIED_DESIGNATION__PREFERRED, oldPreferred, preferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProhibited() {
		return prohibited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProhibited(boolean newProhibited) {
		boolean oldProhibited = prohibited;
		prohibited = newProhibited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.QUALIFIED_DESIGNATION__PROHIBITED, oldProhibited, prohibited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Designation createSynonym(String signifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.QUALIFIED_DESIGNATION__PREFERRED:
				return isPreferred() ? Boolean.TRUE : Boolean.FALSE;
			case SBVRPackage.QUALIFIED_DESIGNATION__PROHIBITED:
				return isProhibited() ? Boolean.TRUE : Boolean.FALSE;
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
			case SBVRPackage.QUALIFIED_DESIGNATION__PREFERRED:
				setPreferred(((Boolean)newValue).booleanValue());
				return;
			case SBVRPackage.QUALIFIED_DESIGNATION__PROHIBITED:
				setProhibited(((Boolean)newValue).booleanValue());
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
			case SBVRPackage.QUALIFIED_DESIGNATION__PREFERRED:
				setPreferred(PREFERRED_EDEFAULT);
				return;
			case SBVRPackage.QUALIFIED_DESIGNATION__PROHIBITED:
				setProhibited(PROHIBITED_EDEFAULT);
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
			case SBVRPackage.QUALIFIED_DESIGNATION__PREFERRED:
				return preferred != PREFERRED_EDEFAULT;
			case SBVRPackage.QUALIFIED_DESIGNATION__PROHIBITED:
				return prohibited != PROHIBITED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (preferred: ");
		result.append(preferred);
		result.append(", prohibited: ");
		result.append(prohibited);
		result.append(')');
		return result.toString();
	}

} //QualifiedDesignationImpl
