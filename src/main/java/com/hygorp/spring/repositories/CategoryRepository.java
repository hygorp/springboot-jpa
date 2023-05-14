package com.hygorp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hygorp.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
