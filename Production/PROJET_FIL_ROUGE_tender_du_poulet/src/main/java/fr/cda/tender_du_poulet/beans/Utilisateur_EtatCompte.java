package fr.cda.tender_du_poulet.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity @Table(name="utilisateur_etat_compte")
public class Utilisateur_EtatCompte {
	@EmbeddedId @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Utilisateur_EtatCompteId utilisateur_EtatCompteId;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_EtatCompte() {
	}

	public Utilisateur_EtatCompte(Utilisateur_EtatCompteId utilisateur_EtatCompteId) {
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
