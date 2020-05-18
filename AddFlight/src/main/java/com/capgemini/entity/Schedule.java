package com.capgemini.entity;



import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity
@Table(name="scheduling_set")
public class Schedule {
	
	@Id
	@Column(length=10)
	private int scheduleId;
	@Column(length=10)
	private String source;
	@Column(length=10)
	private String destination;
	
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(length=10)
	private LocalDateTime departureDate;
//	 @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	 @Column(length=10)
	private LocalDateTime arrivalDate;
	
	
	@OneToOne( mappedBy = "schedule")
	private ScheduleFlight scheduleFlight;
	
	public int getScheduleId() {
		return scheduleId;
	}
	
	public void setScheduleFlight(ScheduleFlight scheduleFlight) {
		this.scheduleFlight = scheduleFlight;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	 
	    
	public LocalDateTime getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(LocalDateTime departureDate) {
		this.departureDate = departureDate;
	}
	public LocalDateTime getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(LocalDateTime arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	

	public Schedule(int scheduleId, String source, String destination, LocalDateTime departureDate,
			LocalDateTime arrivalDate) {
		super();
		this.scheduleId = scheduleId;
		this.source = source;
		this.destination= destination;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
	}
	public Schedule(){
		
	}
}
