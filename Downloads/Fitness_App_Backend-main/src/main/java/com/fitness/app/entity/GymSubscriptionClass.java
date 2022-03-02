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
@Document(value = "subcription")
public class GymSubscriptionClass {

	@Id
	@Field
	private String id;
	@Field
	private int monthly;
	@Field
	private int quaterly;
	@Field
	private int half_yearly;
	@Field
	private int yearly;
	@Field
	private int offer;
	
	
	public GymSubscriptionClass(int monthly, int quaterly, int half_yearly, int yearly, int offer) {
		super();
		this.monthly = monthly;
		this.quaterly = quaterly;
		this.half_yearly = half_yearly;
		this.yearly = yearly;
		this.offer = offer;
	}
	
	
}
