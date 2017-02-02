package com.qa.student.service.entities;



import java.util.List;

import javax.persistence.Entity;

@Entity
public class Role {
	
	@ManyToMany
	@JoinTable(name = "")
	private List<Movie> movie_Id;
	private List<Actor> actor_Id;
}
