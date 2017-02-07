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
 * Creato il 14-ott-2005
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.vocabulary.ui.editors.views.outline;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.text.Position;

public class VocabularyTreePart {

	private Collection children;
	private VocabularyTreePart parent;
	private Object content;
	private Position position;
	
	/**
	 * Create a new VocabularyTreePart with given parent.
	 * @param parent The treePartParent
	 * @param object The content of this VocabularyTreePart
	 */
	public VocabularyTreePart(VocabularyTreePart parent, Object content) {
		this(parent);
		this.content = content;
	}
	
	/**
	 * Create a new VocabularyTreePart with given parent.
	 * @param parent The treePartParent
	 */
	public VocabularyTreePart(VocabularyTreePart parent) {
		this();
		this.parent = parent;
	}
	
	/**
	 * Create a new VocabularyTreePart without parent.
	 * @param parent The treePartParent
	 */
	public VocabularyTreePart() {
		position = new Position(0,0);
	}

	/**
	 * Add a children to this VocabularyTreePart.
	 * @param nodeContent is the content of this new node
	 * @return the node added
	 */
	public VocabularyTreePart addChildren(Object nodeContent){
		if(this.children==null)this.children = new ArrayList();
		VocabularyTreePart nodeChildren = new VocabularyTreePart(this, nodeContent);
		this.children.add(nodeChildren);
		return nodeChildren;
	}
	
	/**
	 * 
	 * @return the Collection contenent the list of its children.
	 */
	public Collection getChildren(){
		return children;
	}
	
	/**
	 * 
	 * @return the parent of this VocabularyTreePart.
	 */
	public VocabularyTreePart getParent(){
		return parent;
	}

	/**
	 * @return Return the content of this VocabularyTreePart.
	 */
	public Object getContent() {
		return content;
	}

	/**
	 * @param Set the contentof this VocabularyTreePart.
	 */
	public void setContent(Object content) {
		this.content = content;
	}
	
	/**
	 * 
	 * @return if this VocabularyTreePart has children
	 */
	public boolean hasChildren(){
		return (!(children==null));
	}
	
	/**
	 * 
	 * @return if this VocabularyTreePart has parent
	 */
	public boolean hasParent(){
		return (!(parent==null));
	}
	
	/**
	 * Reset the TreeNode
	 *
	 */
	public void clear(){
		children = null;
		parent = null;
		content = null;
	}
	
	/**
	 * @return Restituisce position.
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * @param Imposta il valore di position.
	 */
	public void setPosition(Position position) {
		this.position = position;
	}
}
