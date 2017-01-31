package com.qa.student.model;

import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.Id;*/

import javax.validation.constraints.NotNull;

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
	private String type;

	
	public Ticket(Long showingID, Long bookingID, int row, int column, String type)
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
