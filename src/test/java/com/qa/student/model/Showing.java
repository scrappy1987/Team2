package com.qa.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Showing
{
	@Id
	@GeneratedValue
	private int showingId;
	
	@NotNull
	private int screenId;

	@NotNull
	private int movieId;
	
	@NotNull
	private int eventId;
	
	@NotNull
	private String startTime;
	
	@NotNull
	private String date;
	
	@NotNull
	private String languages;
	

	public Showing(int showingId, int screenId, int movieId,
			int eventId,String startTime, String date,String languages) 
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

	public int getScreenId()
	{
		return screenId;
	}

	public void setScreenId(int screenId)
	{
		this.screenId = screenId;
	}

	public int getMovieId()
	{
		return movieId;
	}

	public void setMovieId(int movieId)
	{
		this.movieId = movieId;
	}

	public int getEventId()
	{
		return eventId;
	}

	public void setEventId(int eventId)
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
