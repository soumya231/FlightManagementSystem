package com.capgemini.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.dao.FlightDao;
import com.capgemini.dao.ScheduleDao;
import com.capgemini.entity.Flight;
import com.capgemini.entity.ScheduleFlight;

@Service
public class FlightService implements FlightServiceI {
	
	
	@Autowired
	private FlightDao flightDao;
	
	@Autowired
	private ScheduleDao scheduledao;
		

	@Override
	public Flight addFlight(Flight data) {
         ScheduleFlight details=data.getScheduleFlight();
         boolean result=scheduledao.existsById(details.getFlightNumber());
         Flight flight=null;
         if(!result){
        	flight=  flightDao.save(data);
         }
		 return flight;
		 
		
	}
	
	@Override
	public ScheduleFlight updateFlight(ScheduleFlight schedule) {
	
	boolean result=scheduledao.existsById(schedule.getFlightNumber());
	ScheduleFlight data = null;
	if(result){
		 data=scheduledao.save(schedule);
	}
		return data;


}
	

}
