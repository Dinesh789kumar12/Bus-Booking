package com.capgemini.bus_booking.ui;

import java.util.Scanner;

import com.capgemini.bus_booking.services.UserServiceImpl;

public class Login {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("\t\t\t\t****************************Login Page************************************");
		System.out.println("Enter 1 for Admin \nEnter 2 for Customer\nEnter Any number exit out from Page");
		int choice = scr.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter UserName");
			String userName = scr.next();
			System.out.println("Enter Password");
			String password = scr.next();
			boolean check = new UserServiceImpl().loginAdmin(userName, password);
			if (check == true) {
				System.out.println("Welcome to Login Page");
			} else {
				System.out.println("Invalid Creditional");
			}
			break;
		case 2:
			System.out.println("Enter UserName");
			String custname = scr.next();
			System.out.println("Enter Password");
			String custpass = scr.next();
			boolean checkCust = new UserServiceImpl().loginCustomer(custname, custpass);
			if (checkCust == true) {
				System.out.println("Welcome to Login Page");
			} else {
				System.out.println("Invalid Creditional");
			}
			break;
		default:
			System.exit(1);
			break;
		}

	}
}
