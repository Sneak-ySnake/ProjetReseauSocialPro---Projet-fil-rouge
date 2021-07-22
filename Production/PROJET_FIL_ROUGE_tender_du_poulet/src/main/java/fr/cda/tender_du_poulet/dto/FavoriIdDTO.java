package fr.cda.tender_du_poulet.dto;

public class FavoriIdDTO { 
	 
	private UtilisateurDTO utilisateur;
 
	private int id_utilisateur_favori;

    public FavoriIdDTO() {}
   
	public FavoriIdDTO(UtilisateurDTO utilisateur, int id_utilisateur_favori) {
		this.utilisateur = utilisateur;
		this.id_utilisateur_favori = id_utilisateur_favori;
	}
	
	public UtilisateurDTO getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}

	public int getId_utilisateur_favori() {
		return id_utilisateur_favori;
	}

	public void setId_utilisateur_favori(int id_utilisateur_favori) {
		this.id_utilisateur_favori = id_utilisateur_favori;
	}
 
}
 