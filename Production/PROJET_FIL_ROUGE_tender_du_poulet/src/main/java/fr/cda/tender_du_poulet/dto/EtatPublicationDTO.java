package fr.cda.tender_du_poulet.dto;

public class EtatPublicationDTO {

		private String nom_etat_publication;
		
			
			///CONSTRUCTEUR///
		
		public EtatPublicationDTO() {
			
		}
		
		public EtatPublicationDTO(String nom_etat_publication) {
			this.nom_etat_publication = nom_etat_publication;
		}

		
			///GETTER SETTER///

		public String getNom_etat_publication() {
			return nom_etat_publication;
		}

		public void setNom_etat_publication(String nom_etat_publication) {
			this.nom_etat_publication = nom_etat_publication;
		}
		
	}

