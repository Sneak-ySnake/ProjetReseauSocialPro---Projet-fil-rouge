package fr.cda.tender_du_poulet.beans;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable 
public class FavoriId  implements Serializable {
	
	@ManyToOne()
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	
	@ManyToOne()
	@JoinColumn(name = "id_utilisateur_favori")
	private Utilisateur utilisateur_favori;
	
	

    public FavoriId() {}

	public FavoriId(Utilisateur utilisateur, Utilisateur utilisateur_favori) {
	 	this.utilisateur = utilisateur;
		this.utilisateur_favori = utilisateur_favori;
	}
	
	
	
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public Utilisateur getUtilisateur_favori() {
		return utilisateur_favori;
	}
	
	public void setUtilisateur_favori(Utilisateur utilisateur_favori) {
		this.utilisateur_favori = utilisateur_favori;
	}
	   
 
}
