package fr.cda.tender_du_poulet.dto;

import fr.cda.tender_du_poulet.beans.Utilisateur_ProfilId;

public class Utilisateur_ProfilDTO {
	private Utilisateur_ProfilId utilisateur_ProfilId;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_ProfilDTO() {
	}

	public Utilisateur_ProfilDTO(Utilisateur_ProfilId utilisateur_ProfilId) {
		this.utilisateur_ProfilId = utilisateur_ProfilId;
	}
	
/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_ProfilId getUtilisateur_ProfilId() {
		return utilisateur_ProfilId;
	}
	public void setUtilisateur_ProfilId(Utilisateur_ProfilId utilisateur_ProfilId) {
		this.utilisateur_ProfilId = utilisateur_ProfilId;
	}
}
