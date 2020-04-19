package com.capgemini.bus_booking.exception;

public class Email extends Exception {

	final String msg;

	public Email(String s) {
		super();
		this.msg = s;
	}

	@Override
	public String getMessage() {
		return msg;
	}

}
