package com.fitness.app.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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
	private boolean exist=true;
	
	
	
	public boolean isExist() {
		return exist;
	}
	public void setExist(boolean exist) {
		this.exist = exist;
	}
	public VenderUser(boolean exist) {
		super();
		this.exist = exist;
	}
	public VenderUser() {
		super();
	}
	public VenderUser( String email, String firstName, String lastName, String password) {
		
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
	
}
