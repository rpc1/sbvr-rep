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
 * @author detommasi
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.ruleset.ui.editors;

import org.dbe.businessModeller.BusinessModellerPlugin;
import org.dbe.businessModeller.ruleset.ui.editors.entrydefinition.RulesetCompletionProcessor;
import org.dbe.businessModeller.ruleset.ui.editors.utils.RulesetReconcilingStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class RulesetSourceViewerConfiguration extends SourceViewerConfiguration {
	private RulesetEditor fEditor;
		
	public RulesetSourceViewerConfiguration(RulesetEditor editor) {
		super();
		fEditor = editor;
	}

	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {

		//RulesetColorProvider provider= BusinessModellerPlugin.getDefault().getSEColorProvider();
		PresentationReconciler reconciler= new PresentationReconciler();
		reconciler.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
		
		DefaultDamagerRepairer dr= new DefaultDamagerRepairer(BusinessModellerPlugin.getDefault().getRulesetScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
		
		//dr= new DefaultDamagerRepairer(BusinessModellerPlugin.getDefault().getJavaDocScanner());
		//reconciler.setDamager(dr, JavaPartitionScanner.JAVA_DOC);
		//reconciler.setRepairer(dr, JavaPartitionScanner.JAVA_DOC);

		//dr= new DefaultDamagerRepairer(new SingleTokenScanner(new TextAttribute(provider.getColor(JavaColorProvider.MULTI_LINE_COMMENT))));
		//reconciler.setDamager(dr, JavaPartitionScanner.JAVA_MULTILINE_COMMENT);
		//reconciler.setRepairer(dr, JavaPartitionScanner.JAVA_MULTILINE_COMMENT);
		return reconciler;
	}

	protected void initializeEditor(){
		// Esegue le operazioni prima di aprire l'editor
	}
	
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
        RulesetReconcilingStrategy strategy = new RulesetReconcilingStrategy();
        strategy.setEditor(fEditor);
        
        MonoReconciler reconciler = new MonoReconciler(strategy,false); 
        
        return reconciler;
	}
	
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		ContentAssistant assistant= new ContentAssistant();
		assistant.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
		assistant.setContentAssistProcessor(new RulesetCompletionProcessor(), IDocument.DEFAULT_CONTENT_TYPE);
		
		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(500);
		assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
		assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
		assistant.setContextInformationPopupBackground(new Color(Display.getDefault(), new RGB(115,115,0)));
		return assistant;
	}
}
