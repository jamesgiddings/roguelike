package com.giddings.roguelike;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoguelikeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RoguelikeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello, World!");

	}

}
