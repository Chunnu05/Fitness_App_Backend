package com.fitness.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("vender_user")
public class VenderUser {

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

	@Field
	private Gym gymDetails;
	@Field
	private ImageFile profilePic;

	public VenderUser(boolean active, boolean loggedIn) {

		this.active = active;
		this.loggedIn=loggedIn;
	}

	public VenderUser(String email, String firstName, String lastName, String password) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
	


}
