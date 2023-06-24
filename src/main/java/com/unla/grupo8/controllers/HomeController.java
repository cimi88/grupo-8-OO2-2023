package com.unla.grupo8.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.grupo8.helpers.ViewRouteHelpers;

@Controller
@RequestMapping()
=======

import com.unla.grupo8.helpers.ViewRouteHelper;

@Controller
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
public class HomeController {
	
	@GetMapping("inicio")
	public String iniciandoPrueba () {
<<<<<<< HEAD
		return ViewRouteHelpers.INDEX;
=======
		return ViewRouteHelper.INDEX;
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
	}
	
	@GetMapping("inicioAudi")
	public String iniciandoPruebaAuditor () {
<<<<<<< HEAD
		return ViewRouteHelpers.INDEX_AUDITOR;
	}
}

=======
		return ViewRouteHelper.INDEX_AUDITOR;
	}
}
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
