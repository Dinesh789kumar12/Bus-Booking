package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.Map;

import com.capgemini.bus_booking.bean.Reserve;

public interface ReserveDao {
	public void addReserveDao(ArrayList<Reserve> lreserve);

	public ArrayList<Reserve> getreserveList();
	
	
}
