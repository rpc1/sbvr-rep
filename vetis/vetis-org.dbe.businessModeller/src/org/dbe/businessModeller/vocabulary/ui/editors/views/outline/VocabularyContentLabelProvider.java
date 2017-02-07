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
package org.dbe.businessModeller.vocabulary.ui.editors.views.outline;

import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.utils.ResourceProvider;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

class VocabularyContentLabelProvider extends LabelProvider{// implements ITableLabelProvider {
	//public String getColumnText(Object obj, int index) {
		//return getText(obj);
	//}
	//public Image getColumnImage(Object obj, int index) {
		//return getImage(obj);
	//}
	
	public Image getImage(Object obj) {
		Image image = null;
		try{
			VocabularyTreePart treePart = (VocabularyTreePart)obj;
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
	
	public String getText(Object obj){
		// Se è un VocabularyEntry prendi il testo della PrimaryRepresentation
		VocabularyTreePart treePart = (VocabularyTreePart)obj;
		Object contentTreePart = treePart.getContent();
		if(VocabularyEntry.class.equals(contentTreePart.getClass().getSuperclass())){
			VocabularyEntry thisEntry = (VocabularyEntry)treePart.getContent();
			return thisEntry.getPrimaryRepresentation().toString();
		}
		return contentTreePart.toString();
	}
	
	private Image getImageFromVocabularyEntry(Object content) throws Exception{
		VocabularyEntry vocabularyEntry = (VocabularyEntry)content;
		return ResourceProvider.getImageFromVocabularyEntry(vocabularyEntry);
	}

	private Image getImageFromString(Object content) throws Exception{
		String testo = content.toString();
		Image image;
		if(testo.equals(BusinessModeller.STRING_NAME))
			image = ResourceProvider.getVocabularyEntryIcon(BusinessModeller.NAME);
		else if(testo.equals(BusinessModeller.STRING_TERM))
			image = ResourceProvider.getVocabularyEntryIcon(BusinessModeller.TERM);
		else if(testo.equals(BusinessModeller.STRING_FACT))
			image = ResourceProvider.getVocabularyEntryIcon(BusinessModeller.FACT);
		else
			image = ResourceProvider.getVocabularyEntryIcon(BusinessModeller.DEFAULT_IMAGE);
		return image;
	}
}
