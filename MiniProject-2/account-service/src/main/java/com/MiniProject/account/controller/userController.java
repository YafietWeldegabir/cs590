package com.MiniProject.account.controller;

import com.MiniProject.account.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class userController {

    @Autowired
    com.MiniProject.account.repository.userRepository userRepository;

    @GetMapping(value = "/all")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @PostMapping(value = "/add")
    public List<User> persist(@RequestBody final User user){
        userRepository.save(user);
        return userRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<User> findUser(@PathVariable("id") int userid){
        return userRepository.findById(userid);
    }

//    @GetMapping("/{username}")
//    public Optional<User> findUser(@PathVariable("username") String username){
//        return userRepository.findByusername(username);
//    }
}
