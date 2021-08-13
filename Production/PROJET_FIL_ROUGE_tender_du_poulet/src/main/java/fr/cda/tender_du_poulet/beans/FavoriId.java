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
	private Utilisateur id_utilisateur;
	
	@ManyToOne()
	@JoinColumn(name = "id_utilisateur_favori")
	private Utilisateur id_utilisateur_favori;

	public FavoriId() {
		
	}

	public FavoriId(Utilisateur id_utilisateur, Utilisateur id_utilisateur_favori) {
	
		this.id_utilisateur = id_utilisateur;
		this.id_utilisateur_favori = id_utilisateur_favori;
	}

	public Utilisateur getId_utilisateur() {
		return id_utilisateur;
	}

	public void setId_utilisateur(Utilisateur id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}

	public Utilisateur getId_utilisateur_favori() {
		return id_utilisateur_favori;
	}

	public void setId_utilisateur_favori(Utilisateur id_utilisateur_favori) {
		this.id_utilisateur_favori = id_utilisateur_favori;
	}
	
	
	
}
