package com.capgemini.entity;



import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="scheduled_set")
public class ScheduleFlight implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="flight_number")
	private int flightNumber;
	@Column(length=10)
	private int scheduleFlightId; 
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "scheduleFlight")
	private Flight flight;
	

	 @OneToOne(cascade = {CascadeType.ALL})
	    @JoinColumn(name = "scheduleId")
	 @JsonProperty()
	 @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	 private Schedule schedule;
	 
	 
	
	public int getScheduleFlightId() {
		return scheduleFlightId;
	}



	public void setScheduleFlightId(int scheduleFlightId) {
		this.scheduleFlightId = scheduleFlightId;
	}
	


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public Flight getFlight() {
		return flight;
	}



	public Schedule getSchedule() {
		return schedule;
	}



	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}



	public int getFlightNumber() {
		return flightNumber;
	}



	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}



	public ScheduleFlight(int scheduleFlightId, int flightNumber) {
		super();
		this.scheduleFlightId = scheduleFlightId;
		this.flightNumber = flightNumber;
	}

public ScheduleFlight(){
	
}



	
}
