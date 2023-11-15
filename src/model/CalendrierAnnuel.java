package model;

public class CalendrierAnnuel {
	private Mois [] calendrier;
	
	public CalendrierAnnuel() {
		this.calendrier = new Mois[12];
		String[] nomsMois = {"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "decembre"}; 
		int [] nbJoursMois = {31, 28, 31,30,31,30,31,31,30,31,30,31};
		for (int i =0; i<nomsMois.length; i++) {
			calendrier[i] = new Mois(nomsMois[i], nbJoursMois[i]);
		}
	}
	
	private static class Mois {
		private String nom;
		private boolean [] jours;
		
		private Mois(String nom, int nbJours ) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
			for(int i=0; i<nbJours; i++) {
				jours[i]=false;
			}
		}
		
		
		private boolean estLibre(int jour) {
			return !jours[jour-1];
		}
		
		private void reserver(int jour) {
			jours[jour-1] = true;
		}
	}
	
	protected boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	
	protected boolean reserver(int jour, int mois) {
		if (estLibre(jour, mois)) {
			calendrier[mois-1].reserver(jour);
			return true;
		}
		return false;
	}
	
}
