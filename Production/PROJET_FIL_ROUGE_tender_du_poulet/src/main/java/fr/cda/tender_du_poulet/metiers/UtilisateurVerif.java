package fr.cda.tender_du_poulet.metiers;

import fr.cda.tender_du_poulet.dto.DomaineDTO;
import fr.cda.tender_du_poulet.dto.UtilisateurDTO;
import fr.cda.tender_du_poulet.dto.VilleDTO;

public class UtilisateurVerif {

	public boolean verifLogin(UtilisateurDTO u, String mdp) {
		if(u.getMot_de_passe_utilisateur().equals(mdp)) {
			return true;
		}
		else return false;
	}

	public boolean isNotEmpty(String nomUtilisateur, String prenomUtilisateur, String siteWeb, String telephone,
			String adresseMail, String mdp, String siret, String nomEntreprise, String numVoie, String adresse,
			String complementAdresse, VilleDTO ville, DomaineDTO domaine) {
		if (!nomUtilisateur.equals("") && !prenomUtilisateur.equals("")  && !siteWeb.equals("") && !telephone.equals("") && 
				!adresseMail.equals("") && !mdp.equals("") && !siret.equals("") && !nomEntreprise.equals("") && !numVoie.equals("") && !adresse.equals("") &&
				 !complementAdresse.equals("") &&
				(ville.getId_ville() != 0 && ville.getNom_ville() != "") &&
				(domaine.getId_domaine() != 0 && domaine.getNom_domaine() != "") ) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isTypeOk(String nomUtilisateur, String prenomUtilisateur, String telephone,
			String adresseMail, String siret, VilleDTO ville, DomaineDTO domaine) {
		if(nomUtilisateur.matches("^[a-zA-Z]*$") && prenomUtilisateur.matches("^[a-zA-Z]*$") &&
		telephone.matches("^[0-9]+$") && adresseMail.matches("^.+@.+$") && siret.matches("^[0-9]*$") &&
		Integer.toString(ville.getId_ville()).matches("^[0-9]*$") && 
		Integer.toString(domaine.getId_domaine()).matches("^[0-9]*$") ) {
        	return true;
        } else {
        	return false;
        }
	}
	
	public boolean isValeurOk(String siret, VilleDTO ville, DomaineDTO domaine) {
		if(siret.matches("^[0-9]{14}$") && ville.getId_ville() > 0 && domaine.getId_domaine() > 0 ) {
        	return true;
        } else {
        	return false;
        }
	}
	
}
