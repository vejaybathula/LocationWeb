package com.vijay.flightReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.flightReservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
