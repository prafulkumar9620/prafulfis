package com.example.CustomerManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerManagement.model.customer;
import com.example.CustomerManagement.service.Customerservice;

@RestController
public class CustomerManagementcontroller {

	@Autowired
	Customerservice service;
	
	@GetMapping("/customer/all")
	public List<customer> getAllcustomer(){
		return service.getAllCustomer();
	}
		
	@PostMapping("/customer/add")
	public customer addPost(@RequestBody customer post) {
		return service.addcustomer(post);
	}
	
	@DeleteMapping("/customer/delete/{name}")
	public String deleteComment(@PathVariable("name") String name) {
		return service.deletecustomer(name);
		
	}
}
