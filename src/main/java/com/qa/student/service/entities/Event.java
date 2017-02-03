package com.qa.student.service.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Event {
	
	@Id
	@GeneratedValue
	private long eventId;
	
	@NotNull
	private String Title;
	
	@NotNull
	private String Description;
	
	@NotNull
	private String Duration;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eventId")
	private List<Showing> showing;
	
	public Event(){}
	
	public Event(String Title, String Description, String Duration) {
		this.Title = Title;
		this.Description = Description;
		this.Duration = Duration;	
	}


	public long getEventId() {
		return eventId;
	}


	public void setEventId(long eventId) {
		this.eventId = eventId;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		this.Title = title;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		this.Description = description;
	}


	public String getDuration() {
		return Duration;
	}


	public void setDuration(String duration) {
		this.Duration = duration;
	}

}
