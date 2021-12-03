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
	class helloHuman{
//	@RequestMapping("/")
//	public String hello() {
//		return "Hello Human...";
//	}	
//
//	@RequestMapping("/")
//    public String index(@RequestParam(value="name", required=false) String searchQuery) {
//		if (searchQuery == null) {
//			return "Hello Human";	
//		} else {
//		return "Hello " + searchQuery;
//		}
//	
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name,
			@RequestParam(value="last_name", required=false) String last_name){
		while (name != null){
			if (last_name != null) {
			return "Hello " + name + " " + last_name;
		} else {
			return "Hello " + name;
			}
		}
		return "Hello Human...";
	}    
	}
}

