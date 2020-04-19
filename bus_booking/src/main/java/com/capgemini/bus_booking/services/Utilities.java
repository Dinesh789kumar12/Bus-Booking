package com.capgemini.bus_booking.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.bus_booking.exception.Contact;
import com.capgemini.bus_booking.exception.Email;
import com.capgemini.bus_booking.exception.NameException;
import com.capgemini.bus_booking.exception.Password;

public class Utilities {

	public static void emailValidator(String email) throws Email {
		final Pattern EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = EMAIL_REGEX.matcher(email);
		if (!matcher.find()) {
			throw new Email("Email is not correct form");
		}
	}

	public static void nameValidator(String name) throws NameException {
		Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,10}");
		Matcher m = p.matcher(name);
		if (!m.find()) {
			throw new NameException("Name is not correct form");
		}
	}

	public static void contactValidator(String contact_no) throws Contact {
		String pattern = "\\d{10}";
		if (!contact_no.matches(pattern))
			throw new Contact("Contact no is 10 digit only allowed");
	}

	public static void passwordValidator(String password) throws Password {
		final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(password);
		if (!matcher.matches()) {
			throw new Password("Password should contain one uppercase letter ,lowercase,digit and special symbol");
		}
	}
}
