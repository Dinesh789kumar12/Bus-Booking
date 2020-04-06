package com.capgemini.bus_booking.services;

import java.util.Map;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;

public interface CustomerServices {

	public Map<String, Reserve> cancelBooking();

	public Map<String, Reserve> refundMoney(String cancel);

	public Map<String, Bus> displayFare();

	public Map<String, Bus> seatAvailability();

	public void Rating();

	public void feedback();

	public void generateTicket();

	public Map<String, Reserve> busBooking();
}
