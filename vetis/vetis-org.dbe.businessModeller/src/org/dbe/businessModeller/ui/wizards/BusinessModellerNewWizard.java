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
package org.dbe.businessModeller.ui.wizards;

import org.dbe.businessModeller.BusinessModellerMessages;
import org.dbe.businessModeller.ruleset.ui.wizards.RulesetNewWizardPage;
import org.dbe.businessModeller.ui.wizards.GeneralDocumentNewWizard;
import org.dbe.businessModeller.ui.wizards.GeneralDocumentNewWizardPage;
import org.dbe.businessModeller.ui.wizards.util.FileContentAssociator;
import org.dbe.businessModeller.ui.wizards.util.FinishRunnableWithProgress;
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.vocabulary.ui.wizards.VocabularyNewWizardPage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;

public class BusinessModellerNewWizard extends GeneralDocumentNewWizard{
	private GeneralDocumentNewWizardPage page1;
	private GeneralDocumentNewWizardPage page2;
	
	/**
	 * Adding the page to the wizard.
	 */
	public void addPages(){
		page1 = new VocabularyNewWizardPage(selection);
		page2 = new RulesetNewWizardPage(selection);
		addPage(page1);
		addPage(page2);
	}
		

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish(){
		final String containerName = page1.getContainerName();
		final List fileNames = new ArrayList(3);
		String fileNameVoc     = page1.getFileName(); 
		String fileNameRuleSet = page2.getFileName();
		fileNames.add(0, new FileContentAssociator(BusinessModellerUtils.getHeadFileName(fileNameVoc), fileNameVoc+BusinessModellerMessages.getString("FileContent_Voc_Head")));
		fileNames.add(1, new FileContentAssociator(fileNameVoc, BusinessModellerMessages.getString("FileContent_Voc")));
		fileNames.add(2, new FileContentAssociator(fileNameRuleSet, BusinessModellerMessages.getString("FileContent_Rules")));
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
