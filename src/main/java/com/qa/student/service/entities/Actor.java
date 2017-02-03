package com.qa.student.service.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/*
 *  @AUTHOR John Whittaker
 * 
 * 
 */

@Entity
public class Actor {

	@Id
	@GeneratedValue
	private Long actorId;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
	private List<Movie> movie;

	@NotNull
	private String firstName;

	@NotNull
	private String lastName;

	public Actor() {
	}

	public Actor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return lastName;
	}

	public void setSurname(String lastName) {
		this.lastName = lastName;
	}

}
