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
 * Creato il 22-nov-2005
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.ruleset.ui.wizards;

import org.dbe.businessModeller.BusinessModellerMessages;
import org.dbe.businessModeller.ui.wizards.GeneralDocumentNewWizard;
import org.dbe.businessModeller.ui.wizards.GeneralDocumentNewWizardPage;
import org.dbe.businessModeller.ui.wizards.util.FileContentAssociator;
import org.dbe.businessModeller.ui.wizards.util.FinishRunnableWithProgress;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;

public class RulesetNewWizard extends GeneralDocumentNewWizard{
	private GeneralDocumentNewWizardPage page;

	public void addPages(){
		page = new RulesetNewWizardPage(selection);
		addPage(page);
	}

	public boolean performFinish(){
		final String containerName = page.getContainerName();
		final List fileNames = new ArrayList(1);
		String fileNameRuleSet   = page.getFileName();
		// TODO PP: to use iterator function in the parameter??
		fileNames.add(0, new FileContentAssociator(fileNameRuleSet, BusinessModellerMessages.getString("FileContent_Rules")));
		FinishRunnableWithProgress op = new FinishRunnableWithProgress(containerName, fileNames, getShell());
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}	
}
