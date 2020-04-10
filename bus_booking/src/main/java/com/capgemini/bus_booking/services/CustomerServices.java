package com.capgemini.bus_booking.services;

import com.capgemini.bus_booking.bean.Reserve;

public interface CustomerServices {

	public boolean cancelBooking(Reserve reserve);

	public void refundMoney(String cancel);

	public int displayFare(Reserve res);

	public int seatAvailability(int bid,String date);

	public void generateTicket(Reserve res);

	public boolean busBooking(Reserve reserve);
	
	public int seatAvailableBus(int id, String date);
}
