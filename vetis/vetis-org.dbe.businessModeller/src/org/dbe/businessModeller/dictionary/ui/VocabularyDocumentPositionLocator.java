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
 * Creato il 16-feb-2006
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.dictionary.ui;

import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;

public class VocabularyDocumentPositionLocator {

	private IDocument document;
	private VocabularyEntry entry;
	private Position entryPosition;
	private int positionOfFirstLabel;
	private int positionOfLastLabel;
	private int positionOfLastUsedChar;
	
	public VocabularyDocumentPositionLocator
			(IDocument document, VocabularyEntry entry, Position entryPosition){
		this.document = document;
		this.entry = entry;
		this.entryPosition = entryPosition;
		calculate();
	}
	
	public VocabularyDocumentPositionLocator(IDocument document){
		this.document = document;
		calculate();
	}
	
	private void calculate(){
		// TODO to verify
		calculateFirstLabel();
		calculateLastLabel();
		calculateLastUsedChar();
	}

	private void calculateFirstLabel(){
		positionOfFirstLabel = entryPosition.getOffset()+entry.getPrimaryRepresentation().toString().length();
	}
	
	private void calculateLastLabel(){
		try {
			for (int n = entryPosition.getOffset()+entryPosition.getLength()-1; n >= 0; n--) {
				char c = document.getChar(n);
				// BusinessModellerUtils.showMessage(c+"");
				if (Character.isLetterOrDigit(c) ){ //|| n==0){
					positionOfLastLabel = n+1;
					// BusinessModellerUtils.showMessage("Last entry char: "+document.getChar(positionOfLastUsedChar)+"-");
					break;
				}
			}
		} catch (BadLocationException x) {
			BusinessModellerUtils.showMessage(x.toString());
			x.printStackTrace();
			positionOfLastLabel = -1;
		}
	}
	
	private void calculateLastUsedChar(){
		try {
			for (int n = document.getLength()-1; n >= 0; n--) {
				char c = document.getChar(n);
				// BusinessModellerUtils.showMessage(c+"");
				if (Character.isLetterOrDigit(c) ){ //|| n==0){
					positionOfLastUsedChar = n+1;
					//BusinessModellerUtils.showMessage("Last used char: "+document.getChar(positionOfLastUsedChar)+"-");
					break;
				}
			}
		} catch (BadLocationException x) {
			BusinessModellerUtils.showMessage(x.toString());
			x.printStackTrace();
			positionOfLastUsedChar = -1;
		}
	}
	
	public int getPositionOfLastUsedChar() {
		return positionOfLastUsedChar;
	}

	public int getPositionOfFirstLabel() {
		return positionOfFirstLabel;
	}

	public int getPositionOfLastLabel() {
		return positionOfLastLabel;
	}
}
