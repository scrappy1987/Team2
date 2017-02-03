package com.qa.student.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.qa.student.service.entities.Ticket;
import com.qa.student.service.entities.enums.SeatType;

/*
 * Initial Author: Rupert Langford
 * Contributing Authors: 
*/

@Startup
@Singleton
public class TestData {
	private List<Ticket> tickets;
	
	@PostConstruct
	public void setupTestData(){
		tickets = new ArrayList<Ticket>();
		tickets.add(new Ticket(0l, 0l, 0l, 1, 1, SeatType.STANDARD));
		tickets.add(new Ticket(1l, 1l, 1l, 2, 2, SeatType.PREMIUM));
		tickets.add(new Ticket(2l, 2l, 2l, 3, 3, SeatType.STANDARD));
		tickets.add(new Ticket(3l, 3l, 3l, 4 ,4, SeatType.STANDARD));
		tickets.add(new Ticket(4l, 4l, 4l, 5 ,5, SeatType.STANDARD));
		tickets.add(new Ticket(5l, 5l, 5l, 6 ,6, SeatType.STANDARD));
		
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
}