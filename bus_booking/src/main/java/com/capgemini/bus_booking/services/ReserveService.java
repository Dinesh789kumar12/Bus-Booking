package com.capgemini.bus_booking.services;

import java.util.List;

import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.exception.DaoException;

public interface ReserveService {
	public boolean cancelBooking(Reserve reserve);

	public int seatAvailability(int busId, String dt);

	public boolean busBooking(Reserve reserve) throws DaoException;

	public List<Integer> checkSeatByBusDate(int bid, String date);

	public List<Reserve> generateReport();
}
