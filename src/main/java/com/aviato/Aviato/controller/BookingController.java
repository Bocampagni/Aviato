package com.aviato.Aviato.controller;

import com.aviato.Aviato.model.Flight;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {



    @PostMapping(value = "/booking")
    public ResponseEntity<Flight> booking(@RequestBody Flight json){


        return ResponseEntity.ok().build(); //Change it
    }

    @PostMapping(value = "/unbooking")
    public ResponseEntity<Flight> unbooking(@RequestBody Flight json){


        return ResponseEntity.ok().build(); //Change it
    }

}
