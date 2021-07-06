package fr.cda.tender_du_poulet.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class NegocierId implements Serializable{
	
	@ManyToOne()
	@JoinColumn(name = "id_negociation")
	private Negociation negociation;
	
	@ManyToOne()
	@JoinColumn(name = "id_publication")
	private Publication publication;
	
	@ManyToOne()
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	
	private Date date;

	public NegocierId() {
	}

	public NegocierId(Negociation negociation, Publication publication, Utilisateur utilisateur, Date date) {
		this.negociation = negociation;
		this.publication = publication;
		this.utilisateur = utilisateur;
		this.date = date;
	}

	public Negociation getNegociation() {
		return negociation;
	}

	public void setNegociation(Negociation negociation) {
		this.negociation = negociation;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	 

}
