package com.qa.student.rest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.qa.student.service.entities.*;

public class ShowingServiceManager
{
	static EntityManager em;
		
	public static List<Showing> returnDummyList()
	{
		List<Showing> dummyList = new ArrayList<Showing>();
		dummyList.add(new Showing(0,new Screen(),new Movie(), null, "18:00","12/3/2017","English"));
		dummyList.add(new Showing(1,new Screen(),null, new Event(), "20:00","27/2/2017","English"));
		dummyList.add(new Showing(2,new Screen(),new Movie(), null, "14:30","9/3/2017","English"));
		return dummyList;		
	}
	
	@SuppressWarnings("unchecked")
	public static List<Showing> loadShowings()
	{
		return returnDummyList();
		//return em.createQuery("select s from Showings s").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public static List<Showing> loadShowings(String orderMethod)
	{
		return returnDummyList();
		//return em.createQuery("select s from Showings s order by " + orderMethod).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public static List<Showing> loadShowingsWithType(String table, String column, String title)
	{
		return returnDummyList();
		//return em.createQuery("select * from Showings s join " +table+ "where " + column + "=" + title).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public static List<Showing> loadShowingsWithType(String table, String column, String title, String orderMethod)
	{
		return returnDummyList();
		//return em.createQuery("select * from Showings s join " +table+ "where " + column + "=" + title + "order by " + orderMethod).getResultList();
	}
}
