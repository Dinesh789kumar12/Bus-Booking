package com.capgemini.bus_booking;

import java.util.Map;
import java.util.Scanner;

import com.capgemini.bus_booking.bean.Admin;
import com.capgemini.bus_booking.dao.AdminDaoImpl;

public class Login {
	public static void main(String[] args) {
		AdminDaoImpl impl = new AdminDaoImpl();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter UserName");
		String userName = scr.next();
		System.out.println("Enter Password");
		int pass = scr.nextInt();
		for (Map.Entry me : impl.addAdmin().entrySet()) {
			Admin j = (Admin) me.getValue();
			if (me.getKey().equals(userName) && j.getAdmin_id() == pass) {
				System.out.println("Welcome to Login Page");
				break;
			} else {
				System.out.println("Wrong Creditional");
			}
		}
	}
}
