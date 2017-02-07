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

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.enterprise.BusinessModellerDocument;
import org.dbe.businessModeller.logger.BusinessModellerLogger;
import org.dbe.businessModeller.ruleset.utils.RulesComparator;
import org.dbe.businessModeller.vocabulary.enterprise.Rule;
import org.dbe.businessModeller.vocabulary.enterprise.RuleSet;
import org.dbe.businessModeller.vocabulary.enterprise.RuleSetEntry;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.DefaultPositionUpdater;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IPositionUpdater;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.texteditor.IDocumentProvider;

public class RulesetContentProvider implements ITreeContentProvider {
	
	private static BusinessModellerLogger logger = (BusinessModellerLogger)BusinessModellerLogger.getLogger(RulesetContentProvider.class);
	
	private RulesetTreePart contentTree;
	private String _ROOT;
	private boolean alphabeticallySorting;
	// Other
	protected final static String SEGMENTS= "__bm_segments";
	protected IPositionUpdater fPositionUpdater= new DefaultPositionUpdater(SEGMENTS);
	protected IDocumentProvider fDocumentProvider;


	public RulesetContentProvider(){
		contentTree = new RulesetTreePart();
		_ROOT = "_root";
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (oldInput != null) {
			IDocument document= fDocumentProvider.getDocument(oldInput);
			if (document != null) {
				try {
					document.removePositionCategory(SEGMENTS);
				} catch (BadPositionCategoryException x) {
				}
				document.removePositionUpdater(fPositionUpdater);
			}
		}
		if (newInput != null) {
			IDocument document= fDocumentProvider.getDocument(newInput);
			if (document != null) {
				document.addPositionCategory(SEGMENTS);
				document.addPositionUpdater(fPositionUpdater);
				createTree(document);
			}
			else{
				// do nothing
			}
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		contentTree = null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object parent) {
		// Collection children is instanced after calling #addChildren 
		if (contentTree==null || contentTree.getChildren()==null)return new Object[] {};
		Collection firstLevelObject =  contentTree.getChildren();
		try{
			return firstLevelObject.toArray();
		}catch(Exception x){
			logger.error(x);
			return new Object[] {};
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
    public Object[] getChildren(Object parentElement)
    {
    	RulesetTreePart vocTP = (RulesetTreePart)parentElement; 
    	if(!vocTP.hasChildren())return null;
    	Collection chil = vocTP.getChildren();
    	return (chil.toArray());
    }

    /**
     * Returns the parent for the given element, or <code>null</code> 
     * indicating that the parent can't be computed. 
     * In this case the tree-structured viewer can't expand
     * a given node correctly if requested.
     *
     * @param element the element
     * @return the parent element, or <code>null</code> if it
     *   has none or if the parent cannot be computed
     */
    public Object getParent(Object element){
    	return ((RulesetTreePart)element).getParent();
    }

    /**
     * Returns whether the given element has children.
     * <p>
     * Intended as an optimization for when the viewer does not
     * need the actual children.  Clients may be able to implement
     * this more efficiently than <code>getChildren</code>.
     * </p>
     *
     * @param element the element
     * @return <code>true</code> if the given element has children,
     *  and <code>false</code> if it has no children
     */
    public boolean hasChildren(Object element){
    	return ((RulesetTreePart)element).hasChildren();
    }
    
	/**
	 *  Parse the document vocabulary in a tree form
	 */
    @SuppressWarnings("unchecked")
	private void createTree(IDocument document){
		contentTree.clear();
		
		RuleSet ruleset = (RuleSet) BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_RULESET);
		
		for(Iterator<RuleSetEntry> i = ruleset.getRuleSetEntries().iterator(); i.hasNext();) {
			RuleSetEntry entry = i.next();
			
			RulesetTreePart newTreePartRuleset = null;
			
			if(!entry.getText().equals("misc")) {
				
				newTreePartRuleset =  contentTree.addChildren(entry.getText());
				
				int p = (Integer)ruleset.getEntryPosition().get(entry.getText());
				
				Position position = new Position(p, 0);
				
				newTreePartRuleset.setPosition(position);
				
				try {
					document.addPosition(SEGMENTS, position);
				} catch (BadPositionCategoryException x) {
				} catch (BadLocationException x) {
				}
			}
		
			
			// iterate rules of the ruleset
			ArrayList<Rule> entries = (ArrayList<Rule>) entry.getRules().clone();
			if(alphabeticallySorting)
				Collections.sort(entries, new RulesComparator() );
			
			for(Rule rule: entries) {
				
				RulesetTreePart newTreePartRule = null;
				
				if(newTreePartRuleset != null)
					newTreePartRule = newTreePartRuleset.addChildren(rule.getText());
				else
					newTreePartRule = contentTree.addChildren(rule.getText());
				
				
				int p2 = (Integer)rule.getEntryPosition().get(rule.getText());
				
				Position position2 = new Position(p2, 0);
				
				
				newTreePartRule.setPosition(position2);
			}
			
		}
	}
    
    /**
     * Set sorting
     * @param alphabeticallySorting
     */
	public void setAlphabeticallySorting(boolean alphabeticallySorting) {
		this.alphabeticallySorting = alphabeticallySorting;
	}
	
	/**
	 * Content tree setter
	 * @param contentTree
	 */
	public void setContentTree(RulesetTreePart contentTree) {
		this.contentTree = contentTree;
		
	}

	/**
	 * Document provider setter
	 * @param documentProvider
	 */
	public void setDocumentProvider(IDocumentProvider documentProvider) {
		fDocumentProvider = documentProvider;
	}
}

