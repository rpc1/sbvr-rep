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
import SBVR.ProjectingFormulation;
import SBVR.Projection;
import SBVR.SBVRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projecting Formulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.ProjectingFormulationImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link SBVR.impl.ProjectingFormulationImpl#getBindableTarget <em>Bindable Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectingFormulationImpl extends LogicalFormulationImpl implements ProjectingFormulation {
	/**
	 * The cached value of the '{@link #getProjection() <em>Projection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected Projection projection;

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
	protected ProjectingFormulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.PROJECTING_FORMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projection getProjection() {
		if (projection != null && projection.eIsProxy()) {
			InternalEObject oldProjection = (InternalEObject)projection;
			projection = (Projection)eResolveProxy(oldProjection);
			if (projection != oldProjection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.PROJECTING_FORMULATION__PROJECTION, oldProjection, projection));
			}
		}
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projection basicGetProjection() {
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjection(Projection newProjection) {
		Projection oldProjection = projection;
		projection = newProjection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PROJECTING_FORMULATION__PROJECTION, oldProjection, projection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.PROJECTING_FORMULATION__BINDABLE_TARGET, oldBindableTarget, bindableTarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PROJECTING_FORMULATION__BINDABLE_TARGET, oldBindableTarget, bindableTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.PROJECTING_FORMULATION__PROJECTION:
				if (resolve) return getProjection();
				return basicGetProjection();
			case SBVRPackage.PROJECTING_FORMULATION__BINDABLE_TARGET:
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
			case SBVRPackage.PROJECTING_FORMULATION__PROJECTION:
				setProjection((Projection)newValue);
				return;
			case SBVRPackage.PROJECTING_FORMULATION__BINDABLE_TARGET:
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
			case SBVRPackage.PROJECTING_FORMULATION__PROJECTION:
				setProjection((Projection)null);
				return;
			case SBVRPackage.PROJECTING_FORMULATION__BINDABLE_TARGET:
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
			case SBVRPackage.PROJECTING_FORMULATION__PROJECTION:
				return projection != null;
			case SBVRPackage.PROJECTING_FORMULATION__BINDABLE_TARGET:
				return bindableTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //ProjectingFormulationImpl
