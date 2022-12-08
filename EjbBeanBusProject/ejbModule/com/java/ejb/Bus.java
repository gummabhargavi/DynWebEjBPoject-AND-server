package com.java.ejb;

import java.io.Serializable;

public class Bus implements Serializable{
	
	private String bus_id;
	private String bus_no;
	private TypeOfBus type_of_bus;
	private TypeOfServies type_of_servies;
	private int no_of_seat;
	private BusStatus bus_status;
	
	public String getBus_id() {
		return bus_id;
	}
	public void setBus_id(String bus_id) {
		this.bus_id = bus_id;
	}
	public String getBus_no() {
		return bus_no;
	}
	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}
	public TypeOfBus getType_of_bus() {
		return type_of_bus;
	}
	public void setType_of_bus(TypeOfBus type_of_bus) {
		this.type_of_bus = type_of_bus;
	}
	public TypeOfServies getType_of_servies() {
		return type_of_servies;
	}
	public void setType_of_servies(TypeOfServies type_of_servies) {
		this.type_of_servies = type_of_servies;
	}
	public int getNo_of_seat() {
		return no_of_seat;
	}
	public void setNo_of_seat(int no_of_seat) {
		this.no_of_seat = no_of_seat;
	}
	public BusStatus getBus_status() {
		return bus_status;
	}
	public void setBus_status(BusStatus bus_status) {
		this.bus_status = bus_status;
	}
	@Override
	public String toString() {
		return "Bus [bus_id=" + bus_id + ", bus_no=" + bus_no + ", type_of_bus=" + type_of_bus + ", type_of_servies="
				+ type_of_servies + ", no_of_seat=" + no_of_seat + ", bus_status=" + bus_status + "]";
	}
	public Bus(String bus_id, String bus_no, TypeOfBus type_of_bus, TypeOfServies type_of_servies, int no_of_seat,
			BusStatus bus_status) {
		
		this.bus_id = bus_id;
		this.bus_no = bus_no;
		this.type_of_bus = type_of_bus;
		this.type_of_servies = type_of_servies;
		this.no_of_seat = no_of_seat;
		this.bus_status = bus_status;
	}
	public Bus() {
		
		// TODO Auto-generated constructor stub
	}
	
	

}
