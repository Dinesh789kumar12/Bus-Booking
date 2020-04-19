package com.capgemini.bus_booking.exception;

public class NameException extends Exception {
	final String msg;

	public NameException(String s) {
		super();
		this.msg = s;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
