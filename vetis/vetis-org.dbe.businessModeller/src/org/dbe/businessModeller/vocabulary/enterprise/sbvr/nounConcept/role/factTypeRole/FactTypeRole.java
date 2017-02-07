package org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.role.factTypeRole;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.role.Role;

public class FactTypeRole extends Role{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newAttributesHandler
	 */
	public FactTypeRole(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newAttributesHandler);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.role.Role#create(java.lang.String)
	 */
	public SBVR.Designation create(String primaryRepresentation){
		
		// check, if there exists such role
		//SBVR.Designation designationFound = list_checker.checkForObjectType(primaryRepresentation);
		
		//if(designationFound == null) {
			
			// create role object
			SBVR.Role factTypeRole = sbvr_factory.createFactTypeRole();
			
			// create Text object
			SBVR.Text text = this.createVetisText(primaryRepresentation); 
			
			// create Designation object
			SBVR.Designation designation = this.createVetisDesignation(factTypeRole, text);
			
			// create Term object
			SBVR.Term term = this.createVetisTerm(factTypeRole, text);
			
			// add all created objects to conceptList
			conceptualSchema.getConcept().add(factTypeRole);
			thingList.add(text);
			thingList.add(designation);
			thingList.add(term);
			
			return designation;
		//}
		//else{
			//return designationFound;
		//}
	}
}