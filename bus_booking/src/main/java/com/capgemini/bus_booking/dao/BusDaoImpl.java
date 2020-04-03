package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bus_booking.bean.Bus;

public class BusDaoImpl implements BusDao {

	ArrayList<Bus> lbus = new ArrayList<Bus>();

	@Override
	public List<Bus> addBus() {
		// TODO Auto-generated method stub
		return lbus;
	}

	public ArrayList<Bus> getLbus() {
		return lbus;
	}

	public void setLbus(ArrayList<Bus> lbus) {
		this.lbus = lbus;
	}

}
