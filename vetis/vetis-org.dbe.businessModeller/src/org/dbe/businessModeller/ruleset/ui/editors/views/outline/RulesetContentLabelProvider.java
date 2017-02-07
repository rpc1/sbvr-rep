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

import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.utils.ResourceProvider;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

class RulesetContentLabelProvider extends LabelProvider {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.LabelProvider#getImage(java.lang.Object)
	 */
	public Image getImage(Object obj) {
		Image image = null;
		try{
			RulesetTreePart treePart = (RulesetTreePart)obj;
			Object generalContent = treePart.getContent();
			if(VocabularyEntry.class.equals(generalContent.getClass().getSuperclass()))
				image = getImageFromVocabularyEntry(generalContent);
			if(String.class.equals(generalContent.getClass()))
				image = getImageFromString(generalContent);
		}catch(Exception x){
			x.printStackTrace();
			image = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
		return image;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object obj){
		RulesetTreePart treePart = (RulesetTreePart)obj;
		Object contentTreePart = treePart.getContent();
		if(VocabularyEntry.class.equals(contentTreePart.getClass().getSuperclass())){
			VocabularyEntry thisEntry = (VocabularyEntry)treePart.getContent();
			return thisEntry.getPrimaryRepresentation().toString();
		}
		return contentTreePart.toString();
	}
	
	/**
	 * Image getter from vocabulary entry
	 * @param content
	 * @return
	 * @throws Exception
	 */
	private Image getImageFromVocabularyEntry(Object content) throws Exception{
		VocabularyEntry vocabularyEntry = (VocabularyEntry)content;
		return ResourceProvider.getImageFromVocabularyEntry(vocabularyEntry);
	}
	
	/**
	 * Image getter from string
	 * @param content
	 * @return
	 * @throws Exception
	 */
	private Image getImageFromString(Object content) throws Exception{
		String str = content.toString().trim();
		Image image;
		
		if(str.substring(0, 2).equals("It"))
			image = ResourceProvider.getVocabularyEntryIcon(BusinessModeller.RULE);
		else
			image = ResourceProvider.getVocabularyEntryIcon(BusinessModeller.RULESET);
		
		return image;
	}
}