package com.kpn.backend.services;

import com.kpn.backend.model.User;
import com.kpn.backend.repositories.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository  userRepository){
        this.userRepository = userRepository;
    }

    public User login(int userId, String password) {
        return userRepository.findByIdAndPassword(userId, password).orElseThrow(() -> new IllegalArgumentException("Invalid userId or password"));
    }

}
