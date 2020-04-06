package com.capgemini.bus_booking.ui;

import java.util.Map;
import java.util.Scanner;

import com.capgemini.bus_booking.bean.Admin;
import com.capgemini.bus_booking.bean.Customer;
import com.capgemini.bus_booking.bean.Employee;
import com.capgemini.bus_booking.bean.Manager;
import com.capgemini.bus_booking.dao.AdminDaoImpl;
import com.capgemini.bus_booking.dao.CustomerDaoImpl;
import com.capgemini.bus_booking.dao.EmployeeDaoImpl;
import com.capgemini.bus_booking.dao.MangerDaoImpl;
import com.capgemini.bus_booking.services.UserServiceImpl;
import com.capgemini.bus_booking.services.UserServices;

public class Login {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("\t\t\t\t****************************Login Page************************************");
		System.out.println(
				"Enter 1 for Admin \nEnter 2 for Customer\nEnter 3 for Employee\nEnter 4 for Manager\nEnter Any number exit out from Page");
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
			boolean checkCust = new UserServiceImpl().loginAdmin(custname, custpass);
			if (checkCust == true) {
				System.out.println("Welcome to Login Page");
			} else {
				System.out.println("Invalid Creditional");
			}

			break;
		case 3:
			System.out.println("Enter UserName");
			String empname = scr.next();
			System.out.println("Enter Password");
			int emppass = scr.nextInt();
			for (Map.Entry me : new EmployeeDaoImpl().getHemployee().entrySet()) {
				Employee j = (Employee) me.getValue();
				if (me.getKey().equals(empname) && j.getEmp_id() == emppass) {
					System.out.println("Welcome to Login Page");
					break;
				}
			}
			break;
		case 4:
			System.out.println("Enter UserName");
			String mngrname = scr.next();
			System.out.println("Enter Password");
			int mgnrpass = scr.nextInt();
			for (Map.Entry me : new MangerDaoImpl().getHmanager().entrySet()) {
				Manager j = (Manager) me.getValue();
				if (me.getKey().equals(mngrname) && j.getMgr_id() == mgnrpass) {
					System.out.println("Welcome to Login Page");
					break;
				}
			}
			break;
		default:
			System.exit(1);
			break;
		}

	}
}
