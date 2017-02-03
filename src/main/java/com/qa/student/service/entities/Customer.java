package com.qa.student.service.entities;

/*
* @AUTHOR: JAI KANABAR
*/ 

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


@Entity
public class Customer {


	public Customer(){}
	
	public Customer(String firstName, String surname, String email, int phone,
			String dateOfBirth, String password, String accountType) {
		this.firstName = firstName;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
		this.accountType = accountType;
	}


	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_address_id", referencedColumnName= "addressId")
	private Address address;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerId")
	private List<Booking> booking;
	
	@Id
	@GeneratedValue
	@Column(name = "customer_id")
	private int customerId;
	
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Column(name = "first_name")
	@NotNull
	private String firstName;
	
	@NotNull
	private String surname;
	
	@NotNull
	private String email;
	
	private int phone;
	
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	
	private String password;
	
	@Column(name = "account_type")
	@NotNull
	private String accountType;
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
		
	}
	


	public int getCustomer_ID() {
		return customerId;
	}

	public void setCustomer_ID(int customerID) {
		this.customerId = customerID;
	}

}
