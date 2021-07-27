package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name = "admin")
public class Admin {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_admin")
	private int id_admin;

	@Column (name = "mail_admin")
	private String mail_admin;
	
	@Column (name = "mot_de_passe_admin")
	private String mot_de_passe_admin;
	
	@Column (name ="num_voie_admin")
	private String num_voie_admin;
	
	@Column (name= "adresse_admin")
	private String adresse_admin;
	
	@Column (name = "complement_adresse_admin")
	private String complement_adresse_admin;
	
	@ManyToOne() @JoinColumn(name = "id_ville")
	private Ville ville;
	
	//////// Constructeur ///////
	public Admin() {
	}
	
	public Admin(int id_admin) {
	this.id_admin = id_admin;
	}

	public Admin (String mail_admin, String mot_de_passe_admin, String num_voie_admin, String adresse_admin,
			 String complement_adresse_admin, Ville ville) {
		this.mail_admin = mail_admin;
		this.mot_de_passe_admin = mot_de_passe_admin;
		this.num_voie_admin = num_voie_admin;
		this.adresse_admin = adresse_admin;
		this.complement_adresse_admin = complement_adresse_admin;
		this.ville = ville;
	}


	//////// GETTER et SETTER //////////
	
	public int getId_admin() {
		return id_admin;
	}

	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}
	public String getMail_admin() {
		return mail_admin;
	}

	public void setMail_admin(String mail_admin) {
		this.mail_admin = mail_admin;
	}

	public String getMot_de_passe_admin() {
		return mot_de_passe_admin;
	}

	public void setMot_de_passe_admin(String mot_de_passe_admin) {
		this.mot_de_passe_admin = mot_de_passe_admin;
	}

	public String getNum_voie_admin() {
		return num_voie_admin;
	}

	public void setNum_voie_admin(String num_voie_admin) {
		this.num_voie_admin = num_voie_admin;
	}

	public String getAdresse_admin() {
		return adresse_admin;
	}

	public void setAdresse_admin(String adresse_admin) {
		this.adresse_admin = adresse_admin;
	}

	public String getComplement_adresse_admin() {
		return complement_adresse_admin;
	}

	public void setComplement_adresse_admin(String complement_adresse_admin) {
		this.complement_adresse_admin = complement_adresse_admin;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	
}
