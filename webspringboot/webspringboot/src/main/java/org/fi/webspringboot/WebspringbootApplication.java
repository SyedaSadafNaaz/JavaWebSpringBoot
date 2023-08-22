package org.fi.webspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.fi.webspringboot.controllers"})
public class WebspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebspringbootApplication.class, args);
	}

}
