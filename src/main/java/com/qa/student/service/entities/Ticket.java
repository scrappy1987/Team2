package com.qa.student.service.entities;

import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.Id;*/

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.qa.student.service.entities.enums.SeatType;

/* 
 *
 * Author: Rupert Langford
 *
 */

@Entity
public class Ticket
{
	@Id
	@NotNull
	@GeneratedValue
	private long ticketId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="showing_id")
	@NotNull
	private Showing showingId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name ="booking_id")
	@NotNull
	private Booking bookingId;
	
	@NotNull
	private int row;
	@NotNull
	private int column;
	@NotNull
	private SeatType type;

	public Ticket(Showing showingID, Booking bookingID, int row, int column, SeatType type)
	{
		this.showingId = showingID;
		this.bookingId = bookingID;
		this.row = row;
		this.column = column;
		this.type = type;
	}

	public Showing getshowingId() {
		return showingId;
	}

	public void setShowingId(Showing showingID) {
		this.showingId = showingID;
	}

	public Booking getBookingId() {
		return bookingId;
	}

	public void setBookingID(Booking bookingID) {
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
