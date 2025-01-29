package com.fullcycle.eda.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.fullcycle.eda.main", "com.fullcycle.eda.infra"})
@EntityScan("com.fullcycle.eda.domain.entities")
@EnableJpaRepositories("com.fullcycle.eda.infra.repositories")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}