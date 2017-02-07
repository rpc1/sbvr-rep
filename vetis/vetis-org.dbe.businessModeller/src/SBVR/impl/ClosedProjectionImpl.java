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

import SBVR.AuxiliaryVariable;
import SBVR.ClosedProjection;
import SBVR.Definition;
import SBVR.FactType;
import SBVR.LogicalFormulation;
import SBVR.ObjectType;
import SBVR.Projection;
import SBVR.Question;
import SBVR.SBVRPackage;
import SBVR.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Closed Projection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.ClosedProjectionImpl#getConstrainingFormulation <em>Constraining Formulation</em>}</li>
 *   <li>{@link SBVR.impl.ClosedProjectionImpl#getProjectionVariable <em>Projection Variable</em>}</li>
 *   <li>{@link SBVR.impl.ClosedProjectionImpl#getAuxiliaryVariable <em>Auxiliary Variable</em>}</li>
 *   <li>{@link SBVR.impl.ClosedProjectionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link SBVR.impl.ClosedProjectionImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link SBVR.impl.ClosedProjectionImpl#getFactType <em>Fact Type</em>}</li>
 *   <li>{@link SBVR.impl.ClosedProjectionImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClosedProjectionImpl extends ClosedSemanticFormulationImpl implements ClosedProjection {
	/**
	 * The cached value of the '{@link #getConstrainingFormulation() <em>Constraining Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingFormulation()
	 * @generated
	 * @ordered
	 */
	protected LogicalFormulation constrainingFormulation;

	/**
	 * The cached value of the '{@link #getProjectionVariable() <em>Projection Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> projectionVariable;

	/**
	 * The cached value of the '{@link #getAuxiliaryVariable() <em>Auxiliary Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryVariable> auxiliaryVariable;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Definition> definition;

	/**
	 * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected ObjectType objectType;

	/**
	 * The cached value of the '{@link #getFactType() <em>Fact Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactType()
	 * @generated
	 * @ordered
	 */
	protected FactType factType;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected Question question;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClosedProjectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.CLOSED_PROJECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation getConstrainingFormulation() {
		if (constrainingFormulation != null && constrainingFormulation.eIsProxy()) {
			InternalEObject oldConstrainingFormulation = (InternalEObject)constrainingFormulation;
			constrainingFormulation = (LogicalFormulation)eResolveProxy(oldConstrainingFormulation);
			if (constrainingFormulation != oldConstrainingFormulation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.CLOSED_PROJECTION__CONSTRAINING_FORMULATION, oldConstrainingFormulation, constrainingFormulation));
			}
		}
		return constrainingFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFormulation basicGetConstrainingFormulation() {
		return constrainingFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainingFormulation(LogicalFormulation newConstrainingFormulation) {
		LogicalFormulation oldConstrainingFormulation = constrainingFormulation;
		constrainingFormulation = newConstrainingFormulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.CLOSED_PROJECTION__CONSTRAINING_FORMULATION, oldConstrainingFormulation, constrainingFormulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getProjectionVariable() {
		if (projectionVariable == null) {
			projectionVariable = new EObjectResolvingEList<Variable>(Variable.class, this, SBVRPackage.CLOSED_PROJECTION__PROJECTION_VARIABLE);
		}
		return projectionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuxiliaryVariable> getAuxiliaryVariable() {
		if (auxiliaryVariable == null) {
			auxiliaryVariable = new EObjectResolvingEList<AuxiliaryVariable>(AuxiliaryVariable.class, this, SBVRPackage.CLOSED_PROJECTION__AUXILIARY_VARIABLE);
		}
		return auxiliaryVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Definition> getDefinition() {
		if (definition == null) {
			definition = new EObjectResolvingEList<Definition>(Definition.class, this, SBVRPackage.CLOSED_PROJECTION__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType getObjectType() {
		if (objectType != null && objectType.eIsProxy()) {
			InternalEObject oldObjectType = (InternalEObject)objectType;
			objectType = (ObjectType)eResolveProxy(oldObjectType);
			if (objectType != oldObjectType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.CLOSED_PROJECTION__OBJECT_TYPE, oldObjectType, objectType));
			}
		}
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType basicGetObjectType() {
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(ObjectType newObjectType) {
		ObjectType oldObjectType = objectType;
		objectType = newObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.CLOSED_PROJECTION__OBJECT_TYPE, oldObjectType, objectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactType getFactType() {
		if (factType != null && factType.eIsProxy()) {
			InternalEObject oldFactType = (InternalEObject)factType;
			factType = (FactType)eResolveProxy(oldFactType);
			if (factType != oldFactType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.CLOSED_PROJECTION__FACT_TYPE, oldFactType, factType));
			}
		}
		return factType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactType basicGetFactType() {
		return factType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactType(FactType newFactType) {
		FactType oldFactType = factType;
		factType = newFactType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.CLOSED_PROJECTION__FACT_TYPE, oldFactType, factType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getQuestion() {
		if (question != null && question.eIsProxy()) {
			InternalEObject oldQuestion = (InternalEObject)question;
			question = (Question)eResolveProxy(oldQuestion);
			if (question != oldQuestion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBVRPackage.CLOSED_PROJECTION__QUESTION, oldQuestion, question));
			}
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question basicGetQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(Question newQuestion) {
		Question oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBVRPackage.CLOSED_PROJECTION__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.CLOSED_PROJECTION__CONSTRAINING_FORMULATION:
				if (resolve) return getConstrainingFormulation();
				return basicGetConstrainingFormulation();
			case SBVRPackage.CLOSED_PROJECTION__PROJECTION_VARIABLE:
				return getProjectionVariable();
			case SBVRPackage.CLOSED_PROJECTION__AUXILIARY_VARIABLE:
				return getAuxiliaryVariable();
			case SBVRPackage.CLOSED_PROJECTION__DEFINITION:
				return getDefinition();
			case SBVRPackage.CLOSED_PROJECTION__OBJECT_TYPE:
				if (resolve) return getObjectType();
				return basicGetObjectType();
			case SBVRPackage.CLOSED_PROJECTION__FACT_TYPE:
				if (resolve) return getFactType();
				return basicGetFactType();
			case SBVRPackage.CLOSED_PROJECTION__QUESTION:
				if (resolve) return getQuestion();
				return basicGetQuestion();
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
			case SBVRPackage.CLOSED_PROJECTION__CONSTRAINING_FORMULATION:
				setConstrainingFormulation((LogicalFormulation)newValue);
				return;
			case SBVRPackage.CLOSED_PROJECTION__PROJECTION_VARIABLE:
				getProjectionVariable().clear();
				getProjectionVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case SBVRPackage.CLOSED_PROJECTION__AUXILIARY_VARIABLE:
				getAuxiliaryVariable().clear();
				getAuxiliaryVariable().addAll((Collection<? extends AuxiliaryVariable>)newValue);
				return;
			case SBVRPackage.CLOSED_PROJECTION__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Definition>)newValue);
				return;
			case SBVRPackage.CLOSED_PROJECTION__OBJECT_TYPE:
				setObjectType((ObjectType)newValue);
				return;
			case SBVRPackage.CLOSED_PROJECTION__FACT_TYPE:
				setFactType((FactType)newValue);
				return;
			case SBVRPackage.CLOSED_PROJECTION__QUESTION:
				setQuestion((Question)newValue);
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
			case SBVRPackage.CLOSED_PROJECTION__CONSTRAINING_FORMULATION:
				setConstrainingFormulation((LogicalFormulation)null);
				return;
			case SBVRPackage.CLOSED_PROJECTION__PROJECTION_VARIABLE:
				getProjectionVariable().clear();
				return;
			case SBVRPackage.CLOSED_PROJECTION__AUXILIARY_VARIABLE:
				getAuxiliaryVariable().clear();
				return;
			case SBVRPackage.CLOSED_PROJECTION__DEFINITION:
				getDefinition().clear();
				return;
			case SBVRPackage.CLOSED_PROJECTION__OBJECT_TYPE:
				setObjectType((ObjectType)null);
				return;
			case SBVRPackage.CLOSED_PROJECTION__FACT_TYPE:
				setFactType((FactType)null);
				return;
			case SBVRPackage.CLOSED_PROJECTION__QUESTION:
				setQuestion((Question)null);
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
			case SBVRPackage.CLOSED_PROJECTION__CONSTRAINING_FORMULATION:
				return constrainingFormulation != null;
			case SBVRPackage.CLOSED_PROJECTION__PROJECTION_VARIABLE:
				return projectionVariable != null && !projectionVariable.isEmpty();
			case SBVRPackage.CLOSED_PROJECTION__AUXILIARY_VARIABLE:
				return auxiliaryVariable != null && !auxiliaryVariable.isEmpty();
			case SBVRPackage.CLOSED_PROJECTION__DEFINITION:
				return definition != null && !definition.isEmpty();
			case SBVRPackage.CLOSED_PROJECTION__OBJECT_TYPE:
				return objectType != null;
			case SBVRPackage.CLOSED_PROJECTION__FACT_TYPE:
				return factType != null;
			case SBVRPackage.CLOSED_PROJECTION__QUESTION:
				return question != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Projection.class) {
			switch (derivedFeatureID) {
				case SBVRPackage.CLOSED_PROJECTION__CONSTRAINING_FORMULATION: return SBVRPackage.PROJECTION__CONSTRAINING_FORMULATION;
				case SBVRPackage.CLOSED_PROJECTION__PROJECTION_VARIABLE: return SBVRPackage.PROJECTION__PROJECTION_VARIABLE;
				case SBVRPackage.CLOSED_PROJECTION__AUXILIARY_VARIABLE: return SBVRPackage.PROJECTION__AUXILIARY_VARIABLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Projection.class) {
			switch (baseFeatureID) {
				case SBVRPackage.PROJECTION__CONSTRAINING_FORMULATION: return SBVRPackage.CLOSED_PROJECTION__CONSTRAINING_FORMULATION;
				case SBVRPackage.PROJECTION__PROJECTION_VARIABLE: return SBVRPackage.CLOSED_PROJECTION__PROJECTION_VARIABLE;
				case SBVRPackage.PROJECTION__AUXILIARY_VARIABLE: return SBVRPackage.CLOSED_PROJECTION__AUXILIARY_VARIABLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ClosedProjectionImpl
