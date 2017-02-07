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
import SBVR.SBVRPackage;
import SBVR.WhetherOrNotFormulation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Whether Or Not Formulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.WhetherOrNotFormulationImpl#getConsequent <em>Consequent</em>}</li>
 *   <li>{@link SBVR.impl.WhetherOrNotFormulationImpl#getInconsequent <em>Inconsequent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhetherOrNotFormulationImpl extends BinaryLogicalOperationImpl implements WhetherOrNotFormulation {
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
	 * The cached value of the '{@link #getInconsequent() <em>Inconsequent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInconsequent()
	 * @generated
	 * @ordered
	 */
	protected LogicalFormulation inconsequent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhetherOrNotFormulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.WHETHER_OR_NOT_FORMULATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.WHETHER_OR_NOT_FORMULATION__CONSEQUENT, oldConsequent, consequent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.WHETHER_OR_NOT_FORMULATION__CONSEQUENT, oldConsequent, consequent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation getInconsequent() {
		if (inconsequent != null && inconsequent.eIsProxy()) {
			InternalEObject oldInconsequent = (InternalEObject)inconsequent;
			inconsequent = (LogicalFormulation)eResolveProxy(oldInconsequent);
			if (inconsequent != oldInconsequent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.WHETHER_OR_NOT_FORMULATION__INCONSEQUENT, oldInconsequent, inconsequent));
			}
		}
		return inconsequent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation basicGetInconsequent() {
		return inconsequent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInconsequent(LogicalFormulation newInconsequent) {
		LogicalFormulation oldInconsequent = inconsequent;
		inconsequent = newInconsequent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.WHETHER_OR_NOT_FORMULATION__INCONSEQUENT, oldInconsequent, inconsequent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.WHETHER_OR_NOT_FORMULATION__CONSEQUENT:
				if (resolve) return getConsequent();
				return basicGetConsequent();
			case SBVRPackage.WHETHER_OR_NOT_FORMULATION__INCONSEQUENT:
				if (resolve) return getInconsequent();
				return basicGetInconsequent();
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
			case SBVRPackage.WHETHER_OR_NOT_FORMULATION__CONSEQUENT:
				setConsequent((LogicalFormulation)newValue);
				return;
			case SBVRPackage.WHETHER_OR_NOT_FORMULATION__INCONSEQUENT:
				setInconsequent((LogicalFormulation)newValue);
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
			case SBVRPackage.WHETHER_OR_NOT_FORMULATION__CONSEQUENT:
				setConsequent((LogicalFormulation)null);
				return;
			case SBVRPackage.WHETHER_OR_NOT_FORMULATION__INCONSEQUENT:
				setInconsequent((LogicalFormulation)null);
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
			case SBVRPackage.WHETHER_OR_NOT_FORMULATION__CONSEQUENT:
				return consequent != null;
			case SBVRPackage.WHETHER_OR_NOT_FORMULATION__INCONSEQUENT:
				return inconsequent != null;
		}
		return super.eIsSet(featureID);
	}

} //WhetherOrNotFormulationImpl
