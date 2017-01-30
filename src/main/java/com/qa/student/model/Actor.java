package com.qa.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/*
 * MADE BY JOHN
 * 
 * 
 */


@Entity
public class Actor {
	
	@Id
	@GeneratedValue
	private Long actorID;
	
	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	public Actor() {}
	
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
