package com.example.CarManagementService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.CarManagementService")
public class CarManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarManagementServiceApplication.class, args);
	}

}