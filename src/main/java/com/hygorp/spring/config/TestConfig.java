package com.hygorp.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hygorp.spring.entities.Product;
import com.hygorp.spring.repositories.CategoryRepository;
import com.hygorp.spring.repositories.OrderItemRepository;
import com.hygorp.spring.repositories.OrderRepository;
import com.hygorp.spring.repositories.ProductRepository;
import com.hygorp.spring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public void run(String... args) throws Exception {
		
	}
	
}
