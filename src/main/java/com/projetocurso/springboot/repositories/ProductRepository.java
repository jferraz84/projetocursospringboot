package com.projetocurso.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocurso.springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
