package com.fitness.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fitness.app.entity.VenderUser;
import com.fitness.app.model.UserModel;
import com.fitness.app.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	private RegisterRepository registerRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	// register new vender service function.
	public VenderUser registerAVender(UserModel userModel) {

		VenderUser user = registerRepository.findByEmail(userModel.getEmail());
		if (user != null) {
			return new VenderUser(false);
		}
		VenderUser venderUser = new VenderUser();
		venderUser.setEmail(userModel.getEmail());
		venderUser.setFirstName(userModel.getFirstName());
		venderUser.setLastName(userModel.getLastName());
		venderUser.setPassword(passwordEncoder.encode(userModel.getPassword()));
		venderUser.setRole("VENDER");
		venderUser.setActive(false);
		venderUser.setBankDetails(null);
		venderUser.setPersonalDetails(null);

		return registerRepository.save(venderUser);

	}

	public List<VenderUser> getAllVenders() {
		return registerRepository.findAll();
	}
}
