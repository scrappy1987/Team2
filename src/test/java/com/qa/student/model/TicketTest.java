package com.qa.student.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.student.service.entities.Ticket;
import com.qa.student.service.entities.enums.SeatType;

/*
 * Author: Rupert Langford
 */
public class TicketTest {

	@Test
	public void testTicketRow()
	{
		Ticket ticket = new Ticket(null, null, 1, 1, SeatType.STANDARD);
		ticket.setRow(2);
		assertEquals("Error, does not return a ticket row", ticket.getRow(), 2);
	}
	
	@Test
	public void testTicketColumn()
	{
		Ticket ticket = new Ticket(null, null, 1, 1, SeatType.PREMIUM);
		ticket.setColumn(3);
		assertEquals("Error, does not return a ticket column", ticket.getColumn(), 3);
	}

	@Test
	public void testTicketType()
	{
		Ticket ticket = new Ticket(null, null, 1, 1, SeatType.STANDARD);
		ticket.setType(SeatType.PREMIUM);
		assertEquals("Error, does not confirm whether the ticket is Premium or not", ticket.getType(), SeatType.PREMIUM);
	}
	
	/*@Test
	public void testTicketBookingID(1l, 1l, 1, 1, "standard")
	{
		Ticket ticket = new Ticket(4);
		assertEquals("Error, does not return a ticket Booking ID", ticket.getTicketBookingID(), 4);
	}
	
	@Test
	public void testTicketShowingID(1l, 1l, 1, 1, "standard")
	{
		Ticket ticket = new Ticket(5);
		assertEquals("Error, does not return a ticket Showing ID", ticket.getTicketShowingID(), 5);
	}*/
}
