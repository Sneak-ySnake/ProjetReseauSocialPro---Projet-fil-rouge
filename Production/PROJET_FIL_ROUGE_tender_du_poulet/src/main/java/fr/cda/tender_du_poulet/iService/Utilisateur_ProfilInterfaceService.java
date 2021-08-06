package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilDTO;
import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilIdDTO;

public interface Utilisateur_ProfilInterfaceService {

	public void addUtilisateur_Profil(Utilisateur_ProfilDTO uec);
	
	public Utilisateur_ProfilDTO findUtilisateur_Profil(Utilisateur_ProfilIdDTO id);
	
	public List<Utilisateur_ProfilDTO> findAllUtilisateur_Profil();
	
	public void updateUtilisateur_Profil(Utilisateur_ProfilDTO d);
	
	public void deleteUtilisateur_Profil(Utilisateur_ProfilIdDTO id);
}
