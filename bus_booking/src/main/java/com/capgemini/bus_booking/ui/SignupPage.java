package com.capgemini.bus_booking.ui;

import java.util.Scanner;

import com.capgemini.bus_booking.exception.DaoException;
import com.capgemini.bus_booking.services.CustomerServiceImpl;

public class SignupPage {

	Scanner scr = new Scanner(System.in);

	void CustomerSignup() throws DaoException {
		String Pass, cpass;
		System.out.println("Enter Customer Id:");
		int id = scr.nextInt();
		System.out.println("Please Enter the Customer Name:");
		String name = scr.next();
		System.out.println("Please Enter the Customer Email-Id:");
		String email = scr.next();
		System.out.println("Please Enter the Date of Birth:");
		String dob = scr.next();
		boolean check = true;
		do {
			System.out.println("Please Enter Your Password:");
			Pass = scr.next();
			System.out.println("Please Enter your Conform Password:");
			cpass = scr.next();
			if (Pass.toUpperCase() == cpass.toUpperCase()) {
				check = false;
				new CustomerServiceImpl().signupCustomer(id, name, dob, email, null, null, Pass);
			}
		} while (check);
	}
}
