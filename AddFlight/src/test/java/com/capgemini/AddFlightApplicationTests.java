package com.capgemini;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import java.net.URI;
import java.net.URISyntaxException;

import com.capgemini.entity.Flight;
import com.capgemini.entity.ScheduleFlight;

import junit.framework.Assert;


@SuppressWarnings("deprecation")
@SpringBootTest
public class AddFlightApplicationTests {

	
	

	
	@Test
	public void testAdding() throws URISyntaxException {
		
		RestTemplate restTemplate = new RestTemplate();
	    final String baseUrl = "http://localhost:" + 8885 + "/flight/AddFlight";
	    URI uri = new URI(baseUrl);
	 Flight flight=new Flight();
	 ScheduleFlight schedule=new ScheduleFlight();
	 flight.setFlights(130);
	schedule.setFlightNumber(17771);
		flight.setFlightModel("Jet");
		flight.setCarrierName("rithu");
		flight.setSeatCapacity(100);
		flight.setScheduleFlight(schedule);
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-COM-PERSIST", "Flight is Added");
		 HttpEntity<Flight> request = new HttpEntity<>(flight, headers);
		 ResponseEntity<String> result = restTemplate.postForEntity(uri, request,String.class);
		 Assert.assertEquals(200, result.getStatusCodeValue());
        Assert.assertNotNull(flight);

	}

}
