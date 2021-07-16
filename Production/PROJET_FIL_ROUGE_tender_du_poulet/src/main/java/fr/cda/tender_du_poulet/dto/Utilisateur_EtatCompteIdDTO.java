package fr.cda.tender_du_poulet.dto;

import java.util.Date;

import fr.cda.tender_du_poulet.beans.EtatCompte;
import fr.cda.tender_du_poulet.beans.Utilisateur;

public class Utilisateur_EtatCompteIdDTO {
	private Utilisateur utilisateur;
	private EtatCompte etat_compte;
	private Date date_debut;

	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_EtatCompteIdDTO(Utilisateur utilisateur, EtatCompte etat_compte, Date date_debut) {
		this.utilisateur = utilisateur;
		this.etat_compte = etat_compte;
		this.date_debut = date_debut;
	}


/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public EtatCompte getEtat_compte() {
		return etat_compte;
	}
	public void setEtat_compte(EtatCompte etat_compte) {
		this.etat_compte = etat_compte;
	}
	
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
}
