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
 * Modified 2009.08.17 by Vetis project
 */
package org.dbe.businessModeller.ruleset.ui.editors.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.enterprise.BusinessModellerDocument;
import org.dbe.businessModeller.ruleset.ui.editors.RulesetEditor;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
import org.eclipse.swt.widgets.Display;

public class RulesetReconcilingStrategy implements IReconcilingStrategy,
               IReconcilingStrategyExtension {

       private RulesetEditor editor;

       private IDocument fDocument;

       /** holds the calculated positions */
       protected final ArrayList fPositions = new ArrayList();

       /** The offset of the next character to be read */
       protected int fOffset;

       /** The end offset of the range to be scanned */
       protected int fRangeEnd;

       /**
        * @return Returns the editor.
        */
       public RulesetEditor getEditor() {
               return editor;
       }

       public void setEditor(RulesetEditor editor) {
               this.editor = editor;
       }

       /*
        * (non-Javadoc)
        *
        * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#setDocument(org.eclipse.jface.text.IDocument)
        */
       public void setDocument(IDocument document) {
    	   this.fDocument = document;
       }

       /*
        * (non-Javadoc)
        *
        * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#reconcile(org.eclipse.jface.text.reconciler.DirtyRegion,
        *      org.eclipse.jface.text.IRegion)
        */
       public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
    	   calculatePositions();
       }

       /*
        * (non-Javadoc)
        *
        * @see org.eclipse.jface.text.reconciler.IReconcilingStrategy#reconcile(org.eclipse.jface.text.IRegion)
        */
       public void reconcile(IRegion partition) {
    	   calculatePositions();       		
       }

       /*
        * (non-Javadoc)
        *
        * @see org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension#setProgressMonitor(org.eclipse.core.runtime.IProgressMonitor)
        */
       public void setProgressMonitor(IProgressMonitor monitor) {
       }

       /*
        * (non-Javadoc)
        *
        * @see org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension#initialReconcile()
        */
       public void initialReconcile() {  
           calculatePositions();
       }

       /**
        * uses {@link #fDocument}, {@link #fOffset} and {@link #fRangeEnd} to
        * calculate {@link #fPositions}. About syntax errors: this method is not a
        * validator, it is useful.
        */
       protected void calculatePositions() 
       { 
    	   fPositions.clear();
           int offset=0;
           int length=0;            	
           HashMap entryPositions = BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY).getEntryPosition();
           Iterator positions = entryPositions.values().iterator();
           while (positions.hasNext())
           {   
        	   Object aPosition = positions.next();
        	   if (aPosition instanceof Position)
        	   {
        	   Position position = (Position)aPosition;
        	   
        	   offset = position.getOffset();
           	   length = position.getLength();
           	   emitPosition(offset,length);
        	   }
           }

           Display.getDefault().asyncExec(new Runnable() {
        	   public void run() 
        	   {
        		   RulesetRuleMemory ruleMemory = RulesetRuleMemory.getInstance();
        		   ruleMemory.setUpdateFoldingStructure(true);
        		   editor.updateFoldingStructure(fPositions);
        		   ruleMemory.setUpdateFoldingStructure(false);	   
        	   }
           });
       }

       /**
        * emits tokens to {@link #fPositions}.
        */
       protected void emitPosition(int startOffset, int length)
       {
    	   fPositions.add(new Position(startOffset, length));
       }
           
 }
