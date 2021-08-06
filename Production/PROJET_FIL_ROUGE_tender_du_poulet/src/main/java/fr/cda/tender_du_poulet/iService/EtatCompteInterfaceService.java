package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.EtatCompteDTO;

public interface EtatCompteInterfaceService {

	public void addEtatCompte(EtatCompteDTO ec);
	
	public EtatCompteDTO findEtatCompte(int id);
	
	public List<EtatCompteDTO> findAllEtatCompte();
	
	public void updateEtatCompte(EtatCompteDTO d);
	
	public void deleteEtatCompte(int id);
}
