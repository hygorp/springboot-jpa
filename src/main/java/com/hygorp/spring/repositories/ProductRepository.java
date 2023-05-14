package com.hygorp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hygorp.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
