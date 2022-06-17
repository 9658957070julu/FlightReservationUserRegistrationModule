package com.axyya.FlightReservationApp.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axyya.FlightReservationApp.Entity.User;
import com.axyya.FlightReservationApp.Repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository userRepo;
	public User registerUser(User user) {
		
		
		return userRepo.save(user);
	}
	public User findUserById(Long id) {
		
		User user = userRepo.findById(id).get();
		return user;
	}
	
}
