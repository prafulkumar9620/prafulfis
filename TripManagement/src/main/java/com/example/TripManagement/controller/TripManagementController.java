package com.example.TripManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TripManagement.model.Trip;
import com.example.TripManagement.service.TripService;


@RestController
public class TripManagementController {
	@Autowired
	TripService service;
	
//	@GetMapping("/trip/all/{cid}")
//	public List<Trip> getAllcar(){
//		return service.searchBasedOnCar(@PathVariable("cid") String cid);
//	}
		
	@PostMapping("/trip/add")
	public Trip addPost(@RequestBody Trip post) {
		return service.addtrip(post);
	}
	
	@DeleteMapping("/trip/delete/{tid}")
	public String deleteComment(@PathVariable("tid") String tid) {
		return service.deletetrip(tid);
		
	}
}
