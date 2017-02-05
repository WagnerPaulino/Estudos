package com.projectf.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TesteView {

	@RequestMapping("/")
	public String execute() {
		System.out.println("Executando a lógica com Spring MVC");
		return "index.jsp";
	}
}
