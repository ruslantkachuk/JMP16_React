package com.jmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class JmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmpApplication.class, args);
	}
}
