package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {
	 public static final String GREETINGS = "Greetings from OPenshift Learning and Spring Boot Demo - Database!";

		@RequestMapping("/database")
	    public String index() {
	        return GREETINGS;
	    }

}
