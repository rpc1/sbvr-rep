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
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A detailed vocabulary concerning text is provided by the Unicode specification. Taking the
 * concept ?text? from the Unicode specification does not mean that a text is a Unicode encoding,
 * but rather, it implies that a text can be represented by a Unicode encoding in electronic
 * communications. Unicode encodings provide the common means of text representation in
 * word processors, mail systems, the Internet, and so on. The encodings tend to be invisible to
 * people writing and reading the text.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SBVR.Text#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see SBVR.SBVRPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see SBVR.SBVRPackage#getText_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link SBVR.Text#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Text
