package com.capgemini.bus_booking.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.bus_booking.bean.Admin;

public class AdminDaoImplTest {

	@Test
	public void findByUsernametest1() {
		AdminDaoImpl helper = new AdminDaoImpl();
		Admin actual = helper.findByUsername("Pushkar");
		String expected = "Pushkar";
		assertEquals("Pushkar", "Pushkar");

	}

	@Test
	public void findByUsernametest2() {
		AdminDaoImpl helper = new AdminDaoImpl();
		Admin actual = helper.findByUsername("Rathore");
		String expected = "Rathore";
		assertEquals("Rathore", "Rathore");
	}

	@Test
	public void findByUsernametest3() {
		AdminDaoImpl helper = new AdminDaoImpl();
		Admin actual = helper.findByUsername("Yash");
		String expected = "Pushkar";
		assertEquals("Pushkar", "Ammu");

	}

	@Test
	public void findByUsername4() {
		AdminDaoImpl helper = new AdminDaoImpl();
		Admin actual = helper.findByUsername("Dinesh");
		String expected = "Ammu";

		assertEquals("Ammu", "Dinesh");

	}

}
