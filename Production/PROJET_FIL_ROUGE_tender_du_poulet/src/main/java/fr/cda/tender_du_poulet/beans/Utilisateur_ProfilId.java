package fr.cda.tender_du_poulet.beans;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Utilisateur_ProfilId implements Serializable {
	@ManyToOne() @JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;
	@ManyToOne() @JoinColumn(name="id_profil")
	private Profil profil;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_ProfilId() {
		
	}

	public Utilisateur_ProfilId(Utilisateur utilisateur, Profil profil) {
		super();
		this.utilisateur = utilisateur;
		this.profil = profil;
	}
	
	
/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public Profil getProfil() {
		return profil;
	}
	public void setProfil(Profil profil) {
		this.profil = profil;
	}	
}
