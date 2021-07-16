package fr.cda.tender_du_poulet.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Utilisateur_ProfilIdDTO implements Serializable {
	private UtilisateurDTO utilisateurDTO;
	private ProfilDTO profilDTO;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_ProfilIdDTO(UtilisateurDTO utilisateurDTO, ProfilDTO profilDTO) {
		this.utilisateurDTO = utilisateurDTO;
		this.profilDTO = profilDTO;
	}


/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public UtilisateurDTO getUtilisateurDTO() {
		return utilisateurDTO;
	}
	public void setUtilisateurDTO(UtilisateurDTO utilisateurDTO) {
		this.utilisateurDTO = utilisateurDTO;
	}
	
	public ProfilDTO getProfilDTO() {
		return profilDTO;
	}
	public void setProfilDTO(ProfilDTO profilDTO) {
		this.profilDTO = profilDTO;
	}	
	
}
