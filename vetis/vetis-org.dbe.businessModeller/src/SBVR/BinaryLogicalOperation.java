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
package SBVR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Logical Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.BinaryLogicalOperation#getLogicalOperand1 <em>Logical Operand1</em>}</li>
 *   <li>{@link SBVR.BinaryLogicalOperation#getLogicalOperand2 <em>Logical Operand2</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getBinaryLogicalOperation()
 * @model
 * @generated
 */
public interface BinaryLogicalOperation extends LogicalOperation {
	/**
	 * Returns the value of the '<em><b>Logical Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Operand1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operand1</em>' reference.
	 * @see #setLogicalOperand1(LogicalFormulation)
	 * @see SBVR.SBVRPackage#getBinaryLogicalOperation_LogicalOperand1()
	 * @model required="true"
	 * @generated
	 */
	LogicalFormulation getLogicalOperand1();

	/**
	 * Sets the value of the '{@link SBVR.BinaryLogicalOperation#getLogicalOperand1 <em>Logical Operand1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Operand1</em>' reference.
	 * @see #getLogicalOperand1()
	 * @generated
	 */
	void setLogicalOperand1(LogicalFormulation value);

	/**
	 * Returns the value of the '<em><b>Logical Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Operand2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operand2</em>' reference.
	 * @see #setLogicalOperand2(LogicalFormulation)
	 * @see SBVR.SBVRPackage#getBinaryLogicalOperation_LogicalOperand2()
	 * @model required="true"
	 * @generated
	 */
	LogicalFormulation getLogicalOperand2();

	/**
	 * Sets the value of the '{@link SBVR.BinaryLogicalOperation#getLogicalOperand2 <em>Logical Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Operand2</em>' reference.
	 * @see #getLogicalOperand2()
	 * @generated
	 */
	void setLogicalOperand2(LogicalFormulation value);

} // BinaryLogicalOperation
