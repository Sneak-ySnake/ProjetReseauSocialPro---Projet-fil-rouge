package fr.cda.tender_du_poulet.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Utilisateur_EtatCompteIdDTO {
	private UtilisateurDTO utilisateur;
	private EtatCompteDTO etat_compte;
	private Date date_debut;

	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_EtatCompteIdDTO() {
	}


/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public UtilisateurDTO getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public EtatCompteDTO getEtat_compte() {
		return etat_compte;
	}
	public void setEtat_compte(EtatCompteDTO etat_compte) {
		this.etat_compte = etat_compte;
	}
	
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
}
