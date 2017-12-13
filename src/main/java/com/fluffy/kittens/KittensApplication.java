package com.fluffy.kittens;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ComponentScan
@SpringBootApplication
public class KittensApplication {

	public static void main(String[] args) {
		SpringApplication.run(KittensApplication.class, args);
	}
}
