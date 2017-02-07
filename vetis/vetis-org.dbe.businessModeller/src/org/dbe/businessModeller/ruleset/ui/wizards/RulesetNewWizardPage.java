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
package org.dbe.businessModeller.ruleset.ui.wizards;

import org.dbe.businessModeller.ui.wizards.GeneralDocumentNewWizardPage;
import org.eclipse.jface.viewers.ISelection;

public class RulesetNewWizardPage extends GeneralDocumentNewWizardPage{
	public RulesetNewWizardPage(ISelection selection) {
		super(selection);
		super.setFileExtension("rules");
		super.setTitle("RuleSet file");
		super.setDescription("This wizard creates a new RuleSet file that can be opened by RuleSet editor.");
	}

}
