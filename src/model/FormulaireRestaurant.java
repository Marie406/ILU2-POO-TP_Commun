package model;

public class FormulaireRestaurant extends Formulaire {
	private int nbPersonnes;
	private int numService;

	
	public FormulaireRestaurant(int jour, int mois, int nbPers, int numSer) {
		super(jour, mois);
		this.nbPersonnes = nbPers;
		this.numService = numSer;
	}
	
	public int getNombrePersonnes() {
		return this.nbPersonnes;
	}
	
	public int getNumService() {
		return this.numService;
	}

	
	
}
