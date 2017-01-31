package com.qa.student.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.model.managers.TicketManager;
import com.qa.student.service.entities.Ticket;

/*
 * Author: Rupert Langford
*/

@Path("/ticket")
@RequestScoped
public class TicketService
{
	@Inject
	private TicketManager ticketManager;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Ticket getTicketBySeat(int column, int row) {
		Ticket result = ticketManager.findBySeat(column, row);
		return result;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Ticket> getColumn()
	{
		//final List<Ticket> results = em.createQuery("").getResultList();
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Ticket> getType()
	{
		//final List<Ticket> results = em.createQuery("").getResultList();
		return null;
	}
}
