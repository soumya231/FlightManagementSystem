package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.entity.Flight;
import com.capgemini.service.FlightService;


@RestController
@RequestMapping("/flight")
@CrossOrigin(origins="http://localhost:4200", maxAge=3600)

public class RestControllerApplication {

	@Autowired
	private FlightService flightService;

	
	@PostMapping("/AddFlight")
	public String addFlight(@RequestBody Flight flight) {
    
		        	
		return	flightService.addFlight(flight);
			
	}
	
}
