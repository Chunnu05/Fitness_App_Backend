package com.fitness.app.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gym {

	
	private String gymName;
	private String gymAddress;
	private String[] facilities;
	private Date[] timeSlots;
	private ImageFile gymPic;
	private String[] subcription;
}
