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
 * Creato il 10-gen-2006
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.dictionary.ui;

import org.dbe.businessModeller.BusinessModellerPlugin;
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.dbe.businessModeller.vocabulary.ui.editors.views.outline.VocabularyTreePart;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.texteditor.ITextEditor;

public class WordNetGeneralRequester{

	private ISelectionProvider selectionProvider;
	private ITextEditor textEditor;
	private String popupTitle = "Ask to WordNet";
	private String popupNoInfoMessage = "No available info for this Item";
	private IContentProvider contentProvider;
	private WordNetContentInserter contentInserter;
	private AskingDialog askingDialog; 

	/**
	 * @return Restituisce contentProvider.
	 */
	public IContentProvider getContentProvider() {
		return contentProvider;
	}

	/**
	 * @param Imposta il valore di contentProvider.
	 */
	public void setContentProvider(IContentProvider contentProvider) {
		this.contentProvider = contentProvider;
	}

	/**
	 * @return Restituisce popupNoInfoMessage.
	 */
	public String getPopupNoInfoMessage() {
		return popupNoInfoMessage;
	}

	/**
	 * @param Imposta il valore di popupNoInfoMessage.
	 */
	public void setPopupNoInfoMessage(String popupNoInfoMessage) {
		this.popupNoInfoMessage = popupNoInfoMessage;
	}

	/**
	 * @return Restituisce popupTitle.
	 */
	public String getPopupTitle() {
		return popupTitle;
	}

	/**
	 * @param Imposta il valore di popupTitle.
	 */
	public void setPopupTitle(String popupTitle) {
		this.popupTitle = popupTitle;
	}

	/**
	 * @return Restituisce selectionProvider.
	 */
	public ISelectionProvider getSelectionProvider() {
		return selectionProvider;
	}

	/**
	 * @param Imposta il valore di selectionProvider.
	 */
	public void setSelectionProvider(ISelectionProvider selectionProvider) {
		this.selectionProvider = selectionProvider;
	}

	/**
	 * @return Restituisce textEditor.
	 */
	public ITextEditor getTextEditor() {
		return textEditor;
	}

	/**
	 * @param Imposta il valore di textEditor.
	 */
	public void setTextEditor(ITextEditor textEditor) {
		this.textEditor = textEditor;
	}

	/**
	 * @return Restituisce contentInserter.
	 */
	public WordNetContentInserter getContentInserter() {
		return contentInserter;
	}

	/**
	 * @param Imposta il valore di contentInserter.
	 */
	public void setContentInserter(WordNetContentInserter contentInserter) {
		this.contentInserter = contentInserter;
	}
	
