package org.dbe.businessModeller.vocabulary.enterprise;

import java.util.ArrayList;

public class RuleSetEntry {

	private String text = "";
	
	private ArrayList<Rule> rules;
	
	public RuleSetEntry(String newText) {
		text = newText;
		rules = new ArrayList<Rule>();
	}
	
	/**
	 * Text getter
	 * @return text
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * Rules getter
	 * @return rules
	 */
	public ArrayList<Rule> getRules() {
		return rules;
	}
}
