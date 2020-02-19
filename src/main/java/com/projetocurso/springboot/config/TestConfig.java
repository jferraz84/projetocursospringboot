package com.projetocurso.springboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetocurso.springboot.entities.Order;
import com.projetocurso.springboot.entities.User;
import com.projetocurso.springboot.entities.enums.OrderStatus;
import com.projetocurso.springboot.repositories.OrderRepository;
import com.projetocurso.springboot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User (null, "Aline", "aferraz@cpqd.com", "90102-0304", "123456");
		User u2 = new User (null, "Helo", "heloferraz@cpqd.com", "90201-0403", "654321");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WATTIING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WATTIING_PAYMENT, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
}
