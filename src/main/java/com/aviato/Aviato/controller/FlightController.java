package com.aviato.Aviato.controller;

import com.aviato.Aviato.model.Flight;
import com.aviato.Aviato.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FlightController {


    @Autowired
    FlightRepository flightRepository;

    @GetMapping(path = "/getAllFlights")
    public List<Flight>getAll(){

        return flightRepository.findAll();
    }

    @GetMapping(path = "/getFlight/{id}")
    public Flight getCompany(@PathVariable Long id){

        Optional<Flight> flight = flightRepository.findById(id);
        return flight
                .orElseGet(Flight::new);

    }

    @PostMapping(path = "/saveFlight")
    public ResponseEntity<Flight> saveUser(@RequestBody Flight flight){

        Flight persistedFlight = flightRepository.save(flight);

        return ResponseEntity.accepted().body(persistedFlight);
    }

    @PutMapping(path = "/updateFlight")
    public Flight updateUser(@RequestBody Flight flightToPersist){

        return flightRepository.save(flightToPersist);
    }

    @DeleteMapping(path = "/deleteFlight/{id}")
    public ResponseEntity<Flight> deleteUser(@PathVariable Long id){

        flightRepository.deleteById(id);

        return ResponseEntity.noContent().build();

    }
}
