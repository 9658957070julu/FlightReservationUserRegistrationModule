package com.axyya.FlightReservationApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axyya.FlightReservationApp.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
