package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="negociation")
public class Negociation {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO)
	@Column(name = "id_negociation")
	private int id_negociation;
	
	@Column(name="titre")
	private String titre;
	
	public Negociation() {}
	 
	
	public Negociation(int id_negociation, String titre) {
	
		this.id_negociation = id_negociation;
		this.titre= titre;
	}


	public int getId_negociation() {
		return id_negociation;
	}


	public void setId_negociation(int id_negociation) {
		this.id_negociation = id_negociation;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public int getId_Negociation() {
		return id_negociation;
	}

	public void setId_Negociation(int id_negociation) {
		this.id_negociation = id_negociation;
	}
	
}
