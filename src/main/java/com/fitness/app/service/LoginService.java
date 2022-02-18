package com.fitness.app.service;

import com.fitness.app.entity.VenderUser;
import com.fitness.app.repository.RegisterRepository;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private RegisterRepository repository;

    public VenderUser login(String email, String password) {
        VenderUser user = repository.findByEmail(email);
        if(user!=null){
            if(checkPassword(password, user.getPassword())){
                return user;

            }
        }
        return new VenderUser(false, false);

    }

    public static String encryptPassword(String inputPassword) {
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        return encryptor.encryptPassword(inputPassword);
    }

    public static boolean checkPassword(String inputPassword, String encryptedStoredPassword) {
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        return encryptor.checkPassword(inputPassword, encryptedStoredPassword);
    }

}
