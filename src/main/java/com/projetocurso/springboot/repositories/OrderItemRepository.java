package com.projetocurso.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocurso.springboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
