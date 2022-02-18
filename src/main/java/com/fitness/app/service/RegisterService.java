package com.fitness.app.service;

import java.util.List;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.fitness.app.entity.VenderUser;
import com.fitness.app.model.UserModel;
import com.fitness.app.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	private RegisterRepository registerRepository;

	// register new vender service function.
	public VenderUser registerAVender(UserModel userModel) {

		VenderUser user = registerRepository.findByEmail(userModel.getEmail());
		if (user!= null) {
			return new VenderUser(true, false);
		}
		VenderUser venderUser = new VenderUser();
		venderUser.setEmail(userModel.getEmail());
		venderUser.setFirstName(userModel.getFirstName());
		venderUser.setLastName(userModel.getLastName());
		venderUser.setPassword(encryptPassword(userModel.getPassword()));
		venderUser.setRole("VENDER");
		venderUser.setActive(true);
		venderUser.setBankDetails(null);
		venderUser.setPersonalDetails(null);

		return registerRepository.save(venderUser);

	}

	public List<VenderUser> getAllVenders() {
		return registerRepository.findAll();
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
