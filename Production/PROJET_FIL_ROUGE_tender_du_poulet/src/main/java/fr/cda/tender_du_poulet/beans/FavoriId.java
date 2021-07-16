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
	
	@JoinColumn(name = "id_utilisateur")
	private int id_utilisateur_favori;

   public FavoriId() {}
   
	public FavoriId(Utilisateur utilisateur, int id_utilisateur_favori) {
		this.utilisateur = utilisateur;
		this.id_utilisateur_favori = id_utilisateur_favori;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public int getId_utilisateur_favori() {
		return id_utilisateur_favori;
	}

	public void setId_utilisateur_favori(int id_utilisateur_favori) {
		this.id_utilisateur_favori = id_utilisateur_favori;
	}
 
}
