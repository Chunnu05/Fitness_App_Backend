package com.fitness.app.controller;

import com.fitness.app.model.LoginUserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.app.entity.VenderUser;
import com.fitness.app.service.LoginService;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    
    @PostMapping("/login/vendor")
    public VenderUser login(@RequestBody LoginUserModel user) {
        return loginService.login(user.getEmail(), user.getPassword());
    }
}