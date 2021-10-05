package fr.diginamic.tp01_refacto;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationCalculations {
	
	// Calcul du montant total de la réservation qui dépend:
	//    - du nombre de places
	//    - de la réduction qui s'applique si le client est premium ou non
	public static double getReservationTotalAmount(TypeReservation type, Client client, int nbPlaces) {
		double total = type.getMontant() * nbPlaces;
		if (client.isPremium()) {
			total = total*(1-type.getReductionPourcent()/100.0);
		}
		return total;
	}
}
