package com.vijay.flightReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.flightReservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
