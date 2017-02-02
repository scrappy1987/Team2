package com.qa.student.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.qa.student.service.entities.Ticket;
import com.qa.student.service.entities.enums.SeatType;

@Startup
@Singleton
public class TestData {
	private List<Ticket> tickets;
	
	@PostConstruct
	public void setupTestData(){
		tickets = new ArrayList<Ticket>();
		tickets.add(new Ticket(null, null, 1, 1, SeatType.STANDARD));
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	
}