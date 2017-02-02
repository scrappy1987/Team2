package com.qa.student.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.student.service.entities.Showing;

/*
 * @Author Colin Heyl
 */
public class ShowingTests
{
	@Test
	public void testShowingId()
	{		
		Showing s = new Showing(0,0,0,0,"hh:mm","dd/mm/yyyy","English");
		assertEquals(s.getShowingId(), 0);
		s.setShowingId(1);
		assertEquals(s.getShowingId(), 1);
	}
	
	@Test
	public void testScreenId()
	{
		Showing s = new Showing(0,0,0,0,"hh:mm","dd/mm/yyyy","English");
		assertEquals(s.getScreenId(), 0);
		s.setScreenId(1);
		assertEquals(s.getScreenId(), 1);
	}
	
	@Test
	public void testMovieId()
	{
		Showing s = new Showing(0,0,0,0,"hh:mm","dd/mm/yyyy","English");
		assertEquals(s.getMovieId(), 0);
		s.setMovieId(1);
		assertEquals(s.getMovieId(), 1);
	}
	
	@Test
	public void testEventId()
	{
		Showing s = new Showing(0,0,0,0,"hh:mm","dd/mm/yyyy","English");
		assertEquals(s.getEventId(), 0);
		s.setEventId(1);
		assertEquals(s.getEventId(), 1);
	}
	
	@Test
	public void testStartTime()
	{
		Showing s = new Showing(0,0,0,0,"hh:mm","dd/mm/yyyy","English");
		assertEquals(s.getStartTime(), "hh:mm");
		s.setStartTime("12:00");
		assertEquals(s.getStartTime(), "12:00");
	}
	
	@Test
	public void testDate()
	{
		Showing s = new Showing(0,0,0,0,"hh:mm","dd/mm/yyyy","English");
		assertEquals(s.getDate(), "dd/mm/yyyy");
		s.setDate("10/10/2020");
		assertEquals(s.getDate(), "10/10/2020");
	}
	
	@Test
	public void testLanguage()
	{
		Showing s = new Showing(0,0,0,0,"hh:mm","dd/mm/yyyy","English");
		assertEquals(s.getLanguages(), "English");
		s.setLanguages("English, Japanese");
		assertEquals(s.getLanguages(), "English, Japanese");
	}
}
