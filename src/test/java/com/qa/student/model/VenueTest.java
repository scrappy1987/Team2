package com.qa.student.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.student.service.entities.Venue;

public class VenueTest {

		Venue venue;
		
	@Test
	public void GetSetVenueIdtest() {
		venue = new Venue();
		venue.setVenueId(1);
		int result = venue.getVenueId();
		assertEquals(1 , result);
	}

	@Test
	public void GetSetAddressIdtest() {
		venue = new Venue();
		venue.setAddressId(3);
		int result = venue.getAddressId();
		assertEquals(3 , result);
	}
	
	@Test
	public void GetSetNametest() {
		venue = new Venue();
		venue.setName("Manchester");
		String result = venue.getName();
		assertEquals("Manchester" , result);
	}
	
}
