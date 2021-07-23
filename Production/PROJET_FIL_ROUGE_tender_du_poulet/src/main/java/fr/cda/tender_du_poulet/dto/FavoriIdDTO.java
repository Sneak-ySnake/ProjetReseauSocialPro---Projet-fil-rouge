package fr.cda.tender_du_poulet.dto;

import fr.cda.tender_du_poulet.beans.Utilisateur;

public class FavoriIdDTO { 
	 
	private UtilisateurDTO utilisateur;
 
	private UtilisateurDTO utilisateur_favori;

    public FavoriIdDTO() {}
   
	public FavoriIdDTO(UtilisateurDTO utilisateur, UtilisateurDTO utilisateur_favori) {
		this.utilisateur = utilisateur;
		this.utilisateur_favori = utilisateur_favori;
	}
	
	public UtilisateurDTO getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}

	public UtilisateurDTO getId_utilisateur_favori() {
		return utilisateur_favori;
	}

	public void setId_utilisateur_favori(UtilisateurDTO utilisateur_favori) {
		this.utilisateur_favori = utilisateur_favori;
	}
 
}
 