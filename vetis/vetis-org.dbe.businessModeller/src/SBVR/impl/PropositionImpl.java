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

import SBVR.Proposition;
import SBVR.SBVRPackage;
import SBVR.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.PropositionImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link SBVR.impl.PropositionImpl#getIsTrue <em>Is True</em>}</li>
 *   <li>{@link SBVR.impl.PropositionImpl#getIsFalse <em>Is False</em>}</li>
 *   <li>{@link SBVR.impl.PropositionImpl#getIsNecessarilyTrue <em>Is Necessarily True</em>}</li>
 *   <li>{@link SBVR.impl.PropositionImpl#getIsPossibilyTrue <em>Is Possibily True</em>}</li>
 *   <li>{@link SBVR.impl.PropositionImpl#getIsObligatedToBeTrue <em>Is Obligated To Be True</em>}</li>
 *   <li>{@link SBVR.impl.PropositionImpl#getIsPermittedToBeTrue <em>Is Permitted To Be True</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropositionImpl extends MeaningImpl implements Proposition {
	/**
	 * The default value of the '{@link #getIsTrue() <em>Is True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTrue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_TRUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsTrue() <em>Is True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTrue()
	 * @generated
	 * @ordered
	 */
	protected Boolean isTrue = IS_TRUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsFalse() <em>Is False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFalse()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FALSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsFalse() <em>Is False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFalse()
	 * @generated
	 * @ordered
	 */
	protected Boolean isFalse = IS_FALSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsNecessarilyTrue() <em>Is Necessarily True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNecessarilyTrue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NECESSARILY_TRUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNecessarilyTrue() <em>Is Necessarily True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNecessarilyTrue()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNecessarilyTrue = IS_NECESSARILY_TRUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsPossibilyTrue() <em>Is Possibily True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPossibilyTrue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_POSSIBILY_TRUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPossibilyTrue() <em>Is Possibily True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPossibilyTrue()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPossibilyTrue = IS_POSSIBILY_TRUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsObligatedToBeTrue() <em>Is Obligated To Be True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsObligatedToBeTrue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_OBLIGATED_TO_BE_TRUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsObligatedToBeTrue() <em>Is Obligated To Be True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsObligatedToBeTrue()
	 * @generated
	 * @ordered
	 */
	protected Boolean isObligatedToBeTrue = IS_OBLIGATED_TO_BE_TRUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsPermittedToBeTrue() <em>Is Permitted To Be True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPermittedToBeTrue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PERMITTED_TO_BE_TRUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPermittedToBeTrue() <em>Is Permitted To Be True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPermittedToBeTrue()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPermittedToBeTrue = IS_PERMITTED_TO_BE_TRUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.PROPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatement() {
		// TODO: implement this method to return the 'Statement' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsTrue() {
		return isTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTrue(Boolean newIsTrue) {
		Boolean oldIsTrue = isTrue;
		isTrue = newIsTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PROPOSITION__IS_TRUE, oldIsTrue, isTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFalse() {
		return isFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFalse(Boolean newIsFalse) {
		Boolean oldIsFalse = isFalse;
		isFalse = newIsFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PROPOSITION__IS_FALSE, oldIsFalse, isFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNecessarilyTrue() {
		return isNecessarilyTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNecessarilyTrue(Boolean newIsNecessarilyTrue) {
		Boolean oldIsNecessarilyTrue = isNecessarilyTrue;
		isNecessarilyTrue = newIsNecessarilyTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PROPOSITION__IS_NECESSARILY_TRUE, oldIsNecessarilyTrue, isNecessarilyTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPossibilyTrue() {
		return isPossibilyTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPossibilyTrue(Boolean newIsPossibilyTrue) {
		Boolean oldIsPossibilyTrue = isPossibilyTrue;
		isPossibilyTrue = newIsPossibilyTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PROPOSITION__IS_POSSIBILY_TRUE, oldIsPossibilyTrue, isPossibilyTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsObligatedToBeTrue() {
		return isObligatedToBeTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsObligatedToBeTrue(Boolean newIsObligatedToBeTrue) {
		Boolean oldIsObligatedToBeTrue = isObligatedToBeTrue;
		isObligatedToBeTrue = newIsObligatedToBeTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PROPOSITION__IS_OBLIGATED_TO_BE_TRUE, oldIsObligatedToBeTrue, isObligatedToBeTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPermittedToBeTrue() {
		return isPermittedToBeTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPermittedToBeTrue(Boolean newIsPermittedToBeTrue) {
		Boolean oldIsPermittedToBeTrue = isPermittedToBeTrue;
		isPermittedToBeTrue = newIsPermittedToBeTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.PROPOSITION__IS_PERMITTED_TO_BE_TRUE, oldIsPermittedToBeTrue, isPermittedToBeTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.PROPOSITION__STATEMENT:
				return getStatement();
			case SBVRPackage.PROPOSITION__IS_TRUE:
				return getIsTrue();
			case SBVRPackage.PROPOSITION__IS_FALSE:
				return getIsFalse();
			case SBVRPackage.PROPOSITION__IS_NECESSARILY_TRUE:
				return getIsNecessarilyTrue();
			case SBVRPackage.PROPOSITION__IS_POSSIBILY_TRUE:
				return getIsPossibilyTrue();
			case SBVRPackage.PROPOSITION__IS_OBLIGATED_TO_BE_TRUE:
				return getIsObligatedToBeTrue();
			case SBVRPackage.PROPOSITION__IS_PERMITTED_TO_BE_TRUE:
				return getIsPermittedToBeTrue();
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
			case SBVRPackage.PROPOSITION__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends Statement>)newValue);
				return;
			case SBVRPackage.PROPOSITION__IS_TRUE:
				setIsTrue((Boolean)newValue);
				return;
			case SBVRPackage.PROPOSITION__IS_FALSE:
				setIsFalse((Boolean)newValue);
				return;
			case SBVRPackage.PROPOSITION__IS_NECESSARILY_TRUE:
				setIsNecessarilyTrue((Boolean)newValue);
				return;
			case SBVRPackage.PROPOSITION__IS_POSSIBILY_TRUE:
				setIsPossibilyTrue((Boolean)newValue);
				return;
			case SBVRPackage.PROPOSITION__IS_OBLIGATED_TO_BE_TRUE:
				setIsObligatedToBeTrue((Boolean)newValue);
				return;
			case SBVRPackage.PROPOSITION__IS_PERMITTED_TO_BE_TRUE:
				setIsPermittedToBeTrue((Boolean)newValue);
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
			case SBVRPackage.PROPOSITION__STATEMENT:
				getStatement().clear();
				return;
			case SBVRPackage.PROPOSITION__IS_TRUE:
				setIsTrue(IS_TRUE_EDEFAULT);
				return;
			case SBVRPackage.PROPOSITION__IS_FALSE:
				setIsFalse(IS_FALSE_EDEFAULT);
				return;
			case SBVRPackage.PROPOSITION__IS_NECESSARILY_TRUE:
				setIsNecessarilyTrue(IS_NECESSARILY_TRUE_EDEFAULT);
				return;
			case SBVRPackage.PROPOSITION__IS_POSSIBILY_TRUE:
				setIsPossibilyTrue(IS_POSSIBILY_TRUE_EDEFAULT);
				return;
			case SBVRPackage.PROPOSITION__IS_OBLIGATED_TO_BE_TRUE:
				setIsObligatedToBeTrue(IS_OBLIGATED_TO_BE_TRUE_EDEFAULT);
				return;
			case SBVRPackage.PROPOSITION__IS_PERMITTED_TO_BE_TRUE:
				setIsPermittedToBeTrue(IS_PERMITTED_TO_BE_TRUE_EDEFAULT);
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
			case SBVRPackage.PROPOSITION__STATEMENT:
				return !getStatement().isEmpty();
			case SBVRPackage.PROPOSITION__IS_TRUE:
				return IS_TRUE_EDEFAULT == null ? isTrue != null : !IS_TRUE_EDEFAULT.equals(isTrue);
			case SBVRPackage.PROPOSITION__IS_FALSE:
				return IS_FALSE_EDEFAULT == null ? isFalse != null : !IS_FALSE_EDEFAULT.equals(isFalse);
			case SBVRPackage.PROPOSITION__IS_NECESSARILY_TRUE:
				return IS_NECESSARILY_TRUE_EDEFAULT == null ? isNecessarilyTrue != null : !IS_NECESSARILY_TRUE_EDEFAULT.equals(isNecessarilyTrue);
			case SBVRPackage.PROPOSITION__IS_POSSIBILY_TRUE:
				return IS_POSSIBILY_TRUE_EDEFAULT == null ? isPossibilyTrue != null : !IS_POSSIBILY_TRUE_EDEFAULT.equals(isPossibilyTrue);
			case SBVRPackage.PROPOSITION__IS_OBLIGATED_TO_BE_TRUE:
				return IS_OBLIGATED_TO_BE_TRUE_EDEFAULT == null ? isObligatedToBeTrue != null : !IS_OBLIGATED_TO_BE_TRUE_EDEFAULT.equals(isObligatedToBeTrue);
			case SBVRPackage.PROPOSITION__IS_PERMITTED_TO_BE_TRUE:
				return IS_PERMITTED_TO_BE_TRUE_EDEFAULT == null ? isPermittedToBeTrue != null : !IS_PERMITTED_TO_BE_TRUE_EDEFAULT.equals(isPermittedToBeTrue);
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
		result.append(" (isTrue: ");
		result.append(isTrue);
		result.append(", isFalse: ");
		result.append(isFalse);
		result.append(", isNecessarilyTrue: ");
		result.append(isNecessarilyTrue);
		result.append(", isPossibilyTrue: ");
		result.append(isPossibilyTrue);
		result.append(", isObligatedToBeTrue: ");
		result.append(isObligatedToBeTrue);
		result.append(", isPermittedToBeTrue: ");
		result.append(isPermittedToBeTrue);
		result.append(')');
		return result.toString();
	}

} //PropositionImpl
