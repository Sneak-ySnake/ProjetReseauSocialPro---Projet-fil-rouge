package fr.cda.tender_du_poulet.dto;

public class Utilisateur_EtatCompteDTO {
	private Utilisateur_EtatCompteIdDTO utilisateur_EtatCompteId;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_EtatCompteDTO() {
	}


/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_EtatCompteIdDTO getUtilisateur_EtatCompteId() {
		return utilisateur_EtatCompteId;
	}
	public void setUtilisateur_EtatCompteId(Utilisateur_EtatCompteIdDTO utilisateur_EtatCompteId) {
		this.utilisateur_EtatCompteId = utilisateur_EtatCompteId;
	}
}
