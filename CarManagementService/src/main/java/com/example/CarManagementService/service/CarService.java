package com.example.CarManagementService.service;

import java.util.List;

import com.example.CarManagementService.model.CarManagement;


public interface CarService {
	
	public List<CarManagement> getAllCars();
	public CarManagement addcar(CarManagement car);
	public String deletecar(String carno);
//	public Comments updateComment(Comments comment);
//	public List<Comments> searchCommentsByCommenter(String commenter);
//	public List<Comments> searchCommentsByPid(Integer pid);
}
