package com.fitness.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.app.entity.VenderUser;
import com.fitness.app.entity.EnthusiastUser;
import com.fitness.app.model.UserModel;
import com.fitness.app.service.vendor_service.RegisterService;
import com.fitness.app.service.enthusiast_service.ERegisterService;

@RestController
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	private ERegisterService EregisterService;

	@PostMapping("/register/vendor")
	public VenderUser registerAVender(@RequestBody UserModel userModel) {
		return registerService.registerAVender(userModel);
	}

	@GetMapping("/venders")
	public List<VenderUser> getAllVenders() {
		return registerService.getAllVenders();
	}

	@PostMapping("/register/enthusiast")
	public EnthusiastUser registerEnthusiast(@RequestBody UserModel userModel) {
		return EregisterService.registerEnthusiast(userModel);
	}

	@GetMapping("/enthusiast")
	public List<EnthusiastUser> getAllEnthusiast() {
		return EregisterService.getAllEnthusiast();
	}

}
