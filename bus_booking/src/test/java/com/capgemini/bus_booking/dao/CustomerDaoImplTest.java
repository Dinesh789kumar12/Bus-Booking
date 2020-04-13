package com.capgemini.bus_booking.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.bus_booking.bean.Customer;

public class CustomerDaoImplTest {

	@Test
	public void findByIdtest() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findById(11);
		int expected = 11;
		assertEquals(11, 11);
	}

	@Test
	public void findByIdtest1() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findById(99);
		int expected = 11;
		assertEquals(11, 99);
	}

	@Test
	public void findByIdtest2() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findById(22);
		int expected = 22;
		assertEquals(22, 22);
	}

	@Test
	public void findByIdtest3() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findById(88);
		int expected = 33;
		assertEquals(33, 88);
	}

	@Test
	public void findByIdtest4() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findById(33);
		int expected = 33;
		assertEquals(33, 33);
	}

	@Test
	public void findByIdtest5() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findById(33);
		int expected = 66;
		assertEquals(66, 33);
	}

	@Test
	public void findByIdtest6() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findById(44);
		int expected = 44;
		assertEquals(44, 44);
	}

	@Test
	public void findByIdtest7() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findById(44);
		int expected = 11;
		assertEquals(44, 11);
	}

	@Test
	public void findByUsernametest11() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findByUsername("Dinesh");
		String expected = "Dinesh";
		assertEquals("Dinesh", "Dinesh");
	}

	@Test
	public void findByUsernametest12() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findByUsername("Dinesh");
		String expected = "Pushkar";
		assertEquals("Pushkar", "Dinesh");

	}

	@Test
	public void findByUsernametest13() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findByUsername("Pushkar");
		String expected = "Pushkar";
		assertEquals("Pushkar", "Pushkar");

	}

	@Test
	public void findByUsernametest14() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findByUsername("Anmol");
		String expected = "Pushkar";
		assertEquals("Pushkar", "Anmol");

	}

	@Test
	public void findByUsernametest15() {
		CustomerDaoImpl helper = new CustomerDaoImpl();
		Customer actual = helper.findByUsername("Ayushmaan");
		String expected = "Harshit";
		assertEquals("Harshit", "Ayushmaan");

	}

}
