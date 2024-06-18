package com.example.registration.service;

import com.example.registration.model.User;
import com.example.registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void registerUser(User user){
        userRepository.save(user);
    }
    public User fetchUserByName(String username){
        return userRepository.findByUsername(username);
    }
}
