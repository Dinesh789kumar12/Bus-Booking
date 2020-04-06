package com.capgemini.bus_booking.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {

	public static boolean emailValidator(String email) {
		if (email != "" && email != null) {
			final Pattern EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
					Pattern.CASE_INSENSITIVE);
			Matcher matcher = EMAIL_REGEX.matcher(email);
			return matcher.find();
		} else {

			System.out.println("Field email have a null value in it.");
			return false;
		}

	}
}
