package com.qa.student.rest;

import java.util.List;
import com.google.gson.Gson;
import com.qa.student.service.entities.Showing;

public class ShowingService
{
	Gson gson = new Gson();
	
	public String getAllShowings()
	{
		final List<Showing> results = ShowingServiceManager.loadShowings();
		return gson.toJson(results);
	}
	
	public String getAllOrderedShowings(String orderMethod)
	{
		final List<Showing> results = ShowingServiceManager.loadShowings(orderMethod);
		return gson.toJson(results);
	}
	
	public String searchShowings(String table, String column, String title)
	{
		final List<Showing> results = ShowingServiceManager.loadShowingsWithType(table, column, title);
		return gson.toJson(results);
	}
}
