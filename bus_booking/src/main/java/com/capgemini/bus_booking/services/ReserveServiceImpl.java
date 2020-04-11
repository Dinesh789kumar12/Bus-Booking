package com.capgemini.bus_booking.services;

import java.util.List;

import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.dao.ReserveDaoImpl;
import com.capgemini.bus_booking.exception.DaoException;

public class ReserveServiceImpl implements ReserveService {

	private ReserveDaoImpl rsdaoimpl = new ReserveDaoImpl();

	@Override
	public boolean cancelBooking(Reserve reserve) {
		Reserve record = rsdaoimpl.findById(reserve.getId());
		if (record.getCustId() == reserve.getCustId()) {
			rsdaoimpl.deleteById(record);
			return true;
		}
		return false;
	}

	@Override
	public int seatAvailability(int busId, String dt) {
		int seat = rsdaoimpl.seatAvailabilityDao(busId, dt);
		return seat;
	}

	@Override
	public boolean busBooking(Reserve reserve) throws DaoException {
		boolean check = false;
		if (reserve == null) {
			check = false;
		} else {
			rsdaoimpl.addReserveDao(reserve);
			check = true;
		}
		return check;
	}

	@Override
	public List<Integer> checkSeatByBusDate(int bid, String date) {
		List<Integer> leftSeat = rsdaoimpl.getSeatNumbersByBusAndDate(bid, date);
		return leftSeat;
	}

}
