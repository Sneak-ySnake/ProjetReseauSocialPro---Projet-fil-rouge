package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.DomaineDTO;

public interface DomaineInterfaceService {
	
	public void ajoutDomaine(DomaineDTO u);
	
	public DomaineDTO recupDomaine(int id);
	
	public List<DomaineDTO> recupAllDomaine();
	
	public void modifDomaine(DomaineDTO d);
	
	public void supprimerDomaine(int id);

}
