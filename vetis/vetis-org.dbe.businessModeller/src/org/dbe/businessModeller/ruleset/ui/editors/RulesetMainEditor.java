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
package org.dbe.businessModeller.ruleset.ui.editors;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.BusinessModellerPlugin;
import org.dbe.businessModeller.XML.XMLDocument;
import org.dbe.businessModeller.XML.XMLElement;
import org.dbe.businessModeller.XML.XMLWrapper;
import org.dbe.businessModeller.enterprise.BusinessModellerDocument;
import org.dbe.businessModeller.enterprise.exchange.ExchangeFactory;
import org.dbe.businessModeller.enterprise.exchange.Exporter;
import org.dbe.businessModeller.ruleset.enterprise.exchange.RulesetExporter;
import org.dbe.businessModeller.ruleset.ui.editors.utils.RulesetRuleMemory;
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.utils.ResourceProvider;
import org.dbe.businessModeller.vetis.VetisBmUtil;
import org.dbe.businessModeller.vocabulary.enterprise.Vocabulary;
import org.dbe.businessModeller.vocabulary.enterprise.grammar.VocabularyLexer;
import org.dbe.businessModeller.vocabulary.enterprise.grammar.VocabularyParser;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.ui.*;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.ide.IDE;


import antlr.RecognitionException;
import antlr.TokenStreamException;

public class RulesetMainEditor extends MultiPageEditorPart implements IResourceChangeListener{

	/** The text editor used in page 0. */
	private RulesetEditor editor;
	private RulesetRuleMemory ruleMemory = null;	

	/** The font chosen in page 1. */
	private Font font;

	/** The text widget used in page 2. */
	private StyledText text;
	

