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

import SBVR.Implication;
import SBVR.LogicalFormulation;
import SBVR.SBVRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.ImplicationImpl#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link SBVR.impl.ImplicationImpl#getConsequent <em>Consequent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplicationImpl extends BinaryLogicalOperationImpl implements Implication {
	/**
	 * The cached value of the '{@link #getAntecedent() <em>Antecedent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedent()
	 * @generated
	 * @ordered
	 */
	protected LogicalFormulation antecedent;

	/**
	 * The cached value of the '{@link #getConsequent() <em>Consequent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequent()
	 * @generated
	 * @ordered
	 */
	protected LogicalFormulation consequent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.IMPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation getAntecedent() {
		if (antecedent != null && antecedent.eIsProxy()) {
			InternalEObject oldAntecedent = (InternalEObject)antecedent;
			antecedent = (LogicalFormulation)eResolveProxy(oldAntecedent);
			if (antecedent != oldAntecedent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.IMPLICATION__ANTECEDENT, oldAntecedent, antecedent));
			}
		}
		return antecedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation basicGetAntecedent() {
		return antecedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedent(LogicalFormulation newAntecedent) {
		LogicalFormulation oldAntecedent = antecedent;
		antecedent = newAntecedent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.IMPLICATION__ANTECEDENT, oldAntecedent, antecedent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation getConsequent() {
		if (consequent != null && consequent.eIsProxy()) {
			InternalEObject oldConsequent = (InternalEObject)consequent;
			consequent = (LogicalFormulation)eResolveProxy(oldConsequent);
			if (consequent != oldConsequent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.IMPLICATION__CONSEQUENT, oldConsequent, consequent));
			}
		}
		return consequent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation basicGetConsequent() {
		return consequent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequent(LogicalFormulation newConsequent) {
		LogicalFormulation oldConsequent = consequent;
		consequent = newConsequent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.IMPLICATION__CONSEQUENT, oldConsequent, consequent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.IMPLICATION__ANTECEDENT:
				if (resolve) return getAntecedent();
				return basicGetAntecedent();
			case SBVRPackage.IMPLICATION__CONSEQUENT:
				if (resolve) return getConsequent();
				return basicGetConsequent();
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
			case SBVRPackage.IMPLICATION__ANTECEDENT:
				setAntecedent((LogicalFormulation)newValue);
				return;
			case SBVRPackage.IMPLICATION__CONSEQUENT:
				setConsequent((LogicalFormulation)newValue);
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
			case SBVRPackage.IMPLICATION__ANTECEDENT:
				setAntecedent((LogicalFormulation)null);
				return;
			case SBVRPackage.IMPLICATION__CONSEQUENT:
				setConsequent((LogicalFormulation)null);
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
			case SBVRPackage.IMPLICATION__ANTECEDENT:
				return antecedent != null;
			case SBVRPackage.IMPLICATION__CONSEQUENT:
				return consequent != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplicationImpl
