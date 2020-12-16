package com.aviato.Aviato.service;

import com.aviato.Aviato.repository.FlightRepository;
import com.aviato.Aviato.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FlightRepository flightRepository;




}
