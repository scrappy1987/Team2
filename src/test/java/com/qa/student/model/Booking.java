package com.qa.student.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/*
 * Author: Ahmad Sultan
 */
@Entity
public class Booking {
	
	@NotNull
	private long BookingId;
	
	@NotNull
	private long CustomerId;
	
	@NotNull
	private long showingId;
	
	public Booking(long BookingId, long CustomerId, long showingId) {
		this.BookingId = BookingId;
		this.CustomerId = CustomerId;
		this.showingId = showingId;
		
	}
	
	public long getBookingId() {
		return BookingId;
	}
	
	public void setBookingId(long bookingId) {
		BookingId = bookingId;
	}

	public long getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(long customerId) {
		CustomerId = customerId;
	}

	public long getShowingId() {
		return showingId;
	}

	public void setShowingId(long showingId) {
		this.showingId = showingId;
	}
	
	
}
