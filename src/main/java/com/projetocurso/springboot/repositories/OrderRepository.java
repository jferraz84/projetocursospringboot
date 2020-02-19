package com.projetocurso.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocurso.springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
