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
/**
 * Creato il 1-dic-2005
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.dictionary.ui;

import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class AskingDialog extends Dialog {

	//private StyledText styledText;
	private Text text;
	private IContentProvider contentProvider;
	private ILabelProvider contentLabelProvider;
	private String representation;
	
	private ListViewer listViewer;
	
	private DictionaryWordTO selectedDictionaryWord;
	
	/**
	 * Create the dialog
	 * @param parentShell
	 */
	public AskingDialog(Shell parentShell, IContentProvider contentProvider) {
		super(parentShell);
		this.contentProvider = contentProvider;
		contentLabelProvider = new WordNetContentLabelProvider(); 
	}

	/**
	 * Create contents of the dialog
	 * @param parent
	 */
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		container.setLayout(gridLayout);

		listViewer = new ListViewer(container, SWT.V_SCROLL | SWT.BORDER);
		listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent e) {
				Object obj = ((IStructuredSelection) e.getSelection()).getFirstElement();
				DictionaryWordTO dictionaryWord = (DictionaryWordTO)obj;
//				BusinessModellerUtils.showMessage(dictionaryWord.getDefinition()+"");
//				textViewer.setInput(dictionaryWord.getLemma());
//				textViewer.refresh();
				text.setText(dictionaryWord.getDefinition()+"");
				try{
//					nnnStyledText.setText("testodiprova");
				}catch (Exception x){
					BusinessModellerUtils.showMessage(x.toString());
					x.printStackTrace();
				}
				
			}
		});
		listViewer.setContentProvider(contentProvider);
		listViewer.setLabelProvider(contentLabelProvider);
		listViewer.setSorter(new ViewerSorter());
		
		List list = listViewer.getList();
		list.addMouseListener(new MouseAdapter() {
			public void mouseUp(MouseEvent e) {
				// TODO PP: forse non serve
			}
		});
		final GridData gridData = new GridData(GridData.CENTER, GridData.CENTER, false, false);
		gridData.widthHint = 282;
		gridData.heightHint = 289;
		list.setLayoutData(gridData);
		//listViewer.setInput(new Object());
		listViewer.setInput(representation);

		text = new Text(container, SWT.BORDER | SWT.WRAP);
		final GridData gridData_1 = new GridData(GridData.FILL, GridData.CENTER, true, false);
		gridData_1.heightHint = 289;
		text.setLayoutData(gridData_1);
		//ITextEditor editor = new VocabularyEditor();
		//textViewer.setDocument(editor.getDocumentProvider().getDocument(editor.getEditorInput()));
		//
		return container;
	}

	/**
	 * Create contents of the button bar
	 * @param parent
	 */
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
		createButton(parent, IDialogConstants.BACK_ID,
				"...", false);
	}

	/**
	 * Return the initial size of the dialog
	 */
	protected Point getInitialSize() {
		return new Point(635, 373);
	}
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Ask WordNet..");
	}

	/**
	 * @return Restituisce representation.
	 */
	public String getRepresentation() {
		return representation;
	}

	/**
	 * @param Imposta il valore di representation.
	 */
	public void setRepresentation(String representation) {
		this.representation = representation;
	}
	
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) {
			List list = listViewer.getList();
			Object selection = listViewer.getElementAt(list.getSelectionIndex());
			selectedDictionaryWord = (DictionaryWordTO)selection;
		}
		super.buttonPressed(buttonId);
	}

	/**
	 * @return Restituisce selectedDictionaryWord.
	 */
	public DictionaryWordTO getSelectedDictionaryWord() {
		return selectedDictionaryWord;
	}

}
