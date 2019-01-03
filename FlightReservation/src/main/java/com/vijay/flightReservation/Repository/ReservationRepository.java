package com.vijay.flightReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.flightReservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
