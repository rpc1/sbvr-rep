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
package org.dbe.businessModeller.vocabulary.enterprise.exchange;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ResourceFactoryImpl extends XMIResourceFactoryImpl{
	
	/**
	 * Constructor
	 */
	ResourceFactoryImpl(){
		super();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl#createResource(org.eclipse.emf.common.util.URI)
	 */
	public Resource createResource(URI uri){
		return new org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl(uri);
	}
	
	/*
	 * 
	 */
	protected boolean useUUIDs(){
		return true;
	}
	
}