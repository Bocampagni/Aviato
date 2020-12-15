package com.aviato.Aviato.repository;

import com.aviato.Aviato.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
