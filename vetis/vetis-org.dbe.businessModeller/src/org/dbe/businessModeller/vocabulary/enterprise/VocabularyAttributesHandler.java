package org.dbe.businessModeller.vocabulary.enterprise;

import java.util.HashMap;
import java.util.Iterator;


public class VocabularyAttributesHandler {

	private HashMap<String, String> attributes;
	/**
	 * Getter of the property <tt>primaryRepresentation</tt>
	 * @return  Returns the primaryRepresentation.
	 * @uml.property  name="primaryRepresentation"
	 */
	public VocabularyAttributesHandler(){
		attributes  = new HashMap<String, String>();
	}
	public String getAttribute(String primaryRepresentation, String attributeName) {
		String attributeValue = "";
		if(attributes.get(primaryRepresentation + "|" + attributeName) != null){
			attributeValue = attributes.get(primaryRepresentation + "|" + attributeName).toString();
		}
		else{ // if not found, set it to text
			attributeValue = "";
		}
		
		return attributeValue;
	}
	public void setAttributes(VocabularyEntry entry) {
		String primaryRepresentation = entry.getPrimaryRepresentation().toString();
		if(entry.getAttributes() != null){
			for (Iterator i = entry.getAttributes().iterator();i.hasNext();){
				VocabularyAttribute attribute = (VocabularyAttribute) i.next();
				String val = "";
				if(attribute.getValue() != null) {
					val = attribute.getValue().toString();
				
					// check, if we don't have the attribute with the same caption in the hashmap
					String old = attributes.get(primaryRepresentation + "|" + attribute.getCaption());
					if(old != null && (attribute.getCaption().equals("Synonym:") || attribute.getCaption().equals("Synonymous_form:"))) {
						// attribute exists, append it, separating by comma
						attributes.put(primaryRepresentation + "|" + attribute.getCaption(), old + "," + attribute.getValue().toString());
					}
					else // create new attribute
						attributes.put(primaryRepresentation + "|" + attribute.getCaption(), attribute.getValue().toString());
				}
			}
		}
	}
}
