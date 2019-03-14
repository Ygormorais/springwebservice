package com.eventos.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class homeController {
	
	@RequestMapping("/cadastrarEvento")
	public String form() {
		return "evento/formEvento";
	}
	
}
