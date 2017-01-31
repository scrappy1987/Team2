package com.qa.student.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import com.qa.student.model.Ticket;

/*
 * Author: Rupert Langford
*/

@Path("/ticket")
@RequestScoped
public class TicketService
{
	@Inject
	private EntityManager em;
	
}
