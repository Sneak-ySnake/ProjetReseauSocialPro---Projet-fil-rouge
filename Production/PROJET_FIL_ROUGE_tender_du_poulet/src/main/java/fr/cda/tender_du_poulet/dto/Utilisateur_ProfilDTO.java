package fr.cda.tender_du_poulet.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Utilisateur_ProfilDTO {
	@Id @EmbeddedId @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Utilisateur_ProfilIdDTO utilisateur_ProfilIdDTO;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_ProfilDTO(Utilisateur_ProfilIdDTO utilisateur_ProfilIdDTO) {
		this.utilisateur_ProfilIdDTO = utilisateur_ProfilIdDTO;
	}

	
/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_ProfilIdDTO getUtilisateur_ProfilIdDTO() {
		return utilisateur_ProfilIdDTO;
	}
	public void setUtilisateur_ProfilIdDTO(Utilisateur_ProfilIdDTO utilisateur_ProfilIdDTO) {
		this.utilisateur_ProfilIdDTO = utilisateur_ProfilIdDTO;
	}
}
