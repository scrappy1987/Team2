package com.qa.student.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.student.service.entities.Event;
import com.qa.student.service.entities.Movie;
import com.qa.student.service.entities.Screen;
import com.qa.student.service.entities.Showing;

/*
 * @Author Colin Heyl
 */
public class ShowingTests
{
	@Test
	public void testShowingId()
	{	
		Screen screen = new Screen();
		Movie movie = new Movie();
		Showing s = new Showing(0,screen,movie,null,"hh:mm","dd/mm/yyyy","English");
		assertEquals(s.getShowingId(), 0);
		s.setShowingId(1);
		assertEquals(s.getShowingId(), 1);
	}
	
	@Test
	public void testScreenId()
	{
		Screen screen = new Screen();
		Movie movie = new Movie();
		Showing s = new Showing(0,null,movie,null,"hh:mm","dd/mm/yyyy","English");
		assertNull(s.getScreenId());
		s.setScreenId(screen);
		assertNotNull(s.getScreenId());
	}
	
	@Test
	public void testMovieId()
	{
		Screen screen = new Screen();
		Movie movie = new Movie();
		Showing s = new Showing(0,screen,null,null,"hh:mm","dd/mm/yyyy","English");
		assertNull(s.getMovieId());
		s.setMovieId(movie);
		assertNotNull(s.getMovieId());
	}
	
	@Test
	public void testEventId()
	{
		Screen screen = new Screen();
		Event event = new Event();
		Showing s = new Showing(0,screen,null,null,"hh:mm","dd/mm/yyyy","English");
		assertNull(s.getEventId());
		s.setEventId(event);
		assertNotNull(s.getEventId());
	}
	
	@Test
	public void testStartTime()
	{
		Screen screen = new Screen();
		Movie movie = new Movie();
		Showing s = new Showing(0,screen,movie,null,"hh:mm","dd/mm/yyyy","English");
		assertEquals(s.getStartTime(), "hh:mm");
		s.setStartTime("12:00");
		assertEquals(s.getStartTime(), "12:00");
	}
	
	@Test
	public void testDate()
	{
		Screen screen = new Screen();
		Movie movie = new Movie();
		Showing s = new Showing(0,screen,movie,null,"hh:mm","dd/mm/yyyy","English");
		assertEquals(s.getDate(), "dd/mm/yyyy");
		s.setDate("10/10/2020");
		assertEquals(s.getDate(), "10/10/2020");
	}
	
	@Test
	public void testLanguage()
	{
		Screen screen = new Screen();
		Movie movie = new Movie();
		Showing s = new Showing(0,screen,movie,null,"hh:mm","dd/mm/yyyy","English");
		assertEquals(s.getLanguages(), "English");
		s.setLanguages("English, Japanese");
		assertEquals(s.getLanguages(), "English, Japanese");
	}
}
