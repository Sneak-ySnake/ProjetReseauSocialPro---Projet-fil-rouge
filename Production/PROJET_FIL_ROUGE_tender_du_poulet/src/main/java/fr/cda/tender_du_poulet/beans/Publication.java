package fr.cda.tender_du_poulet.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "publication")
public class Publication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_publication")
	private int id_publication;
	
	@Column(name = "nom_publication")
	private String nom_publication;
	
	@Column(name = "description_publication")
	private String description_publication;
	
	@Column(name = "prix")
	private float prix;
	
	@Column(name = "type_produit")
	private String type_produit;
	
	@Column(name = "date_publication")
	private Date date_publication;
	
	@Column(name = "quantite")
	private int quantite;
	
	@ManyToOne()
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	
	@ManyToOne()
	@JoinColumn(name = "id_type_publication")
	private TypePublication type_publication;
	
	@ManyToOne()
	@JoinColumn(name = "id_statut_publication")
	private StatutPublication statut_publication;
	
	@ManyToOne()
	@JoinColumn(name = "id_etat_publication")
	private EtatPublication etat_publication;
	
	public Publication() {
		
	}

	public Publication(String nom_publication, String description_publication, float prix,
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
	}

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
	
}
