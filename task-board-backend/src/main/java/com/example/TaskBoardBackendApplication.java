package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class TaskBoardBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskBoardBackendApplication.class, args);
	}

}
