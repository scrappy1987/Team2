package com.qa.student.service.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/*
 * Author: Ahmad Sultan
 */
@Entity
public class Booking {
	
	@NotNull
	@Id
	private long BookingId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	@NotNull
	private Customer customerId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn	(name="showing", referencedColumnName = "showing_Id", nullable=false)
	private Showing showing;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bookingId")
	private List<Ticket> ticket;
	
	public Booking(){}
	
	
	public Booking(long BookingId, Customer CustomerId, Showing showingId) {
		this.BookingId = BookingId;
		this.customerId = CustomerId;
		this.showing = showingId;
		
	}
	
	public long getBookingId() {
		return BookingId;
	}
	
	public void setBookingId(long bookingId) {
		BookingId = bookingId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		customerId = customerId;
	}

	public Showing getShowingId() {
		return showing;
	}

	public void setShowingId(Showing showingId) {
		this.showing = showingId;
	}
	
	
}
