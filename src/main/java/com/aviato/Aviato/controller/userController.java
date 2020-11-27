package com.aviato.Aviato.controller;

import com.aviato.Aviato.model.userModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.aviato.Aviato.repository.userRepository;
import java.util.List;


@RestController
public class userController {

    @Autowired
     userRepository uRepository;

    @GetMapping(path = "/getAllUsers")
    public List<userModel> getAll(){

        return uRepository.findAll();
    }

    @PostMapping(path = "/saveUser")
    public ResponseEntity<userModel> saveUser(@RequestBody userModel user){

        userModel persistedUser = uRepository.save(user);

        return ResponseEntity.accepted().body(user);
    }
}
