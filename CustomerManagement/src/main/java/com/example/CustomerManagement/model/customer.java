package com.example.CustomerManagement.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class customer {


	@Id
	String cname;
	@Column
	String address;

	@Column
	Integer mobilenumber;

	public customer(String cname, String address, Integer mobilenumber) {
		super();
		this.cname = cname;
		this.address = address;
		this.mobilenumber = mobilenumber;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Integer mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	
	
}
