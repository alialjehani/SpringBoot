package com.example.SpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        boolean isValidUserName = username.equalsIgnoreCase("ali");
        boolean isValidPassword = password.equalsIgnoreCase("123");

        return isValidUserName && isValidPassword;
    }
}