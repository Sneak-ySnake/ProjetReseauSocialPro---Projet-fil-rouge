package fr.cda.tender_du_poulet.dto;

import java.util.Date;

public class NegocierIdDTO {



	private NegociationDTO negociation;
	private PublicationDTO publication;
	private UtilisateurDTO utilisateur;
	
	private Date date;

	public NegocierIdDTO() {
	}

	public NegocierIdDTO(NegociationDTO negociation, PublicationDTO publication, UtilisateurDTO utilisateur, Date date) {
		this.negociation = negociation;
		this.publication = publication;
		this.utilisateur = utilisateur;
		this.date = date;
	}

	public NegociationDTO getNegociationDTO() {
		return negociation;
	}

	public void setNegociationDTO(NegociationDTO negociation) {
		this.negociation = negociation;
	}

	public PublicationDTO getPublicationDTO() {
		return publication;
	}

	public void setPublicationDTO(PublicationDTO publication) {
		this.publication = publication;
	}

	public UtilisateurDTO getUtilisateurDTO() {
		return utilisateur;
	}

	public void setUtilisateurDTO(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	 
	
}