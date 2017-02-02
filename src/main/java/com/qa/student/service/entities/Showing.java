package com.qa.student.service.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/*
 * @Author Colin Heyl
 */
@Entity
public class Showing
{
	@Id
	@GeneratedValue
	private int showingId;
	
	@ManyToOne
	@JoinColumn	(name="screen_Id", referencedColumnName = "screen_Id",nullable=false)
	@NotNull
	private Screen screenId;

	@ManyToOne
	@JoinColumn	(name="movie_Id", referencedColumnName = "movie_Id",nullable=false)
	@NotNull
	private Movie movieId;
	
	@ManyToOne
	@JoinColumn	(name="event_Id", referencedColumnName = "event_Id", nullable=false)
	@NotNull
	private Event eventId;
	
	@NotNull
	private String startTime;
	
	@NotNull
	private String date;
	
	@NotNull
	private String languages;
	
	public Showing(){ }

	public Showing(int showingId, Screen screenId, Movie movieId,
			Event eventId,String startTime, String date,String languages) 
	{
		this.showingId = showingId;
		this.screenId = screenId;
		this.movieId = movieId;
		this.eventId = eventId;
		this.startTime = startTime;
		this.date = date;
		this.languages = languages;
	}

	public int getShowingId()
	{
		return showingId;
	}

	public void setShowingId(int showingId)
	{
		this.showingId = showingId;
	}

	public Screen getScreenId()
	{
		return screenId;
	}

	public void setScreenId(Screen screenId)
	{
		this.screenId = screenId;
	}

	public Movie getMovieId()
	{
		return movieId;
	}

	public void setMovieId(Movie movieId)
	{
		this.movieId = movieId;
	}

	public Event getEventId()
	{
		return eventId;
	}

	public void setEventId(Event eventId)
	{
		this.eventId = eventId;
	}

	public String getStartTime()
	{
		return startTime;
	}

	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public String getLanguages()
	{
		return languages;
	}

	public void setLanguages(String languages)
	{
		this.languages = languages;
	}
}
