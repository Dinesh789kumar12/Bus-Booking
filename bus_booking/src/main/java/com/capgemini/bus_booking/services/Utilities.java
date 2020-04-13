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

	public static boolean nameValidator(String name) {
		if (name != "" && name != null) {
			Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,10}");
			Matcher m = p.matcher(name);
			return m.find();

		} else {
			System.out.println("Enter ur  name");
			return false;
		}
	}

	public static boolean contactValidator(String contact_no) {
		if (contact_no != "" && contact_no != null) {
			Pattern p = Pattern.compile("[7-9]{1}[0-9]{9}");
			Matcher m = p.matcher(contact_no);
			return m.find();
		} else {
			System.out.println("Contact no is mandatory");
			return false;
		}
	}

	public static boolean passwordValidator(String password) {
		if (password != "" && password != null) {
			Pattern p = Pattern.compile("[A-Za-z0-9@#$%]{6,16}");
			Matcher m = p.matcher(password);
			return m.find();
		} else {
			System.out.println("Enter a strong password");
			return false;
		}
	}
}
