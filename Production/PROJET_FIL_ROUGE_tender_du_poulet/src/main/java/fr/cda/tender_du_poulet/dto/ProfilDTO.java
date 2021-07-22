package fr.cda.tender_du_poulet.dto;

public class ProfilDTO {
	private int id_profil;
	private String nom_profil;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public ProfilDTO() {
	}
	
	
/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public int getId_profil() {
		return id_profil;
	}
	public void setId_profil(int id_profil) {
		this.id_profil = id_profil;
	}

	public String getNom_profil() {
		return nom_profil;
	}
	public void setNom_profil(String nom_profil) {
		this.nom_profil = nom_profil;
	}
}
