package com.br.mjv.starupOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = "com.br.mjv.starupOne")
public class StarupOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarupOneApplication.class, args);
	}

}

