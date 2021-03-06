package com.jay.flightreservation.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jay.flightreservation.entities.Flight;
import com.jay.flightreservation.repos.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	FlightRepository flightRepository;

	@RequestMapping(value = "/findFlights", method = RequestMethod.POST)
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,
			ModelMap modelMap) {
		List<Flight> flights = flightRepository.findFlights(from, to, departureDate);
		modelMap.addAttribute("flights", flights);
		System.out.println("done with searching the flight");
		Flight flig = new Flight();
		System.out.println(flig.getDateOfDeparture());
		//return "diplayFlights";
		//return "completeReservation";
		return "showFlights";
	}
}
