package com.caretracking.ctapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.caretracking.ctapi.infraestructure.repository.CustomJpaRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)//substituindo a implementação padrão pela customizada.
public class CaretrackingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaretrackingApiApplication.class, args);
	}

}
