package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.exception.DaoException;

public interface ReserveDao {
	public void addReserveDao(Reserve lreserve) throws DaoException;

	public ArrayList<Reserve> getreserveList();

	public Reserve findById(int id);

	public List<Integer> getSeatNumbersByBusAndDate(int busid, String date);

	public int seatAvailabilityDao(int id,String date);
	
	public void deleteById(Reserve res);
}
