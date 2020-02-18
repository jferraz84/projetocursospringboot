package com.projetocurso.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocurso.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
