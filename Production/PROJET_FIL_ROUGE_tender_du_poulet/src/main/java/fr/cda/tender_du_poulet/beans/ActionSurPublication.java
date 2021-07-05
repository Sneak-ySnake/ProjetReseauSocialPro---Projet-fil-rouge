package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "action_sur_publication")
public class ActionSurPublication {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_action_sur_publication")
	private int id_action_sur_publication;
	
	@Column (name = "nom_action_sur_publication")
	private String nom_action_sur_publication;
	
	
	public ActionSurPublication() {	
	}
	
	public ActionSurPublication(int id_action_sur_publication, String nom_action_sur_publication) {
		this.id_action_sur_publication = id_action_sur_publication;
		this.nom_action_sur_publication = nom_action_sur_publication;
	}

	public int getId_action_sur_publication() {
		return id_action_sur_publication;
	}

	public void setId_action_sur_publication(int id_action_sur_publication) {
		this.id_action_sur_publication = id_action_sur_publication;
	}

	public String getNom_action_sur_publication() {
		return nom_action_sur_publication;
	}

	public void setNom_action_sur_publication(String nom_action_sur_publication) {
		this.nom_action_sur_publication = nom_action_sur_publication;
	}
	
}
