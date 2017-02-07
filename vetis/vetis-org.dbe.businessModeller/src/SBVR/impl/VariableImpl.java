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

import SBVR.Concept;
import SBVR.FactTypeRole;
import SBVR.LogicalFormulation;
import SBVR.PositiveInteger;
import SBVR.Quantification;
import SBVR.SBVRPackage;
import SBVR.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.VariableImpl#getRestrictingFormulation <em>Restricting Formulation</em>}</li>
 *   <li>{@link SBVR.impl.VariableImpl#isIsUnitary <em>Is Unitary</em>}</li>
 *   <li>{@link SBVR.impl.VariableImpl#getQuantification <em>Quantification</em>}</li>
 *   <li>{@link SBVR.impl.VariableImpl#getRangedOverConcept <em>Ranged Over Concept</em>}</li>
 *   <li>{@link SBVR.impl.VariableImpl#getFactTypeRole <em>Fact Type Role</em>}</li>
 *   <li>{@link SBVR.impl.VariableImpl#getProjectionPosition <em>Projection Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends BindableTargetImpl implements Variable {
	/**
	 * The cached value of the '{@link #getRestrictingFormulation() <em>Restricting Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictingFormulation()
	 * @generated
	 * @ordered
	 */
	protected LogicalFormulation restrictingFormulation;

	/**
	 * The default value of the '{@link #isIsUnitary() <em>Is Unitary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnitary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNITARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnitary() <em>Is Unitary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnitary()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnitary = IS_UNITARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuantification() <em>Quantification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantification()
	 * @generated
	 * @ordered
	 */
	protected Quantification quantification;

	/**
	 * The cached value of the '{@link #getRangedOverConcept() <em>Ranged Over Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangedOverConcept()
	 * @generated
	 * @ordered
	 */
	protected Concept rangedOverConcept;

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
	 * The cached value of the '{@link #getProjectionPosition() <em>Projection Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionPosition()
	 * @generated
	 * @ordered
	 */
	protected PositiveInteger projectionPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation getRestrictingFormulation() {
		if (restrictingFormulation != null && restrictingFormulation.eIsProxy()) {
			InternalEObject oldRestrictingFormulation = (InternalEObject)restrictingFormulation;
			restrictingFormulation = (LogicalFormulation)eResolveProxy(oldRestrictingFormulation);
			if (restrictingFormulation != oldRestrictingFormulation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.VARIABLE__RESTRICTING_FORMULATION, oldRestrictingFormulation, restrictingFormulation));
			}
		}
		return restrictingFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation basicGetRestrictingFormulation() {
		return restrictingFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictingFormulation(LogicalFormulation newRestrictingFormulation) {
		LogicalFormulation oldRestrictingFormulation = restrictingFormulation;
		restrictingFormulation = newRestrictingFormulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.VARIABLE__RESTRICTING_FORMULATION, oldRestrictingFormulation, restrictingFormulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnitary() {
		return isUnitary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnitary(boolean newIsUnitary) {
		boolean oldIsUnitary = isUnitary;
		isUnitary = newIsUnitary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.VARIABLE__IS_UNITARY, oldIsUnitary, isUnitary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantification getQuantification() {
		if (quantification != null && quantification.eIsProxy()) {
			InternalEObject oldQuantification = (InternalEObject)quantification;
			quantification = (Quantification)eResolveProxy(oldQuantification);
			if (quantification != oldQuantification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.VARIABLE__QUANTIFICATION, oldQuantification, quantification));
			}
		}
		return quantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantification basicGetQuantification() {
		return quantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantification(Quantification newQuantification) {
		Quantification oldQuantification = quantification;
		quantification = newQuantification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.VARIABLE__QUANTIFICATION, oldQuantification, quantification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getRangedOverConcept() {
		if (rangedOverConcept != null && rangedOverConcept.eIsProxy()) {
			InternalEObject oldRangedOverConcept = (InternalEObject)rangedOverConcept;
			rangedOverConcept = (Concept)eResolveProxy(oldRangedOverConcept);
			if (rangedOverConcept != oldRangedOverConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.VARIABLE__RANGED_OVER_CONCEPT, oldRangedOverConcept, rangedOverConcept));
			}
		}
		return rangedOverConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetRangedOverConcept() {
		return rangedOverConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangedOverConcept(Concept newRangedOverConcept) {
		Concept oldRangedOverConcept = rangedOverConcept;
		rangedOverConcept = newRangedOverConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.VARIABLE__RANGED_OVER_CONCEPT, oldRangedOverConcept, rangedOverConcept));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.VARIABLE__FACT_TYPE_ROLE, oldFactTypeRole, factTypeRole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.VARIABLE__FACT_TYPE_ROLE, oldFactTypeRole, factTypeRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInteger getProjectionPosition() {
		if (projectionPosition != null && projectionPosition.eIsProxy()) {
			InternalEObject oldProjectionPosition = (InternalEObject)projectionPosition;
			projectionPosition = (PositiveInteger)eResolveProxy(oldProjectionPosition);
			if (projectionPosition != oldProjectionPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.VARIABLE__PROJECTION_POSITION, oldProjectionPosition, projectionPosition));
			}
		}
		return projectionPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInteger basicGetProjectionPosition() {
		return projectionPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectionPosition(PositiveInteger newProjectionPosition) {
		PositiveInteger oldProjectionPosition = projectionPosition;
		projectionPosition = newProjectionPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.VARIABLE__PROJECTION_POSITION, oldProjectionPosition, projectionPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.VARIABLE__RESTRICTING_FORMULATION:
				if (resolve) return getRestrictingFormulation();
				return basicGetRestrictingFormulation();
			case SBVRPackage.VARIABLE__IS_UNITARY:
				return isIsUnitary() ? Boolean.TRUE : Boolean.FALSE;
			case SBVRPackage.VARIABLE__QUANTIFICATION:
				if (resolve) return getQuantification();
				return basicGetQuantification();
			case SBVRPackage.VARIABLE__RANGED_OVER_CONCEPT:
				if (resolve) return getRangedOverConcept();
				return basicGetRangedOverConcept();
			case SBVRPackage.VARIABLE__FACT_TYPE_ROLE:
				if (resolve) return getFactTypeRole();
				return basicGetFactTypeRole();
			case SBVRPackage.VARIABLE__PROJECTION_POSITION:
				if (resolve) return getProjectionPosition();
				return basicGetProjectionPosition();
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
			case SBVRPackage.VARIABLE__RESTRICTING_FORMULATION:
				setRestrictingFormulation((LogicalFormulation)newValue);
				return;
			case SBVRPackage.VARIABLE__IS_UNITARY:
				setIsUnitary(((Boolean)newValue).booleanValue());
				return;
			case SBVRPackage.VARIABLE__QUANTIFICATION:
				setQuantification((Quantification)newValue);
				return;
			case SBVRPackage.VARIABLE__RANGED_OVER_CONCEPT:
				setRangedOverConcept((Concept)newValue);
				return;
			case SBVRPackage.VARIABLE__FACT_TYPE_ROLE:
				setFactTypeRole((FactTypeRole)newValue);
				return;
			case SBVRPackage.VARIABLE__PROJECTION_POSITION:
				setProjectionPosition((PositiveInteger)newValue);
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
			case SBVRPackage.VARIABLE__RESTRICTING_FORMULATION:
				setRestrictingFormulation((LogicalFormulation)null);
				return;
			case SBVRPackage.VARIABLE__IS_UNITARY:
				setIsUnitary(IS_UNITARY_EDEFAULT);
				return;
			case SBVRPackage.VARIABLE__QUANTIFICATION:
				setQuantification((Quantification)null);
				return;
			case SBVRPackage.VARIABLE__RANGED_OVER_CONCEPT:
				setRangedOverConcept((Concept)null);
				return;
			case SBVRPackage.VARIABLE__FACT_TYPE_ROLE:
				setFactTypeRole((FactTypeRole)null);
				return;
			case SBVRPackage.VARIABLE__PROJECTION_POSITION:
				setProjectionPosition((PositiveInteger)null);
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
			case SBVRPackage.VARIABLE__RESTRICTING_FORMULATION:
				return restrictingFormulation != null;
			case SBVRPackage.VARIABLE__IS_UNITARY:
				return isUnitary != IS_UNITARY_EDEFAULT;
			case SBVRPackage.VARIABLE__QUANTIFICATION:
				return quantification != null;
			case SBVRPackage.VARIABLE__RANGED_OVER_CONCEPT:
				return rangedOverConcept != null;
			case SBVRPackage.VARIABLE__FACT_TYPE_ROLE:
				return factTypeRole != null;
			case SBVRPackage.VARIABLE__PROJECTION_POSITION:
				return projectionPosition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isUnitary: ");
		result.append(isUnitary);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
