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

import SBVR.AtomicFormulation;
import SBVR.BindableTarget;
import SBVR.FactTypeRole;
import SBVR.RoleBinding;
import SBVR.SBVRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.RoleBindingImpl#getAtomicFormulation <em>Atomic Formulation</em>}</li>
 *   <li>{@link SBVR.impl.RoleBindingImpl#getBindableTarget <em>Bindable Target</em>}</li>
 *   <li>{@link SBVR.impl.RoleBindingImpl#getFactTypeRole <em>Fact Type Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleBindingImpl extends EObjectImpl implements RoleBinding {
	/**
	 * The cached value of the '{@link #getAtomicFormulation() <em>Atomic Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomicFormulation()
	 * @generated
	 * @ordered
	 */
	protected AtomicFormulation atomicFormulation;

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
	 * The cached value of the '{@link #getFactTypeRole() <em>Fact Type Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactTypeRole()
	 * @generated
	 * @ordered
	 */
	protected FactTypeRole factTypeRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.ROLE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicFormulation getAtomicFormulation() {
		if (atomicFormulation != null && atomicFormulation.eIsProxy()) {
			InternalEObject oldAtomicFormulation = (InternalEObject)atomicFormulation;
			atomicFormulation = (AtomicFormulation)eResolveProxy(oldAtomicFormulation);
			if (atomicFormulation != oldAtomicFormulation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.ROLE_BINDING__ATOMIC_FORMULATION, oldAtomicFormulation, atomicFormulation));
			}
		}
		return atomicFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicFormulation basicGetAtomicFormulation() {
		return atomicFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtomicFormulation(AtomicFormulation newAtomicFormulation) {
		AtomicFormulation oldAtomicFormulation = atomicFormulation;
		atomicFormulation = newAtomicFormulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.ROLE_BINDING__ATOMIC_FORMULATION, oldAtomicFormulation, atomicFormulation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.ROLE_BINDING__BINDABLE_TARGET, oldBindableTarget, bindableTarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.ROLE_BINDING__BINDABLE_TARGET, oldBindableTarget, bindableTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeRole getFactTypeRole() {
		if (factTypeRole != null && factTypeRole.eIsProxy()) {
			InternalEObject oldFactTypeRole = (InternalEObject)factTypeRole;
			factTypeRole = (FactTypeRole)eResolveProxy(oldFactTypeRole);
			if (factTypeRole != oldFactTypeRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.ROLE_BINDING__FACT_TYPE_ROLE, oldFactTypeRole, factTypeRole));
			}
		}
		return factTypeRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeRole basicGetFactTypeRole() {
		return factTypeRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactTypeRole(FactTypeRole newFactTypeRole) {
		FactTypeRole oldFactTypeRole = factTypeRole;
		factTypeRole = newFactTypeRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.ROLE_BINDING__FACT_TYPE_ROLE, oldFactTypeRole, factTypeRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.ROLE_BINDING__ATOMIC_FORMULATION:
				if (resolve) return getAtomicFormulation();
				return basicGetAtomicFormulation();
			case SBVRPackage.ROLE_BINDING__BINDABLE_TARGET:
				if (resolve) return getBindableTarget();
				return basicGetBindableTarget();
			case SBVRPackage.ROLE_BINDING__FACT_TYPE_ROLE:
				if (resolve) return getFactTypeRole();
				return basicGetFactTypeRole();
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
			case SBVRPackage.ROLE_BINDING__ATOMIC_FORMULATION:
				setAtomicFormulation((AtomicFormulation)newValue);
				return;
			case SBVRPackage.ROLE_BINDING__BINDABLE_TARGET:
				setBindableTarget((BindableTarget)newValue);
				return;
			case SBVRPackage.ROLE_BINDING__FACT_TYPE_ROLE:
				setFactTypeRole((FactTypeRole)newValue);
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
			case SBVRPackage.ROLE_BINDING__ATOMIC_FORMULATION:
				setAtomicFormulation((AtomicFormulation)null);
				return;
			case SBVRPackage.ROLE_BINDING__BINDABLE_TARGET:
				setBindableTarget((BindableTarget)null);
				return;
			case SBVRPackage.ROLE_BINDING__FACT_TYPE_ROLE:
				setFactTypeRole((FactTypeRole)null);
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
			case SBVRPackage.ROLE_BINDING__ATOMIC_FORMULATION:
				return atomicFormulation != null;
			case SBVRPackage.ROLE_BINDING__BINDABLE_TARGET:
				return bindableTarget != null;
			case SBVRPackage.ROLE_BINDING__FACT_TYPE_ROLE:
				return factTypeRole != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleBindingImpl
