package com.axyya.FlightReservationApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axyya.FlightReservationApp.Entity.User;
import com.axyya.FlightReservationApp.Service.UserService;

@RestController
public class UserRegistrationController {

	@Autowired
	UserService service;
	
	@PostMapping("/registerUser")
	public User registerUser(@RequestBody() User user) {
		User registeredUser = service.registerUser(user);
		
		return registeredUser;	
	}
	
	@GetMapping("/{id}")
	public User findUserById(@PathVariable("id")Long id) {
		
		User user = service.findUserById(id);
		return user;
		
	}
	
}
