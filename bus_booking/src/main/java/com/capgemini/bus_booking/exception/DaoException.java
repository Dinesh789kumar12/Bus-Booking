package com.capgemini.bus_booking.exception;

public class DaoException extends Exception {

	private static final long serialVersionUID = 1L;
	final String msg;

	public DaoException(String s) {
		this.msg = s;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
