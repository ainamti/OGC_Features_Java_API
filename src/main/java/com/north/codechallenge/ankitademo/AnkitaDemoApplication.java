package com.north.codechallenge.ankitademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AnkitaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnkitaDemoApplication.class, args);
	}

}
