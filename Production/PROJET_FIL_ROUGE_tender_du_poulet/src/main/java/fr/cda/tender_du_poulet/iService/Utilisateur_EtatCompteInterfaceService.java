package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.Utilisateur_EtatCompteDTO;
import fr.cda.tender_du_poulet.dto.Utilisateur_EtatCompteIdDTO;

public interface Utilisateur_EtatCompteInterfaceService {

	public void addUtilisateur_EtatCompte(Utilisateur_EtatCompteDTO uec);
	
	public Utilisateur_EtatCompteDTO findUtilisateur_EtatCompte(Utilisateur_EtatCompteIdDTO id);
	
	public List<Utilisateur_EtatCompteDTO> findAllUtilisateur_EtatCompte();
	
	public void updateUtilisateur_EtatCompte(Utilisateur_EtatCompteDTO d);
	
	public void deleteUtilisateur_EtatCompte(Utilisateur_EtatCompteIdDTO id);
}
