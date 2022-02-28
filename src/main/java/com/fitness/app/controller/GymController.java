package com.fitness.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.app.entity.GymClass;
import com.fitness.app.model.GymClassModel;
import com.fitness.app.service.GymService;

@RestController
public class GymController {

	
	
	
	@Autowired
	private GymService gymService;
	
	
	//Adding new gym
	@PutMapping("/add/gym")
	public GymClass addNewGym(@RequestBody GymClassModel gymClassModel)
	{
		return gymService.addNewGym(gymClassModel);
	}
	
	
	//getting all gym..
	@GetMapping("/gym/all")
	public List<GymClass> getAllGym()
	{
		return gymService.getAllGym();
	}
	
	
	//Search gym by vendor email.
	@GetMapping("/gym/email/{email}")
	public List<GymClass> getAllOfVendor(@PathVariable String email)
	{
		return gymService.getGymByVendorEmail(email);
	}
	
	//Search gym by gym_id.
	@GetMapping("/gym/id/{id}")
	public Optional<GymClass> getGymById(@PathVariable String id)
	{
		return gymService.getGymByGymId(id);
	}
}
