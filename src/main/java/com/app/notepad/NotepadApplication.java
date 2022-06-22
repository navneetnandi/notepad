package com.app.notepad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackages= "com.app.notepad")
@RestController
public class NotepadApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotepadApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello San Jose!!";
	}

}
