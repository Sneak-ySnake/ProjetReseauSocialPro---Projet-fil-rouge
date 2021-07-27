package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.PaysDTO;

public interface PaysInterfaceService {

	public void ajoutPays(PaysDTO p);
	
	public PaysDTO recupPays(int id);
	
	public List<PaysDTO> recupAllPays();
	
	public void supprimerPays(int id);
	
}
