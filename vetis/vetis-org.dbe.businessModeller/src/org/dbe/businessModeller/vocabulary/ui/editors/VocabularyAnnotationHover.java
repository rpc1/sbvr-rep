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
/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.dbe.businessModeller.vocabulary.ui.editors;

import org.eclipse.jface.text.*;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;

/** 
 * The VocabularyAnnotationHover provides the hover support for java editors.
 */
 
public class VocabularyAnnotationHover implements IAnnotationHover {

	/* (non-Javadoc)
	 * Method declared on IAnnotationHover
	 */
	public String getHoverInfo(ISourceViewer sourceViewer, int lineNumber) {
		IDocument document= sourceViewer.getDocument();

		try {
			IRegion info= document.getLineInformation(lineNumber);
			return document.get(info.getOffset(), info.getLength());
		} catch (BadLocationException x) {
		}

		return null;
	}
	
	
}
