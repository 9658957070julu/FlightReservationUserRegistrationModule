package com.axyya.FlightReservationApp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.axyya.FlightReservationApp.Entity.User;
import com.axyya.FlightReservationApp.Repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
class FlightUserResistrationApplicationTests {

	@Autowired
	UserRepository userrepo;
	
	
	@Test
	void registerUser() {
		User user=new User(0l,"Debashis Bindhani","deba@gmail.com","9658957070","12345","Male",24);
		userrepo.save(user);
		
		
	}

}
