package fr.cda.tender_du_poulet.dto;

import org.springframework.stereotype.Component;

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
