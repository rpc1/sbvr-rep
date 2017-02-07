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

import SBVR.BindableTarget;
import SBVR.LogicalFormulation;
import SBVR.PropositionNominalization;
import SBVR.SBVRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proposition Nominalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.PropositionNominalizationImpl#getLogicalFormulation <em>Logical Formulation</em>}</li>
 *   <li>{@link SBVR.impl.PropositionNominalizationImpl#getBindableTarget <em>Bindable Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropositionNominalizationImpl extends LogicalFormulationImpl implements PropositionNominalization {
	/**
	 * The cached value of the '{@link #getLogicalFormulation() <em>Logical Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalFormulation()
	 * @generated
	 * @ordered
	 */
	protected LogicalFormulation logicalFormulation;

	/**
	 * The cached value of the '{@link #getBindableTarget() <em>Bindable Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindableTarget()
	 * @generated
	 * @ordered
	 */
	protected BindableTarget bindableTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropositionNominalizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.PROPOSITION_NOMINALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation getLogicalFormulation() {
		if (logicalFormulation != null && logicalFormulation.eIsProxy()) {
			InternalEObject oldLogicalFormulation = (InternalEObject)logicalFormulation;
			logicalFormulation = (LogicalFormulation)eResolveProxy(oldLogicalFormulation);
			if (logicalFormulation != oldLogicalFormulation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.PROPOSITION_NOMINALIZATION__LOGICAL_FORMULATION, oldLogicalFormulation, logicalFormulation));
			}
		}
		return logicalFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation basicGetLogicalFormulation() {
		return logicalFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalFormulation(LogicalFormulation newLogicalFormulation) {
		LogicalFormulation oldLogicalFormulation = logicalFormulation;
		logicalFormulation = newLogicalFormulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PROPOSITION_NOMINALIZATION__LOGICAL_FORMULATION, oldLogicalFormulation, logicalFormulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindableTarget getBindableTarget() {
		if (bindableTarget != null && bindableTarget.eIsProxy()) {
			InternalEObject oldBindableTarget = (InternalEObject)bindableTarget;
			bindableTarget = (BindableTarget)eResolveProxy(oldBindableTarget);
			if (bindableTarget != oldBindableTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.PROPOSITION_NOMINALIZATION__BINDABLE_TARGET, oldBindableTarget, bindableTarget));
			}
		}
		return bindableTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindableTarget basicGetBindableTarget() {
		return bindableTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindableTarget(BindableTarget newBindableTarget) {
		BindableTarget oldBindableTarget = bindableTarget;
		bindableTarget = newBindableTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PROPOSITION_NOMINALIZATION__BINDABLE_TARGET, oldBindableTarget, bindableTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.PROPOSITION_NOMINALIZATION__LOGICAL_FORMULATION:
				if (resolve) return getLogicalFormulation();
				return basicGetLogicalFormulation();
			case SBVRPackage.PROPOSITION_NOMINALIZATION__BINDABLE_TARGET:
				if (resolve) return getBindableTarget();
				return basicGetBindableTarget();
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
			case SBVRPackage.PROPOSITION_NOMINALIZATION__LOGICAL_FORMULATION:
				setLogicalFormulation((LogicalFormulation)newValue);
				return;
			case SBVRPackage.PROPOSITION_NOMINALIZATION__BINDABLE_TARGET:
				setBindableTarget((BindableTarget)newValue);
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
			case SBVRPackage.PROPOSITION_NOMINALIZATION__LOGICAL_FORMULATION:
				setLogicalFormulation((LogicalFormulation)null);
				return;
			case SBVRPackage.PROPOSITION_NOMINALIZATION__BINDABLE_TARGET:
				setBindableTarget((BindableTarget)null);
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
			case SBVRPackage.PROPOSITION_NOMINALIZATION__LOGICAL_FORMULATION:
				return logicalFormulation != null;
			case SBVRPackage.PROPOSITION_NOMINALIZATION__BINDABLE_TARGET:
				return bindableTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //PropositionNominalizationImpl
