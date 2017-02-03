package com.qa.student.model.managers;

//import java.util.List;

import java.util.List;

import com.qa.student.service.entities.Ticket;
import com.qa.student.service.entities.enums.SeatType;

/*
 * Author: Rupert Langford
*/

public interface TicketServiceManager //might split this into multiple interfaces
{
	public void CreateTicket(Ticket ticket);
	@Deprecated
	/**
	 * Deprecated in favour of readTicketBID() and ReadTicketSID()
	 * @param showingOrBookingId
	 * @return
	 */
	public Ticket readTicket(long showingOrBookingId);
	public Ticket findBySeat(int column, int row);
	public List<Ticket> findByType(SeatType type);
	public Ticket readTicketBID(long bookingId); //returns an individual ticket
	public Ticket readTicketSID(long showingId); //returns an individual ticket
	public Ticket findByTicketID(long ticketID);
}

