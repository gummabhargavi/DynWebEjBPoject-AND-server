package com.java.ejb;

import java.sql.SQLException;

public class test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Bus bus= new Bus();
		BusDAO dao=new BusDAO();
		bus.setBus_id("B013");
		bus.setBus_no("ABSDFG112");
		bus.setBus_status(BusStatus.AVAILABLE);
		bus.setNo_of_seat(12);
		bus.setType_of_bus(TypeOfBus.NON_AC);
		bus.setType_of_servies(TypeOfServies.EVENT);
		
		System.out.println(dao.updateBus(bus));
		
		
	}

}
