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
 * @author Pierpaolo Cira
 */
/*
 * Modified 2009.10.07 by Vetis project
 */
package org.dbe.businessModeller.vocabulary.ui.editors.views.outline;
import java.io.IOException;

import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.dictionary.ui.WordNetGeneralAction;
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.utils.ResourceProvider;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.dbe.businessModeller.vocabulary.ui.editors.VocabularyEditor;
import org.dbe.businessModeller.vocabulary.ui.editors.WordNetDefinitionAction;
import org.dbe.businessModeller.vocabulary.ui.editors.WordNetHypernymAction;
import org.dbe.businessModeller.vocabulary.ui.editors.WordNetHyponymAction;
import org.dbe.businessModeller.vocabulary.ui.editors.WordNetSynonymAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
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

public class VocabularyContentOutlinePage extends ContentOutlinePage {

	private TreeViewer viewer;
	private IDocumentProvider documentProvider;
	private ITextEditor textEditor;
	private IEditorInput fInput;
	private Action alphabeticallySortAction;
	private Action typeDivisionAction;
	//private IContentProvider contentProvider;
	private VocabularyContentProvider contentProvider;
	private WordNetGeneralAction wordNetSynonymAction;
	private WordNetGeneralAction wordNetDefinitionAction;
	private WordNetGeneralAction wordNetHyponymAction;
	private WordNetGeneralAction wordNetHypernymAction;
	// Action per il filtering
	private Action showTermsAction;
	private Action showNamesAction;
	private Action showFactsAction;
	// TODO PP: ci sono tre action di prova
	private Action contextMenuExampleAction;
	private Action actionBarAction;
	
	public VocabularyContentOutlinePage(IDocumentProvider documentProvider, ITextEditor textEditor) {
		super();
		this.documentProvider = documentProvider;
		this.textEditor = textEditor;
	}

	public void createControl(Composite parent) {
		super.createControl(parent);
		contentProvider = new VocabularyContentProvider();
		//((VocabularyContentProvider)contentProvider).setDocumentProvider(documentProvider);
		contentProvider.setDocumentProvider(documentProvider);
		TreeViewer viewer= getTreeViewer();
		viewer.setContentProvider(contentProvider);
		viewer.setLabelProvider(new VocabularyContentLabelProvider());
		viewer.addSelectionChangedListener(this);
		viewer.setInput(getSite());
		if (fInput != null)viewer.setInput(fInput);
		makeActions();
		hookContextMenu();
		// hookDoubleClickAction();
		contributeToActionBars();
		adjustePreference();
	}
	
