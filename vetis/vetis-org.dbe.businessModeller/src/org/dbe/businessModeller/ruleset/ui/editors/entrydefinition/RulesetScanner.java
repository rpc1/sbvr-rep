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
 * @author detommasi
 * @author Pierpaolo Cira
 */
/*
 * Modified 2009.06.16 by Vetis project
 */
package org.dbe.businessModeller.ruleset.ui.editors.entrydefinition;

import java.util.ArrayList;
import java.util.List;

import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.BusinessModellerPlugin;
import org.dbe.businessModeller.XML.XMLDocument;
import org.dbe.businessModeller.XML.XMLElement;
import org.dbe.businessModeller.XML.XMLWrapper;
import org.dbe.businessModeller.ruleset.ui.editors.utils.RulesetWordDetector;
import org.dbe.businessModeller.ruleset.ui.editors.utils.RulesetWordRule;
import org.dbe.businessModeller.utils.ResourceProvider;
import org.dbe.businessModeller.utils.VocabularyColorProvider;
import org.dbe.businessModeller.vocabulary.enterprise.FontStyle;
import org.dbe.businessModeller.vocabulary.ui.editors.utils.VocabularyNameDetector;
import org.dbe.businessModeller.vocabulary.ui.editors.utils.VocabularyWhiteSpaceDetector;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.swt.SWT;


public class RulesetScanner extends RuleBasedScanner {

	private static String[] fgKeywords= { "the", "that", "which", "some", "each", "and",
			"or", "not", "always", "never", "may", "a", "an", "another", "who", "what"};
	private static String[] fgTags = ResourceProvider.getAttributeCaption();
	private VocabularyColorProvider provider;
	
	public RulesetScanner(VocabularyColorProvider provider) {
		this.provider = provider;
		IToken keyword= new Token(new TextAttribute(provider.getColor(VocabularyColorProvider.KEYWORD)));
		IToken string= new Token(new TextAttribute(provider.getColor(VocabularyColorProvider.STRING)));
		IToken other= new Token(new TextAttribute(provider.getColor(VocabularyColorProvider.DEFAULT)));
		IToken tag = getFontToken(BusinessModeller.TAG);
		
		List rules= new ArrayList();
		
		//Add generic whitespace rule.
		rules.add(new WhitespaceRule(new VocabularyWhiteSpaceDetector()));
	
		//Mia regola per i Term buona
		// get language document and keywords
	 	XMLWrapper wrapper = new XMLWrapper();
		XMLDocument doc = wrapper.getLanguageDocument();
		XMLElement keywords = doc.getElement("keywords");
		RulesetWordRule termRule = new RulesetWordRule(new RulesetWordDetector(), BusinessModellerPlugin.getDefault().getBMDictionary(), provider, other);
		for (int i= 0; i < fgKeywords.length; i++)
			termRule.addWord(fgKeywords[i], keyword);
		termRule.setKeywords(keywords);
		rules.add(termRule);
		
		//regola per i Name
		RulesetWordRule nameRule = new RulesetWordRule(new VocabularyNameDetector(), BusinessModellerPlugin.getDefault().getBMDictionary(), provider, string);
		for (int i= 0; i < fgTags.length; i++)
			nameRule.addWord(fgTags[i], tag);
		nameRule.setKeywords(keywords);
		rules.add(nameRule);
		
		IRule[] result= new IRule[rules.size()];
		rules.toArray(result);
		setRules(result);
		
	}
	
	private IToken getFontToken(int font){
		FontStyle fontStyle = provider.getFontStyle(font);
		int style = ((fontStyle.isUnderlined()) ? TextAttribute.UNDERLINE : 0)
				  | ((fontStyle.isBold()) ? SWT.BOLD : 0)
				  | ((fontStyle.isItalic()) ? SWT.ITALIC : 0);
		return new Token(new TextAttribute(fontStyle.getColor() ,null, style));
	}

}

