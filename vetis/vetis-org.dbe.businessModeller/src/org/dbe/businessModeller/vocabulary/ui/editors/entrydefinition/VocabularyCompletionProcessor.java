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
 * @author Pierpaolo Cira
 */
/*
 * Modified 2009.10.09 by Vetis project
 */
package org.dbe.businessModeller.vocabulary.ui.editors.entrydefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContextInformation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;
import org.dbe.businessModeller.BusinessModeller;
import org.dbe.businessModeller.IBusinessModellerDocument;
import org.dbe.businessModeller.enterprise.BusinessModellerDocument;
import org.dbe.businessModeller.logger.BusinessModellerLogger;
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.utils.ResourceProvider;
import org.dbe.businessModeller.vocabulary.enterprise.FactType;
import org.dbe.businessModeller.vocabulary.enterprise.IndividualConcept;
import org.dbe.businessModeller.vocabulary.enterprise.ObjectType;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.dbe.businessModeller.vocabulary.ui.editors.views.outline.VocabularyContentProvider;
import org.dbe.businessModeller.vocabulary.utils.VocabularyEntriesComparator;
import org.dbe.businessModeller.vocabulary.utils.VocabularyUtilities;

public class VocabularyCompletionProcessor implements IContentAssistProcessor {
	
	private static BusinessModellerLogger logger = (BusinessModellerLogger)BusinessModellerLogger.getLogger(VocabularyContentProvider.class);
	
	private final IContextInformation[] no_contexts = new IContextInformation[0];
	private final char[] proposal_activation_chars = new char[] {'\t', ':'};
	//private ICompletionProposal[] no_completions = new ICompletionProposal[0];
	protected final static String[] seAttributes= ResourceProvider.getAttributeCaption();

	//public VocabularyCompletionProcessor(){
		//
	//}
	

