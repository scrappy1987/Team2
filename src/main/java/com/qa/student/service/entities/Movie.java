package com.qa.student.service.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/*
 * @Author: Lei-Mei Hoang
 */

@Entity
public class Movie {
	
	@Id
	@GeneratedValue
	private int movieId;
	
	@NotNull
	private String title;
	@NotNull
	private String description; 
	@NotNull
	private String genre;
	@NotNull
	private String duration;
	@NotNull
	private String certification;
	
	public Movie() {
		title = "";
		description = "";
		genre = "";
		duration = "";
		certification = "";
	}
		
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}

}
