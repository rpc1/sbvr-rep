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
 * Creato il 30-set-2005
 * @author Pierpaolo Cira
 */
/*
 * Modified 2009.11.26 by Vetis project
 */
package org.dbe.businessModeller.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.BusinessModellerPlugin;
import org.dbe.businessModeller.XML.XMLDocument;
import org.dbe.businessModeller.XML.XMLElement;
import org.dbe.businessModeller.XML.XMLWrapper;
import org.dbe.businessModeller.logger.BusinessModellerLogger;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.dbe.businessModeller.vocabulary.utils.VocabularyUtilities;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.Bundle;

public class ResourceProvider {
	
	private static BusinessModellerLogger logger = (BusinessModellerLogger)BusinessModellerLogger.getLogger(ResourceProvider.class);
	private static final String plugin_id = BusinessModellerPlugin.PLUGIN_ID;
	
	 public static Image getVocabularyEntryIcon(int numImage) throws IOException{
			String icon;
			switch(numImage){
			case BusinessModeller.TERM:
				icon = "term.gif";
				break;
			case BusinessModeller.NAME:
				icon = "name.gif";
				break;
			case BusinessModeller.FACT:
				icon = "fact.gif";
				break;
			case BusinessModeller.RULESET:
				icon = "ruleset.gif";
				break;
			case BusinessModeller.RULE:
				icon = "rule.gif";
				break;
			default:
				icon = "null.gif";
				break;
			}
			InputStream inputStream = getInputStream("icons/"+icon);
			Image image = new Image(Display.getDefault(), inputStream);
			return image;
		}
	 
	 public static ImageDescriptor getImageDescriptor(String name) throws IOException{
			InputStream inputStream = getInputStream("icons/"+name);
		 	Image image = new Image(Display.getDefault(), inputStream);
			ImageDescriptor imageDescriptor = ImageDescriptor.createFromImage(image);// = new FileImageDescriptor(Display.getDefault(), inputStream);
			return imageDescriptor;
		}
	 
	 public static InputStream getInputStream(String file) throws IOException{
			try{
				Bundle bundle = Platform.getBundle(plugin_id);
				Path path = new Path(file);
				URL fileURL = Platform.find(bundle, path);				
				InputStream inputStream = fileURL.openStream();
				// It doesn't work when it tries to instance wordnet 
				// InputStream inputStream = plugin.openStream(path);
				return inputStream;
			}catch(IOException ex){
				logger.warn("Error to get file: ".concat(file));
				throw ex;
			}
		}
	 
	public static Image getImageFromVocabularyEntry(VocabularyEntry vocabularyEntry) throws Exception{
			Image image = ResourceProvider.getVocabularyEntryIcon(
					VocabularyUtilities.getVocabularyEntryIdentifier(vocabularyEntry));
			return image;
		}
	 public static Image getAdditionalConceptsIcon() throws IOException{
			InputStream inputStream = getInputStream("icons/additional.gif");
			Image image = new Image(Display.getDefault(), inputStream);
			return image;
		}
	
	public static File getFile(String filePath, String fileName){
		String completePath = filePath.concat("/".concat(fileName));
		try{
			Bundle bundle = Platform.getBundle(plugin_id);
			Path path = new Path(completePath);
			URL relativeURL = Platform.find(bundle, path);
			URL fileURL = Platform.resolve(relativeURL);
			File file = new File(fileURL.getPath());
			return file;
		}catch(Exception x){
			logger.fatal("Error to get file: ".concat(completePath));
			return null;
		}
	}
	
	public static URL getUrl(String filePath, String fileName){
		String completePath = filePath.concat("/".concat(fileName));
		try{
			Bundle bundle = Platform.getBundle(plugin_id);
			Path path = new Path(completePath);
			URL relativeURL = Platform.find(bundle, path);
			URL fileURL = Platform.resolve(relativeURL);
			return fileURL;
		}catch(Exception x){
			logger.fatal("Error to get URL: ".concat(completePath));
			return null;
		}
	}

	public static URL getUrl(String fileName){
		return getUrl(".", fileName);
	}
	
	public static ResourceBundle getResourceBundle(String bundle){
			Locale locale = Locale.getDefault();
			return getResourceBundle(bundle, locale);
		}
	
	public static ResourceBundle getResourceBundle(String bundle, Locale locale){
		bundle = BusinessModellerPlugin.class.getPackage().getName().concat(".".concat(bundle));
		return ResourceBundle.getBundle(bundle, locale);
	}
	
	 public static String[] getAttributeCaption() {
		// modified 2009 04 15
	 	XMLWrapper wrapper = new XMLWrapper();
		XMLDocument doc = wrapper.getLanguageDocument();
		XMLElement keywords = doc.getElement("keywords");
		
		int size = keywords.getContents().size();
		
		final String[] caption = new String[size];
		
		for(int i = 0; i < size; i++){
			 
			caption[i] =  keywords.getContents().get(i).getContents().get(0).getValue() + ": ";
		}
		
		return caption;
	}
	 
	 public static String[] getFilteredAttributeCaption(String filter) {
			// added 2009 06 02 to get caption for only objctType or factType
		 	XMLWrapper wrapper = new XMLWrapper();
			XMLDocument doc = wrapper.getLanguageDocument();
			XMLElement keywords = doc.getElement("keywords");
			
			int size = keywords.getContents().size();
			int sizeReal = 0;
			String[] temp = new String[size];
			int j = 0;
			for(int i = 0; i < size; i++){
				XMLElement element = keywords.getContents().get(i);
				String attribute = element.getAttributes().get(filter);
				if((attribute != null || filter.equals("")) && !element.getContents().get(0).getValue().equals("")) {
					temp[j] = element.getContents().get(0).getValue() + ": ";
					sizeReal++;
					j++;
				}
			}
			
			final String[] caption = new String[sizeReal];
			j = 0;
			for(int i = 0; i < size; i++){
				if(temp[i] != null){
					caption[j] = temp[i];
					j++;
				}
				
			}
			
			return caption;
		}
	 
	 public static ArrayList<String> getAdditionalConceptTypes(String keyword) {
	 	
		
		XMLWrapper wrapper = new XMLWrapper();
		XMLDocument doc = wrapper.getLanguageDocument();
		XMLElement keywords = doc.getElement("keywords");

		String temp = "";
		
		
		for(int i = 0; i < keywords.getContents().size(); i++){
			XMLElement element = keywords.getContents().get(i);
			try	{
				if(element.getContents().get(0).getValue().equals(keyword)) {
					temp = element.getContents().get(1).getValue();
					break;
				}
			}
			catch(Exception e){}
		}
		
		 
		ArrayList<String> splitted = new ArrayList<String>();
		int j = 0;
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == ';') {
				j++;
			}
			else {
				if(splitted.size() == j) {
					splitted.add(j, "");
				}
				String t = splitted.get(j);
				t += temp.charAt(i);
				splitted.set(j, t);
			}
		}
		
		return splitted;
	 }
	 
	 public static String[] getRulesetCaption(){
		 	final String[] caption = { "It is obligatory that",
		 			"It is prohibited that", "It is necessary that", 
		 			"It is impossible that", "It is possible that",
		 			"It is permitted that", "a given", "some", "each", 
				 	"the set of each", "at least", "at most", "at least one", 
				 	"at most one", "exaclty", "exaclty one", "another" };
		 	
		 	return caption;
		}

}
