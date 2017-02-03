//package com.qa.student.service;
//
//import javax.persistence.EntityManager;
//import javax.persistence.Query;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import com.qa.student.rest.ScreenService;
//import com.qa.student.service.entities.Screen;
//import com.qa.student.service.entities.Screen.ShowingTypes;
//
///**
// * 
// * @author FWasim
// *
// */
//@RunWith(MockitoJUnitRunner.class)
//public class ScreenServiceTest {
//
//	@InjectMocks
//	ScreenService screenService = new ScreenService();
//
//	@Mock
//	EntityManager em;
//
//	@Mock
//	Query query;
//
//	@Test
//	public void testfindSingleScreenById() {
//
//		Screen screenMock = new Screen(1L, 25, 30, ShowingTypes.STANDARD_3D);
//
//		Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
//		Mockito.when(query.getSingleResult()).thenReturn(screenMock);
//
//		String actualResult = screenService.findScreenById(1);
//
//		org.junit.Assert.assertNotNull(actualResult);
//
//	}
//}
