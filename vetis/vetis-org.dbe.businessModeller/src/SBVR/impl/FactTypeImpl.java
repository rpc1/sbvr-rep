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

import SBVR.FactType;
import SBVR.FactTypeForm;
import SBVR.FactTypeRole;
import SBVR.Placeholder;
import SBVR.SBVRPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.FactTypeImpl#getFactTypeForm <em>Fact Type Form</em>}</li>
 *   <li>{@link SBVR.impl.FactTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link SBVR.impl.FactTypeImpl#getHas <em>Has</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactTypeImpl extends ConceptImpl implements FactType {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<FactTypeRole> role;

	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<Placeholder> has;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.FACT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactTypeForm> getFactTypeForm() {
		// TODO: implement this method to return the 'Fact Type Form' reference list
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
	public EList<FactTypeRole> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<FactTypeRole>(FactTypeRole.class, this, SBVRPackage.FACT_TYPE__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Placeholder> getHas() {
		if (has == null) {
			has = new EObjectResolvingEList<Placeholder>(Placeholder.class, this, SBVRPackage.FACT_TYPE__HAS);
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SBVRPackage.FACT_TYPE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.FACT_TYPE__FACT_TYPE_FORM:
				return getFactTypeForm();
			case SBVRPackage.FACT_TYPE__ROLE:
				return getRole();
			case SBVRPackage.FACT_TYPE__HAS:
				return getHas();
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
			case SBVRPackage.FACT_TYPE__FACT_TYPE_FORM:
				getFactTypeForm().clear();
				getFactTypeForm().addAll((Collection<? extends FactTypeForm>)newValue);
				return;
			case SBVRPackage.FACT_TYPE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends FactTypeRole>)newValue);
				return;
			case SBVRPackage.FACT_TYPE__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends Placeholder>)newValue);
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
			case SBVRPackage.FACT_TYPE__FACT_TYPE_FORM:
				getFactTypeForm().clear();
				return;
			case SBVRPackage.FACT_TYPE__ROLE:
				getRole().clear();
				return;
			case SBVRPackage.FACT_TYPE__HAS:
				getHas().clear();
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
			case SBVRPackage.FACT_TYPE__FACT_TYPE_FORM:
				return !getFactTypeForm().isEmpty();
			case SBVRPackage.FACT_TYPE__ROLE:
				return role != null && !role.isEmpty();
			case SBVRPackage.FACT_TYPE__HAS:
				return has != null && !has.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FactTypeImpl
