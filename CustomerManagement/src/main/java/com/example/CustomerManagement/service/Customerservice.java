package com.example.CustomerManagement.service;

import java.util.List;


import com.example.CustomerManagement.model.customer;

public interface Customerservice {
	public customer addcustomer(customer c);
	public String deletecustomer(String name);
	public List<customer> getAllCustomer();

}
