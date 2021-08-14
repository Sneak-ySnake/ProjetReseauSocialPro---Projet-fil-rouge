package fr.cda.tender_du_poulet.beans;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Embeddable
public class NegocierId implements Serializable{
	 
	@ManyToOne()
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	 
	@ManyToOne()
	@JoinColumn(name = "id_publication")
	private Publication publication;

	private String id_negociation;
	
	private Timestamp date;

	public NegocierId() {
		
	}

	public NegocierId(Utilisateur utilisateur, Publication publication, String id_negociation, Timestamp date) {
		this.utilisateur = utilisateur;
		this.publication = publication;
		this.id_negociation = id_negociation;
		this.date = date;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public String getId_negociation() {
		return id_negociation;
	}

	public void setId_negociation(String id_negociation) {
		this.id_negociation = id_negociation;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}
