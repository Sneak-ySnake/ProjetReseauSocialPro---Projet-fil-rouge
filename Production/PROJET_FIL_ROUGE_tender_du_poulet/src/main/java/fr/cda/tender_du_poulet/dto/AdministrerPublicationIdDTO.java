package fr.cda.tender_du_poulet.dto;

import java.util.Date;
import fr.cda.tender_du_poulet.beans.ActionSurPublication;
import fr.cda.tender_du_poulet.beans.Admin;
import fr.cda.tender_du_poulet.beans.Publication;

public class AdministrerPublicationIdDTO {
	
	private AdminDTO admin;
	private ActionSurPublicationDTO action_sur_publication;
	private PublicationDTO publication;
	private Date date_action_sur_publication;
	
	
			///constructeur ///
	
	public AdministrerPublicationIdDTO() {
		
	}
	
	public AdministrerPublicationIdDTO (AdminDTO admin, ActionSurPublicationDTO action_sur_publication,
			PublicationDTO publication,Date date_action_sur_publication){
		this.admin = admin;
		this.action_sur_publication = action_sur_publication;
		this.publication = publication;
		this.date_action_sur_publication = date_action_sur_publication;
	}
	
		/// GETTER ET SETTER///
	
	public AdminDTO getAdmin() {
		return admin;
	}

	public void setAdmin(AdminDTO admin) {
		this.admin = admin;
	}

	public ActionSurPublicationDTO getAction_sur_publication() {
		return action_sur_publication;
	}

	public void setAction_sur_publication(ActionSurPublicationDTO action_sur_publication) {
		this.action_sur_publication = action_sur_publication;
	}

	public PublicationDTO getPublication() {
		return publication;
	}

	public void setPublication(PublicationDTO publication) {
		this.publication = publication;
	}

	public Date getDate_action_sur_publication() {
		return date_action_sur_publication;
	}

	public void setDate_action_sur_publication(Date date_action_sur_publication) {
		this.date_action_sur_publication = date_action_sur_publication;
	}

}