	public void selectionChanged(SelectionChangedEvent event) {
		super.selectionChanged(event);
		textEditor.resetHighlightRange();
		ISelection selection= event.getSelection();
		if (selection.isEmpty())
			textEditor.resetHighlightRange();
		else {
			
			Object obj = ((IStructuredSelection) selection).getFirstElement();
			VocabularyTreePart vocabularyTreePart = (VocabularyTreePart)obj;
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
	 * @param Imposta il valore di fInput.
	 */
	public void setInput(IEditorInput input) {
		fInput = input;
	}

	/**
	 * Updates the outline page.
	 */
	public void update() {
		viewer = getTreeViewer();	
		if (viewer != null) {
			Control control= viewer.getControl();
			if (control != null && !control.isDisposed()) {
				control.setRedraw(false);
				viewer.setInput(fInput);
				viewer.expandToLevel(2);
				control.setRedraw(true);
			}
		}
	}
	
	/**
	 * Define the view action
	 *
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
		alphabeticallySortAction.setToolTipText("Sort alphabetically");
		try{
			alphabeticallySortAction.setImageDescriptor(ResourceProvider.
						getImageDescriptor("alph_sorting.gif"));
		}catch(Exception ex){
			ex.printStackTrace();
			alphabeticallySortAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
					getImageDescriptor(ISharedImages.IMG_OBJ_ELEMENT));
		}
		
		typeDivisionAction = new Action("group", IAction.AS_CHECK_BOX) {
			public void run() {
				boolean division = isChecked();
				setChecked(division);
				contentProvider.setTypeDivisioning(division);
				update();
			}
		};
		typeDivisionAction.setText("Group...");
		typeDivisionAction.setToolTipText("Group by type");
		try{
			typeDivisionAction.setImageDescriptor(ResourceProvider.
						getImageDescriptor("type_divisioning.gif"));
		}catch(Exception ex){
			ex.printStackTrace();
			typeDivisionAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
					getImageDescriptor(ISharedImages.IMG_OBJ_ELEMENT));
		}
		
		// TODO is this action actually used?
		contextMenuExampleAction = new Action() {
			public void run() {
				ISelection selection= viewer.getSelection();
				if (selection.isEmpty())
					textEditor.resetHighlightRange();
				else {
					Object obj = ((IStructuredSelection) selection).getFirstElement();
					VocabularyTreePart vocabularyTreePart = (VocabularyTreePart)obj;
					Object content = vocabularyTreePart.getContent();
					if(VocabularyEntry.class.equals(content.getClass().getSuperclass())){
						VocabularyEntry thisEntry = (VocabularyEntry)content;
						BusinessModellerUtils.showMessage("Right click on: "+thisEntry.getPrimaryRepresentation().toString());
					}
					else{
						BusinessModellerUtils.showMessage("No available info on this Item");
					}
				}
			}
		};
		contextMenuExampleAction.setText("Info");
		contextMenuExampleAction.setToolTipText("Click for Info");
		contextMenuExampleAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
							getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		// FILTERING ACTION //
		showTermsAction = new Action("filtering", IAction.AS_CHECK_BOX) {
			public void run() {
				boolean checked = isChecked();
				setChecked(checked);
				contentProvider.setShowTerms(checked);
				update();
			}
		};
		showTermsAction.setText("Show terms");
		showTermsAction.setToolTipText("Show terms in this content outline");
		try{
			showTermsAction.setImageDescriptor(ImageDescriptor.createFromImage(
					ResourceProvider.getVocabularyEntryIcon(BusinessModeller.TERM)));	
		}catch(IOException ex){
			ex.printStackTrace();
			showTermsAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
					getImageDescriptor(ISharedImages.IMG_OBJ_ELEMENT));
		}
		//
		showNamesAction = new Action("filtering", IAction.AS_CHECK_BOX) {
			public void run() {
				boolean checked = isChecked();
				setChecked(checked);
				contentProvider.setShowNames(checked);
				update();
			}
		};
		showNamesAction.setText("Show names");
		showNamesAction.setToolTipText("Show names in this content outline");
		try{
			showNamesAction.setImageDescriptor(ImageDescriptor.createFromImage(
					ResourceProvider.getVocabularyEntryIcon(BusinessModeller.NAME)));	
		}catch(IOException ex){
			ex.printStackTrace();
			showNamesAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
					getImageDescriptor(ISharedImages.IMG_OBJ_ELEMENT));
		}
		//
		showFactsAction = new Action("filtering", IAction.AS_CHECK_BOX) {
			public void run() {
				boolean checked = isChecked();
				setChecked(checked);
				contentProvider.setShowFacts(checked);
				update();
			}
		};
		showFactsAction.setText("Show facts");
		showFactsAction.setToolTipText("Show facts in this content outline");
		try{
			showFactsAction.setImageDescriptor(ImageDescriptor.createFromImage(
					ResourceProvider.getVocabularyEntryIcon(BusinessModeller.FACT)));	
		}catch(IOException ex){
			ex.printStackTrace();
			showFactsAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
					getImageDescriptor(ISharedImages.IMG_OBJ_ELEMENT));
		}
		
		// TOTO PP: cambiare icona
		ImageDescriptor imageDescriptor = PlatformUI.getWorkbench().getSharedImages().
											getImageDescriptor(ISharedImages.IMG_OBJ_FOLDER);
		
		wordNetSynonymAction = new WordNetSynonymAction();
		wordNetSynonymAction.prepareWordNetAction(this, textEditor, imageDescriptor);

		wordNetDefinitionAction = new WordNetDefinitionAction();
		wordNetDefinitionAction.prepareWordNetAction(this, textEditor, imageDescriptor);

		wordNetHyponymAction = new WordNetHyponymAction();
		wordNetHyponymAction.prepareWordNetAction(this, textEditor, imageDescriptor);
		
		wordNetHypernymAction = new WordNetHypernymAction();
		wordNetHypernymAction.prepareWordNetAction(this, textEditor, imageDescriptor);
	
	}
	
	/**
	 * Define a menu controller
	 * 
	 */
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
//		menuMgr.addMenuListener(new IMenuListener() {
//			public void menuAboutToShow(IMenuManager manager) {
//				VocabularyContentOutlinePage.this.fillContextMenu(manager);
//			}
//		});
//		Menu menu = menuMgr.createContextMenu(getControl());
		Menu menu = new Menu(getControl().getShell(), SWT.POP_UP);
		getControl().setMenu(menu);
		//getSite().registerContextMenu(menuMgr, viewer);
		
		fillWordNetMenu(menu);
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
		// bars.getStatusLineManager().add(actionBarAction);
	}

	
	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(showTermsAction);
		manager.add(showNamesAction);
		manager.add(showFactsAction);
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(alphabeticallySortAction);
		manager.add(typeDivisionAction);
		//IContributionItem cit = new ContributionItem("name");
		//cit.
		//manager.add(cit);
	}

//	TODO PP: metodo SOPPRESSO e sostituito da fillWordNetMenu: si potrebbe cancellare?
//	private void fillContextMenu(IMenuManager manager) {
//			manager.add(wordNetSynonymAction);
//			manager.add(wordNetDefinitionAction);
//		}
	
