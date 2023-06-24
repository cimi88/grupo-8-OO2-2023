package com.unla.grupo8.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.unla.grupo8.helpers.ViewRouteHelper;

@Controller
public class HomeController {
	
	@GetMapping("inicio")
	public String iniciandoPrueba () {
		return ViewRouteHelper.INDEX;
	}
	
	@GetMapping("inicioAudi")
	public String iniciandoPruebaAuditor () {
		return ViewRouteHelper.INDEX_AUDITOR;
	}
}
