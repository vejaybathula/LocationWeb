package com.vijay.location.Service;

import java.util.List;

import com.vijay.location.model.Location;

public interface LocationService {
	
	Location save(Location location);
	Location update (Location location);
	void deleteLocation(Location location);
	Location getLocationByID(Long id);
	List<Location> getAllLoactions();

	
}
