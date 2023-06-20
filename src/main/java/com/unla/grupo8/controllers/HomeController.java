package com.unla.grupo8.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.grupo8.helpers.ViewRouteHelper;

@Controller
@RequestMapping()
public class HomeController {
	
	@GetMapping("inicio")
	public String iniciandoPrueba () {
		return ViewRouteHelper.INDEX;
	}
	
}
