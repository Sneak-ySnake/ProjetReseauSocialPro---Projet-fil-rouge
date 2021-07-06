package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "admin")
public class Admin {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_admin")
	private int id_admin;

	@Column (name = "compte_admin")
	private String compte_admin;
	
	@Column (name = "mot_de_passe_admin")
	private String mot_de_passe_admin;
	
	public Admin() {
	}
	
	public Admin(int id_admin) {
		this.id_admin = id_admin;
	}

	public Admin (String compte_admin, String mot_de_passe_admin) {
		this.compte_admin = compte_admin;
		this.mot_de_passe_admin = mot_de_passe_admin;
	}


	public String getCompte_admin() {
		return compte_admin;
	}

	public void setCompte_admin(String compte_admin) {
		this.compte_admin = compte_admin;
	}

	public String getMot_de_passe_admin() {
		return mot_de_passe_admin;
	}

	public void setMot_de_passe_admin(String mot_de_passe_admin) {
		this.mot_de_passe_admin = mot_de_passe_admin;
	}
	
	public int getId_admin() {
		return id_admin;
	}

	public int getIdAdmin() {
		return id_admin;
	}
	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}
	
	

}
