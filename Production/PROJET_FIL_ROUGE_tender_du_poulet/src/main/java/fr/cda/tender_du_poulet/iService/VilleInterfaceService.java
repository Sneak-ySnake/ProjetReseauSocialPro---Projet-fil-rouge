package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.VilleDTO;

public interface VilleInterfaceService {

	public void addVille(VilleDTO v);
	
	public VilleDTO findVille(int id);
	
	public List<VilleDTO> findAllVille();
	
	public void deleteVille(int id);
	
}
