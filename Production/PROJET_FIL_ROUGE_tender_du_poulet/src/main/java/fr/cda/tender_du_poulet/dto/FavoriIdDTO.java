package fr.cda.tender_du_poulet.dto;

public class FavoriIdDTO { 
	 
	private UtilisateurDTO id_utilisateur;
 
	private UtilisateurDTO id_utilisateur_favori;
		
	public FavoriIdDTO() {} 
   
	public FavoriIdDTO(UtilisateurDTO id_utilisateur, UtilisateurDTO id_utilisateur_favori) {
		this.id_utilisateur = id_utilisateur;
		this.id_utilisateur_favori = id_utilisateur_favori;
	}
	
	public UtilisateurDTO getUtilisateur() {
		return id_utilisateur;
	}

	public void setUtilisateur(UtilisateurDTO id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}

	public UtilisateurDTO getId_utilisateur_favori() {
		return id_utilisateur_favori;
	}

	public void setId_utilisateur_favori(UtilisateurDTO id_utilisateur_favori) {
		this.id_utilisateur_favori = id_utilisateur_favori;
	}
	
	   public UtilisateurDTO getUtilisateur_favori() {
			return id_utilisateur_favori;
		}

		public void setUtilisateur_favori(UtilisateurDTO id_utilisateur_favori) {
			this.id_utilisateur_favori = id_utilisateur_favori;
		}

 
}
 