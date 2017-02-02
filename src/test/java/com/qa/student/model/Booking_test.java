package com.qa.student.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.student.service.entities.Booking;

public class Booking_test {

	@Test
	public void Bookingtest() {
		Booking book = new Booking(7, 5, 6);
		assertEquals(7, book.getBookingId());
	}
	@Test
	public void Bookingtest1() {
		Booking book = new Booking(7, 3, 4);
		assertEquals(3, book.getCustomerId());
	}
	@Test
	public void Bookingtest2() {
		Booking book = new Booking(7, 6, 5);
		assertEquals(5, book.getShowingId());
	}

}
