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
 *
 * @author Pierpaolo Cira
 */
/*
 * Modified 2009.10.07 by Vetis project
 */
package org.dbe.businessModeller.vocabulary.ui.editors.views.outline;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.IBusinessModellerDocument;
import org.dbe.businessModeller.enterprise.BusinessModellerDocument;
import org.dbe.businessModeller.logger.BusinessModellerLogger;
import org.dbe.businessModeller.vocabulary.enterprise.Designation;
import org.dbe.businessModeller.vocabulary.enterprise.FactType;
import org.dbe.businessModeller.vocabulary.enterprise.ObjectType;
import org.dbe.businessModeller.vocabulary.enterprise.PrimaryRepresentation;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttribute;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.dbe.businessModeller.vocabulary.utils.VocabularyEntriesComparator;
import org.dbe.businessModeller.vocabulary.utils.VocabularyUtilities;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.DefaultPositionUpdater;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IPositionUpdater;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.texteditor.IDocumentProvider;

public class VocabularyContentProvider implements ITreeContentProvider {
	
	private static BusinessModellerLogger logger = (BusinessModellerLogger)BusinessModellerLogger.getLogger(VocabularyContentProvider.class);
	
	private IBusinessModellerDocument vocabulary;
	private VocabularyTreePart contentTree;
	private String _ROOT;
	private boolean alphabeticallySorting;
	private boolean typeDivisioning;
	// Other
	protected final static String SEGMENTS= "__bm_segments";
	protected IPositionUpdater fPositionUpdater= new DefaultPositionUpdater(SEGMENTS);
	protected IDocumentProvider fDocumentProvider;
	// Filters
	private boolean showTerms;
	private boolean showNames;
	private boolean showFacts;

	public VocabularyContentProvider(){
		vocabulary = BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
		contentTree = new VocabularyTreePart();
		_ROOT = "_root";
	}
	
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
	
	public void dispose() {
		contentTree = null;
		vocabulary = null;
	}
	
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

    public Object[] getChildren(Object parentElement)
    {
    	VocabularyTreePart vocTP = (VocabularyTreePart)parentElement; 
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
    	return ((VocabularyTreePart)element).getParent();
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
    	return ((VocabularyTreePart)element).hasChildren();
    }
    
	/**
	 *  Parse the document vocabulary in a tree form
	 */
    private void createTree(IDocument document){
		contentTree.clear();
		vocabulary = BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
		contentTree.setContent(_ROOT);
		HashMap nodiPrimari = new HashMap();
		if(this.typeDivisioning){
			if(isShowTerms())
				nodiPrimari.put(new Integer(BusinessModeller.TERM),contentTree.addChildren(BusinessModeller.STRING_TERM));
			if(isShowNames())
				nodiPrimari.put(new Integer(BusinessModeller.NAME),contentTree.addChildren(BusinessModeller.STRING_NAME));
			if(isShowFacts())
				nodiPrimari.put(new Integer(BusinessModeller.FACT),contentTree.addChildren(BusinessModeller.STRING_FACT));
		}
		Collection vocabularyEntries = vocabulary.getEntries();
		// HashMap newEntryPosition = calculatePositions(vocabulary.getEntryPosition(), document);
		HashMap entryPosition = vocabulary.getEntryPosition();
		if(vocabularyEntries!=null){
			List orderedVocabularyEntries = Arrays.asList(vocabularyEntries.toArray()); 
			if(this.alphabeticallySorting)
	        	Collections.sort(orderedVocabularyEntries, new VocabularyEntriesComparator());
			Iterator iteraVocabulary = orderedVocabularyEntries.iterator();
			while(iteraVocabulary.hasNext()){
				VocabularyEntry thisVocabularyEntry = (VocabularyEntry)iteraVocabulary.next();
				Integer vocabularyEntryType = new Integer(VocabularyUtilities.getVocabularyEntryIdentifier(thisVocabularyEntry));
				switch (vocabularyEntryType.intValue()) {
				case BusinessModeller.TERM:
					if(!isShowTerms())continue;
					break;
				case BusinessModeller.NAME:
					if(!isShowNames())continue;
					break;
				case BusinessModeller.FACT:
					if(!isShowFacts())continue;
					break;
				}
				VocabularyTreePart nuovaTreePart;
				if(this.typeDivisioning){
					nuovaTreePart = ((VocabularyTreePart)nodiPrimari.get(vocabularyEntryType)).addChildren(thisVocabularyEntry);
				}else{
					nuovaTreePart = contentTree.addChildren(thisVocabularyEntry);
				}
				
				Collection entryAttributes = thisVocabularyEntry.getAttributes();
				
				if(entryAttributes != null) {
					for(Object attribute:entryAttributes) {
						
						VocabularyEntry temp;
						
						if(((VocabularyAttribute)attribute).getCaption().equalsIgnoreCase("Synonym:") || ((VocabularyAttribute)attribute).getCaption().equalsIgnoreCase("Synonymous_form:") ) {
							// create temporary vocabulary entry for synonym
							
							temp = ((VocabularyAttribute)attribute).getCaption().equalsIgnoreCase("Synonym:") ? new ObjectType() : new FactType(); 
							
							Designation representation = new Designation();
							representation.setSignifier(((VocabularyAttribute)attribute).getValue().toString());
							temp.setPrimaryRepresentation(representation);
							
							VocabularyTreePart synonymousPart = nuovaTreePart.addChildren(temp);
							this.setPosition(synonymousPart, nuovaTreePart, entryPosition, document);
						}						
					}
				}
				
				this.setPosition(nuovaTreePart, nuovaTreePart, entryPosition, document);
			}
		}
	}
    
    private void setPosition(VocabularyTreePart treePart, VocabularyTreePart treePartForPosition, HashMap entryPosition, IDocument document) {
		Position position = VocabularyUtilities.getPosition(treePartForPosition.getContent(), entryPosition);
		if(position==null)
			position= new Position(0,0);
		treePart.setPosition(position);
		if(position != null && !position.equals(new Position(0,0))) {
			try {
				document.addPosition(SEGMENTS, position);
			} catch (BadPositionCategoryException x) {} 
			  catch (BadLocationException x) {}
		}
    }
    
	/**
	 * @param Imposta il valore di alphabeticallySorting.
	 */
	public void setAlphabeticallySorting(boolean alphabeticallySorting) {
		this.alphabeticallySorting = alphabeticallySorting;
	}

	/**
	 * @param Imposta il valore di alphabeticallySorting.
	 */
	public void setTypeDivisioning(boolean typeDivisioning) {
		this.typeDivisioning = typeDivisioning;
		
	}
	
	/**
	 * @param Imposta il valore di contentTree.
	 */
	public void setContentTree(VocabularyTreePart contentTree) {
		this.contentTree = contentTree;
		
	}

	/**
	 * @param Imposta il valore di fDocumentProvider.
	 */
	public void setDocumentProvider(IDocumentProvider documentProvider) {
		fDocumentProvider = documentProvider;
	}
	
	/**
	 * @param Imposta il valore di ShowFacts.
	 */	
	public void setShowFacts(boolean showFacts) {
		this.showFacts = showFacts;
	}
	
	/**
	 * @param Imposta il valore di ShowNames.
	 */
	public void setShowNames(boolean showNames) {
		this.showNames = showNames;
	}

	/**
	 * @param Imposta il valore di ShowTerms.
	 */
	public void setShowTerms(boolean showTerms) {
		this.showTerms = showTerms;
	}

	public boolean isShowFacts() {
		return showFacts;
	}

	public boolean isShowNames() {
		return showNames;
	}

	public boolean isShowTerms() {
		return showTerms;
	}
}

