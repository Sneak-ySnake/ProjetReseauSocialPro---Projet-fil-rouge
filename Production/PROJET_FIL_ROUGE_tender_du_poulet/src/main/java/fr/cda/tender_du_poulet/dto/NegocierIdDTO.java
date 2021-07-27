package fr.cda.tender_du_poulet.dto;

import java.util.Date;

 
public class NegocierIdDTO {
 
	private NegociationDTO negociation;
	private PublicationDTO publication;
	private UtilisateurDTO utilisateur;
	
	private Date date;

	public NegocierIdDTO() {
	}

	public NegociationDTO getNegociation() {
		return negociation;
	}

	public void setNegociation(NegociationDTO negociation) {
		this.negociation = negociation;
	}

	public PublicationDTO getPublication() {
		return publication;
	}

	public void setPublication(PublicationDTO publication) {
		this.publication = publication;
	}

	public UtilisateurDTO getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}	 
	
}
