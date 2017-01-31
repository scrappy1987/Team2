package com.qa.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@Column(name = "actor_id")
	private Long actorId;
	
	
	
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
