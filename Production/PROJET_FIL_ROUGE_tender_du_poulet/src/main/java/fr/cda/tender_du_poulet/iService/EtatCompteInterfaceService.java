package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.EtatCompteDTO;

public interface EtatCompteInterfaceService {

	public void ajoutEtatCompte(EtatCompteDTO ec);
	
	public EtatCompteDTO recupEtatCompte(int id);
	
	public List<EtatCompteDTO> recupAllEtatCompte();
	
	public void modifEtatCompte(EtatCompteDTO d);
	
	public void supprimerEtatCompte(int id);
}
