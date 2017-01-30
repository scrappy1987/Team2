package com.qa.student.rest;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.student.model.Person;
import com.qa.student.rest.PersonService;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

	@InjectMocks
	PersonService personService = new PersonService();

	@Mock
	EntityManager em;

	@Mock
	Query query;

	@Test
	public void test() {
		List<Person> personList = new ArrayList<Person>();
		Person aPerson = new Person();
		aPerson.setFirstName("test");
		personList.add(aPerson);
		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
		Mockito.when(query.getResultList()).thenReturn(personList);
		// test the add functionality
		List<Person> assertionList = personService.getAllPeople();

		Assert.assertEquals(assertionList.get(0).getFirstName(), "test");

		// verify the behavior
		Mockito.verify(em).createQuery(Mockito.anyString());
	}

}
