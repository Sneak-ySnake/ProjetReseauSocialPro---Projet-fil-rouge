package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.EtatPublicationDTO;

public interface EtatPublicationInterfaceService {

	public void ajoutEtatPublication(EtatPublicationDTO e);
	
	public EtatPublicationDTO recupEtatPublication(int id);
	
	public List<EtatPublicationDTO> recupAllEtatPublication();
	
	public void supprimerEtatPublication(int id);
	
	public void modifEtatPublication(EtatPublicationDTO e);
}
