package com.qa.student.rest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.student.model.Movie;

@RunWith(MockitoJUnitRunner.class)
public class MovieServiceTest {
	
	@InjectMocks
	MovieService testMovieService = new MovieService();
	
	@Mock
	EntityManager em;
	
	@Mock
	Query query;

	@Test
	public void getAllMoviesPOJOTest() {
		
		List<Movie> movieList = new ArrayList<Movie>();
		
		Movie newMovie = new Movie();
		newMovie.setTitle("Harry Potter and the Philosopher's Stone");
		movieList.add(newMovie);
		
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(movieList);
		
		List<Movie> assertionList = testMovieService.getAllMovies();
		Assert.assertEquals(assertionList.get(0).getTitle(), "Harry Potter and the Philosopher's Stone");
		
		Mockito.verify(em).createQuery(Mockito.anyString());
		
	}
	
	@Test
	public void getAllMoviesJSONTest() {
//		
//		Mockito.
//		String result = testMovieService.getAllMoviesAsJSON();
		
		
	}
	

}
