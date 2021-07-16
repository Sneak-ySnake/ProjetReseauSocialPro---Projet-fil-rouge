package fr.cda.tender_du_poulet.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import fr.cda.tender_du_poulet.beans.Utilisateur_EtatCompteId;

public class Utilisateur_EtatCompteDTO {
	@EmbeddedId @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Utilisateur_EtatCompteId utilisateur_EtatCompteId;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_EtatCompteDTO(Utilisateur_EtatCompteId utilisateur_EtatCompteId) {
		this.utilisateur_EtatCompteId = utilisateur_EtatCompteId;
	}


/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_EtatCompteId getUtilisateur_EtatCompteId() {
		return utilisateur_EtatCompteId;
	}
	public void setUtilisateur_EtatCompteId(Utilisateur_EtatCompteId utilisateur_EtatCompteId) {
		this.utilisateur_EtatCompteId = utilisateur_EtatCompteId;
	}
}
