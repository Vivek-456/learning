package com.learning.AdvanceProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class AdvanceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvanceProjectApplication.class, args);
	}

}
