package com.qa.student.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {
	
	Movie testMovie;
	
	public MovieTest() {
		testMovie = new Movie();
	}

	@Test
	public void getmovieIDTest() {
		assertEquals(0, testMovie.getMovieId());
	}
	
	@Test
	public void setMovieIDTest() {
		testMovie.setMovieId(1);
		assertEquals(1, testMovie.getMovieId());
	}

	@Test
	public void getTitleTest() {
		assertEquals("", testMovie.getTitle());
	}

	@Test
	public void setTitleTest() {
		testMovie.setTitle("test");
		assertEquals("test", testMovie.getTitle());
	}

	@Test
	public void getDescriptionTest() {
		assertEquals("", testMovie.getDescription());
	}

	@Test
	public void setDescriptionTest() {
		testMovie.setDescription("test");
		assertEquals("test", testMovie.getDescription());
	}

	@Test
	public void getGenreTest() {
		assertEquals("", testMovie.getGenre());
	}
	
	@Test
	public void setGenreTest() {
		testMovie.setGenre("test");
		assertEquals("test", testMovie.getGenre());
	}
	
	@Test
	public void getDurationTest() {
		assertEquals("", testMovie.getDuration());
	}

	@Test
	public void setDurationTest() {
		testMovie.setDuration("test");
		assertEquals("test", testMovie.getDuration());
	}

	@Test
	public void getCertificationTest() {
		assertEquals("", testMovie.getCertification());
	}

	@Test
	public void setCertificationTest() {
		testMovie.setCertification("test");
		assertEquals("test", testMovie.getCertification());
	}
}
