package com.fitness.app.service.enthusiast_service;

import java.util.List;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.fitness.app.entity.EnthusiastUser;
import com.fitness.app.model.UserModel;
import com.fitness.app.repository.ERegisterRepository;

@Service
public class ERegisterService {

	@Autowired
	private ERegisterRepository EregisterRepository;

	// register new enthusiast service function.
	public EnthusiastUser registerEnthusiast(UserModel userModel) {

		EnthusiastUser user = EregisterRepository.findByEmail(userModel.getEmail());
		if (user!= null) {
			return new EnthusiastUser(true, false);
		}
		EnthusiastUser EnthusiastUser = new EnthusiastUser();
		EnthusiastUser.setEmail(userModel.getEmail());
		EnthusiastUser.setFirstName(userModel.getFirstName());
		EnthusiastUser.setLastName(userModel.getLastName());
		EnthusiastUser.setPassword(encryptPassword(userModel.getPassword()));
		EnthusiastUser.setRole("VENDER");
		EnthusiastUser.setActive(true);
		EnthusiastUser.setBankDetails(null);
		EnthusiastUser.setPersonalDetails(null);

		return EregisterRepository.save(EnthusiastUser);

	}

	public List<EnthusiastUser> getAllEnthusiast() {
		return EregisterRepository.findAll();
	}
	
	public static String encryptPassword(String inputPassword) {
	    StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
	    return encryptor.encryptPassword(inputPassword);
	}
	
	public static boolean checkPassword(String inputPassword, String encryptedStoredPassword) {
	    StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
	    return encryptor.checkPassword(inputPassword, encryptedStoredPassword);
	}
	
}
