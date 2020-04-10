package com.capgemini.bus_booking.bean;

public class Reservation extends Reserve {
	private String origin;
	private String destination;
	private String departuretime;
	private String arrivaltime;

	public Reservation() {
	}

	public Reservation(int id, String custId, int busID, String dt, String tstamp, int seat, String origin,
			String destination, String departuretime, String arrivaltime) {
		this.setId(id);
		this.setCustId(custId);
		this.setBusID(busID);
		this.setDt(dt);
		this.setTstamp(tstamp);
		this.setSeat(seat);
		this.origin = origin;
		this.destination = destination;
		this.departuretime = departuretime;
		this.arrivaltime = arrivaltime;
	}

	public Reservation(Reserve reserve) {
		this.setId(reserve.getId());
		this.setCustId(reserve.getCustId());
		this.setBusID(reserve.getBusID());
		this.setDt(reserve.getDt());
		this.setTstamp(reserve.getTstamp());
		this.setSeat(reserve.getSeat());
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparturetime() {
		return departuretime;
	}

	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}

	public String getArrivaltime() {
		return arrivaltime;
	}

	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}

}
