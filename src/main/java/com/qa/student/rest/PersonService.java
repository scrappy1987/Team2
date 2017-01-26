package com.qa.student.rest;

import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qa.student.model.Person;

@Path("/people")
@RequestScoped
public class PersonService {

	@Inject
	private EntityManager em;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getAllPeople() {
		final List<Person> results = em.createQuery("select p from Person p order by p.firstName").getResultList();
		return results;
	}
}
