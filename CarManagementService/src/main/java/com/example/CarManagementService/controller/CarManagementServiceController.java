package com.example.CarManagementService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import  com.example.CarManagementService.model.CarManagement;
import com.example.CarManagementService.service.CarService;

@RestController
public class CarManagementServiceController {
	@Autowired
	CarService service;
	
	@GetMapping("/car/all")
	public List<CarManagement> getAllcar(){
		return service.getAllCars();
	}
		
	@PostMapping("/car/add")
	public CarManagement addPost(@RequestBody CarManagement post) {
		return service.addcar(post);
	}
	
	@DeleteMapping("/car/delete/{carno}")
	public String deleteComment(@PathVariable("carno") String cid) {
		return service.deletecar(cid);
		
	}
//	
//	@PutMapping("/comments/update")
//	public Comments updateComment(@RequestBody Comments comment) {
//		return service.addComment(comment);
//	}
//	
//	@GetMapping("/comments/search/{commenter}")
//	public List<Comments> getAllByCommenter(@PathVariable("commenter") String commenter){
//		return service.searchCommentsByCommenter(commenter);
//	}
//	
//	
//	@GetMapping("/posts/comments/search/{pid}")
//	public List<Comments> getCommentsByPid(@PathVariable("pid") Integer pid){
//		return service.searchCommentsByPid(pid);
//	}
	
}