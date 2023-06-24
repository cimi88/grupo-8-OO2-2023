package com.unla.grupo8.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.unla.grupo8.helpers.ViewRouteHelpers;


@Controller
<<<<<<< HEAD
=======
@RequestMapping()

>>>>>>> rama_santander
public class HomeController {
	
	@GetMapping("inicio")
	public String iniciandoPrueba () {

		return ViewRouteHelpers.INDEX;
	}
	
	@GetMapping("inicioAudi")
	public String iniciandoPruebaAuditor () {
<<<<<<< HEAD
=======
		return ViewRouteHelpers.INDEX_AUDITOR;
	}
>>>>>>> rama_santander

		return ViewRouteHelpers.INDEX_AUDITOR;
	}
}

