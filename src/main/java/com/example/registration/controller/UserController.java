package com.example.registration.controller;

import com.example.registration.model.User;
import com.example.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user){
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @GetMapping("/fetch")
    public ResponseEntity<User> fetchUser(@RequestParam String username){
        User user = userService.fetchUserByName(username);
        if(user != null){
            return ResponseEntity.ok(user);
        }
        else{
            return ResponseEntity.status(404).body(null);
        }
    }
}
