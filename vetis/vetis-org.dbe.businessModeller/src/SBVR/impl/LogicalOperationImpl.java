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
import SBVR.LogicalOperation;
import SBVR.SBVRPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.LogicalOperationImpl#getLogicalOperand <em>Logical Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalOperationImpl extends LogicalFormulationImpl implements LogicalOperation {
	/**
	 * The cached value of the '{@link #getLogicalOperand() <em>Logical Operand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalFormulation> logicalOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.LOGICAL_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalFormulation> getLogicalOperand() {
		if (logicalOperand == null) {
			logicalOperand = new EObjectResolvingEList<LogicalFormulation>(LogicalFormulation.class, this, SBVRPackage.LOGICAL_OPERATION__LOGICAL_OPERAND);
		}
		return logicalOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.LOGICAL_OPERATION__LOGICAL_OPERAND:
				return getLogicalOperand();
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
			case SBVRPackage.LOGICAL_OPERATION__LOGICAL_OPERAND:
				getLogicalOperand().clear();
				getLogicalOperand().addAll((Collection<? extends LogicalFormulation>)newValue);
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
			case SBVRPackage.LOGICAL_OPERATION__LOGICAL_OPERAND:
				getLogicalOperand().clear();
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
			case SBVRPackage.LOGICAL_OPERATION__LOGICAL_OPERAND:
				return logicalOperand != null && !logicalOperand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalOperationImpl
