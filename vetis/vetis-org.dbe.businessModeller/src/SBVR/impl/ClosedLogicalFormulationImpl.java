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

import SBVR.ClosedLogicalFormulation;
import SBVR.LogicalFormulation;
import SBVR.Proposition;
import SBVR.SBVRPackage;
import SBVR.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Closed Logical Formulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.ClosedLogicalFormulationImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link SBVR.impl.ClosedLogicalFormulationImpl#getProposition <em>Proposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClosedLogicalFormulationImpl extends ClosedSemanticFormulationImpl implements ClosedLogicalFormulation {
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statement;

	/**
	 * The cached value of the '{@link #getProposition() <em>Proposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposition()
	 * @generated
	 * @ordered
	 */
	protected Proposition proposition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClosedLogicalFormulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.CLOSED_LOGICAL_FORMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatement() {
		if (statement == null) {
			statement = new EObjectResolvingEList<Statement>(Statement.class, this, SBVRPackage.CLOSED_LOGICAL_FORMULATION__STATEMENT);
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition getProposition() {
		if (proposition != null && proposition.eIsProxy()) {
			InternalEObject oldProposition = (InternalEObject)proposition;
			proposition = (Proposition)eResolveProxy(oldProposition);
			if (proposition != oldProposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.CLOSED_LOGICAL_FORMULATION__PROPOSITION, oldProposition, proposition));
			}
		}
		return proposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition basicGetProposition() {
		return proposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposition(Proposition newProposition) {
		Proposition oldProposition = proposition;
		proposition = newProposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.CLOSED_LOGICAL_FORMULATION__PROPOSITION, oldProposition, proposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.CLOSED_LOGICAL_FORMULATION__STATEMENT:
				return getStatement();
			case SBVRPackage.CLOSED_LOGICAL_FORMULATION__PROPOSITION:
				if (resolve) return getProposition();
				return basicGetProposition();
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
			case SBVRPackage.CLOSED_LOGICAL_FORMULATION__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends Statement>)newValue);
				return;
			case SBVRPackage.CLOSED_LOGICAL_FORMULATION__PROPOSITION:
				setProposition((Proposition)newValue);
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
			case SBVRPackage.CLOSED_LOGICAL_FORMULATION__STATEMENT:
				getStatement().clear();
				return;
			case SBVRPackage.CLOSED_LOGICAL_FORMULATION__PROPOSITION:
				setProposition((Proposition)null);
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
			case SBVRPackage.CLOSED_LOGICAL_FORMULATION__STATEMENT:
				return statement != null && !statement.isEmpty();
			case SBVRPackage.CLOSED_LOGICAL_FORMULATION__PROPOSITION:
				return proposition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == LogicalFormulation.class) {
			switch (derivedFeatureID) {
				case SBVRPackage.CLOSED_LOGICAL_FORMULATION__STATEMENT: return SBVRPackage.LOGICAL_FORMULATION__STATEMENT;
				case SBVRPackage.CLOSED_LOGICAL_FORMULATION__PROPOSITION: return SBVRPackage.LOGICAL_FORMULATION__PROPOSITION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == LogicalFormulation.class) {
			switch (baseFeatureID) {
				case SBVRPackage.LOGICAL_FORMULATION__STATEMENT: return SBVRPackage.CLOSED_LOGICAL_FORMULATION__STATEMENT;
				case SBVRPackage.LOGICAL_FORMULATION__PROPOSITION: return SBVRPackage.CLOSED_LOGICAL_FORMULATION__PROPOSITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ClosedLogicalFormulationImpl
