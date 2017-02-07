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

import SBVR.Designation;
import SBVR.FactTypeForm;
import SBVR.Namespace;
import SBVR.SBVRPackage;
import SBVR.URI;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.NamespaceImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link SBVR.impl.NamespaceImpl#getFactTypeForm <em>Fact Type Form</em>}</li>
 *   <li>{@link SBVR.impl.NamespaceImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link SBVR.impl.NamespaceImpl#getIncorporatedNamespace <em>Incorporated Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceImpl extends ThingImpl implements Namespace {
	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected EList<Designation> designation;

	/**
	 * The cached value of the '{@link #getFactTypeForm() <em>Fact Type Form</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactTypeForm()
	 * @generated
	 * @ordered
	 */
	protected EList<FactTypeForm> factTypeForm;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected EList<URI> uri;

	/**
	 * The cached value of the '{@link #getIncorporatedNamespace() <em>Incorporated Namespace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncorporatedNamespace()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> incorporatedNamespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Designation> getDesignation() {
		if (designation == null) {
			designation = new EObjectResolvingEList<Designation>(Designation.class, this, SBVRPackage.NAMESPACE__DESIGNATION);
		}
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactTypeForm> getFactTypeForm() {
		if (factTypeForm == null) {
			factTypeForm = new EObjectResolvingEList<FactTypeForm>(FactTypeForm.class, this, SBVRPackage.NAMESPACE__FACT_TYPE_FORM);
		}
		return factTypeForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URI> getUri() {
		if (uri == null) {
			uri = new EObjectResolvingEList<URI>(URI.class, this, SBVRPackage.NAMESPACE__URI);
		}
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getIncorporatedNamespace() {
		if (incorporatedNamespace == null) {
			incorporatedNamespace = new EObjectResolvingEList<Namespace>(Namespace.class, this, SBVRPackage.NAMESPACE__INCORPORATED_NAMESPACE);
		}
		return incorporatedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.NAMESPACE__DESIGNATION:
				return getDesignation();
			case SBVRPackage.NAMESPACE__FACT_TYPE_FORM:
				return getFactTypeForm();
			case SBVRPackage.NAMESPACE__URI:
				return getUri();
			case SBVRPackage.NAMESPACE__INCORPORATED_NAMESPACE:
				return getIncorporatedNamespace();
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
			case SBVRPackage.NAMESPACE__DESIGNATION:
				getDesignation().clear();
				getDesignation().addAll((Collection<? extends Designation>)newValue);
				return;
			case SBVRPackage.NAMESPACE__FACT_TYPE_FORM:
				getFactTypeForm().clear();
				getFactTypeForm().addAll((Collection<? extends FactTypeForm>)newValue);
				return;
			case SBVRPackage.NAMESPACE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends URI>)newValue);
				return;
			case SBVRPackage.NAMESPACE__INCORPORATED_NAMESPACE:
				getIncorporatedNamespace().clear();
				getIncorporatedNamespace().addAll((Collection<? extends Namespace>)newValue);
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
			case SBVRPackage.NAMESPACE__DESIGNATION:
				getDesignation().clear();
				return;
			case SBVRPackage.NAMESPACE__FACT_TYPE_FORM:
				getFactTypeForm().clear();
				return;
			case SBVRPackage.NAMESPACE__URI:
				getUri().clear();
				return;
			case SBVRPackage.NAMESPACE__INCORPORATED_NAMESPACE:
				getIncorporatedNamespace().clear();
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
			case SBVRPackage.NAMESPACE__DESIGNATION:
				return designation != null && !designation.isEmpty();
			case SBVRPackage.NAMESPACE__FACT_TYPE_FORM:
				return factTypeForm != null && !factTypeForm.isEmpty();
			case SBVRPackage.NAMESPACE__URI:
				return uri != null && !uri.isEmpty();
			case SBVRPackage.NAMESPACE__INCORPORATED_NAMESPACE:
				return incorporatedNamespace != null && !incorporatedNamespace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NamespaceImpl
