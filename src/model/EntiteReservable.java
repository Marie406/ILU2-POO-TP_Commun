package model;

public abstract class EntiteReservable <F extends Formulaire> {
	private CalendrierAnnuel calendrierPerso;
	private int id;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int ident) {
		this.id = ident;
	}
	
	public boolean estLibre(F form) {
		return calendrierPerso.estLibre(form.getJour(), form.getMois());
	}
	
	public abstract boolean compatible(F form);
	
	public abstract Reservation reserver(F form);
}
