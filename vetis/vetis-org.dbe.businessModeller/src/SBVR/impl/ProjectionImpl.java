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

import SBVR.AuxiliaryVariable;
import SBVR.LogicalFormulation;
import SBVR.Projection;
import SBVR.SBVRPackage;
import SBVR.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.ProjectionImpl#getConstrainingFormulation <em>Constraining Formulation</em>}</li>
 *   <li>{@link SBVR.impl.ProjectionImpl#getProjectionVariable <em>Projection Variable</em>}</li>
 *   <li>{@link SBVR.impl.ProjectionImpl#getAuxiliaryVariable <em>Auxiliary Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectionImpl extends SemanticFormulationImpl implements Projection {
	/**
	 * The cached value of the '{@link #getConstrainingFormulation() <em>Constraining Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingFormulation()
	 * @generated
	 * @ordered
	 */
	protected LogicalFormulation constrainingFormulation;

	/**
	 * The cached value of the '{@link #getProjectionVariable() <em>Projection Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> projectionVariable;

	/**
	 * The cached value of the '{@link #getAuxiliaryVariable() <em>Auxiliary Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryVariable> auxiliaryVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.PROJECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation getConstrainingFormulation() {
		if (constrainingFormulation != null && constrainingFormulation.eIsProxy()) {
			InternalEObject oldConstrainingFormulation = (InternalEObject)constrainingFormulation;
			constrainingFormulation = (LogicalFormulation)eResolveProxy(oldConstrainingFormulation);
			if (constrainingFormulation != oldConstrainingFormulation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.PROJECTION__CONSTRAINING_FORMULATION, oldConstrainingFormulation, constrainingFormulation));
			}
		}
		return constrainingFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation basicGetConstrainingFormulation() {
		return constrainingFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainingFormulation(LogicalFormulation newConstrainingFormulation) {
		LogicalFormulation oldConstrainingFormulation = constrainingFormulation;
		constrainingFormulation = newConstrainingFormulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PROJECTION__CONSTRAINING_FORMULATION, oldConstrainingFormulation, constrainingFormulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getProjectionVariable() {
		if (projectionVariable == null) {
			projectionVariable = new EObjectResolvingEList<Variable>(Variable.class, this, SBVRPackage.PROJECTION__PROJECTION_VARIABLE);
		}
		return projectionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuxiliaryVariable> getAuxiliaryVariable() {
		if (auxiliaryVariable == null) {
			auxiliaryVariable = new EObjectResolvingEList<AuxiliaryVariable>(AuxiliaryVariable.class, this, SBVRPackage.PROJECTION__AUXILIARY_VARIABLE);
		}
		return auxiliaryVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.PROJECTION__CONSTRAINING_FORMULATION:
				if (resolve) return getConstrainingFormulation();
				return basicGetConstrainingFormulation();
			case SBVRPackage.PROJECTION__PROJECTION_VARIABLE:
				return getProjectionVariable();
			case SBVRPackage.PROJECTION__AUXILIARY_VARIABLE:
				return getAuxiliaryVariable();
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
			case SBVRPackage.PROJECTION__CONSTRAINING_FORMULATION:
				setConstrainingFormulation((LogicalFormulation)newValue);
				return;
			case SBVRPackage.PROJECTION__PROJECTION_VARIABLE:
				getProjectionVariable().clear();
				getProjectionVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case SBVRPackage.PROJECTION__AUXILIARY_VARIABLE:
				getAuxiliaryVariable().clear();
				getAuxiliaryVariable().addAll((Collection<? extends AuxiliaryVariable>)newValue);
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
			case SBVRPackage.PROJECTION__CONSTRAINING_FORMULATION:
				setConstrainingFormulation((LogicalFormulation)null);
				return;
			case SBVRPackage.PROJECTION__PROJECTION_VARIABLE:
				getProjectionVariable().clear();
				return;
			case SBVRPackage.PROJECTION__AUXILIARY_VARIABLE:
				getAuxiliaryVariable().clear();
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
			case SBVRPackage.PROJECTION__CONSTRAINING_FORMULATION:
				return constrainingFormulation != null;
			case SBVRPackage.PROJECTION__PROJECTION_VARIABLE:
				return projectionVariable != null && !projectionVariable.isEmpty();
			case SBVRPackage.PROJECTION__AUXILIARY_VARIABLE:
				return auxiliaryVariable != null && !auxiliaryVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectionImpl
