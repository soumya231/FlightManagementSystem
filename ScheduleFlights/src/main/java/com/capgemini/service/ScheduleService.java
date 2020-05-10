package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capgemini.dao.ScheduleDao;
import com.capgemini.entity.ScheduleFlight;

@Service
public class ScheduleService implements ScheduleServiceI{

	@Autowired
	private ScheduleDao scheduledao ;
	

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