    public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int documentOffset) {
    	// BusinessModellerUtils.showMessage(prefix +"-"+ suffix);
		IDocument document = viewer.getDocument();
    	String prefix = getPrefix(document, documentOffset);
    	String suffix = getSuffix(document, documentOffset);
		return internalComputeCompletionProposals(document, documentOffset, prefix, suffix);
    }

    private String getAboveConceptType(IBusinessModellerDocument vocabulary, IDocument document, int documentOffset){
		// modified 2009 06 01, added factType and objectType popup menu separation
		String type = "";
		try {
			int aboveLineNumber = document.getLineOfOffset(documentOffset); // get upper line from current
			
			while(true){
				if(aboveLineNumber > 0) {
					aboveLineNumber -= 1; // to find objectType or factType above
				}
				else {
					break;
				}
				String upperLine = document.get(document.getLineOffset(aboveLineNumber), document.getLineLength(aboveLineNumber));
				upperLine = upperLine.trim();
				VocabularyEntry entry = vocabulary.getEntry(upperLine);
				if(entry != null){
					if (entry instanceof IndividualConcept){
						type = "individualConcept";
					}
					if (entry instanceof ObjectType){					
						type = "objectType";
					}
					else if (entry instanceof FactType){
						type = "factType";
					}
					break;
				}
			}
			
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return type;
    }
    
    private String showConceptTypes(IDocument document, int documentOffset){
		String showCaptionList = null;
		try {
			String currentLine = document.get(document.getLineOffset(document.getLineOfOffset(documentOffset)), document.getLineLength(document.getLineOfOffset(documentOffset)));
			currentLine = currentLine.trim();
			if(currentLine.lastIndexOf(":") != -1) {
				showCaptionList = currentLine.replace(":", "");
			}
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return showCaptionList;
    }
    
	private ICompletionProposal[] internalComputeCompletionProposals(IDocument document, int documentOffset, String prefix, String suffix) {
		int prefixLength = prefix.length();
		int suffixLength = suffix.length();
		ArrayList result= new ArrayList();
		IBusinessModellerDocument vocabulary = BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
		
		// added 2009 06 03
		String type = this.getAboveConceptType(vocabulary, document, documentOffset);
		String showConceptTypes = this.showConceptTypes(document, documentOffset);
		
		if(showConceptTypes == null){
			String [] objectTypeCaption = ResourceProvider.getFilteredAttributeCaption(type);
			for (int i= 0; i < objectTypeCaption.length; i++){
				String label = objectTypeCaption[i];
				int labelLength = label.length();
				try{
					if(label.startsWith(prefix)){
						String replacement = label.substring(prefixLength);
						int replacementLength = replacement.length();
						Image image = ResourceProvider.getImageDescriptor("caption.gif").createImage();
						ContextInformation contextInformation = new ContextInformation(label, "Insert the text: "+label);
						CompletionProposal completionProposal = new CompletionProposal(
								replacement, documentOffset, suffixLength, replacementLength,
								image, label, contextInformation, "");
								// quello che aggiunge,offset del testo da sostituire,lunghezza del testo da sostituire,
										// la posizione del cursore seguendo l'inserimento,
								// immagine, quello che appare nel box, context information associate al proposal, 
										// info aggiuntive associate al proposal 
						result.add(completionProposal);
					}
				}catch (Exception e) {
					result.add(new CompletionProposal(label, documentOffset, 0, labelLength));
				}
			}
		}
		
		if(showConceptTypes != null){
			Collection vocabularyEntries = vocabulary.getEntries();
			if(vocabularyEntries!=null){
				List orderedVocabularyEntries = Arrays.asList(vocabularyEntries.toArray());
		        Collections.sort(orderedVocabularyEntries, new VocabularyEntriesComparator());
				Iterator iteraVocabulary = orderedVocabularyEntries.iterator();
				while(iteraVocabulary.hasNext()){
					VocabularyEntry vocEntry = (VocabularyEntry)iteraVocabulary.next();
					if(VocabularyUtilities.getVocabularyEntryIdentifier(vocEntry)==BusinessModeller.FACT)continue;
					String representation = vocEntry.getPrimaryRepresentation().toString();
					try{
						if(representation.startsWith(prefix)){
							String replacement = representation.substring(prefixLength);
							int replacementLength = replacement.length();
							Image image = ResourceProvider.getImageFromVocabularyEntry(vocEntry);
							ContextInformation contextInformation = new ContextInformation(representation, "Insert the text: "+representation);
							CompletionProposal completionProposal = new CompletionProposal(
									replacement, documentOffset, suffixLength, replacementLength,
									image, representation, contextInformation, "");
							result.add(completionProposal);
						}
					}catch (Exception e) {
						result.add(new CompletionProposal(representation, documentOffset, 0, representation.toString().length()));
					}
	
				}
			}

			ArrayList<String> additional = ResourceProvider.getAdditionalConceptTypes(showConceptTypes);
			
			
			
			
			

			for(int i = 0; i < additional.size(); i++){
				
				String representation = additional.get(i);
				
				try{
					
					
						String replacement = representation.substring(prefixLength);
						int replacementLength = replacement.length();
						Image image = ResourceProvider.getAdditionalConceptsIcon();
						
						ContextInformation contextInformation = new ContextInformation(representation, "Insert the text: "+representation);
						CompletionProposal completionProposal = new CompletionProposal(
								replacement, documentOffset, suffixLength, replacementLength,
								image, representation, contextInformation, "");
						result.add(completionProposal);
					
					
					
				}catch (Exception e) {
					result.add(new CompletionProposal(representation, documentOffset, 0, representation.toString().length()));
				}
			}
			
			
			/*
			if(additional != null){
				for(int i = 0; i < additional.length; i++){
					String representation = additional[i];
					try{
						if(representation.startsWith(prefix)){
							String replacement = representation.substring(prefixLength);
							int replacementLength = replacement.length();
							Image image = ResourceProvider.getAdditionalConceptsIcon();
							ContextInformation contextInformation = new ContextInformation(representation, "Insert the text: "+representation);
							CompletionProposal completionProposal = new CompletionProposal(
									replacement, documentOffset, suffixLength, replacementLength,
									image, representation, contextInformation, "");
							result.add(completionProposal);
						}
					}catch (Exception e) {
						result.add(new CompletionProposal(representation, documentOffset, 0, representation.toString().length()));
					}
	
				}				
			}*/
		}
		
		

		
		if(result==null || result.size()==0){
			return null;
		}

		return (ICompletionProposal[])result.toArray(new ICompletionProposal[1]);
	}
	
	private String getPrefix(IDocument doc, int offset) {
		try {
			for (int n = offset-1; n >= 0; n--) {
				// System.out.print(".............."+n);
				char c = doc.getChar(n);
				// BusinessModellerUtils.showMessage(c+"");
				if (!Character.isLetterOrDigit(c) ){ //|| n==0){
					String prefix = doc.get(n + 1, offset-n-1); 
					// BusinessModellerUtils.showMessage(nextWord+"-");
					return prefix;
				}
			}
		} catch (BadLocationException x) {
			BusinessModellerUtils.showMessage(x.toString());
			x.printStackTrace();
		}
		try{
			return doc.get(0, offset);
		}catch (BadLocationException x) {
			BusinessModellerUtils.showMessage(x.toString());
			x.printStackTrace();
		}
		return "";
	}
	
	private String getSuffix(IDocument doc, int offset) {
		try {
			// BusinessModellerUtils.showMessage(doc.getLength()+"");
			for (int n = offset; n < doc.getLength(); n++) {
				//BusinessModellerUtils.showMessage("n: "+n);
				// System.out.print(".............."+n);
				char c = doc.getChar(n);
				// BusinessModellerUtils.showMessage(c+"");
				if (!(Character.isLetterOrDigit(c) || c==':' || c=='_') || n==doc.getLength()){
					String suffix = doc.get(offset, n-offset); 
					// BusinessModellerUtils.showMessage(nextWord+"-");
					return suffix;
				}
			}
		} catch (BadLocationException ex) {
			logger.warn(ex);
		}
		try{
			return doc.get(offset, doc.getLength()-offset);
		}catch (BadLocationException ex) {
			logger.warn(ex);
		}
		return "";
	}
	
	private String lastIndent(IDocument doc, int offset) {
		try {
			int start = offset-1;
			while (start >= 0 && doc.getChar(start)!= '\n')
				start--;
			int end = start;
			while (end < offset && Character.isSpaceChar(doc.getChar(end)))
				end++;
			return doc.get(start+1, end-start-1);
		} catch (BadLocationException ex) {
			logger.warn(ex);
		}
		return "";
	}
	
	//
/*
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int documentOffset) {
		//String prefix = lastWord(document, offset);
		// String indent = lastIndent(document, offset);
		ArrayList result= new ArrayList();
		for (int i= 0; i < seAttributes.length; i++)
			try{
				// TODO PP: sistemare la caption precise e il completamento automatico... anche gi�
				result.add(
						new CompletionProposal(seAttributes[i], documentOffset, 0, seAttributes[i].length(),
								ResourceProvider.getImageDescriptor("caption.gif").createImage(), seAttributes[i], new ContextInformation("tt", "uu"), "aa")
						);
			}catch (Exception e) {
				result.add(new CompletionProposal(seAttributes[i], documentOffset, 0, seAttributes[i].length()));
			}
		IBusinessModellerDocument vocabulary = BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);;
		Collection vocabularyEntries = vocabulary.getEntries();
		if(vocabularyEntries!=null){
			List orderedVocabularyEntries = Arrays.asList(vocabularyEntries.toArray());
	        Collections.sort(orderedVocabularyEntries, new VocabularyEntriesComparator());
			Iterator iteraVocabulary = orderedVocabularyEntries.iterator();
			while(iteraVocabulary.hasNext()){
				VocabularyEntry vocEntry = (VocabularyEntry)iteraVocabulary.next();
				if(VocabularyUtilities.getVocabularyEntryIdentifier(vocEntry)==BusinessModeller.FACT)continue;
				String representation = vocEntry.getPrimaryRepresentation().toString();
				//result.add(new CompletionProposal(representation, documentOffset, 0, representation.toString().length()));
				try{
					result.add(
							new CompletionProposal(representation, documentOffset, 0, representation.toString().length(),
									ResourceProvider.getImageFromVocabularyEntry(vocEntry), representation, new ContextInformation("tt", "uu"), "aa")
							);
				}catch (Exception e) {
					result.add(new CompletionProposal(representation, documentOffset, 0, representation.toString().length()));
				}

			}
		}
		return (ICompletionProposal[])result.toArray(new ICompletionProposal[1]);
		// return no_completions;
	}
*/
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return no_contexts;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return proposal_activation_chars;
	}
	
	/* (non-Javadoc)
	 * Method declared on IContentAssistProcessor
	 */
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	/* (non-Javadoc)
	 * Method declared on IContentAssistProcessor
	 */
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	/* (non-Javadoc)
	 * Method declared on IContentAssistProcessor
	 */
	public String getErrorMessage() {
		return null;
	}
}
