package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.DomaineDTO;

public interface DomaineInterfaceService {
	
	public void addDomaine(DomaineDTO u);
	
	public DomaineDTO findDomaine(int id);
	
	public List<DomaineDTO> findAllDomaine();
	
	public void updateDomaine(DomaineDTO d);
	
	public void deleteDomaine(int id);

}
