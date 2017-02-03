package com.qa.student.service.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name = "roles", joinColumns=@JoinColumn(name="movie_id", referencedColumnName="movieId"),
		      inverseJoinColumns=@JoinColumn(name="actor", referencedColumnName="actorId"))
	private List<Actor> roles;
	
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