	private void fillWordNetMenu(Menu menu){
		MenuItem wordNetMenu = new MenuItem(menu, SWT.CASCADE);
		wordNetMenu.setText("Ask WordNet...");
		Menu subMenu = new Menu(getControl().getShell(), SWT.DROP_DOWN);
		wordNetMenu.setMenu(subMenu);
		// Menu item for Synonym
		MenuItem synonymItem = new MenuItem(subMenu, SWT.PUSH);
		synonymItem.setText("Add synonym");
		synonymItem.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				wordNetSynonymAction.run();
			}
			public void widgetDefaultSelected(SelectionEvent event) {
				// TODO PP: per ora non fa nulla
			}
		});
		// Menu item for Definition
		MenuItem definitionItem = new MenuItem(subMenu, SWT.PUSH);
		definitionItem.setText("Add definition");
		definitionItem.addSelectionListener(new SelectionListener() {
				public void widgetSelected(SelectionEvent event) {
				wordNetDefinitionAction.run();
			}
			public void widgetDefaultSelected(SelectionEvent event) {
				// TODO PP: per ora non fa nulla
			}
		});
		// Menu item for Hyponym
		MenuItem hyponymItem = new MenuItem(subMenu, SWT.PUSH);
		hyponymItem.setText("Add hyponym");
		hyponymItem.addSelectionListener(new SelectionListener() {
				public void widgetSelected(SelectionEvent event) {
				wordNetHyponymAction.run();
				invokeEditorParse();
			}
			public void widgetDefaultSelected(SelectionEvent event) {
				// TODO PP: per ora non fa nulla
			}
		});
		// Menu item for Hypernym
		MenuItem hypernymItem = new MenuItem(subMenu, SWT.PUSH);
		hypernymItem.setText("Add hypernym");
		hypernymItem.addSelectionListener(new SelectionListener() {
				public void widgetSelected(SelectionEvent event) {
				wordNetHypernymAction.run();
				invokeEditorParse();
			}
			public void widgetDefaultSelected(SelectionEvent event) {
				// TODO PP: per ora non fa nulla
			}
		});
	}
	
	private void adjustePreference() {
		this.typeDivisionAction.setChecked(true);
		this.alphabeticallySortAction.setChecked(false);
		this.showTermsAction.setChecked(true);
		this.showNamesAction.setChecked(true);
		this.showFactsAction.setChecked(true);
		contentProvider.setTypeDivisioning(true);
		contentProvider.setAlphabeticallySorting(false);
		contentProvider.setShowTerms(true);
		contentProvider.setShowNames(true);
		contentProvider.setShowFacts(true);
		update();
	}
	
	private void invokeEditorParse(){
		VocabularyEditor vocabularyEditor = (VocabularyEditor)textEditor;
		vocabularyEditor.getVocabularyMainEditor().parse();
		
	}
}
