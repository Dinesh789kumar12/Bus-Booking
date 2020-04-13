package com.capgemini.bus_booking;

import java.util.List;
import java.util.Scanner;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.bean.Route;
import com.capgemini.bus_booking.dao.ReserveDaoImpl;
import com.capgemini.bus_booking.exception.DaoException;
import com.capgemini.bus_booking.services.AdminServiceImpl;
import com.capgemini.bus_booking.services.BusServiceImpl;
import com.capgemini.bus_booking.services.CustomerServiceImpl;
import com.capgemini.bus_booking.services.ReserveServiceImpl;
import com.capgemini.bus_booking.services.RouteServiceImpl;

public class App {
	public static void main(String[] args) throws DaoException {
		AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
		BusServiceImpl busServiceImpl = new BusServiceImpl();
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
		RouteServiceImpl routeServiceImpl = new RouteServiceImpl();
		ReserveServiceImpl reserveServiceImpl = new ReserveServiceImpl();
		System.out.println("\t\t\t\t************************Choose Requirement****************************");
		System.out.println("Enter 1 Login\nEnter 2 Registration");
		Scanner scr = new Scanner(System.in);
		int option = scr.nextInt();
		switch (option) {
		case 1:
			System.out.println("Enter 1 Admin Login\n2Enter 2 Customer Login:");
			System.out.println("Enter your option");
			int option1 = scr.nextInt();
			switch (option1) {
			case 1:
				System.out.println("Enter UserName");
				String userName = scr.next();
				System.out.println("Enter Password");
				String password = scr.next();
				boolean check = adminServiceImpl.loginAdmin(userName, password);
				if (check == true) {
					System.out.println("Enter 1 Generate Report:\n2Enter 2 Add Route");
					int option2 = scr.nextInt();
					switch (option2) {
					case 1:
						List<Reserve> res = reserveServiceImpl.generateReport();
						System.out.println("Reserve Id\t Customer Id\t Bus Id\t\t   Date \t Timestamp \t Seat");
						for (Reserve rs : res) {
							System.out
									.println("     " + rs.getId() + "\t\t  " + rs.getCustId() + "\t\t  " + rs.getBusID()
											+ "\t\t" + rs.getDt() + "\t" + rs.getTstamp() + "\t" + rs.getSeat());
						}
						break;
					case 2:
						System.out.println("Enter route id:");
						int rid = scr.nextInt();
						System.out.println("Enter origin");
						String origin = scr.next();
						System.out.println("Enter Destination:");
						String destination = scr.next();
						boolean b = routeServiceImpl.addRoute(rid, origin, destination);
						if (b) {
							System.out.println("1 Route has been added");
						} else {
							System.out.println("There is some problem");
						}
					default:
						break;
					}
				} else {
					System.out.println("Invalid Creditional");
				}
				break;
			case 2:
				System.out.println("Enter UserName");
				String custname = scr.next();
				System.out.println("Enter Password");
				String custpass = scr.next();
				boolean checkCust = customerServiceImpl.loginCustomer(custname, custpass);
				if (checkCust == true) {
					int option3 = scr.nextInt();
					System.out.println("Enter 1 Search Bus");
					switch (option3) {
					case 1:
						System.out.println("Enter Origin");
						String origin = scr.next();
						System.out.println("Enter Destination");
						String destination = scr.next();
						System.out.println("Enter Date:");
						String date = scr.next();
						Route route = new Route(0, origin, destination);
						List<Bus> bs = busServiceImpl.searchBus(route, date);
						System.out.println("Bus Id\tRoute Id\tAC\tFare\tDeparture Time\tArrival Time\tAvailabilty");
						for (Bus b1 : bs) {
							System.out.println(b1.getId() + "\t  " + b1.getRouteID() + "\t      " + b1.isAc() + "\t"
									+ b1.getFare() + "\t" + b1.getDepartureTime() + "\t" + b1.getArrivalTime() + "\t"
									+ b1.getAvailablityCount());
						}
						break;
					case 2:
						break;
					default:
						break;
					}
				} else {
					System.out.println("Invalid Creditional");
				}
			}

			break;
		case 2:
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
					customerServiceImpl.signupCustomer(id, name, dob, email, null, null, Pass);
				}
			} while (check);
			break;
		default:
			System.exit(1);
			break;
		}
	}
}
