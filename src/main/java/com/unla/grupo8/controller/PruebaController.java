package com.unla.grupo8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping()
@Controller

public class PruebaController {
	@GetMapping()
	
	public String inicio() {
		return "index";
	}
}
