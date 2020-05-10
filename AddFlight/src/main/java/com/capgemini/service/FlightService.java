package com.capgemini.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.dao.FlightDao;
import com.capgemini.entity.Flight;

@Service
public class FlightService implements FlightServiceI {
	
	
	@Autowired
	private FlightDao flightDao;
	
	

	@Override
	public String addFlight(Flight flight) {
		
		 flightDao.save(flight);
		 return "Flight is Added";
		
	}
	

}
