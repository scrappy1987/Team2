package com.qa.student.service.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@Column(name = "screen_ID")
	private Long screenID;

	@Column(name = "regularSeats")
	@NotNull
	private int noOfRegularSeats;

	@Column(name = "premiumSeats")
	@NotNull
	private int noOfPremiumSeats;

	@Column(length = 50)
	@NotNull
	private ShowingTypes showingTypes;

	public Screen() {

	}

	public Screen(Long screenID, int noOfRegularSeats, int noOfPremiumSeats,
			ShowingTypes showingTypes) {
		super();
		this.screenID = screenID;
		this.noOfRegularSeats = noOfRegularSeats;
		this.noOfPremiumSeats = noOfPremiumSeats;
		this.showingTypes = showingTypes;
	}

	public Long getScreenID() {
		return screenID;
	}

	public void setScreenID(Long screenID) {
		this.screenID = screenID;
	}

	public void setNoOfRegularSeats(int noOfRegularSeats) {
		this.noOfRegularSeats = noOfRegularSeats;
	}

	public int getNoOfRegularSeats() {
		return noOfRegularSeats;
	}

	public void setNoOfPremiumSeats(int noOfPremiumSeats) {
		this.noOfPremiumSeats = noOfPremiumSeats;
	}

	public int getNoOfPremiumSeats() {
		return noOfPremiumSeats;
	}

	public void setShowingTypes(ShowingTypes showingTypes) {
		this.showingTypes = showingTypes;
	}

	public ShowingTypes getShowingTypes() {
		return showingTypes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfPremiumSeats;
		result = prime * result + noOfRegularSeats;
		result = prime * result
				+ ((screenID == null) ? 0 : screenID.hashCode());
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
		if (screenID == null) {
			if (other.screenID != null)
				return false;
		} else if (!screenID.equals(other.screenID))
			return false;
		if (showingTypes != other.showingTypes)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Screen [screenID=" + screenID + ", noOfRegularSeats="
				+ noOfRegularSeats + ", noOfPremiumSeats=" + noOfPremiumSeats
				+ ", showingTypes=" + showingTypes + "]";
	}
}
