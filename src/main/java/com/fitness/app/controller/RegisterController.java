package com.fitness.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.app.entity.VenderUser;
import com.fitness.app.model.UserModel;
import com.fitness.app.service.RegisterService;

@RestController
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping("/register/vendor")
	public VenderUser registerAVender(@RequestBody UserModel userModel) {
		return registerService.registerAVender(userModel);
	}

	@GetMapping("/venders")
	public List<VenderUser> getAllVenders() {
		return registerService.getAllVenders();
	}

}
