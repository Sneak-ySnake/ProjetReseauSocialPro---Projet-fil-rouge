package fr.cda.tender_du_poulet.beans;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class AccesPublicationId implements Serializable {

	@ManyToOne()
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	
	@ManyToOne()
	@JoinColumn(name = "id_publication")
	private Publication publication;

	
		///CONSTRUCTEUR///
	
	public AccesPublicationId() {
		
	}
	
	public AccesPublicationId(Utilisateur utilisateur, Publication publication) {
		this.utilisateur = utilisateur;
		this.publication = publication;
	}

	
		///GETTER SETTER///
	
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
	
}
