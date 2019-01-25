package com.jay.flightreservation.services;


import com.jay.flightreservation.dto.ReservationRequest;
import com.jay.flightreservation.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);

}
