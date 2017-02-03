package com.qa.student.rest;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import com.qa.student.service.entities.Screen;

/**
 * Screen class responsible for communicating with DB to perform operations on
 * screen table.
 * 
 * @author FWasim
 *
 */
public class ScreenServiceManager {

	@Inject
	private EntityManager em;

	public Screen findSingleScreenById(int screenIdToQuery) throws Exception {
		Screen retrievedScreen = em.find(Screen.class, screenIdToQuery);
		if (retrievedScreen == null) {
			throw new Exception();
		}
		return retrievedScreen;
	}

/*	public List<Showing> findAllShowingsInScreen(int screenId) {
		Query query = em
				.createQuery(
						"select s from Showing s JOIN Screen sc on s.showingId = :sc.screen_Id")
				.setParameter("screen_Id", screenId);
		return query.getResultList();
	}

	public List<Screen> findAllScreenInVenue(int venueId) {
		Query query = em.createQuery(
				"select * from Screen s where s.venueId = :venueId")
				.setParameter("venueId", venueId);
		return query.getResultList();
	}*/
}