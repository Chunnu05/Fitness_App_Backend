package com.fitness.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.app.entity.VendorDetails;
import com.fitness.app.model.UserModel;
import com.fitness.app.repository.RegisterAddressRepository;

@Service
public class RegisterVendorDetails {

	@Autowired
	private RegisterAddressRepository registeraddressRepository;

	public VendorDetails registerAVender(UserModel userModel) {

		VendorDetails user = registeraddressRepository.findByEmail(userModel.getEmail());

		if (user != null) {
			return new VendorDetails(null, null, null, null, null, null, null, null, null);

		}
		VendorDetails venderDetails = new VendorDetails();
		venderDetails.setEmail(userModel.getEmail());
		venderDetails.setFlat_address(userModel.getFlat_address());
		venderDetails.setGender(userModel.getGender());
        venderDetails.setDateOfBirth(userModel.getDateOfBirth());
        venderDetails.setAreaName(userModel.getAreaName());
        venderDetails.setPostalAddress(userModel.getPostalAddress());
        venderDetails.setDistrict(userModel.getDistrict());
        venderDetails.setState_name(userModel.getState_name());
        venderDetails.setPin_code(userModel.getPin_code());
		

		return registeraddressRepository.save(venderDetails);

	}

	public List<VendorDetails> getAllVenders() {
		return registeraddressRepository.findAll();
    }
	
}
