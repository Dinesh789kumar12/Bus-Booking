package com.capgemini.bus_booking;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.PropertyConfigurator;

import com.capgemini.bus_booking.bean.Bus;
import com.capgemini.bus_booking.bean.Customer;
import com.capgemini.bus_booking.bean.Reserve;
import com.capgemini.bus_booking.bean.Route;
import com.capgemini.bus_booking.exception.Contact;
import com.capgemini.bus_booking.exception.DaoException;
import com.capgemini.bus_booking.exception.Email;
import com.capgemini.bus_booking.exception.NameException;
import com.capgemini.bus_booking.exception.Password;
import com.capgemini.bus_booking.services.AdminServiceImpl;
import com.capgemini.bus_booking.services.BusServiceImpl;
import com.capgemini.bus_booking.services.CustomerServiceImpl;
import com.capgemini.bus_booking.services.ReserveServiceImpl;
import com.capgemini.bus_booking.services.RouteServiceImpl;
import com.capgemini.bus_booking.services.Utilities;

public class App {
	public static void main(String[] args) throws DaoException {
		AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
		BusServiceImpl busServiceImpl = new BusServiceImpl();
		PropertyConfigurator.configure("Properties\\log4j.properties");
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
		RouteServiceImpl routeServiceImpl = new RouteServiceImpl();
		ReserveServiceImpl reserveServiceImpl = new ReserveServiceImpl();
		System.out.println("************************Welcome Black Bus Service****************************");
		while (true) {
			System.out.println(
					"Enter 1 Login for Customer\nEnter 2 Signup for Customer \n-----------Otherwise------------\nEnter 3 for Admin Login\nEnter 4 for Admin Signup");
			System.out.println("Select a option");
			Scanner scr = new Scanner(System.in);
			int option = scr.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter UserName");
				String custname = scr.next();
				System.out.println("Enter Password");
				String custpass = scr.next();
				boolean checkCust = customerServiceImpl.loginCustomer(custname, custpass);
				if (checkCust == true) {
					while (true) {
						System.out.println(
								"Enter 1 Search Bus: \nEnter 2 book bus: \nEnter 3 to check seat availability: \nEnter 4 to sort bus: "
										+ "\nEnter 5 for forgot password: \nEnter 6 to add details: \nEnter 7 to change password: \nEnter 8 to cancle booking:");
						int option3 = scr.nextInt();
						switch (option3) {
						/************* search bus ***************/
						case 1:
							System.out.println("Enter Origin");
							String origin = scr.next();
							System.out.println("Enter Destination");
							String destination = scr.next();
							System.out.println("Enter Date:");
							String date = scr.next();
							Route route = new Route(0, origin, destination);
							List<Bus> bs = busServiceImpl.searchBus(route, date);
							System.out
									.println("Bus Id\tRoute Id\t AC\tFare\tDeparture Time\tArrival Time\tAvailabilty");
							for (Bus b1 : bs) {
								System.out.println(b1.getId() + "\t  " + b1.getRouteID() + "\t      " + b1.isAc() + "\t"
										+ b1.getFare() + "\t" + b1.getDepartureTime() + "\t" + b1.getArrivalTime()
										+ "\t" + b1.getAvailablityCount());

							}
							break;
						/************* bus booking ***************/
						case 2:
							Reserve r = new Reserve();
							Customer c = new Customer();
							System.out.println("Enetr bus id:");
							int id = scr.nextInt();

							System.out.println("*******Enter details*********");
							System.out.println("enter customer id:");
							r.getCustId();
							System.out.println("enter seat number");
							int seat = scr.nextInt();
							System.out.println("Enter name:");
							String name = scr.next();
							System.out.println("Enter phone number:");
							c.getCust_phno();
							System.out.println("Enter Email:");
							c.getCust_email();
							boolean b_booking = reserveServiceImpl.busBooking(r);
							if (b_booking == true) {
								System.out.println("redirecting to payment method");
							}
							break;
						/********** Check seat availability *****************/
						case 3:
							System.out.println("Enter bus id:");
							int busId = scr.nextInt();
							System.out.println("Enter date");
							String dt1 = scr.next();
							int b_seatavail = reserveServiceImpl.seatAvailability(busId, dt1);
							System.out.println(b_seatavail);
							break;
						/********** sort bus *****************/
						case 4:

							break;
						/********** forgot password *****************/
						case 5:
							System.out.println("Enter customer id:");
							int cID = scr.nextInt();
							String b_forgotpassword = customerServiceImpl.forgotPassword(cID);
							System.out.println(b_forgotpassword);
							break;
						/********** Add details *****************/
						case 6:
							System.out.println("Enter customer ID:");
							int cid = scr.nextInt();
							System.out.println("Enter phone number:");
							String phno = scr.next();
							System.out.println("Enter address:");
							String add = scr.next();
							break;
						/********** Change password *****************/
						case 7:
							System.out.println("enter new password:");
							String n_pass = scr.next();
							System.out.println("Reenter password:");
							String r_pass = scr.next();
							if (n_pass.equals(r_pass)) {
								boolean b_chngpass = customerServiceImpl.changePassword(0, r_pass);
							}
							break;
						/********** Cancle booking *****************/
						case 8:
							System.out.println("Enter bus Id:");
							int bid = scr.nextInt();
							System.out.println("Enter journey date");
							String jdt = scr.next();
							// boolean b_cancle= reserveServiceImpl.cancelBooking(reserve);

							break;
						/********** Generate ticket *****************/
						case 9:
							break;

						default:
							System.out.println("Enter correct option");
							break;
						}
					}
				} else {
					System.out.println("Invalid Creditional");
				}

				break;
			case 2:
				boolean valid = false;
				String name, email, dob, address, phone, Pass;
				System.out.println("Enter Customer Id:");
				int id = scr.nextInt();
				while (true) {
					System.out.println("Please Enter the Customer Name:");
					name = scr.next();
					try {
						Utilities.nameValidator(name);
						break;
					} catch (NameException e) {
						System.out.println(e);
					}
				}
				while (true) {
					System.out.println("Please Enter the Customer Email-Id:");
					email = scr.next();
					try {
						Utilities.emailValidator(email);
						break;
					} catch (Email e) {
						System.out.println(e);
					}
				}

				System.out.println("Please Enter the Date of Birth:");
				dob = scr.next();
				System.out.println("Please enter the address:");
				address = scr.next();
				while (true) {
					System.out.println("Please enter the phone number:");
					phone = scr.next();
					try {
						Utilities.contactValidator(phone);
						break;
					} catch (Contact e) {
						System.out.println(e);
					}
				}
				while (true) {
					System.out.println("Please Enter Your Password:");
					Pass = scr.next();
					try {
						Utilities.passwordValidator(Pass);
						break;
					} catch (Password e) {
						System.out.println(e);
					}
				}
				customerServiceImpl.signupCustomer(id, name, dob, email, address, phone, Pass);
				break;

			case 3:
				System.out.println("Enter UserName");
				String userName = scr.next();
				System.out.println("Enter Password");
				String password = scr.next();
				boolean check1 = adminServiceImpl.loginAdmin(userName, password);
				if (check1 == true) {
					System.out.println(
							"Enter 1 Generate Report:\n2Enter 2 Add Route: \nEnter 3 Add Bus: \nEnter 4 Cancle Route: "
									+ "\n Enter 5 Cancle Bus: \n Enter 6 to update Route: \nEnter 7 Update bus timings");
					System.out.println("Please Enter your option");
					int option2 = scr.nextInt();
					switch (option2) {
					/************* Generate Report ***************/
					case 1:
						List<Reserve> res = reserveServiceImpl.generateReport();
						System.out.println("Reserve Id\t Customer Id\t Bus Id\t\t   Date \t Timestamp \t Seat");
						for (Reserve rs : res) {
							System.out
									.println("     " + rs.getId() + "\t\t  " + rs.getCustId() + "\t\t  " + rs.getBusID()
											+ "\t\t" + rs.getDt() + "\t" + rs.getTstamp() + "\t" + rs.getSeat());
						}
						break;
					/************ Add Route ***************/
					case 2:
						System.out.println("Enter route id:");
						int rid = scr.nextInt();
						System.out.println("Enter origin");
						String origin = scr.next();
						System.out.println("Enter Destination:");
						String destination = scr.next();
						boolean b = routeServiceImpl.addRoute(rid, origin, destination);
						if (b) {
							System.out.println("Successfully added route");
						} else {
							System.out.println("There is some problem in adding route");
						}
						break;
					/************* Add Bus ***************/
					case 3:
						System.out.println("Enter bus id:");
						int bid = scr.nextInt();
						System.out.println("Enter route id:");
						int routeID = scr.nextInt();
						System.out.println("Enter bus fare:");
						int fare = scr.nextInt();
						System.out.println("Enter departure time:");
						String departureTime = scr.next();
						System.out.println("Enter arrival time:");
						String arrivalTime = scr.next();
						System.out.println("Enter available count:");
						int availablityCount = scr.nextInt();
						System.out.println("Enter ");
						boolean ac = scr.nextBoolean();
						boolean b_addroute = busServiceImpl.addBus(bid, routeID, ac, fare, departureTime, arrivalTime,
								availablityCount);
						if (b_addroute) {
							System.out.println("Success");
						} else {
							System.out.println("There is some problem in adding bus");
						}
						break;
					/************* Cancle Route ***************/
					case 4:
						System.out.println("Enter route id:");
						int routeId = scr.nextInt();
						boolean b_cancleroute = routeServiceImpl.cancelRoute(routeId);
						if (b_cancleroute) {
							System.out.println("Route Cancelation Successful");
						} else {
							System.out.println("There is some problem in cancleing bus route");
						}
						break;
					/************* Cancle Bus ***************/
					case 5:
						System.out.println("Enter bus id:");
						int busId = scr.nextInt();
						boolean b_canclebus = busServiceImpl.cancelBus(busId);
						if (b_canclebus) {
							System.out.println("Bus cancled successfully");
						} else {
							System.out.println("There is some problem in cancleing bus");
						}
						break;
					/************* update Routes ***************/
					case 6:
						break;
					/************* Update bus timings ***************/
					case 7:
						System.out.println("Enter bus id:");
						int bid1 = scr.nextInt();
						System.out.println("Enter arrival time:");
						String At = scr.next();
						System.out.println("Enter departure time:");
						String Dt = scr.next();
						boolean b_updttimings = busServiceImpl.updateBusTiming(bid1, At, Dt);
						if (b_updttimings) {
							System.out.println("Timings updated successfully");
						} else {
							System.out.println("There is some problem in updating bus timings");
						}
						break;
					default:
						System.out.println("please enter correct option");
						break;
					}
				} else {
					System.out.println("Invalid Creditional\nPlease try again!!!!");
				}
				break;

			case 4:
				String pass, admin_name, admin_email;
				System.out.println("Enter Admin Id:");
				int admin_id = scr.nextInt();
				while (true) {
					System.out.println("Please Enter the admin Name:");
					admin_name = scr.next();
					try {
						Utilities.nameValidator(admin_name);
						break;
					} catch (NameException e) {
						System.out.println(e);
					}
				}
				while (true) {
					System.out.println("Please Enter the admin Email-Id:");
					admin_email = scr.next();
					try {
						Utilities.emailValidator(admin_email);
						break;
					} catch (Email e) {
						System.out.println(e);
					}
				}
				while (true) {
					System.out.println("Please Enter Your Password:");
					Pass = scr.next();
					try {
						Utilities.passwordValidator(Pass);
						break;
					} catch (Password e) {
						System.out.println(e);
					}
				}
				adminServiceImpl.signupAdmin(admin_id, admin_name, admin_email, Pass);
				break;

			/**************** --------------Exit-------------------------- */
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}
}
