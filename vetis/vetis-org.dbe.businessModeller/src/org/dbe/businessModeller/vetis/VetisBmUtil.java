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
package org.dbe.businessModeller.vetis;

import java.io.File;
import java.io.IOException;


import org.dbe.businessModeller.ruleset.enterprise.exchange.RulesetExporter;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.VocabularyExporter;

/**
 * Helper necessary for operation of VeTIS application.<br/>
 * <br/>
 * Static methods are thread safe, instance methods are not.
 */
public class VetisBmUtil {
	
	/**
	 * Create files for fresh VeTis project in given directory.
	 * @param dstDir Directory to create files in.
	 * @param prjTitle Title of the project for naming files.
	 * @return True on success, false on failure.
	 */
	public static boolean createPrjFiles(File dstDir, String prjTitle) {

		if(dstDir.isDirectory()) {
		    try {
		        File fileVoc = new File(dstDir.getPath() + System.getProperty("file.separator") + prjTitle + ".voc");
		        File fileVocHead = new File(dstDir.getPath() + System.getProperty("file.separator") + prjTitle + ".voc_head");
		        File fileRules = new File(dstDir.getPath() + System.getProperty("file.separator") + prjTitle + ".rules");
		        
		        //create new files if they do not exist
		        if( !fileVoc.exists() ){
		        	fileVoc.createNewFile();
		        }

		        if( !fileVocHead.exists() ){
		        	fileVocHead.createNewFile();
		        }
		        
		        if( !fileRules.exists() ){
		        	fileRules.createNewFile();
		        }
		        
		        return true;
		        
		    } catch (IOException e) {
		    	return false;
		    }
		}
		else {
			return false;
		}
	}
	
	/**
	 * Export vocabulary file to XMI.
	 * @param srcVocFile Vocabulary file.
	 * @param dstFile Destination file.
	 */
	public static void exportVocabToXmi(File srcVocFile, File dstFile){
		// parse and export vocabulary
		VocabularyExporter vocabularyExporter = new VocabularyExporter();
		vocabularyExporter.setVocFile(srcVocFile);
		vocabularyExporter.setXMIFile(dstFile);
		vocabularyExporter.parseAndExportVocabulary(1);
	}
	
	/**
	 * Export rules file to XMI.
	 * @param srcVocFile Vocabulary file.
	 * @param srcRulesFile Rules file.
	 * @param dstFile Destination file.
	 */
	public static void exportRulesToXmi(File srcVocFile, File srcRulesFile, File dstFile){
		// parse and export vocabulary
		VocabularyExporter vocabularyExporter = new VocabularyExporter();
		vocabularyExporter.setVocFile(srcVocFile);
		vocabularyExporter.setXMIFile(dstFile);
		vocabularyExporter.parseAndExportVocabulary(0); 
		
		// parse and export ruleset
		RulesetExporter ruleSetExporter = new RulesetExporter();
		ruleSetExporter.setRulesFile(srcRulesFile);
		ruleSetExporter.setThingList(vocabularyExporter.getThingList());
		ruleSetExporter.setConceptualSchema(vocabularyExporter.getConceptualSchema());
		ruleSetExporter.setResource(vocabularyExporter.getResource());
		ruleSetExporter.parseAndExportRuleset();
	}
}
