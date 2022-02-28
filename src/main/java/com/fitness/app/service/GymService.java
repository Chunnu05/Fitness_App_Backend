package com.fitness.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.app.entity.GymAddressClass;
import com.fitness.app.entity.GymClass;
import com.fitness.app.entity.GymSubscriptionClass;
import com.fitness.app.entity.GymTime;
import com.fitness.app.model.GymClassModel;
import com.fitness.app.repository.AddGymRepository;
import com.fitness.app.repository.GymAddressRepo;
import com.fitness.app.repository.GymSubscriptionRepo;
import com.fitness.app.repository.GymTimeRepo;

@Service
public class GymService {

	
	@Autowired
	private AddGymRepository gymRepository;
	
	@Autowired
	private GymAddressRepo addressRepo;
	
	@Autowired
	private GymTimeRepo timeRepo;
	
	@Autowired
	private GymSubscriptionRepo subcriptionRepo;
	
	
	
	//Add New Gym 
	public GymClass addNewGym(GymClassModel gymClassModel)
	{
		GymClass gym=gymRepository.findByName(gymClassModel.getGym_name());
		Long idLast=gymRepository.count()+1;
		String gym_id="GM"+idLast;
		if(gym!=null)
		{
			return new GymClass();
		}
		
		//Creating address of gym
		GymAddressClass address=new GymAddressClass();
		address=gymClassModel.getGymAddress();
		address.setId(gym_id);
		
		addressRepo.save(address);
		
		//set time
		GymTime time=new GymTime();
		time=gymClassModel.getTiming();
		time.setId(gym_id);
		timeRepo.save(time);
		
		//set subscription.
		GymSubscriptionClass subscription=new GymSubscriptionClass();
		subscription=gymClassModel.getSubscription();
		subscription.setId(gym_id);
		subcriptionRepo.save(subscription);
		
		GymClass newGym=new GymClass();
		newGym.setId(gym_id);
		newGym.setEmail(gymClassModel.getVendor_email());
		newGym.setName(gymClassModel.getGym_name());
		newGym.setGymAddress(address);
		newGym.setWorkoutList(gymClassModel.getWorkoutList());
		newGym.setTiming(time);
		newGym.setSubscription(subscription);
		newGym.setContact(gymClassModel.getContact());
		newGym.setCapacity(gymClassModel.getCapacity());
		
		return gymRepository.save(newGym);
	}
	
	
	
	//Find gym by Gym_id
	public Optional<GymClass> getGymByGymId(String gym_id)
	{
		return gymRepository.findById(gym_id);
	}
	
	//Find All gym of a vendor by email id..
	public List<GymClass> getGymByVendorEmail(String email)
	{
		return gymRepository.findByEmail(email);
	}
	
	
	//Find All gym from database..
	public List<GymClass> getAllGym()
	{
		return gymRepository.findAll();
	}
}
