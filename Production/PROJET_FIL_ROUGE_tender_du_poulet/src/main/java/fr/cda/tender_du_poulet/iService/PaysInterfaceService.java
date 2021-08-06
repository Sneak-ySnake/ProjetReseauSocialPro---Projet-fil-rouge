package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.PaysDTO;

public interface PaysInterfaceService {

	public void addPays(PaysDTO p);
	
	public PaysDTO findPays(int id);
	
	public List<PaysDTO> findAllPays();
	
	public void deletePays(int id);
	
}
