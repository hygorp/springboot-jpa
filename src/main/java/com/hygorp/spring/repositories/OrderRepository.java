package com.hygorp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hygorp.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
