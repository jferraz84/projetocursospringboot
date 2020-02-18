package com.projetocurso.springboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetocurso.springboot.entities.User;
import com.projetocurso.springboot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User (null, "Aline", "aferraz@cpqd.com", "90102-0304", "123456");
		User u2 = new User (null, "Helo", "heloferraz@cpqd.com", "90201-0403", "654321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
