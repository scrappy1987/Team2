package com.qa.student.model;

import org.junit.Assert;
import org.junit.Test;

import com.qa.student.service.entities.Screen;
import com.qa.student.service.entities.Screen.ShowingTypes;

/**
 * 
 * @author FWasim
 *
 */
public class ScreenTest {

	@Test
	public void testScreenConstructor() {
		Screen screen = new Screen(1L, 25, 30, ShowingTypes.STANDARD_3D);
		Assert.assertNotNull(screen);
	}

	@Test
	public void testGetShowingTypes() {
		Screen screen = new Screen();
		screen.setShowingTypes(ShowingTypes.STANDARD_2D);
		Assert.assertEquals(ShowingTypes.STANDARD_2D, screen.getShowingTypes());
	}

	@Test
	public void testGetNumberOfRegularSeats() {
		Screen screen = new Screen();
		screen.setNoOfRegularSeats(25);
		Assert.assertEquals(25, screen.getNoOfRegularSeats());
	}

	@Test
	public void testGetNumberOfPremiumSeats() {
		Screen screen = new Screen();
		screen.setNoOfPremiumSeats(30);
		Assert.assertEquals(30, screen.getNoOfPremiumSeats());
	}
}
