package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.EtatPublicationDTO;

public interface EtatPublicationInterfaceService {

	public void addEtatPublication(EtatPublicationDTO e);
	
	public EtatPublicationDTO findEtatPublication(int id);
	
	public List<EtatPublicationDTO> findAllEtatPublication();
	
	public void deleteEtatPublication(int id);
	
	public void updateEtatPublication(EtatPublicationDTO e);
}
