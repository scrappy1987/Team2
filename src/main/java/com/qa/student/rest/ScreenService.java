package com.qa.student.rest;

import javax.inject.Inject;

import com.google.gson.Gson;
import com.qa.student.service.entities.Screen;

/**
 * 
 * @author FWasim
 */
public class ScreenService {

	@Inject
	private ScreenServiceManager screenManager;

	public String findScreenById(int screenId) {
		String result = "";
		try {
			Screen screen = screenManager.findSingleScreenById(screenId);
			Gson gson = new Gson();
			result = gson.toJson(screen);
		} catch (Exception e) {
			result = "No screen was found";
		}
		return result;
	}

/*	public String findAllShowingsInScreen(int screenId) {
		Gson gson = new Gson();
		List<Showing> listOfShowingsInScreen = new ArrayList<Showing>();
		listOfShowingsInScreen = screenManager
				.findAllShowingsInScreen(screenId);
		return gson.toJson(listOfShowingsInScreen);
	}

	public String findAllScreenInVenue(int venueId) {
		Gson gson = new Gson();
		List<Screen> listOfScreensInVenue = new ArrayList<Screen>();
		listOfScreensInVenue = screenManager.findAllScreenInVenue(venueId);
		return gson.toJson(listOfScreensInVenue);
	}*/
}
