package fr.cda.tender_du_poulet.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Utilisateur_EtatCompteDTO {
	@EmbeddedId @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Utilisateur_EtatCompteIdDTO utilisateur_EtatCompteIdDTO;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_EtatCompteDTO(Utilisateur_EtatCompteIdDTO utilisateur_EtatCompteIdDTO) {
		this.utilisateur_EtatCompteIdDTO = utilisateur_EtatCompteIdDTO;
	}


/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_EtatCompteIdDTO getUtilisateur_EtatCompteIdDTO() {
		return utilisateur_EtatCompteIdDTO;
	}
	public void setUtilisateur_EtatCompteIdDTO(Utilisateur_EtatCompteIdDTO utilisateur_EtatCompteIdDTO) {
		this.utilisateur_EtatCompteIdDTO = utilisateur_EtatCompteIdDTO;
	}
}
