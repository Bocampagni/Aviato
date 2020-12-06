package com.aviato.Aviato.controller;

import com.aviato.Aviato.model.UserModel;
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
    public List<UserModel> getAll(){

        return uRepository.findAll();
    }

    @GetMapping(path = "/getUser/{id}")
    public UserModel getUser(@PathVariable Long id){

        Optional<UserModel> user = uRepository.findById(id);
        return user
                .orElseGet(UserModel::new);

    }

    @PostMapping(path = "/saveUser")
    public ResponseEntity<UserModel> saveUser(@RequestBody UserModel user){

        UserModel persistedUser = uRepository.save(user);

        return ResponseEntity.accepted().body(persistedUser);
    }

    @PutMapping(path = "/updateUser")
    public UserModel updateUser(@RequestBody UserModel userToPersist){

        return uRepository.save(userToPersist);
    }

    @DeleteMapping(path = "/deleteUser/{id}")
    public ResponseEntity<UserModel> deleteUser(@PathVariable Long id){

        uRepository.deleteById(id);

        return ResponseEntity.noContent().build();

    }
}
