package com.vijay.flightReservation.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vijay.flightReservation.Repository.UserRepository;
import com.vijay.flightReservation.entities.User;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/showReg")
	public String showRegistationPage() {
		return "Login/registerUser";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		
		userRepository.save(user);
		return "Login/login";

	}
	
	@RequestMapping(value ="/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
		
		User user = userRepository.findByEmail(email);
		
		if(user.getPassword().equals(password)) {
			return "findFlights";
			
		}else {
			modelMap.addAttribute("msg","Invalid user name or password. Please try again");
		}
		
		return "Login/login";
		
		
	}

}
