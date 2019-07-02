package com.angular.demo.controllers;

import com.angular.demo.dao.UserRepository;
import com.angular.demo.entities.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Resource
    private UserRepository userRepository ;

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        return userRepository.findAll() ;
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user){
        userRepository.save(user) ;
    }
}
