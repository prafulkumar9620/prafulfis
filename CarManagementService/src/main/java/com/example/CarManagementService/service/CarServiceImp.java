package com.example.CarManagementService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CarManagementService.model.CarManagement;
import com.example.CarManagementService.repo.CarManagementServiceRepo;

@Service
public class CarServiceImp implements CarService{
	
	@Autowired
	CarManagementServiceRepo repo;
	
	public List<CarManagement> getAllCars()
	{
		return repo.findAll();
		
	}
	public CarManagement addcar(CarManagement car)
	{
		return repo.save(car);
	
	}
	public String deletecar(String carno) {
		repo.deleteById(carno);
		return "deleted ";
	}
	
}
