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
import SBVR.Concept;
import SBVR.InstantiationFormulation;
import SBVR.SBVRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiation Formulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.InstantiationFormulationImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link SBVR.impl.InstantiationFormulationImpl#getBindableTarget <em>Bindable Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstantiationFormulationImpl extends LogicalFormulationImpl implements InstantiationFormulation {
	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected Concept concept;

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
	protected InstantiationFormulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.INSTANTIATION_FORMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getConcept() {
		if (concept != null && concept.eIsProxy()) {
			InternalEObject oldConcept = (InternalEObject)concept;
			concept = (Concept)eResolveProxy(oldConcept);
			if (concept != oldConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.INSTANTIATION_FORMULATION__CONCEPT, oldConcept, concept));
			}
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetConcept() {
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcept(Concept newConcept) {
		Concept oldConcept = concept;
		concept = newConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.INSTANTIATION_FORMULATION__CONCEPT, oldConcept, concept));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.INSTANTIATION_FORMULATION__BINDABLE_TARGET, oldBindableTarget, bindableTarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.INSTANTIATION_FORMULATION__BINDABLE_TARGET, oldBindableTarget, bindableTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.INSTANTIATION_FORMULATION__CONCEPT:
				if (resolve) return getConcept();
				return basicGetConcept();
			case SBVRPackage.INSTANTIATION_FORMULATION__BINDABLE_TARGET:
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
			case SBVRPackage.INSTANTIATION_FORMULATION__CONCEPT:
				setConcept((Concept)newValue);
				return;
			case SBVRPackage.INSTANTIATION_FORMULATION__BINDABLE_TARGET:
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
			case SBVRPackage.INSTANTIATION_FORMULATION__CONCEPT:
				setConcept((Concept)null);
				return;
			case SBVRPackage.INSTANTIATION_FORMULATION__BINDABLE_TARGET:
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
			case SBVRPackage.INSTANTIATION_FORMULATION__CONCEPT:
				return concept != null;
			case SBVRPackage.INSTANTIATION_FORMULATION__BINDABLE_TARGET:
				return bindableTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //InstantiationFormulationImpl
