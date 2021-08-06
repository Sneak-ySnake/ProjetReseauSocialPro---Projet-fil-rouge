package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.PublicationDTO;

public interface PublicationInterfaceService {

	public void addPublication(PublicationDTO p);
	
	public PublicationDTO findPublication(int id);
	
	public List<PublicationDTO> findAllPublication();

	public void deletePublication(int id);
	
	public void updatePublication(PublicationDTO p);
}
