package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.dao.RecordNotFoundException;
import com.capgemini.entity.ScheduleFlight;
import com.capgemini.service.ScheduleService;


@RestController
@RequestMapping("/flight")
@CrossOrigin(origins="http://localhost:4200", maxAge=3600)

public class RestControllerApplication {
	
	
	@Autowired
	private ScheduleService scheduleservice;
	
	@PutMapping("/update")
	public ResponseEntity<String> updateFlight( @RequestBody ScheduleFlight schedule) {
		
			ScheduleFlight data=scheduleservice.updateFlight(schedule);
			if(data==null){
				 throw new RecordNotFoundException("Flight number not exists " );
			}
			else{
 ResponseEntity<String>responseEntity = new ResponseEntity<String>("Flight is Scheduled " , HttpStatus.OK);
 
            return	 responseEntity;
				
			}
    }
	
@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Id not found")
@ExceptionHandler(RecordNotFoundException.class)                        //controller level exception handling
public void RecordNotFound() {
}
}