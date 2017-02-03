package com.qa.student.model.managers.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qa.student.model.managers.TicketServiceManager;
import com.qa.student.service.entities.Ticket;
import com.qa.student.service.entities.enums.SeatType;
import com.qa.student.util.TestData;

/*
 * Author: Rupert Langford
*/

@Alternative
@Stateless
public class TicketServiceManagerOffline implements TicketServiceManager {
	
	@Inject
	private TestData testData;

	@Override
	public void CreateTicket(Ticket ticket)
	{

	}

	@Override
	public Ticket readTicket(long showingOrBookingId) //might not return correct information. Replaced by booking and showing individually
	{
		List<Ticket> tickets = testData.getTickets();
		for(Ticket ticket : tickets)
		{
			if(ticket.getBookingId()== showingOrBookingId)
			return ticket;
		}
		return null;
	}

	@Override
	public Ticket findBySeat(int column, int row)
	{
		List<Ticket> tickets = testData.getTickets();
		for(Ticket ticket : tickets)
		{
			if(ticket.getColumn()==column && ticket.getRow() == row)
				return ticket;
		}
		return null;
	}

	@Override
	public Ticket findByTicketID(long ticketID)
	{
		List<Ticket> tickets = testData.getTickets();
		for(Ticket ticket : tickets)
		{
			if(ticket.getTicketId()== ticketID)
				return ticket;
		}
		return null;
	}
	@Override
	public List<Ticket> findByType(SeatType type)
	{
		List<Ticket> tickets = testData.getTickets();
		List<Ticket> results = new ArrayList<Ticket>();
		for(Ticket ticket : tickets)
		{
			if(ticket.getType()== type)
				results.add(ticket);
		}
		return results;
	}

	@Override
	public Ticket readTicketBID(long bookingId)
	{
		List<Ticket> tickets = testData.getTickets();
		for(Ticket ticket : tickets)
		{
			if(ticket.getBookingId()== bookingId)
			return ticket;
		}
		return null;
	}

	@Override
	public Ticket readTicketSID(long showingId)
	{
		List<Ticket> tickets = testData.getTickets();
		for(Ticket ticket : tickets)
		{
			if(ticket.getshowingId()== showingId)
			return ticket;
		}
		return null;
	}
}