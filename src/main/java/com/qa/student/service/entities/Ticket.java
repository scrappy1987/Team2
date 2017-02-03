package com.qa.student.service.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

import com.qa.student.service.entities.enums.SeatType;

/* 
 *
 * Author: Rupert Langford
 *
 */

@Entity
@NamedQueries({
	@NamedQuery(name="ticket_findBySeatType", query="SELECT t FROM Tickets t WHERE t.type=:type"),
	@NamedQuery(name="ticket_readTicketSID", query="SELECT t FROM Tickets t WHERE t.showingID=:showingID"),
	@NamedQuery(name="ticket_readTicketBID", query="SELECT t FROM Tickets t WHERE t.bookingID=:bookingID"),
	@NamedQuery(name="ticket_findBySeat", query="SELECT t FROM Tickets t WHERE t.column=:column AND t.row=:row")
	//@NamedQuery(name="ticket_readTicket", query="SELECT t FROM Tickets t WHERE t.showingOrBookingId=:showingOrBookingId")
})
public class Ticket {
	public static final String findBySeatType = "ticket_findBySeatType";
	public static final String readTicketSID = "ticket_readTicketSID";
	public static final String readTicketBID = "ticket_readTicketBID";
	public static final String readTicket = "ticket_readTicket";
	public static final String findBySeat = "ticket_findBySeat";
	
	@Id
	@NotNull
	private Long ticketId;
	
	@NotNull
	private Long showingId;
	
	@NotNull
	private Long bookingId;
	
	@NotNull
	private int row;
	@NotNull
	private int column;
	@NotNull
	private SeatType type;

	public Ticket(Long ticketID, Long showingID, Long bookingID, int row, int column, SeatType type)
	{
		this.ticketId = ticketID;
		this.showingId = showingID;
		this.bookingId = bookingID;
		this.row = row;
		this.column = column;
		this.type = type;
	}

	public Long getTicketId()
	{
		return ticketId;
	}
	
	public void setTicketId(Long ticketID)
	{
		this.ticketId = ticketID;
	}
	
	public Long getshowingId() {
		return showingId;
	}

	public void setShowingId(Long showingID) {
		this.showingId = showingID;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingID(Long bookingID) {
		this.bookingId = bookingID;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public SeatType getType() {
		return type;
	}

	public void setType(SeatType type) {
		this.type = type;
	}
}
