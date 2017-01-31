package com.qa.student.model.managers.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qa.student.model.managers.TicketManager;
import com.qa.student.service.entities.Ticket;
import com.qa.student.util.TestData;

@Default
@Stateless
public class TicketManagerOffline implements TicketManager {
	
	@Inject
	private TestData testData;

	@Override
	public void CreateTicket(Ticket ticket) {
		// TODO Auto-generated method stub

	}

	@Override
	public Ticket readTicket(long showingOrBookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelTicket(Ticket ticket) {
		// TODO Auto-generated method stub
	}

	@Override
	public Ticket findBySeat(int column, int row) {
		List<Ticket> tickets = testData.getTickets();
		for(Ticket ticket : tickets) {
			if(ticket.getColumn()==column && ticket.getRow() == row)
				return ticket;
		}
		return null;
	}
}