package com.fitness.app.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    private String email;
    private String firstName;
    private String lastName;
    private String password;
	private String flat_address;
	private String gender;
	private Date dateOfBirth;
	private String areaName;
	private String postalAddress;
	private String district;
	private String state_name;
	private Long pin_code;

    public UserModel(String email, String firstName, String lastName, String password) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }
}
