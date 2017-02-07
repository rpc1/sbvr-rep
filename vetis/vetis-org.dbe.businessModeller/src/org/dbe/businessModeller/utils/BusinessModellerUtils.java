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
 * Creato il 1-dic-2005
 * @author Pierpaolo Cira
 */
/*
 * Modified 2009.09.15 by Vetis project
 */
package org.dbe.businessModeller.utils;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;

import org.dbe.businessModeller.BusinessModellerPlugin;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class BusinessModellerUtils {

	static final Shell shell = BusinessModellerPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
	public static String _HEAD_EXTENSION = "_head";
	
	public static void showInfoMessage(String message){
		System.out.print("Info: " + message + "\n");
	}
	
	public static void showWarningMessage(String message){
		System.out.print("Warning: " + message + "\n");
	}
	
	public static void showErrorMessage(String message){
		System.out.print("Error: " + message + "\n");
	}
	
	/**
	 * Open a message window
	 */
	public static void showMessage(String message, String title) {
		MessageDialog.openInformation(shell, title, message);
	}
	
	public static void showMessage(Object message, String title) {
		showMessage(message+"", title);
	}
	
	public static void showMessage(String message) {
		showMessage(message, "General Business Modeller Message");
	}
	
	public static void showMessage(Object message) {
		showMessage(message+"");
	}
	
	public static boolean isHeadFile(String fileName){
		return fileName.endsWith(_HEAD_EXTENSION);
	}
	
	/**
	 * 
	 * Receiving a fileName it return the name of the associate head-file.
	 * Call it only after before you are shure that fileName isn't a
	 * head-file name.
	 * 
	 * @see isHeadFile(String fileName)
	 * 
	 * */
	public static String getHeadFileName(String fileName){
		String thisName = fileName.concat(_HEAD_EXTENSION);
		return thisName;
	}
	
	/**
	 * 
	 * Receiving an headFileName it return the name of the associate main file.
	 * Call it only after before you are shure that headFileName is really an
	 * head-file name.
	 * 
	 * @see isHeadFile(String fileName)
	 * 
	 * */
	public static String getFileNameFromHead(String headFileName){
		String thisName = headFileName.substring(0, headFileName.length()-_HEAD_EXTENSION.length());
		return thisName;
	}
	
	/**
	 * Reads given file and returns file contents
	 * @param file input file
	 * @return file contents as string 
	 */
	
	public static String readFile(File file){
	    String fileStr = "";
	    String strLineCurrent = "";
		try{
		    // Open the file that is the first 
		    // command line parameter
		    FileInputStream fstream = new FileInputStream(file);
		    // Get the object of DataInputStream
		    DataInputStream in = new DataInputStream(fstream);
		    BufferedReader br = new BufferedReader(new InputStreamReader(in));

		    //Read File Line By Line
		    while ((strLineCurrent = br.readLine()) != null)   {
		      // Print the content on the console
		    	fileStr = fileStr + strLineCurrent + "\n";
		    }
		    //Close the input stream
		    in.close();
		    }catch (Exception e){//Catch exception if any
		      System.err.println("Error: " + e.getMessage());
		    }
		    return fileStr;
	}
	
	/**
	 * Get word from string, splited by specific delimiter
	 * @param str
	 * @param delimiter
	 * @param wordIndex
	 * @return extracted word
	 */
	public static String extractWordFromString(String str, String delimiter, int wordIndex){
		// split string into array
		String [] temp = str.split(delimiter);
		int length = temp.length;
		String result = "";
		try {
			if(length > 0) {
				if(wordIndex == -1)
					wordIndex = length;
				
				if(length >= wordIndex)
					result = temp[wordIndex - 1];
			}
		}
		catch (Exception e){}
		return result;
	}
	
	/**
	 * Format arraylist from string parts, splitted by specified delimiter 
	 * @param line - string line
	 * @param delimiter
	 * @return
	 */
	public static ArrayList<String> splitStringToArrayList(String line, String delimiter) {
		String[] temp = line.split(delimiter);
		ArrayList<String> parts = new ArrayList<String>();
		for(int i = 0; i < temp.length; i++) {
			parts.add(temp[i]);
		}
		return parts;
	}
	
	/**
	 * Trim editor's text
	 * @param text - text to trim
	 * @return trimed text
	 */
	public static StringReader getTextToParse(String text){
		// It's necessary to trim, however since the second time parsing/saving it work not
		// properly in presence of empty lines in the begin of the document
		text = text.trim();
		text = text+'\n';
		return new StringReader(text);
	}

}