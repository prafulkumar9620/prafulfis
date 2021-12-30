package com.example.CarManagementService.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class CarManagement {
	@Id
	String carno;
	@Column
	String car_owner;
	@Column
	String fuel_type;
	@Column
	Integer no_of_seats;
	@Column
	String model;
	public CarManagement()
	{
		
	}
	public CarManagement(String carno, String car_owner, String fuel_type, int no_of_seats, String model) {
		super();
		this.carno = carno;
		this.car_owner = car_owner;
		this.fuel_type = fuel_type;
		this.no_of_seats = no_of_seats;
		this.model = model;
	}
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public String getCar_owner() {
		return car_owner;
	}
	public void setCar_owner(String car_owner) {
		this.car_owner = car_owner;
	}
	public String getFule_type() {
		return fuel_type;
	}
	public void setFule_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	public int getNo_of_seats() {
		return no_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	

}