	//public void ask(int operation) {
	public void ask() {
		ISelection selection= selectionProvider.getSelection();
		if (selection.isEmpty())
			textEditor.resetHighlightRange();
		else {
			try{
				Object obj = ((IStructuredSelection) selection).getFirstElement();
				VocabularyTreePart vocabularyTreePart = (VocabularyTreePart)obj;
				Object content = vocabularyTreePart.getContent();
				if(VocabularyEntry.class.equals(content.getClass().getSuperclass())){
					VocabularyEntry thisEntry = (VocabularyEntry)content;
					Position thisEntryPosition = vocabularyTreePart.getPosition();
					askingDialog = new AskingDialog(BusinessModellerPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell(), contentProvider);
					askingDialog.setRepresentation(thisEntry.getPrimaryRepresentation().toString());
					askingDialog.create();
					askingDialog.open();
					DictionaryWordTO dictionaryWord = askingDialog.getSelectedDictionaryWord();
					if (dictionaryWord==null)return;
					IDocument document = textEditor.getDocumentProvider().getDocument(textEditor.getEditorInput());
					VocabularyDocumentPositionLocator positionLocator = new VocabularyDocumentPositionLocator(document, thisEntry, thisEntryPosition);
					contentInserter.prepareInserter(document, thisEntry, dictionaryWord, positionLocator);
					contentInserter.insert();
				}else{
					BusinessModellerUtils.showMessage("None selected Vocabulary entry", popupTitle);
				}
			}catch(BadLocationException x){
				x.printStackTrace();
			}
			catch(Exception x){
				BusinessModellerUtils.showMessage(popupNoInfoMessage, popupTitle);
			}
		}
	}

// METODO DA CAMBIARE PER INCOMPLETEZZA
//	public void ask(int operation) {
//		ISelection selection= selectionProvider.getSelection();
//		if (selection.isEmpty())
//			textEditor.resetHighlightRange();
//		else {
//			try{
//				Object obj = ((IStructuredSelection) selection).getFirstElement();
//				VocabularyTreePart vocabularyTreePart = (VocabularyTreePart)obj;
//				Object content = vocabularyTreePart.getContent();
//				if(VocabularyEntry.class.equals(content.getClass().getSuperclass())){
//					VocabularyEntry thisEntry = (VocabularyEntry)content;
//					askingDialog = new AskingDialog(BusinessModellerPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell(), contentProvider);
//					askingDialog.setRepresentation(thisEntry.getPrimaryRepresentation().toString());
//					askingDialog.create();
//					askingDialog.open();
//					DictionaryWordTO dictionaryWord = askingDialog.getSelectedDictionaryWord();
//					if (dictionaryWord==null)return;
//					IDocument document = textEditor.getDocumentProvider().getDocument(textEditor.getEditorInput());
//					Position thisPosition = vocabularyTreePart.getPosition();
//					int posFirstChar = thisPosition.getOffset();
//					String lineSeparator = System.getProperty("line.separator");
//					posFirstChar += thisEntry.getPrimaryRepresentation().toString().length();
//					String textToInsert = "";
//					switch (operation) {
//					case WordNetGeneralAsker.LEMMA:
//						textToInsert = dictionaryWord.getLemma();
//						break;
//					case WordNetGeneralAsker.DEFINITION:
//						textToInsert = dictionaryWord.getDefinition();
//						break;
//					default:
//						textToInsert = dictionaryWord.toString();
//						break;
//					}
//					textToInsert = textInEditor.concat(textToInsert);
//					textToInsert = lineSeparator.concat(textToInsert);
//					document.replace(posFirstChar, 0, textToInsert);
//				}else{
//					//BusinessModellerUtils.showMessage(popupNoInfoMessage, popupTitle);
//					BusinessModellerUtils.showMessage("None selected Vocabulary entry", popupTitle);
//				}
//			}catch(BadLocationException x){
//				x.printStackTrace();
//			}
//			catch(Exception x){
//				BusinessModellerUtils.showMessage(popupNoInfoMessage, popupTitle);
////				x.printStackTrace();
//			}
//		}
//	}
	
/// METODO CHE NON FUNZIONAVA CON RIGO VUOTO
//	public void ask(int operation) {
//		ISelection selection= selectionProvider.getSelection();
//		if (selection.isEmpty())
//			textEditor.resetHighlightRange();
//		else {
//			try{
//				Object obj = ((IStructuredSelection) selection).getFirstElement();
//				VocabularyTreePart vocabularyTreePart = (VocabularyTreePart)obj;
//				Object content = vocabularyTreePart.getContent();
//				if(VocabularyEntry.class.equals(content.getClass().getSuperclass())){
//					VocabularyEntry thisEntry = (VocabularyEntry)content;
//					askingDialog = new AskingDialog(BusinessModellerPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell(), contentProvider);
//					askingDialog.setRepresentation(thisEntry.getPrimaryRepresentation().toString());
//					askingDialog.create();
//					askingDialog.open();
//					DictionaryWordTO dictionaryWord = askingDialog.getSelectedDictionaryWord();
//					if (dictionaryWord==null)return;
//					IDocument document = textEditor.getDocumentProvider().getDocument(textEditor.getEditorInput());
//					Position thisPosition = vocabularyTreePart.getPosition();
////					int posFirstChar = thisPosition.getOffset();
//					int posLastChar = thisPosition.getOffset()+thisPosition.getLength();
////					int firstRow = document.getLineOfOffset(posFirstChar);
////					int lastRow = document.getLineOfOffset(posLastChar);
//					int documentLength = document.getLength();
//					String lineSeparator = System.getProperty("line.separator");
//					//	BusinessModellerUtils.showMessage(firstRow+"");
//					//	BusinessModellerUtils.showMessage(lastRow+"");
//					String textToInsert = "";
//					switch (operation) {
//					case WordNetGeneralAsker.LEMMA:
//						textToInsert = dictionaryWord.getLemma();
//						break;
//					case WordNetGeneralAsker.DEFINITION:
//						textToInsert = dictionaryWord.getDefinition();
//						break;
//					default:
//						textToInsert = dictionaryWord.toString();
//						break;
//					}
//					textToInsert = textInEditor.concat(textToInsert);
//					if(posLastChar==documentLength)
//						textToInsert = lineSeparator.concat(textToInsert);
//					else
//						textToInsert = textToInsert.concat(lineSeparator);
//					document.replace(posLastChar, 0, textToInsert);
//				}else{
//					BusinessModellerUtils.showMessage(popupNoInfoMessage, popupTitle);
//				}
//			}catch(BadLocationException x){
//				x.printStackTrace();
//			}
//			catch(Exception x){
//				BusinessModellerUtils.showMessage(popupNoInfoMessage, popupTitle);
////				x.printStackTrace();
//			}
//		}
//	}

}
