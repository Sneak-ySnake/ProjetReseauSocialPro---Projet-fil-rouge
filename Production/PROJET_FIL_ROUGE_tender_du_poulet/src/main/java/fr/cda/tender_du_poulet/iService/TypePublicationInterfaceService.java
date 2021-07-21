package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.TypePublication;
import fr.cda.tender_du_poulet.dto.TypePublicationDTO;

public interface TypePublicationInterfaceService {

	public void ajoutTypePublication(TypePublicationDTO t);
	
	public TypePublicationDTO recupTypePublication(int id);
	
	public List<TypePublicationDTO> recupAllTypePublication();
	
	public void supprimerTypePublication(int id);
	
	public void modifTypePublication(int id, String modif);
}
