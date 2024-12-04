package com.anurag.cleanindiabackend.services;

import com.anurag.cleanindiabackend.exceptions.AlreadyExistsException;
import com.anurag.cleanindiabackend.models.LoginRequest;
import com.anurag.cleanindiabackend.models.LoginResponse;
import com.anurag.cleanindiabackend.models.User;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;

public interface AuthService {


    User register(User user, boolean isDriver) throws IllegalArgumentException, AlreadyExistsException;

    LoginResponse login(LoginRequest loginRequest) throws DisabledException, BadCredentialsException;
}
