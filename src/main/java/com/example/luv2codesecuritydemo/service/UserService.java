package com.example.luv2codesecuritydemo.service;

import com.example.luv2codesecuritydemo.dto.UserRegistrationDto;
import com.example.luv2codesecuritydemo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
