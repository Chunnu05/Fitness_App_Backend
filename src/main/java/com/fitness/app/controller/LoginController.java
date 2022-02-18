package com.fitness.app.controller;


import com.fitness.app.model.LoginUserModel;
import com.fitness.app.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.app.entity.VenderUser;
import com.fitness.app.service.LoginService;

import static com.fitness.app.service.RegisterService.checkPassword;
import static com.fitness.app.service.RegisterService.encryptPassword;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login/vendor")
    public VenderUser login(@RequestBody LoginUserModel user) {
        return loginService.login(user.getEmail(), user.getPassword());
    }
}