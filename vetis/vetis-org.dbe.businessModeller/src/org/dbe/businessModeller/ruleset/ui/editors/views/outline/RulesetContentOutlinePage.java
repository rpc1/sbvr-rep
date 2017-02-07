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
package org.dbe.businessModeller.ruleset.ui.editors.views.outline;

import org.dbe.businessModeller.utils.ResourceProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

public class RulesetContentOutlinePage extends ContentOutlinePage {

	private TreeViewer viewer;
	private IDocumentProvider documentProvider;
	private ITextEditor textEditor;
	private IEditorInput fInput;
	private Action alphabeticallySortAction;

	private RulesetContentProvider contentProvider;

	
	// ruleset insert action
	private RuleSetInsertAction rulesetInsertAction;
	
	/**
	 * Constructor
	 * @param documentProvider
	 * @param textEditor
	 */
	public RulesetContentOutlinePage(IDocumentProvider documentProvider, ITextEditor textEditor) {
		super();
		this.documentProvider = documentProvider;
		this.textEditor = textEditor;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.views.contentoutline.ContentOutlinePage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		super.createControl(parent);
		contentProvider = new RulesetContentProvider();
		contentProvider.setDocumentProvider(documentProvider);
		TreeViewer viewer= getTreeViewer();
		viewer.setContentProvider(contentProvider);
		viewer.setLabelProvider(new RulesetContentLabelProvider());
		viewer.addSelectionChangedListener(this);
		viewer.setInput(getSite());
		if (fInput != null)viewer.setInput(fInput);
		makeActions();
		hookContextMenu();
		contributeToActionBars();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.views.contentoutline.ContentOutlinePage#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
	 */
	public void selectionChanged(SelectionChangedEvent event) {
		super.selectionChanged(event);
		textEditor.resetHighlightRange();
		ISelection selection= event.getSelection();
		if (selection.isEmpty())
			textEditor.resetHighlightRange();
		else {
			
			Object obj = ((IStructuredSelection) selection).getFirstElement();
			RulesetTreePart vocabularyTreePart = (RulesetTreePart)obj;
			int start= vocabularyTreePart.getPosition().getOffset();
			int length= vocabularyTreePart.getPosition().getLength();
			if(start==0 && length==0){
				textEditor.resetHighlightRange();
			}else{
				try {
					textEditor.setHighlightRange(start, length, true);
				} catch (IllegalArgumentException x) {
					textEditor.resetHighlightRange();
				}	
			}
		}
	}
	
	/**
	 * Input setter
	 * @param input
	 */
	public void setInput(IEditorInput input) {
		fInput = input;
	}

	/**
	 * Update ouline page
	 */
	public void update() {
		viewer = getTreeViewer();	
		if (viewer != null) {
			Control control= viewer.getControl();
			if (control != null && !control.isDisposed()) {
				control.setRedraw(false);
				viewer.setInput(fInput);
				viewer.collapseAll();
				control.setRedraw(true);
			}
		}
	}
	
	/**
	 * Define the view action
	 */
	private void makeActions() {
		alphabeticallySortAction = new Action("sort", IAction.AS_CHECK_BOX) {
			public void run() {
				boolean sorting = isChecked();
				setChecked(sorting);
				contentProvider.setAlphabeticallySorting(sorting);
				update();
			}
		};
		alphabeticallySortAction.setText("Sort...");
		alphabeticallySortAction.setToolTipText("Sort rules alphabetically");
		try{
			alphabeticallySortAction.setImageDescriptor(ResourceProvider.
						getImageDescriptor("alph_sorting.gif"));
		}catch(Exception ex){
			ex.printStackTrace();
			alphabeticallySortAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
					getImageDescriptor(ISharedImages.IMG_OBJ_ELEMENT));
		}
		rulesetInsertAction = new RuleSetInsertAction();
	}
	
	/**
	 * Define a menu controller
	 */
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		Menu menu = new Menu(getControl().getShell(), SWT.POP_UP);
		getControl().setMenu(menu);
		fillContextMenu(menu);
	}
	
	/**
	 * Action bar contributor
	 */
	private void contributeToActionBars() {
		IActionBars bars = getSite().getActionBars();
		fillLocalToolBar(bars.getToolBarManager());
	}
	
	/**
	 * Tool bar filler
	 * @param manager
	 */
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(alphabeticallySortAction);
	}
	
	/**
	 * Context menu filler
	 * @param menu
	 */
	private void fillContextMenu(Menu menu){
		MenuItem newRulesetTop = new MenuItem(menu, SWT.CASCADE);
		newRulesetTop.setText("Add new ruleset to top");
		newRulesetTop.addSelectionListener
		(
			new SelectionListener() {
					public void widgetSelected(SelectionEvent event) {
						rulesetInsertAction.insertNewRuleset(0, 9, textEditor, "- Ruleset\n\n");
					}
					
					public void widgetDefaultSelected(SelectionEvent event) {}
			}
		);
		
		MenuItem newRulesetBottom = new MenuItem(menu, SWT.CASCADE);
		newRulesetBottom.setText("Add new ruleset to bottom");
		newRulesetBottom.addSelectionListener
		(
			new SelectionListener() {
					public void widgetSelected(SelectionEvent event) {
						IDocument document = textEditor.getDocumentProvider().getDocument(textEditor.getEditorInput());
						int offset = document.getLength();
						rulesetInsertAction.insertNewRuleset(offset, offset + 11, textEditor, "\n\n- Ruleset");
					}
					
					public void widgetDefaultSelected(SelectionEvent event) {}
			}
		);
	}
}
