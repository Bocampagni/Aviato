package com.aviato.Aviato.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @GetMapping(path = "/hello/{value}")
    public String hello( @PathVariable String value){
        return "Hello from Aviato.".replace("Aviato", value);
    }
}
