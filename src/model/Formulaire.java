package model;

public abstract class Formulaire {
	private int jourResa;
	private int moisResa;
	private int numEntite;
	
	protected Formulaire(int jour, int mois) {
		jourResa = jour;
		moisResa = mois;
	}
	
	public int getJour() {
		return this.jourResa;
	}
	
	public int getMois() {
		return this.moisResa;
	}
	
	public void setIdentificationEntite(int num) {
		this.numEntite = num;
	}
	
	public int getIdentificationEntite() {
		return this.numEntite;
	}
}
