package com.capgemini.bus_booking.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.bus_booking.bean.Reserve;

public class ReserveDaoImpl implements ReserveDao {

	HashMap<String, Reserve> hreserve = new HashMap<String, Reserve>();

	public ReserveDaoImpl() {
		super();
		hreserve.put("Ramesh", new Reserve(01, 11, true, 999, "04:00 AM", "08:00PM", 35));
		hreserve.put("rakesh", new Reserve(02, 666, false, 250, "15:00 PM", "18:00 PM", 40));
	}

	@Override
	public Map<String, Reserve> addReserve() {

		return hreserve;
	}

	public HashMap<String, Reserve> getHreserve() {
		return hreserve;
	}

	public void setHreserve(HashMap<String, Reserve> hreserve) {
		this.hreserve = hreserve;
	}

}
