package com.example.projectdummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ProjectDummyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDummyApplication.class, args);
	}
}
