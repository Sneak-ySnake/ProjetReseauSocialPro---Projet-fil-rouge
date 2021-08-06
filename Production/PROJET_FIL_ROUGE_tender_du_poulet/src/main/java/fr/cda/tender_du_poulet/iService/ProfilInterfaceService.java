package fr.cda.tender_du_poulet.iService;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dto.ProfilDTO;

@Service
public interface ProfilInterfaceService {

	public void addProfil(ProfilDTO p);
	
	public ProfilDTO findProfil(int id);
	
	public List<ProfilDTO> findAllProfil();
	
	public void updateProfil(ProfilDTO p);
	
	public void deleteProfil(int id);
}
