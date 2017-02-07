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

import SBVR.ClosedSemanticFormulation;
import SBVR.Meaning;
import SBVR.SBVRPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Closed Semantic Formulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.ClosedSemanticFormulationImpl#getMeaning <em>Meaning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClosedSemanticFormulationImpl extends SemanticFormulationImpl implements ClosedSemanticFormulation {
	/**
	 * The cached value of the '{@link #getMeaning() <em>Meaning</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaning()
	 * @generated
	 * @ordered
	 */
	protected EList<Meaning> meaning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClosedSemanticFormulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.CLOSED_SEMANTIC_FORMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meaning> getMeaning() {
		if (meaning == null) {
			meaning = new EObjectResolvingEList<Meaning>(Meaning.class, this, SBVRPackage.CLOSED_SEMANTIC_FORMULATION__MEANING);
		}
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.CLOSED_SEMANTIC_FORMULATION__MEANING:
				return getMeaning();
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
			case SBVRPackage.CLOSED_SEMANTIC_FORMULATION__MEANING:
				getMeaning().clear();
				getMeaning().addAll((Collection<? extends Meaning>)newValue);
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
			case SBVRPackage.CLOSED_SEMANTIC_FORMULATION__MEANING:
				getMeaning().clear();
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
			case SBVRPackage.CLOSED_SEMANTIC_FORMULATION__MEANING:
				return meaning != null && !meaning.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClosedSemanticFormulationImpl
