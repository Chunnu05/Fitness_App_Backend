package com.fitness.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.fitness.app.entity.VendorDetails;
import com.fitness.app.repository.VendorDetailsRepository;

@Service
public class VendorDetailsService {

	@Autowired
	private VendorDetailsRepository vendordetailsRepository;

	// register new vender service function.
    public VendorDetails adVendorDetails(VendorDetails vendorDetails)
    {
        return vendordetailsRepository.save(vendorDetails);
    }

    public VendorDetails gVendorDetails(String email)
    {
        return vendordetailsRepository.findByEmail(email);
    }
}
