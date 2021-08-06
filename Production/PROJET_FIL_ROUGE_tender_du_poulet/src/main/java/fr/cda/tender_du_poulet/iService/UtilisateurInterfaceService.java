package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.UtilisateurDTO;

public interface UtilisateurInterfaceService {


	public void addUtilisateur(UtilisateurDTO u);
	
	public UtilisateurDTO findUtilisateur(int id);
	
	public List<UtilisateurDTO> findAllUtilisateur();
	
	public void updateUtilisateur(UtilisateurDTO u);
	
	public void deleteUtilisateur(int id);
}
