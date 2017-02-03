package com.qa.student.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.student.service.entities.Event;

public class EventTest {

	@Test
	public void testEvent1() {
		Event eve = new Event("the life of trev", "what is trev up to", "17.38");
		eve.setTitle("the life of john");
		assertEquals("the life of john", eve.getTitle());
	}
	
	@Test
	public void testEvent2() {
		Event eve = new Event("the life of trev", "what is trev up to", "17.38");
		eve.setDescription("what is john up to");
		assertEquals("what is john up to", eve.getDescription());
	}
	@Test
	public void testEvent3() {
		Event eve = new Event("the life of trev", "what is trev up to", "17.01");
		eve.setTitle("17.00");
		assertEquals("17.01", eve.getTitle());
	}

}