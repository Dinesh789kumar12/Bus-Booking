package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.bus_booking.bean.Reserve;

public class ReserveDaoImpl implements ReserveDao {

	ArrayList<Reserve> lreserve = new ArrayList<Reserve>();

	public ReserveDaoImpl() {
		super();
		lreserve.add(new Reserve(01, 11, true, 999, "04:00 AM", "08:00PM", 35));
		lreserve.add(new Reserve(02, 666, false, 250, "15:00 PM", "18:00 PM", 40));
	}

	@Override
	public void addReserveDao(ArrayList<Reserve> lreserve) {
		this.lreserve = lreserve;
	}

	public ArrayList<Reserve> getreserveList() {
		return lreserve;
	}

}
