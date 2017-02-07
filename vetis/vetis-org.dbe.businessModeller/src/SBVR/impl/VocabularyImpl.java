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

import SBVR.BodyOfSharedMeanings;
import SBVR.Designation;
import SBVR.FactTypeForm;
import SBVR.Name;
import SBVR.SBVRPackage;
import SBVR.Term;
import SBVR.Vocabulary;
import SBVR.VocabularyNamespace;

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
 * An implementation of the model object '<em><b>Vocabulary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.VocabularyImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link SBVR.impl.VocabularyImpl#getFactTypeForm <em>Fact Type Form</em>}</li>
 *   <li>{@link SBVR.impl.VocabularyImpl#getBodyOfSharedMeaning <em>Body Of Shared Meaning</em>}</li>
 *   <li>{@link SBVR.impl.VocabularyImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link SBVR.impl.VocabularyImpl#getIncorporatedVocabulary <em>Incorporated Vocabulary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocabularyImpl extends SetImpl implements Vocabulary {
	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected EList<Designation> designation;

	/**
	 * The cached value of the '{@link #getFactTypeForm() <em>Fact Type Form</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactTypeForm()
	 * @generated
	 * @ordered
	 */
	protected EList<FactTypeForm> factTypeForm;

	/**
	 * The cached value of the '{@link #getBodyOfSharedMeaning() <em>Body Of Shared Meaning</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyOfSharedMeaning()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyOfSharedMeanings> bodyOfSharedMeaning;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected EList<VocabularyNamespace> namespace;

	/**
	 * The cached value of the '{@link #getIncorporatedVocabulary() <em>Incorporated Vocabulary</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncorporatedVocabulary()
	 * @generated
	 * @ordered
	 */
	protected EList<Vocabulary> incorporatedVocabulary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.VOCABULARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Designation> getDesignation() {
		if (designation == null) {
			designation = new EObjectContainmentEList<Designation>(Designation.class, this, SBVRPackage.VOCABULARY__DESIGNATION);
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
			factTypeForm = new EObjectContainmentEList<FactTypeForm>(FactTypeForm.class, this, SBVRPackage.VOCABULARY__FACT_TYPE_FORM);
		}
		return factTypeForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodyOfSharedMeanings> getBodyOfSharedMeaning() {
		if (bodyOfSharedMeaning == null) {
			bodyOfSharedMeaning = new EObjectResolvingEList<BodyOfSharedMeanings>(BodyOfSharedMeanings.class, this, SBVRPackage.VOCABULARY__BODY_OF_SHARED_MEANING);
		}
		return bodyOfSharedMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VocabularyNamespace> getNamespace() {
		if (namespace == null) {
			namespace = new EObjectResolvingEList<VocabularyNamespace>(VocabularyNamespace.class, this, SBVRPackage.VOCABULARY__NAMESPACE);
		}
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vocabulary> getIncorporatedVocabulary() {
		if (incorporatedVocabulary == null) {
			incorporatedVocabulary = new EObjectResolvingEList<Vocabulary>(Vocabulary.class, this, SBVRPackage.VOCABULARY__INCORPORATED_VOCABULARY);
		}
		return incorporatedVocabulary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm(String signifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createName(String signifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SBVRPackage.VOCABULARY__DESIGNATION:
				return ((InternalEList<?>)getDesignation()).basicRemove(otherEnd, msgs);
			case SBVRPackage.VOCABULARY__FACT_TYPE_FORM:
				return ((InternalEList<?>)getFactTypeForm()).basicRemove(otherEnd, msgs);
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
			case SBVRPackage.VOCABULARY__DESIGNATION:
				return getDesignation();
			case SBVRPackage.VOCABULARY__FACT_TYPE_FORM:
				return getFactTypeForm();
			case SBVRPackage.VOCABULARY__BODY_OF_SHARED_MEANING:
				return getBodyOfSharedMeaning();
			case SBVRPackage.VOCABULARY__NAMESPACE:
				return getNamespace();
			case SBVRPackage.VOCABULARY__INCORPORATED_VOCABULARY:
				return getIncorporatedVocabulary();
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
			case SBVRPackage.VOCABULARY__DESIGNATION:
				getDesignation().clear();
				getDesignation().addAll((Collection<? extends Designation>)newValue);
				return;
			case SBVRPackage.VOCABULARY__FACT_TYPE_FORM:
				getFactTypeForm().clear();
				getFactTypeForm().addAll((Collection<? extends FactTypeForm>)newValue);
				return;
			case SBVRPackage.VOCABULARY__BODY_OF_SHARED_MEANING:
				getBodyOfSharedMeaning().clear();
				getBodyOfSharedMeaning().addAll((Collection<? extends BodyOfSharedMeanings>)newValue);
				return;
			case SBVRPackage.VOCABULARY__NAMESPACE:
				getNamespace().clear();
				getNamespace().addAll((Collection<? extends VocabularyNamespace>)newValue);
				return;
			case SBVRPackage.VOCABULARY__INCORPORATED_VOCABULARY:
				getIncorporatedVocabulary().clear();
				getIncorporatedVocabulary().addAll((Collection<? extends Vocabulary>)newValue);
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
			case SBVRPackage.VOCABULARY__DESIGNATION:
				getDesignation().clear();
				return;
			case SBVRPackage.VOCABULARY__FACT_TYPE_FORM:
				getFactTypeForm().clear();
				return;
			case SBVRPackage.VOCABULARY__BODY_OF_SHARED_MEANING:
				getBodyOfSharedMeaning().clear();
				return;
			case SBVRPackage.VOCABULARY__NAMESPACE:
				getNamespace().clear();
				return;
			case SBVRPackage.VOCABULARY__INCORPORATED_VOCABULARY:
				getIncorporatedVocabulary().clear();
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
			case SBVRPackage.VOCABULARY__DESIGNATION:
				return designation != null && !designation.isEmpty();
			case SBVRPackage.VOCABULARY__FACT_TYPE_FORM:
				return factTypeForm != null && !factTypeForm.isEmpty();
			case SBVRPackage.VOCABULARY__BODY_OF_SHARED_MEANING:
				return bodyOfSharedMeaning != null && !bodyOfSharedMeaning.isEmpty();
			case SBVRPackage.VOCABULARY__NAMESPACE:
				return namespace != null && !namespace.isEmpty();
			case SBVRPackage.VOCABULARY__INCORPORATED_VOCABULARY:
				return incorporatedVocabulary != null && !incorporatedVocabulary.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VocabularyImpl
