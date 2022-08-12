package com.uni.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ComponentScan("com.uni")
@EnableJpaAuditing
public class FlywayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlywayDemoApplication.class, args);
	}

}
