package com.qa.student.rest;

//import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
//import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.model.managers.TicketServiceManager;
import com.qa.student.service.entities.Ticket;
import com.qa.student.service.entities.enums.SeatType;

/*
 * Author: Rupert Langford
*/

@Path("/ticket")
@RequestScoped
public class TicketService
{
	@Inject
	private TicketServiceManager ticketManager;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Ticket getTicketBySeat(int column, int row)
	{
		Ticket result = ticketManager.findBySeat(column, row);
		return result;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Ticket getTicketByBookingID(long bookingID)
	{
		Ticket result = ticketManager.readTicketBID(bookingID);
		return result;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Ticket getTicketByShowingID(long showingID)
	{
		Ticket result = ticketManager.readTicketSID(showingID);
		return result;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Ticket getType(SeatType seat)
	{
		Ticket result = ticketManager.findByType(seat);
		return result;
		//final List<Ticket> results = em.createQuery("").getResultList();
	}
}
