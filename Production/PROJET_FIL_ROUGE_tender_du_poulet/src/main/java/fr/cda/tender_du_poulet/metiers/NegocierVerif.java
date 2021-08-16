package fr.cda.tender_du_poulet.metiers;

public class NegocierVerif {
	public boolean isNotEmpty(String message) {
		if (!message.equals("")) {
			return true;
		} else {
			return false;
		}
	}
}
