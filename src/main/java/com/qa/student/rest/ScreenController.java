package com.qa.student.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * 
 * @author FWasim
 *
 */
@Path("/screen")
public class ScreenController {

	@Inject
	private ScreenService screenService;

	@GET
	@Path("/{screenId}")
	@Produces({ "application/json" })
	public String getScreen(@PathParam("screenId") int screenId) {
		return screenService.findScreenById(screenId);
	}

/*	@GET
	@Path("/venue/{venueId}")
	@Produces({ "application/json" })
	public String getScreensInVenue(@PathParam("venueId") int venueId) {
		return screenService.findAllScreenInVenue(venueId);
	}*/
}
