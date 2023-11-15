package model;

public abstract class Reservation {
	private int jourResa;
	private int moisResa;
	
	Reservation(int jourResa, int moisResa) {
		this.jourResa = jourResa;
		this.moisResa = moisResa;
	}
	
	@Override
	public String toString() {
		return("Le " + Integer.toString(jourResa) + "/" + Integer.toString(moisResa) + "\n");
	}
	
}
