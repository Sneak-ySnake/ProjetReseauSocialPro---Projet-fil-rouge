package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.TypePublicationDTO;

public interface TypePublicationInterfaceService {

	public void addTypePublication(TypePublicationDTO t);
	
	public TypePublicationDTO findTypePublication(int id);
	
	public List<TypePublicationDTO> findAllTypePublication();
	
	public void deleteTypePublication(int id);
	
	public void updateTypePublication(TypePublicationDTO t);
}
