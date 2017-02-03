package com.qa.student.service.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Venue
{	
	@Id
	@GeneratedValue
	private int venueId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="venue_address_id", referencedColumnName= "addressId")
	private Address address;
	
	
	@NotNull
	private String name;

	public int getVenueId() {
		return venueId;
	}

	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}

	public Address getAddressId() {
		return address;
	}

	public void setAddressId(Address addressId) {
		this.address = addressId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
