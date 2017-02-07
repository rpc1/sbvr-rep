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

import org.eclipse.jface.text.Position;

public class RulesetTreePart {

	private Collection children;
	private RulesetTreePart parent;
	private Object content;
	private Position position;
	
	/**
	 * Create a new VocabularyTreePart with given parent.
	 * @param parent The treePartParent
	 * @param object The content of this VocabularyTreePart
	 */
	public RulesetTreePart(RulesetTreePart parent, Object content) {
		this(parent);
		this.content = content;
	}
	
	/**
	 * Create a new VocabularyTreePart with given parent.
	 * @param parent The treePartParent
	 */
	public RulesetTreePart(RulesetTreePart parent) {
		this();
		this.parent = parent;
	}
	
	/**
	 * Create a new VocabularyTreePart without parent.
	 * @param parent The treePartParent
	 */
	public RulesetTreePart() {
		position = new Position(0,0);
	}

	/**
	 * Add a children to this VocabularyTreePart.
	 * @param nodeContent is the content of this new node
	 * @return the node added
	 */
	public RulesetTreePart addChildren(Object nodeContent){
		if(this.children==null)this.children = new ArrayList();
		RulesetTreePart nodeChildren = new RulesetTreePart(this, nodeContent);
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
	public RulesetTreePart getParent(){
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
