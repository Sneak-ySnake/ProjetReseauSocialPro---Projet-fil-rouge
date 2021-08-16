package fr.cda.tender_du_poulet.metiers;

import fr.cda.tender_du_poulet.dto.ProfilDTO;

public class ProfilVerif {
	public boolean inscriptionProfilIsNotEmpty(ProfilDTO p) {
		if (p.getId_profil() !=0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean inscriptionProfilIsTypeOk(ProfilDTO p) {
		if (Integer.toString(p.getId_profil()).matches("^[0-9]*$")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean inscriptionProfilIsValeurOk(ProfilDTO p) {
        if(p.getId_profil() > 0) {
        	return true;
        } else {
        	return false;
        }
	}

	public boolean inscriptionDesProfilsIsValeurOk(ProfilDTO p1, ProfilDTO p2, ProfilDTO p3) {
		if(inscriptionProfilIsNotEmpty(p1) || inscriptionProfilIsNotEmpty(p2) || inscriptionProfilIsNotEmpty(p3)) {
			if(inscriptionProfilIsTypeOk(p1) || inscriptionProfilIsTypeOk(p2) || inscriptionProfilIsTypeOk(p3)) {
				if(inscriptionProfilIsValeurOk(p1) || inscriptionProfilIsValeurOk(p2) || inscriptionProfilIsValeurOk(p3)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
