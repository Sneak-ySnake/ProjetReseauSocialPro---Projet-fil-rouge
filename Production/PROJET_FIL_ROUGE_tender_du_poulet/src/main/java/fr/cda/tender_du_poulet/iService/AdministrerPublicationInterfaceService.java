package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.AdministrerPublicationId;
import fr.cda.tender_du_poulet.dto.AdministrerPublicationDTO;


public interface AdministrerPublicationInterfaceService {
	
	public void addAdministrerPublication (AdministrerPublicationDTO ap);	
	
	public AdministrerPublicationDTO findAdministrerPublication (AdministrerPublicationId id);
	
	public List<AdministrerPublicationDTO> findAllAdministrerPublication();
	
	public void deleteAdministrerPublication (AdministrerPublicationId id);
	
	public void updateAdministrerPublication (AdministrerPublicationDTO ap);
	
	}