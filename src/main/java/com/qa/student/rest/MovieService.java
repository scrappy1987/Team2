package com.qa.student.rest;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.*;
import com.qa.student.model.Movie;
import com.qa.student.model.Venue;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/movies")
@RequestScoped
public class MovieService {
	
	@Inject
	EntityManager em;
	
	@GET
	@Path("/allmoviesjson")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllMoviesAsJSON() {
		List<Movie> results = getAllMovies();
		Gson toJson = new Gson();
		String result = toJson.toJson(results, Movie.class);
		return result;
		
	}

	@GET
	@Path("/{movieSearchTerm}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMoviesByTitleAsJSON(@PathParam("movieSearchTerm") String movieSearchTerm) {
		
		List<Movie> results = getMoviesByTitle(movieSearchTerm);
		Gson toJson = new Gson();
		String result = toJson.toJson(results, Movie.class);
		return result;
		
	}

	public List<Movie> getAllMovies() {
		final List<Movie> results = em.createQuery("select title from Movies order by title", Movie.class).getResultList();
		return results;
	}
	
	public List<Movie> getMoviesByTitle(String movieSearchTerm) {
		final List<Movie> results = em.createQuery("select title from Movies where title = '" + movieSearchTerm + "", Movie.class).getResultList();
		return results;
	}
	
}
