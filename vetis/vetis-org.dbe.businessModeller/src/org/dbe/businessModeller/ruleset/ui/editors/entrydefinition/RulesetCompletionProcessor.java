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
package org.dbe.businessModeller.ruleset.ui.editors.entrydefinition;

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
import org.dbe.businessModeller.utils.BusinessModellerUtils;
import org.dbe.businessModeller.utils.ResourceProvider;
import org.dbe.businessModeller.vocabulary.enterprise.VocabularyEntry;
import org.dbe.businessModeller.vocabulary.utils.VocabularyEntriesComparator;
import org.dbe.businessModeller.vocabulary.utils.VocabularyUtilities;

// TODO PP: fare un'unica classe astratta con tutti i completion processor

public class RulesetCompletionProcessor implements IContentAssistProcessor {
	private final IContextInformation[] no_contexts = new IContextInformation[0];
	private final char[] proposal_activation_chars = new char[] {'\n'};
	private ICompletionProposal[] no_completions = new ICompletionProposal[0];
	protected final static String[] seAttributes= ResourceProvider.getRulesetCaption();

	//public RulesetCompletionProcessor(){
		//
	//}
	

    public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int documentOffset) {
		IDocument document = viewer.getDocument();
    	String prefix = getPrefix(document, documentOffset);
    	String suffix = getSuffix(document, documentOffset);
    	String attributePrefix = getAttributePrefix(document, documentOffset);
    	String attributeSuffix = getAttributeSuffix(document, documentOffset);
		return internalComputeCompletionProposals(document, documentOffset, prefix, suffix, attributePrefix, attributeSuffix);
    }

	private ICompletionProposal[] internalComputeCompletionProposals(IDocument document, int documentOffset, String prefix,
																	String suffix, String attributePrefix, String attributeSuffix) {
		
		int attributePrefixLength = attributePrefix.length();
		int attributeSuffixLength = attributeSuffix.length();
		int prefixLength = prefix.length();
		int suffixLength = suffix.length();
		
		ArrayList result= new ArrayList();
		for (int i= 0; i < seAttributes.length; i++){
			String label = seAttributes[i];
			int labelLength = label.length();
			try{
				if(label.startsWith(attributePrefix)){
					String replacement = label.substring(attributePrefixLength);
					int replacementLength = replacement.length();
					Image image = ResourceProvider.getImageDescriptor("caption.gif").createImage();
					ContextInformation contextInformation = new ContextInformation(label, "Insert the text: "+label);
					CompletionProposal completionProposal = new CompletionProposal(
							replacement, documentOffset, attributeSuffixLength, replacementLength,
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
		IBusinessModellerDocument vocabulary = BusinessModellerDocument.getInstance(BusinessModeller.DOCUMENT_VOCABULARY);
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
		if(result==null || result.size()==0){
			return null;
		}
		return (ICompletionProposal[])result.toArray(new ICompletionProposal[1]);
	}
	
	private String getAttributePrefix(IDocument doc, int offset) {
		try {
			for (int n = offset-1; n >= 0; n--) {
				// System.out.print(".............."+n);
				char c = doc.getChar(n);
				// BusinessModellerUtils.showMessage(c+"");
				if (!Character.isLetterOrDigit(c)){ //|| n==0){
					String prefix = doc.get(n + 1, offset-n-1);
					if(!arrayContainsPart(seAttributes, prefix)){
						// BusinessModellerUtils.showMessage("-"+prefix+"-");
						prefix = prefix.replaceAll("\n", "");
						prefix = prefix.replaceAll("\r", "");
						return prefix;
					}
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
	
	private String getAttributeSuffix(IDocument doc, int offset) {
		try {
			// BusinessModellerUtils.showMessage(doc.getLength()+"");
			for (int n = offset; n <= doc.getLength(); n++) {
				// BusinessModellerUtils.showMessage(n+"");
				// System.out.print(".............."+n);
				char c = doc.getChar(n);
				// BusinessModellerUtils.showMessage(c+"");
				if (!(Character.isLetterOrDigit(c) || c==':' || c=='_') || n==doc.getLength()) {
					String suffix = doc.get(offset, n-offset); 
					if(!arrayContainsPart(seAttributes, suffix)){
						// BusinessModellerUtils.showMessage("-"+prefix+"-");
						suffix = suffix.replaceAll("\n", "");
						suffix = suffix.replaceAll("\r", "");
						return suffix;
					}
				}
			}
		} catch (BadLocationException x) {
			x.printStackTrace();
		}
		try{
			return doc.get(offset, doc.getLength()-offset);
		}catch (BadLocationException x) {
			x.printStackTrace();
		}
		return "";
	}
	
	private String getPrefix(IDocument doc, int offset) {
		try {
			for (int n = offset-1; n >= 0; n--) {
				char c = doc.getChar(n);
				if (!Character.isLetterOrDigit(c) ){ //|| n==0){
					String prefix = doc.get(n + 1, offset-n-1); 
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
			for (int n = offset; n <= doc.getLength(); n++) {
				char c = doc.getChar(n);
				if (!(Character.isLetterOrDigit(c) || c==':' || c=='_') || n==doc.getLength()){
					String suffix = doc.get(offset, n-offset); 
					return suffix;
				}
			}
		} catch (BadLocationException x) {
			x.printStackTrace();
		}
		try{
			return doc.get(offset, doc.getLength()-offset);
		}catch (BadLocationException x) {
			x.printStackTrace();
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
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		return "";
	}
	
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
	
	private boolean arrayContainsPart(String[] array, String part){
		// Patch per l'inizio delle parole
		if(part.equals(""))return true;
		
		for(int k=0; k<array.length; k++){
			String thisWord = array[k];
			// BusinessModellerUtils.showMessage(array[k]);
			if (thisWord.indexOf(part)>-1){
				// BusinessModellerUtils.showMessage(part + " - ;" + array[k] + "; - true");
				return !(thisWord.startsWith(part) || thisWord.endsWith(part));
				//return true;
			}
		}
		// BusinessModellerUtils.showMessage("false");
		return false;
	}
}
