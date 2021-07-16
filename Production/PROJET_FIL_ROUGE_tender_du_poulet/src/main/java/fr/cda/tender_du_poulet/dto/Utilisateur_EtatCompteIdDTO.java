package fr.cda.tender_du_poulet.dto;

import java.util.Date;

public class Utilisateur_EtatCompteIdDTO {
	private UtilisateurDTO utilisateurDTO;
	private EtatCompteDTO etat_compteDTO;
	private Date date_debut;

	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Utilisateur_EtatCompteIdDTO(UtilisateurDTO utilisateurDTO, EtatCompteDTO etat_compteDTO, Date date_debut) {
		this.utilisateurDTO = utilisateurDTO;
		this.etat_compteDTO = etat_compteDTO;
		this.date_debut = date_debut;
	}


/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public UtilisateurDTO getUtilisateurDTO() {
		return utilisateurDTO;
	}
	public void setUtilisateurDTO(UtilisateurDTO utilisateurDTO) {
		this.utilisateurDTO = utilisateurDTO;
	}
	
	public EtatCompteDTO getEtat_compteDTO() {
		return etat_compteDTO;
	}
	public void setEtat_compteDTO(EtatCompteDTO etat_compteDTO) {
		this.etat_compteDTO = etat_compteDTO;
	}
	
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
}
