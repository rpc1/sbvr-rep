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
import SBVR.Definition;
import SBVR.Designation;
import SBVR.ReferenceScheme;
import SBVR.SBVRPackage;
import SBVR.Set;
import SBVR.Thing;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.ConceptImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link SBVR.impl.ConceptImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link SBVR.impl.ConceptImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link SBVR.impl.ConceptImpl#getCoextensive <em>Coextensive</em>}</li>
 *   <li>{@link SBVR.impl.ConceptImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link SBVR.impl.ConceptImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link SBVR.impl.ConceptImpl#getReferenceScheme <em>Reference Scheme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConceptImpl extends MeaningImpl implements Concept {
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
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> general;

	/**
	 * The cached value of the '{@link #getCoextensive() <em>Coextensive</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoextensive()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> coextensive;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<Thing> instance;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected Set extension;

	/**
	 * The cached value of the '{@link #getReferenceScheme() <em>Reference Scheme</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceScheme()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceScheme> referenceScheme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Designation> getDesignation() {
		if (designation == null) {
			designation = new EObjectResolvingEList<Designation>(Designation.class, this, SBVRPackage.CONCEPT__DESIGNATION);
		}
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Definition> getDefinition() {
		// TODO: implement this method to return the 'Definition' reference list
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
	public EList<Concept> getGeneral() {
		if (general == null) {
			general = new EObjectResolvingEList<Concept>(Concept.class, this, SBVRPackage.CONCEPT__GENERAL);
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getCoextensive() {
		if (coextensive == null) {
			coextensive = new EObjectResolvingEList<Concept>(Concept.class, this, SBVRPackage.CONCEPT__COEXTENSIVE);
		}
		return coextensive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Thing> getInstance() {
		if (instance == null) {
			instance = new EObjectResolvingEList<Thing>(Thing.class, this, SBVRPackage.CONCEPT__INSTANCE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set getExtension() {
		if (extension != null && extension.eIsProxy()) {
			InternalEObject oldExtension = (InternalEObject)extension;
			extension = (Set)eResolveProxy(oldExtension);
			if (extension != oldExtension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.CONCEPT__EXTENSION, oldExtension, extension));
			}
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set basicGetExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(Set newExtension) {
		Set oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.CONCEPT__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceScheme> getReferenceScheme() {
		if (referenceScheme == null) {
			referenceScheme = new EObjectResolvingEList<ReferenceScheme>(ReferenceScheme.class, this, SBVRPackage.CONCEPT__REFERENCE_SCHEME);
		}
		return referenceScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.CONCEPT__DESIGNATION:
				return getDesignation();
			case SBVRPackage.CONCEPT__DEFINITION:
				return getDefinition();
			case SBVRPackage.CONCEPT__GENERAL:
				return getGeneral();
			case SBVRPackage.CONCEPT__COEXTENSIVE:
				return getCoextensive();
			case SBVRPackage.CONCEPT__INSTANCE:
				return getInstance();
			case SBVRPackage.CONCEPT__EXTENSION:
				if (resolve) return getExtension();
				return basicGetExtension();
			case SBVRPackage.CONCEPT__REFERENCE_SCHEME:
				return getReferenceScheme();
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
			case SBVRPackage.CONCEPT__DESIGNATION:
				getDesignation().clear();
				getDesignation().addAll((Collection<? extends Designation>)newValue);
				return;
			case SBVRPackage.CONCEPT__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Definition>)newValue);
				return;
			case SBVRPackage.CONCEPT__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends Concept>)newValue);
				return;
			case SBVRPackage.CONCEPT__COEXTENSIVE:
				getCoextensive().clear();
				getCoextensive().addAll((Collection<? extends Concept>)newValue);
				return;
			case SBVRPackage.CONCEPT__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends Thing>)newValue);
				return;
			case SBVRPackage.CONCEPT__EXTENSION:
				setExtension((Set)newValue);
				return;
			case SBVRPackage.CONCEPT__REFERENCE_SCHEME:
				getReferenceScheme().clear();
				getReferenceScheme().addAll((Collection<? extends ReferenceScheme>)newValue);
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
			case SBVRPackage.CONCEPT__DESIGNATION:
				getDesignation().clear();
				return;
			case SBVRPackage.CONCEPT__DEFINITION:
				getDefinition().clear();
				return;
			case SBVRPackage.CONCEPT__GENERAL:
				getGeneral().clear();
				return;
			case SBVRPackage.CONCEPT__COEXTENSIVE:
				getCoextensive().clear();
				return;
			case SBVRPackage.CONCEPT__INSTANCE:
				getInstance().clear();
				return;
			case SBVRPackage.CONCEPT__EXTENSION:
				setExtension((Set)null);
				return;
			case SBVRPackage.CONCEPT__REFERENCE_SCHEME:
				getReferenceScheme().clear();
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
			case SBVRPackage.CONCEPT__DESIGNATION:
				return designation != null && !designation.isEmpty();
			case SBVRPackage.CONCEPT__DEFINITION:
				return !getDefinition().isEmpty();
			case SBVRPackage.CONCEPT__GENERAL:
				return general != null && !general.isEmpty();
			case SBVRPackage.CONCEPT__COEXTENSIVE:
				return coextensive != null && !coextensive.isEmpty();
			case SBVRPackage.CONCEPT__INSTANCE:
				return instance != null && !instance.isEmpty();
			case SBVRPackage.CONCEPT__EXTENSION:
				return extension != null;
			case SBVRPackage.CONCEPT__REFERENCE_SCHEME:
				return referenceScheme != null && !referenceScheme.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptImpl
