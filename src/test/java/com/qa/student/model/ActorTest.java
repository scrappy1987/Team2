package com.qa.student.model;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 *  MADE BY JOHN
 * 
 * 
 */

public class ActorTest {

	@Test
	public void testGetFirstName() {
		Actor testActor = new Actor("Coolin", "McCool");
		assertEquals("Coolin", testActor.getFirstName());
	}
	@Test
	public void testSetFirstName() {
		Actor testActor = new Actor("Coolin", "McCool");
		testActor.setFirstName("Foolin");
		assertEquals("Foolin", testActor.getFirstName());
	}
	@Test
	public void testGetLastName() {
		Actor testActor = new Actor("Coolin", "McCool");
		assertEquals("McCool", testActor.getSurname());
	}
	@Test
	public void testSetLastName() {
		Actor testActor = new Actor("Coolin", "McCool");
		testActor.setSurname("McFool");
		assertEquals("McFool", testActor.getSurname());
	}
	

}
