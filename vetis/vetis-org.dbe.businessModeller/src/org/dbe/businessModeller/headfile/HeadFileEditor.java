/*******************************************************************************
 * Copyright (c) 2006 DBE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://opensource.org/licenses/eclipse-1.0.php
 *
 * Contributors:
 *     Isufi
 *
 * Authors:
 *	Maurizio De Tommasi
 *	Pierpaolo Cira
 *	Valerio Cisternino
 *
 *******************************************************************************/
/*
 * Creato il 10-apr-2006
 * @author Pierpaolo Cira
 */
/*
 * Modified 2009.09.20 by Vetis project
 */
package org.dbe.businessModeller.headfile;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;

public class HeadFileEditor extends TextEditor{
	
	public HeadFileEditor(){
		super();
	}
	
	public boolean isEditable() {
		return false;
	}
	
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
	}
}
