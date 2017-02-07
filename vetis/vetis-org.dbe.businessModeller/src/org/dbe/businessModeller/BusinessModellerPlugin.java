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
 * Modified 2009.11.26 by Vetis project
 */
package org.dbe.businessModeller;

import net.didion.jwnl.JWNL;

import org.apache.log4j.PropertyConfigurator;
import org.dbe.businessModeller.logger.BusinessModellerLogger;
import org.dbe.businessModeller.ruleset.ui.editors.entrydefinition.RulesetScanner;
import org.dbe.businessModeller.utils.ResourceProvider;
import org.dbe.businessModeller.utils.VocabularyColorProvider;
import org.dbe.businessModeller.vocabulary.enterprise.BMDictionary;
import org.dbe.businessModeller.vocabulary.ui.editors.entrydefinition.VocabularyScanner;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


public class BusinessModellerPlugin extends AbstractUIPlugin {

	private static BusinessModellerLogger logger = (BusinessModellerLogger)BusinessModellerLogger.getLogger(BusinessModellerPlugin.class);
	//The shared instance.
	public final static String PLUGIN_ID = "org.dbe.businessModeller-vetis";
	public final static String PLUGIN_ROOT_PACKAGE = "org.dbe.businessModeller-vetis";
	private static BusinessModellerPlugin plugin;
	private VocabularyColorProvider fColorProvider;
	private VocabularyScanner fCodeScanner;
	private RulesetScanner fRulesetScanner; 
	private BMDictionary fBMDictionary;
	
	/**
	 * The constructor.
	 */
	public BusinessModellerPlugin() {
		plugin = this;
		try {
			// Initialize Log4J logger
			PropertyConfigurator.configure(ResourceProvider.getUrl("log4j.properties"));
			// Initialize JWNL engine
			JWNL.initialize(ResourceProvider.getInputStream("jwnl_file_properties.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 */
	public static BusinessModellerPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.dbe.businessModeller-vetis", path);
	}
	
	/**
	 * Returns the singleton Structured English color provider.
	 * 
	 * @return the singleton Structured English color provider
	 */
	public VocabularyColorProvider getSEColorProvider() {
	 	if (fColorProvider == null)
			fColorProvider= new VocabularyColorProvider();
		return fColorProvider;
	}
	
	/**
	 * Returns the singleton Structured English scanner.
	 * 
	 * @return the singleton Structured English scanner
	 */
	 public RuleBasedScanner getSEScanner() {
	 	if (fCodeScanner == null)
			fCodeScanner= new VocabularyScanner(getSEColorProvider());
		return fCodeScanner;
	 }
	 
	/**
	 * Returns the singleton Ruleset scanner.
	 * 
	 * @return the singleton Ruleset scanner
	 */
	 public RuleBasedScanner getRulesetScanner() {
	 	if (fRulesetScanner == null)
			fRulesetScanner= new RulesetScanner(getSEColorProvider());
		return fRulesetScanner;
	 }
	 
	 /**
	  * Returns the singleton Business Modeller Dictionary.
	  * 
	  * @return the singleton Business Modeller Dictionary
	  */
	 public BMDictionary getBMDictionary(){
		fBMDictionary = BMDictionary.getInstance();
		return fBMDictionary;
	 }
}
