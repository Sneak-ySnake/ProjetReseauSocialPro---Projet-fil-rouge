package fr.cda.tender_du_poulet.metiers;

import fr.cda.tender_du_poulet.dto.UtilisateurDTO;

public class UtilisateurVerif {

	public boolean verifLogin(UtilisateurDTO u, String mdp) {
		if(u.getMot_de_passe_utilisateur().equals(mdp)) {
			return true;
		}
		else return false;
	}
	
}
