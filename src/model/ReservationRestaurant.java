package model;

public class ReservationRestaurant extends Reservation {
	private int service;
	private int tableResa;
	private String description;
	
	ReservationRestaurant(int jourResa, int moisResa, int service, int tableResa) {
		super(jourResa, moisResa);
		this.service = service;
		this.tableResa = tableResa;
	}
	
	@Override
	public String toString() {
		String numero = "";
		if (service==1) {
			numero = "premier";
		}
		else {
			numero = "deuxième";
		}
		return (super.toString() + "Table " + Integer.toString(tableResa) + " pour le " + numero + " service.");
	}
}
