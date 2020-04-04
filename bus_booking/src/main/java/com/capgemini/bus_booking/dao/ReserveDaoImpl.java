package com.capgemini.bus_booking.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.bus_booking.bean.Reserve;

public class ReserveDaoImpl implements ReserveDao {

	HashMap<String, Reserve> hreserve = new HashMap<String, Reserve>();

	@Override
	public Map<String, Reserve> addReserve() {

		return hreserve;
	}

}
