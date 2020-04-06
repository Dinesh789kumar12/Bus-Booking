package com.capgemini.bus_booking.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.bus_booking.bean.Bus;

public class BusDaoImpl implements BusDao {

	HashMap<String, Bus> hbus = new HashMap<String, Bus>();

	@Override
	public Map<String, Bus> add_bus() {

		return hbus;
	}
	
	public BusDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		hbus.put("SRS", new Bus(1, 11, true, 999, "04:00 AM", "08:00PM", 35));
		hbus.put("RSRTC", new Bus(2, 222, false, 888, "04:00AM", "09:00 PM", 36));
		hbus.put("PRASANNA_PURPLS", new Bus(4, 444, true, 400, "07:00 AM", "11:00 PM", 40));
		hbus.put("AAVI_TRAVEL", new Bus(6, 666, false, 250, "15:00 PM", "18:00 PM", 40));
		hbus.put("SRM", new Bus(7, 777, true, 500, "16:00 PM", "21:00 PM", 48));
		hbus.put("avi", new Bus(8, 888, true, 400, "19:00 PM", "24:00 AM", 72));
	}

	public HashMap<String, Bus> getHbus() {
		return hbus;
	}

	public void setHbus(HashMap<String, Bus> hbus) {
		this.hbus = hbus;
	}
}
