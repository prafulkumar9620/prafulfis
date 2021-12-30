package com.example.TripManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="trip")
public class Trip {

	@Id
	String tid;
	@Column
	String carno;
	@Column
	String source;
	@Column
	String customername;
	@Column
	Integer amount;
	public Trip() {}
	public Trip(String tid, String carno, String source, String customername, Integer amount) {
		super();
		this.tid = tid;
		this.carno = carno;
		this.source = source;
		this.customername = customername;
		this.amount = amount;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
}
