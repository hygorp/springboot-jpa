package com.hygorp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hygorp.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
