package com.capgemini.bus_booking.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.exception.DaoException;

public class ReserveDaoImpl implements ReserveDao {

	ArrayList<Reserve> lreserve = new ArrayList<Reserve>();
	private static final Logger logger = Logger.getLogger(ReserveDaoImpl.class);

	public ReserveDaoImpl() {
		super();
		// lreserve.add(new Reserve(id, custId, busID, dt, tstamp, seat))
		lreserve.add(new Reserve(1, "11", 1, "04-04-2020", "04-04-2020", 2));
		lreserve.add(new Reserve(2, "22", 8, "05-04-2020", "05-04-2020", 1));
		lreserve.add(new Reserve(3, "22", 8, "08-04-2020", "08-04-2020", 5));
		lreserve.add(new Reserve(4, "33", 3, "03-04-2020", "03-04-2020", 4));
		lreserve.add(new Reserve(5, "44", 4, "04-04-2020", "04-04-2020", 5));
		lreserve.add(new Reserve(6, "22", 9, "04-04-2020", "04-04-2020", 2));
		lreserve.add(new Reserve(7, "55", 10, "05-04-2020", "05-04-2020", 7));
		lreserve.add(new Reserve(8, "33", 21, "06-05-2020", "06-04-2020", 8));
	}

	@Override
	public void addReserveDao(Reserve reserve) throws DaoException {
		if (reserve != null) {
			lreserve.add(reserve);
			logger.info("Passenger reserve record has been added!!!");
		} else {
			throw new DaoException("Error in reserve record of passenger");
		}

	}

	@Override
	public ArrayList<Reserve> getreserveList() {
		return lreserve;
	}

	@Override
	public Reserve findById(int id) {
		Reserve res = lreserve.stream().filter(p -> p.getId() == id).findAny().orElse(null);
		return res;
	}

	@Override
	public List<Integer> getSeatNumbersByBusAndDate(int busid, String date) {
		List<Reserve> res = lreserve.stream().filter(p -> p.getBusID() == busid && p.getDt().equals(date))
				.collect(Collectors.toList());

		List<Integer> seatNumbers = new ArrayList<Integer>();
		for (Reserve row : res) {
			seatNumbers.add(row.getSeat());
		}
		return seatNumbers;
	}

	@Override
	public int seatAvailabilityDao(int id, String date) {
		int seatoccupied = new ReserveDaoImpl().getSeatNumbersByBusAndDate(id, date).stream().reduce((a, b) -> a + b)
				.get();
		Bus totalSeat = new BusDaoImpl().getLbusList().stream().filter(p -> p.getId() == id).findAny().orElse(null);
		return totalSeat.getAvailablityCount() - seatoccupied;
	}

	@Override
	public void deleteById(Reserve res) {
		if (res != null) {
			lreserve.remove(res);
			logger.info("1 Reserve record has been deleted");
		}
	}
}
