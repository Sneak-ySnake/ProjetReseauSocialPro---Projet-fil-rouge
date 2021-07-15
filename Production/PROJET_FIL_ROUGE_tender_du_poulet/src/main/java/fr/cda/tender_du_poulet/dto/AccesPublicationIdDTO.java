package fr.cda.tender_du_poulet.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.Publication;
import fr.cda.tender_du_poulet.beans.Utilisateur;

@Component
public class AccesPublicationIdDTO {

	private UtilisateurDTO utilisateur;

	private PublicationDTO publication;

	
		///CONSTRUCTEUR///
	public AccesPublicationIdDTO() {
		
	}
	
	public AccesPublicationIdDTO(UtilisateurDTO utilisateur, PublicationDTO publication) {
		this.utilisateur = utilisateur;
		this.publication = publication;
	}

	
		///GETTER SETTER///
	public UtilisateurDTO getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}

	public PublicationDTO getPublication() {
		return publication;
	}

	public void setPublication(PublicationDTO publication) {
		this.publication = publication;
	}
	
	
}
