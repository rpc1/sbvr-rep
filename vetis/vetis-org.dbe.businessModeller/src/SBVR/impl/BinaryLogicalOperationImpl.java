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

import SBVR.BinaryLogicalOperation;
import SBVR.LogicalFormulation;
import SBVR.SBVRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Logical Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.BinaryLogicalOperationImpl#getLogicalOperand1 <em>Logical Operand1</em>}</li>
 *   <li>{@link SBVR.impl.BinaryLogicalOperationImpl#getLogicalOperand2 <em>Logical Operand2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryLogicalOperationImpl extends LogicalOperationImpl implements BinaryLogicalOperation {
	/**
	 * The cached value of the '{@link #getLogicalOperand1() <em>Logical Operand1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperand1()
	 * @generated
	 * @ordered
	 */
	protected LogicalFormulation logicalOperand1;

	/**
	 * The cached value of the '{@link #getLogicalOperand2() <em>Logical Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperand2()
	 * @generated
	 * @ordered
	 */
	protected LogicalFormulation logicalOperand2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryLogicalOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.BINARY_LOGICAL_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation getLogicalOperand1() {
		if (logicalOperand1 != null && logicalOperand1.eIsProxy()) {
			InternalEObject oldLogicalOperand1 = (InternalEObject)logicalOperand1;
			logicalOperand1 = (LogicalFormulation)eResolveProxy(oldLogicalOperand1);
			if (logicalOperand1 != oldLogicalOperand1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1, oldLogicalOperand1, logicalOperand1));
			}
		}
		return logicalOperand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation basicGetLogicalOperand1() {
		return logicalOperand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalOperand1(LogicalFormulation newLogicalOperand1) {
		LogicalFormulation oldLogicalOperand1 = logicalOperand1;
		logicalOperand1 = newLogicalOperand1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1, oldLogicalOperand1, logicalOperand1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation getLogicalOperand2() {
		if (logicalOperand2 != null && logicalOperand2.eIsProxy()) {
			InternalEObject oldLogicalOperand2 = (InternalEObject)logicalOperand2;
			logicalOperand2 = (LogicalFormulation)eResolveProxy(oldLogicalOperand2);
			if (logicalOperand2 != oldLogicalOperand2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2, oldLogicalOperand2, logicalOperand2));
			}
		}
		return logicalOperand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation basicGetLogicalOperand2() {
		return logicalOperand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalOperand2(LogicalFormulation newLogicalOperand2) {
		LogicalFormulation oldLogicalOperand2 = logicalOperand2;
		logicalOperand2 = newLogicalOperand2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2, oldLogicalOperand2, logicalOperand2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1:
				if (resolve) return getLogicalOperand1();
				return basicGetLogicalOperand1();
			case SBVRPackage.BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2:
				if (resolve) return getLogicalOperand2();
				return basicGetLogicalOperand2();
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
			case SBVRPackage.BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1:
				setLogicalOperand1((LogicalFormulation)newValue);
				return;
			case SBVRPackage.BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2:
				setLogicalOperand2((LogicalFormulation)newValue);
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
			case SBVRPackage.BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1:
				setLogicalOperand1((LogicalFormulation)null);
				return;
			case SBVRPackage.BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2:
				setLogicalOperand2((LogicalFormulation)null);
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
			case SBVRPackage.BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND1:
				return logicalOperand1 != null;
			case SBVRPackage.BINARY_LOGICAL_OPERATION__LOGICAL_OPERAND2:
				return logicalOperand2 != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryLogicalOperationImpl
