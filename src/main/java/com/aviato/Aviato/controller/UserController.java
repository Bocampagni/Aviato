package com.aviato.Aviato.controller;

import com.aviato.Aviato.model.userModel;
import com.aviato.Aviato.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.aviato.Aviato.repository.UserRepository;
import java.util.List;
import java.util.Optional;


@RestController
public class UserController {

    @Autowired
    UserRepository uRepository;
    UserService userService;
    @GetMapping(path = "/getAllUsers")
    public List<userModel> getAll(){

        return uRepository.findAll();
    }

    @GetMapping(path = "/getUser/{id}")
    public userModel getUser(@PathVariable Long id){

        Optional<userModel> user = uRepository.findById(id);
        return user
                .orElseGet(userModel::new);

    }

    @PostMapping(path = "/saveUser")
    public ResponseEntity<userModel> saveUser(@RequestBody userModel user){

        userModel persistedUser = uRepository.save(user);

        return ResponseEntity.accepted().body(persistedUser);
    }

    @PutMapping(path = "/updateUser")
    public userModel updateUser(@RequestBody userModel userToPersist){

        return uRepository.save(userToPersist);
    }

    @DeleteMapping(path = "/deleteUser/{id}")
    public ResponseEntity<userModel> deleteUser(@PathVariable Long id){

        uRepository.deleteById(id);

        return ResponseEntity.noContent().build();

    }
}
