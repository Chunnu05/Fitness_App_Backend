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
@Document(value = "gym_address")
public class GymAddressClass {

	@Id
	@Field
	private String id;
	@Field
	private String bulding_name;
	@Field
	private String area_name;
	@Field
	private String city;
	@Field
	private int postal_code;
	
	public GymAddressClass(String bulding_name, String area_name, String city, int postal_code) {
		super();
		this.bulding_name = bulding_name;
		this.area_name = area_name;
		this.city = city;
		this.postal_code = postal_code;
	}
	
	
}
