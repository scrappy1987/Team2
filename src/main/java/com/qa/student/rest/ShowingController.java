package com.qa.student.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class ShowingController
{
	@Inject
	ShowingService service;
	
	@GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllShowings()
    {
		return "{\"result\":\"" + service.getAllShowings() + "\"}";
    }
	
	@GET
    @Path("/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllShowingsSortByMovieTitle(@PathParam("title") String title)
    {
		return "{\"result\":\"" + service.getAllOrderedShowings(title) + "\"}";
    }
	
	@GET
    @Path("/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllShowingsSortByEventTitle(@PathParam("title") String title)
    {
		return "{\"result\":\"" + service.getAllOrderedShowings(title) + "\"}";
    }
	
	@GET
    @Path("/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllShowingsSortByDate(@PathParam("date") String date)
    {
		return "{\"result\":\"" + service.getAllOrderedShowings(date) + "\"}";
    }
	
	@GET
    @Path("/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getMovieShowingsWithTitle(@PathParam("title") String title)
    {
		return "{\"result\":\"" + service.searchShowings("movies", "Id", title) + "\"}";
    }
	
	@GET
    @Path("/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getEventShowingsWithTitle(@PathParam("title") String title)
    {
		return "{\"result\":\"" + service.searchShowings("events", "Id", title)  + "\"}";
    }
}
