package com.fitness.app.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "vendor_details")
public class VendorDetails {

	
	@Id
	private String email;
	@Field
	private String flat_address;
	@Field
	private String gender;
	@Field
	private Date dateOfBirth;
	@Field
	private String areaName;
	@Field
	private String postalAddress;
	@Field
	private String district;
	@Field
	private String state_name;
	@Field
	private Long pin_code;

	

}
