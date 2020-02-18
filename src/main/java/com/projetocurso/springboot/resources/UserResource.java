package com.projetocurso.springboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetocurso.springboot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
 
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Jorge", "jferraz@cpqd.com", "90101-0202", "cpqd");
		return ResponseEntity.ok().body(u);
		
	}
	
}
