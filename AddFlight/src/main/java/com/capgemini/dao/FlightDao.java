package com.capgemini.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Flight;

@Repository
public interface FlightDao extends JpaRepository<Flight, Integer> {
	
	@Query("Select d from Flight d where d.flights=?1")
	public List<Flight> findAllFlights();
	

	
}
