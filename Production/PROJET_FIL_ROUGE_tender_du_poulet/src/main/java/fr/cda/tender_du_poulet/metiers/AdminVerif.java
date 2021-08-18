package fr.cda.tender_du_poulet.metiers;

import fr.cda.tender_du_poulet.dto.AdminDTO;
import fr.cda.tender_du_poulet.dto.DomaineDTO;
import fr.cda.tender_du_poulet.dto.VilleDTO;

public class AdminVerif {
	
	public boolean verifLogin(AdminDTO u, String mdp) {
		if(u.getMot_de_passe_admin().equals(mdp)) {
			return true;
		}
		else return false;
	}
	
	public boolean isNotEmpty(String adresseMail, String mdp, String telephone, String numVoie, String adresse,
			String complementAdresse, VilleDTO ville) {
		if ( !adresseMail.equals("") && !mdp.equals("") && !telephone.equals("") && !numVoie.equals("") && !adresse.equals("") &&
				 !complementAdresse.equals("") && (ville.getId_ville() != 0 ) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isTypeOk( String adresseMail, String telephone, VilleDTO ville, DomaineDTO domaine) {
		if(adresseMail.matches("^.+@.+$") && telephone.matches("^[0-9]+$") &&
		Integer.toString(ville.getId_ville()).matches("^[0-9]*$") ) {
        	return true;
        } else {
        	return false;
        }
	}
		
		boolean isValeurOk (VilleDTO ville) {
			if (ville.getId_ville() > 0) 
	        	return true;
	       else {
	        	return false;
	        }
		}
		
		
	}