	/** The factorized Exporter */
	private Exporter ruleSetExporter = ExchangeFactory.getExchangeFactory(BusinessModeller.DOCUMENT_RULESET).createExporter();

	
	public RulesetMainEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		BusinessModellerPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getPartService().addPartListener(new IPartListener(){
			public void partActivated(IWorkbenchPart part) {
				if (part.getTitle().toLowerCase().startsWith("rule"))
				{
				  ruleMemory = RulesetRuleMemory.getInstance();
				  if (ruleMemory.isFirstTime()) {
					ruleMemory.setFirstTime(false);
					IProject project = ((IFile) getEditorInput().getAdapter(IFile.class)).getProject();

					try {
						IResource[] rs = project.members();
						for (int i=0;i<rs.length;i++)
						{
							if (rs[i].getType() == IResource.FILE && rs[i].getName().endsWith(".voc"))
							{
								IFile f = (IFile)rs[i];
								InputStream is = f.getContents();
								int c = is.read();					
								StringBuffer fBuffer = new StringBuffer();
								fBuffer.setLength(0);
								do {
									fBuffer.append((char) c);
									c= is.read();
								} while (c != ICharacterScanner.EOF);
								String rowString = fBuffer.toString();
								
								// get language document and keywords, added 2009 06 16
							 	XMLWrapper wrapper = new XMLWrapper();
								XMLDocument doc = wrapper.getLanguageDocument();
								XMLElement keywords = doc.getElement("keywords");
								
								try {
									VocabularyLexer lexer = new VocabularyLexer(BusinessModellerUtils.getTextToParse(rowString), keywords);
									VocabularyParser parser = new VocabularyParser(lexer);
									parser.vocabulary();
								} 
								catch (RecognitionException e) {e.printStackTrace();} 
								catch (TokenStreamException tse) {tse.printStackTrace();}
							}
						}						
				    } 
					catch (CoreException e1) {e1.printStackTrace();}
					catch (IOException e) {e.printStackTrace();}
				  }
					
					try {
						if (isSaveOnCloseNeeded())
						{
							String editorText = editor.getDocumentProvider().getDocument(editor.getEditorInput()).get();
							editor.getDocumentProvider().getDocument(editor.getEditorInput()).set(editorText);
						}
						else 
							editor.doSetInput(getEditorInput());
						editor.getDocumentProvider().getDocument(editor.getEditorInput()).addPrenotifiedDocumentListener(new IDocumentListener(){
							public void documentAboutToBeChanged(DocumentEvent event) {
								ruleMemory.setUpdateFoldingStructure(false);
								ruleMemory.setEndOfDocument(false);
								ruleMemory.setCounter(0);
								ruleMemory.setCountable(false);
							}

							public void documentChanged(DocumentEvent event) {
							}		
						});
					} catch (Exception e) {	}
				}
			}

			public void partBroughtToTop(IWorkbenchPart part) {
			}

			public void partClosed(IWorkbenchPart part) {
			}

			public void partDeactivated(IWorkbenchPart part) {
			}

			public void partOpened(IWorkbenchPart part) {
			}			
		});
	}
	/**
	 * Creates page 0 of the multi-page editor,
	 * which contains a text editor.
	 */
	void createPage0() {
		try {
			editor = new RulesetEditor();
			
			Vocabulary vocabulary = (Vocabulary)BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY); 
			
			if(vocabulary.getEntries().size() == 0) {
				// try to parse vocabulary manually
				// get language document and keywords
			 	XMLWrapper wrapper = new XMLWrapper();
				XMLDocument doc = wrapper.getLanguageDocument();
				XMLElement keywords = doc.getElement("keywords");
				
				File vocFile = new File(((FileEditorInput) getEditorInput()).getPath().toOSString().replace(".rules", ".voc")); 
				
				if(vocFile.exists()) {
					String vocCont = BusinessModellerUtils.readFile(vocFile);
					
					VocabularyLexer lexer = new VocabularyLexer(BusinessModellerUtils.getTextToParse(vocCont), keywords);
					VocabularyParser parser = new VocabularyParser(lexer);
					try {
						parser.vocabulary();
					} catch (RecognitionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (TokenStreamException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			int index = addPage(editor, getEditorInput());
			parse();
			setPageText(index, editor.getTitle());		  		
			
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(), "Error creating nested text editor", null, e.getStatus());
		}
	}
	
	/**
	 * Creates page 2 of the multi-page editor,
	 * which shows the sorted text.
	 */
	void createPage2() {
		Composite composite = new Composite(getContainer(), SWT.NONE);
		FillLayout layout = new FillLayout();
		composite.setLayout(layout);
		text = new StyledText(composite, SWT.H_SCROLL | SWT.V_SCROLL);
		text.setEditable(false);

		int index = addPage(composite);
		setPageText(index, "XMI Schema");
	}
	
	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		createPage0();
		createPage2();
	}
	
	public void parse() {
		RulesetExporter exporter = new RulesetExporter();
		exporter.setRulesFile(new File(((FileEditorInput) getEditorInput()).getPath().toOSString()));
		exporter.formatRuleSetEntriesArray();
		
		try {
			ruleMemory.setUpdateFoldingStructure(true);
			ruleMemory.setCounter(0);
			ruleMemory.setCountable(true);
		}
		catch(NullPointerException e){}
		editor.updateOutline();
	}
	
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this 
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}
	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		try {
			ruleMemory.setUpdateFoldingStructure(true);
			ruleMemory.setCounter(0);
			ruleMemory.setCountable(true);
		}
		catch(NullPointerException e){}
		getEditor(0).doSave(monitor);
		parse();
	}
	/**
	 * Saves the multi-page editor's document as another file.
	 * Also updates the text for page 0's tab, and updates this multi-page editor's input
	 * to correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
	}
	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
		
		setPartName(editorInput.getName().substring(0,editorInput.getName().lastIndexOf('.')) + " - Ruleset");
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}
	/**
	 * Calculates the contents of page 2 when the it is activated.
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		if (newPageIndex == 0) {
			//parse();
		}
		if (newPageIndex == 1) {
			// TODO implement sbvr file saving in plugin temp directory
			int lastSep = ((FileEditorInput) getEditorInput()).getPath().toOSString().lastIndexOf(System.getProperty("file.separator"));				
			String sbvrFileInWorkspace = ((FileEditorInput) getEditorInput()).getPath().toOSString().substring(0, lastSep + 1) + "sbvr.xmi";
			File sbvrTempFile = new File(sbvrFileInWorkspace);
			
			VetisBmUtil.exportRulesToXmi(new File(((FileEditorInput) getEditorInput()).getPath().toOSString().replace(".rules", ".voc")), new File(((FileEditorInput) getEditorInput()).getPath().toOSString()), sbvrTempFile /*ResourceProvider.getFile("", "temp/sbvr.xmi")*/);			
			ruleSetExporter.setXMIFile(sbvrTempFile /*ResourceProvider.getFile("", "temp/sbvr.xmi")*/);
			String xmiFileContent = ruleSetExporter.readXMIFile();
			text.setText(xmiFileContent);
			sbvrTempFile.delete();
		}
	}
	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
			Display.getDefault().asyncExec(new Runnable(){
				public void run(){
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i<pages.length; i++){
						if(((FileEditorInput)editor.getEditorInput()).getFile().getProject().equals(event.getResource())){
							IEditorPart editorPart = pages[i].findEditor(editor.getEditorInput());
							pages[i].closeEditor(editorPart,true);
						}
					}
				}            
			});
		}
	}
	
	/**
	 * Sets the font related data to be applied to the text in page 2.
	 */
	void setFont() {
		FontDialog fontDialog = new FontDialog(getSite().getShell());
		fontDialog.setFontList(text.getFont().getFontData());
		FontData fontData = fontDialog.open();
		if (fontData != null) {
			if (font != null)
				font.dispose();
			font = new Font(text.getDisplay(), fontData);
			text.setFont(font);
		}
	}
	
	/**
	 * Sorts the words in page 0, and shows them in page 2.
	 */
	void sortWords() {

		String editorText =
			editor.getDocumentProvider().getDocument(editor.getEditorInput()).get();

		StringTokenizer tokenizer =
			new StringTokenizer(editorText, " \t\n\r\f!@#\u0024%^&*()-_=+`~[]{};:'\",.<>/?|\\");
		ArrayList editorWords = new ArrayList();
		while (tokenizer.hasMoreTokens()) {
			editorWords.add(tokenizer.nextToken());
		}

		Collections.sort(editorWords, Collator.getInstance());
		StringWriter displayText = new StringWriter();
		for (int i = 0; i < editorWords.size(); i++) {
			displayText.write(((String) editorWords.get(i)));
			displayText.write(System.getProperty("line.separator"));
		}
		text.setText(displayText.toString());
	}
	
	public Object getAdapter(Class required) {
		if (IContentOutlinePage.class.equals(required))
			return editor.getAdapter(required);
		return super.getAdapter(required);
	}

	/**
	 * @return Restituisce editor.
	 */
	public RulesetEditor getEditor() {
		return editor;
	}
}
