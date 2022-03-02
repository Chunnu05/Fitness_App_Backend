package com.fitness.app.entity;

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
	@Field
	private String email;
	@Field
	private String flat_address;
	@Field
	private String gender;
	@Field
	private String dateOfBirth;
	@Field
	private String areaName;
	@Field
	private String postalAddress;
	@Field
	private String city;
	@Field
	private Long pin_code;

	

}
