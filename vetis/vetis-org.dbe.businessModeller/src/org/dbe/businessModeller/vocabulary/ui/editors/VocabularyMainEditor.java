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
package org.dbe.businessModeller.vocabulary.ui.editors;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.BusinessModellerPlugin;
import org.dbe.businessModeller.XML.XMLDocument;
import org.dbe.businessModeller.XML.XMLElement;
import org.dbe.businessModeller.XML.XMLWrapper;
import org.dbe.businessModeller.enterprise.BusinessModellerDocument;
import org.dbe.businessModeller.enterprise.exchange.ExchangeFactory;
import org.dbe.businessModeller.enterprise.exchange.Exporter;
import org.dbe.businessModeller.headfile.HeadFileEditor;
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.utils.ResourceProvider;
import org.dbe.businessModeller.vetis.VetisBmUtil;
import org.dbe.businessModeller.vocabulary.enterprise.Vocabulary;
import org.dbe.businessModeller.vocabulary.enterprise.grammar.VocabularyLexer;
import org.dbe.businessModeller.vocabulary.enterprise.grammar.VocabularyParser;
import org.dbe.businessModeller.vocabulary.ui.editors.utils.VocabularyRuleMemory;
import org.dbe.businessModeller.vocabulary.utils.VocabularyUtilities;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.Position;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.*;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.ide.IDE;

public class VocabularyMainEditor extends MultiPageEditorPart implements IResourceChangeListener{

	private int currentPage;
	
	/** The text editors used. */
	private VocabularyEditor voc_editor;
	private HeadFileEditor head_editor;
	/** The text editorInputs used. */
	private FileEditorInput voc_fileEditorInput;
	private FileEditorInput head_fileEditorInput;
	/** The text widgets used. */
	private StyledText xmiText;
	/** The factorized Exporter */
	private Exporter exporter = ExchangeFactory.getExchangeFactory(BusinessModeller.DOCUMENT_VOCABULARY).createExporter();
	/** The parsing's utilities */
	private VocabularyRuleMemory ruleMemory = null;	
	/** Page indexs */
	private int _PAG_VOC_EDITOR; 
	private int _PAG_HEAD_EDITOR;
	/** HeadFile masked page */
	private final int _NUM_PARAMETRI_HEAD = VocabularyUtilities.getVocabularyHeadCaption().size(); 
	private HashMap headFields;
	
