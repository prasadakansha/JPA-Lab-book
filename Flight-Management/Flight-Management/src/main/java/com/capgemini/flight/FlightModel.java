package com.capgemini.flight;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class FlightModel {
	@Id
	@Column(name="flight_Id")
	private int fid;
	@Column(name="flight_Name")
	private String fname;
	@Column(name="flight_Capacity")
	private int seats;
	//Model class is one with default constructor,getters and setters and override the toString() method
	public FlightModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FlightModel [flight_Id=" + fid + ", flight_Name=" + fname + ", flight_Capacity=" + seats
				+ "]";
	}
	}

