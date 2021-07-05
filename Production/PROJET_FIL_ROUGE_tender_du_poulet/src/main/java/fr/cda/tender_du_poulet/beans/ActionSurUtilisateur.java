package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "action_sur_utilisateur")
public class ActionSurUtilisateur {
	
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name="id_action_sur_utilisateur")
	private int id_action_sur_utilisateur;
	
	@Column (name = "nom_action_sur_utilisateur")
	private String nom_action_sur_utilisateur;
	
	public ActionSurUtilisateur() {	
	}
	
	public ActionSurUtilisateur (int id_action_sur_utilisateur, String nom_action_sur_utilisateur) {
		this.id_action_sur_utilisateur = id_action_sur_utilisateur;
		this.nom_action_sur_utilisateur = nom_action_sur_utilisateur;
	}
		
	public int getId_action_sur_utilisateur() {
		return id_action_sur_utilisateur;
	}

	public void setId_action_sur_utilisateur(int id_action_sur_utilisateur) {
		this.id_action_sur_utilisateur = id_action_sur_utilisateur;
	}

	public String getNom_action_sur_utilisateur() {
		return nom_action_sur_utilisateur;
	}

	public void setNom_action_sur_utilisateur(String nom_action_sur_utilisateur) {
		this.nom_action_sur_utilisateur = nom_action_sur_utilisateur;
	}

}
