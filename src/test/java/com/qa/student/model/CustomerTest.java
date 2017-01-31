package com.qa.student.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	
	
	
	@Test
	public void testGetFirstName() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		String name = testCustomer.getFirstName();
		assertEquals(name, "Coolin");
	}
	
	@Test
	public void testSetFirstName() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		testCustomer.setFirstName("Moolin");
		String name = testCustomer.getFirstName();
		assertEquals(name, "Moolin");
	}
	
	@Test
	public void testGetSurname() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		String name = testCustomer.getSurname();
		assertEquals(name, "McCool");
	}	
	
	@Test
	public void testSetSurname() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		testCustomer.setSurname("McMool");
		String name = testCustomer.getSurname();
		assertEquals(name, "McMool");
	}
	
	@Test
	public void testGetEmail() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		String email = testCustomer.getEmail();
		assertEquals(email, "Cmail@mail.com");
	}
	
	@Test
	public void testSetEmail() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		testCustomer.setEmail("Coolin@mail.com");
		String email = testCustomer.getEmail();
		assertEquals(email, "Coolin@mail.com");
	}

	@Test
	public void testGetPhone() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		int phone = testCustomer.getPhone();
		assertEquals(phone, 071231231);
	}
	
	@Test
	public void testSetPhone() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		testCustomer.setPhone(073213213);
		int phone = testCustomer.getPhone();
		assertEquals(phone, 073213213);
	}
	
	@Test
	public void testGetDateOfBirth() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		String dob = testCustomer.getDateOfBirth();
		assertEquals(dob, "13/11/55");
	}
	
	@Test
	public void testSetDateofBirth() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		testCustomer.setDateOfBirth("01/01/92");
		String dob = testCustomer.getDateOfBirth();
		assertEquals(dob, "01/01/92");
	}
	
	@Test
	public void testGetPassword() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		String pword = testCustomer.getPassword();
		assertEquals("password", pword);
	}
	
	@Test
	public void testSetPassword() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		testCustomer.setPassword("drowssap");
		String pword = testCustomer.getPassword();
		assertEquals(pword, "drowssap");
	}
	
	@Test
	public void testGetAccountType() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		String aType = testCustomer.getAccountType();
		assertEquals(aType, "Basic");
	}
	
	@Test
	public void testSetAccountType() {
		Customer testCustomer = new Customer("Coolin", "McCool", "Cmail@mail.com", 071231231, "13/11/55", "password", "Basic");
		testCustomer.setAccountType("Premium");
		String aType = testCustomer.getAccountType();
		assertEquals(aType, "Premium");
	}
}
