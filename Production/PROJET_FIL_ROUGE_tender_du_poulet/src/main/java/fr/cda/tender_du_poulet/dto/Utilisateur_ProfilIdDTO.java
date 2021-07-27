package fr.cda.tender_du_poulet.dto;

import org.springframework.stereotype.Component;

@Component
public class Utilisateur_ProfilIdDTO {
	private UtilisateurDTO utilisateur;
	private ProfilDTO profil;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_ProfilIdDTO() {
	}


/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public UtilisateurDTO getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public ProfilDTO getProfil() {
		return profil;
	}
	public void setProfil(ProfilDTO profil) {
		this.profil = profil;
	}	
	
}
