package com.example.TripManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.TripManagement")
public class TripManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripManagementApplication.class, args);
	}

}
