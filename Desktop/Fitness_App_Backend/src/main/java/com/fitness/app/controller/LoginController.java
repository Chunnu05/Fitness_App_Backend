package com.fitness.app.controller;


import com.fitness.app.model.LoginUserModel;
import com.fitness.app.model.UserModel;
import com.fitness.app.service.vendor_service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.fitness.app.service.vendor_service.RegisterService.checkPassword;
import static com.fitness.app.service.vendor_service.RegisterService.encryptPassword;

import com.fitness.app.entity.VenderUser;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login/vendor")
    public VenderUser login(@RequestBody LoginUserModel user) {
        return loginService.login(user.getEmail(), user.getPassword());
    }
}