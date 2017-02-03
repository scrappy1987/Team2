package com.qa.student.service.entities;

/*
*Author: Trevell Paul
*
*/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Address {
	//attributes
	@Id
	@GeneratedValue
	private int addressId;
	@NotNull
	private String firstLine;
	private String secondLine;
	private String townCity;
	private String county;
	@NotNull
	private String postcode;
	
	//Constructors
	public Address(){
		
	}
	public Address(String firstLine, String secondLine, String townCity, String county, String postcode) {
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.townCity = townCity;
		this.county = county;
		this.postcode = postcode;
	}
	
	public Address(String firstLine, String postcode) {
		this.firstLine = firstLine;
		this.postcode = postcode;
	}
	
	//methods
	public String getFirstLine() {
		return firstLine;
	}
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}
	public String getSecondLine() {
		return secondLine;
	}
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}
	public String getTownCity() {
		return townCity;
	}
	public void setTownCity(String townCity) {
		this.townCity = townCity;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
}