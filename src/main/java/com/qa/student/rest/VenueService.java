package com.qa.student.rest;
import com.google.gson.Gson;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.service.entities.Venue;

@Path("/venues")
@RequestScoped
public class VenueService {

	@Inject
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllVenues() {
		Gson gson = new Gson();
		final List<Venue> results = em.createQuery("select v from Venue v").getResultList();
		String convertListOfVenuesToJSonString = gson.toJson(results);
		return convertListOfVenuesToJSonString;
	}
	
	@SuppressWarnings("unchecked")
	@GET 
	@Path("/{singleVenueSearch}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getVenue(@PathParam("singleVenueSearch") String singleVenueSearch) {
		Gson gson = new Gson();
		final List<Venue> searchedVenue = em.createQuery("select v from Venue v where v.name = " + singleVenueSearch).getResultList();
		String convertSingleVenueToJSonString = gson.toJson(searchedVenue);
		return convertSingleVenueToJSonString;
		
	}
	
	
	
	
	
	
}
