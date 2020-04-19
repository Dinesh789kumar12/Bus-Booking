package com.capgemini.bus_booking.exception;

public class Contact extends Exception {

	final String msg;

	public Contact(String s) {
		super();
		this.msg = s;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
