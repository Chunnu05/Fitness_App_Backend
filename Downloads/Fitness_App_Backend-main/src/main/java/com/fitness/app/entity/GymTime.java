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
@Document(value = "gym_time")
public class GymTime {

	@Id
	private String id;
	@Field
	private String morning;
	@Field
	private String noon;
	@Field
	private String evening;
	@Field
	private String weekly_off;
	
	public GymTime(String morning, String noon, String evening, String weekly_off) {
		super();
		this.morning = morning;
		this.noon = noon;
		this.evening = evening;
		this.weekly_off = weekly_off;
	}
	
	
	
	
}
