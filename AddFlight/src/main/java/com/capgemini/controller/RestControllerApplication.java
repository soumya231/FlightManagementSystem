package com.capgemini.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.dao.RecordNotFoundException;
import com.capgemini.entity.Flight;
import com.capgemini.entity.ScheduleFlight;
import com.capgemini.service.FlightService;


@RestController
@RequestMapping("/flight")
@CrossOrigin(origins="http://localhost:4200")

public class RestControllerApplication {

	@Autowired
	private FlightService flightService;

	
	
//adding the details of flights	
	@PostMapping("/AddFlight")
	public ResponseEntity<String> addFlight(@RequestBody Flight flight) {
		Flight data=flightService.addFlight(flight);
		if(data==null){
			 throw new RecordNotFoundException("Flight exists " );
		}
		else{
			flightService.addFlight(flight);
			return new ResponseEntity<String>("Flight is added" , HttpStatus.OK);
			
		}
			
	}
	
	//scheduling the flights 
	@PutMapping("/update")
	public ResponseEntity<String> updateFlight( @RequestBody ScheduleFlight schedule) {
		
			ScheduleFlight data=flightService.updateFlight(schedule);
			if(data==null){
				 throw new RecordNotFoundException("Flight number not exists " );
			}
			else{
				return new ResponseEntity<>("Flight is Scheduled " , HttpStatus.OK);
 
            	 
			}
    }
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Enter valid data")
	@ExceptionHandler(RecordNotFoundException.class)                        //controller level exception handling
	public void recordNotFound() {
		//exception handling
		
	}
}
