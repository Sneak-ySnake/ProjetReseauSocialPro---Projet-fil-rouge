package fr.cda.tender_du_poulet.dto;

import java.util.Date;

import fr.cda.tender_du_poulet.beans.EtatPublication;
import fr.cda.tender_du_poulet.beans.StatutPublication;
import fr.cda.tender_du_poulet.beans.TypePublication;
import fr.cda.tender_du_poulet.beans.Utilisateur;

public class PublicationDTO {
	
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

	/*public PublicationDTO(String nom_publication, String description_publication, float prix,
			String type_produit, Date date_publication, int quantite, Utilisateur utilisateur,
			TypePublication type_publication, StatutPublication statut_publication, EtatPublication etat_publication) {
		this.nom_publication = nom_publication;
		this.description_publication = description_publication;
		this.prix = prix;
		this.type_produit = type_produit;
		this.date_publication = date_publication;
		this.quantite = quantite;
		this.utilisateur = utilisateur;
		this.type_publication = type_publication;
		this.statut_publication = statut_publication;
		this.etat_publication = etat_publication;
	}*/
	
	public PublicationDTO(String nom_publication, String description_publication, float prix,
			String type_produit, Date date_publication, int quantite, UtilisateurDTO utilisateur,
			TypePublicationDTO type_publication, StatutPublicationDTO statut_publication, EtatPublicationDTO etat_publication) {
		this.nom_publication = nom_publication;
		this.description_publication = description_publication;
		this.prix = prix;
		this.type_produit = type_produit;
		this.date_publication = date_publication;
		this.quantite = quantite;
		this.utilisateur = utilisateur;
		this.type_publication = type_publication;
		this.statut_publication = statut_publication;
		this.etat_publication = etat_publication;
	}

	
		///GETTERS SETTERS///
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
/*
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public TypePublication getType_publication() {
		return type_publication;
	}

	public void setType_publication(TypePublication type_publication) {
		this.type_publication = type_publication;
	}

	public StatutPublication getStatut_publication() {
		return statut_publication;
	}

	public void setStatut_publication(StatutPublication statut_publication) {
		this.statut_publication = statut_publication;
	}

	public EtatPublication getEtat_publication() {
		return etat_publication;
	}

	public void setEtat_publication(EtatPublication etat_publication) {
		this.etat_publication = etat_publication;
	}
	*/
	
	

	public UtilisateurDTO getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurDTO utilisateur) {
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
