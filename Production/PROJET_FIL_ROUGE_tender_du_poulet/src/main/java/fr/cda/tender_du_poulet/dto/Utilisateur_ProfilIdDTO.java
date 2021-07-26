package fr.cda.tender_du_poulet.dto;

import org.springframework.stereotype.Component;

@Component
public class Utilisateur_ProfilIdDTO {
	private UtilisateurDTO utilisateurDTO;
	private ProfilDTO profilDTO;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_ProfilIdDTO() {
	}
	
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
