package com.ninos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class EcommerceShopSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceShopSpringApplication.class, args);
	}

}
