package com.qa.student.service.entities;

import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.Id;*/

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

	public Ticket(Long showingID, Long bookingID, int row, int column, SeatType type)
	{
		this.showingId = showingID;
		this.bookingId = bookingID;
		this.row = row;
		this.column = column;
		this.type = type;
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
