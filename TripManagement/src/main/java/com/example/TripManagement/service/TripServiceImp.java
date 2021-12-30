package com.example.TripManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TripManagement.model.Trip;
import com.example.TripManagement.repo.TripManagementRepo;

@Service
public class TripServiceImp implements TripService{
	@Autowired
	TripManagementRepo repo;

	@Override
	public List<Trip> searchBasedOnCar(String carno) {
		
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Trip addtrip(Trip car) {
		// TODO Auto-generated method stub
		return repo.save(car);
		//return null;
	}

	@Override
	public String deletetrip(String tid) {
		// TODO Auto-generated method stub
		repo.deleteById(tid);
		return "trip is deleted";
	}

}
