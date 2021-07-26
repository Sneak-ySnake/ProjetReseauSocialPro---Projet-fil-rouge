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

	public NegocierId() {
	}

	public NegocierId(Utilisateur utilisateur, Publication publication, Negociation negociation, Date date) {
		 
		this.utilisateur = utilisateur;
		this.publication = publication;
		this.negociation = negociation;
		this.date = date;
	}

}
