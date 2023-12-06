package com.crud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({"com.crud.demo.taskservice","com.crud.demo.taskcontroller"})
@SpringBootApplication
public class TaskmanagemnetsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagemnetsystemApplication.class, args);
	}

}
