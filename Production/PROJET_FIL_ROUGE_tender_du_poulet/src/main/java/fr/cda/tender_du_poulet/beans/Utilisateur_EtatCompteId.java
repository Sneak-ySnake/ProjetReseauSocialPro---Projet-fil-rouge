package fr.cda.tender_du_poulet.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Utilisateur_EtatCompteId implements Serializable {
	@ManyToOne() @JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;
	@ManyToOne() @JoinColumn(name="id_etat_compte")
	private EtatCompte etat_compte;
	private Date date_debut;

	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_EtatCompteId() {
	}

	public Utilisateur_EtatCompteId(Utilisateur utilisateur, EtatCompte etat_compte, Date date_debut) {
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
