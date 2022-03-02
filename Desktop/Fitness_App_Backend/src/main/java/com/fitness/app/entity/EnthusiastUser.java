package com.fitness.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("enthusiast_user")
public class EnthusiastUser {

	@Id
	private String id;
	@Field
	private String email;

	@Field
	private String firstName;
	@Field
	private String lastName;
	@Field
	private String password;
	@Field
	private boolean active = true;

	@Field
	private boolean loggedIn =false;

	@Field
	private String role;

	@Field
	private PersonalDetails personalDetails;
	@Field
	private BankDetails bankDetails;

	public EnthusiastUser() {
	}

	public EnthusiastUser(boolean active, boolean loggedIn) {

		this.active = active;
		this.loggedIn=loggedIn;
	}

	public EnthusiastUser(String email, String firstName, String lastName, String password, boolean active, String role,
			PersonalDetails personalDetails, BankDetails bankDetails) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.active = active;
		this.role = role;
		this.personalDetails = personalDetails;
		this.bankDetails = bankDetails;
	}

	public EnthusiastUser(String email, String firstName, String lastName, String password) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

}
