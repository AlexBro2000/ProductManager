package com.example.productmanager.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value = "com.example.productmanager")
@EntityScan(value = "com.example.productmanager.model.entity")
@EnableJpaRepositories(value = "com.example.productmanager.model.dao")
public class ProductManagerApplication {


	public static void main(String[] args) {
		SpringApplication.run(ProductManagerApplication.class, args);
	}

}
