package com.ant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureDemoappApplication.class, args);
	}
	
	@GetMapping(value="/message")
	public String getMessage() {
		
		return "This is Azure Deployment";
	}

}
