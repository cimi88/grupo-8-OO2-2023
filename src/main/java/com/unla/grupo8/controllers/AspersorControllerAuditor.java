package com.unla.grupo8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.services.IDispositivoAspersorService;

@Controller
@PreAuthorize("hasRole('ROLE_AUDITOR')")
@RequestMapping("riego")
public class AspersorControllerAuditor {
	
	@Autowired @Qualifier("dispositivoAspersorService")
	private IDispositivoAspersorService dispositivoAspersorService;
	
	@GetMapping("/listaAuditor")
	public ModelAndView mostrarTablaDispositivosAuditor(){
		ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_DISPOSITIVO_ASPERSOR_AUDITOR);
		mV.addObject("listaAspersor", dispositivoAspersorService.getAll());
		return mV;
	}
} 

























