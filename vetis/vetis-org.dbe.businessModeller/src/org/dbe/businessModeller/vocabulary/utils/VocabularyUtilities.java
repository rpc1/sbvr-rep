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
* (c) Copyright 2004 Digital Business Ecosystem Consortium
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License - v 1.0
* which accompanies this distribution (license.txt) , and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* Maurizio De Tommasi, Pierpaolo Cira, Valerio Cisternino
*
*******************************************************************************/
/*
 * 
 * @author Pierpaolo Cira
 */
/*
 * Modified 2009.09.20 by Vetis project
 */
package org.dbe.businessModeller.vocabulary.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.logger.BusinessModellerLogger;
import org.dbe.businessModeller.vocabulary.enterprise.FactType;
import org.dbe.businessModeller.vocabulary.enterprise.IndividualConcept;
import org.dbe.businessModeller.vocabulary.enterprise.ObjectType;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;

public class VocabularyUtilities {

	private static BusinessModellerLogger logger = (BusinessModellerLogger)BusinessModellerLogger.getLogger(VocabularyUtilities.class);
	
	public static int getVocabularyEntryIdentifier(VocabularyEntry vocabularyEntry){
			if(FactType.class.equals(vocabularyEntry.getClass()))
				return BusinessModeller.FACT;
			else if(ObjectType.class.equals(vocabularyEntry.getClass()))
				return BusinessModeller.TERM;
			else if(IndividualConcept.class.equals(vocabularyEntry.getClass()))
				return BusinessModeller.NAME;
			else
				return BusinessModeller.KEYWORD;
	}
	
	public static List getVocabularyHeadCaption(){
		List headCaption = new ArrayList();
		headCaption.add("Name");
		headCaption.add("Description");
		headCaption.add("Source");
		headCaption.add("Speech Community");
		headCaption.add("Language");
		headCaption.add("Included Vocabulary");
		headCaption.add("Note");
		return headCaption;
	}

	public static HashMap calculatePositions(HashMap entryPosition, IDocument document){
		int lines = document.getNumberOfLines();
		int offset = 0;
		int addingOffset = 0;
		int addingLines = 0;
		StringBuffer initCuttedText = new StringBuffer();
		String text = document.get();
		HashMap newEntryPosition = new HashMap(entryPosition.size());
		while(text.startsWith("\n") || text.startsWith("\r")){
			addingOffset++;
			initCuttedText = initCuttedText.append(text.substring(0,1));
			text = text.substring(1);
		}
		try{
			addingLines = document.getLineOfOffset(addingOffset);
			String representation = "";
			for (int line= addingLines; line < lines; line++) {						// Loop each line of document
				if(!entryPosition.keySet().contains(new Long(line-addingLines))){	// If this line isn't in entryPosition 
					if ((line + 1) < lines){										// 		and if this isn't the last line 
						continue;													// 			then go to the next line
					}
				}
				int thisOffset = document.getLineOffset(line);						// get the starting offset of this line
				String thisRepresentation;											// and its representation in the entryPosition
				try{																// 		by the line number
					thisRepresentation = entryPosition.get(new Long(line-addingLines)).toString();
				}catch(Exception x){
					thisRepresentation = "";										// if line is the last line, the repr is empty 
				}
				int length= thisOffset - offset;									// compute the repres lenth by the difference
																					// between this offset and the last used offset
				if( (!((line + 1) < lines)) && (!entryPosition.keySet().contains(new Long(line-addingLines))) )
					length+=document.getLineLength(lines-1);						// se � l'ultima linea offset fino alla fine
				
				Position position = new Position(offset, length);					// create a position
				if(!representation.equals(""))
						newEntryPosition.put(representation, position);				// put the position
				offset = thisOffset;												// refresh the last used offset
				representation = thisRepresentation;
			}
			if(!representation.equals("")){
				int thisOffset = document.getLineOffset(lines-1)+document.getLineLength(lines-1);
				int length= thisOffset - offset;
				Position position = new Position(offset, length);
				newEntryPosition.put(representation, position);
			}
		}catch(BadLocationException ex){
			logger.error(ex);		
		}
		return newEntryPosition;
	}
	
	public static Position getPosition(Object object, HashMap newEntryPosition){
		if(! VocabularyEntry.class.equals(object.getClass().getSuperclass())){
			return new Position(0, 0);
		}
		VocabularyEntry vocabularyEntry = (VocabularyEntry) object;
		Position position = (Position)newEntryPosition.get(vocabularyEntry.getPrimaryRepresentation().toString());
		if(position==null)position= new Position(0,0);
		return position;
	}
}
