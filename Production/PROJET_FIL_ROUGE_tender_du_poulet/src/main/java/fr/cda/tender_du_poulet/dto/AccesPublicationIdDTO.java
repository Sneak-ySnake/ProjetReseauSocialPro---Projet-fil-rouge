package fr.cda.tender_du_poulet.dto;

import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.Publication;
import fr.cda.tender_du_poulet.beans.Utilisateur;

@Component
public class AccesPublicationIdDTO {

	private Utilisateur utilisateur;

	private Publication publication;

	
		///CONSTRUCTEUR///
	
	public AccesPublicationIdDTO() {
		
	}

		///GETTER SETTER///
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	public Publication getPublication() {
		return publication;
	}


	public void setPublication(Publication publication) {
		this.publication = publication;
	}
	
}
