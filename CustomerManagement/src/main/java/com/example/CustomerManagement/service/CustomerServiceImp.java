package com.example.CustomerManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.CustomerManagement.model.customer;
import com.example.CustomerManagement.repo.CustomerManagementRepo;
@Service
public class CustomerServiceImp implements Customerservice {

	@Autowired
	 CustomerManagementRepo repo;

	public customer addcustomer(customer c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public String deletecustomer(String name) {
		// TODO Auto-generated method stub
		repo.deleteById(name);
		return "deleted ";
	}

	@Override
	public List<customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
