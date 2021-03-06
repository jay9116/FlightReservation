package com.jay.flightreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.flightreservation.dto.ReservationRequest;
import com.jay.flightreservation.entities.Flight;
import com.jay.flightreservation.entities.Passenger;
import com.jay.flightreservation.entities.Reservation;
import com.jay.flightreservation.repos.FlightRepository;
import com.jay.flightreservation.repos.PassengerRepository;
import com.jay.flightreservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {

		//Make payment
		System.out.println("flight id is "+request.getFlightId());
		Long flightId = request.getFlightId();
		System.out.println("after getting the flight id ***********");
		Flight flight = flightRepository.findById(flightId).get();
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		Passenger savedPassenger = passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		Reservation savedReservation = reservationRepository.save(reservation); 
			
		return savedReservation;
	}

}
