package com.example.TripManagement.service;

import java.util.List;

import com.example.TripManagement.model.Trip;


public interface TripService {
	public List<Trip> searchBasedOnCar(String carno);
	public Trip addtrip(Trip car);
	//public Trip addcar(Trip car);
	
	public String deletetrip(String tid);
	
}
