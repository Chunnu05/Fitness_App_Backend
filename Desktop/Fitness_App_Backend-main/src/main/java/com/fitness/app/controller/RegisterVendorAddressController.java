package com.fitness.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.app.entity.VendorDetails;
import com.fitness.app.model.UserModel;

@RestController
public class RegisterVendorAddressController {

	@Autowired
	private RegisterVendorAddressController registervendordetailsService;

	@PostMapping("/register/vendor/address")
	public VendorDetails registerAVender(@RequestBody UserModel userModel) {
		return registervendordetailsService.registerAVender(userModel);
	}

	@GetMapping("/venders/address")
	public List<VendorDetails> getAllVenders() {
		return registervendordetailsService.getAllVenders();
	}

}
