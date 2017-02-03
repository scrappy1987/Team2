package com.qa.student.model.managers.online;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.qa.student.model.managers.TicketServiceManager;
import com.qa.student.service.entities.Ticket;
import com.qa.student.service.entities.enums.SeatType;

@Stateless
@Default
public class TicketManagerOnline implements TicketServiceManager {
	
	private EntityManager entityManager;

	@Override
	public void CreateTicket(Ticket ticket) {
		entityManager.persist(ticket);
	}

	@Override
	@Deprecated
	public Ticket readTicket(long showingOrBookingId) { //does not need to be implemented. Method not in use.
		return null;
	}

	@Override
	public Ticket findBySeat(int column, int row) {
		TypedQuery<Ticket> typedQuery = entityManager.createNamedQuery(Ticket.findBySeat, Ticket.class);
		typedQuery.setParameter("column", column);
		typedQuery.setParameter("row", row);
		return typedQuery.getSingleResult();
	}

	@Override
	public List<Ticket> findByType(SeatType type) {
		TypedQuery<Ticket> typedQuery = entityManager.createNamedQuery(Ticket.findBySeatType, Ticket.class);
		typedQuery.setParameter("type", type);
		return typedQuery.getResultList();
	}

	@Override
	public Ticket readTicketBID(long bookingId) {
		TypedQuery<Ticket> typedQuery = entityManager.createNamedQuery(Ticket.readTicketBID, Ticket.class);
		typedQuery.setParameter("bookingID", bookingId);
		return entityManager.find(Ticket.class, bookingId);
	}

	@Override
	public Ticket readTicketSID(long showingId) {
		TypedQuery<Ticket> typedQuery = entityManager.createNamedQuery(Ticket.readTicketSID, Ticket.class);
		typedQuery.setParameter("showingID", showingId);
		return entityManager.find(Ticket.class, showingId);
	}

	@Override
	public Ticket findByTicketID(long ticketID) {
		return entityManager.find(Ticket.class, ticketID);
	}

}
