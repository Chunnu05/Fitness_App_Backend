package com.fitness.app.entity;

import java.util.Date;

public class PersonalDetails {

	private String address;
	private String gender;
	private Date dateOfBirth;

	public PersonalDetails() {
		super();
	}

	public PersonalDetails(String address, String gender, Date dateOfBirth) {
		super();
		this.address = address;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
