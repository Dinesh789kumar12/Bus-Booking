package com.capgemini.bus_booking.services;

import java.util.List;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;

public interface CustomerServices {

	public List<Reserve> cancelBooking();

	public List<Reserve> refundMoney(String cancel);

	public List<Bus> displayFare();

	public List<Bus> seatAvailability();

	public void Rating();

	public void feedback();

	public void generateTicket();

	public List<Reserve> busBooking();
}
