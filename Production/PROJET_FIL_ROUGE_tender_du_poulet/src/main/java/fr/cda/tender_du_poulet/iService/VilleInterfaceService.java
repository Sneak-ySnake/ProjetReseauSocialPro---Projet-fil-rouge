package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.VilleDTO;

public interface VilleInterfaceService {

	public void ajoutVille(VilleDTO v);
	
	public VilleDTO recupVille(int id);
	
	public List<VilleDTO> recupAllVille();
	
	public void supprimerVille(int id);
	
}
