package com.qa.student.model.managers;

//import java.util.List;

import com.qa.student.service.entities.Ticket;

/*
 * Author: Rupert Langford
*/

public interface TicketManager {
	public void CreateTicket(Ticket ticket);
	public Ticket readTicket(long showingOrBookingId);
	public void cancelTicket(Ticket ticket);
	public Ticket findBySeat(int column, int row);
}
