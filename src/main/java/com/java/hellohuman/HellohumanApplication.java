package com.java.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}
@RestController
	public class helloHuman{
//	@RequestMapping("/")
//	public String hello() {
//		return "Hello Human...";
//	}	

	@RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String searchQuery) {
		if (searchQuery == null) {
			return "Hello Human";	
		} else {
		return "Hello " + searchQuery;
		}
	
//    		@RequestParam(value="last_name", required=false) String searchQuery2) {
//    		@RequestParam(value="times", required=false) int howMany)
//        if (searchQuery2 == null) {
//        } else {
//		return "Hello " + searchQuery + " " + searchQuery2;
//    }
	}    
}
}
