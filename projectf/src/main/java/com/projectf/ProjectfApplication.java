package com.projectf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class ProjectfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectfApplication.class, args);
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String teste(){
		return "teste";
	}
}
