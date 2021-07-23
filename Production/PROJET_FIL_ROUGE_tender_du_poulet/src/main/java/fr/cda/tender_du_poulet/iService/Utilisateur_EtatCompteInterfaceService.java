package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.Utilisateur_EtatCompteId;
import fr.cda.tender_du_poulet.dto.Utilisateur_EtatCompteDTO;

public interface Utilisateur_EtatCompteInterfaceService {

	public void ajoutUtilisateur_EtatCompte(Utilisateur_EtatCompteDTO uec);
	
	public Utilisateur_EtatCompteDTO recupUtilisateur_EtatCompte(Utilisateur_EtatCompteId id);
	
	public List<Utilisateur_EtatCompteDTO> recupAllUtilisateur_EtatCompte();
	
	public void modifUtilisateur_EtatCompte(Utilisateur_EtatCompteDTO d);
	
	public void supprimerUtilisateur_EtatCompte(Utilisateur_EtatCompteId id);
}
