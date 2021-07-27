package fr.cda.tender_du_poulet.beans;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class AdministrerPublicationId implements Serializable {
	
	@ManyToOne() @JoinColumn(name="id_admin")
	private Admin admin;
	@ManyToOne() @JoinColumn(name="id_action_sur_publication")
	private ActionSurPublication action_sur_publication;
	
	@ManyToOne() @JoinColumn(name ="id_publication")
	private Publication publication;
	
	@JoinColumn (name ="date_action_sur_publication")
	private Date date_action_sur_publication;
	
	
	/////// constructeur///////
	public AdministrerPublicationId() {
		
	}
	
	public AdministrerPublicationId (Admin admin, ActionSurPublication action_sur_publication,
			Publication publication,Date date_action_sur_publication){
		this.admin = admin;
		this.action_sur_publication = action_sur_publication;
		this.publication = publication;
		this.date_action_sur_publication = date_action_sur_publication;
	}

	
	////// GETTER et SETTER ///////
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public ActionSurPublication getAction_sur_publication() {
		return action_sur_publication;
	}

	public void setAction_sur_publication(ActionSurPublication action_sur_publication) {
		this.action_sur_publication = action_sur_publication;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public Date getDate_action_sur_publication() {
		return date_action_sur_publication;
	}

	public void setDate_action_sur_publication(Date date_action_sur_publication) {
		this.date_action_sur_publication = date_action_sur_publication;
	}

}
