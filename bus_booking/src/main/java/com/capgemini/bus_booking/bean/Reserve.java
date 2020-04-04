package com.capgemini.bus_booking.bean;

public class Reserve {
	private int id;
	private int routeID;
	private boolean ac;
	private int fare;
	private String departureTime;
	private String arrivalTime;
	private int availablityCount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRouteID() {
		return routeID;
	}

	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public Reserve(int id, int routeID, boolean ac, int fare, String departureTime, String arrivalTime,
			int availablityCount) {
		super();
		this.id = id;
		this.routeID = routeID;
		this.ac = ac;
		this.fare = fare;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.availablityCount = availablityCount;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getAvailablityCount() {
		return availablityCount;
	}

	public void setAvailablityCount(int availablityCount) {
		this.availablityCount = availablityCount;
	}
}
