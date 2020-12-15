package com.aviato.Aviato.controller;

import com.aviato.Aviato.model.Plane;
import com.aviato.Aviato.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PlaneController {


    @Autowired
    PlaneRepository planeRepository;

    @GetMapping(path = "/getAllPlanes")
    public List<Plane> getAll(){

        return planeRepository.findAll();
    }

    @GetMapping(path = "/getPlane/{id}")
    public Plane getCompany(@PathVariable Long id){

        Optional<Plane> plane = planeRepository.findById(id);
        return plane
                .orElseGet(Plane::new);

    }

    @PostMapping(path = "/savePlane")
    public ResponseEntity<Plane> saveUser(@RequestBody Plane plane){

        Plane persistedPlane = planeRepository.save(plane);

        return ResponseEntity.accepted().body(persistedPlane);
    }

    @PutMapping(path = "/updatePlane")
    public Plane updateUser(@RequestBody Plane planeToPersist){

        return planeRepository.save(planeToPersist);
    }

    @DeleteMapping(path = "/deletePlane/{id}")
    public ResponseEntity<Plane> deleteUser(@PathVariable Long id){

        planeRepository.deleteById(id);

        return ResponseEntity.noContent().build();

    }

}
