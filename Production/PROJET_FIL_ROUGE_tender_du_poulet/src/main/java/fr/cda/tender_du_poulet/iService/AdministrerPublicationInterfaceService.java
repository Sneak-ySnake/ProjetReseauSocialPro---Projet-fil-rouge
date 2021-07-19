package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.AdministrerPublicationDTO;

public interface AdministrerPublicationInterfaceService {
	
	public void ajoutAdministrerPublication (AdministrerPublicationDTO ap);	
	
	public AdministrerPublicationDTO recupAdministrerPublication (int id);
	
	public List<AdministrerPublicationDTO> recupAllAdministrerPublication(int id);
	
	}


