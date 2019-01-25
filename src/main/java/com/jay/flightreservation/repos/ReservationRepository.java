package com.jay.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jay.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
