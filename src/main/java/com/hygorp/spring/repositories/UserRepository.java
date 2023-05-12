package com.hygorp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hygorp.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
