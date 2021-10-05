package fr.diginamic.state;

public class Avion {

	private AvionEtat etat;

	public void setEtat(AvionEtat etat) {
		this.etat = etat;
	}
	
	public void rentrerTrainAtterrissage() {
		this.etat.rentrerTrainAtterrissage();
	}
	
	public void sortirTrainAtterrissage() {
		this.etat.sortirTrainAtterrissage();
	}
	
	
}
