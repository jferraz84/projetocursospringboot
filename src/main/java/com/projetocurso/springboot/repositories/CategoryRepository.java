package com.projetocurso.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocurso.springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
