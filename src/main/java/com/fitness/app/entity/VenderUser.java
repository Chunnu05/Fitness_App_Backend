package com.fitness.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("app_user")
public class VenderUser {

	@Id
	private String email;
	@Field
	private String firstName;
	@Field
	private String lastName;
	@Field
	private String password;
	@Field
	private boolean active = false;

	@Field
	private String role;

	@Field
	private PersonalDetails personalDetails;
	@Field
	private BankDetails bankDetails;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public boolean isExist() {
		return active;
	}

	public void setExist(boolean exist) {
		this.active = exist;
	}

	public VenderUser(boolean exist) {
		super();
		this.active = exist;
	}

	public VenderUser() {
		super();
	}

	public VenderUser(String email, String firstName, String lastName, String password) {

		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
