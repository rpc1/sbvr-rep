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
package org.dbe.businessModeller.ruleset.utils;

import java.util.Comparator;

import org.dbe.businessModeller.vocabulary.enterprise.Rule;

public class RulesComparator implements Comparator<Rule> {

	/* (non Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Rule arg0, Rule arg1) {
		Rule rulesetEntry0 = arg0;
		Rule rulesetEntry1 = arg1;
		String primRep0 = rulesetEntry0.getText();
		String primRep1 = rulesetEntry1.getText();
		return primRep0.compareToIgnoreCase(primRep1);
	}

}
