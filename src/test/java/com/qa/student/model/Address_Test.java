package com.qa.student.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.student.service.entities.Address;

public class Address_Test {
	
	Address address;

	
	@Test
	public void getSetFirstLine() {
		address = new Address();
		address.setFirstLine("Dummy");
		String result = address.getFirstLine();
		assertEquals("Dummy", result);
	}
	
	@Test
	public void getSetTownCity() {
		address = new Address();
		address.setTownCity("Dummy");
		String result = address.getTownCity();
		assertEquals("Dummy", result);
	}
	
	@Test
	public void getSetCounty() {
		address = new Address();
		address.setCounty("Dummy");
		String result = address.getCounty();
		assertEquals("Dummy", result);
	}
	
	@Test
	public void getSetPostcode() {
		address = new Address();
		address.setPostcode("Dummy");
		String result = address.getPostcode();
		assertEquals("Dummy", result);
	}

}
