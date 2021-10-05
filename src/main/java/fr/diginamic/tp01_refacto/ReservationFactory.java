package fr.diginamic.tp01_refacto;

import java.time.LocalDateTime;

import fr.diginamic.singleton.utils.DateUtils;
import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationFactory {
	
	public static Reservation getInstance(
			String dateReservationStr, 
			int nbPlaces,
			Client client,
			TypeReservation typeReservation
		) {
		
		//Conversion de la date de réservation en LocalDateTime
		LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);
		
		//cr�ation de la r�servation
		Reservation reservation = new Reservation(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);
		
		//calcul du montant total
		reservation.setTotal(ReservationCalculations.getReservationTotalAmount(typeReservation, client, nbPlaces));
		
		//Ajout de la réservation au client
		client.getReservations().add(reservation);

		return reservation;
	}
}
