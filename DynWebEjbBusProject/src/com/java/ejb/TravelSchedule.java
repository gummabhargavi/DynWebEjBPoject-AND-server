package com.java.ejb;

import java.io.Serializable;
import java.sql.Date;

public class TravelSchedule implements Serializable{
	
	private String schedule_id;
	private String bus_id;
	private String driver_id;
	private String starting_point;
	private String destination_point;
	private Date schedule_date;
	private String departure_time;
	private Date estimate_arrival_date;
	private String estimate_arrival_time;
	private double fare_amount;
	private String remark;
	private String address_starting_point;
	private String address_destination_point;
	
	public String getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(String schedule_id) {
		this.schedule_id = schedule_id;
	}
	public String getBus_id() {
		return bus_id;
	}
	public void setBus_id(String bus_id) {
		this.bus_id = bus_id;
	}
	public String getDriver_id() {
		return driver_id;
	}
	public void setDriver_id(String driver_id) {
		this.driver_id = driver_id;
	}
	public String getStarting_point() {
		return starting_point;
	}
	public void setStarting_point(String starting_point) {
		this.starting_point = starting_point;
	}
	public String getDestination_point() {
		return destination_point;
	}
	public void setDestination_point(String destination_point) {
		this.destination_point = destination_point;
	}
	public Date getSchedule_date() {
		return schedule_date;
	}
	public void setSchedule_date(Date schedule_date) {
		this.schedule_date = schedule_date;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public Date getEstimate_arrival_date() {
		return estimate_arrival_date;
	}
	public void setEstimate_arrival_date(Date estimate_arrival_date) {
		this.estimate_arrival_date = estimate_arrival_date;
	}
	public String getEstimate_arrival_time() {
		return estimate_arrival_time;
	}
	public void setEstimate_arrival_time(String estimate_arrival_time) {
		this.estimate_arrival_time = estimate_arrival_time;
	}
	public double getFare_amount() {
		return fare_amount;
	}
	public void setFare_amount(double fare_amount) {
		this.fare_amount = fare_amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAddress_starting_point() {
		return address_starting_point;
	}
	public void setAddress_starting_point(String address_starting_point) {
		this.address_starting_point = address_starting_point;
	}
	public String getAddress_destination_point() {
		return address_destination_point;
	}
	public void setAddress_destination_point(String address_destination_point) {
		this.address_destination_point = address_destination_point;
	}
	@Override
	public String toString() {
		return "TravelSchedule [schedule_id=" + schedule_id + ", bus_id=" + bus_id + ", driver_id=" + driver_id
				+ ", starting_point=" + starting_point + ", destination_point=" + destination_point + ", schedule_date="
				+ schedule_date + ", departure_time=" + departure_time + ", estimate_arrival_date="
				+ estimate_arrival_date + ", estimate_arrival_time=" + estimate_arrival_time + ", fare_amount="
				+ fare_amount + ", remark=" + remark + ", address_starting_point=" + address_starting_point
				+ ", address_destination_point=" + address_destination_point + "]";
	}
	public TravelSchedule(String schedule_id, String bus_id, String driver_id, String starting_point,
			String destination_point, Date schedule_date, String departure_time, Date estimate_arrival_date,
			String estimate_arrival_time, double fare_amount, String remark, String address_starting_point,
			String address_destination_point) {
		
		this.schedule_id = schedule_id;
		this.bus_id = bus_id;
		this.driver_id = driver_id;
		this.starting_point = starting_point;
		this.destination_point = destination_point;
		this.schedule_date = schedule_date;
		this.departure_time = departure_time;
		this.estimate_arrival_date = estimate_arrival_date;
		this.estimate_arrival_time = estimate_arrival_time;
		this.fare_amount = fare_amount;
		this.remark = remark;
		this.address_starting_point = address_starting_point;
		this.address_destination_point = address_destination_point;
	}
	public TravelSchedule() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
