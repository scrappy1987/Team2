package com.qa.student.service.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/*
 * Author: Ahmad Sultan
 */
@Entity
public class Booking {
	
	@NotNull
	@Id
	private long BookingId;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private long CustomerId;
	
	@NotNull
	private long showingId;
	
	public Booking(){}
	
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
