package com.qa.student.model.managers;

//import java.util.List;

import com.qa.student.service.entities.Ticket;
import com.qa.student.service.entities.enums.SeatType;

/*
 * Author: Rupert Langford
*/

public interface TicketServiceManager {
	public void CreateTicket(Ticket ticket);
	public Ticket readTicket(long showingOrBookingId);
	public Ticket findBySeat(int column, int row);
	public Ticket findByType(SeatType type);
	public Ticket readTicketBID(long bookingId);
	public Ticket readTicketSID(long showingId);
}
