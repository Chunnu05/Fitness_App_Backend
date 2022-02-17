package com.fitness.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.app.entity.VenderUser;
import com.fitness.app.repository.RegisterRepository;

@Service
public class RegisterService {
	
	
	@Autowired
	private RegisterRepository registerRepository;

	//register new vender service function.
	public VenderUser registerAVender(VenderUser venderUser)
	{
		
		VenderUser user=registerRepository.findByEmail(venderUser.getEmail());
		if(user!=null)
		{
			return new VenderUser(false);
		}
		registerRepository.save(venderUser);
		return venderUser;
	}
	
	
	
	public List<VenderUser> getAllVenders()
	{
		return registerRepository.findAll();
	}
}
