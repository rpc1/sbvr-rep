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
 * Creato il 24-gen-2006
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.vocabulary.ui.wizards;

import org.dbe.businessModeller.ui.wizards.GeneralDocumentNewWizardPage;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;


public class VocabularyNewWizardPage extends GeneralDocumentNewWizardPage{
	public VocabularyNewWizardPage(ISelection selection) {
		super(selection);
		super.setFileExtension("voc");
		super.setTitle("BSBR Vocabulary file");
		super.setDescription("This wizard creates a new BSBR Vocabulary file that can be opened by Vocabulary editor.");
	}
	
	protected void dialogChanged(){
		IResource container = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(getContainerName()));

		IProject project = container.getProject();
		try {
			IResource[] rs = project.members();
			for (int i=0;i<rs.length;i++) {
				if (rs[i].getType() == IResource.FILE && rs[i].getName().endsWith(".voc")) {
					super.updateStatus("Project cannot contain more than one SBVR Vocabulary");
					return;
				}
			}
	    } catch (CoreException e1) {e1.printStackTrace();}
	    super.dialogChanged();
	} 
}
