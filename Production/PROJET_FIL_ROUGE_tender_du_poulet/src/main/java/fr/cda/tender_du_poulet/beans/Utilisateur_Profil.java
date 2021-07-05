package fr.cda.tender_du_poulet.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="utilisateur_profil")
public class Utilisateur_Profil {
	@Id @EmbeddedId @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Utilisateur_ProfilId utilisateur_ProfilId;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_Profil() {
		
	}

	public Utilisateur_Profil(Utilisateur_ProfilId utilisateur_ProfilId) {
		this.utilisateur_ProfilId = utilisateur_ProfilId;
	}

	
/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_ProfilId getUtilisateur_ProfilId() {
		return utilisateur_ProfilId;
	}
	public void setUtilisateur_ProfilId(Utilisateur_ProfilId utilisateur_ProfilId) {
		this.utilisateur_ProfilId = utilisateur_ProfilId;
	}
	
	
}
