package com.capgemini.bus_booking.exception;

public class Password extends Exception {

	final String msg;

	public Password(String s) {
		super();
		this.msg = s;
	}

	@Override
	public String getMessage() {
		return msg;
	}

}
