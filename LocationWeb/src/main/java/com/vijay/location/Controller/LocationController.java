package com.vijay.location.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vijay.location.Service.LocationService;
import com.vijay.location.model.Location;

@Controller
public class LocationController {

	@Autowired
	LocationService service;

	@RequestMapping("/showCreate")
	public String showCreate() {

		return "CreateLocation";
	}

	@RequestMapping("/savloc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
       Location locationsaved = service.save(location);
       String msg = "Location saved with id:"+ locationsaved.getId();
       modelMap.addAttribute("msg", msg);
		return "CreateLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocation(ModelMap modelMap) {
		List<Location> locations = service.getAllLoactions();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	@RequestMapping("deleteLocation")
	public String deleteById(@RequestParam("id")Long id, ModelMap modelMap) {
		Location location = service.getLocationByID(id);
		service.deleteLocation(location);
		List<Location> allLoactions = service.getAllLoactions();
		modelMap.addAttribute("allLoactions", allLoactions);
		return "displayLocations";
	}
	
	@RequestMapping("/updateLocation")
	public String updatedById(@RequestParam("id") Long id, ModelMap modelMap) {
		
		Location location = service.getLocationByID(id);
		service.update(location);
		List<Location> location1 = service.getAllLoactions();
		modelMap.addAttribute("location1", location1);
		return "editLocation";
	}
}
