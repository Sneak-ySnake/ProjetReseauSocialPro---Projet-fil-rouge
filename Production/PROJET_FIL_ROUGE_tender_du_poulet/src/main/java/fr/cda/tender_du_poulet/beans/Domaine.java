package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="domaine")
public class Domaine {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_domaine;
	
	@Column(name="nom_domaine")
	private String nom_domaine;
	
	
	public Domaine() {
	}
	
	public Domaine(String nom_domaine) {
		this.nom_domaine = nom_domaine;
	}
	
	public Domaine(int id_domaine, String nom_domaine) {
		this.id_domaine = id_domaine;
		this.nom_domaine = nom_domaine;
	}


	public int getId_domaine() {
		return id_domaine;
	}
	public void setId_domaine(int id_domaine) {
		this.id_domaine = id_domaine;
	}

	public String getNom_domaine() {
		return nom_domaine;
	}
	public void setNom_domaine(String nom_domaine) {
		this.nom_domaine = nom_domaine;
	}
}
