package com.example.studentmanagament;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories //jpa repositoreis görücek
public class StudentmanagamentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagamentApplication.class, args);
	}

}
