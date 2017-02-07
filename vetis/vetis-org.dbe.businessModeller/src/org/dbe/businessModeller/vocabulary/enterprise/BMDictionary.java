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
 * @author Maurizio De Tommasi
 * @author Pierpaolo Cira
 */
package org.dbe.businessModeller.vocabulary.enterprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import net.didion.jwnl.data.IndexWord;
import net.didion.jwnl.data.IndexWordSet;
import net.didion.jwnl.data.POS;
import net.didion.jwnl.data.PointerUtils;
import net.didion.jwnl.data.Synset;
import net.didion.jwnl.data.list.PointerTargetNode;
import net.didion.jwnl.data.list.PointerTargetNodeList;
import net.didion.jwnl.dictionary.Dictionary;
import net.didion.jwnl.dictionary.MapBackedDictionary;

public class BMDictionary {
	
	private Dictionary mapBackedDictionary=null;
	private static BMDictionary bmDictionary = null;
	private PointerUtils pointerUtils = null;
	
	public static BMDictionary getInstance(){
		if (bmDictionary==null)
			bmDictionary = new BMDictionary();
		return bmDictionary;
		
		
	}
	
	private BMDictionary(){
		mapBackedDictionary = MapBackedDictionary.getInstance();
		pointerUtils = PointerUtils.getInstance();
	}
	
	public boolean isTerm(String word){
		IndexWord indexWord = null;
		try {
			indexWord = mapBackedDictionary.getIndexWord(POS.NOUN, word.trim());
		} catch (Exception e) {
			System.out.println("Term " + word + " not found");
			//e.printStackTrace();
		}
		return indexWord!=null;
	}
	
	public boolean isPredicate(String word){
		IndexWord indexWord = null;
		try {
			indexWord = mapBackedDictionary.lookupIndexWord(POS.VERB, word.trim());
		} catch (Exception e) {
			System.out.println("Verb " + word + " not found");
			//e.printStackTrace();
		}
		return indexWord!=null;
	}
	
