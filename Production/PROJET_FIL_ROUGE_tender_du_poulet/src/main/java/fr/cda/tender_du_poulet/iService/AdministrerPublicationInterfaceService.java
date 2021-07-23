package fr.cda.tender_du_poulet.iService;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.beans.AdministrerPublication;
import fr.cda.tender_du_poulet.beans.AdministrerPublicationId;
import fr.cda.tender_du_poulet.dto.AdministrerPublicationDTO;


public interface AdministrerPublicationInterfaceService {
	
	public void ajoutAdministrerPublication (AdministrerPublicationDTO ap);	
	
	public AdministrerPublicationDTO recupAdministrerPublication (AdministrerPublicationId id);
	
	public List<AdministrerPublicationDTO> recupAllAdministrerPublication();
	
	public void deleteAdministrerPublication (AdministrerPublicationId id);
	
	public void updateAdministrerPublication (AdministrerPublicationDTO ap);
	
	}


