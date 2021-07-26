package fr.cda.tender_du_poulet.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class NegocierId implements Serializable{
	 
	@ManyToOne()
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	 
	@ManyToOne()
	@JoinColumn(name = "id_publication")
	private Publication publication;
	

	@ManyToOne()
	@JoinColumn(name = "id_negociation")
	private Negociation negociation;
	
	private Date date;

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

	public Negociation getNegociation() {
		return negociation;
	}

	public void setNegociation(Negociation negociation) {
		this.negociation = negociation;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public NegocierId() {
	}

	public NegocierId(Utilisateur utilisateur, Publication publication, Negociation negociation, Date date) {
		 
		this.utilisateur = utilisateur;
		this.publication = publication;
		this.negociation = negociation;
		this.date = date;
	}

}
