package fr.cda.tender_du_poulet.metiers;

import java.text.SimpleDateFormat;
import java.util.Date;

import fr.cda.tender_du_poulet.dto.EtatPublicationDTO;
import fr.cda.tender_du_poulet.dto.StatutPublicationDTO;
import fr.cda.tender_du_poulet.dto.TypePublicationDTO;
import fr.cda.tender_du_poulet.dto.UtilisateurDTO;

public class PublicationVerif {
	public boolean isNotEmpty(String nomPublication, String descriptionPublication, float prix, 
			String typeProduit, String datePublication, int quantite, UtilisateurDTO utilisateur,
			TypePublicationDTO typePublication, StatutPublicationDTO statutPublication, EtatPublicationDTO etatPublication) {
		if (!nomPublication.equals("") && !descriptionPublication.equals("")  && prix != 0 && 
				!typeProduit.equals("") && !datePublication.equals("") && quantite != 0 && utilisateur.getId_utilisateur() != 0 &&
				(typePublication.getId_type_publication() != 0 && typePublication.getNom_type_publication() != "") &&
				(statutPublication.getId_statut_publication() != 0 && statutPublication.getNom_statut_publication() != "") &&
				(etatPublication.getId_etat_publication() != 0 && etatPublication.getNom_etat_publication() != "")
				/*((typePublication != "{}") || (typePublication != "{\"type_publication\":null\"}") || (typePublication != null) || (!typePublication.equals(null)))*//* && statuePublication != null*/) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isTypeOk(float prix, String datePublication, int quantite, UtilisateurDTO utilisateur,
			TypePublicationDTO typePublication, StatutPublicationDTO statutPublication, EtatPublicationDTO etatPublication) {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String datePublicationFormatter = simpleDateFormat.format(new Date());
        if((Float.toString(prix).matches("^[0-9]*.[0-9]*$") || Float.toString(prix).matches("^[0-9]*$")) && 
        		datePublicationFormatter.matches("^[0-9]{4}-[0-9]{2}-[0-9]{2}$") &&
        		Integer.toString(utilisateur.getId_utilisateur()).matches("^[0-9]*$") && 
        		Integer.toString(typePublication.getId_type_publication()).matches("^[0-9]*$") && 
        		Integer.toString(statutPublication.getId_statut_publication()).matches("^[0-9]*$") && 
        		Integer.toString(etatPublication.getId_etat_publication()).matches("^[0-9]*$")) {
        	return true;
        } else {
        	return false;
        }
	}
	
	public boolean isValeurOk(float prix, int quantite, UtilisateurDTO utilisateur,
			TypePublicationDTO typePublication, StatutPublicationDTO statutPublication, EtatPublicationDTO etatPublication) {
        if(prix > 0 && quantite > 0 && utilisateur.getId_utilisateur() > 0 && 
        		typePublication.getId_type_publication() > 0 && 
        		statutPublication.getId_statut_publication() > 0 && 
        		etatPublication.getId_etat_publication() > 0) {
        	return true;
        } else {
        	return false;
        }
	}
}
