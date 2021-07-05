package fr.cda.tender_du_poulet.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.cda.tender_du_poulet.beans.Domaine;

@Entity @Table(name="utilisateur")
public class Utilisateur {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_utilisateur;
	private String nom_utilisateur;
	private String prenom_utilisateur;
	private String site_web;
	private String telephone;
	private String code_postal;
	private String poste_occupe;
	private String email_utilisateur;
	private String mot_de_passe_utilisateur;
	private String siret;
	private String nom_entreprise;
	@ManyToOne() @JoinColumn(name="id_domaine")
	private Domaine domaine;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur() {
		
	}

	public Utilisateur(int id_utilisateur, String nom_utilisateur, String prenom_utilisateur, String site_web,
			String telephone, String code_postal, String poste_occupe, String email_utilisateur,
			String mot_de_passe_utilisateur, String siret, String nom_entreprise, Domaine domaine) {
		this.id_utilisateur = id_utilisateur;
		this.nom_utilisateur = nom_utilisateur;
		this.prenom_utilisateur = prenom_utilisateur;
		this.site_web = site_web;
		this.telephone = telephone;
		this.code_postal = code_postal;
		this.poste_occupe = poste_occupe;
		this.email_utilisateur = email_utilisateur;
		this.mot_de_passe_utilisateur = mot_de_passe_utilisateur;
		this.siret = siret;
		this.nom_entreprise = nom_entreprise;
		this.domaine = domaine;
	}
	
	
/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public int getId_utilisateur() {
		return id_utilisateur;
	}
	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}

	public String getNom_utilisateur() {
		return nom_utilisateur;
	}
	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}

	public String getPrenom_utilisateur() {
		return prenom_utilisateur;
	}
	public void setPrenom_utilisateur(String prenom_utilisateur) {
		this.prenom_utilisateur = prenom_utilisateur;
	}

	public String getSite_web() {
		return site_web;
	}
	public void setSite_web(String site_web) {
		this.site_web = site_web;
	}

	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getPoste_occupe() {
		return poste_occupe;
	}
	public void setPoste_occupe(String poste_occupe) {
		this.poste_occupe = poste_occupe;
	}

	public String getEmail_utilisateur() {
		return email_utilisateur;
	}
	public void setEmail_utilisateur(String email_utilisateur) {
		this.email_utilisateur = email_utilisateur;
	}

	public String getMot_de_passe_utilisateur() {
		return mot_de_passe_utilisateur;
	}
	public void setMot_de_passe_utilisateur(String mot_de_passe_utilisateur) {
		this.mot_de_passe_utilisateur = mot_de_passe_utilisateur;
	}

	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getNom_entreprise() {
		return nom_entreprise;
	}
	public void setNom_entreprise(String nom_entreprise) {
		this.nom_entreprise = nom_entreprise;
	}

	public Domaine getDomaine() {
		return domaine;
	}
	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
}
