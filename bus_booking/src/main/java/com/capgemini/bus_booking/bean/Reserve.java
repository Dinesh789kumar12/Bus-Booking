package com.capgemini.bus_booking.bean;

public class Reserve {
	private int id;
	private String custId;
	private int busID;
	private String dt;
	private String tstamp;
	private int seat;

	public Reserve(int id, String custId, int busID, String dt, String tstamp, int seat) {
		super();
		this.id = id;
		this.custId = custId;
		this.busID = busID;
		this.dt = dt;
		this.tstamp = tstamp;
		this.seat = seat;
	}

	public Reserve() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public int getBusID() {
		return busID;
	}

	public void setBusID(int busID) {
		this.busID = busID;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getTstamp() {
		return tstamp;
	}

	public void setTstamp(String tstamp) {
		this.tstamp = tstamp;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "Reserve [id=" + id + ", custId=" + custId + ", busID=" + busID + ", dt=" + dt + ", tstamp=" + tstamp
				+ ", seat=" + seat + "]";
	}
	

}
