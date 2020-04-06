package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.bus_booking.bean.Bus;

public class BusDaoImpl implements BusDao {

	List<Bus> lbus = new ArrayList<Bus>();

	public BusDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		lbus.add(new Bus(1, 11, true, 999, "04:00 AM", "08:00PM", 35));
		lbus.add(new Bus(2, 222, false, 888, "04:00AM", "09:00 PM", 36));
		lbus.add(new Bus(4, 444, true, 400, "07:00 AM", "11:00 PM", 40));
		lbus.add(new Bus(6, 666, false, 250, "15:00 PM", "18:00 PM", 40));
		lbus.add(new Bus(7, 777, true, 500, "16:00 PM", "21:00 PM", 48));
		lbus.add(new Bus(8, 888, true, 400, "19:00 PM", "24:00 AM", 72));
	}

	@Override
	public List<Bus> addbusDao() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Bus> getLbus() {
		return lbus;
	}

	public void setLbus(List<Bus> lbus) {
		this.lbus = lbus;
	}
	

}
