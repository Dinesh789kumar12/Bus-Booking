package com.capgemini.bus_booking.dao;

import java.util.Map;

import com.capgemini.bus_booking.bean.Reserve;

public interface ReserveDao {
	public Map<String, Reserve> addReserve();
}
