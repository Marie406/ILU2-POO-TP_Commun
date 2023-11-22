package model;

public class CentraleReservation <T extends EntiteReservable, F extends Formulaire> {
	private EntiteReservable [] entitesResa;
	private int nbEntites = 0;
	
	public CentraleReservation(T [] tab) {
		this.entitesResa = tab;
	}
	
	public int ajouterEntite(T entite) {
		entite.setId(entite.getId()+1);
		this.entitesResa[nbEntites] = entite;
		nbEntites++;
		return entite.getId();
	}
	
	
	//on part du principe qu'on appelle cette fonction qu'une fois qu'on a remplit le tableau entitesResa
	public int [] donnerPossibilites(F form) {
		int [] dispos = new int[nbEntites];
		for(int i=0; i<nbEntites; i++) {
			if(entitesResa[i].estLibre(form) && entitesResa[i].compatible(form)) 
				dispos[i] = entitesResa[i].getId();
			else 
				dispos[i] = 0;
		}
		return dispos;
	}
	
	
	
	
}
