package fr.cda.tender_du_poulet.dto;

public class Utilisateur_ProfilDTO {
	private Utilisateur_ProfilIdDTO utilisateur_ProfilId;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_ProfilDTO() {
	}
	
	
/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_ProfilIdDTO getUtilisateur_ProfilId() {
		return utilisateur_ProfilId;
	}
	public void setUtilisateur_ProfilId(Utilisateur_ProfilIdDTO utilisateur_ProfilId) {
		this.utilisateur_ProfilId = utilisateur_ProfilId;
	}
}
