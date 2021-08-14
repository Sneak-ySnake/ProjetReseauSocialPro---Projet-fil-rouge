package fr.cda.tender_du_poulet.dto;

import java.util.Date;

 
public class NegocierIdDTO {
 
	private PublicationDTO publication;
	private UtilisateurDTO utilisateur;
	
	String id_negociation;
	
	private Date date;

	public NegocierIdDTO() {
	}
	 
	public NegocierIdDTO(String id_negociation, PublicationDTO publication, UtilisateurDTO utilisateur,
			Date date) {
		this.id_negociation = id_negociation;
		this.publication = publication;
		this.utilisateur = utilisateur;
		this.date = date;
	}
	
	public String getId_negociation() {
		return id_negociation;
	}

	public void setId_negociation(String id_negociation) {
		this.id_negociation = id_negociation;
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
