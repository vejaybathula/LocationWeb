package com.vijay.location.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.location.Repository.LocationRepo;
import com.vijay.location.model.Location;

@RestController
@RequestMapping("/locations")
public class LocationRestController {
	
	@Autowired
	LocationRepo locationRepo;
	
	@GetMapping
	public List<Location> getAllLocations(){
		
		return locationRepo.findAll();
		
	}
	
	@PostMapping
	public Location CreateLocation(@RequestBody Location location) {
		
		return locationRepo.save(location);
			
	}
	
	@PutMapping
	public Location UpdateLocation(@RequestBody Location location) {
		
		return locationRepo.save(location);
	}
	
	@DeleteMapping("/{id}")
	public void DeleteLocation (@PathVariable Long id) {
		
		locationRepo.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Optional<Location> GetById (@PathVariable Long id) {
	
		return locationRepo.findById(id);
		
		
	}
	
	
	
}
