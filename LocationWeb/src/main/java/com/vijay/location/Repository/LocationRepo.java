package com.vijay.location.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.location.model.Location;

public interface LocationRepo extends JpaRepository<Location, Long> {

	Location findAllById(Long id);
	
	

}
