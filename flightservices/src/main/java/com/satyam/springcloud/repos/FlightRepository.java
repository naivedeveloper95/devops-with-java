package com.satyam.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyam.springcloud.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