	public VocabularyMainEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		BusinessModellerPlugin.getDefault().getWorkbench().
			getActiveWorkbenchWindow().getPartService().
			addPartListener(new IPartListener(){

					public void partActivated(IWorkbenchPart part) {
						ruleMemory.setParsed(false);
					}
		
					public void partBroughtToTop(IWorkbenchPart part) {
					}
		
					public void partClosed(IWorkbenchPart part) {
						ruleMemory.setParsed(false);
					}
		
					public void partDeactivated(IWorkbenchPart part) {
					}
		
					public void partOpened(IWorkbenchPart part) {
					}
					
				});
		voc_editor = new VocabularyEditor(this);
		head_editor = new HeadFileEditor();
	}
	
	/**
	 * Create vacabulary editor page
	 */
	private void createPage0() {
		try {			
			_PAG_VOC_EDITOR = addPage(voc_editor, voc_fileEditorInput);
			doCalculatePosition(voc_editor.getDocumentProvider().getDocument(voc_editor.getEditorInput()));
			setPageText(_PAG_VOC_EDITOR, voc_editor.getTitle());
			
			ruleMemory = VocabularyRuleMemory.getInstance();
	
			voc_editor.getDocumentProvider().getDocument(voc_editor.getEditorInput()).addDocumentListener(new IDocumentListener(){
				public void documentAboutToBeChanged(DocumentEvent event) {
					ruleMemory.setParsed(false);
					ruleMemory.setTokenUndefined(false);
					ruleMemory.setCountable(false);
				}

				public void documentChanged(DocumentEvent event) {
				}			
			});
		} catch (PartInitException e) {
			ErrorDialog.openError(
				getSite().getShell(),
				"Error creating nested text editor",
				null,
				e.getStatus());
		}
	}
	
	private void createPage1() {
		headFields = new HashMap(_NUM_PARAMETRI_HEAD);
		
		Composite composite = new Composite(getContainer(), SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		layout.numColumns = 2;
	
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);
		
		Iterator iter = VocabularyUtilities.getVocabularyHeadCaption().iterator();
		while(iter.hasNext()){
			String txt_label = iter.next().toString();
			Label thisLabel = new Label(composite, SWT.NONE);
			thisLabel.setText(txt_label+":");
			Text thisText = new Text(composite, SWT.BORDER);
			thisText.addFocusListener(new FocusListener(){
				String oldText;	
				public void focusGained(FocusEvent e){
					oldText = ((Text)e.widget).getText();
				}
				
				public void focusLost(FocusEvent e){
					String newText = ((Text)e.widget).getText();
					if (!newText.equals(oldText)){
						VocabularyMainEditor.this.refreshTestoHeadFile();
					}
				}
			});
			thisText.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true, false));
			headFields.put(txt_label,thisText);
		}
		int index = addPage(composite);
		setPageText(index, "Header");
	}
	
	/**
	 * Create XMI generation page
	 */
	private void createPage2() {
		Composite composite = new Composite(getContainer(), SWT.NONE);
		FillLayout layout = new FillLayout();
		layout.marginWidth=4;
		composite.setLayout(layout);
		xmiText = new StyledText(composite, SWT.H_SCROLL | SWT.V_SCROLL);
		xmiText.setEditable(false);

		int index = addPage(composite);
		setPageText(index, "XMI Schema");
	}
	
	private void createPage4() {
		try {
			_PAG_HEAD_EDITOR = addPage(head_editor, head_fileEditorInput);
			setPageText(_PAG_HEAD_EDITOR, head_editor.getTitle());
//			IEditorPart editor = BusinessModellerPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(head_FileEditorInput, "org.dbe.businessModeller.vocabulary.ui.editors.VocabularyMainEditor");
//			int index = addPage(editor, head_FileEditorInput);
			} catch (PartInitException e) {
			ErrorDialog.openError(
				getSite().getShell(),
				"Error creating nested text editor",
				null,
				e.getStatus());
		}
	}
	
	private void popolaParametriHead(){
		String  headFileText = head_editor.getDocumentProvider().getDocument(head_fileEditorInput).get();
		StringTokenizer token = new StringTokenizer(headFileText, "\n\r", false);
		while(token.hasMoreTokens()){
			String riga = token.nextToken();
			int pos = riga.indexOf(':');
			if(pos<0){
				((Text)headFields.get("Name")).setText(riga);
				continue;
			}
			String key = riga.substring(0,pos).trim();
			String value = riga.substring(pos+1).trim();
			((Text)headFields.get(key)).setText(value);
		}
	}
	
	private void refreshTestoHeadFile(){ 
		StringBuffer testo = new StringBuffer(( (Text)headFields.get("Name")).getText() );
		Iterator iter = VocabularyUtilities.getVocabularyHeadCaption().iterator();
		while (iter.hasNext()){
			String caption = iter.next().toString();
			if(caption.equals("Name"))continue;
			testo = testo.append("\n\t"
					+ caption
					+ ": "
					+ ((Text)headFields.get(caption)).getText()
			);
		}
		String testoHeadFile = testo.toString();
		IDocument head_document = head_editor.getDocumentProvider().getDocument(head_fileEditorInput); 
		if (!head_document.get().equals(testoHeadFile)){
			head_document.set(testoHeadFile);
		}
	}
	
	/**
	 * Parse vocabulary
	 */
	public void parse(){
		try{
			Vocabulary vocabulary = (Vocabulary)BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
			vocabulary.setName( ((Text)headFields.get("Name")).getText());
			vocabulary.setDescription( ((Text)headFields.get("Description")).getText());
			vocabulary.setNote( ((Text)headFields.get("Note")).getText());
			vocabulary.setSource( ((Text)headFields.get("Source")).getText());
			vocabulary.setSpeechCommunity( ((Text)headFields.get("Speech Community")).getText());
			vocabulary.setLanguage( ((Text)headFields.get("Language")).getText());
			//vocabulary.setIncludedVocabulary( ((Text)headFields.get("Included Vocabulary")).getText());
			if (!ruleMemory.isParsed()) {
				IDocument document = voc_editor.getDocumentProvider().getDocument(voc_editor.getEditorInput());
				String editorText = document.get();
				// get language document and keywords
			 	XMLWrapper wrapper = new XMLWrapper();
				XMLDocument doc = wrapper.getLanguageDocument();
				XMLElement keywords = doc.getElement("keywords");
				
				VocabularyLexer lexer = new VocabularyLexer(BusinessModellerUtils.getTextToParse(editorText), keywords);
				VocabularyParser parser = new VocabularyParser(lexer);
				parser.vocabulary();
				
				IFile file = voc_fileEditorInput.getFile();
				file.deleteMarkers(IMarker.PROBLEM,true,IResource.DEPTH_INFINITE);
				
				doCalculatePosition(document);
				if (ruleMemory.isParsed())
					ruleMemory.setUpdateFoldingStructure(true);
				ruleMemory.setCounter(0);
				ruleMemory.setCountable(true);
				ArrayList posis = new ArrayList();
				HashMap entryPositions = BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY).getEntryPosition();
		        Iterator positions = entryPositions.values().iterator();
		        int offset=0;
		        int length=0; 
		        while (positions.hasNext())
		        {   
		        	Object aPosition = positions.next();
	        	   	if (aPosition instanceof Position)
	        	   	{
	        		   	Position position = (Position)aPosition;
	        	   	
	        		   	offset = position.getOffset();
	           	   		length = position.getLength();
	           	   		posis.add(new Position(offset, length));
	        	   	}
	           	}
		        voc_editor.updateFoldingStructure(posis);
				ruleMemory.setUpdateFoldingStructure(false);
				voc_editor.updateOutline();
				ruleMemory.setParsed(true);
			}
		}
		catch (Exception e) {
			ruleMemory.setParsed(false);
		}            			
	}
	
	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		createPage0();
		createPage2();
		createPage1();		
		createPage4();
		popolaParametriHead();
		setActivePage(currentPage);		
	}
	
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}
	
	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		parse();
		if(getEditor(_PAG_VOC_EDITOR).isDirty())
			getEditor(_PAG_VOC_EDITOR).doSave(monitor);
		if(getEditor(_PAG_HEAD_EDITOR).isDirty())
			getEditor(_PAG_HEAD_EDITOR).doSave(monitor);
	}

	/**
	 * Save as action
	 */
	public void doSaveAs() {
		getEditor(_PAG_VOC_EDITOR).doSaveAs();
		getEditor(_PAG_HEAD_EDITOR).doSaveAs();
	}
	
	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(_PAG_VOC_EDITOR);
		IDE.gotoMarker(getEditor(_PAG_VOC_EDITOR), marker);
	}
	
	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		
		organizeEditorInput(editorInput);
		super.init(site, editorInput);
		
		setPartName(voc_fileEditorInput.getName().substring(0,voc_fileEditorInput.getName().lastIndexOf('.')) + " - Vocabulary");
	}
	
	private void organizeEditorInput(IEditorInput editorInput){
		String editorInputName = editorInput.getName();
		IFile inputFile = (IFile) editorInput.getAdapter(IFile.class);
		IProject inputProject = inputFile.getProject();
		if(BusinessModellerUtils.isHeadFile(editorInputName)){
			IFile linkedFile = inputProject.getFile(BusinessModellerUtils.getFileNameFromHead(editorInputName));
			head_fileEditorInput = (FileEditorInput)editorInput;
			voc_fileEditorInput = new FileEditorInput(linkedFile);
			currentPage = 2;
		}else{
			IFile linkedFile = inputProject.getFile(BusinessModellerUtils.getHeadFileName(editorInputName));
			head_fileEditorInput = new FileEditorInput(linkedFile);
			voc_fileEditorInput = (FileEditorInput)editorInput;
			currentPage = 0;
		}
	}
	
	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		// It isn't allowed to save a file with a different name (duplicating the vocabulary) 
		return false;
	}
	
	/**
	 * page change actions
	 * @param newPageIndex - index of page opened
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);

		/** Calling when passing from a page to newPageIndex */
		switch(newPageIndex){
			case 0:
				parse();
				break;
			case 1:
				// TODO implement sbvr file saving in plugin temp directory
				int lastSep = voc_fileEditorInput.getPath().toOSString().lastIndexOf(System.getProperty("file.separator"));				
				String sbvrFileInWorkspace = voc_fileEditorInput.getPath().toOSString().substring(0, lastSep + 1) + "sbvr.xmi";
				File sbvrTempFile = new File(sbvrFileInWorkspace);
				
				VetisBmUtil.exportVocabToXmi(new File(voc_fileEditorInput.getPath().toOSString()), sbvrTempFile/*ResourceProvider.getFile("", "temp/sbvr.xmi")*/);				
				exporter.setXMIFile(sbvrTempFile/*ResourceProvider.getFile("", "temp/sbvr.xmi")*/);
				String xmiFileContent = exporter.readXMIFile();
				xmiText.setText(xmiFileContent);
				sbvrTempFile.delete();
				break;
			default:
				break;
		}
		currentPage = newPageIndex;
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
						if(((FileEditorInput)voc_editor.getEditorInput()).getFile().getProject().equals(event.getResource())){
							IEditorPart editorPart = pages[i].findEditor(voc_editor.getEditorInput());
							pages[i].closeEditor(editorPart,true);
						}
						if(((FileEditorInput)head_editor.getEditorInput()).getFile().getProject().equals(event.getResource())){
							IEditorPart editorPart = pages[i].findEditor(head_editor.getEditorInput());
							pages[i].closeEditor(editorPart,true);
						}
					}
				}
			});
		}
	}
	
	public Object getAdapter(Class required) {
		if (IContentOutlinePage.class.equals(required))
			return voc_editor.getAdapter(required);
		return super.getAdapter(required);
	}
	
	/**
	 * @return Resturn voc_editor.
	 */
	public VocabularyEditor getVocabularyEditor() {
		return voc_editor;
	}
	
	private void doCalculatePosition(IDocument document){
		Vocabulary vocabulary = (Vocabulary)BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
		HashMap oldEntryPosition = vocabulary.getEntryPosition();
		if(oldEntryPosition==null
				|| oldEntryPosition.size()<1 
				|| !oldEntryPosition.keySet().iterator().next().getClass().equals(Long.class)) return;
		HashMap newEntryPosition = VocabularyUtilities.calculatePositions(oldEntryPosition, document);
		vocabulary.setEntryPosition(newEntryPosition);	
	}
}