	public Synset[] getSynonyms(String word){
		try {
			// Crea l'ArrayList di risultati
			ArrayList synonym = new ArrayList();
			// Esegue un lookup di tutte le occorrenze di word nel dictionary
			IndexWordSet indexWordSet = mapBackedDictionary.lookupAllIndexWords(word);
			// Cicla la lista di IndexWord ricevute
			Iterator iterator = indexWordSet.getIndexWordCollection().iterator();
			while (iterator.hasNext()){
				IndexWord indexWord = (IndexWord)iterator.next();
				// Metto tutti i sense di questa IndexWord in un vettore di Synset
				Synset[] thisSynset = indexWord.getSenses();
				// Se il vettore è vuoto vado alla prossima IndexWord
				if(thisSynset==null || thisSynset.length<1)continue;
				// Aggiunge ogni singolo Synset nei risultati
				synonym.addAll(Arrays.asList(thisSynset));
			}
			// Converte i risultati in un Synset[] e lo restituisce
			return (Synset[])synonym.toArray(new Synset[synonym.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	public String[] getDefinitions(String word){
		String[] retVal = null;
		return retVal;
	}
	
	public Synset[] getHypernyms(String word){
		try {
			// Crea l'ArrayList di risultati
			ArrayList hypernnym = new ArrayList();
			// Esegue un lookup di tutte le occorrenze di word nel dictionary
			IndexWordSet indexWordSet = mapBackedDictionary.lookupAllIndexWords(word);
			// Cicla la lista di IndexWord ricevute
			Iterator indexWordSetIterator = indexWordSet.getIndexWordCollection().iterator();
			while (indexWordSetIterator.hasNext()){
				IndexWord thisIndexWord = (IndexWord)indexWordSetIterator.next();
				// Metto tutti i sense di questa IndexWord in un vettore di Synset
				Synset[] indexWordSynset = thisIndexWord.getSenses();
				// Se il vettore è vuoto vado alla prossima IndexWord
				if(indexWordSynset==null || indexWordSynset.length<1)continue;
				for(int countSynset=0; countSynset < indexWordSynset.length; countSynset++){
					PointerTargetNodeList pointerTargetNodeList = pointerUtils.getDirectHypernyms(indexWordSynset[countSynset]);
					Iterator nodeIterator = pointerTargetNodeList.iterator();
					while (nodeIterator.hasNext()){
						PointerTargetNode pointerTargetNode = (PointerTargetNode)nodeIterator.next();
						Synset nodeSynset = pointerTargetNode.getSynset();
						hypernnym.add(nodeSynset);
					}	
				}
			}
			return (Synset[])hypernnym.toArray(new Synset[hypernnym.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Synset[] getHyponyms(String word){
		try {
			// Crea l'ArrayList di risultati
			ArrayList hypernnym = new ArrayList();
			// Esegue un lookup di tutte le occorrenze di word nel dictionary
			IndexWordSet indexWordSet = mapBackedDictionary.lookupAllIndexWords(word);
			// Cicla la lista di IndexWord ricevute
			Iterator indexWordSetIterator = indexWordSet.getIndexWordCollection().iterator();
			while (indexWordSetIterator.hasNext()){
				IndexWord thisIndexWord = (IndexWord)indexWordSetIterator.next();
				// Metto tutti i sense di questa IndexWord in un vettore di Synset
				Synset[] indexWordSynset = thisIndexWord.getSenses();
				// Se il vettore è vuoto vado alla prossima IndexWord
				if(indexWordSynset==null || indexWordSynset.length<1)continue;
				for(int countSynset=0; countSynset < indexWordSynset.length; countSynset++){
					PointerTargetNodeList pointerTargetNodeList = pointerUtils.getDirectHyponyms(indexWordSynset[countSynset]);
					Iterator nodeIterator = pointerTargetNodeList.iterator();
					while (nodeIterator.hasNext()){
						PointerTargetNode pointerTargetNode = (PointerTargetNode)nodeIterator.next();
						Synset nodeSynset = pointerTargetNode.getSynset();
						hypernnym.add(nodeSynset);
					}	
				}
			}
			return (Synset[])hypernnym.toArray(new Synset[hypernnym.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/*
	METODO DI MATCHING PER IL QUERYTOOL
	public Synset[] getHypernyms(String word){
		try {
			Synset synset1 = null;
			Synset synset2 = null;
			IndexWordSet indexWordSet1 = mapBackedDictionary.lookupAllIndexWords(word);
			IndexWordSet indexWordSet2 = mapBackedDictionary.lookupAllIndexWords("animal");
			Collection collection1 = indexWordSet1.getIndexWordCollection(); 
			Collection collection2 = indexWordSet2.getIndexWordCollection();
			Iterator iterator1 = collection1.iterator();
			Iterator iterator2 = collection2.iterator();
			int numSyn1 = 0;
			int numSyn2 = 0;
			while (iterator1.hasNext()){
				IndexWord indexWord1 = (IndexWord)iterator1.next();
				Synset[] thisSynset1 = indexWord1.getSenses();
				if(thisSynset1==null || thisSynset1.length<1)continue;
				numSyn1 += thisSynset1.length;
				for(int countSynset1=0; countSynset1< thisSynset1.length; countSynset1++){
					synset1 = thisSynset1[countSynset1];
					while (iterator2.hasNext()){
						IndexWord indexWord2 = (IndexWord)iterator2.next();
						Synset[] thisSynset2 = indexWord2.getSenses();
						if(thisSynset2==null || thisSynset2.length<1)continue;
						numSyn2 += thisSynset2.length;
						for(int countSynset2=0; countSynset2< thisSynset2.length; countSynset2++){
							synset2 = thisSynset2[countSynset2];
							RelationshipList relationshipList = RelationshipFinder.getInstance().findRelationships(synset1, synset2, PointerType.HYPERNYM);
//							BusinessModellerUtils.showMessage("La dimensione della lista di relazioni: "+relationshipList.size());
							System.out.println("--------------------------------------------------------");
							System.out.println("La dimensione della lista di relazioni: "+relationshipList.size());
							if(relationshipList.size()==0)continue;
							Relationship relationship = relationshipList.getShallowest();
//							BusinessModellerUtils.showMessage("La profondità dello shallow est: "+relationship.getDepth());						
							System.out.println("La profondità dello shallow est: "+relationship.getDepth());
							System.out.println("Il tipo della relaizone (shallow) è: "+relationship.getType());
							Object node[] = relationship.getNodeList().toArray();
							for (int countNode=0; countNode<node.length; countNode++){
								System.out.println("Il nodo"+countNode+" è: "+node[countNode]);	
							}
							System.out.println("Synset1: "+synset1.toString());
							System.out.println("Synset2: "+synset2.toString());
						}
					}
				}
			}
			BusinessModellerUtils.showMessage("Size di Synset1:"+numSyn2+" -- "+"Size di Synset2:"+numSyn2);
			
			/*
			IndexWordSet indexWordSet1 = mapBackedDictionary.lookupAllIndexWords(word);
			IndexWordSet indexWordSet2 = mapBackedDictionary.lookupAllIndexWords("cat");
			IndexWord indexWord1 = indexWordSet1.getIndexWord(POS.NOUN);
			IndexWord indexWord2 = indexWordSet2.getIndexWord(POS.NOUN);
			Synset synset1 = null;
			for(int k=0; k<indexWord1.getSenses().length; k++){
				synset1 = indexWord1.getSenses()[k];
				if(synset1!=null && synset1.getWords().length>0)break;
				k++;
			}
			Synset synset2 = null;
			for(int k=0; k<indexWord2.getSenses().length; k++){
				synset2 = indexWord2.getSenses()[k];
				if(synset2!=null && synset2.getWords().length>0)break;
				k++;
			}
			RelationshipList relationshipList = RelationshipFinder.getInstance().findRelationships(synset1, synset2, PointerType.SIMILAR_TO);
			Relationship relationship = relationshipList.getShallowest();
			BusinessModellerUtils.showMessage("La profondità dello shallow est: "+relationship.getDepth());
			*/
			
			/*
			
			// Crea l'ArrayList di risultati
			ArrayList hypernym = new ArrayList();
			// Esegue un lookup di tutte le occorrenze di word nel dictionary
			IndexWordSet indexWordSet = mapBackedDictionary.lookupAllIndexWords(word);
			// Cicla la lista di IndexWord ricevute
			Iterator iterator = indexWordSet.getIndexWordCollection().iterator();
			while (iterator.hasNext()){
				IndexWord indexWord = (IndexWord)iterator.next();
				// Metto tutti i sense di questa IndexWord in un vettore di Synset
				Synset[] thisSynset = indexWord.getSenses();
				// Se il vettore è vuoto vado alla prossima IndexWord
				if(thisSynset==null || thisSynset.length<1)continue;
				// Aggiunge ogni singolo Synset nei risultati
				hypernym.addAll(Arrays.asList(thisSynset));
			}
			// Converte i risultati in un Synset[] e lo restituisce
			return (Synset[])hypernym.toArray(new Synset[hypernym.size()]);*//*
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
*/
	
//	public Synset[] getHyponyms(String word){
//		try {
//			// Crea l'ArrayList di risultati
//			ArrayList synonym = new ArrayList();
//			// Mette in un iterator una lista di IndexWords (divisione per POS)
//			IndexWordSet indexWordSet = mapBackedDictionary.lookupAllIndexWords(word);
//			Iterator iterator = indexWordSet.getIndexWordCollection().iterator();
//			// Cicla la lista delle IndexWords costruita
//			while (iterator.hasNext()){
//				IndexWord indexWord = (IndexWord)iterator.next();
//				Synset[] thisSynset = indexWord.getSenses();
//				if(thisSynset==null || thisSynset.length<1)continue;
//				// Aggiunge ogni singolo Synset nei risultati
//				
//				BusinessModellerUtils.showMessage("---Numero di Synset di IndexWords" + thisSynset.length);
//				PointerTargetNodeList pointerTargetNodeList = pointerUtils.getDirectHyponyms(thisSynset[0]);
//				Iterator nodeIterator = pointerTargetNodeList.iterator();
//				int bbb = 0;
//				while (nodeIterator.hasNext()){
//					PointerTargetNode pointerTargetNode = (PointerTargetNode)nodeIterator.next();
//					
//					Synset synset = pointerTargetNode.getSynset();
//					
//					//BusinessModellerUtils.showMessage(synset);
//					// break;
//					bbb++;
//				}
//				BusinessModellerUtils.showMessage("Numero iponimi di Synset0 di IndexWords" + bbb);
//				
//				
//				
//				synonym.addAll(Arrays.asList(thisSynset));
//			}
//			// Converte i risultati in un Synset[] e lo restituisce
//			return (Synset[])synonym.toArray(new Synset[synonym.size()]);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}

}
