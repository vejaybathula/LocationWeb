package com.vijay.flightReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.flightReservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
