package fr.cda.tender_du_poulet.iService;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dto.ProfilDTO;

@Service
public interface ProfilInterfaceService {

	public void ajoutProfil(ProfilDTO p);
	
	public ProfilDTO recupProfil(int id);
	
	public List<ProfilDTO> recupAllProfil();
	
	public void modifProfil(ProfilDTO p);
	
	public void supprimerProfil(int id);
}
