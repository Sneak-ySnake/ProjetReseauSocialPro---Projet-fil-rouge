package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.Utilisateur_ProfilId;
import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilDTO;
import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilIdDTO;

public interface Utilisateur_ProfilInterfaceService {

	public void ajoutUtilisateur_Profil(Utilisateur_ProfilDTO uec);
	
	public Utilisateur_ProfilDTO recupUtilisateur_Profil(Utilisateur_ProfilIdDTO id);
	
	public List<Utilisateur_ProfilDTO> recupAllUtilisateur_Profil();
	
	public void modifUtilisateur_Profil(Utilisateur_ProfilDTO d);
	
	public void supprimerUtilisateur_Profil(Utilisateur_ProfilId id);
}
