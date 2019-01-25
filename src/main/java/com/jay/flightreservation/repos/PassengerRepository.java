package com.jay.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jay.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
