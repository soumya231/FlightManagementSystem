package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Schedule;

@Repository
public interface ScheduleFlightDao extends JpaRepository<Schedule, Integer>{
	
	@Query("select  e from Schedule e where e.sourceAirport=?1 and e.destinationAirport=?2")
	Schedule findFlight(String fromloc, String toloc);
	
	
//	List<Schedule> findFlight(String fromloc, String toloc, LocalDateTime departureDate);

}
