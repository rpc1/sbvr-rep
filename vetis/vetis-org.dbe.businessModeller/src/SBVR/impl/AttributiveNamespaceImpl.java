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

import SBVR.AttributiveNamespace;
import SBVR.Concept;
import SBVR.SBVRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributive Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.AttributiveNamespaceImpl#getSubjectConcept <em>Subject Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributiveNamespaceImpl extends NamespaceImpl implements AttributiveNamespace {
	/**
	 * The cached value of the '{@link #getSubjectConcept() <em>Subject Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectConcept()
	 * @generated
	 * @ordered
	 */
	protected Concept subjectConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributiveNamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.ATTRIBUTIVE_NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getSubjectConcept() {
		if (subjectConcept != null && subjectConcept.eIsProxy()) {
			InternalEObject oldSubjectConcept = (InternalEObject)subjectConcept;
			subjectConcept = (Concept)eResolveProxy(oldSubjectConcept);
			if (subjectConcept != oldSubjectConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.ATTRIBUTIVE_NAMESPACE__SUBJECT_CONCEPT, oldSubjectConcept, subjectConcept));
			}
		}
		return subjectConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetSubjectConcept() {
		return subjectConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectConcept(Concept newSubjectConcept) {
		Concept oldSubjectConcept = subjectConcept;
		subjectConcept = newSubjectConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.ATTRIBUTIVE_NAMESPACE__SUBJECT_CONCEPT, oldSubjectConcept, subjectConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.ATTRIBUTIVE_NAMESPACE__SUBJECT_CONCEPT:
				if (resolve) return getSubjectConcept();
				return basicGetSubjectConcept();
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
			case SBVRPackage.ATTRIBUTIVE_NAMESPACE__SUBJECT_CONCEPT:
				setSubjectConcept((Concept)newValue);
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
			case SBVRPackage.ATTRIBUTIVE_NAMESPACE__SUBJECT_CONCEPT:
				setSubjectConcept((Concept)null);
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
			case SBVRPackage.ATTRIBUTIVE_NAMESPACE__SUBJECT_CONCEPT:
				return subjectConcept != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributiveNamespaceImpl
