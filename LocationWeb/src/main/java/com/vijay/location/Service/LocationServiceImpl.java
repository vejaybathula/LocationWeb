package com.vijay.location.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.location.Repository.LocationRepo;
import com.vijay.location.model.Location;


@Service
public class LocationServiceImpl implements LocationService {
 
	@Autowired
	private LocationRepo locationRepo;	
	
	@Override
	public Location save(Location location) {
	
		return locationRepo.save(location);
	}

	@Override
	public Location update(Location location) {

		return locationRepo.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		locationRepo.delete(location);

	}

	@Override
	public Location getLocationByID(Long id) {
		
		return locationRepo.findAllById(id);
	}

	@Override
	public List<Location> getAllLoactions() {
	
		return locationRepo.findAll();
	}

}
