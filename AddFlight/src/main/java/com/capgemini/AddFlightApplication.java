package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AddFlightApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddFlightApplication.class, args);
	}

}
