package com.fitness.app.controller;

import com.fitness.app.entity.VendorDetails;
import com.fitness.app.service.VendorDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorDetailsController {

    @Autowired
    private VendorDetailsService sVendorDetailsService;

    @PutMapping("/register/vendor/address")
    public VendorDetails addVendorAddress(@RequestBody VendorDetails vendorDetails)
    {
        return sVendorDetailsService.adVendorDetails(vendorDetails);
    }

    @GetMapping("/vender/address/{email}")
    public VendorDetails gVendorDetails(@PathVariable String email)
    {
        return sVendorDetailsService.gVendorDetails(email);
    }
    
}
