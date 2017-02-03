package com.qa.student.service.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author FWasim
 *
 */
@Entity
public class Screen {

	public enum ShowingTypes {
		STANDARD_2D, STANDARD_3D, IMAX_2D, IMAX_3D
	}

	@Id
	@GeneratedValue
	@Column(name = "screen_Id")
	private Long screenId;

	@Column(name = "regularSeats")
	@NotNull
	private int noOfRegularSeats;

	@Column(name = "premiumSeats")
	@NotNull
	private int noOfPremiumSeats;

	@Column(length = 50)
	@NotNull
	private ShowingTypes showingTypes;

	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name = "venueId", referencedColumnName = "venueId")
	private Venue venue;
	
	
//	potentially unnecessary Map to list showings for each screen
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "showing")
//	private List<Showing> showing;

	public Screen() {

	}

	public Screen(Long screenId, int noOfRegularSeats, int noOfPremiumSeats,
			ShowingTypes showingTypes) {
		this.screenId = screenId;
		this.noOfRegularSeats = noOfRegularSeats;
		this.noOfPremiumSeats = noOfPremiumSeats;
		this.showingTypes = showingTypes;
	}

	public Long getScreenId() {
		return screenId;
	}

	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}

	public int getNoOfRegularSeats() {
		return noOfRegularSeats;
	}

	public void setNoOfRegularSeats(int noOfRegularSeats) {
		this.noOfRegularSeats = noOfRegularSeats;
	}

	public int getNoOfPremiumSeats() {
		return noOfPremiumSeats;
	}

	public void setNoOfPremiumSeats(int noOfPremiumSeats) {
		this.noOfPremiumSeats = noOfPremiumSeats;
	}

	public ShowingTypes getShowingTypes() {
		return showingTypes;
	}

	public void setShowingTypes(ShowingTypes showingTypes) {
		this.showingTypes = showingTypes;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfPremiumSeats;
		result = prime * result + noOfRegularSeats;
		result = prime * result
				+ ((screenId == null) ? 0 : screenId.hashCode());
		result = prime * result
				+ ((showingTypes == null) ? 0 : showingTypes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Screen other = (Screen) obj;
		if (noOfPremiumSeats != other.noOfPremiumSeats)
			return false;
		if (noOfRegularSeats != other.noOfRegularSeats)
			return false;
		if (screenId == null) {
			if (other.screenId != null)
				return false;
		} else if (!screenId.equals(other.screenId))
			return false;
		if (showingTypes != other.showingTypes)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", noOfRegularSeats="
				+ noOfRegularSeats + ", noOfPremiumSeats=" + noOfPremiumSeats
				+ ", showingTypes=" + showingTypes + ", venue=" + venue + "]";
	}
}
