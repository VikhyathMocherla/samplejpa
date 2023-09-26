package com.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.controller","com.repository"})
@EntityScan("com.model")
@EnableJpaRepositories("com.repository")
public class SampleJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleJpaApplication.class, args);
	}

}
