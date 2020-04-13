package com.capgemini.bus_booking.ui;

import java.util.Scanner;

import com.capgemini.bus_booking.services.AdminServiceImpl;
import com.capgemini.bus_booking.services.CustomerServiceImpl;

public class Login {

	Scanner scr = new Scanner(System.in);

	boolean AdminLogin() {
		System.out.println("Enter UserName");
		String userName = scr.next();
		System.out.println("Enter Password");
		String password = scr.next();
		boolean check = new AdminServiceImpl().loginAdmin(userName, password);
		return check;
	}

	boolean CustomerLogin() {
		System.out.println("Enter UserName");
		String custname = scr.next();
		System.out.println("Enter Password");
		String custpass = scr.next();
		boolean checkCust = new CustomerServiceImpl().loginCustomer(custname, custpass);
		return checkCust;
	}
}