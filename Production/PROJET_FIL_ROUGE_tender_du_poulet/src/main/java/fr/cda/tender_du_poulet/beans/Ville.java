package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ville")
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_ville")
	private int id_ville;
	
	@Column(name = "nom_ville")
	private String nom_ville;
	
	@Column(name = "code_postal")
	private String code_postal;
	
	@ManyToOne()
	@JoinColumn(name = "id_pays")
	private Pays pays;
	
		
		////CONSTRUCTEUR////
	public Ville() {
		
	}

	public Ville(String nom_ville, String code_postal, Pays pays) {
		this.nom_ville = nom_ville;
		this.code_postal = code_postal;
		this.pays = pays;
	}

	
	
		////GETTERS SETTERS////
	public int getId_ville() {
		return id_ville;
	}

	public void setId_ville(int id_ville) {
		this.id_ville = id_ville;
	}

	public String getNom_ville() {
		return nom_ville;
	}

	public void setNom_ville(String nom_ville) {
		this.nom_ville = nom_ville;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}
	
}
