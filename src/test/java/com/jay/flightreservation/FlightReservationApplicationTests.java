package com.jay.flightreservation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jay.flightreservation.entities.User;
import com.jay.flightreservation.repos.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightReservationApplicationTests {

	@Autowired
	UserRepository repo;

	@Test
	public void testuser() {
		/*User user = new User();
		user.setEmail("jay");
		user.setFirstName("jaypatel");
		user.setLastName("jaypatel");
		repo.save(user);*/
	}
}
