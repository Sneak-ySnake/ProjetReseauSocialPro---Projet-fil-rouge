package fr.cda.tender_du_poulet.dto;

import java.util.Date;

public class PublicationDTO {
	
	private int id_publication;
	
	private String nom_publication;
	
	private String description_publication;

	private float prix;

	private String type_produit;

	private Date date_publication;

	private int quantite;

	private UtilisateurDTO utilisateur;

	private TypePublicationDTO type_publication;

	private StatutPublicationDTO statut_publication;

	private EtatPublicationDTO etat_publication;
	
	
		///CONSTRUCTEURS///
	public PublicationDTO() {
		
	}


		///GETTERS SETTERS///
	public int getId_publication() {
		return id_publication;
	}


	public void setId_publication(int id_publication) {
		this.id_publication = id_publication;
	}


	public String getNom_publication() {
		return nom_publication;
	}


	public void setNom_publication(String nom_publication) {
		this.nom_publication = nom_publication;
	}


	public String getDescription_publication() {
		return description_publication;
	}


	public void setDescription_publication(String description_publication) {
		this.description_publication = description_publication;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	public String getType_produit() {
		return type_produit;
	}


	public void setType_produit(String type_produit) {
		this.type_produit = type_produit;
	}


	public Date getDate_publication() {
		return date_publication;
	}


	public void setDate_publication(Date date_publication) {
		this.date_publication = date_publication;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public UtilisateurDTO getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateurDTO(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}


	public TypePublicationDTO getType_publication() {
		return type_publication;
	}


	public void setType_publication(TypePublicationDTO type_publication) {
		this.type_publication = type_publication;
	}


	public StatutPublicationDTO getStatut_publication() {
		return statut_publication;
	}


	public void setStatut_publication(StatutPublicationDTO statut_publication) {
		this.statut_publication = statut_publication;
	}


	public EtatPublicationDTO getEtat_publication() {
		return etat_publication;
	}


	public void setEtat_publication(EtatPublicationDTO etat_publication) {
		this.etat_publication = etat_publication;
	}

}
		