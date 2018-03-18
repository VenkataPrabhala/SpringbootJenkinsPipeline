package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinioController {
	
	 public static final String GREETINGS = "Greetings from OPenshift Learning and Spring Boot Demo - data store!";

		@RequestMapping("/storage")
	    public String index() {
	        return GREETINGS;
	    }


}
