package com.qa.student.model;

import javax.persistence.Entity;

@Entity
public class Address {
	//attributes
	private String FirstLine;
	private String SecondLine;
	private String TownCity;
	private String County;
	private String Postcode;
	
	//Constructors
	public Address(){
		
	}
	public Address(String firstLine, String secondLine, String townCity, String county, String postcode) {
		FirstLine = firstLine;
		SecondLine = secondLine;
		TownCity = townCity;
		County = county;
		Postcode = postcode;
	}
	public Address(String firstLine, String postcode) {
		FirstLine = firstLine;
		Postcode = postcode;
	}
	
	//methods
	public String getFirstLine() {
		return FirstLine;
	}
	public void setFirstLine(String firstLine) {
		FirstLine = firstLine;
	}
	public String getSecondLine() {
		return SecondLine;
	}
	public void setSecondLine(String secondLine) {
		SecondLine = secondLine;
	}
	public String getTownCity() {
		return TownCity;
	}
	public void setTownCity(String townCity) {
		TownCity = townCity;
	}
	public String getCounty() {
		return County;
	}
	public void setCounty(String county) {
		County = county;
	}
	public String getPostcode() {
		return Postcode;
	}
	public void setPostcode(String postcode) {
		Postcode = postcode;
	}
	
	

}
