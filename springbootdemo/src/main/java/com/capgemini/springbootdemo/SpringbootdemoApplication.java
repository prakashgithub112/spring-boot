package com.capgemini.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		System.out.println("checked in from eclipse");
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
}
